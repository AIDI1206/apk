package androidx.compose.ui.input.nestedscroll;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 1}, l = {115, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "onPreFling-QWom1Mo", n = {"available", "parentPreConsumed"}, s = {"J$0", "J$0"})
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1222onPreFlingQWom1Mo(0L, this);
    }
}
