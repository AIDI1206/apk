package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.domain.BundleKey;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentUrlResult;", "", "contentsId", "", "contentsIndex", "", "path", "fileName", BundleKey.TAG_ID, BundleKey.THUMBNAIL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getContentsIndex", "()I", "getPath", "getFileName", "getTagId", "getThumbnail", "filePath", "getFilePath", "url", "getUrl", "contentsUrl", "toOfflineItem", "Lcom/medicmedia/medilink/domain/model/OfflineViewArgItem;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentUrlResult {
    private final String contentsId;
    private final int contentsIndex;
    private final String fileName;
    private final String path;
    private final String tagId;
    private final String thumbnail;

    public static /* synthetic */ ContentUrlResult copy$default(ContentUrlResult contentUrlResult, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentUrlResult.contentsId;
        }
        if ((i2 & 2) != 0) {
            i = contentUrlResult.contentsIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = contentUrlResult.path;
        }
        if ((i2 & 8) != 0) {
            str3 = contentUrlResult.fileName;
        }
        if ((i2 & 16) != 0) {
            str4 = contentUrlResult.tagId;
        }
        if ((i2 & 32) != 0) {
            str5 = contentUrlResult.thumbnail;
        }
        String str6 = str4;
        String str7 = str5;
        return contentUrlResult.copy(str, i, str2, str3, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getContentsIndex() {
        return this.contentsIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final ContentUrlResult copy(String contentsId, int contentsIndex, String path, String fileName, String tagId, String thumbnail) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        return new ContentUrlResult(contentsId, contentsIndex, path, fileName, tagId, thumbnail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentUrlResult)) {
            return false;
        }
        ContentUrlResult contentUrlResult = (ContentUrlResult) other;
        return Intrinsics.areEqual(this.contentsId, contentUrlResult.contentsId) && this.contentsIndex == contentUrlResult.contentsIndex && Intrinsics.areEqual(this.path, contentUrlResult.path) && Intrinsics.areEqual(this.fileName, contentUrlResult.fileName) && Intrinsics.areEqual(this.tagId, contentUrlResult.tagId) && Intrinsics.areEqual(this.thumbnail, contentUrlResult.thumbnail);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.contentsId.hashCode() * 31) + Integer.hashCode(this.contentsIndex)) * 31) + this.path.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.tagId.hashCode()) * 31;
        String str = this.thumbnail;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ContentUrlResult(contentsId=" + this.contentsId + ", contentsIndex=" + this.contentsIndex + ", path=" + this.path + ", fileName=" + this.fileName + ", tagId=" + this.tagId + ", thumbnail=" + this.thumbnail + ")";
    }

    public ContentUrlResult(String contentsId, int i, String path, String fileName, String tagId, String str) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        this.contentsId = contentsId;
        this.contentsIndex = i;
        this.path = path;
        this.fileName = fileName;
        this.tagId = tagId;
        this.thumbnail = str;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getContentsIndex() {
        return this.contentsIndex;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getFilePath() {
        return MLConst.MLCommon.FILE_FORMAT + this.path + this.fileName;
    }

    public final String getUrl() {
        if (this.tagId.length() <= 0 || ContentsUrlItemKt.tocList.contains(this.tagId)) {
            return getFilePath();
        }
        return getFilePath() + MLConst.MLCommon.SHARP + this.tagId;
    }

    public final String contentsUrl() throws UnsupportedEncodingException {
        String filePath;
        String string;
        if (this.tagId.length() <= 0 || ContentsUrlItemKt.tocList.contains(this.tagId)) {
            filePath = getFilePath();
        } else {
            filePath = getFilePath() + MLConst.MLCommon.SHARP + this.tagId;
        }
        String str = "http://app-client.medilink-study.com/contents?contents_url=" + URLEncoder.encode(filePath, MLConst.MedilinkUrls.UTF_8) + "&contents_id=" + this.contentsId + "&contents_index=" + this.contentsIndex;
        String str2 = this.thumbnail;
        return (str2 == null || (string = new StringBuilder().append(str).append("&thumbnail=").append(str2).toString()) == null) ? str : string;
    }

    public final OfflineViewArgItem toOfflineItem() {
        String str;
        if (this.tagId.length() > 0) {
            str = MLConst.MLCommon.SHARP + this.tagId;
        } else {
            str = "";
        }
        return new OfflineViewArgItem(getFilePath(), this.contentsId, this.contentsIndex, str, true, null, 32, null);
    }
}
