package io.realm.kotlin.log;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.zeroturnaround.zip.commons.FilenameUtils;

/* JADX INFO: compiled from: LogCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/log/LogCategoryImpl;", "Lio/realm/kotlin/log/LogCategory;", "name", "", "parent", "<init>", "(Ljava/lang/String;Lio/realm/kotlin/log/LogCategory;)V", "getName", "()Ljava/lang/String;", "getParent", "()Lio/realm/kotlin/log/LogCategory;", "contains", "", "element", "toString", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogCategoryImpl implements LogCategory {
    private final String name;
    private final LogCategory parent;

    public LogCategoryImpl(String name, LogCategory logCategory) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.parent = logCategory;
    }

    public /* synthetic */ LogCategoryImpl(String str, LogCategory logCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : logCategory);
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String getName() {
        return this.name;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public LogCategory getParent() {
        return this.parent;
    }

    @Override // io.realm.kotlin.log.LogCategory
    public boolean contains(LogCategory element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return StringsKt.contains$default((CharSequence) String.valueOf(element), (CharSequence) String.valueOf(this), false, 2, (Object) null);
    }

    @Override // io.realm.kotlin.log.LogCategory
    public String toString() {
        return getParent() != null ? getParent() + FilenameUtils.EXTENSION_SEPARATOR + getName() : getName();
    }
}
