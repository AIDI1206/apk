package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.notifications.InitialObject;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/realm/kotlin/notifications/internal/InitialObjectImpl;", "O", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/notifications/InitialObject;", "obj", "<init>", "(Lio/realm/kotlin/types/BaseRealmObject;)V", "getObj", "()Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/types/BaseRealmObject;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class InitialObjectImpl<O extends BaseRealmObject> implements InitialObject<O> {
    private final O obj;

    public InitialObjectImpl(O obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.obj = obj;
    }

    @Override // io.realm.kotlin.notifications.InitialObject, io.realm.kotlin.notifications.ObjectChange, io.realm.kotlin.notifications.SingleQueryChange
    public O getObj() {
        return this.obj;
    }
}
