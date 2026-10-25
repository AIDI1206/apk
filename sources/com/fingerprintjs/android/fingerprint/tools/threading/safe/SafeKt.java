package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.fingerprintjs.android.fingerprint.tools.threading.SharedExecutorKt;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Safe.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"safe", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeWithTimeout", "timeoutMs", "", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SafeKt {
    public static final <T> Object safe(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11499constructorimpl(block.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static /* synthetic */ Object safeWithTimeout$default(long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return safeWithTimeout(j, function0);
    }

    public static final <T> Object safeWithTimeout(long j, final Function0<? extends T> block) {
        Object objM11499constructorimpl;
        Object objM11499constructorimpl2;
        StackTraceElement[] stackTrace;
        Intrinsics.checkNotNullParameter(block, "block");
        List listFilterNotNull = null;
        final AtomicReference atomicReference = new AtomicReference(null);
        if (Safe.INSTANCE.getInsideSafeWithTimeout$fingerprint_release()) {
            Safe.INSTANCE.logIllegalSafeWithTimeoutUsage$fingerprint_release();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Future<T> futureSubmit = SharedExecutorKt.getSharedExecutor().submit(new Callable() { // from class: com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SafeKt.safeWithTimeout$lambda$1$lambda$0(atomicReference, block);
                }
            });
            Intrinsics.checkNotNull(futureSubmit);
            objM11499constructorimpl = Result.m11499constructorimpl(futureSubmit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(objM11499constructorimpl);
        if (thM11502exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11499constructorimpl(ResultKt.createFailure(thM11502exceptionOrNullimpl));
        }
        Future future = (Future) objM11499constructorimpl;
        try {
            Result.Companion companion4 = Result.INSTANCE;
            objM11499constructorimpl2 = Result.m11499constructorimpl(future.get(j, TimeUnit.MILLISECONDS));
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            objM11499constructorimpl2 = Result.m11499constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM11502exceptionOrNullimpl2 = Result.m11502exceptionOrNullimpl(objM11499constructorimpl2);
        if (thM11502exceptionOrNullimpl2 != null) {
            try {
                Result.Companion companion6 = Result.INSTANCE;
                if (thM11502exceptionOrNullimpl2 instanceof TimeoutException) {
                    TimeoutException timeoutException = (TimeoutException) thM11502exceptionOrNullimpl2;
                    Thread thread = (Thread) atomicReference.get();
                    if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                        Intrinsics.checkNotNull(stackTrace);
                        listFilterNotNull = ArraysKt.filterNotNull(stackTrace);
                    }
                    throw new ExecutionTimeoutException(timeoutException, listFilterNotNull);
                }
                throw thM11502exceptionOrNullimpl2;
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.INSTANCE;
                objM11499constructorimpl2 = Result.m11499constructorimpl(ResultKt.createFailure(th3));
            }
        }
        if (Result.m11502exceptionOrNullimpl(objM11499constructorimpl2) != null) {
            try {
                Result.Companion companion8 = Result.INSTANCE;
                Result.m11499constructorimpl(Boolean.valueOf(future.cancel(true)));
            } catch (Throwable th4) {
                Result.Companion companion9 = Result.INSTANCE;
                Result.m11499constructorimpl(ResultKt.createFailure(th4));
            }
        }
        return objM11499constructorimpl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object safeWithTimeout$lambda$1$lambda$0(AtomicReference executionThread, Function0 block) {
        Intrinsics.checkNotNullParameter(executionThread, "$executionThread");
        Intrinsics.checkNotNullParameter(block, "$block");
        Safe.INSTANCE.markInsideSafeWithTimeout$fingerprint_release();
        executionThread.set(Thread.currentThread());
        try {
            return block.invoke();
        } finally {
            Safe.INSTANCE.clearInsideSafeWithTimeout$fingerprint_release();
        }
    }
}
