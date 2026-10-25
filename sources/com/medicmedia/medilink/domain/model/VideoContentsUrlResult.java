package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoContentsUrlResult;", "", "contentsId", "", "hashInfo", "Lkotlin/Pair;", "playTime", "<init>", "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getHashInfo", "()Lkotlin/Pair;", "getPlayTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoContentsUrlResult {
    private final String contentsId;
    private final Pair<String, String> hashInfo;
    private final String playTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoContentsUrlResult copy$default(VideoContentsUrlResult videoContentsUrlResult, String str, Pair pair, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoContentsUrlResult.contentsId;
        }
        if ((i & 2) != 0) {
            pair = videoContentsUrlResult.hashInfo;
        }
        if ((i & 4) != 0) {
            str2 = videoContentsUrlResult.playTime;
        }
        return videoContentsUrlResult.copy(str, pair, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    public final Pair<String, String> component2() {
        return this.hashInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlayTime() {
        return this.playTime;
    }

    public final VideoContentsUrlResult copy(String contentsId, Pair<String, String> hashInfo, String playTime) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(hashInfo, "hashInfo");
        return new VideoContentsUrlResult(contentsId, hashInfo, playTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoContentsUrlResult)) {
            return false;
        }
        VideoContentsUrlResult videoContentsUrlResult = (VideoContentsUrlResult) other;
        return Intrinsics.areEqual(this.contentsId, videoContentsUrlResult.contentsId) && Intrinsics.areEqual(this.hashInfo, videoContentsUrlResult.hashInfo) && Intrinsics.areEqual(this.playTime, videoContentsUrlResult.playTime);
    }

    public int hashCode() {
        int iHashCode = ((this.contentsId.hashCode() * 31) + this.hashInfo.hashCode()) * 31;
        String str = this.playTime;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoContentsUrlResult(contentsId=" + this.contentsId + ", hashInfo=" + this.hashInfo + ", playTime=" + this.playTime + ")";
    }

    public VideoContentsUrlResult(String contentsId, Pair<String, String> hashInfo, String str) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(hashInfo, "hashInfo");
        this.contentsId = contentsId;
        this.hashInfo = hashInfo;
        this.playTime = str;
    }

    public /* synthetic */ VideoContentsUrlResult(String str, Pair pair, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pair, (i & 4) != 0 ? null : str2);
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final Pair<String, String> getHashInfo() {
        return this.hashInfo;
    }

    public final String getPlayTime() {
        return this.playTime;
    }
}
