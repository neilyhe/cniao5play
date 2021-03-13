package com.cniao5.cniao5play.contract;

import com.cniao5.cniao5play.bean.AppInfo;
import com.cniao5.cniao5play.persenter.data.BasePersenter;
import com.cniao5.cniao5play.ui.BaseView;

import java.util.List;

public interface RecommendContract {
    interface View extends BaseView {
        void showLoading();
        void showDissLoading();
        void showError(String msg);
        void showDatas(List<AppInfo.DataBean> data);

        void showNoDatas();
    }

    interface Persenter extends BasePersenter {
        public void requestDatas();
    }

}
