package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoTocItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u0003H×\u0001J\t\u0010#\u001a\u00020\u0005H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocSecondItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", FirebaseAnalytics.Param.LEVEL, "", "tag", "", "text", "contentsId", "color", "heading", "headingOut", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()I", "getTag", "()Ljava/lang/String;", "getText", "getContentsId", "getColor", "getHeading", "getHeadingOut", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoTocSecondItem extends MultiLevelViewItem {
    public static final int $stable = 0;
    private final String color;
    private final String contentsId;
    private final String heading;
    private final String headingOut;
    private final int level;
    private final String tag;
    private final String text;

    public VideoTocSecondItem() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ VideoTocSecondItem copy$default(VideoTocSecondItem videoTocSecondItem, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoTocSecondItem.level;
        }
        if ((i2 & 2) != 0) {
            str = videoTocSecondItem.tag;
        }
        if ((i2 & 4) != 0) {
            str2 = videoTocSecondItem.text;
        }
        if ((i2 & 8) != 0) {
            str3 = videoTocSecondItem.contentsId;
        }
        if ((i2 & 16) != 0) {
            str4 = videoTocSecondItem.color;
        }
        if ((i2 & 32) != 0) {
            str5 = videoTocSecondItem.heading;
        }
        if ((i2 & 64) != 0) {
            str6 = videoTocSecondItem.headingOut;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return videoTocSecondItem.copy(i, str, str10, str3, str9, str7, str8);
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHeadingOut() {
        return this.headingOut;
    }

    public final VideoTocSecondItem copy(int level, String tag, String text, String contentsId, String color, String heading, String headingOut) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(headingOut, "headingOut");
        return new VideoTocSecondItem(level, tag, text, contentsId, color, heading, headingOut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTocSecondItem)) {
            return false;
        }
        VideoTocSecondItem videoTocSecondItem = (VideoTocSecondItem) other;
        return this.level == videoTocSecondItem.level && Intrinsics.areEqual(this.tag, videoTocSecondItem.tag) && Intrinsics.areEqual(this.text, videoTocSecondItem.text) && Intrinsics.areEqual(this.contentsId, videoTocSecondItem.contentsId) && Intrinsics.areEqual(this.color, videoTocSecondItem.color) && Intrinsics.areEqual(this.heading, videoTocSecondItem.heading) && Intrinsics.areEqual(this.headingOut, videoTocSecondItem.headingOut);
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.level) * 31) + this.tag.hashCode()) * 31) + this.text.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.color.hashCode()) * 31;
        String str = this.heading;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.headingOut.hashCode();
    }

    public String toString() {
        return "VideoTocSecondItem(level=" + this.level + ", tag=" + this.tag + ", text=" + this.text + ", contentsId=" + this.contentsId + ", color=" + this.color + ", heading=" + this.heading + ", headingOut=" + this.headingOut + ")";
    }

    public /* synthetic */ VideoTocSecondItem(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VideoTocLevel.SECOND.getValue() : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? "" : str6);
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

    public final String getHeading() {
        return this.heading;
    }

    public final String getHeadingOut() {
        return this.headingOut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTocSecondItem(int i, String tag, String text, String contentsId, String color, String str, String headingOut) {
        super(tag, i);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(headingOut, "headingOut");
        this.level = i;
        this.tag = tag;
        this.text = text;
        this.contentsId = contentsId;
        this.color = color;
        this.heading = str;
        this.headingOut = headingOut;
    }
}
