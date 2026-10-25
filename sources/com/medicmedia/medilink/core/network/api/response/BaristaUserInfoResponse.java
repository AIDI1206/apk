package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.medicmedia.medilink.analytics.FirebaseAnalyticsClient;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.squareup.moshi.Json;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaUserInfoResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001c\u001a\u00020\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003Ji\u0010%\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/BaristaUserInfoResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", HistoryRepositoryImpl.FieldName.SUB, "", "memberId", "jobCategoryId", "collegeGrade", "collegeId", "collegeDepartmentId", "collegeYear", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getSub", "()Ljava/lang/String;", "getMemberId", "getJobCategoryId", "getCollegeGrade", "getCollegeId", "getCollegeDepartmentId", "getCollegeYear", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "updatedDate", "", "getUpdatedDate", "()J", "convertToJsonString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaUserInfoResponse implements ApiResponseErrorInterface {
    private final String collegeDepartmentId;
    private final String collegeGrade;
    private final String collegeId;
    private final String collegeYear;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final String jobCategoryId;
    private final String memberId;
    private final String sub;

    public static /* synthetic */ BaristaUserInfoResponse copy$default(BaristaUserInfoResponse baristaUserInfoResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaUserInfoResponse.sub;
        }
        if ((i & 2) != 0) {
            str2 = baristaUserInfoResponse.memberId;
        }
        if ((i & 4) != 0) {
            str3 = baristaUserInfoResponse.jobCategoryId;
        }
        if ((i & 8) != 0) {
            str4 = baristaUserInfoResponse.collegeGrade;
        }
        if ((i & 16) != 0) {
            str5 = baristaUserInfoResponse.collegeId;
        }
        if ((i & 32) != 0) {
            str6 = baristaUserInfoResponse.collegeDepartmentId;
        }
        if ((i & 64) != 0) {
            str7 = baristaUserInfoResponse.collegeYear;
        }
        if ((i & 128) != 0) {
            errorResponse = baristaUserInfoResponse.error;
        }
        String str8 = str7;
        ApiResponseErrorInterface.ErrorResponse errorResponse2 = errorResponse;
        String str9 = str5;
        String str10 = str6;
        return baristaUserInfoResponse.copy(str, str2, str3, str4, str9, str10, str8, errorResponse2);
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
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final BaristaUserInfoResponse copy(@Json(name = HistoryRepositoryImpl.FieldName.SUB) String sub, @Json(name = "member_id") String memberId, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.JOB_CATEGORY_ID) String jobCategoryId, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_GRADE) String collegeGrade, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_ID) String collegeId, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_DEPARTMENT_ID) String collegeDepartmentId, @Json(name = "college_year") String collegeYear, ApiResponseErrorInterface.ErrorResponse error) {
        return new BaristaUserInfoResponse(sub, memberId, jobCategoryId, collegeGrade, collegeId, collegeDepartmentId, collegeYear, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaUserInfoResponse)) {
            return false;
        }
        BaristaUserInfoResponse baristaUserInfoResponse = (BaristaUserInfoResponse) other;
        return Intrinsics.areEqual(this.sub, baristaUserInfoResponse.sub) && Intrinsics.areEqual(this.memberId, baristaUserInfoResponse.memberId) && Intrinsics.areEqual(this.jobCategoryId, baristaUserInfoResponse.jobCategoryId) && Intrinsics.areEqual(this.collegeGrade, baristaUserInfoResponse.collegeGrade) && Intrinsics.areEqual(this.collegeId, baristaUserInfoResponse.collegeId) && Intrinsics.areEqual(this.collegeDepartmentId, baristaUserInfoResponse.collegeDepartmentId) && Intrinsics.areEqual(this.collegeYear, baristaUserInfoResponse.collegeYear) && Intrinsics.areEqual(this.error, baristaUserInfoResponse.error);
    }

    public int hashCode() {
        String str = this.sub;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jobCategoryId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collegeGrade;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.collegeId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.collegeDepartmentId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.collegeYear;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        return iHashCode7 + (errorResponse != null ? errorResponse.hashCode() : 0);
    }

    public String toString() {
        return "BaristaUserInfoResponse(sub=" + this.sub + ", memberId=" + this.memberId + ", jobCategoryId=" + this.jobCategoryId + ", collegeGrade=" + this.collegeGrade + ", collegeId=" + this.collegeId + ", collegeDepartmentId=" + this.collegeDepartmentId + ", collegeYear=" + this.collegeYear + ", error=" + this.error + ")";
    }

    public BaristaUserInfoResponse(@Json(name = HistoryRepositoryImpl.FieldName.SUB) String str, @Json(name = "member_id") String str2, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.JOB_CATEGORY_ID) String str3, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_GRADE) String str4, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_ID) String str5, @Json(name = FirebaseAnalyticsClient.UserPropertyKey.COLLEGE_DEPARTMENT_ID) String str6, @Json(name = "college_year") String str7, ApiResponseErrorInterface.ErrorResponse errorResponse) {
        this.sub = str;
        this.memberId = str2;
        this.jobCategoryId = str3;
        this.collegeGrade = str4;
        this.collegeId = str5;
        this.collegeDepartmentId = str6;
        this.collegeYear = str7;
        this.error = errorResponse;
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

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final long getUpdatedDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        return calendar.getTimeInMillis();
    }

    public final String convertToJsonString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
