package com.cniao5.cniao5play.httpUtil;

import com.cniao5.cniao5play.bean.AppInfo;


import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface ApiService {
    String BASE_URL = "https://raw.githubusercontent.com";
//    @GET("/robinson911/robinson911/master/ljweibo.json")
//    public Call<AppInfo> getApps();

    @GET("/robinson911/robinson911/master/ljweibo.json")
    public Observable<AppInfo> getApps();
}



