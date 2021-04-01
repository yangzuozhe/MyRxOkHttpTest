package com.example.myrxokhttptest.new_http.utils;

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

/**
 * 这是一个单例模式
 */
public class HttpUtils {
    private static HttpUtils instance;

    public static HttpUtils getInstance() {
        if (instance == null) {
            instance = new HttpUtils();
        }
        return instance;
    }

    /**
     * 在这里写需要获取接口的方法
     *
     * @param key      参数的键
     * @param value    参数的值
     * @param listener 回调成功或失败的接口
     */
    public void getConfig(String key, String value, OnResponseListener<WanAndroidBean> listener) {
        RxService.createApi(APIFunction.class)
                .getBean(getParams("author","鸿洋"))
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
                        listener.onError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    /**
     * 在子线程中调用方法
     *
     * @param <T>
     * @return
     */
    public <T> ObservableTransformer<T, T> setThread() {
        return upstream -> upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 这个是通过map组成的参数
     *
     * @param key
     * @param value
     * @return
     */
    private Map<String, String> getParams(String key, String value) {
        final Map<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    /**
     * 回调成功还是失败的方法
     *
     * @param <T>
     */
    public interface OnResponseListener<T> {
        void onSuccess(T bean);

        void onError();
    }
}
