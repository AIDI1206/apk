package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: BaselineShift.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/BaselineShift;", TtmlNode.START, "stop", "fraction", "", "lerp-jWV1Mfo", "(FFF)F", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BaselineShiftKt {
    /* JADX INFO: renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m8444lerpjWV1Mfo(float f, float f2, float f3) {
        return BaselineShift.m8432constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }
}
