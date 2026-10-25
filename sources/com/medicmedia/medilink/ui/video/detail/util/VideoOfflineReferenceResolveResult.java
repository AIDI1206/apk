package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult;", "", "Resolved", "Error", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult$Error;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult$Resolved;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoOfflineReferenceResolveResult {

    /* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0007H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult$Resolved;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult;", "contentsId", "", "url", BundleKey.THUMBNAIL, "index", "", BundleKey.TAG_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "getIndex", "()I", "getTagId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Resolved implements VideoOfflineReferenceResolveResult {
        public static final int $stable = 0;
        private final String contentsId;
        private final int index;
        private final String tagId;
        private final String thumbnail;
        private final String url;

        public static /* synthetic */ Resolved copy$default(Resolved resolved, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = resolved.contentsId;
            }
            if ((i2 & 2) != 0) {
                str2 = resolved.url;
            }
            if ((i2 & 4) != 0) {
                str3 = resolved.thumbnail;
            }
            if ((i2 & 8) != 0) {
                i = resolved.index;
            }
            if ((i2 & 16) != 0) {
                str4 = resolved.tagId;
            }
            String str5 = str4;
            String str6 = str3;
            return resolved.copy(str, str2, str6, i, str5);
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

        public final Resolved copy(String contentsId, String url, String thumbnail, int index, String tagId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tagId, "tagId");
            return new Resolved(contentsId, url, thumbnail, index, tagId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resolved)) {
                return false;
            }
            Resolved resolved = (Resolved) other;
            return Intrinsics.areEqual(this.contentsId, resolved.contentsId) && Intrinsics.areEqual(this.url, resolved.url) && Intrinsics.areEqual(this.thumbnail, resolved.thumbnail) && this.index == resolved.index && Intrinsics.areEqual(this.tagId, resolved.tagId);
        }

        public int hashCode() {
            int iHashCode = ((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31;
            String str = this.thumbnail;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.index)) * 31) + this.tagId.hashCode();
        }

        public String toString() {
            return "Resolved(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", index=" + this.index + ", tagId=" + this.tagId + ")";
        }

        public Resolved(String contentsId, String url, String str, int i, String tagId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tagId, "tagId");
            this.contentsId = contentsId;
            this.url = url;
            this.thumbnail = str;
            this.index = i;
            this.tagId = tagId;
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

    /* JADX INFO: compiled from: VideoDetailLinkResolver.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult$Error;", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceResolveResult;", "reason", "Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceError;", "<init>", "(Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceError;)V", "getReason", "()Lcom/medicmedia/medilink/ui/video/detail/util/VideoOfflineReferenceError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Error implements VideoOfflineReferenceResolveResult {
        public static final int $stable = 0;
        private final VideoOfflineReferenceError reason;

        public static /* synthetic */ Error copy$default(Error error, VideoOfflineReferenceError videoOfflineReferenceError, int i, Object obj) {
            if ((i & 1) != 0) {
                videoOfflineReferenceError = error.reason;
            }
            return error.copy(videoOfflineReferenceError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoOfflineReferenceError getReason() {
            return this.reason;
        }

        public final Error copy(VideoOfflineReferenceError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.reason == ((Error) other).reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Error(reason=" + this.reason + ")";
        }

        public Error(VideoOfflineReferenceError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final VideoOfflineReferenceError getReason() {
            return this.reason;
        }
    }
}
