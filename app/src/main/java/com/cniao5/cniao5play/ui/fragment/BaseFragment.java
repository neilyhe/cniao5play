package com.cniao5.cniao5play.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layout = setLayout();
        if (layout != 0){
            View view = inflater.inflate(setLayout(),container,false);
            initView(view);
            initData();
            return view;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    protected abstract void initView(View view);

    protected abstract void initData();

    protected abstract int setLayout();

}
