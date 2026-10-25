package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0096\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0001R\u0012\u0010\u000e\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/log/QueryLogCategory;", "Lio/realm/kotlin/log/LogCategory;", "<init>", "()V", "contains", "", "element", "equals", "other", "", "hashCode", "", "toString", "", "name", "getName", "()Ljava/lang/String;", "parent", "getParent", "()Lio/realm/kotlin/log/LogCategory;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class QueryLogCategory implements LogCategory {
    public static final QueryLogCategory INSTANCE = new QueryLogCategory();
    private final /* synthetic */ LogCategory $$delegate_0 = LogUtilsKt.newCategory("Query", StorageLogCategory.INSTANCE);

    @Override // io.realm.kotlin.log.LogCategory
    public boolean contains(LogCategory element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.$$delegate_0.contains(element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryLogCategory)) {
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
        return 1057794346;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String toString() {
        return this.$$delegate_0.toString();
    }

    private QueryLogCategory() {
    }
}
