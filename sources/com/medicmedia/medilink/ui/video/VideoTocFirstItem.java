package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoTocItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\t\u0010\u001d\u001a\u00020\u0005H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocFirstItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", FirebaseAnalytics.Param.LEVEL, "", "tag", "", "text", "contentsId", "color", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()I", "getTag", "()Ljava/lang/String;", "getText", "getContentsId", "getColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoTocFirstItem extends MultiLevelViewItem {
    public static final int $stable = 0;
    private final String color;
    private final String contentsId;
    private final int level;
    private final String tag;
    private final String text;

    public VideoTocFirstItem() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ VideoTocFirstItem copy$default(VideoTocFirstItem videoTocFirstItem, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoTocFirstItem.level;
        }
        if ((i2 & 2) != 0) {
            str = videoTocFirstItem.tag;
        }
        if ((i2 & 4) != 0) {
            str2 = videoTocFirstItem.text;
        }
        if ((i2 & 8) != 0) {
            str3 = videoTocFirstItem.contentsId;
        }
        if ((i2 & 16) != 0) {
            str4 = videoTocFirstItem.color;
        }
        String str5 = str4;
        String str6 = str2;
        return videoTocFirstItem.copy(i, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final VideoTocFirstItem copy(int level, String tag, String text, String contentsId, String color) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        return new VideoTocFirstItem(level, tag, text, contentsId, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTocFirstItem)) {
            return false;
        }
        VideoTocFirstItem videoTocFirstItem = (VideoTocFirstItem) other;
        return this.level == videoTocFirstItem.level && Intrinsics.areEqual(this.tag, videoTocFirstItem.tag) && Intrinsics.areEqual(this.text, videoTocFirstItem.text) && Intrinsics.areEqual(this.contentsId, videoTocFirstItem.contentsId) && Intrinsics.areEqual(this.color, videoTocFirstItem.color);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.level) * 31) + this.tag.hashCode()) * 31) + this.text.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "VideoTocFirstItem(level=" + this.level + ", tag=" + this.tag + ", text=" + this.text + ", contentsId=" + this.contentsId + ", color=" + this.color + ")";
    }

    public /* synthetic */ VideoTocFirstItem(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VideoTocLevel.FIRST.getValue() : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }

    @Override // com.medicmedia.medilink.domain.model.MultiLevelViewItem
    public int getLevel() {
        return this.level;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getColor() {
        return this.color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTocFirstItem(int i, String tag, String text, String contentsId, String color) {
        super(tag, i);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        this.level = i;
        this.tag = tag;
        this.text = text;
        this.contentsId = contentsId;
        this.color = color;
    }
}
