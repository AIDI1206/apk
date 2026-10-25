package com.medicmedia.medilink.ui.checkmode;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.common.JavascriptAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContinuousCheckModeViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÇ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010*\u001a\u00020\u000bH×\u0001J\t\u0010+\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/ui/checkmode/ContinuousCheckPageState;", "", "pageId", "", "initialUrl", "currentUrl", "anchor", HistoryRepositoryImpl.FieldName.TITLE, "subTitle", BundleKey.THUMBNAIL, "progress", "", "javascriptActions", "", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getPageId", "()Ljava/lang/String;", "getInitialUrl", "getCurrentUrl", "getAnchor", "getTitle", "getSubTitle", "getThumbnail", "getProgress", "()I", "getJavascriptActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContinuousCheckPageState {
    public static final int $stable = 8;
    private final String anchor;
    private final String currentUrl;
    private final String initialUrl;
    private final List<JavascriptAction> javascriptActions;
    private final String pageId;
    private final int progress;
    private final String subTitle;
    private final String thumbnail;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContinuousCheckPageState copy$default(ContinuousCheckPageState continuousCheckPageState, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = continuousCheckPageState.pageId;
        }
        if ((i2 & 2) != 0) {
            str2 = continuousCheckPageState.initialUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = continuousCheckPageState.currentUrl;
        }
        if ((i2 & 8) != 0) {
            str4 = continuousCheckPageState.anchor;
        }
        if ((i2 & 16) != 0) {
            str5 = continuousCheckPageState.title;
        }
        if ((i2 & 32) != 0) {
            str6 = continuousCheckPageState.subTitle;
        }
        if ((i2 & 64) != 0) {
            str7 = continuousCheckPageState.thumbnail;
        }
        if ((i2 & 128) != 0) {
            i = continuousCheckPageState.progress;
        }
        if ((i2 & 256) != 0) {
            list = continuousCheckPageState.javascriptActions;
        }
        int i3 = i;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return continuousCheckPageState.copy(str, str2, str11, str4, str10, str8, str9, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final List<JavascriptAction> component9() {
        return this.javascriptActions;
    }

    public final ContinuousCheckPageState copy(String pageId, String initialUrl, String currentUrl, String anchor, String title, String subTitle, String thumbnail, int progress, List<? extends JavascriptAction> javascriptActions) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(javascriptActions, "javascriptActions");
        return new ContinuousCheckPageState(pageId, initialUrl, currentUrl, anchor, title, subTitle, thumbnail, progress, javascriptActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContinuousCheckPageState)) {
            return false;
        }
        ContinuousCheckPageState continuousCheckPageState = (ContinuousCheckPageState) other;
        return Intrinsics.areEqual(this.pageId, continuousCheckPageState.pageId) && Intrinsics.areEqual(this.initialUrl, continuousCheckPageState.initialUrl) && Intrinsics.areEqual(this.currentUrl, continuousCheckPageState.currentUrl) && Intrinsics.areEqual(this.anchor, continuousCheckPageState.anchor) && Intrinsics.areEqual(this.title, continuousCheckPageState.title) && Intrinsics.areEqual(this.subTitle, continuousCheckPageState.subTitle) && Intrinsics.areEqual(this.thumbnail, continuousCheckPageState.thumbnail) && this.progress == continuousCheckPageState.progress && Intrinsics.areEqual(this.javascriptActions, continuousCheckPageState.javascriptActions);
    }

    public int hashCode() {
        int iHashCode = ((this.pageId.hashCode() * 31) + this.initialUrl.hashCode()) * 31;
        String str = this.currentUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.anchor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumbnail;
        return ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.progress)) * 31) + this.javascriptActions.hashCode();
    }

    public String toString() {
        return "ContinuousCheckPageState(pageId=" + this.pageId + ", initialUrl=" + this.initialUrl + ", currentUrl=" + this.currentUrl + ", anchor=" + this.anchor + ", title=" + this.title + ", subTitle=" + this.subTitle + ", thumbnail=" + this.thumbnail + ", progress=" + this.progress + ", javascriptActions=" + this.javascriptActions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuousCheckPageState(String pageId, String initialUrl, String str, String str2, String str3, String str4, String str5, int i, List<? extends JavascriptAction> javascriptActions) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(javascriptActions, "javascriptActions");
        this.pageId = pageId;
        this.initialUrl = initialUrl;
        this.currentUrl = str;
        this.anchor = str2;
        this.title = str3;
        this.subTitle = str4;
        this.thumbnail = str5;
        this.progress = i;
        this.javascriptActions = javascriptActions;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public /* synthetic */ ContinuousCheckPageState(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) == 0 ? str7 : null, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getInitialUrl() {
        return this.initialUrl;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final String getAnchor() {
        return this.anchor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final List<JavascriptAction> getJavascriptActions() {
        return this.javascriptActions;
    }
}
