package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.response.BaristaUserInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaUserInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toItem", "Lcom/medicmedia/medilink/domain/model/BaristaUserInfo;", "Lcom/medicmedia/medilink/core/network/api/response/BaristaUserInfoResponse;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BaristaUserInfoKt {
    public static final BaristaUserInfo toItem(BaristaUserInfoResponse baristaUserInfoResponse) {
        Intrinsics.checkNotNullParameter(baristaUserInfoResponse, "<this>");
        String sub = baristaUserInfoResponse.getSub();
        String memberId = baristaUserInfoResponse.getMemberId();
        String jobCategoryId = baristaUserInfoResponse.getJobCategoryId();
        if (jobCategoryId == null) {
            jobCategoryId = "-1";
        }
        String collegeGrade = baristaUserInfoResponse.getCollegeGrade();
        if (collegeGrade == null) {
            collegeGrade = "-1";
        }
        String collegeId = baristaUserInfoResponse.getCollegeId();
        if (collegeId == null) {
            collegeId = "-1";
        }
        String collegeDepartmentId = baristaUserInfoResponse.getCollegeDepartmentId();
        if (collegeDepartmentId == null) {
            collegeDepartmentId = "-1";
        }
        String collegeYear = baristaUserInfoResponse.getCollegeYear();
        if (collegeYear == null) {
            collegeYear = "-1";
        }
        return new BaristaUserInfo(sub, memberId, jobCategoryId, collegeGrade, collegeId, collegeDepartmentId, collegeYear, baristaUserInfoResponse.getUpdatedDate());
    }
}
