package com.example.android.physicsanimation;

import android.content.Context;
import android.support.animation.DynamicAnimation;
import android.support.animation.FloatPropertyCompat;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MySpringButtton extends AppCompatButton {
    public MySpringButtton(Context context) {
        super(context);
    }

    public MySpringButtton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySpringButtton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                SpringAnimation springAnimation = new SpringAnimation(this,
                        DynamicAnimation.Y, this.getY());
                springAnimation.setStartVelocity(10000);
                springAnimation.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
                springAnimation.start();
                break;
            default: // do nothing

        }

        return super.onTouchEvent(event);
    }
}
