package com.example.practicedraw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {
    @LayoutRes
    int mSampleLayoutRes;
    @LayoutRes
    int mPracticeLayoutRes;

    public static PageFragment newInstance(@LayoutRes int sampleLayoutRes, @LayoutRes int practiceLayoutRes) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("sampleLayoutRes", sampleLayoutRes);
        args.putInt("practiceLayoutRes", practiceLayoutRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        ViewStub sampleStub = view.findViewById(R.id.sampleStub);
        sampleStub.setLayoutResource(mSampleLayoutRes);
        sampleStub.inflate();

        ViewStub practiceStub = view.findViewById(R.id.practiceStub);
        practiceStub.setLayoutResource(mPracticeLayoutRes);
        practiceStub.inflate();

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mSampleLayoutRes = args.getInt("sampleLayoutRes");
            mPracticeLayoutRes = args.getInt("practiceLayoutRes");
        }
    }
}
