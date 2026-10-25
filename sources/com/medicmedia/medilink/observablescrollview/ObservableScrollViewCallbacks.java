package com.medicmedia.medilink.observablescrollview;

/* JADX INFO: loaded from: classes6.dex */
public interface ObservableScrollViewCallbacks {
    void onDownMotionEvent();

    void onScrollChanged(int i, boolean z, boolean z2);

    void onUpOrCancelMotionEvent(ScrollState scrollState);
}
