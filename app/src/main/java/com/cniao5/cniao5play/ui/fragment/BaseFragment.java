package com.cniao5.cniao5play.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    private static final String TAG = "fragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG,setTag()+":onCreateView()");int layout = setLayout();
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

    protected abstract String setTag();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,setTag()+":onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,setTag()+":onCreate()");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,setTag()+":onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,setTag()+":onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,setTag()+":onResume()");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,setTag()+":onPause()");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,setTag()+":onStop()");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,setTag()+":onDestroyView()");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,setTag()+":onDestroy()");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,setTag()+":onDetach()");

    }
}
