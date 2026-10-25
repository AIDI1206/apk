package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;

/* JADX INFO: compiled from: CollectionChangeSet.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/notifications/ListChangeSet;", "", "deletions", "", "getDeletions", "()[I", "insertions", "getInsertions", "changes", "getChanges", "deletionRanges", "", "Lio/realm/kotlin/notifications/ListChangeSet$Range;", "getDeletionRanges", "()[Lio/realm/kotlin/notifications/ListChangeSet$Range;", "insertionRanges", "getInsertionRanges", "changeRanges", "getChangeRanges", HttpHeaders.RANGE, "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ListChangeSet {
    Range[] getChangeRanges();

    int[] getChanges();

    Range[] getDeletionRanges();

    int[] getDeletions();

    Range[] getInsertionRanges();

    int[] getInsertions();

    /* JADX INFO: compiled from: CollectionChangeSet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/notifications/ListChangeSet$Range;", "", "startIndex", "", "length", "<init>", "(II)V", "getStartIndex", "()I", "getLength", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Range {
        private final int length;
        private final int startIndex;

        public static /* synthetic */ Range copy$default(Range range, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = range.startIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = range.length;
            }
            return range.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        public final Range copy(int startIndex, int length) {
            return new Range(startIndex, length);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return this.startIndex == range.startIndex && this.length == range.length;
        }

        public int hashCode() {
            return (Integer.hashCode(this.startIndex) * 31) + Integer.hashCode(this.length);
        }

        public String toString() {
            return "Range(startIndex=" + this.startIndex + ", length=" + this.length + ')';
        }

        public Range(int i, int i2) {
            this.startIndex = i;
            this.length = i2;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final int getLength() {
            return this.length;
        }
    }
}
