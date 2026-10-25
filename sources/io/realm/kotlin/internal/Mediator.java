package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Mediator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H&¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/Mediator;", "", "createInstanceOf", "Lio/realm/kotlin/internal/RealmObjectInternal;", "clazz", "Lkotlin/reflect/KClass;", "Lio/realm/kotlin/types/BaseRealmObject;", "companionOf", "Lio/realm/kotlin/internal/RealmObjectCompanion;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Mediator {
    RealmObjectCompanion companionOf(KClass<? extends BaseRealmObject> clazz);

    RealmObjectInternal createInstanceOf(KClass<? extends BaseRealmObject> clazz);
}
