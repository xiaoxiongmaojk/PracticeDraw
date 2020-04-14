package com.example.practicedraw;

import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;

public class PageModel {
   @StringRes int mTitleRes;
   @LayoutRes int mSampleLayoutRes;
   @LayoutRes int mPracticeLayoutRes;

    PageModel(@LayoutRes int sampleLayoutRes, @StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
        this.mSampleLayoutRes = sampleLayoutRes;
        this.mTitleRes = titleRes;
        this.mPracticeLayoutRes = practiceLayoutRes;
    }
}
