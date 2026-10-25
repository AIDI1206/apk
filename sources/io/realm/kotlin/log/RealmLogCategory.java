package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0003J\u0013\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u001b\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lio/realm/kotlin/log/RealmLogCategory;", "Lio/realm/kotlin/log/LogCategory;", "<init>", "()V", "Storage", "Lio/realm/kotlin/log/StorageLogCategory;", "getStorage", "()Lio/realm/kotlin/log/StorageLogCategory;", "Sync", "Lio/realm/kotlin/log/SyncLogCategory;", "getSync", "()Lio/realm/kotlin/log/SyncLogCategory;", "App", "getApp", "()Lio/realm/kotlin/log/LogCategory;", "Sdk", "getSdk", "contains", "", "element", "equals", "other", "", "hashCode", "", "toString", "", "name", "getName", "()Ljava/lang/String;", "parent", "getParent", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RealmLogCategory implements LogCategory {
    private final /* synthetic */ LogCategory $$delegate_0 = LogUtilsKt.newCategory$default("Realm", null, 2, null);
    public static final RealmLogCategory INSTANCE = new RealmLogCategory();
    private static final StorageLogCategory Storage = StorageLogCategory.INSTANCE;
    private static final SyncLogCategory Sync = SyncLogCategory.INSTANCE;
    private static final LogCategory App = AppLogCategory.INSTANCE;
    private static final LogCategory Sdk = SdkLogCategory.INSTANCE;

    @Override // io.realm.kotlin.log.LogCategory
    public boolean contains(LogCategory element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.$$delegate_0.contains(element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealmLogCategory)) {
            return false;
        }
        return true;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String getName() {
        return this.$$delegate_0.getName();
    }

    @Override // io.realm.kotlin.log.LogCategory
    public LogCategory getParent() {
        return this.$$delegate_0.getParent();
    }

    public int hashCode() {
        return 134927619;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String toString() {
        return this.$$delegate_0.toString();
    }

    private RealmLogCategory() {
    }

    public final StorageLogCategory getStorage() {
        return Storage;
    }

    public final SyncLogCategory getSync() {
        return Sync;
    }

    public final LogCategory getApp() {
        return App;
    }

    public final LogCategory getSdk() {
        return Sdk;
    }
}
