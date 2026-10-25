package com.medicmedia.medilink.overscroll;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class OverScrollDelegate {
    private static final int DRAG_BACK_DURATION = 420;
    private static final int FLING_BACK_DURATION = 550;
    private static final int INVALID_POINTER = -1;
    static final String LOG_TAG = "OverScrollDelegate";
    public static final int OS_DRAG_BOTTOM = 2;
    public static final int OS_DRAG_TOP = 1;
    public static final int OS_FLING = 4;
    public static final int OS_NONE = 0;
    public static final int OS_SPRING_BACK = 3;
    private static final OverScrollStyle sDefaultStyle = new OverScrollStyle() { // from class: com.medicmedia.medilink.overscroll.OverScrollDelegate.1
    };
    private static final PathScroller.PathPointsHolder sDragBackPathPointsHolder = buildDragBackPathPointsHolder();
    private static final PathScroller.PathPointsHolder sFlingBackPathPointsHolder = buildFlingBackPathPointsHolder();
    private float mLastMotionY;
    private float mOffsetY;
    private OverScrollable mOverScrollable;
    private final PathScroller mScroller;
    private OverScrollStyle mStyle;
    private final int mTouchSlop;
    private final View mView;
    private int mState = 0;
    private int mActivePointerId = -1;
    private boolean mEnableDragOverScroll = true;
    private boolean mEnableFlingOverScroll = true;

    public interface OverScrollable {
        OverScrollDelegate getOverScrollDelegate();

        View getOverScrollableView();

        boolean superAwakenScrollBars();

        int superComputeVerticalScrollExtent();

        int superComputeVerticalScrollOffset();

        int superComputeVerticalScrollRange();

        void superDraw(Canvas canvas);

        void superOnTouchEvent(MotionEvent motionEvent);

        boolean superOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    public static abstract class OverScrollStyle {
        public static final float DEFAULT_DRAW_TRANSLATE_RATE = 0.36f;
        public static final float SYSTEM_DENSITY = Resources.getSystem().getDisplayMetrics().density;

        public void transformOverScrollCanvas(float f, Canvas canvas, View view) {
            canvas.translate(0.0f, Math.round(f * 0.36f));
        }

        public void drawOverScrollTop(float f, Canvas canvas, View view) {
            Log.d("OverScrollTop", "drawOverScrollTop");
        }

        public void drawOverScrollBottom(float f, Canvas canvas, View view) {
            Log.d("OverScrollBottom", "drawOverScrollBottom");
        }

        public final int getOverScrollViewCanvasBottom(View view) {
            return view.getHeight() + view.getScrollY();
        }

        public static final int dp2px(int i) {
            return (int) ((i * SYSTEM_DENSITY) + 0.5f);
        }
    }

    private static PathScroller.PathPointsHolder buildDragBackPathPointsHolder() {
        Path path = new Path();
        path.moveTo(0.0f, 1.0f);
        path.cubicTo(0.11f, 0.11f, 0.36f, 0.05f, 1.0f, 0.0f);
        return new PathScroller.PathPointsHolder(path);
    }

    private static PathScroller.PathPointsHolder buildFlingBackPathPointsHolder() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.05f, 0.8f, 0.09f, 1.2f, 0.21f, 0.88f);
        path.cubicTo(0.48f, 0.1f, 0.72f, 0.02f, 1.0f, 0.0f);
        return new PathScroller.PathPointsHolder(path);
    }

    public OverScrollDelegate(OverScrollable overScrollable) {
        View overScrollableView = overScrollable.getOverScrollableView();
        this.mView = overScrollableView;
        if (overScrollableView instanceof RecyclerView) {
            overScrollableView.setOverScrollMode(0);
        } else {
            overScrollableView.setOverScrollMode(2);
        }
        this.mOverScrollable = overScrollable;
        Context context = overScrollableView.getContext();
        this.mScroller = new PathScroller();
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.mStyle = sDefaultStyle;
    }

    public void setOverScrollStyle(OverScrollStyle overScrollStyle) {
        if (overScrollStyle == null) {
            throw new IllegalArgumentException("OverScrollStyle should NOT be NULL!");
        }
        this.mStyle = overScrollStyle;
    }

    public void setOverScrollType(boolean z, boolean z2) {
        this.mEnableDragOverScroll = z;
        this.mEnableFlingOverScroll = z2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mEnableDragOverScroll) {
            return onInterceptTouchEventInternal(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mEnableDragOverScroll) {
            return onTouchEventInternal(motionEvent);
        }
        return false;
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean zSuperOverScrollBy = this.mOverScrollable.superOverScrollBy(i, i2, i3, i4, i5, i6, 0, 0, z);
        if (this.mEnableFlingOverScroll) {
            if (!zSuperOverScrollBy) {
                if (this.mState == 4) {
                    log("warning, overScroll=flase BUT mState=OS_FLING");
                    return zSuperOverScrollBy;
                }
            } else if (!z && this.mState != 4) {
                log("deltaY->" + i2);
                onAbsorb(-((int) (i2 / 0.0166666f)));
            }
        }
        return zSuperOverScrollBy;
    }

    public void recyclerViewAbsorbGlows(int i, int i2) {
        log("recyclerViewAbsorbGlows velocityY->" + i2);
        if (!this.mEnableFlingOverScroll || i2 == 0) {
            return;
        }
        onAbsorb(-i2);
    }

    private void onAbsorb(int i) {
        this.mOffsetY = i > 0 ? -1.0f : 1.0f;
        float f = i * 0.07f;
        log("velocityY->" + i + " overY->" + f);
        this.mScroller.start(f, FLING_BACK_DURATION, sFlingBackPathPointsHolder);
        setState(4);
        this.mView.invalidate();
    }

    public PathScroller getPathScroller() {
        return this.mScroller;
    }

    public void draw(Canvas canvas) {
        int i = this.mState;
        if (i == 0) {
            this.mOverScrollable.superDraw(canvas);
            return;
        }
        if (i == 3 || i == 4) {
            if (this.mScroller.computeScrollOffset()) {
                this.mOffsetY = this.mScroller.getCurrY();
            } else {
                this.mOffsetY = 0.0f;
                setState(0);
            }
            ViewCompat.postInvalidateOnAnimation(this.mView);
        }
        int iSave = canvas.save();
        this.mStyle.transformOverScrollCanvas(this.mOffsetY, canvas, this.mView);
        this.mOverScrollable.superDraw(canvas);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        float f = this.mOffsetY;
        if (f > 0.0f) {
            this.mStyle.drawOverScrollTop(f, canvas, this.mView);
        } else if (f < 0.0f) {
            this.mStyle.drawOverScrollBottom(f, canvas, this.mView);
        }
        canvas.restoreToCount(iSave2);
    }

    private void setState(int i) {
        String str;
        if (this.mState != i) {
            this.mState = i;
            if (i == 0) {
                str = "OS_NONE";
            } else if (i == 1) {
                str = "OS_TOP";
            } else if (i == 2) {
                str = "OS_BOTTOM";
            } else if (i == 3) {
                str = "OS_SPRING_BACK";
            } else if (i != 4) {
                str = "";
            } else {
                str = "OS_FLING";
            }
            log("setState->".concat(str));
        }
    }

    private boolean isOsTop() {
        return this.mState == 1;
    }

    private boolean isOsBottom() {
        return this.mState == 2;
    }

    private boolean isOsDrag() {
        int i = this.mState;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    private boolean onInterceptTouchEventInternal(MotionEvent motionEvent) {
        boolean z;
        Log.d("test", "onInterceptTouchEventInternal");
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            log("onInterceptTouchEvent -> ACTION_DOWN");
            this.mLastMotionY = motionEvent.getY();
            this.mActivePointerId = motionEvent.getPointerId(0);
            if (this.mState == 3 && this.mScroller.computeScrollOffset()) {
                this.mOffsetY = this.mScroller.getCurrY();
                this.mScroller.abortAnimation();
                float f = this.mOffsetY;
                if (f == 0.0f) {
                    setState(0);
                } else {
                    setState(f > 0.0f ? 1 : 2);
                }
                this.mView.invalidate();
            }
        } else if (action == 1) {
            this.mActivePointerId = -1;
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i == -1) {
                Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex == -1) {
                    Log.e(LOG_TAG, "Invalid pointerId=" + this.mActivePointerId + " in onInterceptTouchEvent");
                } else {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f2 = y - this.mLastMotionY;
                    this.mLastMotionY = y;
                    if (!isOsDrag()) {
                        int iSuperComputeVerticalScrollOffset = this.mOverScrollable.superComputeVerticalScrollOffset();
                        int iSuperComputeVerticalScrollRange = this.mOverScrollable.superComputeVerticalScrollRange() - this.mOverScrollable.superComputeVerticalScrollExtent();
                        if (iSuperComputeVerticalScrollRange == 0) {
                            z = false;
                        } else {
                            boolean z3 = iSuperComputeVerticalScrollOffset > 0;
                            z = iSuperComputeVerticalScrollOffset < iSuperComputeVerticalScrollRange - 1;
                            z2 = z3;
                        }
                        if ((!z2 || !z) && Math.abs(f2) > this.mTouchSlop) {
                            if (!z2 && f2 > 0.0f) {
                                setState(1);
                            } else if (!z && f2 < 0.0f) {
                                setState(2);
                            }
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.setAction(3);
                            this.mOverScrollable.superOnTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                            this.mOverScrollable.superAwakenScrollBars();
                            ViewParent parent = this.mView.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
            }
        } else if (action == 3) {
            this.mActivePointerId = -1;
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        return isOsDrag();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    private boolean onTouchEventInternal(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        Log.d("test", "onTouchEventInternal");
        int action = motionEvent.getAction();
        if (action == 0) {
            log("onTouchEvent -> ACTION_DOWN");
            this.mLastMotionY = motionEvent.getY();
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action == 1) {
            f = this.mOffsetY;
            if (f != 0.0f) {
                this.mScroller.start(Math.round(f), 420, sDragBackPathPointsHolder);
                setState(3);
                this.mView.invalidate();
            }
            this.mActivePointerId = -1;
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i == -1) {
                Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                } else {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f2 = y - this.mLastMotionY;
                    this.mLastMotionY = y;
                    if (!isOsDrag()) {
                        int iSuperComputeVerticalScrollOffset = this.mOverScrollable.superComputeVerticalScrollOffset();
                        int iSuperComputeVerticalScrollRange = this.mOverScrollable.superComputeVerticalScrollRange() - this.mOverScrollable.superComputeVerticalScrollExtent();
                        if (iSuperComputeVerticalScrollRange == 0) {
                            z2 = false;
                            z = false;
                        } else {
                            z = iSuperComputeVerticalScrollOffset > 0;
                            z2 = iSuperComputeVerticalScrollOffset < iSuperComputeVerticalScrollRange - 1;
                        }
                        if (!z || !z2) {
                            if (Math.abs(f2) >= 1.0f) {
                                if (!z && f2 > 0.0f) {
                                    setState(1);
                                } else if (!z2 && f2 < 0.0f) {
                                    setState(2);
                                }
                                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                                this.mOverScrollable.superOnTouchEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                this.mOverScrollable.superAwakenScrollBars();
                                ViewParent parent = this.mView.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                            if (isOsDrag()) {
                                this.mOffsetY += f2;
                                if (isOsTop()) {
                                    if (this.mOffsetY <= 0.0f) {
                                        setState(0);
                                        this.mOffsetY = 0.0f;
                                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                                        motionEventObtain2.setAction(0);
                                        this.mOverScrollable.superOnTouchEvent(motionEventObtain2);
                                        motionEventObtain2.recycle();
                                    }
                                } else if (isOsBottom() && this.mOffsetY >= 0.0f) {
                                    setState(0);
                                    this.mOffsetY = 0.0f;
                                    MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                                    motionEventObtain3.setAction(0);
                                    this.mOverScrollable.superOnTouchEvent(motionEventObtain3);
                                    motionEventObtain3.recycle();
                                }
                                this.mView.invalidate();
                            }
                        }
                    } else if (isOsDrag()) {
                        this.mOffsetY += f2;
                        if (isOsTop()) {
                            if (this.mOffsetY <= 0.0f) {
                                setState(0);
                                this.mOffsetY = 0.0f;
                                MotionEvent motionEventObtain4 = MotionEvent.obtain(motionEvent);
                                motionEventObtain4.setAction(0);
                                this.mOverScrollable.superOnTouchEvent(motionEventObtain4);
                                motionEventObtain4.recycle();
                            }
                        } else if (isOsBottom()) {
                            setState(0);
                            this.mOffsetY = 0.0f;
                            MotionEvent motionEventObtain5 = MotionEvent.obtain(motionEvent);
                            motionEventObtain5.setAction(0);
                            this.mOverScrollable.superOnTouchEvent(motionEventObtain5);
                            motionEventObtain5.recycle();
                        }
                        this.mView.invalidate();
                    }
                }
            }
        } else if (action == 3) {
            f = this.mOffsetY;
            if (f != 0.0f) {
                this.mScroller.start(Math.round(f), 420, sDragBackPathPointsHolder);
                setState(3);
                this.mView.invalidate();
            }
            this.mActivePointerId = -1;
        } else if (action == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.mLastMotionY = motionEvent.getY(actionIndex);
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (iFindPointerIndex2 != -1) {
                this.mLastMotionY = motionEvent.getY(iFindPointerIndex2);
            }
        }
        return isOsDrag();
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void log(String str) {
        Log.d(LOG_TAG, str);
    }
}
