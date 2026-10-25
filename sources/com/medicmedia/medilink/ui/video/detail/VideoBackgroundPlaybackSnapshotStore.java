package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBackgroundPlaybackSnapshotStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshotStore;", "", "<init>", "()V", "snapshot", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshot;", "update", "", "clear", "consume", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoBackgroundPlaybackSnapshotStore {
    public static final int $stable = 8;
    private volatile VideoBackgroundPlaybackSnapshot snapshot;

    public final void update(VideoBackgroundPlaybackSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    public final void clear() {
        this.snapshot = null;
    }

    public final VideoBackgroundPlaybackSnapshot consume() {
        VideoBackgroundPlaybackSnapshot videoBackgroundPlaybackSnapshot = this.snapshot;
        this.snapshot = null;
        return videoBackgroundPlaybackSnapshot;
    }
}
