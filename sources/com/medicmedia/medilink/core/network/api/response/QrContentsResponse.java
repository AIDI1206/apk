package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrContentsResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse;", "", "qrCode", "", "displayContents", "", "Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayContent;", "displayData", "Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayDataInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getQrCode", "()Ljava/lang/String;", "getDisplayContents", "()Ljava/util/List;", "getDisplayData", "DisplayContent", "DisplayDataInfo", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class QrContentsResponse {
    private final List<DisplayContent> displayContents;
    private final List<DisplayDataInfo> displayData;
    private final String qrCode;

    public QrContentsResponse(@Json(name = "qr_code") String qrCode, @Json(name = "display_contents") List<DisplayContent> displayContents, @Json(name = "display_data") List<DisplayDataInfo> displayData) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(displayContents, "displayContents");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        this.qrCode = qrCode;
        this.displayContents = displayContents;
        this.displayData = displayData;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final List<DisplayContent> getDisplayContents() {
        return this.displayContents;
    }

    public final List<DisplayDataInfo> getDisplayData() {
        return this.displayData;
    }

    /* JADX INFO: compiled from: QrContentsResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayContent;", "", "titleName", "", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitleName", "()Ljava/lang/String;", "getMode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DisplayContent {
        private final String mode;
        private final String titleName;

        public static /* synthetic */ DisplayContent copy$default(DisplayContent displayContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = displayContent.titleName;
            }
            if ((i & 2) != 0) {
                str2 = displayContent.mode;
            }
            return displayContent.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitleName() {
            return this.titleName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        public final DisplayContent copy(@Json(name = "title_name") String titleName, String mode) {
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new DisplayContent(titleName, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayContent)) {
                return false;
            }
            DisplayContent displayContent = (DisplayContent) other;
            return Intrinsics.areEqual(this.titleName, displayContent.titleName) && Intrinsics.areEqual(this.mode, displayContent.mode);
        }

        public int hashCode() {
            return (this.titleName.hashCode() * 31) + this.mode.hashCode();
        }

        public String toString() {
            return "DisplayContent(titleName=" + this.titleName + ", mode=" + this.mode + ")";
        }

        public DisplayContent(@Json(name = "title_name") String titleName, String mode) {
            Intrinsics.checkNotNullParameter(titleName, "titleName");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.titleName = titleName;
            this.mode = mode;
        }

        public final String getTitleName() {
            return this.titleName;
        }

        public final String getMode() {
            return this.mode;
        }
    }

    /* JADX INFO: compiled from: QrContentsResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jo\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayDataInfo;", "", "mode", "", HistoryRepositoryImpl.FieldName.TITLE, "detail", "url", "imgUrl", "timeLimitTo", "timeLimitFrom", "option", "", "Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayDataInfo$Option;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMode", "()Ljava/lang/String;", "getTitle", "getDetail", "getUrl", "getImgUrl", "getTimeLimitTo", "getTimeLimitFrom", "getOption", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Option", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DisplayDataInfo {
        private final String detail;
        private final String imgUrl;
        private final String mode;
        private final List<Option> option;
        private final String timeLimitFrom;
        private final String timeLimitTo;
        private final String title;
        private final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayDataInfo copy$default(DisplayDataInfo displayDataInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = displayDataInfo.mode;
            }
            if ((i & 2) != 0) {
                str2 = displayDataInfo.title;
            }
            if ((i & 4) != 0) {
                str3 = displayDataInfo.detail;
            }
            if ((i & 8) != 0) {
                str4 = displayDataInfo.url;
            }
            if ((i & 16) != 0) {
                str5 = displayDataInfo.imgUrl;
            }
            if ((i & 32) != 0) {
                str6 = displayDataInfo.timeLimitTo;
            }
            if ((i & 64) != 0) {
                str7 = displayDataInfo.timeLimitFrom;
            }
            if ((i & 128) != 0) {
                list = displayDataInfo.option;
            }
            String str8 = str7;
            List list2 = list;
            String str9 = str5;
            String str10 = str6;
            return displayDataInfo.copy(str, str2, str3, str4, str9, str10, str8, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getImgUrl() {
            return this.imgUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTimeLimitTo() {
            return this.timeLimitTo;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTimeLimitFrom() {
            return this.timeLimitFrom;
        }

        public final List<Option> component8() {
            return this.option;
        }

        public final DisplayDataInfo copy(String mode, String title, String detail, String url, @Json(name = "img_url") String imgUrl, @Json(name = "time_limit_to") String timeLimitTo, @Json(name = "time_limit_from") String timeLimitFrom, List<Option> option) {
            return new DisplayDataInfo(mode, title, detail, url, imgUrl, timeLimitTo, timeLimitFrom, option);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayDataInfo)) {
                return false;
            }
            DisplayDataInfo displayDataInfo = (DisplayDataInfo) other;
            return Intrinsics.areEqual(this.mode, displayDataInfo.mode) && Intrinsics.areEqual(this.title, displayDataInfo.title) && Intrinsics.areEqual(this.detail, displayDataInfo.detail) && Intrinsics.areEqual(this.url, displayDataInfo.url) && Intrinsics.areEqual(this.imgUrl, displayDataInfo.imgUrl) && Intrinsics.areEqual(this.timeLimitTo, displayDataInfo.timeLimitTo) && Intrinsics.areEqual(this.timeLimitFrom, displayDataInfo.timeLimitFrom) && Intrinsics.areEqual(this.option, displayDataInfo.option);
        }

        public int hashCode() {
            String str = this.mode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.detail;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.url;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.imgUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.timeLimitTo;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeLimitFrom;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<Option> list = this.option;
            return iHashCode7 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "DisplayDataInfo(mode=" + this.mode + ", title=" + this.title + ", detail=" + this.detail + ", url=" + this.url + ", imgUrl=" + this.imgUrl + ", timeLimitTo=" + this.timeLimitTo + ", timeLimitFrom=" + this.timeLimitFrom + ", option=" + this.option + ")";
        }

        public DisplayDataInfo(String str, String str2, String str3, String str4, @Json(name = "img_url") String str5, @Json(name = "time_limit_to") String str6, @Json(name = "time_limit_from") String str7, List<Option> list) {
            this.mode = str;
            this.title = str2;
            this.detail = str3;
            this.url = str4;
            this.imgUrl = str5;
            this.timeLimitTo = str6;
            this.timeLimitFrom = str7;
            this.option = list;
        }

        public final String getMode() {
            return this.mode;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getImgUrl() {
            return this.imgUrl;
        }

        public final String getTimeLimitTo() {
            return this.timeLimitTo;
        }

        public final String getTimeLimitFrom() {
            return this.timeLimitFrom;
        }

        public final List<Option> getOption() {
            return this.option;
        }

        /* JADX INFO: compiled from: QrContentsResponse.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayDataInfo$Option;", "", "courseVideoId", "", "courseId", "chapterId", "subcategoryId", BundleKey.VIDEO_ID, "hashCode", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCourseVideoId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseId", "getChapterId", "getSubcategoryId", "getVideoId", "getHashCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse$DisplayDataInfo$Option;", "equals", "", "other", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Option {
            private final Integer chapterId;
            private final Integer courseId;
            private final Integer courseVideoId;
            private final String hashCode;
            private final Integer subcategoryId;
            private final Integer videoId;

            public static /* synthetic */ Option copy$default(Option option, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = option.courseVideoId;
                }
                if ((i & 2) != 0) {
                    num2 = option.courseId;
                }
                if ((i & 4) != 0) {
                    num3 = option.chapterId;
                }
                if ((i & 8) != 0) {
                    num4 = option.subcategoryId;
                }
                if ((i & 16) != 0) {
                    num5 = option.videoId;
                }
                if ((i & 32) != 0) {
                    str = option.hashCode;
                }
                Integer num6 = num5;
                String str2 = str;
                return option.copy(num, num2, num3, num4, num6, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getCourseVideoId() {
                return this.courseVideoId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getCourseId() {
                return this.courseId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getChapterId() {
                return this.chapterId;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Integer getSubcategoryId() {
                return this.subcategoryId;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Integer getVideoId() {
                return this.videoId;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getHashCode() {
                return this.hashCode;
            }

            public final Option copy(@Json(name = QueryParameterKey.COURSE_VIDEO_ID) Integer courseVideoId, @Json(name = BundleKey.COURSE_ID) Integer courseId, @Json(name = "chapter_id") Integer chapterId, @Json(name = "subcategory_id") Integer subcategoryId, @Json(name = AnalyticsEvent.Param.VIDEO_ID) Integer videoId, @Json(name = "hash_code") String hashCode) {
                return new Option(courseVideoId, courseId, chapterId, subcategoryId, videoId, hashCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return Intrinsics.areEqual(this.courseVideoId, option.courseVideoId) && Intrinsics.areEqual(this.courseId, option.courseId) && Intrinsics.areEqual(this.chapterId, option.chapterId) && Intrinsics.areEqual(this.subcategoryId, option.subcategoryId) && Intrinsics.areEqual(this.videoId, option.videoId) && Intrinsics.areEqual(this.hashCode, option.hashCode);
            }

            public int hashCode() {
                Integer num = this.courseVideoId;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.courseId;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.chapterId;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.subcategoryId;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.videoId;
                int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
                String str = this.hashCode;
                return iHashCode5 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Option(courseVideoId=" + this.courseVideoId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", subcategoryId=" + this.subcategoryId + ", videoId=" + this.videoId + ", hashCode=" + this.hashCode + ")";
            }

            public Option(@Json(name = QueryParameterKey.COURSE_VIDEO_ID) Integer num, @Json(name = BundleKey.COURSE_ID) Integer num2, @Json(name = "chapter_id") Integer num3, @Json(name = "subcategory_id") Integer num4, @Json(name = AnalyticsEvent.Param.VIDEO_ID) Integer num5, @Json(name = "hash_code") String str) {
                this.courseVideoId = num;
                this.courseId = num2;
                this.chapterId = num3;
                this.subcategoryId = num4;
                this.videoId = num5;
                this.hashCode = str;
            }

            public final Integer getCourseVideoId() {
                return this.courseVideoId;
            }

            public final Integer getCourseId() {
                return this.courseId;
            }

            public final Integer getChapterId() {
                return this.chapterId;
            }

            public final Integer getSubcategoryId() {
                return this.subcategoryId;
            }

            public final Integer getVideoId() {
                return this.videoId;
            }

            public final String getHashCode() {
                return this.hashCode;
            }
        }
    }
}
