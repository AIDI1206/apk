package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.net.HttpHeaders;
import io.realm.kotlin.internal.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0096\u0003J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0015\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lio/realm/kotlin/log/SyncLogCategory;", "Lio/realm/kotlin/log/LogCategory;", "<init>", "()V", "Client", "Lio/realm/kotlin/log/ClientLogCategory;", "getClient", "()Lio/realm/kotlin/log/ClientLogCategory;", HttpHeaders.SERVER, "getServer", "()Lio/realm/kotlin/log/LogCategory;", "contains", "", "element", "equals", "other", "", "hashCode", "", "toString", "", "name", "getName", "()Ljava/lang/String;", "parent", "getParent", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SyncLogCategory implements LogCategory {
    private final /* synthetic */ LogCategory $$delegate_0 = LogUtilsKt.newCategory("Sync", RealmLogCategory.INSTANCE);
    public static final SyncLogCategory INSTANCE = new SyncLogCategory();
    private static final ClientLogCategory Client = ClientLogCategory.INSTANCE;
    private static final LogCategory Server = ServerLogCategory.INSTANCE;

    @Override // io.realm.kotlin.log.LogCategory
    public boolean contains(LogCategory element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.$$delegate_0.contains(element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncLogCategory)) {
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
        return -1538166249;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String toString() {
        return this.$$delegate_0.toString();
    }

    private SyncLogCategory() {
    }

    public final ClientLogCategory getClient() {
        return Client;
    }

    public final LogCategory getServer() {
        return Server;
    }
}
