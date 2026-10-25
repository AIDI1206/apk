package com.medicmedia.medilink.ui.intermediate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntermediatePageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/ui/intermediate/IntermediateVideoContentsItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", HistoryRepositoryImpl.FieldName.TITLE, "", "mode", "url", "videoItem", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/VideoSubItem;)V", "getTitle", "()Ljava/lang/String;", "getMode", "getUrl", "getVideoItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class IntermediateVideoContentsItem extends MultiLevelViewItem {
    public static final int $stable = 8;
    private final String mode;
    private final String title;
    private final String url;
    private final VideoSubItem videoItem;

    public static /* synthetic */ IntermediateVideoContentsItem copy$default(IntermediateVideoContentsItem intermediateVideoContentsItem, String str, String str2, String str3, VideoSubItem videoSubItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intermediateVideoContentsItem.title;
        }
        if ((i & 2) != 0) {
            str2 = intermediateVideoContentsItem.mode;
        }
        if ((i & 4) != 0) {
            str3 = intermediateVideoContentsItem.url;
        }
        if ((i & 8) != 0) {
            videoSubItem = intermediateVideoContentsItem.videoItem;
        }
        return intermediateVideoContentsItem.copy(str, str2, str3, videoSubItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VideoSubItem getVideoItem() {
        return this.videoItem;
    }

    public final IntermediateVideoContentsItem copy(String title, String mode, String url, VideoSubItem videoItem) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        return new IntermediateVideoContentsItem(title, mode, url, videoItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntermediateVideoContentsItem)) {
            return false;
        }
        IntermediateVideoContentsItem intermediateVideoContentsItem = (IntermediateVideoContentsItem) other;
        return Intrinsics.areEqual(this.title, intermediateVideoContentsItem.title) && Intrinsics.areEqual(this.mode, intermediateVideoContentsItem.mode) && Intrinsics.areEqual(this.url, intermediateVideoContentsItem.url) && Intrinsics.areEqual(this.videoItem, intermediateVideoContentsItem.videoItem);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.mode.hashCode()) * 31) + this.url.hashCode()) * 31) + this.videoItem.hashCode();
    }

    public String toString() {
        return "IntermediateVideoContentsItem(title=" + this.title + ", mode=" + this.mode + ", url=" + this.url + ", videoItem=" + this.videoItem + ")";
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final VideoSubItem getVideoItem() {
        return this.videoItem;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntermediateVideoContentsItem(String title, String mode, String url, VideoSubItem videoItem) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        super(string, IntermediateItemLevel.CONTENTS.getValue());
        this.title = title;
        this.mode = mode;
        this.url = url;
        this.videoItem = videoItem;
    }
}
