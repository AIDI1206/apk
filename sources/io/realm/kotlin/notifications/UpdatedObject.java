package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/notifications/UpdatedObject;", "O", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/notifications/ObjectChange;", "obj", "getObj", "()Lio/realm/kotlin/types/BaseRealmObject;", "changedFields", "", "", "getChangedFields", "()[Ljava/lang/String;", "isFieldChanged", "", "fieldName", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface UpdatedObject<O extends BaseRealmObject> extends ObjectChange<O> {
    String[] getChangedFields();

    @Override // io.realm.kotlin.notifications.ObjectChange, io.realm.kotlin.notifications.SingleQueryChange
    O getObj();

    boolean isFieldChanged(String fieldName);

    /* JADX INFO: compiled from: ObjectChange.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        public static <O extends BaseRealmObject> boolean isFieldChanged(UpdatedObject<O> updatedObject, String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            for (String str : updatedObject.getChangedFields()) {
                if (Intrinsics.areEqual(str, fieldName)) {
                    if (str != null) {
                        return true;
                    }
                    return false;
                }
            }
            str = null;
            if (str != null) {
                return true;
            }
            return false;
        }
    }
}
