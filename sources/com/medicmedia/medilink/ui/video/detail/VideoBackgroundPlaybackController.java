package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: VideoBackgroundPlaybackController.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackController;", "", TtmlNode.START, "", "request", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRequest;", "stop", "updatePlaybackSnapshot", "snapshot", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshot;", "consumeActiveSnapshot", "clearPlaybackSnapshot", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoBackgroundPlaybackController {
    void clearPlaybackSnapshot();

    VideoBackgroundPlaybackSnapshot consumeActiveSnapshot();

    void start(VideoBackgroundPlaybackRequest request);

    void stop();

    void updatePlaybackSnapshot(VideoBackgroundPlaybackSnapshot snapshot);
}
