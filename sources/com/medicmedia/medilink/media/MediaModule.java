package com.medicmedia.medilink.media;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.medicmedia.medilink.media.video.ExoPlayerFactory;
import com.medicmedia.medilink.media.video.ExoPlayerFactoryImpl;
import com.medicmedia.medilink.media.video.VideoPlayerController;
import com.medicmedia.medilink.media.video.VideoPlayerControllerImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/media/MediaModule;", "", "<init>", "()V", "provideAudioPlayer", "Lcom/medicmedia/medilink/media/AudioPlayer;", "context", "Landroid/content/Context;", "provideDefaultTrackSelector", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "provideExoPlayerFactory", "Lcom/medicmedia/medilink/media/video/ExoPlayerFactory;", "provideVideoPlayerController", "Lcom/medicmedia/medilink/media/video/VideoPlayerController;", "exoPlayerFactory", "trackSelector", "media_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class MediaModule {
    public static final MediaModule INSTANCE = new MediaModule();

    private MediaModule() {
    }

    @Provides
    public final AudioPlayer provideAudioPlayer(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AudioPlayerImpl(context);
    }

    @Provides
    public final DefaultTrackSelector provideDefaultTrackSelector(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
        DefaultTrackSelector.Parameters parametersBuild = defaultTrackSelector.buildUponParameters().build();
        Intrinsics.checkNotNullExpressionValue(parametersBuild, "build(...)");
        defaultTrackSelector.setParameters(parametersBuild);
        return defaultTrackSelector;
    }

    @Provides
    public final ExoPlayerFactory provideExoPlayerFactory(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ExoPlayerFactoryImpl(context);
    }

    @Provides
    public final VideoPlayerController provideVideoPlayerController(ExoPlayerFactory exoPlayerFactory, DefaultTrackSelector trackSelector) {
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(trackSelector, "trackSelector");
        return new VideoPlayerControllerImpl(exoPlayerFactory, trackSelector);
    }
}
