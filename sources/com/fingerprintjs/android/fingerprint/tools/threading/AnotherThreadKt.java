package com.fingerprintjs.android.fingerprint.tools.threading;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnotherThread.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"runOnAnotherThread", "Lkotlin/Result;", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnotherThreadKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnAnotherThread$lambda$1$lambda$0(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke();
    }

    public static final Object runOnAnotherThread(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedExecutorKt.getSharedExecutor().submit(new Runnable() { // from class: com.fingerprintjs.android.fingerprint.tools.threading.AnotherThreadKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AnotherThreadKt.runOnAnotherThread$lambda$1$lambda$0(block);
                }
            });
            return Result.m11499constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
    }
}
