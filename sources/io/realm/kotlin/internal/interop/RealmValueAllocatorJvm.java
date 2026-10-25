package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MemAllocator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"inputScope", "R", "block", "Lkotlin/Function1;", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "cinterop_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmValueAllocatorJvm {
    public static final <R> R inputScope(Function1<? super MemTrackingAllocator, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        JvmMemTrackingAllocator jvmMemTrackingAllocator = new JvmMemTrackingAllocator();
        R rInvoke = block.invoke(jvmMemTrackingAllocator);
        jvmMemTrackingAllocator.free();
        return rInvoke;
    }
}
