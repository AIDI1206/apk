package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoPDFFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoChapterListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020\u0007H×\u0001J\t\u0010!\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoChapterListUiState;", "", "isLoading", "", "progressType", "Lcom/medicmedia/medilink/ui/video/ProgressType;", "completeCount", "", "lastViewDate", "", "pdfFiles", "", "Lcom/medicmedia/medilink/domain/model/VideoPDFFile;", "<init>", "(ZLcom/medicmedia/medilink/ui/video/ProgressType;ILjava/lang/String;Ljava/util/List;)V", "()Z", "getProgressType", "()Lcom/medicmedia/medilink/ui/video/ProgressType;", "getCompleteCount", "()I", "getLastViewDate", "()Ljava/lang/String;", "getPdfFiles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoChapterListUiState {
    private final int completeCount;
    private final boolean isLoading;
    private final String lastViewDate;
    private final List<VideoPDFFile> pdfFiles;
    private final ProgressType progressType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final VideoChapterListUiState f187default = new VideoChapterListUiState(false, null, 0, null, null, 31, null);

    public VideoChapterListUiState() {
        this(false, null, 0, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoChapterListUiState copy$default(VideoChapterListUiState videoChapterListUiState, boolean z, ProgressType progressType, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = videoChapterListUiState.isLoading;
        }
        if ((i2 & 2) != 0) {
            progressType = videoChapterListUiState.progressType;
        }
        if ((i2 & 4) != 0) {
            i = videoChapterListUiState.completeCount;
        }
        if ((i2 & 8) != 0) {
            str = videoChapterListUiState.lastViewDate;
        }
        if ((i2 & 16) != 0) {
            list = videoChapterListUiState.pdfFiles;
        }
        List list2 = list;
        int i3 = i;
        return videoChapterListUiState.copy(z, progressType, i3, str, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProgressType getProgressType() {
        return this.progressType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompleteCount() {
        return this.completeCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    public final List<VideoPDFFile> component5() {
        return this.pdfFiles;
    }

    public final VideoChapterListUiState copy(boolean isLoading, ProgressType progressType, int completeCount, String lastViewDate, List<VideoPDFFile> pdfFiles) {
        return new VideoChapterListUiState(isLoading, progressType, completeCount, lastViewDate, pdfFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoChapterListUiState)) {
            return false;
        }
        VideoChapterListUiState videoChapterListUiState = (VideoChapterListUiState) other;
        return this.isLoading == videoChapterListUiState.isLoading && this.progressType == videoChapterListUiState.progressType && this.completeCount == videoChapterListUiState.completeCount && Intrinsics.areEqual(this.lastViewDate, videoChapterListUiState.lastViewDate) && Intrinsics.areEqual(this.pdfFiles, videoChapterListUiState.pdfFiles);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        ProgressType progressType = this.progressType;
        int iHashCode2 = (((iHashCode + (progressType == null ? 0 : progressType.hashCode())) * 31) + Integer.hashCode(this.completeCount)) * 31;
        String str = this.lastViewDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoPDFFile> list = this.pdfFiles;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "VideoChapterListUiState(isLoading=" + this.isLoading + ", progressType=" + this.progressType + ", completeCount=" + this.completeCount + ", lastViewDate=" + this.lastViewDate + ", pdfFiles=" + this.pdfFiles + ")";
    }

    public VideoChapterListUiState(boolean z, ProgressType progressType, int i, String str, List<VideoPDFFile> list) {
        this.isLoading = z;
        this.progressType = progressType;
        this.completeCount = i;
        this.lastViewDate = str;
        this.pdfFiles = list;
    }

    public /* synthetic */ VideoChapterListUiState(boolean z, ProgressType progressType, int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : progressType, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ProgressType getProgressType() {
        return this.progressType;
    }

    public final int getCompleteCount() {
        return this.completeCount;
    }

    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    public final List<VideoPDFFile> getPdfFiles() {
        return this.pdfFiles;
    }

    /* JADX INFO: compiled from: VideoChapterListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoChapterListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/video/VideoChapterListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/video/VideoChapterListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoChapterListUiState getDefault() {
            return VideoChapterListUiState.f187default;
        }
    }
}
