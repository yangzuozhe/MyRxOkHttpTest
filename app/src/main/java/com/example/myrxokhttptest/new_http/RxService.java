package com.example.myrxokhttptest.new_http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by T on 2018/6/28
 */

public class RxService {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(AppConstant.WAN_ANDROID_API)
            //.client(ClientFactory.INSTANCE.getHttpClient())  //不打印 网路请求
            .client(ClientFactory.INSTANCE.getOkHttpClient())//打印 网路请求
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(new NullOnEmptyConverterFactory()) // 解决返回数据为空错误
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    private RxService() {
        //construct
    }

    public static <T> T createApi(Class<T> clazz) {
        return retrofit.create(clazz);
    }


}
