package com.medicmedia.medilink.overscroll;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public class OverScrollWebView extends WebView implements OverScrollDelegate.OverScrollable {
    private static final String TAG = "OverScrollWebView";
    private boolean is_marker_actionmode;
    private OverScrollDelegate mOverScrollDelegate;

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public View getOverScrollableView() {
        return this;
    }

    public OverScrollWebView(Context context) {
        super(context);
        this.is_marker_actionmode = false;
        createOverScrollDelegate(context);
    }

    public OverScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.is_marker_actionmode = false;
        createOverScrollDelegate(context);
    }

    public OverScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.is_marker_actionmode = false;
        createOverScrollDelegate(context);
    }

    public void setMarkerActionMode(boolean z) {
        this.is_marker_actionmode = z;
    }

    public boolean getMarkerActionMode() {
        return this.is_marker_actionmode;
    }

    private void createOverScrollDelegate(Context context) {
        this.mOverScrollDelegate = new OverScrollDelegate(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mOverScrollDelegate.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mOverScrollDelegate.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.mOverScrollDelegate.draw(canvas);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return this.mOverScrollDelegate.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public int superComputeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public int superComputeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public int superComputeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public void superOnTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public void superDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public boolean superAwakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public boolean superOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollable
    public OverScrollDelegate getOverScrollDelegate() {
        return this.mOverScrollDelegate;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (this.is_marker_actionmode) {
            return super.startActionMode(new MarkerBar(), 1);
        }
        return super.startActionMode(callback, 1);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.is_marker_actionmode) {
            return super.startActionMode(new MarkerBar());
        }
        return super.startActionMode(callback);
    }

    public class NotMarkerBar implements ActionMode.Callback {
        ActionMode.Callback mCallback;

        public NotMarkerBar() {
        }

        public NotMarkerBar(ActionMode.Callback callback) {
            this.mCallback = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mCallback.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mCallback.onPrepareActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() != 16908319) {
                return this.mCallback.onActionItemClicked(actionMode, menuItem);
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mCallback.onDestroyActionMode(actionMode);
        }
    }

    public class MarkerBar implements ActionMode.Callback {
        private boolean del_view;

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public MarkerBar() {
            this.del_view = false;
        }

        public MarkerBar(boolean z) {
            this.del_view = z;
        }
    }
}
