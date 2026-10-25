package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/domain/model/MyNoteLinkItem;", "", "filePath", "", "contentId", "index", "", BundleKey.THUMBNAIL, "mode", "noteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getContentId", "getIndex", "()I", "getThumbnail", "getMode", "getNoteId", "isSaveMode", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MyNoteLinkItem {
    private final String contentId;
    private final String filePath;
    private final int index;
    private final int mode;
    private final String noteId;
    private final String thumbnail;

    public static /* synthetic */ MyNoteLinkItem copy$default(MyNoteLinkItem myNoteLinkItem, String str, String str2, int i, String str3, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = myNoteLinkItem.filePath;
        }
        if ((i3 & 2) != 0) {
            str2 = myNoteLinkItem.contentId;
        }
        if ((i3 & 4) != 0) {
            i = myNoteLinkItem.index;
        }
        if ((i3 & 8) != 0) {
            str3 = myNoteLinkItem.thumbnail;
        }
        if ((i3 & 16) != 0) {
            i2 = myNoteLinkItem.mode;
        }
        if ((i3 & 32) != 0) {
            str4 = myNoteLinkItem.noteId;
        }
        int i4 = i2;
        String str5 = str4;
        return myNoteLinkItem.copy(str, str2, i, str3, i4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    public final MyNoteLinkItem copy(String filePath, String contentId, int index, String thumbnail, int mode, String noteId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(noteId, "noteId");
        return new MyNoteLinkItem(filePath, contentId, index, thumbnail, mode, noteId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyNoteLinkItem)) {
            return false;
        }
        MyNoteLinkItem myNoteLinkItem = (MyNoteLinkItem) other;
        return Intrinsics.areEqual(this.filePath, myNoteLinkItem.filePath) && Intrinsics.areEqual(this.contentId, myNoteLinkItem.contentId) && this.index == myNoteLinkItem.index && Intrinsics.areEqual(this.thumbnail, myNoteLinkItem.thumbnail) && this.mode == myNoteLinkItem.mode && Intrinsics.areEqual(this.noteId, myNoteLinkItem.noteId);
    }

    public int hashCode() {
        return (((((((((this.filePath.hashCode() * 31) + this.contentId.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + this.thumbnail.hashCode()) * 31) + Integer.hashCode(this.mode)) * 31) + this.noteId.hashCode();
    }

    public String toString() {
        return "MyNoteLinkItem(filePath=" + this.filePath + ", contentId=" + this.contentId + ", index=" + this.index + ", thumbnail=" + this.thumbnail + ", mode=" + this.mode + ", noteId=" + this.noteId + ")";
    }

    public MyNoteLinkItem(String filePath, String contentId, int i, String thumbnail, int i2, String noteId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(noteId, "noteId");
        this.filePath = filePath;
        this.contentId = contentId;
        this.index = i;
        this.thumbnail = thumbnail;
        this.mode = i2;
        this.noteId = noteId;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getMode() {
        return this.mode;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final boolean isSaveMode() {
        return this.mode == 0;
    }
}
