package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaUserInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J]\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BaristaUserInfo;", "", HistoryRepositoryImpl.FieldName.SUB, "", "memberId", "jobCategoryId", "collegeGrade", "collegeId", "collegeDepartmentId", "collegeYear", "updatedDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getSub", "()Ljava/lang/String;", "getMemberId", "getJobCategoryId", "getCollegeGrade", "getCollegeId", "getCollegeDepartmentId", "getCollegeYear", "getUpdatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaUserInfo {
    private final String collegeDepartmentId;
    private final String collegeGrade;
    private final String collegeId;
    private final String collegeYear;
    private final String jobCategoryId;
    private final String memberId;
    private final String sub;
    private final long updatedDate;

    public static /* synthetic */ BaristaUserInfo copy$default(BaristaUserInfo baristaUserInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaUserInfo.sub;
        }
        if ((i & 2) != 0) {
            str2 = baristaUserInfo.memberId;
        }
        if ((i & 4) != 0) {
            str3 = baristaUserInfo.jobCategoryId;
        }
        if ((i & 8) != 0) {
            str4 = baristaUserInfo.collegeGrade;
        }
        if ((i & 16) != 0) {
            str5 = baristaUserInfo.collegeId;
        }
        if ((i & 32) != 0) {
            str6 = baristaUserInfo.collegeDepartmentId;
        }
        if ((i & 64) != 0) {
            str7 = baristaUserInfo.collegeYear;
        }
        if ((i & 128) != 0) {
            j = baristaUserInfo.updatedDate;
        }
        long j2 = j;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return baristaUserInfo.copy(str, str2, str11, str4, str10, str8, str9, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSub() {
        return this.sub;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJobCategoryId() {
        return this.jobCategoryId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCollegeGrade() {
        return this.collegeGrade;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCollegeId() {
        return this.collegeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCollegeDepartmentId() {
        return this.collegeDepartmentId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCollegeYear() {
        return this.collegeYear;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final BaristaUserInfo copy(String sub, String memberId, String jobCategoryId, String collegeGrade, String collegeId, String collegeDepartmentId, String collegeYear, long updatedDate) {
        Intrinsics.checkNotNullParameter(jobCategoryId, "jobCategoryId");
        Intrinsics.checkNotNullParameter(collegeGrade, "collegeGrade");
        Intrinsics.checkNotNullParameter(collegeId, "collegeId");
        Intrinsics.checkNotNullParameter(collegeDepartmentId, "collegeDepartmentId");
        Intrinsics.checkNotNullParameter(collegeYear, "collegeYear");
        return new BaristaUserInfo(sub, memberId, jobCategoryId, collegeGrade, collegeId, collegeDepartmentId, collegeYear, updatedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaUserInfo)) {
            return false;
        }
        BaristaUserInfo baristaUserInfo = (BaristaUserInfo) other;
        return Intrinsics.areEqual(this.sub, baristaUserInfo.sub) && Intrinsics.areEqual(this.memberId, baristaUserInfo.memberId) && Intrinsics.areEqual(this.jobCategoryId, baristaUserInfo.jobCategoryId) && Intrinsics.areEqual(this.collegeGrade, baristaUserInfo.collegeGrade) && Intrinsics.areEqual(this.collegeId, baristaUserInfo.collegeId) && Intrinsics.areEqual(this.collegeDepartmentId, baristaUserInfo.collegeDepartmentId) && Intrinsics.areEqual(this.collegeYear, baristaUserInfo.collegeYear) && this.updatedDate == baristaUserInfo.updatedDate;
    }

    public int hashCode() {
        String str = this.sub;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        return ((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.jobCategoryId.hashCode()) * 31) + this.collegeGrade.hashCode()) * 31) + this.collegeId.hashCode()) * 31) + this.collegeDepartmentId.hashCode()) * 31) + this.collegeYear.hashCode()) * 31) + Long.hashCode(this.updatedDate);
    }

    public String toString() {
        return "BaristaUserInfo(sub=" + this.sub + ", memberId=" + this.memberId + ", jobCategoryId=" + this.jobCategoryId + ", collegeGrade=" + this.collegeGrade + ", collegeId=" + this.collegeId + ", collegeDepartmentId=" + this.collegeDepartmentId + ", collegeYear=" + this.collegeYear + ", updatedDate=" + this.updatedDate + ")";
    }

    public BaristaUserInfo(String str, String str2, String jobCategoryId, String collegeGrade, String collegeId, String collegeDepartmentId, String collegeYear, long j) {
        Intrinsics.checkNotNullParameter(jobCategoryId, "jobCategoryId");
        Intrinsics.checkNotNullParameter(collegeGrade, "collegeGrade");
        Intrinsics.checkNotNullParameter(collegeId, "collegeId");
        Intrinsics.checkNotNullParameter(collegeDepartmentId, "collegeDepartmentId");
        Intrinsics.checkNotNullParameter(collegeYear, "collegeYear");
        this.sub = str;
        this.memberId = str2;
        this.jobCategoryId = jobCategoryId;
        this.collegeGrade = collegeGrade;
        this.collegeId = collegeId;
        this.collegeDepartmentId = collegeDepartmentId;
        this.collegeYear = collegeYear;
        this.updatedDate = j;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getJobCategoryId() {
        return this.jobCategoryId;
    }

    public final String getCollegeGrade() {
        return this.collegeGrade;
    }

    public final String getCollegeId() {
        return this.collegeId;
    }

    public final String getCollegeDepartmentId() {
        return this.collegeDepartmentId;
    }

    public final String getCollegeYear() {
        return this.collegeYear;
    }

    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
