package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteItemTagType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/data/model/NoteItemTagType;", "", "BookMark", "Memo", "Marker", "Lcom/medicmedia/medilink/data/model/NoteItemTagType$BookMark;", "Lcom/medicmedia/medilink/data/model/NoteItemTagType$Marker;", "Lcom/medicmedia/medilink/data/model/NoteItemTagType$Memo;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface NoteItemTagType {

    /* JADX INFO: compiled from: NoteItemTagType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/data/model/NoteItemTagType$BookMark;", "Lcom/medicmedia/medilink/data/model/NoteItemTagType;", "<init>", "()V", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class BookMark implements NoteItemTagType {
        public static final BookMark INSTANCE = new BookMark();

        private BookMark() {
        }
    }

    /* JADX INFO: compiled from: NoteItemTagType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/data/model/NoteItemTagType$Memo;", "Lcom/medicmedia/medilink/data/model/NoteItemTagType;", "<init>", "()V", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Memo implements NoteItemTagType {
        public static final Memo INSTANCE = new Memo();

        private Memo() {
        }
    }

    /* JADX INFO: compiled from: NoteItemTagType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/data/model/NoteItemTagType$Marker;", "Lcom/medicmedia/medilink/data/model/NoteItemTagType;", "documentPath", "", "<init>", "(Ljava/lang/String;)V", "getDocumentPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Marker implements NoteItemTagType {
        private final String documentPath;

        public static /* synthetic */ Marker copy$default(Marker marker, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marker.documentPath;
            }
            return marker.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocumentPath() {
            return this.documentPath;
        }

        public final Marker copy(String documentPath) {
            return new Marker(documentPath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Marker) && Intrinsics.areEqual(this.documentPath, ((Marker) other).documentPath);
        }

        public int hashCode() {
            String str = this.documentPath;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Marker(documentPath=" + this.documentPath + ")";
        }

        public Marker(String str) {
            this.documentPath = str;
        }

        public final String getDocumentPath() {
            return this.documentPath;
        }
    }
}
