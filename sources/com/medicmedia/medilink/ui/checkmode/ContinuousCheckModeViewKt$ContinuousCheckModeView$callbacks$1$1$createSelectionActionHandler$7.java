package com.medicmedia.medilink.ui.checkmode;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ContinuousCheckModeView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.medicmedia.medilink.ui.checkmode.ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7", f = "ContinuousCheckModeView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7(Continuation<? super ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ContinuousCheckModeViewKt$ContinuousCheckModeView$callbacks$1$1$createSelectionActionHandler$7) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
