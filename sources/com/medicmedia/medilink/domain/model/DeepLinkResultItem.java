package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DeepLinkResultItem;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/DeepLinkType;", "url", "", "isLink", "", "jsonObject", "Lorg/json/JSONObject;", "isNotEmptyBookItems", "<init>", "(Lcom/medicmedia/medilink/domain/model/DeepLinkType;Ljava/lang/String;ZLorg/json/JSONObject;Z)V", "getType", "()Lcom/medicmedia/medilink/domain/model/DeepLinkType;", "getUrl", "()Ljava/lang/String;", "()Z", "getJsonObject", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DeepLinkResultItem {
    private final boolean isLink;
    private final boolean isNotEmptyBookItems;
    private final JSONObject jsonObject;
    private final DeepLinkType type;
    private final String url;

    public static /* synthetic */ DeepLinkResultItem copy$default(DeepLinkResultItem deepLinkResultItem, DeepLinkType deepLinkType, String str, boolean z, JSONObject jSONObject, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            deepLinkType = deepLinkResultItem.type;
        }
        if ((i & 2) != 0) {
            str = deepLinkResultItem.url;
        }
        if ((i & 4) != 0) {
            z = deepLinkResultItem.isLink;
        }
        if ((i & 8) != 0) {
            jSONObject = deepLinkResultItem.jsonObject;
        }
        if ((i & 16) != 0) {
            z2 = deepLinkResultItem.isNotEmptyBookItems;
        }
        boolean z3 = z2;
        boolean z4 = z;
        return deepLinkResultItem.copy(deepLinkType, str, z4, jSONObject, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeepLinkType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLink() {
        return this.isLink;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNotEmptyBookItems() {
        return this.isNotEmptyBookItems;
    }

    public final DeepLinkResultItem copy(DeepLinkType type, String url, boolean isLink, JSONObject jsonObject, boolean isNotEmptyBookItems) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        return new DeepLinkResultItem(type, url, isLink, jsonObject, isNotEmptyBookItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkResultItem)) {
            return false;
        }
        DeepLinkResultItem deepLinkResultItem = (DeepLinkResultItem) other;
        return this.type == deepLinkResultItem.type && Intrinsics.areEqual(this.url, deepLinkResultItem.url) && this.isLink == deepLinkResultItem.isLink && Intrinsics.areEqual(this.jsonObject, deepLinkResultItem.jsonObject) && this.isNotEmptyBookItems == deepLinkResultItem.isNotEmptyBookItems;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isLink)) * 31;
        JSONObject jSONObject = this.jsonObject;
        return ((iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + Boolean.hashCode(this.isNotEmptyBookItems);
    }

    public String toString() {
        return "DeepLinkResultItem(type=" + this.type + ", url=" + this.url + ", isLink=" + this.isLink + ", jsonObject=" + this.jsonObject + ", isNotEmptyBookItems=" + this.isNotEmptyBookItems + ")";
    }

    public DeepLinkResultItem(DeepLinkType type, String url, boolean z, JSONObject jSONObject, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        this.type = type;
        this.url = url;
        this.isLink = z;
        this.jsonObject = jSONObject;
        this.isNotEmptyBookItems = z2;
    }

    public /* synthetic */ DeepLinkResultItem(DeepLinkType deepLinkType, String str, boolean z, JSONObject jSONObject, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deepLinkType, str, z, (i & 8) != 0 ? null : jSONObject, (i & 16) != 0 ? false : z2);
    }

    public final DeepLinkType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isLink() {
        return this.isLink;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final boolean isNotEmptyBookItems() {
        return this.isNotEmptyBookItems;
    }
}
