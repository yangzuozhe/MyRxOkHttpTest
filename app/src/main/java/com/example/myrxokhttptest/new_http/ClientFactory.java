package com.example.myrxokhttptest.new_http;

import android.os.Environment;
import android.util.Log;

import com.example.myrxokhttptest.my_http.BaseApplication;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import static okhttp3.logging.HttpLoggingInterceptor.Level;
import static okhttp3.logging.HttpLoggingInterceptor.Logger;

public enum ClientFactory {
    INSTANCE;

    private volatile OkHttpClient okHttpClient;

    private static final int TIMEOUT_READ = 15;
    private static final int TIMEOUT_CONNECTION = 15;
    private final OkHttpClient.Builder mBuilder;
    public final String SDCARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    public final String NET_DATA_PATH = SDCARD_PATH + File.separator + "net_cache";

    ClientFactory() {
        mBuilder = new OkHttpClient.Builder();
//        if (BuildConfig.DEBUG) {
        mBuilder.addInterceptor(ClientHelper.getHttpLoggingInterceptor());
//        }
        Cache cache = new Cache(new File(NET_DATA_PATH), 10 * 1024 * 1024);
        mBuilder.addNetworkInterceptor(ClientHelper.getAutoCacheInterceptor());
        mBuilder.addInterceptor(ClientHelper.getAutoCacheInterceptor());
//        mBuilder.cache(cache);
        mBuilder.retryOnConnectionFailure(true)
                .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
                .connectTimeout(TIMEOUT_CONNECTION, TimeUnit.SECONDS)
                .build();
    }


    private void onHttpsNoCertficates() {
        try {
            mBuilder.sslSocketFactory(ClientHelper.getSSLSocketFactory()).hostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void onHttpCertficates(int[] certficates, String[] hosts) {
        mBuilder.socketFactory(ClientHelper.getSSLSocketFactory(BaseApplication.getContext(), certficates));
        mBuilder.hostnameVerifier(ClientHelper.getHostnameVerifier(hosts));
    }

    //不打印数据
    public OkHttpClient getHttpClient() {
        okHttpClient = mBuilder.build();
        return okHttpClient;
    }

    //打印数据
    public OkHttpClient getOkHttpClient() {
        //日志显示级别
        Level level = Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new Logger() {
            @Override
            public void log(String message) {
                Log.d("zcb", "OkHttp====Message:" + message);
            }
        });
        loggingInterceptor.setLevel(level);
        //OkHttp进行添加拦截器loggingInterceptor
        mBuilder.addInterceptor(loggingInterceptor);
        okHttpClient = mBuilder.build();
        return okHttpClient;
    }
}