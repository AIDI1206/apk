package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmObjectInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\"\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/RealmObjectInternal;", "Lio/realm/kotlin/types/BaseRealmObject;", "io_realm_kotlin_objectReference", "Lio/realm/kotlin/internal/RealmObjectReference;", "getIo_realm_kotlin_objectReference", "()Lio/realm/kotlin/internal/RealmObjectReference;", "setIo_realm_kotlin_objectReference", "(Lio/realm/kotlin/internal/RealmObjectReference;)V", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmObjectInternal extends BaseRealmObject {
    RealmObjectReference<? extends BaseRealmObject> getIo_realm_kotlin_objectReference();

    void setIo_realm_kotlin_objectReference(RealmObjectReference<? extends BaseRealmObject> realmObjectReference);
}
