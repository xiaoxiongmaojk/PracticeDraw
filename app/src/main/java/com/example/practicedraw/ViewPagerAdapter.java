package com.example.practicedraw;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<PageModel> pageModels = new ArrayList<PageModel>() {

    };

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        PageModel pageModel = pageModels.get(position);

        return ;
    }

    @Override
    public int getCount() {
        return pageModels.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Integer.toString(pageModels.get(position).getTitleRes());
    }
}