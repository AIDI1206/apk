package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativePointer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\t\u0012\u0004\u0012\u0002H\u00060\u000b¢\u0006\u0002\u0010\f\"\u0018\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"POINTER_DELETED_ERROR", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "getPOINTER_DELETED_ERROR", "()Ljava/lang/IllegalStateException;", "use", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/interop/CapiT;", "Lio/realm/kotlin/internal/interop/NativePointer;", "block", "Lkotlin/Function1;", "(Lio/realm/kotlin/internal/interop/NativePointer;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "cinterop_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class NativePointerKt {
    private static final IllegalStateException POINTER_DELETED_ERROR = new IllegalStateException("Cannot perform this operation on an invalid/deleted reference.");

    public static final IllegalStateException getPOINTER_DELETED_ERROR() {
        return POINTER_DELETED_ERROR;
    }

    public static final <T extends CapiT, R> R use(NativePointer<T> nativePointer, Function1<? super NativePointer<T>, ? extends R> block) {
        Intrinsics.checkNotNullParameter(nativePointer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(nativePointer);
        } finally {
            nativePointer.release();
        }
    }
}
