package com.example.practicedraw;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    ArrayList<PageModel> pageModels = new ArrayList<PageModel>() {
        {
            add(new PageModel(R.layout.sample_color, R.string.title_draw_color, R.layout.practice_color));
            add(new PageModel(R.layout.sample_circle, R.string.title_draw_circle, R.layout.practice_circle));
        }
    };


    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        PageModel pageModel = pageModels.get(position);

        return PageFragment.newInstance(
                pageModel.mSampleLayoutRes,
                pageModel.mPracticeLayoutRes
        );
    }

    @Override
    public int getCount() {
        return pageModels.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(pageModels.get(position).mTitleRes);
    }
}