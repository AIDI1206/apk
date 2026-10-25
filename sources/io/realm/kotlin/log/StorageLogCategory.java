package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003J\u0013\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\u0017\u001a\u00020\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006¨\u0006\u001c"}, d2 = {"Lio/realm/kotlin/log/StorageLogCategory;", "Lio/realm/kotlin/log/LogCategory;", "<init>", "()V", "Transaction", "getTransaction", "()Lio/realm/kotlin/log/LogCategory;", "Query", "getQuery", "Object", "getObject", "Notification", "getNotification", "contains", "", "element", "equals", "other", "", "hashCode", "", "toString", "", "name", "getName", "()Ljava/lang/String;", "parent", "getParent", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class StorageLogCategory implements LogCategory {
    private final /* synthetic */ LogCategory $$delegate_0 = LogUtilsKt.newCategory("Storage", RealmLogCategory.INSTANCE);
    public static final StorageLogCategory INSTANCE = new StorageLogCategory();
    private static final LogCategory Transaction = TransactionLogCategory.INSTANCE;
    private static final LogCategory Query = QueryLogCategory.INSTANCE;
    private static final LogCategory Object = ObjectLogCategory.INSTANCE;
    private static final LogCategory Notification = NotificationLogCategory.INSTANCE;

    @Override // io.realm.kotlin.log.LogCategory
    public boolean contains(LogCategory element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.$$delegate_0.contains(element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageLogCategory)) {
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
        return -2033216105;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String toString() {
        return this.$$delegate_0.toString();
    }

    private StorageLogCategory() {
    }

    public final LogCategory getTransaction() {
        return Transaction;
    }

    public final LogCategory getQuery() {
        return Query;
    }

    public final LogCategory getObject() {
        return Object;
    }

    public final LogCategory getNotification() {
        return Notification;
    }
}
