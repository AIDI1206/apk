package io.realm.kotlin.query;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmScalarQuery.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0007\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"find", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/query/RealmScalarQuery;", "block", "Lkotlin/Function1;", "(Lio/realm/kotlin/query/RealmScalarQuery;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/query/RealmSingleQuery;", "(Lio/realm/kotlin/query/RealmSingleQuery;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmScalarQueryKt {
    public static final <T, R> R find(RealmScalarQuery<T> realmScalarQuery, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(realmScalarQuery, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(realmScalarQuery.find());
    }

    public static final <T extends BaseRealmObject, R> R find(RealmSingleQuery<T> realmSingleQuery, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(realmSingleQuery, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(realmSingleQuery.find());
    }
}
