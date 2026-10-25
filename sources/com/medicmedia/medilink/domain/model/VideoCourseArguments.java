package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseArguments.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoCourseArguments;", "", "item", "Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "isList", "", "playSec", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/VideoCourseItem;ZLjava/lang/String;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "()Z", "getPlaySec", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoCourseArguments {
    private final boolean isList;
    private final VideoCourseItem item;
    private final String playSec;

    public static /* synthetic */ VideoCourseArguments copy$default(VideoCourseArguments videoCourseArguments, VideoCourseItem videoCourseItem, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            videoCourseItem = videoCourseArguments.item;
        }
        if ((i & 2) != 0) {
            z = videoCourseArguments.isList;
        }
        if ((i & 4) != 0) {
            str = videoCourseArguments.playSec;
        }
        return videoCourseArguments.copy(videoCourseItem, z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoCourseItem getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsList() {
        return this.isList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaySec() {
        return this.playSec;
    }

    public final VideoCourseArguments copy(VideoCourseItem item, boolean isList, String playSec) {
        return new VideoCourseArguments(item, isList, playSec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCourseArguments)) {
            return false;
        }
        VideoCourseArguments videoCourseArguments = (VideoCourseArguments) other;
        return Intrinsics.areEqual(this.item, videoCourseArguments.item) && this.isList == videoCourseArguments.isList && Intrinsics.areEqual(this.playSec, videoCourseArguments.playSec);
    }

    public int hashCode() {
        VideoCourseItem videoCourseItem = this.item;
        int iHashCode = (((videoCourseItem == null ? 0 : videoCourseItem.hashCode()) * 31) + Boolean.hashCode(this.isList)) * 31;
        String str = this.playSec;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VideoCourseArguments(item=" + this.item + ", isList=" + this.isList + ", playSec=" + this.playSec + ")";
    }

    public VideoCourseArguments(VideoCourseItem videoCourseItem, boolean z, String str) {
        this.item = videoCourseItem;
        this.isList = z;
        this.playSec = str;
    }

    public /* synthetic */ VideoCourseArguments(VideoCourseItem videoCourseItem, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoCourseItem, z, (i & 4) != 0 ? null : str);
    }

    public final VideoCourseItem getItem() {
        return this.item;
    }

    public final boolean isList() {
        return this.isList;
    }

    public final String getPlaySec() {
        return this.playSec;
    }
}
