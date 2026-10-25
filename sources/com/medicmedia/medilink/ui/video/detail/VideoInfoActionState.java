package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.NoteViewItem;
import com.medicmedia.medilink.domain.model.video.VideoDownloadState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÇ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020&H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoActionState;", "", "isDone", "", HistoryRepositoryImpl.Path.BOOKMARK, "Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "showDownload", "isDownloadEnabled", "downloadState", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "showPdf", "showKijun", "showOther", "<init>", "(ZLcom/medicmedia/medilink/domain/model/NoteViewItem;ZZLcom/medicmedia/medilink/domain/model/video/VideoDownloadState;ZZZ)V", "()Z", "getBookmark", "()Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "getShowDownload", "getDownloadState", "()Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "getShowPdf", "getShowKijun", "getShowOther", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoInfoActionState {
    public static final int $stable = 8;
    private final NoteViewItem bookmark;
    private final VideoDownloadState downloadState;
    private final boolean isDone;
    private final boolean isDownloadEnabled;
    private final boolean showDownload;
    private final boolean showKijun;
    private final boolean showOther;
    private final boolean showPdf;

    public VideoInfoActionState() {
        this(false, null, false, false, null, false, false, false, 255, null);
    }

    public static /* synthetic */ VideoInfoActionState copy$default(VideoInfoActionState videoInfoActionState, boolean z, NoteViewItem noteViewItem, boolean z2, boolean z3, VideoDownloadState videoDownloadState, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoInfoActionState.isDone;
        }
        if ((i & 2) != 0) {
            noteViewItem = videoInfoActionState.bookmark;
        }
        if ((i & 4) != 0) {
            z2 = videoInfoActionState.showDownload;
        }
        if ((i & 8) != 0) {
            z3 = videoInfoActionState.isDownloadEnabled;
        }
        if ((i & 16) != 0) {
            videoDownloadState = videoInfoActionState.downloadState;
        }
        if ((i & 32) != 0) {
            z4 = videoInfoActionState.showPdf;
        }
        if ((i & 64) != 0) {
            z5 = videoInfoActionState.showKijun;
        }
        if ((i & 128) != 0) {
            z6 = videoInfoActionState.showOther;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        VideoDownloadState videoDownloadState2 = videoDownloadState;
        boolean z9 = z4;
        return videoInfoActionState.copy(z, noteViewItem, z2, z3, videoDownloadState2, z9, z7, z8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDone() {
        return this.isDone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NoteViewItem getBookmark() {
        return this.bookmark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowDownload() {
        return this.showDownload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDownloadEnabled() {
        return this.isDownloadEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VideoDownloadState getDownloadState() {
        return this.downloadState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowPdf() {
        return this.showPdf;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowKijun() {
        return this.showKijun;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowOther() {
        return this.showOther;
    }

    public final VideoInfoActionState copy(boolean isDone, NoteViewItem bookmark, boolean showDownload, boolean isDownloadEnabled, VideoDownloadState downloadState, boolean showPdf, boolean showKijun, boolean showOther) {
        return new VideoInfoActionState(isDone, bookmark, showDownload, isDownloadEnabled, downloadState, showPdf, showKijun, showOther);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoInfoActionState)) {
            return false;
        }
        VideoInfoActionState videoInfoActionState = (VideoInfoActionState) other;
        return this.isDone == videoInfoActionState.isDone && Intrinsics.areEqual(this.bookmark, videoInfoActionState.bookmark) && this.showDownload == videoInfoActionState.showDownload && this.isDownloadEnabled == videoInfoActionState.isDownloadEnabled && Intrinsics.areEqual(this.downloadState, videoInfoActionState.downloadState) && this.showPdf == videoInfoActionState.showPdf && this.showKijun == videoInfoActionState.showKijun && this.showOther == videoInfoActionState.showOther;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isDone) * 31;
        NoteViewItem noteViewItem = this.bookmark;
        int iHashCode2 = (((((iHashCode + (noteViewItem == null ? 0 : noteViewItem.hashCode())) * 31) + Boolean.hashCode(this.showDownload)) * 31) + Boolean.hashCode(this.isDownloadEnabled)) * 31;
        VideoDownloadState videoDownloadState = this.downloadState;
        return ((((((iHashCode2 + (videoDownloadState != null ? videoDownloadState.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPdf)) * 31) + Boolean.hashCode(this.showKijun)) * 31) + Boolean.hashCode(this.showOther);
    }

    public String toString() {
        return "VideoInfoActionState(isDone=" + this.isDone + ", bookmark=" + this.bookmark + ", showDownload=" + this.showDownload + ", isDownloadEnabled=" + this.isDownloadEnabled + ", downloadState=" + this.downloadState + ", showPdf=" + this.showPdf + ", showKijun=" + this.showKijun + ", showOther=" + this.showOther + ")";
    }

    public VideoInfoActionState(boolean z, NoteViewItem noteViewItem, boolean z2, boolean z3, VideoDownloadState videoDownloadState, boolean z4, boolean z5, boolean z6) {
        this.isDone = z;
        this.bookmark = noteViewItem;
        this.showDownload = z2;
        this.isDownloadEnabled = z3;
        this.downloadState = videoDownloadState;
        this.showPdf = z4;
        this.showKijun = z5;
        this.showOther = z6;
    }

    public /* synthetic */ VideoInfoActionState(boolean z, NoteViewItem noteViewItem, boolean z2, boolean z3, VideoDownloadState videoDownloadState, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : noteViewItem, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? null : videoDownloadState, (i & 32) != 0 ? true : z4, (i & 64) != 0 ? true : z5, (i & 128) != 0 ? true : z6);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public final NoteViewItem getBookmark() {
        return this.bookmark;
    }

    public final boolean getShowDownload() {
        return this.showDownload;
    }

    public final boolean isDownloadEnabled() {
        return this.isDownloadEnabled;
    }

    public final VideoDownloadState getDownloadState() {
        return this.downloadState;
    }

    public final boolean getShowPdf() {
        return this.showPdf;
    }

    public final boolean getShowKijun() {
        return this.showKijun;
    }

    public final boolean getShowOther() {
        return this.showOther;
    }
}
