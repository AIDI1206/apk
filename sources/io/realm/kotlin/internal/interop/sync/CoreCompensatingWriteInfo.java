package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.RealmValue;
import io.realm.kotlin.internal.interop.RealmValueKt;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreCompensatingWriteInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;", "", "reason", "", "objectName", "primaryKeyPtr", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getReason", "()Ljava/lang/String;", "getObjectName", "primaryKey", "Lio/realm/kotlin/internal/interop/RealmValue;", "getPrimaryKey-uWG8uMY", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/realm_value_t;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CoreCompensatingWriteInfo {
    private final String objectName;
    private final realm_value_t primaryKey;
    private final String reason;

    public CoreCompensatingWriteInfo(String reason, String objectName, long j) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(objectName, "objectName");
        this.reason = reason;
        this.objectName = objectName;
        this.primaryKey = RealmValue.m11450constructorimpl(RealmValueKt.wrapPtrAsRealmValueT(j));
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getObjectName() {
        return this.objectName;
    }

    /* JADX INFO: renamed from: getPrimaryKey-uWG8uMY, reason: not valid java name and from getter */
    public final realm_value_t getPrimaryKey() {
        return this.primaryKey;
    }
}
