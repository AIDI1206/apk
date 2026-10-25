package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoEditListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;", "", "progress", "", "max", "messageId", "<init>", "(III)V", "getProgress", "()I", "getMax", "getMessageId", "isProgressMax", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentProgressInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int max;
    private final int messageId;
    private final int progress;

    public static /* synthetic */ ContentProgressInfo copy$default(ContentProgressInfo contentProgressInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = contentProgressInfo.progress;
        }
        if ((i4 & 2) != 0) {
            i2 = contentProgressInfo.max;
        }
        if ((i4 & 4) != 0) {
            i3 = contentProgressInfo.messageId;
        }
        return contentProgressInfo.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessageId() {
        return this.messageId;
    }

    public final ContentProgressInfo copy(int progress, int max, int messageId) {
        return new ContentProgressInfo(progress, max, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentProgressInfo)) {
            return false;
        }
        ContentProgressInfo contentProgressInfo = (ContentProgressInfo) other;
        return this.progress == contentProgressInfo.progress && this.max == contentProgressInfo.max && this.messageId == contentProgressInfo.messageId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.progress) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.messageId);
    }

    public String toString() {
        return "ContentProgressInfo(progress=" + this.progress + ", max=" + this.max + ", messageId=" + this.messageId + ")";
    }

    public ContentProgressInfo(int i, int i2, int i3) {
        this.progress = i;
        this.max = i2;
        this.messageId = i3;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    public final boolean isProgressMax() {
        return this.progress >= this.max;
    }

    /* JADX INFO: compiled from: VideoEditListViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo$Companion;", "", "<init>", "()V", "createDownloadList", "Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;", "progress", "", "max", "createDeleteList", "messageId", "updateList", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentProgressInfo createDownloadList(int progress, int max) {
            return new ContentProgressInfo(progress, max, R.string.video_progress_dialog_download_message);
        }

        public static /* synthetic */ ContentProgressInfo createDeleteList$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i3 = R.string.video_progress_dialog_delete_message;
            }
            return companion.createDeleteList(i, i2, i3);
        }

        public final ContentProgressInfo createDeleteList(int progress, int max, int messageId) {
            return new ContentProgressInfo(progress, max, messageId);
        }

        public static /* synthetic */ ContentProgressInfo updateList$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i3 = R.string.video_progress_dialog_update_message;
            }
            return companion.updateList(i, i2, i3);
        }

        public final ContentProgressInfo updateList(int progress, int max, int messageId) {
            return new ContentProgressInfo(progress, max, messageId);
        }
    }
}
