package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.ConstKt;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: QrContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b¨\u0006-"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DisplayDataItem;", "", "mode", "", HistoryRepositoryImpl.FieldName.TITLE, "detail", "url", "imgUrl", "timeLimitTo", "timeLimitFrom", "option", "", "Lcom/medicmedia/medilink/domain/model/DisplayDataOptionItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMode", "()Ljava/lang/String;", "getTitle", "getDetail", "getUrl", "getImgUrl", "getTimeLimitTo", "getTimeLimitFrom", "getOption", "()Ljava/util/List;", "isVideoMode", "", "()Z", "isOutOfTerm", "now", "Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DisplayDataItem {
    private final String detail;

    @SerializedName("img_url")
    private final String imgUrl;
    private final String mode;
    private final List<DisplayDataOptionItem> option;

    @SerializedName("time_limit_from")
    private final String timeLimitFrom;

    @SerializedName("time_limit_to")
    private final String timeLimitTo;
    private final String title;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayDataItem copy$default(DisplayDataItem displayDataItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayDataItem.mode;
        }
        if ((i & 2) != 0) {
            str2 = displayDataItem.title;
        }
        if ((i & 4) != 0) {
            str3 = displayDataItem.detail;
        }
        if ((i & 8) != 0) {
            str4 = displayDataItem.url;
        }
        if ((i & 16) != 0) {
            str5 = displayDataItem.imgUrl;
        }
        if ((i & 32) != 0) {
            str6 = displayDataItem.timeLimitTo;
        }
        if ((i & 64) != 0) {
            str7 = displayDataItem.timeLimitFrom;
        }
        if ((i & 128) != 0) {
            list = displayDataItem.option;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return displayDataItem.copy(str, str2, str3, str4, str9, str10, str8, list2);
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

    public final List<DisplayDataOptionItem> component8() {
        return this.option;
    }

    public final DisplayDataItem copy(String mode, String title, String detail, String url, String imgUrl, String timeLimitTo, String timeLimitFrom, List<DisplayDataOptionItem> option) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(timeLimitTo, "timeLimitTo");
        Intrinsics.checkNotNullParameter(timeLimitFrom, "timeLimitFrom");
        return new DisplayDataItem(mode, title, detail, url, imgUrl, timeLimitTo, timeLimitFrom, option);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayDataItem)) {
            return false;
        }
        DisplayDataItem displayDataItem = (DisplayDataItem) other;
        return Intrinsics.areEqual(this.mode, displayDataItem.mode) && Intrinsics.areEqual(this.title, displayDataItem.title) && Intrinsics.areEqual(this.detail, displayDataItem.detail) && Intrinsics.areEqual(this.url, displayDataItem.url) && Intrinsics.areEqual(this.imgUrl, displayDataItem.imgUrl) && Intrinsics.areEqual(this.timeLimitTo, displayDataItem.timeLimitTo) && Intrinsics.areEqual(this.timeLimitFrom, displayDataItem.timeLimitFrom) && Intrinsics.areEqual(this.option, displayDataItem.option);
    }

    public int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detail;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.url.hashCode()) * 31) + this.imgUrl.hashCode()) * 31) + this.timeLimitTo.hashCode()) * 31) + this.timeLimitFrom.hashCode()) * 31;
        List<DisplayDataOptionItem> list = this.option;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DisplayDataItem(mode=" + this.mode + ", title=" + this.title + ", detail=" + this.detail + ", url=" + this.url + ", imgUrl=" + this.imgUrl + ", timeLimitTo=" + this.timeLimitTo + ", timeLimitFrom=" + this.timeLimitFrom + ", option=" + this.option + ")";
    }

    public DisplayDataItem(String mode, String str, String str2, String url, String imgUrl, String timeLimitTo, String timeLimitFrom, List<DisplayDataOptionItem> list) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(timeLimitTo, "timeLimitTo");
        Intrinsics.checkNotNullParameter(timeLimitFrom, "timeLimitFrom");
        this.mode = mode;
        this.title = str;
        this.detail = str2;
        this.url = url;
        this.imgUrl = imgUrl;
        this.timeLimitTo = timeLimitTo;
        this.timeLimitFrom = timeLimitFrom;
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

    public final List<DisplayDataOptionItem> getOption() {
        return this.option;
    }

    public final boolean isVideoMode() {
        return Intrinsics.areEqual(this.mode, "movie");
    }

    public final boolean isOutOfTerm(Date now) {
        Intrinsics.checkNotNullParameter(now, "now");
        String str = this.timeLimitFrom;
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        Date date = str != null ? ConstKt.getDateFormatFull().parse(str) : null;
        String str2 = this.timeLimitTo;
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        Date date2 = str2 != null ? ConstKt.getDateFormatFull().parse(str2) : null;
        if (date == null || !now.before(date)) {
            return date2 != null && now.after(date2);
        }
        return true;
    }
}
