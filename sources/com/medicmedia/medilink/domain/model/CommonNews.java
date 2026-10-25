package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiCommon.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/CommonNews;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "message", "url", "date", "option", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getUrl", "getDate", "getOption", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CommonNews {
    private final String date;
    private final String message;
    private final String option;
    private final String title;
    private final String url;

    public CommonNews() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommonNews copy$default(CommonNews commonNews, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonNews.title;
        }
        if ((i & 2) != 0) {
            str2 = commonNews.message;
        }
        if ((i & 4) != 0) {
            str3 = commonNews.url;
        }
        if ((i & 8) != 0) {
            str4 = commonNews.date;
        }
        if ((i & 16) != 0) {
            str5 = commonNews.option;
        }
        String str6 = str5;
        String str7 = str3;
        return commonNews.copy(str, str2, str7, str4, str6);
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

    public final CommonNews copy(String title, String message, String url, String date, String option) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(option, "option");
        return new CommonNews(title, message, url, date, option);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonNews)) {
            return false;
        }
        CommonNews commonNews = (CommonNews) other;
        return Intrinsics.areEqual(this.title, commonNews.title) && Intrinsics.areEqual(this.message, commonNews.message) && Intrinsics.areEqual(this.url, commonNews.url) && Intrinsics.areEqual(this.date, commonNews.date) && Intrinsics.areEqual(this.option, commonNews.option);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.url.hashCode()) * 31) + this.date.hashCode()) * 31) + this.option.hashCode();
    }

    public String toString() {
        return "CommonNews(title=" + this.title + ", message=" + this.message + ", url=" + this.url + ", date=" + this.date + ", option=" + this.option + ")";
    }

    public CommonNews(String title, String message, String url, String date, String option) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(option, "option");
        this.title = title;
        this.message = message;
        this.url = url;
        this.date = date;
        this.option = option;
    }

    public /* synthetic */ CommonNews(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
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
