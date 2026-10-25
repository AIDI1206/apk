package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoUrlItem;", "", "contentsId", "", "startHash", "videoHash", SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getStartHash", "getVideoHash", "getQuery", "createLinkUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoUrlItem {
    private final String contentsId;
    private final String query;
    private final String startHash;
    private final String videoHash;

    public static /* synthetic */ VideoUrlItem copy$default(VideoUrlItem videoUrlItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoUrlItem.contentsId;
        }
        if ((i & 2) != 0) {
            str2 = videoUrlItem.startHash;
        }
        if ((i & 4) != 0) {
            str3 = videoUrlItem.videoHash;
        }
        if ((i & 8) != 0) {
            str4 = videoUrlItem.query;
        }
        return videoUrlItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartHash() {
        return this.startHash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final VideoUrlItem copy(String contentsId, String startHash, String videoHash, String query) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(startHash, "startHash");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        return new VideoUrlItem(contentsId, startHash, videoHash, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoUrlItem)) {
            return false;
        }
        VideoUrlItem videoUrlItem = (VideoUrlItem) other;
        return Intrinsics.areEqual(this.contentsId, videoUrlItem.contentsId) && Intrinsics.areEqual(this.startHash, videoUrlItem.startHash) && Intrinsics.areEqual(this.videoHash, videoUrlItem.videoHash) && Intrinsics.areEqual(this.query, videoUrlItem.query);
    }

    public int hashCode() {
        int iHashCode = ((((this.contentsId.hashCode() * 31) + this.startHash.hashCode()) * 31) + this.videoHash.hashCode()) * 31;
        String str = this.query;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoUrlItem(contentsId=" + this.contentsId + ", startHash=" + this.startHash + ", videoHash=" + this.videoHash + ", query=" + this.query + ")";
    }

    public VideoUrlItem(String contentsId, String startHash, String videoHash, String str) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(startHash, "startHash");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        this.contentsId = contentsId;
        this.startHash = startHash;
        this.videoHash = videoHash;
        this.query = str;
    }

    public /* synthetic */ VideoUrlItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getStartHash() {
        return this.startHash;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String createLinkUrl() {
        String string;
        String str = "http://app-client.medilink-study.com/contents?contents_url=https://auth-lec.stg-medilink.com/&is_native=true&contents_id=" + this.contentsId + "&start_hash=" + this.startHash + "&video_hash=" + this.videoHash;
        String str2 = this.query;
        return (str2 == null || (string = new StringBuilder().append(str).append(str2).toString()) == null) ? str : string;
    }
}
