package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QBConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QBQuestionListLinkVersion;", "", "qbVersion", "", "<init>", "(Ljava/lang/String;)V", "getQbVersion", "()Ljava/lang/String;", "isQbv4", "", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class QBQuestionListLinkVersion {

    @SerializedName("qb_version")
    private final String qbVersion;

    public static /* synthetic */ QBQuestionListLinkVersion copy$default(QBQuestionListLinkVersion qBQuestionListLinkVersion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qBQuestionListLinkVersion.qbVersion;
        }
        return qBQuestionListLinkVersion.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQbVersion() {
        return this.qbVersion;
    }

    public final QBQuestionListLinkVersion copy(String qbVersion) {
        Intrinsics.checkNotNullParameter(qbVersion, "qbVersion");
        return new QBQuestionListLinkVersion(qbVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QBQuestionListLinkVersion) && Intrinsics.areEqual(this.qbVersion, ((QBQuestionListLinkVersion) other).qbVersion);
    }

    public int hashCode() {
        return this.qbVersion.hashCode();
    }

    public String toString() {
        return "QBQuestionListLinkVersion(qbVersion=" + this.qbVersion + ")";
    }

    public QBQuestionListLinkVersion(String qbVersion) {
        Intrinsics.checkNotNullParameter(qbVersion, "qbVersion");
        this.qbVersion = qbVersion;
    }

    public final String getQbVersion() {
        return this.qbVersion;
    }

    public final boolean isQbv4() {
        return Intrinsics.areEqual(this.qbVersion, "v4");
    }
}
