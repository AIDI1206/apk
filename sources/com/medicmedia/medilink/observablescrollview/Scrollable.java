package com.medicmedia.medilink.observablescrollview;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public interface Scrollable {
    void addScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks);

    void clearScrollViewCallbacks();

    int getCurrentScrollY();

    void removeScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks);

    void scrollVerticallyTo(int i);

    @Deprecated
    void setScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks);

    void setTouchInterceptionViewGroup(ViewGroup viewGroup);
}
