package com.example.android.physicsanimation;

import android.content.Context;
import android.support.animation.DynamicAnimation;
import android.support.animation.FlingAnimation;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyFlingButton extends AppCompatButton {
    public MyFlingButton(Context context) {
        super(context);
    }

    public MyFlingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyFlingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                FlingAnimation flingAnimation = new FlingAnimation(this, DynamicAnimation.ROTATION_X);
                flingAnimation.setStartVelocity(400) // In pixels per second.
                        .setFriction(0.11f)
                        .start();
                break;
            default: //do nothing
        }
        return super.onTouchEvent(event);
    }
}
