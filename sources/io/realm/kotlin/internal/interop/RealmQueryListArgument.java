package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/RealmQueryListArgument;", "Lio/realm/kotlin/internal/interop/RealmQueryArgument;", "arguments", "Lio/realm/kotlin/internal/interop/RealmValueList;", "<init>", "(Lio/realm/kotlin/internal/interop/RealmValueList;)V", "getArguments", "()Lio/realm/kotlin/internal/interop/RealmValueList;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmQueryListArgument implements RealmQueryArgument {
    private final RealmValueList arguments;

    public RealmQueryListArgument(RealmValueList arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.arguments = arguments;
    }

    public final RealmValueList getArguments() {
        return this.arguments;
    }
}
