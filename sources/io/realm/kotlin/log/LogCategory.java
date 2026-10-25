package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H¦\u0002J\b\u0010\f\u001a\u00020\u0006H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0010\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/log/LogCategory;", "", "parent", "getParent", "()Lio/realm/kotlin/log/LogCategory;", "name", "", "getName", "()Ljava/lang/String;", "contains", "", "element", "toString", "Companion", "Lio/realm/kotlin/log/AppLogCategory;", "Lio/realm/kotlin/log/ChangesetLogCategory;", "Lio/realm/kotlin/log/ClientLogCategory;", "Lio/realm/kotlin/log/LogCategoryImpl;", "Lio/realm/kotlin/log/NetworkLogCategory;", "Lio/realm/kotlin/log/NotificationLogCategory;", "Lio/realm/kotlin/log/ObjectLogCategory;", "Lio/realm/kotlin/log/QueryLogCategory;", "Lio/realm/kotlin/log/RealmLogCategory;", "Lio/realm/kotlin/log/ResetLogCategory;", "Lio/realm/kotlin/log/SdkLogCategory;", "Lio/realm/kotlin/log/ServerLogCategory;", "Lio/realm/kotlin/log/SessionLogCategory;", "Lio/realm/kotlin/log/StorageLogCategory;", "Lio/realm/kotlin/log/SyncLogCategory;", "Lio/realm/kotlin/log/TransactionLogCategory;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LogCategory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean contains(LogCategory element);

    String getName();

    LogCategory getParent();

    String toString();

    /* JADX INFO: compiled from: LogCategory.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lio/realm/kotlin/log/LogCategory$Companion;", "", "<init>", "()V", "Realm", "Lio/realm/kotlin/log/RealmLogCategory;", "getRealm", "()Lio/realm/kotlin/log/RealmLogCategory;", "fromCoreValue", "Lio/realm/kotlin/log/LogCategory;", "categoryPath", "", "fromCoreValue$io_realm_kotlin_library", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final RealmLogCategory Realm = RealmLogCategory.INSTANCE;

        private Companion() {
        }

        public final RealmLogCategory getRealm() {
            return Realm;
        }

        public final LogCategory fromCoreValue$io_realm_kotlin_library(String categoryPath) {
            Intrinsics.checkNotNullParameter(categoryPath, "categoryPath");
            LogCategory logCategory = LogUtilsKt.getCategoriesByPath().get(categoryPath);
            Intrinsics.checkNotNull(logCategory);
            return logCategory;
        }
    }
}
