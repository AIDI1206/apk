package androidx.compose.foundation.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H&J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextDragObserver;", "", "onDown", "", "point", "Landroidx/compose/ui/geometry/Offset;", "onDown-k-4lQ0M", "(J)V", "onUp", "onStart", "startPoint", "onStart-k-4lQ0M", "onDrag", "delta", "onDrag-k-4lQ0M", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface TextDragObserver {
    void onCancel();

    /* JADX INFO: renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo1642onDownk4lQ0M(long point);

    /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo1643onDragk4lQ0M(long delta);

    /* JADX INFO: renamed from: onStart-k-4lQ0M, reason: not valid java name */
    void mo1644onStartk4lQ0M(long startPoint);

    void onStop();

    void onUp();
}
