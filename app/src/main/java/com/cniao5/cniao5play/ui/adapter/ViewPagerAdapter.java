package com.cniao5.cniao5play.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.cniao5.cniao5play.ui.fragment.CategoryFragment;
import com.cniao5.cniao5play.bean.FragmentInfo;
import com.cniao5.cniao5play.ui.fragment.GamesFragment;
import com.cniao5.cniao5play.ui.fragment.RankingFragment;
import com.cniao5.cniao5play.ui.fragment.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    List<FragmentInfo> fragmentInfoList;

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        initFragment();
    }

    private  void initFragment(){
        fragmentInfoList = new ArrayList<>(4);
        fragmentInfoList.add(new FragmentInfo("推荐", CategoryFragment.class));
        fragmentInfoList.add(new FragmentInfo("游戏", GamesFragment.class));
        fragmentInfoList.add(new FragmentInfo("分类", RankingFragment.class));
        fragmentInfoList.add(new FragmentInfo("排行", RecommendFragment.class));

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        try {
            return (Fragment) fragmentInfoList.get(position).getFragment().newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragmentInfoList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentInfoList.get(position).getTitle();
    }
}
