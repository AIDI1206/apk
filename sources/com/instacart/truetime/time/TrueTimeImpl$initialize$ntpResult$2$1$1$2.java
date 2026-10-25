package com.instacart.truetime.time;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TrueTimeImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0016\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.instacart.truetime.time.TrueTimeImpl$initialize$ntpResult$2$1$1$2", f = "TrueTimeImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class TrueTimeImpl$initialize$ntpResult$2$1$1$2 extends SuspendLambda implements Function2<long[], Continuation<? super long[]>, Object> {
    /* synthetic */ Object L$0;
    int label;

    TrueTimeImpl$initialize$ntpResult$2$1$1$2(Continuation<? super TrueTimeImpl$initialize$ntpResult$2$1$1$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrueTimeImpl$initialize$ntpResult$2$1$1$2 trueTimeImpl$initialize$ntpResult$2$1$1$2 = new TrueTimeImpl$initialize$ntpResult$2$1$1$2(continuation);
        trueTimeImpl$initialize$ntpResult$2$1$1$2.L$0 = obj;
        return trueTimeImpl$initialize$ntpResult$2$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(long[] jArr, Continuation<? super long[]> continuation) {
        return ((TrueTimeImpl$initialize$ntpResult$2$1$1$2) create(jArr, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return (long[]) this.L$0;
    }
}
