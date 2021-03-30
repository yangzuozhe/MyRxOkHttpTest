package com.example.myrxokhttptest;

import android.webkit.WebSettings;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RxService {
    /**
     * okHttp 的 Builder 对象
     */
    private static OkHttpClient.Builder mBuilder = new OkHttpClient.Builder()
            //添加拦截器的目的是因为，有时候不能够请求数据，没有权限的时候需要添加以下拦截器
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request()
                            .newBuilder()
                            //移除旧的
                            .removeHeader("User-Agent")
                            //添加真正的头部
                            .addHeader("User-Agent", WebSettings.getDefaultUserAgent(BaseApplication.getContext()))
                            .build();
                    return chain.proceed(request);

                }
            })
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS);

    private static Retrofit mRetrofit = new Retrofit.Builder()
            //api接口的地址
            .baseUrl("http://api.help.bj.cn/")
            //okhttp 的 builder
            .client(mBuilder.build())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            // 解决返回数据为空错误,这一块要写在 GsonConverterFactory.create() 前面
            .addConverterFactory(new NullOnEmptyConverterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static <T> T createApi(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }
}
