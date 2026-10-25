package com.medicmedia.medilink.util;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import com.medicmedia.medilink.overscroll.OverScrollWebView;

/* JADX INFO: loaded from: classes6.dex */
public class NestedOverScrollWebView extends OverScrollWebView implements NestedScrollingChild {
    private final NestedScrollingChildHelper mChildHelper;
    public boolean mEnableSwipeRefresh;
    private int mLastY;
    private int mNestedOffsetY;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;

    public NestedOverScrollWebView(Context context) {
        this(context, null);
    }

    public NestedOverScrollWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.webViewStyle);
    }

    public NestedOverScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollWebView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Log.d("test", "onInterceptTouchEventt Nestedwebview");
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.d("test", "ontTouchEvent Nestedwebview");
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEventObtain.getPointerCount() > 1) {
            stopNestedScroll();
            return super.onTouchEvent(motionEventObtain);
        }
        int action = motionEventObtain.getAction();
        if (action == 0) {
            this.mNestedOffsetY = 0;
        }
        int y = (int) motionEventObtain.getY();
        motionEventObtain.offsetLocation(0.0f, this.mNestedOffsetY);
        if (action == 0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEventObtain);
            this.mLastY = y;
            startNestedScroll(2);
            return zOnTouchEvent;
        }
        if (action == 1) {
            this.mEnableSwipeRefresh = false;
        } else {
            if (action == 2) {
                int i = this.mLastY - y;
                if (dispatchNestedPreScroll(0, i, this.mScrollConsumed, this.mScrollOffset)) {
                    i -= this.mScrollConsumed[1];
                    int i2 = this.mScrollOffset[1];
                    this.mLastY = y - i2;
                    motionEventObtain.offsetLocation(0.0f, -i2);
                    this.mNestedOffsetY += this.mScrollOffset[1];
                }
                int i3 = i;
                boolean zOnTouchEvent2 = super.onTouchEvent(motionEventObtain);
                int[] iArr = this.mScrollOffset;
                if (dispatchNestedScroll(0, iArr[1], 0, i3, iArr)) {
                    motionEventObtain.offsetLocation(0.0f, this.mScrollOffset[1]);
                    int i4 = this.mNestedOffsetY;
                    int i5 = this.mScrollOffset[1];
                    this.mNestedOffsetY = i4 + i5;
                    this.mLastY -= i5;
                }
                return zOnTouchEvent2;
            }
            if (action != 3) {
                return false;
            }
        }
        boolean zOnTouchEvent3 = super.onTouchEvent(motionEventObtain);
        stopNestedScroll();
        return zOnTouchEvent3;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.mChildHelper.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mChildHelper.stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.mEnableSwipeRefresh = true;
    }
}
