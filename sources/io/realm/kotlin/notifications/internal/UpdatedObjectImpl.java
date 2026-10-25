package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.notifications.UpdatedObject;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedObjectImpl;", "O", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/notifications/UpdatedObject;", "obj", "changedFields", "", "", "<init>", "(Lio/realm/kotlin/types/BaseRealmObject;[Ljava/lang/String;)V", "getObj", "()Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/types/BaseRealmObject;", "getChangedFields", "()[Ljava/lang/String;", "[Ljava/lang/String;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedObjectImpl<O extends BaseRealmObject> implements UpdatedObject<O> {
    private final String[] changedFields;
    private final O obj;

    public UpdatedObjectImpl(O obj, String[] changedFields) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(changedFields, "changedFields");
        this.obj = obj;
        this.changedFields = changedFields;
    }

    @Override // io.realm.kotlin.notifications.UpdatedObject
    public boolean isFieldChanged(String str) {
        return UpdatedObject.DefaultImpls.isFieldChanged(this, str);
    }

    @Override // io.realm.kotlin.notifications.UpdatedObject, io.realm.kotlin.notifications.ObjectChange, io.realm.kotlin.notifications.SingleQueryChange
    public O getObj() {
        return this.obj;
    }

    @Override // io.realm.kotlin.notifications.UpdatedObject
    public String[] getChangedFields() {
        return this.changedFields;
    }
}
