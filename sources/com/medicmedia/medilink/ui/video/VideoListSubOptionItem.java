package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoChapterListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListSubOptionItem;", "", "expireDate", "", "lastViewDate", "progress", "", "isComplete", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZ)V", "getExpireDate", "()Ljava/lang/String;", "getLastViewDate", "getProgress", "()F", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListSubOptionItem {
    public static final int $stable = 0;
    private final String expireDate;
    private final boolean isComplete;
    private final String lastViewDate;
    private final float progress;

    public static /* synthetic */ VideoListSubOptionItem copy$default(VideoListSubOptionItem videoListSubOptionItem, String str, String str2, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoListSubOptionItem.expireDate;
        }
        if ((i & 2) != 0) {
            str2 = videoListSubOptionItem.lastViewDate;
        }
        if ((i & 4) != 0) {
            f = videoListSubOptionItem.progress;
        }
        if ((i & 8) != 0) {
            z = videoListSubOptionItem.isComplete;
        }
        return videoListSubOptionItem.copy(str, str2, f, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpireDate() {
        return this.expireDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final VideoListSubOptionItem copy(String expireDate, String lastViewDate, float progress, boolean isComplete) {
        return new VideoListSubOptionItem(expireDate, lastViewDate, progress, isComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListSubOptionItem)) {
            return false;
        }
        VideoListSubOptionItem videoListSubOptionItem = (VideoListSubOptionItem) other;
        return Intrinsics.areEqual(this.expireDate, videoListSubOptionItem.expireDate) && Intrinsics.areEqual(this.lastViewDate, videoListSubOptionItem.lastViewDate) && Float.compare(this.progress, videoListSubOptionItem.progress) == 0 && this.isComplete == videoListSubOptionItem.isComplete;
    }

    public int hashCode() {
        String str = this.expireDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastViewDate;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.hashCode(this.progress)) * 31) + Boolean.hashCode(this.isComplete);
    }

    public String toString() {
        return "VideoListSubOptionItem(expireDate=" + this.expireDate + ", lastViewDate=" + this.lastViewDate + ", progress=" + this.progress + ", isComplete=" + this.isComplete + ")";
    }

    public VideoListSubOptionItem(String str, String str2, float f, boolean z) {
        this.expireDate = str;
        this.lastViewDate = str2;
        this.progress = f;
        this.isComplete = z;
    }

    public final String getExpireDate() {
        return this.expireDate;
    }

    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }
}
