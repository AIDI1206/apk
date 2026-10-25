package com.medicmedia.medilink.util;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class AnimatingProgressBar extends ProgressBar {
    private boolean animate;
    private ValueAnimator animator;
    private ValueAnimator animatorSecondary;
    private final Interpolator interpolator;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.animate = true;
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.animate = true;
    }

    public AnimatingProgressBar(Context context) {
        super(context);
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.animate = true;
    }

    public boolean isAnimate() {
        return this.animate;
    }

    public void setAnimate(boolean z) {
        this.animate = z;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (!this.animate) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i);
            this.animator = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(this.interpolator);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.medicmedia.medilink.util.AnimatingProgressBar$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f$0.m11184x607d061a(valueAnimator3);
                }
            });
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.animator.start();
    }

    /* JADX INFO: renamed from: lambda$setProgress$0$com-medicmedia-medilink-util-AnimatingProgressBar, reason: not valid java name */
    /* synthetic */ void m11184x607d061a(ValueAnimator valueAnimator) {
        super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        if (!this.animate) {
            super.setSecondaryProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.animatorSecondary;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animatorSecondary;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i);
            this.animatorSecondary = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(this.interpolator);
            this.animatorSecondary.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.medicmedia.medilink.util.AnimatingProgressBar$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f$0.m11185xd5277bc5(valueAnimator3);
                }
            });
        } else {
            valueAnimator2.setIntValues(getSecondaryProgress(), i);
        }
        this.animatorSecondary.start();
    }

    /* JADX INFO: renamed from: lambda$setSecondaryProgress$1$com-medicmedia-medilink-util-AnimatingProgressBar, reason: not valid java name */
    /* synthetic */ void m11185xd5277bc5(ValueAnimator valueAnimator) {
        super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animatorSecondary;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
