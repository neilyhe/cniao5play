package com.cniao5.cniao5play.persenter;

import com.cniao5.cniao5play.bean.AppInfo;
import com.cniao5.cniao5play.contract.RecommendContract;
import com.cniao5.cniao5play.persenter.data.RecommendModel;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class RecommendPersenter implements RecommendContract.Persenter {

    private RecommendModel mModel;
    private RecommendContract.View mView;

    public RecommendPersenter(RecommendContract.View view){
        this.mView = view;
        mModel = new RecommendModel();
    }
    @Override
    public void requestDatas() {
//        mModel.getApps(new Callback<AppInfo>() {
////            @Override
////            public void onResponse(Call<AppInfo> call, Response<AppInfo> response) {
//                if (response != null){
//                    AppInfo appInfo = response.body();
//                    mView.showDatas(appInfo.getData());
//                }else {
//                    mView.showNoDatas();
//                }
////
////                mView.showDissLoading();
////            }
////
////            @Override
////            public void onFailure(Call<AppInfo> call, Throwable t) {
////                mView.showDissLoading();
////                mView.showError(t.getMessage());
////            }
////        });
   //
        mModel.getApps()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<AppInfo>() {
                    @Override
                    public void onStart() {
                        mView.showLoading();
                    }

                    @Override
                    public void onCompleted() {
                        mView.showDissLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showDissLoading();
                    }

                    @Override
                    public void onNext(AppInfo appInfo) {
                        if (appInfo != null){
                            mView.showDatas(appInfo.getData());
                        }else {
                            mView.showNoDatas();
                        }
                    }
                });
    }
}
