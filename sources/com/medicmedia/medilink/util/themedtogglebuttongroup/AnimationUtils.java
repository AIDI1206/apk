package com.medicmedia.medilink.util.themedtogglebuttongroup;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J.\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/util/themedtogglebuttongroup/AnimationUtils;", "", "<init>", "()V", AnimationUtils.clipBounds, "", "createWindowAnimator", "Landroid/animation/ObjectAnimator;", TypedValues.AttributesType.S_TARGET, "Landroid/view/View;", "reveal", "", "createHorizontalWindowAnimator", "Landroid/animation/Animator;", "rect", "createVerticalWindowAnimator", "createVericalSlideAnimator", "createHorizontalSlideAnimator", "createFadeAnimator", TypedValues.TransitionType.S_DURATION, "", "createCircularReveal", "x", "", "y", "size", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnimationUtils {
    public static final int $stable = 0;
    public static final AnimationUtils INSTANCE = new AnimationUtils();
    public static final String clipBounds = "clipBounds";

    private AnimationUtils() {
    }

    private final ObjectAnimator createWindowAnimator(final View target, boolean reveal) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(target, clipBounds, new RectEvaluator(), 0, 0);
        if (reveal) {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createWindowAnimator$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    target.setVisibility(0);
                }
            });
        } else {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createWindowAnimator$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    target.setVisibility(8);
                }
            });
        }
        objectAnimatorOfObject.setDuration(300L);
        objectAnimatorOfObject.setInterpolator(CubicBezierInterpolator.INSTANCE.getSTANDARD_CURVE());
        return objectAnimatorOfObject;
    }

    public final Animator createHorizontalWindowAnimator(View rect, View target, boolean reveal) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(target, "target");
        ObjectAnimator objectAnimatorCreateWindowAnimator = createWindowAnimator(target, reveal);
        Rect rect2 = new Rect(rect.getLeft(), rect.getTop() + (rect.getHeight() / 2), rect.getRight(), rect.getBottom() - (rect.getHeight() / 2));
        Rect rect3 = new Rect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        if (reveal) {
            objectAnimatorCreateWindowAnimator.setObjectValues(rect2, rect3);
        } else {
            objectAnimatorCreateWindowAnimator.setObjectValues(rect3, rect2);
        }
        return objectAnimatorCreateWindowAnimator;
    }

    public final Animator createVerticalWindowAnimator(View rect, View target, boolean reveal) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(target, "target");
        ObjectAnimator objectAnimatorCreateWindowAnimator = createWindowAnimator(target, reveal);
        Rect rect2 = new Rect(rect.getLeft() + (rect.getWidth() / 2), rect.getTop(), rect.getRight() - (rect.getWidth() / 2), rect.getBottom());
        Rect rect3 = new Rect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        if (reveal) {
            objectAnimatorCreateWindowAnimator.setObjectValues(rect2, rect3);
        } else {
            objectAnimatorCreateWindowAnimator.setObjectValues(rect3, rect2);
        }
        return objectAnimatorCreateWindowAnimator;
    }

    public final Animator createVericalSlideAnimator(View rect, final View target, boolean reveal) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(target, "target");
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(target, clipBounds, new RectEvaluator(), new Rect(rect.getLeft(), reveal ? rect.getBottom() : rect.getTop(), rect.getRight(), rect.getBottom()), new Rect(rect.getLeft(), rect.getTop(), rect.getRight(), reveal ? rect.getBottom() : rect.getTop()));
        if (reveal) {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createVericalSlideAnimator$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    target.setVisibility(0);
                }
            });
        } else {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createVericalSlideAnimator$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    target.setVisibility(8);
                }
            });
        }
        objectAnimatorOfObject.setDuration(400L);
        objectAnimatorOfObject.setInterpolator(CubicBezierInterpolator.INSTANCE.getSTANDARD_CURVE());
        return objectAnimatorOfObject;
    }

    public final Animator createHorizontalSlideAnimator(View rect, final View target, boolean reveal) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(target, "target");
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(target, clipBounds, new RectEvaluator(), new Rect(rect.getLeft(), rect.getTop(), reveal ? rect.getLeft() : rect.getRight(), rect.getBottom()), new Rect(reveal ? rect.getLeft() : rect.getRight(), rect.getTop(), rect.getRight(), rect.getBottom()));
        if (reveal) {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createHorizontalSlideAnimator$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    target.setVisibility(0);
                }
            });
        } else {
            Intrinsics.checkNotNull(objectAnimatorOfObject);
            objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createHorizontalSlideAnimator$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    target.setVisibility(8);
                }
            });
        }
        objectAnimatorOfObject.setDuration(400L);
        objectAnimatorOfObject.setInterpolator(CubicBezierInterpolator.INSTANCE.getSTANDARD_CURVE());
        return objectAnimatorOfObject;
    }

    public final Animator createFadeAnimator(final View target, boolean reveal, long duration) {
        Intrinsics.checkNotNullParameter(target, "target");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(target, "alpha", reveal ? 0.0f : 1.0f, reveal ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(duration);
        if (reveal) {
            Intrinsics.checkNotNull(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createFadeAnimator$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    target.setVisibility(0);
                }
            });
        } else {
            Intrinsics.checkNotNull(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createFadeAnimator$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    target.setVisibility(8);
                }
            });
        }
        return objectAnimatorOfFloat;
    }

    public final Animator createCircularReveal(final View target, float x, float y, boolean reveal, float size) {
        Intrinsics.checkNotNullParameter(target, "target");
        float f = reveal ? 0.0f : size;
        if (!reveal) {
            size = 0.0f;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(target, reveal ? (int) x : target.getWidth() / 2, reveal ? (int) y : target.getHeight() / 2, f, size);
        animatorCreateCircularReveal.setDuration(reveal ? 400L : 200L);
        animatorCreateCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
        if (reveal) {
            Intrinsics.checkNotNull(animatorCreateCircularReveal);
            animatorCreateCircularReveal.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createCircularReveal$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    target.setVisibility(0);
                }
            });
            return animatorCreateCircularReveal;
        }
        Intrinsics.checkNotNull(animatorCreateCircularReveal);
        animatorCreateCircularReveal.addListener(new Animator.AnimatorListener() { // from class: com.medicmedia.medilink.util.themedtogglebuttongroup.AnimationUtils$createCircularReveal$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                target.setVisibility(8);
            }
        });
        return animatorCreateCircularReveal;
    }
}
