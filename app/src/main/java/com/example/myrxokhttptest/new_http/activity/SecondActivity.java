package com.example.myrxokhttptest.new_http.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myrxokhttptest.R;
import com.example.myrxokhttptest.new_http.bean.WanAndroidBean;
import com.example.myrxokhttptest.new_http.utils.HttpUtils;

public class SecondActivity extends AppCompatActivity {
    TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTvContent = findViewById(R.id.tvContent);
        initHttp();
    }

    private void initHttp() {
        //接口一的内容
        HttpUtils.getInstance().getConfig("author", "鸿洋", new HttpUtils.OnResponseListener<WanAndroidBean>() {
            @Override
            public void onSuccess(WanAndroidBean bean) {
                mTvContent.setText(bean.getData().getDatas().get(0).getChapterName());
            }

            @Override
            public void onError() {

            }
        });



    }


}