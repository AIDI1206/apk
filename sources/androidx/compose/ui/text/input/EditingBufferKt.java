package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m8302updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM8133getLengthimpl;
        int iM8135getMinimpl = TextRange.m8135getMinimpl(j);
        int iM8134getMaximpl = TextRange.m8134getMaximpl(j);
        if (TextRange.m8139intersects5zctL8(j2, j)) {
            if (TextRange.m8127contains5zctL8(j2, j)) {
                iM8135getMinimpl = TextRange.m8135getMinimpl(j2);
                iM8134getMaximpl = iM8135getMinimpl;
            } else {
                if (TextRange.m8127contains5zctL8(j, j2)) {
                    iM8133getLengthimpl = TextRange.m8133getLengthimpl(j2);
                } else if (TextRange.m8128containsimpl(j2, iM8135getMinimpl)) {
                    iM8135getMinimpl = TextRange.m8135getMinimpl(j2);
                    iM8133getLengthimpl = TextRange.m8133getLengthimpl(j2);
                } else {
                    iM8134getMaximpl = TextRange.m8135getMinimpl(j2);
                }
                iM8134getMaximpl -= iM8133getLengthimpl;
            }
        } else if (iM8134getMaximpl > TextRange.m8135getMinimpl(j2)) {
            iM8135getMinimpl -= TextRange.m8133getLengthimpl(j2);
            iM8133getLengthimpl = TextRange.m8133getLengthimpl(j2);
            iM8134getMaximpl -= iM8133getLengthimpl;
        }
        return TextRangeKt.TextRange(iM8135getMinimpl, iM8134getMaximpl);
    }
}
