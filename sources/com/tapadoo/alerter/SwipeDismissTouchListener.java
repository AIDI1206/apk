package com.tapadoo.alerter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SwipeDismissTouchListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tapadoo/alerter/SwipeDismissTouchListener;", "Landroid/view/View$OnTouchListener;", "mView", "Landroid/view/View;", "mCallbacks", "Lcom/tapadoo/alerter/SwipeDismissTouchListener$DismissCallbacks;", "(Landroid/view/View;Lcom/tapadoo/alerter/SwipeDismissTouchListener$DismissCallbacks;)V", "mAnimationTime", "", "mDownX", "", "mDownY", "mMinFlingVelocity", "", "mSlop", "mSwiping", "", "mSwipingSlop", "mTranslationX", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mViewWidth", "onTouch", "view", "motionEvent", "Landroid/view/MotionEvent;", "performDismiss", "", "DismissCallbacks", "alerter_release"}, k = 1, mv = {1, 4, 1})
public final class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private final View mView;
    private int mViewWidth;

    /* JADX INFO: compiled from: SwipeDismissTouchListener.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/tapadoo/alerter/SwipeDismissTouchListener$DismissCallbacks;", "", "canDismiss", "", "onDismiss", "", "view", "Landroid/view/View;", "onTouch", "touch", "alerter_release"}, k = 1, mv = {1, 4, 1})
    public interface DismissCallbacks {
        boolean canDismiss();

        void onDismiss(View view);

        void onTouch(View view, boolean touch);
    }

    public SwipeDismissTouchListener(View mView, DismissCallbacks mCallbacks) {
        Intrinsics.checkNotNullParameter(mView, "mView");
        Intrinsics.checkNotNullParameter(mCallbacks, "mCallbacks");
        this.mView = mView;
        this.mCallbacks = mCallbacks;
        this.mViewWidth = 1;
        ViewConfiguration vc = ViewConfiguration.get(mView.getContext());
        Intrinsics.checkNotNullExpressionValue(vc, "vc");
        this.mSlop = vc.getScaledTouchSlop();
        this.mMinFlingVelocity = vc.getScaledMinimumFlingVelocity() * 16;
        Context context = mView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mView.context");
        this.mAnimationTime = context.getResources().getInteger(android.R.integer.config_shortAnimTime);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            if (this.mCallbacks.canDismiss()) {
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.mVelocityTracker = velocityTrackerObtain;
                Intrinsics.checkNotNull(velocityTrackerObtain);
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.mCallbacks.onTouch(view, true);
            return false;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                float rawX = motionEvent.getRawX() - this.mDownX;
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float fAbs = Math.abs(xVelocity);
                float fAbs2 = Math.abs(velocityTracker.getYVelocity());
                if (Math.abs(rawX) > this.mViewWidth / 2 && this.mSwiping) {
                    z = rawX > ((float) 0);
                } else if (this.mMinFlingVelocity > fAbs || fAbs2 >= fAbs || !this.mSwiping) {
                    z = false;
                    z2 = false;
                } else {
                    float f = 0;
                    boolean z3 = ((xVelocity > f ? 1 : (xVelocity == f ? 0 : -1)) < 0) == ((rawX > f ? 1 : (rawX == f ? 0 : -1)) < 0);
                    z = velocityTracker.getXVelocity() > f;
                    z2 = z3;
                }
                if (z2) {
                    this.mView.animate().translationX(z ? this.mViewWidth : -this.mViewWidth).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.tapadoo.alerter.SwipeDismissTouchListener$onTouch$$inlined$run$lambda$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            this.this$0.performDismiss();
                        }
                    });
                } else if (this.mSwiping) {
                    this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
                    this.mCallbacks.onTouch(view, false);
                }
                velocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mTranslationX = 0.0f;
                this.mDownX = 0.0f;
                this.mDownY = 0.0f;
                this.mSwiping = false;
            }
        } else if (actionMasked == 2) {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                float rawY = motionEvent.getRawY() - this.mDownY;
                if (Math.abs(rawX2) > this.mSlop && Math.abs(rawY) < Math.abs(rawX2) / 2) {
                    this.mSwiping = true;
                    this.mSwipingSlop = rawX2 > ((float) 0) ? this.mSlop : -this.mSlop;
                    this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                    MotionEvent cancelEvent = MotionEvent.obtain(motionEvent);
                    Intrinsics.checkNotNullExpressionValue(cancelEvent, "cancelEvent");
                    cancelEvent.setAction((motionEvent.getActionIndex() << 8) | 3);
                    this.mView.onTouchEvent(cancelEvent);
                    cancelEvent.recycle();
                }
                if (this.mSwiping) {
                    this.mTranslationX = rawX2;
                    this.mView.setTranslationX(rawX2 - this.mSwipingSlop);
                    this.mView.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX2) * 2.0f) / this.mViewWidth))));
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
                velocityTracker3.recycle();
                this.mVelocityTracker = null;
                this.mTranslationX = 0.0f;
                this.mDownX = 0.0f;
                this.mDownY = 0.0f;
                this.mSwiping = false;
            }
        } else {
            view.performClick();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.tapadoo.alerter.SwipeDismissTouchListener.performDismiss.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tapadoo.alerter.SwipeDismissTouchListener.performDismiss.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                Intrinsics.checkNotNullExpressionValue(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams2.height = ((Integer) animatedValue).intValue();
                    SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        });
        duration.start();
    }
}
