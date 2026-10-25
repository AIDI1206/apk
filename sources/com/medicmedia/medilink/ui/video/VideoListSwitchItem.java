package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListSwitchItem;", "", "isCheck", "", "onCheckedChange", "Lkotlin/Function1;", "", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "()Z", "getOnCheckedChange", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListSwitchItem {
    public static final int $stable = 0;
    private final boolean isCheck;
    private final Function1<Boolean, Unit> onCheckedChange;

    public VideoListSwitchItem() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoListSwitchItem copy$default(VideoListSwitchItem videoListSwitchItem, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoListSwitchItem.isCheck;
        }
        if ((i & 2) != 0) {
            function1 = videoListSwitchItem.onCheckedChange;
        }
        return videoListSwitchItem.copy(z, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    public final Function1<Boolean, Unit> component2() {
        return this.onCheckedChange;
    }

    public final VideoListSwitchItem copy(boolean isCheck, Function1<? super Boolean, Unit> onCheckedChange) {
        return new VideoListSwitchItem(isCheck, onCheckedChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListSwitchItem)) {
            return false;
        }
        VideoListSwitchItem videoListSwitchItem = (VideoListSwitchItem) other;
        return this.isCheck == videoListSwitchItem.isCheck && Intrinsics.areEqual(this.onCheckedChange, videoListSwitchItem.onCheckedChange);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCheck) * 31;
        Function1<Boolean, Unit> function1 = this.onCheckedChange;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public String toString() {
        return "VideoListSwitchItem(isCheck=" + this.isCheck + ", onCheckedChange=" + this.onCheckedChange + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoListSwitchItem(boolean z, Function1<? super Boolean, Unit> function1) {
        this.isCheck = z;
        this.onCheckedChange = function1;
    }

    public /* synthetic */ VideoListSwitchItem(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : function1);
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final Function1<Boolean, Unit> getOnCheckedChange() {
        return this.onCheckedChange;
    }
}
