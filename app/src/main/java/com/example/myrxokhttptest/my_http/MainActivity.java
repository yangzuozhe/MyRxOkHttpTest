package com.example.myrxokhttptest.my_http;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myrxokhttptest.R;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    TextView mTvClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvClick = findViewById(R.id.tvClick);
        mTvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
    }

    private void initData() {
        //网络请求一般在子线程中
        new Thread(new Runnable() {
            @Override
            public void run() {
                //请求网络
                RxService.createApi(ApiService.class)
                        .getBean("北京")
                        //支持Android观察者
                        .observeOn(AndroidSchedulers.mainThread())
                        //支持io流订阅者
                        .subscribeOn(Schedulers.io())
                        .subscribe(new Observer<WeatherBean>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(WeatherBean weatherBean) {
                                //处理事件
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        mTvClick.setText(weatherBean.getData().getZs_ag().getInfo());
                                    }
                                });
                            }

                            @Override
                            public void onError(Throwable e) {
                                //出现错误会调用这个方法
                            }

                            @Override
                            public void onComplete() {
                                //结束观察...
                            }
                        });
            }
        }).start();
    }


}