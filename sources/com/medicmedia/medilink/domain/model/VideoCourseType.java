package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoCourseType;", "", "id", "", "courseId", "", "courseType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "getId", "()Ljava/lang/String;", "getCourseId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseType", "()I", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;I)Lcom/medicmedia/medilink/domain/model/VideoCourseType;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoCourseType {
    private final Integer courseId;
    private final int courseType;
    private final String id;

    public static /* synthetic */ VideoCourseType copy$default(VideoCourseType videoCourseType, String str, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoCourseType.id;
        }
        if ((i2 & 2) != 0) {
            num = videoCourseType.courseId;
        }
        if ((i2 & 4) != 0) {
            i = videoCourseType.courseType;
        }
        return videoCourseType.copy(str, num, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCourseType() {
        return this.courseType;
    }

    public final VideoCourseType copy(String id, Integer courseId, int courseType) {
        return new VideoCourseType(id, courseId, courseType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCourseType)) {
            return false;
        }
        VideoCourseType videoCourseType = (VideoCourseType) other;
        return Intrinsics.areEqual(this.id, videoCourseType.id) && Intrinsics.areEqual(this.courseId, videoCourseType.courseId) && this.courseType == videoCourseType.courseType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.courseId;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.courseType);
    }

    public String toString() {
        return "VideoCourseType(id=" + this.id + ", courseId=" + this.courseId + ", courseType=" + this.courseType + ")";
    }

    public VideoCourseType(String str, Integer num, int i) {
        this.id = str;
        this.courseId = num;
        this.courseType = i;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getCourseId() {
        return this.courseId;
    }

    public final int getCourseType() {
        return this.courseType;
    }
}
