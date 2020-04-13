package com.example.practicedraw;

import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;

public class PageModel {
    private int mTitleRes;
    private int mSampleLayoutRes;
    private int mPracticeLayoutRes;

    PageModel(@LayoutRes int sampleLayoutRes, @StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
        this.mSampleLayoutRes = sampleLayoutRes;
        this.mTitleRes = titleRes;
        this.mPracticeLayoutRes = practiceLayoutRes;
    }

    public int getSampleLayoutRes() {
        return mSampleLayoutRes;
    }

    public int getTitleRes() {
        return mTitleRes;
    }

    public int getPracticeLayoutRes() {
        return mPracticeLayoutRes;
    }
}
