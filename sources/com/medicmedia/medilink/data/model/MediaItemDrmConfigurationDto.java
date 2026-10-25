package com.medicmedia.medilink.data.model;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.MediaItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaItemDto.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/data/model/MediaItemDrmConfigurationDto;", "", "uuid", "", "licenseUri", "multiSession", "", "forceDefaultLicenseUri", "requestHeaders", "", "isSessionForClearContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Z)V", "getUuid", "()Ljava/lang/String;", "getLicenseUri", "getMultiSession", "()Z", "getForceDefaultLicenseUri", "getRequestHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MediaItemDrmConfigurationDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean forceDefaultLicenseUri;
    private final boolean isSessionForClearContent;
    private final String licenseUri;
    private final boolean multiSession;
    private final Map<String, String> requestHeaders;
    private final String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaItemDrmConfigurationDto copy$default(MediaItemDrmConfigurationDto mediaItemDrmConfigurationDto, String str, String str2, boolean z, boolean z2, Map map, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaItemDrmConfigurationDto.uuid;
        }
        if ((i & 2) != 0) {
            str2 = mediaItemDrmConfigurationDto.licenseUri;
        }
        if ((i & 4) != 0) {
            z = mediaItemDrmConfigurationDto.multiSession;
        }
        if ((i & 8) != 0) {
            z2 = mediaItemDrmConfigurationDto.forceDefaultLicenseUri;
        }
        if ((i & 16) != 0) {
            map = mediaItemDrmConfigurationDto.requestHeaders;
        }
        if ((i & 32) != 0) {
            z3 = mediaItemDrmConfigurationDto.isSessionForClearContent;
        }
        Map map2 = map;
        boolean z4 = z3;
        return mediaItemDrmConfigurationDto.copy(str, str2, z, z2, map2, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLicenseUri() {
        return this.licenseUri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMultiSession() {
        return this.multiSession;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getForceDefaultLicenseUri() {
        return this.forceDefaultLicenseUri;
    }

    public final Map<String, String> component5() {
        return this.requestHeaders;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSessionForClearContent() {
        return this.isSessionForClearContent;
    }

    public final MediaItemDrmConfigurationDto copy(String uuid, String licenseUri, boolean multiSession, boolean forceDefaultLicenseUri, Map<String, String> requestHeaders, boolean isSessionForClearContent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return new MediaItemDrmConfigurationDto(uuid, licenseUri, multiSession, forceDefaultLicenseUri, requestHeaders, isSessionForClearContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItemDrmConfigurationDto)) {
            return false;
        }
        MediaItemDrmConfigurationDto mediaItemDrmConfigurationDto = (MediaItemDrmConfigurationDto) other;
        return Intrinsics.areEqual(this.uuid, mediaItemDrmConfigurationDto.uuid) && Intrinsics.areEqual(this.licenseUri, mediaItemDrmConfigurationDto.licenseUri) && this.multiSession == mediaItemDrmConfigurationDto.multiSession && this.forceDefaultLicenseUri == mediaItemDrmConfigurationDto.forceDefaultLicenseUri && Intrinsics.areEqual(this.requestHeaders, mediaItemDrmConfigurationDto.requestHeaders) && this.isSessionForClearContent == mediaItemDrmConfigurationDto.isSessionForClearContent;
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        String str = this.licenseUri;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.multiSession)) * 31) + Boolean.hashCode(this.forceDefaultLicenseUri)) * 31) + this.requestHeaders.hashCode()) * 31) + Boolean.hashCode(this.isSessionForClearContent);
    }

    public String toString() {
        return "MediaItemDrmConfigurationDto(uuid=" + this.uuid + ", licenseUri=" + this.licenseUri + ", multiSession=" + this.multiSession + ", forceDefaultLicenseUri=" + this.forceDefaultLicenseUri + ", requestHeaders=" + this.requestHeaders + ", isSessionForClearContent=" + this.isSessionForClearContent + ")";
    }

    public MediaItemDrmConfigurationDto(String uuid, String str, boolean z, boolean z2, Map<String, String> requestHeaders, boolean z3) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.uuid = uuid;
        this.licenseUri = str;
        this.multiSession = z;
        this.forceDefaultLicenseUri = z2;
        this.requestHeaders = requestHeaders;
        this.isSessionForClearContent = z3;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getLicenseUri() {
        return this.licenseUri;
    }

    public final boolean getMultiSession() {
        return this.multiSession;
    }

    public final boolean getForceDefaultLicenseUri() {
        return this.forceDefaultLicenseUri;
    }

    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final boolean isSessionForClearContent() {
        return this.isSessionForClearContent;
    }

    /* JADX INFO: compiled from: MediaItemDto.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/data/model/MediaItemDrmConfigurationDto$Companion;", "", "<init>", "()V", "toDto", "Lcom/medicmedia/medilink/data/model/MediaItemDrmConfigurationDto;", "item", "Lcom/google/android/exoplayer2/MediaItem$DrmConfiguration;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004b  */
        public final MediaItemDrmConfigurationDto toDto(MediaItem.DrmConfiguration item) {
            boolean z;
            Intrinsics.checkNotNullParameter(item, "item");
            String string = item.uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Uri uri = item.licenseUri;
            String string2 = uri != null ? uri.toString() : null;
            boolean z2 = item.multiSession;
            boolean z3 = item.forceDefaultLicenseUri;
            Map<String, String> requestHeaders = item.requestHeaders;
            Intrinsics.checkNotNullExpressionValue(requestHeaders, "requestHeaders");
            if (item.sessionForClearTypes.size() == 2) {
                z = item.sessionForClearTypes.contains(1) && item.sessionForClearTypes.contains(2);
            }
            return new MediaItemDrmConfigurationDto(string, string2, z2, z3, requestHeaders, z);
        }
    }
}
