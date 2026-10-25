package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.datastore.preferences.LoginPreferencesKey;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiResponseInterface.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\n\u000b\f\rR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", ExifInterface.GPS_DIRECTION_TRUE, "", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", "getUnique", "()Ljava/lang/Object;", "CommonResponse", "News", "Maintenance", "Menu", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ApiResponseInterface<T> {
    CommonResponse getCommon();

    T getUnique();

    /* JADX INFO: compiled from: ApiResponseInterface.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008d\u0001\u00100\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "", "tokenRefresh", "", "tokenAccess", "firebaseToken", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "apiVersion", "apiDatetime", "updateFlag", "", "userRole", MLConst.MenuName.NEWS, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$News;", "maintenance", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Maintenance;", "menus", "", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Menu;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$News;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Maintenance;Ljava/util/List;)V", "getTokenRefresh", "()Ljava/lang/String;", "getTokenAccess", "getFirebaseToken", "getAppVersion", "getApiVersion", "getApiDatetime", "getUpdateFlag", "()I", "getUserRole", "getNews", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$News;", "getMaintenance", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Maintenance;", "getMenus", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CommonResponse {
        private final String apiDatetime;
        private final String apiVersion;
        private final String appVersion;
        private final String firebaseToken;
        private final Maintenance maintenance;
        private final List<Menu> menus;
        private final News news;
        private final String tokenAccess;
        private final String tokenRefresh;
        private final int updateFlag;
        private final String userRole;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CommonResponse copy$default(CommonResponse commonResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, News news, Maintenance maintenance, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = commonResponse.tokenRefresh;
            }
            if ((i2 & 2) != 0) {
                str2 = commonResponse.tokenAccess;
            }
            if ((i2 & 4) != 0) {
                str3 = commonResponse.firebaseToken;
            }
            if ((i2 & 8) != 0) {
                str4 = commonResponse.appVersion;
            }
            if ((i2 & 16) != 0) {
                str5 = commonResponse.apiVersion;
            }
            if ((i2 & 32) != 0) {
                str6 = commonResponse.apiDatetime;
            }
            if ((i2 & 64) != 0) {
                i = commonResponse.updateFlag;
            }
            if ((i2 & 128) != 0) {
                str7 = commonResponse.userRole;
            }
            if ((i2 & 256) != 0) {
                news = commonResponse.news;
            }
            if ((i2 & 512) != 0) {
                maintenance = commonResponse.maintenance;
            }
            if ((i2 & 1024) != 0) {
                list = commonResponse.menus;
            }
            Maintenance maintenance2 = maintenance;
            List list2 = list;
            String str8 = str7;
            News news2 = news;
            String str9 = str6;
            int i3 = i;
            String str10 = str5;
            String str11 = str3;
            return commonResponse.copy(str, str2, str11, str4, str10, str9, i3, str8, news2, maintenance2, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTokenRefresh() {
            return this.tokenRefresh;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Maintenance getMaintenance() {
            return this.maintenance;
        }

        public final List<Menu> component11() {
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
        public final News getNews() {
            return this.news;
        }

        public final CommonResponse copy(@Json(name = LoginPreferencesKey.COGNITO_TOKEN_REFRESH) String tokenRefresh, @Json(name = LoginPreferencesKey.COGNITO_TOKEN_ACCESS) String tokenAccess, @Json(name = "firebase_token") String firebaseToken, @Json(name = "app_version") String appVersion, @Json(name = "api_version") String apiVersion, @Json(name = "api_datetime") String apiDatetime, @Json(name = "update_flg") int updateFlag, @Json(name = "user_role") String userRole, News news, Maintenance maintenance, List<Menu> menus) {
            Intrinsics.checkNotNullParameter(firebaseToken, "firebaseToken");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            return new CommonResponse(tokenRefresh, tokenAccess, firebaseToken, appVersion, apiVersion, apiDatetime, updateFlag, userRole, news, maintenance, menus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonResponse)) {
                return false;
            }
            CommonResponse commonResponse = (CommonResponse) other;
            return Intrinsics.areEqual(this.tokenRefresh, commonResponse.tokenRefresh) && Intrinsics.areEqual(this.tokenAccess, commonResponse.tokenAccess) && Intrinsics.areEqual(this.firebaseToken, commonResponse.firebaseToken) && Intrinsics.areEqual(this.appVersion, commonResponse.appVersion) && Intrinsics.areEqual(this.apiVersion, commonResponse.apiVersion) && Intrinsics.areEqual(this.apiDatetime, commonResponse.apiDatetime) && this.updateFlag == commonResponse.updateFlag && Intrinsics.areEqual(this.userRole, commonResponse.userRole) && Intrinsics.areEqual(this.news, commonResponse.news) && Intrinsics.areEqual(this.maintenance, commonResponse.maintenance) && Intrinsics.areEqual(this.menus, commonResponse.menus);
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
            News news = this.news;
            int iHashCode6 = (iHashCode5 + (news == null ? 0 : news.hashCode())) * 31;
            Maintenance maintenance = this.maintenance;
            int iHashCode7 = (iHashCode6 + (maintenance == null ? 0 : maintenance.hashCode())) * 31;
            List<Menu> list = this.menus;
            return iHashCode7 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "CommonResponse(tokenRefresh=" + this.tokenRefresh + ", tokenAccess=" + this.tokenAccess + ", firebaseToken=" + this.firebaseToken + ", appVersion=" + this.appVersion + ", apiVersion=" + this.apiVersion + ", apiDatetime=" + this.apiDatetime + ", updateFlag=" + this.updateFlag + ", userRole=" + this.userRole + ", news=" + this.news + ", maintenance=" + this.maintenance + ", menus=" + this.menus + ")";
        }

        public CommonResponse(@Json(name = LoginPreferencesKey.COGNITO_TOKEN_REFRESH) String str, @Json(name = LoginPreferencesKey.COGNITO_TOKEN_ACCESS) String str2, @Json(name = "firebase_token") String firebaseToken, @Json(name = "app_version") String appVersion, @Json(name = "api_version") String str3, @Json(name = "api_datetime") String str4, @Json(name = "update_flg") int i, @Json(name = "user_role") String str5, News news, Maintenance maintenance, List<Menu> list) {
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
            this.news = news;
            this.maintenance = maintenance;
            this.menus = list;
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

        public final News getNews() {
            return this.news;
        }

        public final Maintenance getMaintenance() {
            return this.maintenance;
        }

        public final List<Menu> getMenus() {
            return this.menus;
        }
    }

    /* JADX INFO: compiled from: ApiResponseInterface.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$News;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "message", "url", "date", "option", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getUrl", "getDate", "getOption", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class News {
        private final String date;
        private final String message;
        private final String option;
        private final String title;
        private final String url;

        public static /* synthetic */ News copy$default(News news, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = news.title;
            }
            if ((i & 2) != 0) {
                str2 = news.message;
            }
            if ((i & 4) != 0) {
                str3 = news.url;
            }
            if ((i & 8) != 0) {
                str4 = news.date;
            }
            if ((i & 16) != 0) {
                str5 = news.option;
            }
            String str6 = str5;
            String str7 = str3;
            return news.copy(str, str2, str7, str4, str6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOption() {
            return this.option;
        }

        public final News copy(String title, String message, String url, String date, String option) {
            return new News(title, message, url, date, option);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof News)) {
                return false;
            }
            News news = (News) other;
            return Intrinsics.areEqual(this.title, news.title) && Intrinsics.areEqual(this.message, news.message) && Intrinsics.areEqual(this.url, news.url) && Intrinsics.areEqual(this.date, news.date) && Intrinsics.areEqual(this.option, news.option);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.date;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.option;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "News(title=" + this.title + ", message=" + this.message + ", url=" + this.url + ", date=" + this.date + ", option=" + this.option + ")";
        }

        public News(String str, String str2, String str3, String str4, String str5) {
            this.title = str;
            this.message = str2;
            this.url = str3;
            this.date = str4;
            this.option = str5;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getDate() {
            return this.date;
        }

        public final String getOption() {
            return this.option;
        }
    }

    /* JADX INFO: compiled from: ApiResponseInterface.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Maintenance;", "", "name", "", TtmlNode.START, TtmlNode.END, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStart", "getEnd", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Maintenance {
        private final String end;
        private final String name;
        private final String start;
        private final String text;

        public static /* synthetic */ Maintenance copy$default(Maintenance maintenance, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = maintenance.name;
            }
            if ((i & 2) != 0) {
                str2 = maintenance.start;
            }
            if ((i & 4) != 0) {
                str3 = maintenance.end;
            }
            if ((i & 8) != 0) {
                str4 = maintenance.text;
            }
            return maintenance.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Maintenance copy(String name, String start, String end, String text) {
            return new Maintenance(name, start, end, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Maintenance)) {
                return false;
            }
            Maintenance maintenance = (Maintenance) other;
            return Intrinsics.areEqual(this.name, maintenance.name) && Intrinsics.areEqual(this.start, maintenance.start) && Intrinsics.areEqual(this.end, maintenance.end) && Intrinsics.areEqual(this.text, maintenance.text);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.start;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.end;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.text;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Maintenance(name=" + this.name + ", start=" + this.start + ", end=" + this.end + ", text=" + this.text + ")";
        }

        public Maintenance(String str, String str2, String str3, String str4) {
            this.name = str;
            this.start = str2;
            this.end = str3;
            this.text = str4;
        }

        public final String getName() {
            return this.name;
        }

        public final String getStart() {
            return this.start;
        }

        public final String getEnd() {
            return this.end;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* JADX INFO: compiled from: ApiResponseInterface.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$Menu;", "", "name", "", Constants.ScionAnalytics.PARAM_LABEL, "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getLabel", "getDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Menu {
        private final String date;
        private final String label;
        private final String name;

        public static /* synthetic */ Menu copy$default(Menu menu, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = menu.name;
            }
            if ((i & 2) != 0) {
                str2 = menu.label;
            }
            if ((i & 4) != 0) {
                str3 = menu.date;
            }
            return menu.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final Menu copy(String name, String label, String date) {
            return new Menu(name, label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Menu)) {
                return false;
            }
            Menu menu = (Menu) other;
            return Intrinsics.areEqual(this.name, menu.name) && Intrinsics.areEqual(this.label, menu.label) && Intrinsics.areEqual(this.date, menu.date);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.date;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Menu(name=" + this.name + ", label=" + this.label + ", date=" + this.date + ")";
        }

        public Menu(String str, String str2, String str3) {
            this.name = str;
            this.label = str2;
            this.date = str3;
        }

        public final String getName() {
            return this.name;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getDate() {
            return this.date;
        }
    }
}
