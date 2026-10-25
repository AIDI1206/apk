package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.NoteViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBookmarkCoordinator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoBookmarkToggleResult;", "", HistoryRepositoryImpl.Path.BOOKMARK, "Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/NoteViewItem;)V", "getBookmark", "()Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoBookmarkToggleResult {
    public static final int $stable = 8;
    private final NoteViewItem bookmark;

    public static /* synthetic */ VideoBookmarkToggleResult copy$default(VideoBookmarkToggleResult videoBookmarkToggleResult, NoteViewItem noteViewItem, int i, Object obj) {
        if ((i & 1) != 0) {
            noteViewItem = videoBookmarkToggleResult.bookmark;
        }
        return videoBookmarkToggleResult.copy(noteViewItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NoteViewItem getBookmark() {
        return this.bookmark;
    }

    public final VideoBookmarkToggleResult copy(NoteViewItem bookmark) {
        return new VideoBookmarkToggleResult(bookmark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoBookmarkToggleResult) && Intrinsics.areEqual(this.bookmark, ((VideoBookmarkToggleResult) other).bookmark);
    }

    public int hashCode() {
        NoteViewItem noteViewItem = this.bookmark;
        if (noteViewItem == null) {
            return 0;
        }
        return noteViewItem.hashCode();
    }

    public String toString() {
        return "VideoBookmarkToggleResult(bookmark=" + this.bookmark + ")";
    }

    public VideoBookmarkToggleResult(NoteViewItem noteViewItem) {
        this.bookmark = noteViewItem;
    }

    public final NoteViewItem getBookmark() {
        return this.bookmark;
    }
}
