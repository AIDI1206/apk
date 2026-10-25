package com.medicmedia.medilink.database.realm;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.query.Sort;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toRealmKotlinSort", "Lio/realm/kotlin/query/Sort;", "database_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmDatabaseKt {

    /* JADX INFO: compiled from: RealmDatabase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Sort.values().length];
            try {
                iArr[Sort.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Sort.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Sort toRealmKotlinSort(Sort sort) {
        Intrinsics.checkNotNullParameter(sort, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sort.ordinal()];
        if (i == 1) {
            return Sort.ASCENDING;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Sort.DESCENDING;
    }
}
