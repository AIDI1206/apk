package com.medicmedia.medilink.media.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExoPlayerFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/media/video/ExoPlayerFactory;", "", "create", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "renderersFactory", "Lcom/google/android/exoplayer2/RenderersFactory;", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/MediaSourceFactory;", "trackSelector", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "media_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ExoPlayerFactory {
    SimpleExoPlayer create(RenderersFactory renderersFactory, MediaSourceFactory mediaSourceFactory, DefaultTrackSelector trackSelector);
}
