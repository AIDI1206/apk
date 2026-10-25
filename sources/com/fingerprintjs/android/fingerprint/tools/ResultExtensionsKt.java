package com.fingerprintjs.android.fingerprint.tools;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"flatten", "Lkotlin/Result;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ResultExtensionsKt {
    public static final <V> Object flatten(Object obj) {
        boolean zM11506isSuccessimpl = Result.m11506isSuccessimpl(obj);
        if (zM11506isSuccessimpl) {
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        if (zM11506isSuccessimpl) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion = Result.INSTANCE;
        Throwable thM11502exceptionOrNullimpl = Result.m11502exceptionOrNullimpl(obj);
        Intrinsics.checkNotNull(thM11502exceptionOrNullimpl);
        return Result.m11499constructorimpl(ResultKt.createFailure(thM11502exceptionOrNullimpl));
    }
}
