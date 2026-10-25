package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoCondition;", "", "viewConditionId", "", "conditionTarget", "", "licenseCodes", "conditionValid", "conditionExpireDate", "updatedDate", "isMaster", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getViewConditionId", "()I", "getConditionTarget", "()Ljava/lang/String;", "getLicenseCodes", "getConditionValid", "getConditionExpireDate", "getUpdatedDate", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoCondition {
    private final String conditionExpireDate;
    private final String conditionTarget;
    private final String conditionValid;
    private final boolean isMaster;
    private final String licenseCodes;
    private final String updatedDate;
    private final int viewConditionId;

    public static /* synthetic */ VideoCondition copy$default(VideoCondition videoCondition, int i, String str, String str2, String str3, String str4, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoCondition.viewConditionId;
        }
        if ((i2 & 2) != 0) {
            str = videoCondition.conditionTarget;
        }
        if ((i2 & 4) != 0) {
            str2 = videoCondition.licenseCodes;
        }
        if ((i2 & 8) != 0) {
            str3 = videoCondition.conditionValid;
        }
        if ((i2 & 16) != 0) {
            str4 = videoCondition.conditionExpireDate;
        }
        if ((i2 & 32) != 0) {
            str5 = videoCondition.updatedDate;
        }
        if ((i2 & 64) != 0) {
            z = videoCondition.isMaster;
        }
        String str6 = str5;
        boolean z2 = z;
        String str7 = str4;
        String str8 = str2;
        return videoCondition.copy(i, str, str8, str3, str7, str6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewConditionId() {
        return this.viewConditionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConditionTarget() {
        return this.conditionTarget;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLicenseCodes() {
        return this.licenseCodes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConditionValid() {
        return this.conditionValid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConditionExpireDate() {
        return this.conditionExpireDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsMaster() {
        return this.isMaster;
    }

    public final VideoCondition copy(int viewConditionId, String conditionTarget, String licenseCodes, String conditionValid, String conditionExpireDate, String updatedDate, boolean isMaster) {
        return new VideoCondition(viewConditionId, conditionTarget, licenseCodes, conditionValid, conditionExpireDate, updatedDate, isMaster);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCondition)) {
            return false;
        }
        VideoCondition videoCondition = (VideoCondition) other;
        return this.viewConditionId == videoCondition.viewConditionId && Intrinsics.areEqual(this.conditionTarget, videoCondition.conditionTarget) && Intrinsics.areEqual(this.licenseCodes, videoCondition.licenseCodes) && Intrinsics.areEqual(this.conditionValid, videoCondition.conditionValid) && Intrinsics.areEqual(this.conditionExpireDate, videoCondition.conditionExpireDate) && Intrinsics.areEqual(this.updatedDate, videoCondition.updatedDate) && this.isMaster == videoCondition.isMaster;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.viewConditionId) * 31;
        String str = this.conditionTarget;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.licenseCodes;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.conditionValid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conditionExpireDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.updatedDate;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMaster);
    }

    public String toString() {
        return "VideoCondition(viewConditionId=" + this.viewConditionId + ", conditionTarget=" + this.conditionTarget + ", licenseCodes=" + this.licenseCodes + ", conditionValid=" + this.conditionValid + ", conditionExpireDate=" + this.conditionExpireDate + ", updatedDate=" + this.updatedDate + ", isMaster=" + this.isMaster + ")";
    }

    public VideoCondition(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.viewConditionId = i;
        this.conditionTarget = str;
        this.licenseCodes = str2;
        this.conditionValid = str3;
        this.conditionExpireDate = str4;
        this.updatedDate = str5;
        this.isMaster = z;
    }

    public final int getViewConditionId() {
        return this.viewConditionId;
    }

    public final String getConditionTarget() {
        return this.conditionTarget;
    }

    public final String getLicenseCodes() {
        return this.licenseCodes;
    }

    public final String getConditionValid() {
        return this.conditionValid;
    }

    public final String getConditionExpireDate() {
        return this.conditionExpireDate;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public final boolean isMaster() {
        return this.isMaster;
    }
}
