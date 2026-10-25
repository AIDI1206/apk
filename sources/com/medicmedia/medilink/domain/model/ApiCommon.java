package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.MLConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiCommon.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008d\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ApiCommon;", "", "tokenRefresh", "", "tokenAccess", "firebaseToken", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "apiVersion", "apiDatetime", "updateFlag", "", "userRole", MLConst.MenuName.NEWS, "Lcom/medicmedia/medilink/domain/model/CommonNews;", "maintenance", "Lcom/medicmedia/medilink/domain/model/ApiMaintenance;", "menus", "", "Lcom/medicmedia/medilink/domain/model/CommonMenu;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/medicmedia/medilink/domain/model/CommonNews;Lcom/medicmedia/medilink/domain/model/ApiMaintenance;Ljava/util/List;)V", "getTokenRefresh", "()Ljava/lang/String;", "getTokenAccess", "getFirebaseToken", "getAppVersion", "getApiVersion", "getApiDatetime", "getUpdateFlag", "()I", "getUserRole", "getNews", "()Lcom/medicmedia/medilink/domain/model/CommonNews;", "getMaintenance", "()Lcom/medicmedia/medilink/domain/model/ApiMaintenance;", "getMenus", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ApiCommon {
    private final String apiDatetime;
    private final String apiVersion;
    private final String appVersion;
    private final String firebaseToken;
    private final ApiMaintenance maintenance;
    private final List<CommonMenu> menus;
    private final CommonNews news;
    private final String tokenAccess;
    private final String tokenRefresh;
    private final int updateFlag;
    private final String userRole;

    public ApiCommon() {
        this(null, null, null, null, null, null, 0, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiCommon copy$default(ApiCommon apiCommon, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, CommonNews commonNews, ApiMaintenance apiMaintenance, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apiCommon.tokenRefresh;
        }
        if ((i2 & 2) != 0) {
            str2 = apiCommon.tokenAccess;
        }
        if ((i2 & 4) != 0) {
            str3 = apiCommon.firebaseToken;
        }
        if ((i2 & 8) != 0) {
            str4 = apiCommon.appVersion;
        }
        if ((i2 & 16) != 0) {
            str5 = apiCommon.apiVersion;
        }
        if ((i2 & 32) != 0) {
            str6 = apiCommon.apiDatetime;
        }
        if ((i2 & 64) != 0) {
            i = apiCommon.updateFlag;
        }
        if ((i2 & 128) != 0) {
            str7 = apiCommon.userRole;
        }
        if ((i2 & 256) != 0) {
            commonNews = apiCommon.news;
        }
        if ((i2 & 512) != 0) {
            apiMaintenance = apiCommon.maintenance;
        }
        if ((i2 & 1024) != 0) {
            list = apiCommon.menus;
        }
        ApiMaintenance apiMaintenance2 = apiMaintenance;
        List list2 = list;
        String str8 = str7;
        CommonNews commonNews2 = commonNews;
        String str9 = str6;
        int i3 = i;
        String str10 = str5;
        String str11 = str3;
        return apiCommon.copy(str, str2, str11, str4, str10, str9, i3, str8, commonNews2, apiMaintenance2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenRefresh() {
        return this.tokenRefresh;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ApiMaintenance getMaintenance() {
        return this.maintenance;
    }

    public final List<CommonMenu> component11() {
        return this.menus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenAccess() {
        return this.tokenAccess;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApiDatetime() {
        return this.apiDatetime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getUpdateFlag() {
        return this.updateFlag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserRole() {
        return this.userRole;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CommonNews getNews() {
        return this.news;
    }

    public final ApiCommon copy(String tokenRefresh, String tokenAccess, String firebaseToken, String appVersion, String apiVersion, String apiDatetime, int updateFlag, String userRole, CommonNews news, ApiMaintenance maintenance, List<CommonMenu> menus) {
        Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new ApiCommon(tokenRefresh, tokenAccess, firebaseToken, appVersion, apiVersion, apiDatetime, updateFlag, userRole, news, maintenance, menus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiCommon)) {
            return false;
        }
        ApiCommon apiCommon = (ApiCommon) other;
        return Intrinsics.areEqual(this.tokenRefresh, apiCommon.tokenRefresh) && Intrinsics.areEqual(this.tokenAccess, apiCommon.tokenAccess) && Intrinsics.areEqual(this.firebaseToken, apiCommon.firebaseToken) && Intrinsics.areEqual(this.appVersion, apiCommon.appVersion) && Intrinsics.areEqual(this.apiVersion, apiCommon.apiVersion) && Intrinsics.areEqual(this.apiDatetime, apiCommon.apiDatetime) && this.updateFlag == apiCommon.updateFlag && Intrinsics.areEqual(this.userRole, apiCommon.userRole) && Intrinsics.areEqual(this.news, apiCommon.news) && Intrinsics.areEqual(this.maintenance, apiCommon.maintenance) && Intrinsics.areEqual(this.menus, apiCommon.menus);
    }

    public int hashCode() {
        String str = this.tokenRefresh;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenAccess;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.firebaseToken.hashCode()) * 31) + this.appVersion.hashCode()) * 31;
        String str3 = this.apiVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.apiDatetime;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.updateFlag)) * 31;
        String str5 = this.userRole;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CommonNews commonNews = this.news;
        int iHashCode6 = (iHashCode5 + (commonNews == null ? 0 : commonNews.hashCode())) * 31;
        ApiMaintenance apiMaintenance = this.maintenance;
        int iHashCode7 = (iHashCode6 + (apiMaintenance == null ? 0 : apiMaintenance.hashCode())) * 31;
        List<CommonMenu> list = this.menus;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ApiCommon(tokenRefresh=" + this.tokenRefresh + ", tokenAccess=" + this.tokenAccess + ", firebaseToken=" + this.firebaseToken + ", appVersion=" + this.appVersion + ", apiVersion=" + this.apiVersion + ", apiDatetime=" + this.apiDatetime + ", updateFlag=" + this.updateFlag + ", userRole=" + this.userRole + ", news=" + this.news + ", maintenance=" + this.maintenance + ", menus=" + this.menus + ")";
    }

    public ApiCommon(String str, String str2, String firebaseToken, String appVersion, String str3, String str4, int i, String str5, CommonNews commonNews, ApiMaintenance apiMaintenance, List<CommonMenu> list) {
        Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.tokenRefresh = str;
        this.tokenAccess = str2;
        this.firebaseToken = firebaseToken;
        this.appVersion = appVersion;
        this.apiVersion = str3;
        this.apiDatetime = str4;
        this.updateFlag = i;
        this.userRole = str5;
        this.news = commonNews;
        this.maintenance = apiMaintenance;
        this.menus = list;
    }

    public /* synthetic */ ApiCommon(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, CommonNews commonNews, ApiMaintenance apiMaintenance, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : commonNews, (i2 & 512) != 0 ? null : apiMaintenance, (i2 & 1024) != 0 ? null : list);
    }

    public final String getTokenRefresh() {
        return this.tokenRefresh;
    }

    public final String getTokenAccess() {
        return this.tokenAccess;
    }

    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final String getApiDatetime() {
        return this.apiDatetime;
    }

    public final int getUpdateFlag() {
        return this.updateFlag;
    }

    public final String getUserRole() {
        return this.userRole;
    }

    public final CommonNews getNews() {
        return this.news;
    }

    public final ApiMaintenance getMaintenance() {
        return this.maintenance;
    }

    public final List<CommonMenu> getMenus() {
        return this.menus;
    }
}
