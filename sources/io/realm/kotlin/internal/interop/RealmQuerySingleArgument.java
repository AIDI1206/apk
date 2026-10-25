package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/RealmQuerySingleArgument;", "Lio/realm/kotlin/internal/interop/RealmQueryArgument;", "argument", "Lio/realm/kotlin/internal/interop/RealmValue;", "<init>", "(Lio/realm/kotlin/internal/interop/realm_value_t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArgument-uWG8uMY", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/realm_value_t;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmQuerySingleArgument implements RealmQueryArgument {
    private final realm_value_t argument;

    public /* synthetic */ RealmQuerySingleArgument(realm_value_t realm_value_tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(realm_value_tVar);
    }

    private RealmQuerySingleArgument(realm_value_t argument) {
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.argument = argument;
    }

    /* JADX INFO: renamed from: getArgument-uWG8uMY, reason: not valid java name and from getter */
    public final realm_value_t getArgument() {
        return this.argument;
    }
}
