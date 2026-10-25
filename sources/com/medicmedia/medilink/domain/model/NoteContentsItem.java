package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/NoteContentsItem;", "", BundleKey.TAG_ID, "", "fileName", "mode", "", "isLongClick", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getTagId", "()Ljava/lang/String;", "getFileName", "getMode", "()I", "()Z", "toUrlItem", "Lcom/medicmedia/medilink/domain/model/ContentsUrlItem;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteContentsItem {
    private final String fileName;
    private final boolean isLongClick;
    private final int mode;
    private final String tagId;

    public NoteContentsItem() {
        this(null, null, 0, false, 15, null);
    }

    public static /* synthetic */ NoteContentsItem copy$default(NoteContentsItem noteContentsItem, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noteContentsItem.tagId;
        }
        if ((i2 & 2) != 0) {
            str2 = noteContentsItem.fileName;
        }
        if ((i2 & 4) != 0) {
            i = noteContentsItem.mode;
        }
        if ((i2 & 8) != 0) {
            z = noteContentsItem.isLongClick;
        }
        return noteContentsItem.copy(str, str2, i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLongClick() {
        return this.isLongClick;
    }

    public final NoteContentsItem copy(String tagId, String fileName, int mode, boolean isLongClick) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new NoteContentsItem(tagId, fileName, mode, isLongClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteContentsItem)) {
            return false;
        }
        NoteContentsItem noteContentsItem = (NoteContentsItem) other;
        return Intrinsics.areEqual(this.tagId, noteContentsItem.tagId) && Intrinsics.areEqual(this.fileName, noteContentsItem.fileName) && this.mode == noteContentsItem.mode && this.isLongClick == noteContentsItem.isLongClick;
    }

    public int hashCode() {
        return (((((this.tagId.hashCode() * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.mode)) * 31) + Boolean.hashCode(this.isLongClick);
    }

    public String toString() {
        return "NoteContentsItem(tagId=" + this.tagId + ", fileName=" + this.fileName + ", mode=" + this.mode + ", isLongClick=" + this.isLongClick + ")";
    }

    public NoteContentsItem(String tagId, String fileName, int i, boolean z) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.tagId = tagId;
        this.fileName = fileName;
        this.mode = i;
        this.isLongClick = z;
    }

    public /* synthetic */ NoteContentsItem(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z);
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getMode() {
        return this.mode;
    }

    public final boolean isLongClick() {
        return this.isLongClick;
    }

    public final ContentsUrlItem toUrlItem() {
        return new ContentsUrlItem(null, this.tagId, null, this.fileName, null, 21, null);
    }
}
