package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmChangesT;
import io.realm.kotlin.notifications.ListChangeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionChangeSetBuilderImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lio/realm/kotlin/internal/ListChangeSetBuilderImpl;", "Lio/realm/kotlin/internal/CollectionChangeSetBuilderImpl;", "Lio/realm/kotlin/notifications/ListChangeSet;", "change", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmChangesT;", "Lio/realm/kotlin/internal/interop/RealmChangesPointer;", "<init>", "(Lio/realm/kotlin/internal/interop/NativePointer;)V", "build", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ListChangeSetBuilderImpl extends CollectionChangeSetBuilderImpl<ListChangeSet> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListChangeSetBuilderImpl(NativePointer<RealmChangesT> change) {
        super(change);
        Intrinsics.checkNotNullParameter(change, "change");
    }

    @Override // io.realm.kotlin.internal.interop.CollectionChangeSetBuilder
    public ListChangeSet build() {
        return new ListChangeSet(this) { // from class: io.realm.kotlin.internal.ListChangeSetBuilderImpl.build.1
            private final ListChangeSet.Range[] changeRanges;
            private final int[] changes;
            private final ListChangeSet.Range[] deletionRanges;
            private final int[] deletions;
            private final ListChangeSet.Range[] insertionRanges;
            private final int[] insertions;

            {
                this.deletions = this.getDeletionIndices();
                this.insertions = this.getInsertionIndices();
                this.changes = this.getModificationIndicesAfter();
                this.deletionRanges = this.getDeletionRanges();
                this.insertionRanges = this.getInsertionRanges();
                this.changeRanges = this.getModificationRangesAfter();
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public int[] getDeletions() {
                return this.deletions;
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public int[] getInsertions() {
                return this.insertions;
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public int[] getChanges() {
                return this.changes;
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public ListChangeSet.Range[] getDeletionRanges() {
                return this.deletionRanges;
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public ListChangeSet.Range[] getInsertionRanges() {
                return this.insertionRanges;
            }

            @Override // io.realm.kotlin.notifications.ListChangeSet
            public ListChangeSet.Range[] getChangeRanges() {
                return this.changeRanges;
            }
        };
    }
}
