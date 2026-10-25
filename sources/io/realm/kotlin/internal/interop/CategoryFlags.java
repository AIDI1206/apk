package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/realm/kotlin/internal/interop/CategoryFlags;", "", "categoryFlags", "", "<init>", "(I)V", "getCategoryFlags", "()I", "description", "", "getDescription", "()Ljava/lang/String;", "contains", "", "category", "Lio/realm/kotlin/internal/interop/ErrorCategory;", "component1", "copy", "equals", "other", "hashCode", "toString", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CategoryFlags {
    private final int categoryFlags;
    private final String description;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<ErrorCategory> CATEGORY_ORDER = CollectionsKt.listOf((Object[]) new ErrorCategory[]{ErrorCategory.RLM_ERR_CAT_CUSTOM_ERROR, ErrorCategory.RLM_ERR_CAT_WEBSOCKET_ERROR, ErrorCategory.RLM_ERR_CAT_SYNC_ERROR, ErrorCategory.RLM_ERR_CAT_SERVICE_ERROR, ErrorCategory.RLM_ERR_CAT_JSON_ERROR, ErrorCategory.RLM_ERR_CAT_CLIENT_ERROR, ErrorCategory.RLM_ERR_CAT_SYSTEM_ERROR, ErrorCategory.RLM_ERR_CAT_FILE_ACCESS, ErrorCategory.RLM_ERR_CAT_HTTP_ERROR, ErrorCategory.RLM_ERR_CAT_INVALID_ARG, ErrorCategory.RLM_ERR_CAT_APP_ERROR, ErrorCategory.RLM_ERR_CAT_LOGIC, ErrorCategory.RLM_ERR_CAT_RUNTIME});

    public static /* synthetic */ CategoryFlags copy$default(CategoryFlags categoryFlags, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = categoryFlags.categoryFlags;
        }
        return categoryFlags.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCategoryFlags() {
        return this.categoryFlags;
    }

    public final CategoryFlags copy(int categoryFlags) {
        return new CategoryFlags(categoryFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CategoryFlags) && this.categoryFlags == ((CategoryFlags) other).categoryFlags;
    }

    public int hashCode() {
        return Integer.hashCode(this.categoryFlags);
    }

    public String toString() {
        return "CategoryFlags(categoryFlags=" + this.categoryFlags + ')';
    }

    public CategoryFlags(int i) {
        Object next;
        String description;
        this.categoryFlags = i;
        Iterator<T> it = CATEGORY_ORDER.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!contains((ErrorCategory) next));
        ErrorCategory errorCategory = (ErrorCategory) next;
        this.description = (errorCategory == null || (description = errorCategory.getDescription()) == null) ? String.valueOf(this.categoryFlags) : description;
    }

    public final int getCategoryFlags() {
        return this.categoryFlags;
    }

    /* JADX INFO: compiled from: CoreError.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/CategoryFlags$Companion;", "", "<init>", "()V", "CATEGORY_ORDER", "", "Lio/realm/kotlin/internal/interop/ErrorCategory;", "getCATEGORY_ORDER", "()Ljava/util/List;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<ErrorCategory> getCATEGORY_ORDER() {
            return CategoryFlags.CATEGORY_ORDER;
        }
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean contains(ErrorCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return (category.getNativeValue() & this.categoryFlags) != 0;
    }
}
