package com.example.myrxokhttptest.new_http.utils;

import android.util.Log;

import com.example.myrxokhttptest.new_http.APIFunction;
import com.example.myrxokhttptest.new_http.RxService;
import com.example.myrxokhttptest.new_http.bean.WanAndroidBean;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HttpUtils {
    private static HttpUtils instance;

    public static HttpUtils getInstance() {
        if (instance == null) {
            instance = new HttpUtils();
        }
        return instance;
    }

    public void getConfig(String key, String value, OnResponseListener<WanAndroidBean> listener) {
        RxService.createApi(APIFunction.class)
                .getBean(getParams(key, value))
                .compose(setThread())
                .subscribe(new Observer<WanAndroidBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WanAndroidBean datasBeans) {
                        listener.onSuccess(datasBeans);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("Demo",e.getMessage());
                        listener.onError();

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public <T> ObservableTransformer<T, T> setThread() {
        return upstream -> upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    private Map<String, String> getParams(String key, String value) {
        final Map<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public interface OnResponseListener<T> {
        void onSuccess(T bean);

        void onError();
    }
}
