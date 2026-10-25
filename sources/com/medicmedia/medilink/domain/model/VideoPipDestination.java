package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPipMode.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "", "ExternalBrowser", "OnlineContents", "OfflineContents", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination$ExternalBrowser;", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination$OfflineContents;", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination$OnlineContents;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoPipDestination {

    /* JADX INFO: compiled from: VideoPipMode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipDestination$ExternalBrowser;", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExternalBrowser implements VideoPipDestination {
        private final String url;

        public static /* synthetic */ ExternalBrowser copy$default(ExternalBrowser externalBrowser, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalBrowser.url;
            }
            return externalBrowser.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final ExternalBrowser copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ExternalBrowser(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExternalBrowser) && Intrinsics.areEqual(this.url, ((ExternalBrowser) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "ExternalBrowser(url=" + this.url + ")";
        }

        public ExternalBrowser(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: VideoPipMode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipDestination$OnlineContents;", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "contentsId", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OnlineContents implements VideoPipDestination {
        private final String contentsId;
        private final String url;

        public static /* synthetic */ OnlineContents copy$default(OnlineContents onlineContents, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onlineContents.contentsId;
            }
            if ((i & 2) != 0) {
                str2 = onlineContents.url;
            }
            return onlineContents.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OnlineContents copy(String contentsId, String url) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            return new OnlineContents(contentsId, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnlineContents)) {
                return false;
            }
            OnlineContents onlineContents = (OnlineContents) other;
            return Intrinsics.areEqual(this.contentsId, onlineContents.contentsId) && Intrinsics.areEqual(this.url, onlineContents.url);
        }

        public int hashCode() {
            return (this.contentsId.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "OnlineContents(contentsId=" + this.contentsId + ", url=" + this.url + ")";
        }

        public OnlineContents(String contentsId, String url) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            this.contentsId = contentsId;
            this.url = url;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: VideoPipMode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoPipDestination$OfflineContents;", "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "contentsId", "", "url", BundleKey.THUMBNAIL, "index", "", BundleKey.TAG_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "getIndex", "()I", "getTagId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OfflineContents implements VideoPipDestination {
        private final String contentsId;
        private final int index;
        private final String tagId;
        private final String thumbnail;
        private final String url;

        public static /* synthetic */ OfflineContents copy$default(OfflineContents offlineContents, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = offlineContents.contentsId;
            }
            if ((i2 & 2) != 0) {
                str2 = offlineContents.url;
            }
            if ((i2 & 4) != 0) {
                str3 = offlineContents.thumbnail;
            }
            if ((i2 & 8) != 0) {
                i = offlineContents.index;
            }
            if ((i2 & 16) != 0) {
                str4 = offlineContents.tagId;
            }
            String str5 = str4;
            String str6 = str3;
            return offlineContents.copy(str, str2, str6, i, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getThumbnail() {
            return this.thumbnail;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }

        public final OfflineContents copy(String contentsId, String url, String thumbnail, int index, String tagId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            return new OfflineContents(contentsId, url, thumbnail, index, tagId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflineContents)) {
                return false;
            }
            OfflineContents offlineContents = (OfflineContents) other;
            return Intrinsics.areEqual(this.contentsId, offlineContents.contentsId) && Intrinsics.areEqual(this.url, offlineContents.url) && Intrinsics.areEqual(this.thumbnail, offlineContents.thumbnail) && this.index == offlineContents.index && Intrinsics.areEqual(this.tagId, offlineContents.tagId);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31;
            String str = this.thumbnail;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.index)) * 31;
            String str2 = this.tagId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "OfflineContents(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", index=" + this.index + ", tagId=" + this.tagId + ")";
        }

        public OfflineContents(String contentsId, String url, String str, int i, String str2) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            this.contentsId = contentsId;
            this.url = url;
            this.thumbnail = str;
            this.index = i;
            this.tagId = str2;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getTagId() {
            return this.tagId;
        }
    }
}
