package com.medicmedia.medilink.media.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayerItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Ja\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u00061"}, d2 = {"Lcom/medicmedia/medilink/media/video/VideoPlayerInitializeParams;", "", "mediaItems", "", "Lcom/google/android/exoplayer2/MediaItem;", "renderersFactory", "Lcom/google/android/exoplayer2/RenderersFactory;", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/MediaSourceFactory;", "startWindowIndex", "", "startPositionMs", "", "playWhenReady", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/exoplayer2/Player$EventListener;", "forceRecreate", "<init>", "(Ljava/util/List;Lcom/google/android/exoplayer2/RenderersFactory;Lcom/google/android/exoplayer2/source/MediaSourceFactory;IJZLcom/google/android/exoplayer2/Player$EventListener;Z)V", "getMediaItems", "()Ljava/util/List;", "getRenderersFactory", "()Lcom/google/android/exoplayer2/RenderersFactory;", "getMediaSourceFactory", "()Lcom/google/android/exoplayer2/source/MediaSourceFactory;", "getStartWindowIndex", "()I", "getStartPositionMs", "()J", "getPlayWhenReady", "()Z", "getListener", "()Lcom/google/android/exoplayer2/Player$EventListener;", "getForceRecreate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "media_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPlayerInitializeParams {
    private final boolean forceRecreate;
    private final Player.EventListener listener;
    private final List<MediaItem> mediaItems;
    private final MediaSourceFactory mediaSourceFactory;
    private final boolean playWhenReady;
    private final RenderersFactory renderersFactory;
    private final long startPositionMs;
    private final int startWindowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPlayerInitializeParams copy$default(VideoPlayerInitializeParams videoPlayerInitializeParams, List list, RenderersFactory renderersFactory, MediaSourceFactory mediaSourceFactory, int i, long j, boolean z, Player.EventListener eventListener, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = videoPlayerInitializeParams.mediaItems;
        }
        if ((i2 & 2) != 0) {
            renderersFactory = videoPlayerInitializeParams.renderersFactory;
        }
        if ((i2 & 4) != 0) {
            mediaSourceFactory = videoPlayerInitializeParams.mediaSourceFactory;
        }
        if ((i2 & 8) != 0) {
            i = videoPlayerInitializeParams.startWindowIndex;
        }
        if ((i2 & 16) != 0) {
            j = videoPlayerInitializeParams.startPositionMs;
        }
        if ((i2 & 32) != 0) {
            z = videoPlayerInitializeParams.playWhenReady;
        }
        if ((i2 & 64) != 0) {
            eventListener = videoPlayerInitializeParams.listener;
        }
        if ((i2 & 128) != 0) {
            z2 = videoPlayerInitializeParams.forceRecreate;
        }
        boolean z3 = z2;
        boolean z4 = z;
        long j2 = j;
        MediaSourceFactory mediaSourceFactory2 = mediaSourceFactory;
        int i3 = i;
        return videoPlayerInitializeParams.copy(list, renderersFactory, mediaSourceFactory2, i3, j2, z4, eventListener, z3);
    }

    public final List<MediaItem> component1() {
        return this.mediaItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RenderersFactory getRenderersFactory() {
        return this.renderersFactory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MediaSourceFactory getMediaSourceFactory() {
        return this.mediaSourceFactory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartWindowIndex() {
        return this.startWindowIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartPositionMs() {
        return this.startPositionMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Player.EventListener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getForceRecreate() {
        return this.forceRecreate;
    }

    public final VideoPlayerInitializeParams copy(List<MediaItem> mediaItems, RenderersFactory renderersFactory, MediaSourceFactory mediaSourceFactory, int startWindowIndex, long startPositionMs, boolean playWhenReady, Player.EventListener listener, boolean forceRecreate) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        Intrinsics.checkNotNullParameter(renderersFactory, "renderersFactory");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        return new VideoPlayerInitializeParams(mediaItems, renderersFactory, mediaSourceFactory, startWindowIndex, startPositionMs, playWhenReady, listener, forceRecreate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlayerInitializeParams)) {
            return false;
        }
        VideoPlayerInitializeParams videoPlayerInitializeParams = (VideoPlayerInitializeParams) other;
        return Intrinsics.areEqual(this.mediaItems, videoPlayerInitializeParams.mediaItems) && Intrinsics.areEqual(this.renderersFactory, videoPlayerInitializeParams.renderersFactory) && Intrinsics.areEqual(this.mediaSourceFactory, videoPlayerInitializeParams.mediaSourceFactory) && this.startWindowIndex == videoPlayerInitializeParams.startWindowIndex && this.startPositionMs == videoPlayerInitializeParams.startPositionMs && this.playWhenReady == videoPlayerInitializeParams.playWhenReady && Intrinsics.areEqual(this.listener, videoPlayerInitializeParams.listener) && this.forceRecreate == videoPlayerInitializeParams.forceRecreate;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.mediaItems.hashCode() * 31) + this.renderersFactory.hashCode()) * 31) + this.mediaSourceFactory.hashCode()) * 31) + Integer.hashCode(this.startWindowIndex)) * 31) + Long.hashCode(this.startPositionMs)) * 31) + Boolean.hashCode(this.playWhenReady)) * 31;
        Player.EventListener eventListener = this.listener;
        return ((iHashCode + (eventListener == null ? 0 : eventListener.hashCode())) * 31) + Boolean.hashCode(this.forceRecreate);
    }

    public String toString() {
        return "VideoPlayerInitializeParams(mediaItems=" + this.mediaItems + ", renderersFactory=" + this.renderersFactory + ", mediaSourceFactory=" + this.mediaSourceFactory + ", startWindowIndex=" + this.startWindowIndex + ", startPositionMs=" + this.startPositionMs + ", playWhenReady=" + this.playWhenReady + ", listener=" + this.listener + ", forceRecreate=" + this.forceRecreate + ")";
    }

    public VideoPlayerInitializeParams(List<MediaItem> mediaItems, RenderersFactory renderersFactory, MediaSourceFactory mediaSourceFactory, int i, long j, boolean z, Player.EventListener eventListener, boolean z2) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        Intrinsics.checkNotNullParameter(renderersFactory, "renderersFactory");
        Intrinsics.checkNotNullParameter(mediaSourceFactory, "mediaSourceFactory");
        this.mediaItems = mediaItems;
        this.renderersFactory = renderersFactory;
        this.mediaSourceFactory = mediaSourceFactory;
        this.startWindowIndex = i;
        this.startPositionMs = j;
        this.playWhenReady = z;
        this.listener = eventListener;
        this.forceRecreate = z2;
    }

    public /* synthetic */ VideoPlayerInitializeParams(List list, RenderersFactory renderersFactory, MediaSourceFactory mediaSourceFactory, int i, long j, boolean z, Player.EventListener eventListener, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, renderersFactory, mediaSourceFactory, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? -9223372036854775807L : j, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : eventListener, (i2 & 128) != 0 ? false : z2);
    }

    public final List<MediaItem> getMediaItems() {
        return this.mediaItems;
    }

    public final RenderersFactory getRenderersFactory() {
        return this.renderersFactory;
    }

    public final MediaSourceFactory getMediaSourceFactory() {
        return this.mediaSourceFactory;
    }

    public final int getStartWindowIndex() {
        return this.startWindowIndex;
    }

    public final long getStartPositionMs() {
        return this.startPositionMs;
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final Player.EventListener getListener() {
        return this.listener;
    }

    public final boolean getForceRecreate() {
        return this.forceRecreate;
    }
}
