package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoWebinar;", "", "meetingNumber", "", "password", "leaveUrl", "memberIdPname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMeetingNumber", "()Ljava/lang/String;", "getPassword", "getLeaveUrl", "getMemberIdPname", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoWebinar {
    private final String leaveUrl;
    private final String meetingNumber;
    private final String memberIdPname;
    private final String password;

    public static /* synthetic */ VideoWebinar copy$default(VideoWebinar videoWebinar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoWebinar.meetingNumber;
        }
        if ((i & 2) != 0) {
            str2 = videoWebinar.password;
        }
        if ((i & 4) != 0) {
            str3 = videoWebinar.leaveUrl;
        }
        if ((i & 8) != 0) {
            str4 = videoWebinar.memberIdPname;
        }
        return videoWebinar.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeetingNumber() {
        return this.meetingNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeaveUrl() {
        return this.leaveUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemberIdPname() {
        return this.memberIdPname;
    }

    public final VideoWebinar copy(String meetingNumber, String password, String leaveUrl, String memberIdPname) {
        return new VideoWebinar(meetingNumber, password, leaveUrl, memberIdPname);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoWebinar)) {
            return false;
        }
        VideoWebinar videoWebinar = (VideoWebinar) other;
        return Intrinsics.areEqual(this.meetingNumber, videoWebinar.meetingNumber) && Intrinsics.areEqual(this.password, videoWebinar.password) && Intrinsics.areEqual(this.leaveUrl, videoWebinar.leaveUrl) && Intrinsics.areEqual(this.memberIdPname, videoWebinar.memberIdPname);
    }

    public int hashCode() {
        String str = this.meetingNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leaveUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.memberIdPname;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "VideoWebinar(meetingNumber=" + this.meetingNumber + ", password=" + this.password + ", leaveUrl=" + this.leaveUrl + ", memberIdPname=" + this.memberIdPname + ")";
    }

    public VideoWebinar(String str, String str2, String str3, String str4) {
        this.meetingNumber = str;
        this.password = str2;
        this.leaveUrl = str3;
        this.memberIdPname = str4;
    }

    public final String getMeetingNumber() {
        return this.meetingNumber;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getLeaveUrl() {
        return this.leaveUrl;
    }

    public final String getMemberIdPname() {
        return this.memberIdPname;
    }
}
