package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.model.BookShelfSortType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: BookShelfSort.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfSort;", "", "value", "", "getValue", "()I", "User", "Category", "Companion", "Lcom/medicmedia/medilink/domain/model/BookShelfSort$Category;", "Lcom/medicmedia/medilink/domain/model/BookShelfSort$User;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface BookShelfSort {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String OLD_ARCHIVE = "旧版アーカイブ";

    int getValue();

    /* JADX INFO: compiled from: BookShelfSort.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfSort$User;", "Lcom/medicmedia/medilink/domain/model/BookShelfSort;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class User implements BookShelfSort {
        public static final User INSTANCE = new User();

        private User() {
        }

        @Override // com.medicmedia.medilink.domain.model.BookShelfSort
        public int getValue() {
            return DefaultImpls.getValue(this);
        }
    }

    /* JADX INFO: compiled from: BookShelfSort.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfSort$Category;", "Lcom/medicmedia/medilink/domain/model/BookShelfSort;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Category implements BookShelfSort {
        public static final Category INSTANCE = new Category();

        private Category() {
        }

        @Override // com.medicmedia.medilink.domain.model.BookShelfSort
        public int getValue() {
            return DefaultImpls.getValue(this);
        }
    }

    /* JADX INFO: compiled from: BookShelfSort.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static int getValue(BookShelfSort bookShelfSort) {
            if (bookShelfSort instanceof User) {
                return BookShelfSortType.USER.getValue();
            }
            if (bookShelfSort instanceof Category) {
                return BookShelfSortType.CATEGORY.getValue();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: BookShelfSort.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookShelfSort$Companion;", "", "<init>", "()V", "OLD_ARCHIVE", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String OLD_ARCHIVE = "旧版アーカイブ";

        private Companion() {
        }
    }
}
