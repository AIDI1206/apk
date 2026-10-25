package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewsList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/domain/model/NewsItem;", "", "date", "", "message", HistoryRepositoryImpl.FieldName.TITLE, "url", "option", "labels", "", "Lcom/medicmedia/medilink/domain/model/NewsLabelItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getMessage", "getTitle", "getUrl", "getOption", "getLabels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NewsItem {
    private final String date;
    private final List<NewsLabelItem> labels;
    private final String message;
    private final String option;
    private final String title;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsItem copy$default(NewsItem newsItem, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsItem.date;
        }
        if ((i & 2) != 0) {
            str2 = newsItem.message;
        }
        if ((i & 4) != 0) {
            str3 = newsItem.title;
        }
        if ((i & 8) != 0) {
            str4 = newsItem.url;
        }
        if ((i & 16) != 0) {
            str5 = newsItem.option;
        }
        if ((i & 32) != 0) {
            list = newsItem.labels;
        }
        String str6 = str5;
        List list2 = list;
        return newsItem.copy(str, str2, str3, str4, str6, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    public final List<NewsLabelItem> component6() {
        return this.labels;
    }

    public final NewsItem copy(String date, String message, String title, String url, String option, List<NewsLabelItem> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        return new NewsItem(date, message, title, url, option, labels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsItem)) {
            return false;
        }
        NewsItem newsItem = (NewsItem) other;
        return Intrinsics.areEqual(this.date, newsItem.date) && Intrinsics.areEqual(this.message, newsItem.message) && Intrinsics.areEqual(this.title, newsItem.title) && Intrinsics.areEqual(this.url, newsItem.url) && Intrinsics.areEqual(this.option, newsItem.option) && Intrinsics.areEqual(this.labels, newsItem.labels);
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.option;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.labels.hashCode();
    }

    public String toString() {
        return "NewsItem(date=" + this.date + ", message=" + this.message + ", title=" + this.title + ", url=" + this.url + ", option=" + this.option + ", labels=" + this.labels + ")";
    }

    public NewsItem(String str, String str2, String str3, String str4, String str5, List<NewsLabelItem> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.date = str;
        this.message = str2;
        this.title = str3;
        this.url = str4;
        this.option = str5;
        this.labels = labels;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getOption() {
        return this.option;
    }

    public final List<NewsLabelItem> getLabels() {
        return this.labels;
    }
}
