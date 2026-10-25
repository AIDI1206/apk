package io.realm.kotlin.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.query.RealmResults;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: BacklinksDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH¦\u0002¨\u0006\n"}, d2 = {"Lio/realm/kotlin/types/BacklinksDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "", "getValue", "Lio/realm/kotlin/query/RealmResults;", TypedValues.Custom.S_REFERENCE, "Lio/realm/kotlin/types/RealmObject;", "targetProperty", "Lkotlin/reflect/KProperty;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BacklinksDelegate<T extends BaseRealmObject> {
    RealmResults<T> getValue(RealmObject reference, KProperty<?> targetProperty);
}
