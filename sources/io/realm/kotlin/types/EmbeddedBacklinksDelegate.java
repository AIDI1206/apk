package io.realm.kotlin.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: BacklinksDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\"\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH¦\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lio/realm/kotlin/types/EmbeddedBacklinksDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "", "getValue", TypedValues.Custom.S_REFERENCE, "Lio/realm/kotlin/types/EmbeddedRealmObject;", "targetProperty", "Lkotlin/reflect/KProperty;", "(Lio/realm/kotlin/types/EmbeddedRealmObject;Lkotlin/reflect/KProperty;)Lio/realm/kotlin/types/BaseRealmObject;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface EmbeddedBacklinksDelegate<T extends BaseRealmObject> {
    T getValue(EmbeddedRealmObject reference, KProperty<?> targetProperty);
}
