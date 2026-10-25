package com.medicmedia.medilink.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ObservableWebView extends WebView implements Scrollable {
    private List<ObservableScrollViewCallbacks> mCallbackCollection;
    private ObservableScrollViewCallbacks mCallbacks;
    private boolean mDragging;
    private boolean mFirstScroll;
    private boolean mIntercepted;
    private MotionEvent mPrevMoveEvent;
    private int mPrevScrollY;
    private ScrollState mScrollState;
    private int mScrollY;
    private ViewGroup mTouchInterceptionViewGroup;

    public ObservableWebView(Context context) {
        super(context);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.mPrevScrollY = savedState.prevScrollY;
        this.mScrollY = savedState.scrollY;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.prevScrollY = this.mPrevScrollY;
        savedState.scrollY = this.mScrollY;
        return savedState;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (hasNoCallbacks()) {
            return;
        }
        this.mScrollY = i2;
        dispatchOnScrollChanged(i2, this.mFirstScroll, this.mDragging);
        if (this.mFirstScroll) {
            this.mFirstScroll = false;
        }
        int i5 = this.mPrevScrollY;
        if (i5 < i2) {
            this.mScrollState = ScrollState.UP;
        } else if (i2 < i5) {
            this.mScrollState = ScrollState.DOWN;
        } else {
            this.mScrollState = ScrollState.STOP;
        }
        this.mPrevScrollY = i2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (hasNoCallbacks()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.mDragging = true;
            this.mFirstScroll = true;
            dispatchOnDownMotionEvent();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (hasNoCallbacks()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.mIntercepted = false;
            this.mDragging = false;
            dispatchOnUpOrCancelMotionEvent(this.mScrollState);
        } else if (actionMasked == 2) {
            if (this.mPrevMoveEvent == null) {
                this.mPrevMoveEvent = motionEvent;
            }
            float y = motionEvent.getY() - this.mPrevMoveEvent.getY();
            this.mPrevMoveEvent = MotionEvent.obtainNoHistory(motionEvent);
            float currentScrollY = getCurrentScrollY() - y;
            float left = 0.0f;
            if (currentScrollY <= 0.0f) {
                if (this.mIntercepted) {
                    return false;
                }
                final ViewGroup viewGroup = this.mTouchInterceptionViewGroup;
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) getParent();
                }
                float top = 0.0f;
                for (View view = this; view != null && view != viewGroup; view = (View) view.getParent()) {
                    left += view.getLeft() - view.getScrollX();
                    top += view.getTop() - view.getScrollY();
                }
                final MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                motionEventObtainNoHistory.offsetLocation(left, top);
                if (viewGroup.onInterceptTouchEvent(motionEventObtainNoHistory)) {
                    this.mIntercepted = true;
                    motionEventObtainNoHistory.setAction(0);
                    post(new Runnable() { // from class: com.medicmedia.medilink.observablescrollview.ObservableWebView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            viewGroup.dispatchTouchEvent(motionEventObtainNoHistory);
                        }
                    });
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        } else if (actionMasked == 3) {
            this.mIntercepted = false;
            this.mDragging = false;
            dispatchOnUpOrCancelMotionEvent(this.mScrollState);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void setScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks) {
        this.mCallbacks = observableScrollViewCallbacks;
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void addScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks) {
        if (this.mCallbackCollection == null) {
            this.mCallbackCollection = new ArrayList();
        }
        this.mCallbackCollection.add(observableScrollViewCallbacks);
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void removeScrollViewCallbacks(ObservableScrollViewCallbacks observableScrollViewCallbacks) {
        List<ObservableScrollViewCallbacks> list = this.mCallbackCollection;
        if (list != null) {
            list.remove(observableScrollViewCallbacks);
        }
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void clearScrollViewCallbacks() {
        List<ObservableScrollViewCallbacks> list = this.mCallbackCollection;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.mTouchInterceptionViewGroup = viewGroup;
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public void scrollVerticallyTo(int i) {
        scrollTo(0, i);
    }

    @Override // com.medicmedia.medilink.observablescrollview.Scrollable
    public int getCurrentScrollY() {
        return this.mScrollY;
    }

    private void dispatchOnDownMotionEvent() {
        ObservableScrollViewCallbacks observableScrollViewCallbacks = this.mCallbacks;
        if (observableScrollViewCallbacks != null) {
            observableScrollViewCallbacks.onDownMotionEvent();
        }
        if (this.mCallbackCollection != null) {
            for (int i = 0; i < this.mCallbackCollection.size(); i++) {
                this.mCallbackCollection.get(i).onDownMotionEvent();
            }
        }
    }

    private void dispatchOnScrollChanged(int i, boolean z, boolean z2) {
        ObservableScrollViewCallbacks observableScrollViewCallbacks = this.mCallbacks;
        if (observableScrollViewCallbacks != null) {
            observableScrollViewCallbacks.onScrollChanged(i, z, z2);
        }
        if (this.mCallbackCollection != null) {
            for (int i2 = 0; i2 < this.mCallbackCollection.size(); i2++) {
                this.mCallbackCollection.get(i2).onScrollChanged(i, z, z2);
            }
        }
    }

    private void dispatchOnUpOrCancelMotionEvent(ScrollState scrollState) {
        ObservableScrollViewCallbacks observableScrollViewCallbacks = this.mCallbacks;
        if (observableScrollViewCallbacks != null) {
            observableScrollViewCallbacks.onUpOrCancelMotionEvent(scrollState);
        }
        if (this.mCallbackCollection != null) {
            for (int i = 0; i < this.mCallbackCollection.size(); i++) {
                this.mCallbackCollection.get(i).onUpOrCancelMotionEvent(scrollState);
            }
        }
    }

    private boolean hasNoCallbacks() {
        return this.mCallbacks == null && this.mCallbackCollection == null;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.medicmedia.medilink.observablescrollview.ObservableWebView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int prevScrollY;
        int scrollY;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.prevScrollY = parcel.readInt();
            this.scrollY = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.prevScrollY);
            parcel.writeInt(this.scrollY);
        }
    }
}
