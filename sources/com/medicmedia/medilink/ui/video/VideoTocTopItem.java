package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoTocItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\t\u0010 \u001a\u00020\u0005H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocTopItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", FirebaseAnalytics.Param.LEVEL, "", "text", "", "tag", "contentsId", "color", "page", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()I", "getText", "()Ljava/lang/String;", "getTag", "getContentsId", "getColor", "getPage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoTocTopItem extends MultiLevelViewItem {
    public static final int $stable = 0;
    private final String color;
    private final String contentsId;
    private final int level;
    private final String page;
    private final String tag;
    private final String text;

    public VideoTocTopItem() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ VideoTocTopItem copy$default(VideoTocTopItem videoTocTopItem, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoTocTopItem.level;
        }
        if ((i2 & 2) != 0) {
            str = videoTocTopItem.text;
        }
        if ((i2 & 4) != 0) {
            str2 = videoTocTopItem.tag;
        }
        if ((i2 & 8) != 0) {
            str3 = videoTocTopItem.contentsId;
        }
        if ((i2 & 16) != 0) {
            str4 = videoTocTopItem.color;
        }
        if ((i2 & 32) != 0) {
            str5 = videoTocTopItem.page;
        }
        String str6 = str4;
        String str7 = str5;
        return videoTocTopItem.copy(i, str, str2, str3, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    public final VideoTocTopItem copy(int level, String text, String tag, String contentsId, String color, String page) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(page, "page");
        return new VideoTocTopItem(level, text, tag, contentsId, color, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTocTopItem)) {
            return false;
        }
        VideoTocTopItem videoTocTopItem = (VideoTocTopItem) other;
        return this.level == videoTocTopItem.level && Intrinsics.areEqual(this.text, videoTocTopItem.text) && Intrinsics.areEqual(this.tag, videoTocTopItem.tag) && Intrinsics.areEqual(this.contentsId, videoTocTopItem.contentsId) && Intrinsics.areEqual(this.color, videoTocTopItem.color) && Intrinsics.areEqual(this.page, videoTocTopItem.page);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.level) * 31) + this.text.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.color.hashCode()) * 31) + this.page.hashCode();
    }

    public String toString() {
        return "VideoTocTopItem(level=" + this.level + ", text=" + this.text + ", tag=" + this.tag + ", contentsId=" + this.contentsId + ", color=" + this.color + ", page=" + this.page + ")";
    }

    public /* synthetic */ VideoTocTopItem(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VideoTocLevel.TOP.getValue() : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }

    @Override // com.medicmedia.medilink.domain.model.MultiLevelViewItem
    public int getLevel() {
        return this.level;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getPage() {
        return this.page;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTocTopItem(int i, String text, String tag, String contentsId, String color, String page) {
        super(tag, i);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(page, "page");
        this.level = i;
        this.text = text;
        this.tag = tag;
        this.contentsId = contentsId;
        this.color = color;
        this.page = page;
    }
}
