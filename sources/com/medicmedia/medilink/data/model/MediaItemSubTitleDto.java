package com.medicmedia.medilink.data.model;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.MediaItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaItemDto.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/data/model/MediaItemSubTitleDto;", "", "uri", "", "mineType", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getMineType", "getLanguage", "toExoItem", "Lcom/google/android/exoplayer2/MediaItem$Subtitle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MediaItemSubTitleDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String language;
    private final String mineType;
    private final String uri;

    public static /* synthetic */ MediaItemSubTitleDto copy$default(MediaItemSubTitleDto mediaItemSubTitleDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaItemSubTitleDto.uri;
        }
        if ((i & 2) != 0) {
            str2 = mediaItemSubTitleDto.mineType;
        }
        if ((i & 4) != 0) {
            str3 = mediaItemSubTitleDto.language;
        }
        return mediaItemSubTitleDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMineType() {
        return this.mineType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final MediaItemSubTitleDto copy(String uri, String mineType, String language) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mineType, "mineType");
        return new MediaItemSubTitleDto(uri, mineType, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItemSubTitleDto)) {
            return false;
        }
        MediaItemSubTitleDto mediaItemSubTitleDto = (MediaItemSubTitleDto) other;
        return Intrinsics.areEqual(this.uri, mediaItemSubTitleDto.uri) && Intrinsics.areEqual(this.mineType, mediaItemSubTitleDto.mineType) && Intrinsics.areEqual(this.language, mediaItemSubTitleDto.language);
    }

    public int hashCode() {
        int iHashCode = ((this.uri.hashCode() * 31) + this.mineType.hashCode()) * 31;
        String str = this.language;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MediaItemSubTitleDto(uri=" + this.uri + ", mineType=" + this.mineType + ", language=" + this.language + ")";
    }

    public MediaItemSubTitleDto(String uri, String mineType, String str) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mineType, "mineType");
        this.uri = uri;
        this.mineType = mineType;
        this.language = str;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getMineType() {
        return this.mineType;
    }

    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: compiled from: MediaItemDto.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/data/model/MediaItemSubTitleDto$Companion;", "", "<init>", "()V", "toDto", "Lcom/medicmedia/medilink/data/model/MediaItemSubTitleDto;", "item", "Lcom/google/android/exoplayer2/MediaItem$Subtitle;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MediaItemSubTitleDto toDto(MediaItem.Subtitle item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String string = item.uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String str = item.mimeType;
            if (str == null) {
                str = "";
            }
            return new MediaItemSubTitleDto(string, str, item.language);
        }
    }

    public final MediaItem.Subtitle toExoItem() {
        return new MediaItem.Subtitle(Uri.parse(this.uri), this.mineType, this.language, 1);
    }
}
