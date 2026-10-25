package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.ConstKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: ContentsEditListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoSubEditListItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "item", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoSubItem;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "displayFileSize", "", "getDisplayFileSize", "()Ljava/lang/String;", "fileSize", "", "getFileSize", "()D", "lastViewDate", "getLastViewDate", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoSubEditListItem extends MultiLevelViewItem {
    private final VideoSubItem item;

    public static /* synthetic */ VideoSubEditListItem copy$default(VideoSubEditListItem videoSubEditListItem, VideoSubItem videoSubItem, int i, Object obj) {
        if ((i & 1) != 0) {
            videoSubItem = videoSubEditListItem.item;
        }
        return videoSubEditListItem.copy(videoSubItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoSubItem getItem() {
        return this.item;
    }

    public final VideoSubEditListItem copy(VideoSubItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new VideoSubEditListItem(item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoSubEditListItem) && Intrinsics.areEqual(this.item, ((VideoSubEditListItem) other).item);
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    public String toString() {
        return "VideoSubEditListItem(item=" + this.item + ")";
    }

    public final VideoSubItem getItem() {
        return this.item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSubEditListItem(VideoSubItem item) {
        super(String.valueOf(item.getVideoId()), ContentsItemLevel.SUB.getValue());
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    public final String getDisplayFileSize() {
        return MathKt.roundToInt(getFileSize()) + " MB";
    }

    public final double getFileSize() {
        Double srcSize = this.item.getSrcSize();
        if (srcSize != null) {
            return srcSize.doubleValue();
        }
        return 0.0d;
    }

    public final String getLastViewDate() {
        Date lastViewDate = this.item.getLastViewDate();
        if (lastViewDate != null) {
            return ConstKt.getDateFormatCard().format(lastViewDate);
        }
        return null;
    }
}
