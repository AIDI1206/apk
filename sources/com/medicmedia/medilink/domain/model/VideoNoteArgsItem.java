package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006+"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoNoteArgsItem;", "", "mode", "", "contentsId", "", "courseId", "noteDataId", "videoHash", "text", "isDelete", "", "updatedDate", "Ljava/util/Date;", "viewDate", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;)V", "getMode", "()I", "getContentsId", "()Ljava/lang/String;", "getCourseId", "getNoteDataId", "getVideoHash", "getText", "()Z", "getUpdatedDate", "()Ljava/util/Date;", "getViewDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoNoteArgsItem {
    private final String contentsId;
    private final int courseId;
    private final boolean isDelete;
    private final int mode;
    private final String noteDataId;
    private final String text;
    private final Date updatedDate;
    private final String videoHash;
    private final Date viewDate;

    public static /* synthetic */ VideoNoteArgsItem copy$default(VideoNoteArgsItem videoNoteArgsItem, int i, String str, int i2, String str2, String str3, String str4, boolean z, Date date, Date date2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoNoteArgsItem.mode;
        }
        if ((i3 & 2) != 0) {
            str = videoNoteArgsItem.contentsId;
        }
        if ((i3 & 4) != 0) {
            i2 = videoNoteArgsItem.courseId;
        }
        if ((i3 & 8) != 0) {
            str2 = videoNoteArgsItem.noteDataId;
        }
        if ((i3 & 16) != 0) {
            str3 = videoNoteArgsItem.videoHash;
        }
        if ((i3 & 32) != 0) {
            str4 = videoNoteArgsItem.text;
        }
        if ((i3 & 64) != 0) {
            z = videoNoteArgsItem.isDelete;
        }
        if ((i3 & 128) != 0) {
            date = videoNoteArgsItem.updatedDate;
        }
        if ((i3 & 256) != 0) {
            date2 = videoNoteArgsItem.viewDate;
        }
        Date date3 = date;
        Date date4 = date2;
        String str5 = str4;
        boolean z2 = z;
        String str6 = str3;
        int i4 = i2;
        return videoNoteArgsItem.copy(i, str, i4, str2, str6, str5, z2, date3, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNoteDataId() {
        return this.noteDataId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDelete() {
        return this.isDelete;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getViewDate() {
        return this.viewDate;
    }

    public final VideoNoteArgsItem copy(int mode, String contentsId, int courseId, String noteDataId, String videoHash, String text, boolean isDelete, Date updatedDate, Date viewDate) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(viewDate, "viewDate");
        return new VideoNoteArgsItem(mode, contentsId, courseId, noteDataId, videoHash, text, isDelete, updatedDate, viewDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoNoteArgsItem)) {
            return false;
        }
        VideoNoteArgsItem videoNoteArgsItem = (VideoNoteArgsItem) other;
        return this.mode == videoNoteArgsItem.mode && Intrinsics.areEqual(this.contentsId, videoNoteArgsItem.contentsId) && this.courseId == videoNoteArgsItem.courseId && Intrinsics.areEqual(this.noteDataId, videoNoteArgsItem.noteDataId) && Intrinsics.areEqual(this.videoHash, videoNoteArgsItem.videoHash) && Intrinsics.areEqual(this.text, videoNoteArgsItem.text) && this.isDelete == videoNoteArgsItem.isDelete && Intrinsics.areEqual(this.updatedDate, videoNoteArgsItem.updatedDate) && Intrinsics.areEqual(this.viewDate, videoNoteArgsItem.viewDate);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mode) * 31) + this.contentsId.hashCode()) * 31) + Integer.hashCode(this.courseId)) * 31) + this.noteDataId.hashCode()) * 31) + this.videoHash.hashCode()) * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.isDelete)) * 31) + this.updatedDate.hashCode()) * 31) + this.viewDate.hashCode();
    }

    public String toString() {
        return "VideoNoteArgsItem(mode=" + this.mode + ", contentsId=" + this.contentsId + ", courseId=" + this.courseId + ", noteDataId=" + this.noteDataId + ", videoHash=" + this.videoHash + ", text=" + this.text + ", isDelete=" + this.isDelete + ", updatedDate=" + this.updatedDate + ", viewDate=" + this.viewDate + ")";
    }

    public VideoNoteArgsItem(int i, String contentsId, int i2, String noteDataId, String videoHash, String text, boolean z, Date updatedDate, Date viewDate) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(viewDate, "viewDate");
        this.mode = i;
        this.contentsId = contentsId;
        this.courseId = i2;
        this.noteDataId = noteDataId;
        this.videoHash = videoHash;
        this.text = text;
        this.isDelete = z;
        this.updatedDate = updatedDate;
        this.viewDate = viewDate;
    }

    public final int getMode() {
        return this.mode;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getNoteDataId() {
        return this.noteDataId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isDelete() {
        return this.isDelete;
    }

    public /* synthetic */ VideoNoteArgsItem(int i, String str, int i2, String str2, String str3, String str4, boolean z, Date date, Date date2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, str2, str3, str4, z, (i3 & 128) != 0 ? new Date() : date, (i3 & 256) != 0 ? new Date() : date2);
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final Date getViewDate() {
        return this.viewDate;
    }
}
