package io.realm.kotlin.dynamic;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.query.RealmResults;
import io.realm.kotlin.types.BaseRealmObject;
import io.realm.kotlin.types.RealmDictionary;
import io.realm.kotlin.types.RealmList;
import io.realm.kotlin.types.RealmSet;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: DynamicRealmObject.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&¢\u0006\u0002\u0010\fJ/\u0010\r\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&¢\u0006\u0002\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H&J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0010\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J0\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0010\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J\u0018\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00102\u0006\u0010\t\u001a\u00020\u0003H&J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0014\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J0\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0014\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J\u0018\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00142\u0006\u0010\t\u001a\u00020\u0003H&J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J0\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0018\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&J\u001a\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u00182\u0006\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001c2\u0006\u0010\t\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, d2 = {"Lio/realm/kotlin/dynamic/DynamicRealmObject;", "Lio/realm/kotlin/types/BaseRealmObject;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()Ljava/lang/String;", "getValue", ExifInterface.GPS_DIRECTION_TRUE, "", "propertyName", "clazz", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getNullableValue", "getObject", "getValueList", "Lio/realm/kotlin/types/RealmList;", "getNullableValueList", "getObjectList", "getValueSet", "Lio/realm/kotlin/types/RealmSet;", "getNullableValueSet", "getObjectSet", "getValueDictionary", "Lio/realm/kotlin/types/RealmDictionary;", "getNullableValueDictionary", "getObjectDictionary", "getBacklinks", "Lio/realm/kotlin/query/RealmResults;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DynamicRealmObject extends BaseRealmObject {
    RealmResults<? extends DynamicRealmObject> getBacklinks(String propertyName);

    <T> T getNullableValue(String propertyName, KClass<T> clazz);

    <T> RealmDictionary<T> getNullableValueDictionary(String propertyName, KClass<T> clazz);

    <T> RealmList<T> getNullableValueList(String propertyName, KClass<T> clazz);

    <T> RealmSet<T> getNullableValueSet(String propertyName, KClass<T> clazz);

    DynamicRealmObject getObject(String propertyName);

    RealmDictionary<? extends DynamicRealmObject> getObjectDictionary(String propertyName);

    RealmList<? extends DynamicRealmObject> getObjectList(String propertyName);

    RealmSet<? extends DynamicRealmObject> getObjectSet(String propertyName);

    String getType();

    <T> T getValue(String propertyName, KClass<T> clazz);

    <T> RealmDictionary<T> getValueDictionary(String propertyName, KClass<T> clazz);

    <T> RealmList<T> getValueList(String propertyName, KClass<T> clazz);

    <T> RealmSet<T> getValueSet(String propertyName, KClass<T> clazz);
}
