package com.medicmedia.medilink.service;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.loader.AudioPlay;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController;
import com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackRequest;
import com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackSnapshot;
import com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackSnapshotStore;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBackgroundPlaybackControllerImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/service/VideoBackgroundPlaybackControllerImpl;", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackController;", "context", "Landroid/content/Context;", "crashAnalyticsClient", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "<init>", "(Landroid/content/Context;Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;)V", "snapshotStore", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshotStore;", TtmlNode.START, "", "request", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRequest;", "stop", "updatePlaybackSnapshot", "snapshot", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshot;", "consumeActiveSnapshot", "clearPlaybackSnapshot", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoBackgroundPlaybackControllerImpl implements VideoBackgroundPlaybackController {
    public static final int $stable = 8;
    private final Context context;
    private final CrashAnalyticsClient crashAnalyticsClient;
    private final VideoBackgroundPlaybackSnapshotStore snapshotStore;

    @Inject
    public VideoBackgroundPlaybackControllerImpl(@ApplicationContext Context context, CrashAnalyticsClient crashAnalyticsClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashAnalyticsClient, "crashAnalyticsClient");
        this.context = context;
        this.crashAnalyticsClient = crashAnalyticsClient;
        this.snapshotStore = new VideoBackgroundPlaybackSnapshotStore();
    }

    @Override // com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController
    public void start(VideoBackgroundPlaybackRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            ContextExtensionKt.putExtraForMediaItems(this.context, request.getMediaItems());
            Intent intent = new Intent(this.context, (Class<?>) AudioPlay.class);
            intent.putExtra("contents_id", request.getContentsId());
            intent.putExtra("video_hash", request.getVideoHash());
            intent.putExtra(BundleKey.COURSE_ID, request.getCourseId());
            intent.putExtra("chapter_id", request.getChapterId());
            intent.putExtra(BundleKey.RESUME_INDEX, request.getResumeIndex());
            intent.putExtra(BundleKey.PLAY_MS, request.getResumePositionMs());
            intent.putExtra(BundleKey.RESUME_MEDIA_ID, request.getResumeMediaId());
            intent.putExtra(BundleKey.PLAY_LIST, request.isPlayList());
            intent.putExtra(MLConst.BUNDLE_MEDIA_ITEMS, true);
            ContextCompat.startForegroundService(this.context, intent);
            this.snapshotStore.update(new VideoBackgroundPlaybackSnapshot(request.getResumeIndex(), request.getResumePositionMs(), request.getResumeMediaId()));
        } catch (Exception e) {
            CrashAnalyticsClient.DefaultImpls.recordException$default(this.crashAnalyticsClient, e, null, 2, null);
        }
    }

    @Override // com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController
    public void stop() {
        try {
            this.context.stopService(new Intent(this.context, (Class<?>) AudioPlay.class));
        } catch (Exception e) {
            CrashAnalyticsClient.DefaultImpls.recordException$default(this.crashAnalyticsClient, e, null, 2, null);
        } finally {
            this.snapshotStore.clear();
        }
    }

    @Override // com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController
    public void updatePlaybackSnapshot(VideoBackgroundPlaybackSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshotStore.update(snapshot);
    }

    @Override // com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController
    public VideoBackgroundPlaybackSnapshot consumeActiveSnapshot() {
        return this.snapshotStore.consume();
    }

    @Override // com.medicmedia.medilink.ui.video.detail.VideoBackgroundPlaybackController
    public void clearPlaybackSnapshot() {
        this.snapshotStore.clear();
    }
}
