package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.MediaItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J]\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006("}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoPlaybackPlan;", "", "mediaItems", "", "Lcom/google/android/exoplayer2/MediaItem;", "targetIndex", "", "startPositionMs", "", "playWhenReady", "", "nextVideoHashList", "", "shouldCacheAsPlayList", "shouldClearPlayListCache", "<init>", "(Ljava/util/List;IJZLjava/util/List;ZZ)V", "getMediaItems", "()Ljava/util/List;", "getTargetIndex", "()I", "getStartPositionMs", "()J", "getPlayWhenReady", "()Z", "getNextVideoHashList", "getShouldCacheAsPlayList", "getShouldClearPlayListCache", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPlaybackPlan {
    private final List<MediaItem> mediaItems;
    private final List<String> nextVideoHashList;
    private final boolean playWhenReady;
    private final boolean shouldCacheAsPlayList;
    private final boolean shouldClearPlayListCache;
    private final long startPositionMs;
    private final int targetIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPlaybackPlan copy$default(VideoPlaybackPlan videoPlaybackPlan, List list, int i, long j, boolean z, List list2, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = videoPlaybackPlan.mediaItems;
        }
        if ((i2 & 2) != 0) {
            i = videoPlaybackPlan.targetIndex;
        }
        if ((i2 & 4) != 0) {
            j = videoPlaybackPlan.startPositionMs;
        }
        if ((i2 & 8) != 0) {
            z = videoPlaybackPlan.playWhenReady;
        }
        if ((i2 & 16) != 0) {
            list2 = videoPlaybackPlan.nextVideoHashList;
        }
        if ((i2 & 32) != 0) {
            z2 = videoPlaybackPlan.shouldCacheAsPlayList;
        }
        if ((i2 & 64) != 0) {
            z3 = videoPlaybackPlan.shouldClearPlayListCache;
        }
        long j2 = j;
        return videoPlaybackPlan.copy(list, i, j2, z, list2, z2, z3);
    }

    public final List<MediaItem> component1() {
        return this.mediaItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartPositionMs() {
        return this.startPositionMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final List<String> component5() {
        return this.nextVideoHashList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldCacheAsPlayList() {
        return this.shouldCacheAsPlayList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShouldClearPlayListCache() {
        return this.shouldClearPlayListCache;
    }

    public final VideoPlaybackPlan copy(List<MediaItem> mediaItems, int targetIndex, long startPositionMs, boolean playWhenReady, List<String> nextVideoHashList, boolean shouldCacheAsPlayList, boolean shouldClearPlayListCache) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        return new VideoPlaybackPlan(mediaItems, targetIndex, startPositionMs, playWhenReady, nextVideoHashList, shouldCacheAsPlayList, shouldClearPlayListCache);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlaybackPlan)) {
            return false;
        }
        VideoPlaybackPlan videoPlaybackPlan = (VideoPlaybackPlan) other;
        return Intrinsics.areEqual(this.mediaItems, videoPlaybackPlan.mediaItems) && this.targetIndex == videoPlaybackPlan.targetIndex && this.startPositionMs == videoPlaybackPlan.startPositionMs && this.playWhenReady == videoPlaybackPlan.playWhenReady && Intrinsics.areEqual(this.nextVideoHashList, videoPlaybackPlan.nextVideoHashList) && this.shouldCacheAsPlayList == videoPlaybackPlan.shouldCacheAsPlayList && this.shouldClearPlayListCache == videoPlaybackPlan.shouldClearPlayListCache;
    }

    public int hashCode() {
        int iHashCode = ((((((this.mediaItems.hashCode() * 31) + Integer.hashCode(this.targetIndex)) * 31) + Long.hashCode(this.startPositionMs)) * 31) + Boolean.hashCode(this.playWhenReady)) * 31;
        List<String> list = this.nextVideoHashList;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.shouldCacheAsPlayList)) * 31) + Boolean.hashCode(this.shouldClearPlayListCache);
    }

    public String toString() {
        return "VideoPlaybackPlan(mediaItems=" + this.mediaItems + ", targetIndex=" + this.targetIndex + ", startPositionMs=" + this.startPositionMs + ", playWhenReady=" + this.playWhenReady + ", nextVideoHashList=" + this.nextVideoHashList + ", shouldCacheAsPlayList=" + this.shouldCacheAsPlayList + ", shouldClearPlayListCache=" + this.shouldClearPlayListCache + ")";
    }

    public VideoPlaybackPlan(List<MediaItem> mediaItems, int i, long j, boolean z, List<String> list, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        this.mediaItems = mediaItems;
        this.targetIndex = i;
        this.startPositionMs = j;
        this.playWhenReady = z;
        this.nextVideoHashList = list;
        this.shouldCacheAsPlayList = z2;
        this.shouldClearPlayListCache = z3;
    }

    public /* synthetic */ VideoPlaybackPlan(List list, int i, long j, boolean z, List list2, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, j, z, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3);
    }

    public final List<MediaItem> getMediaItems() {
        return this.mediaItems;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public final long getStartPositionMs() {
        return this.startPositionMs;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final List<String> getNextVideoHashList() {
        return this.nextVideoHashList;
    }

    public final boolean getShouldCacheAsPlayList() {
        return this.shouldCacheAsPlayList;
    }

    public final boolean getShouldClearPlayListCache() {
        return this.shouldClearPlayListCache;
    }
}
