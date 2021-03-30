package com.example.myrxokhttptest;

import com.google.gson.JsonObject;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 注意这里面的 Observable 对象就是被观察者
 */
public interface ApiService {
    /**
     * 请求接口的地址 以及参数（当前是POST请求）
     *
     * @return http://api.help.bj.cn/apis/life27/?id=北京
     */
    @POST("apis/life27/")
    Observable<JsonObject> getHanfu(@Query("id") String city);//@Query是追加参数

    @POST("apis/life27/")
    Observable<WeatherBean> getBean(@Query("id") String city);
}
