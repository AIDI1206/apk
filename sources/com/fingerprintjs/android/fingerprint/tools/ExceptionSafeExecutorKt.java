package com.fingerprintjs.android.fingerprint.tools;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.medicmedia.medilink.domain.QueryParameterKey;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExceptionSafeExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"executeSafe", ExifInterface.GPS_DIRECTION_TRUE, QueryParameterKey.CODE, "Lkotlin/Function0;", "defaultValue", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ExceptionSafeExecutorKt {
    @Deprecated(message = DeprecationMessages.UTIL_UNINTENDED_PUBLIC_API)
    public static final <T> T executeSafe(Function0<? extends T> code, T t) {
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            return code.invoke();
        } catch (Throwable unused) {
            return t;
        }
    }
}
