package com.cniao5.cniao5play.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cniao5.cniao5play.R;
import com.cniao5.cniao5play.persenter.RecommendPersenter;
import com.cniao5.cniao5play.ui.adapter.RecomendAppAdapter;
import com.cniao5.cniao5play.bean.AppInfo;
import com.cniao5.cniao5play.contract.RecommendContract;

import java.util.List;

public class RecommendFragment extends BaseFragment implements RecommendContract.View {

    private RecommendPersenter mPersenter;
    RecyclerView mRecyclerView;

    @Override
    protected void initView(View view) {
        mRecyclerView = view.findViewById(R.id.recycler_view);
        mPersenter = new RecommendPersenter(this);
    }

    @Override
    protected void initData() {
        mPersenter.requestDatas();
    }

    @Override
    protected int setLayout() {
        return R.layout.catagory_fragment;
    }

    @Override
    public void showLoading() {
        Toast.makeText(getActivity(),"开始加载",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showDissLoading() {
        Toast.makeText(getActivity(),"加载结束",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getActivity(),"连接出错："+msg.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDatas(List<AppInfo.DataBean> data) {
        initRecyclerView(data);
    }

    private void initRecyclerView(List<AppInfo.DataBean> data){
        RecomendAppAdapter adapter = new RecomendAppAdapter(getActivity(),data);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void showNoDatas() {
        Toast.makeText(getActivity(),"暂无数据",Toast.LENGTH_SHORT).show();
    }
}
