package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult;", "", "Resolved", "NotFound", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult$NotFound;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult$Resolved;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoOnlineContentsResolveResult {

    /* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult$Resolved;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult;", "contentsId", "", "url", BundleKey.THUMBNAIL, "goToLicenseCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "getGoToLicenseCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Resolved implements VideoOnlineContentsResolveResult {
        public static final int $stable = 0;
        private final String contentsId;
        private final String goToLicenseCode;
        private final String thumbnail;
        private final String url;

        public static /* synthetic */ Resolved copy$default(Resolved resolved, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolved.contentsId;
            }
            if ((i & 2) != 0) {
                str2 = resolved.url;
            }
            if ((i & 4) != 0) {
                str3 = resolved.thumbnail;
            }
            if ((i & 8) != 0) {
                str4 = resolved.goToLicenseCode;
            }
            return resolved.copy(str, str2, str3, str4);
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
        public final String getGoToLicenseCode() {
            return this.goToLicenseCode;
        }

        public final Resolved copy(String contentsId, String url, String thumbnail, String goToLicenseCode) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Resolved(contentsId, url, thumbnail, goToLicenseCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resolved)) {
                return false;
            }
            Resolved resolved = (Resolved) other;
            return Intrinsics.areEqual(this.contentsId, resolved.contentsId) && Intrinsics.areEqual(this.url, resolved.url) && Intrinsics.areEqual(this.thumbnail, resolved.thumbnail) && Intrinsics.areEqual(this.goToLicenseCode, resolved.goToLicenseCode);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31;
            String str = this.thumbnail;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.goToLicenseCode;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Resolved(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", goToLicenseCode=" + this.goToLicenseCode + ")";
        }

        public Resolved(String contentsId, String url, String str, String str2) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            this.contentsId = contentsId;
            this.url = url;
            this.thumbnail = str;
            this.goToLicenseCode = str2;
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

        public final String getGoToLicenseCode() {
            return this.goToLicenseCode;
        }
    }

    /* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult$NotFound;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOnlineContentsResolveResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotFound implements VideoOnlineContentsResolveResult {
        public static final int $stable = 0;
        public static final NotFound INSTANCE = new NotFound();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotFound)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 607066868;
        }

        public String toString() {
            return "NotFound";
        }

        private NotFound() {
        }
    }
}
