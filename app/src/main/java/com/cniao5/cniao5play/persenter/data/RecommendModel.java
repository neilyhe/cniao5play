package com.cniao5.cniao5play.persenter.data;

import com.cniao5.cniao5play.bean.AppInfo;
import com.cniao5.cniao5play.httpUtil.ApiService;
import com.cniao5.cniao5play.httpUtil.HttpManager;


import retrofit2.Callback;
import rx.Observable;

public class RecommendModel {

    public Observable<AppInfo> getApps(){
        HttpManager httpManager = HttpManager.getInstance();
        ApiService apiService =  httpManager.getRetrofit().create(ApiService.class);
//        apiService.getApps().enqueue(call);
        return apiService.getApps();

    }
}
