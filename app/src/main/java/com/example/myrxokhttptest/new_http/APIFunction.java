package com.example.myrxokhttptest.new_http;




import com.example.myrxokhttptest.new_http.bean.WanAndroidBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface APIFunction {

    @GET("article/list/0/json/")
    Observable<WanAndroidBean> getBean(@QueryMap Map<String, String> params);

    @GET("article/list/{id}/json/?author=鸿洋")
    Observable<WanAndroidBean> getBeanWithPath(@Path("id") int id);
}
