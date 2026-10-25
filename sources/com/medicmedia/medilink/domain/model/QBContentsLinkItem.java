package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: QBContentsLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QBContentsLinkItem;", "", "contentCode", "", "qbMode", "json", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getContentCode", "()Ljava/lang/String;", "getQbMode", "getJson", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class QBContentsLinkItem {
    private final String contentCode;
    private final JSONObject json;
    private final String qbMode;

    public static /* synthetic */ QBContentsLinkItem copy$default(QBContentsLinkItem qBContentsLinkItem, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qBContentsLinkItem.contentCode;
        }
        if ((i & 2) != 0) {
            str2 = qBContentsLinkItem.qbMode;
        }
        if ((i & 4) != 0) {
            jSONObject = qBContentsLinkItem.json;
        }
        return qBContentsLinkItem.copy(str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentCode() {
        return this.contentCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQbMode() {
        return this.qbMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getJson() {
        return this.json;
    }

    public final QBContentsLinkItem copy(String contentCode, String qbMode, JSONObject json) {
        Intrinsics.checkNotNullParameter(contentCode, "contentCode");
        Intrinsics.checkNotNullParameter(qbMode, "qbMode");
        Intrinsics.checkNotNullParameter(json, "json");
        return new QBContentsLinkItem(contentCode, qbMode, json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QBContentsLinkItem)) {
            return false;
        }
        QBContentsLinkItem qBContentsLinkItem = (QBContentsLinkItem) other;
        return Intrinsics.areEqual(this.contentCode, qBContentsLinkItem.contentCode) && Intrinsics.areEqual(this.qbMode, qBContentsLinkItem.qbMode) && Intrinsics.areEqual(this.json, qBContentsLinkItem.json);
    }

    public int hashCode() {
        return (((this.contentCode.hashCode() * 31) + this.qbMode.hashCode()) * 31) + this.json.hashCode();
    }

    public String toString() {
        return "QBContentsLinkItem(contentCode=" + this.contentCode + ", qbMode=" + this.qbMode + ", json=" + this.json + ")";
    }

    public QBContentsLinkItem(String contentCode, String qbMode, JSONObject json) {
        Intrinsics.checkNotNullParameter(contentCode, "contentCode");
        Intrinsics.checkNotNullParameter(qbMode, "qbMode");
        Intrinsics.checkNotNullParameter(json, "json");
        this.contentCode = contentCode;
        this.qbMode = qbMode;
        this.json = json;
    }

    public final String getContentCode() {
        return this.contentCode;
    }

    public final String getQbMode() {
        return this.qbMode;
    }

    public final JSONObject getJson() {
        return this.json;
    }
}
