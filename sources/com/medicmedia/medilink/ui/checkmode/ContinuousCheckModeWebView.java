package com.medicmedia.medilink.ui.checkmode;

import android.content.Context;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.medicmedia.medilink.ui.common.ActionModeSwitchWebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ContinuousCheckModeWebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016JP\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0011H\u0014J\u0006\u0010\"\u001a\u00020\bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/ui/checkmode/ContinuousCheckModeWebView;", "Lcom/medicmedia/medilink/ui/common/ActionModeSwitchWebView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onOverScrollTop", "Lkotlin/Function0;", "", "getOnOverScrollTop", "()Lkotlin/jvm/functions/Function0;", "setOnOverScrollTop", "(Lkotlin/jvm/functions/Function0;)V", "onOverScrollBottom", "getOnOverScrollBottom", "setOnOverScrollBottom", "isDragging", "", "overScrollTopNotified", "overScrollBottomNotified", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "overScrollBy", "deltaX", "", "deltaY", "scrollX", "scrollY", "scrollRangeX", "scrollRangeY", "maxOverScrollX", "maxOverScrollY", "isTouchEvent", "resetOverScrollNotificationState", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContinuousCheckModeWebView extends ActionModeSwitchWebView {
    public static final int $stable = 8;
    private boolean isDragging;
    private Function0<Unit> onOverScrollBottom;
    private Function0<Unit> onOverScrollTop;
    private boolean overScrollBottomNotified;
    private boolean overScrollTopNotified;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuousCheckModeWebView(Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Function0<Unit> getOnOverScrollTop() {
        return this.onOverScrollTop;
    }

    public final void setOnOverScrollTop(Function0<Unit> function0) {
        this.onOverScrollTop = function0;
    }

    public final Function0<Unit> getOnOverScrollBottom() {
        return this.onOverScrollBottom;
    }

    public final void setOnOverScrollBottom(Function0<Unit> function0) {
        this.onOverScrollBottom = function0;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isDragging = true;
            resetOverScrollNotificationState();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.isDragging = false;
            resetOverScrollNotificationState();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        if (this.isDragging) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(computeVerticalScrollRange() - getHeight(), 0);
            boolean z = scrollY <= 0;
            boolean z2 = scrollY >= iCoerceAtLeast;
            if (z && deltaY < 0) {
                if (!this.overScrollTopNotified) {
                    Function0<Unit> function0 = this.onOverScrollTop;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.overScrollTopNotified = true;
                }
            } else {
                this.overScrollTopNotified = false;
            }
            if (z2 && deltaY > 0) {
                if (!this.overScrollBottomNotified) {
                    Function0<Unit> function1 = this.onOverScrollBottom;
                    if (function1 != null) {
                        function1.invoke();
                    }
                    this.overScrollBottomNotified = true;
                }
            } else {
                this.overScrollBottomNotified = false;
            }
        }
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
    }

    public final void resetOverScrollNotificationState() {
        this.overScrollTopNotified = false;
        this.overScrollBottomNotified = false;
    }
}
