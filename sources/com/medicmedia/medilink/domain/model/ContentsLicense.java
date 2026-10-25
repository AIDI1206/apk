package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsLicense.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsLicense;", "", "contentCode", "", "contentTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentCode", "()Ljava/lang/String;", "getContentTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsLicense {
    private final String contentCode;
    private final String contentTitle;

    public static /* synthetic */ ContentsLicense copy$default(ContentsLicense contentsLicense, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentsLicense.contentCode;
        }
        if ((i & 2) != 0) {
            str2 = contentsLicense.contentTitle;
        }
        return contentsLicense.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentCode() {
        return this.contentCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final ContentsLicense copy(String contentCode, String contentTitle) {
        Intrinsics.checkNotNullParameter(contentCode, "contentCode");
        return new ContentsLicense(contentCode, contentTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsLicense)) {
            return false;
        }
        ContentsLicense contentsLicense = (ContentsLicense) other;
        return Intrinsics.areEqual(this.contentCode, contentsLicense.contentCode) && Intrinsics.areEqual(this.contentTitle, contentsLicense.contentTitle);
    }

    public int hashCode() {
        int iHashCode = this.contentCode.hashCode() * 31;
        String str = this.contentTitle;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ContentsLicense(contentCode=" + this.contentCode + ", contentTitle=" + this.contentTitle + ")";
    }

    public ContentsLicense(String contentCode, String str) {
        Intrinsics.checkNotNullParameter(contentCode, "contentCode");
        this.contentCode = contentCode;
        this.contentTitle = str;
    }

    public final String getContentCode() {
        return this.contentCode;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }
}
