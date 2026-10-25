package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalyticsEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/medicmedia/medilink/domain/model/FAEventReadContentsRef;", "Lcom/medicmedia/medilink/domain/model/FAEventItem;", "name", "", "currentUrl", "gotoUrl", "currentLicenseCode", "gotoLicenseCode", "format", "Lcom/medicmedia/medilink/domain/model/AnalyticsContentsFormat;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/AnalyticsContentsFormat;)V", "getName", "()Ljava/lang/String;", "getCurrentUrl", "getGotoUrl", "getCurrentLicenseCode", "getGotoLicenseCode", "getFormat", "()Lcom/medicmedia/medilink/domain/model/AnalyticsContentsFormat;", "params", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class FAEventReadContentsRef implements FAEventItem {
    private final String currentLicenseCode;
    private final String currentUrl;
    private final AnalyticsContentsFormat format;
    private final String gotoLicenseCode;
    private final String gotoUrl;
    private final String name;

    public static /* synthetic */ FAEventReadContentsRef copy$default(FAEventReadContentsRef fAEventReadContentsRef, String str, String str2, String str3, String str4, String str5, AnalyticsContentsFormat analyticsContentsFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fAEventReadContentsRef.name;
        }
        if ((i & 2) != 0) {
            str2 = fAEventReadContentsRef.currentUrl;
        }
        if ((i & 4) != 0) {
            str3 = fAEventReadContentsRef.gotoUrl;
        }
        if ((i & 8) != 0) {
            str4 = fAEventReadContentsRef.currentLicenseCode;
        }
        if ((i & 16) != 0) {
            str5 = fAEventReadContentsRef.gotoLicenseCode;
        }
        if ((i & 32) != 0) {
            analyticsContentsFormat = fAEventReadContentsRef.format;
        }
        String str6 = str5;
        AnalyticsContentsFormat analyticsContentsFormat2 = analyticsContentsFormat;
        return fAEventReadContentsRef.copy(str, str2, str3, str4, str6, analyticsContentsFormat2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrentLicenseCode() {
        return this.currentLicenseCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGotoLicenseCode() {
        return this.gotoLicenseCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnalyticsContentsFormat getFormat() {
        return this.format;
    }

    public final FAEventReadContentsRef copy(String name, String currentUrl, String gotoUrl, String currentLicenseCode, String gotoLicenseCode, AnalyticsContentsFormat format) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(gotoUrl, "gotoUrl");
        Intrinsics.checkNotNullParameter(currentLicenseCode, "currentLicenseCode");
        Intrinsics.checkNotNullParameter(gotoLicenseCode, "gotoLicenseCode");
        Intrinsics.checkNotNullParameter(format, "format");
        return new FAEventReadContentsRef(name, currentUrl, gotoUrl, currentLicenseCode, gotoLicenseCode, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FAEventReadContentsRef)) {
            return false;
        }
        FAEventReadContentsRef fAEventReadContentsRef = (FAEventReadContentsRef) other;
        return Intrinsics.areEqual(this.name, fAEventReadContentsRef.name) && Intrinsics.areEqual(this.currentUrl, fAEventReadContentsRef.currentUrl) && Intrinsics.areEqual(this.gotoUrl, fAEventReadContentsRef.gotoUrl) && Intrinsics.areEqual(this.currentLicenseCode, fAEventReadContentsRef.currentLicenseCode) && Intrinsics.areEqual(this.gotoLicenseCode, fAEventReadContentsRef.gotoLicenseCode) && this.format == fAEventReadContentsRef.format;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.currentUrl.hashCode()) * 31) + this.gotoUrl.hashCode()) * 31) + this.currentLicenseCode.hashCode()) * 31) + this.gotoLicenseCode.hashCode()) * 31) + this.format.hashCode();
    }

    public String toString() {
        return "FAEventReadContentsRef(name=" + this.name + ", currentUrl=" + this.currentUrl + ", gotoUrl=" + this.gotoUrl + ", currentLicenseCode=" + this.currentLicenseCode + ", gotoLicenseCode=" + this.gotoLicenseCode + ", format=" + this.format + ")";
    }

    public FAEventReadContentsRef(String name, String currentUrl, String gotoUrl, String currentLicenseCode, String gotoLicenseCode, AnalyticsContentsFormat format) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(gotoUrl, "gotoUrl");
        Intrinsics.checkNotNullParameter(currentLicenseCode, "currentLicenseCode");
        Intrinsics.checkNotNullParameter(gotoLicenseCode, "gotoLicenseCode");
        Intrinsics.checkNotNullParameter(format, "format");
        this.name = name;
        this.currentUrl = currentUrl;
        this.gotoUrl = gotoUrl;
        this.currentLicenseCode = currentLicenseCode;
        this.gotoLicenseCode = gotoLicenseCode;
        this.format = format;
    }

    public /* synthetic */ FAEventReadContentsRef(String str, String str2, String str3, String str4, String str5, AnalyticsContentsFormat analyticsContentsFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnalyticsEvent.Name.READ_CONTENTS_REF : str, str2, str3, (i & 8) != 0 ? "null" : str4, (i & 16) != 0 ? "null" : str5, analyticsContentsFormat);
    }

    @Override // com.medicmedia.medilink.domain.model.FAEventItem
    public String getName() {
        return this.name;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    public final String getCurrentLicenseCode() {
        return this.currentLicenseCode;
    }

    public final String getGotoLicenseCode() {
        return this.gotoLicenseCode;
    }

    public final AnalyticsContentsFormat getFormat() {
        return this.format;
    }

    @Override // com.medicmedia.medilink.domain.model.FAEventItem
    public Map<String, String> params() {
        return MapsKt.mapOf(TuplesKt.to("current_url", this.currentUrl), TuplesKt.to(AnalyticsEvent.Param.GOTO_URL, this.gotoUrl), TuplesKt.to(AnalyticsEvent.Param.CONTENTS_FORMAT, this.format.getValue()), TuplesKt.to(AnalyticsEvent.Param.CURRENT_LICENSE_CODE, this.currentLicenseCode), TuplesKt.to(AnalyticsEvent.Param.GOTO_LICENSE_CODE, this.gotoLicenseCode));
    }
}
