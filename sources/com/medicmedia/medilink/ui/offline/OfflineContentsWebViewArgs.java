package com.medicmedia.medilink.ui.offline;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.common.ContentsDetailHandlingType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: OfflineContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020\u0007H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006-"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;", "", "pageId", "", "contentsId", "url", "index", "", BundleKey.TAB_NO, "urlOption", "Lcom/medicmedia/medilink/ui/offline/OfflineUrlOption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lcom/medicmedia/medilink/ui/offline/OfflineUrlOption;)V", "getPageId", "()Ljava/lang/String;", "getContentsId", "getUrl", "getIndex", "()I", "getTabNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrlOption", "()Lcom/medicmedia/medilink/ui/offline/OfflineUrlOption;", "initializeUrl", "getInitializeUrl", "continuousCheckModeUrl", "getContinuousCheckModeUrl", "anchor", "getAnchor", "urlWithTag", "getUrlWithTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lcom/medicmedia/medilink/ui/offline/OfflineUrlOption;)Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OfflineContentsWebViewArgs {
    public static final int $stable = 8;
    private final String contentsId;
    private final int index;
    private final String pageId;
    private final Integer tabNo;
    private final String url;
    private final OfflineUrlOption urlOption;

    public OfflineContentsWebViewArgs() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ OfflineContentsWebViewArgs copy$default(OfflineContentsWebViewArgs offlineContentsWebViewArgs, String str, String str2, String str3, int i, Integer num, OfflineUrlOption offlineUrlOption, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offlineContentsWebViewArgs.pageId;
        }
        if ((i2 & 2) != 0) {
            str2 = offlineContentsWebViewArgs.contentsId;
        }
        if ((i2 & 4) != 0) {
            str3 = offlineContentsWebViewArgs.url;
        }
        if ((i2 & 8) != 0) {
            i = offlineContentsWebViewArgs.index;
        }
        if ((i2 & 16) != 0) {
            num = offlineContentsWebViewArgs.tabNo;
        }
        if ((i2 & 32) != 0) {
            offlineUrlOption = offlineContentsWebViewArgs.urlOption;
        }
        Integer num2 = num;
        OfflineUrlOption offlineUrlOption2 = offlineUrlOption;
        return offlineContentsWebViewArgs.copy(str, str2, str3, i, num2, offlineUrlOption2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTabNo() {
        return this.tabNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OfflineUrlOption getUrlOption() {
        return this.urlOption;
    }

    public final OfflineContentsWebViewArgs copy(String pageId, String contentsId, String url, int index, Integer tabNo, OfflineUrlOption urlOption) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new OfflineContentsWebViewArgs(pageId, contentsId, url, index, tabNo, urlOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineContentsWebViewArgs)) {
            return false;
        }
        OfflineContentsWebViewArgs offlineContentsWebViewArgs = (OfflineContentsWebViewArgs) other;
        return Intrinsics.areEqual(this.pageId, offlineContentsWebViewArgs.pageId) && Intrinsics.areEqual(this.contentsId, offlineContentsWebViewArgs.contentsId) && Intrinsics.areEqual(this.url, offlineContentsWebViewArgs.url) && this.index == offlineContentsWebViewArgs.index && Intrinsics.areEqual(this.tabNo, offlineContentsWebViewArgs.tabNo) && Intrinsics.areEqual(this.urlOption, offlineContentsWebViewArgs.urlOption);
    }

    public int hashCode() {
        int iHashCode = ((((((this.pageId.hashCode() * 31) + this.contentsId.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
        Integer num = this.tabNo;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        OfflineUrlOption offlineUrlOption = this.urlOption;
        return iHashCode2 + (offlineUrlOption != null ? offlineUrlOption.hashCode() : 0);
    }

    public String toString() {
        return "OfflineContentsWebViewArgs(pageId=" + this.pageId + ", contentsId=" + this.contentsId + ", url=" + this.url + ", index=" + this.index + ", tabNo=" + this.tabNo + ", urlOption=" + this.urlOption + ")";
    }

    public OfflineContentsWebViewArgs(String pageId, String contentsId, String url, int i, Integer num, OfflineUrlOption offlineUrlOption) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.pageId = pageId;
        this.contentsId = contentsId;
        this.url = url;
        this.index = i;
        this.tabNo = num;
        this.urlOption = offlineUrlOption;
    }

    public /* synthetic */ OfflineContentsWebViewArgs(String str, String str2, String str3, int i, Integer num, OfflineUrlOption offlineUrlOption, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : offlineUrlOption);
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Integer getTabNo() {
        return this.tabNo;
    }

    public final OfflineUrlOption getUrlOption() {
        return this.urlOption;
    }

    public final String getInitializeUrl() {
        if (this.tabNo == null || StringsKt.endsWith$default(this.url, ContentsDetailHandlingType.MEMO_URL_SUFFIX.getValue(), false, 2, (Object) null)) {
            OfflineUrlOption offlineUrlOption = this.urlOption;
            if (offlineUrlOption != null) {
                String str = this.url + offlineUrlOption.getValue();
                if (str != null) {
                    return str;
                }
            }
            return this.url;
        }
        return StringsKt.substringBefore$default(this.url, MLConst.MLCommon.SHARP, (String) null, 2, (Object) null);
    }

    public final String getContinuousCheckModeUrl() {
        OfflineUrlOption offlineUrlOption = this.urlOption;
        if (!(offlineUrlOption instanceof OfflineUrlOption.End)) {
            return StringsKt.substringBefore$default(this.url, MLConst.MLCommon.SHARP, (String) null, 2, (Object) null);
        }
        return this.url + ((OfflineUrlOption.End) offlineUrlOption).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public final String getAnchor() {
        String str;
        OfflineUrlOption offlineUrlOption = this.urlOption;
        if (offlineUrlOption != null) {
            str = this.url + offlineUrlOption.getValue();
            if (str == null) {
                str = this.url;
            }
        } else {
            str = this.url;
        }
        String strSubstringAfter = StringsKt.substringAfter(str, MLConst.MLCommon.SHARP, "");
        if (StringsKt.isBlank(strSubstringAfter)) {
            return null;
        }
        return strSubstringAfter;
    }

    public final String getUrlWithTag() {
        OfflineUrlOption offlineUrlOption = this.urlOption;
        if (offlineUrlOption != null) {
            String str = this.url + offlineUrlOption.getValue();
            if (str != null) {
                return str;
            }
        }
        return this.url;
    }
}
