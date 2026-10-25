package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPDFFile;", "", "fileId", "", "chapterId", "fileName", "", "saveFileName", "downloadUrl", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileId", "()I", "getChapterId", "getFileName", "()Ljava/lang/String;", "getSaveFileName", "getDownloadUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPDFFile {
    private final int chapterId;
    private final String downloadUrl;
    private final int fileId;
    private final String fileName;
    private final String saveFileName;

    public static /* synthetic */ VideoPDFFile copy$default(VideoPDFFile videoPDFFile, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoPDFFile.fileId;
        }
        if ((i3 & 2) != 0) {
            i2 = videoPDFFile.chapterId;
        }
        if ((i3 & 4) != 0) {
            str = videoPDFFile.fileName;
        }
        if ((i3 & 8) != 0) {
            str2 = videoPDFFile.saveFileName;
        }
        if ((i3 & 16) != 0) {
            str3 = videoPDFFile.downloadUrl;
        }
        String str4 = str3;
        String str5 = str;
        return videoPDFFile.copy(i, i2, str5, str2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSaveFileName() {
        return this.saveFileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final VideoPDFFile copy(int fileId, int chapterId, String fileName, String saveFileName, String downloadUrl) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(saveFileName, "saveFileName");
        return new VideoPDFFile(fileId, chapterId, fileName, saveFileName, downloadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPDFFile)) {
            return false;
        }
        VideoPDFFile videoPDFFile = (VideoPDFFile) other;
        return this.fileId == videoPDFFile.fileId && this.chapterId == videoPDFFile.chapterId && Intrinsics.areEqual(this.fileName, videoPDFFile.fileName) && Intrinsics.areEqual(this.saveFileName, videoPDFFile.saveFileName) && Intrinsics.areEqual(this.downloadUrl, videoPDFFile.downloadUrl);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.fileId) * 31) + Integer.hashCode(this.chapterId)) * 31) + this.fileName.hashCode()) * 31) + this.saveFileName.hashCode()) * 31;
        String str = this.downloadUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoPDFFile(fileId=" + this.fileId + ", chapterId=" + this.chapterId + ", fileName=" + this.fileName + ", saveFileName=" + this.saveFileName + ", downloadUrl=" + this.downloadUrl + ")";
    }

    public VideoPDFFile(int i, int i2, String fileName, String saveFileName, String str) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(saveFileName, "saveFileName");
        this.fileId = i;
        this.chapterId = i2;
        this.fileName = fileName;
        this.saveFileName = saveFileName;
        this.downloadUrl = str;
    }

    public /* synthetic */ VideoPDFFile(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, (i3 & 16) != 0 ? null : str3);
    }

    public final int getFileId() {
        return this.fileId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getSaveFileName() {
        return this.saveFileName;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }
}
