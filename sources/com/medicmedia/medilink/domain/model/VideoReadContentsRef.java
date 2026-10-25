package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalyticsEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoReadContentsRef;", "Lcom/medicmedia/medilink/domain/model/FAEventItem;", "name", "", BundleKey.VIDEO_ID, "", "videoHash", "url", "goToLicenseCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVideoId", "()I", "getVideoHash", "getUrl", "getGoToLicenseCode", "params", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoReadContentsRef implements FAEventItem {
    private final String goToLicenseCode;
    private final String name;
    private final String url;
    private final String videoHash;
    private final int videoId;

    public static /* synthetic */ VideoReadContentsRef copy$default(VideoReadContentsRef videoReadContentsRef, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoReadContentsRef.name;
        }
        if ((i2 & 2) != 0) {
            i = videoReadContentsRef.videoId;
        }
        if ((i2 & 4) != 0) {
            str2 = videoReadContentsRef.videoHash;
        }
        if ((i2 & 8) != 0) {
            str3 = videoReadContentsRef.url;
        }
        if ((i2 & 16) != 0) {
            str4 = videoReadContentsRef.goToLicenseCode;
        }
        String str5 = str4;
        String str6 = str2;
        return videoReadContentsRef.copy(str, i, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGoToLicenseCode() {
        return this.goToLicenseCode;
    }

    public final VideoReadContentsRef copy(String name, int videoId, String videoHash, String url, String goToLicenseCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(goToLicenseCode, "goToLicenseCode");
        return new VideoReadContentsRef(name, videoId, videoHash, url, goToLicenseCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoReadContentsRef)) {
            return false;
        }
        VideoReadContentsRef videoReadContentsRef = (VideoReadContentsRef) other;
        return Intrinsics.areEqual(this.name, videoReadContentsRef.name) && this.videoId == videoReadContentsRef.videoId && Intrinsics.areEqual(this.videoHash, videoReadContentsRef.videoHash) && Intrinsics.areEqual(this.url, videoReadContentsRef.url) && Intrinsics.areEqual(this.goToLicenseCode, videoReadContentsRef.goToLicenseCode);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + Integer.hashCode(this.videoId)) * 31) + this.videoHash.hashCode()) * 31) + this.url.hashCode()) * 31) + this.goToLicenseCode.hashCode();
    }

    public String toString() {
        return "VideoReadContentsRef(name=" + this.name + ", videoId=" + this.videoId + ", videoHash=" + this.videoHash + ", url=" + this.url + ", goToLicenseCode=" + this.goToLicenseCode + ")";
    }

    public VideoReadContentsRef(String name, int i, String videoHash, String url, String goToLicenseCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(goToLicenseCode, "goToLicenseCode");
        this.name = name;
        this.videoId = i;
        this.videoHash = videoHash;
        this.url = url;
        this.goToLicenseCode = goToLicenseCode;
    }

    public /* synthetic */ VideoReadContentsRef(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnalyticsEvent.Name.VIDEO_READ_CONTENTS_REF : str, i, str2, str3, str4);
    }

    @Override // com.medicmedia.medilink.domain.model.FAEventItem
    public String getName() {
        return this.name;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getGoToLicenseCode() {
        return this.goToLicenseCode;
    }

    @Override // com.medicmedia.medilink.domain.model.FAEventItem
    public Map<String, String> params() {
        return MapsKt.mapOf(TuplesKt.to("current_url", String.valueOf(this.videoId)), TuplesKt.to("video_hash", this.videoHash), TuplesKt.to(AnalyticsEvent.Param.GOTO_URL, this.url), TuplesKt.to(AnalyticsEvent.Param.GOTO_LICENSE_CODE, this.goToLicenseCode));
    }
}
