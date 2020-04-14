package com.example.practicedraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PracticeDrawCircleView extends View {

    Paint mPaint = new Paint();

    public PracticeDrawCircleView(Context context) {
        super(context);
    }

    public PracticeDrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PracticeDrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);

        canvas.drawCircle(getMeasuredWidth() / 4 + 50, getMeasuredHeight() / 4, 250, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        canvas.drawCircle(getMeasuredWidth() - getMeasuredWidth() / 3 + 50, getMeasuredHeight() / 4, 250, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.parseColor("#529bed"));
        canvas.drawCircle(getMeasuredWidth() / 4 + 50, getMeasuredHeight() - getMeasuredHeight() / 4, 250, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(80);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(getMeasuredWidth() - getMeasuredWidth() / 3 + 50, getMeasuredHeight() - getMeasuredHeight() / 4, 220, mPaint);
    }
}
