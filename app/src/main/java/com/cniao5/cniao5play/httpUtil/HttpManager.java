package com.cniao5.cniao5play.httpUtil;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {


     static class HttpManagerHolder{
        private static final HttpManager manager = new HttpManager();
    }
    public static HttpManager getInstance(){
        return HttpManagerHolder.manager;
    }

    private HttpManager(){}
    private OkHttpClient getOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build();
    }
    public Retrofit getRetrofit(){

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getOkHttpClient());
        return builder.build();

    }
}
