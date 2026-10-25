package com.medicmedia.medilink.overscroll;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes6.dex */
public class PathScroller {
    private static final boolean DEBUG = false;
    private static final String LOG_TAG = "PathScroller";
    private int mCurrValue;
    private int mDuration;
    private boolean mFinished;
    private PathPointsHolder mPathPointsHolder;
    private long mStartTime;
    private float mValueFactor;

    public void start(float f, int i, PathPointsHolder pathPointsHolder) {
        this.mValueFactor = f;
        this.mDuration = i;
        this.mFinished = false;
        this.mPathPointsHolder = pathPointsHolder;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean isFinished() {
        return this.mFinished;
    }

    public boolean computeScrollOffset() {
        if (this.mFinished) {
            return false;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
        float f = 1.0f;
        int i = this.mDuration;
        float f2 = (jCurrentAnimationTimeMillis * 1.0f) / i;
        if (jCurrentAnimationTimeMillis >= i) {
            this.mFinished = true;
        } else {
            f = f2;
        }
        this.mCurrValue = Math.round(this.mValueFactor * this.mPathPointsHolder.getY(f));
        return true;
    }

    public int getCurrValue() {
        return this.mCurrValue;
    }

    public int getCurrY() {
        return this.mCurrValue;
    }

    public void abortAnimation() {
        this.mFinished = true;
    }

    public static class PathPointsHolder {
        private static final float PRECISION = 0.002f;
        private float[] mX;
        private float[] mY;

        public PathPointsHolder(Path path) {
            AnimationUtils.currentAnimationTimeMillis();
            PathMeasure pathMeasure = new PathMeasure(path, false);
            float length = pathMeasure.getLength();
            int i = (int) (length / 0.002f);
            int i2 = i + 1;
            this.mX = new float[i2];
            this.mY = new float[i2];
            float[] fArr = new float[2];
            for (int i3 = 0; i3 < i2; i3++) {
                pathMeasure.getPosTan((i3 * length) / i, fArr, null);
                this.mX[i3] = fArr[0];
                this.mY[i3] = fArr[1];
            }
            AnimationUtils.currentAnimationTimeMillis();
        }

        float getY(float f) {
            int i = 0;
            if (f <= 0.0f) {
                return this.mY[0];
            }
            if (f >= 1.0f) {
                float[] fArr = this.mY;
                return fArr[fArr.length - 1];
            }
            int length = this.mX.length - 1;
            while (length - i > 1) {
                int i2 = (i + length) / 2;
                if (f < this.mX[i2]) {
                    length = i2;
                } else {
                    i = i2;
                }
            }
            float[] fArr2 = this.mX;
            float f2 = fArr2[length];
            float f3 = fArr2[i];
            float f4 = f2 - f3;
            if (f4 == 0.0f) {
                return this.mY[i];
            }
            float[] fArr3 = this.mY;
            float f5 = fArr3[i];
            return f5 + (((f - f3) / f4) * (fArr3[length] - f5));
        }
    }
}
