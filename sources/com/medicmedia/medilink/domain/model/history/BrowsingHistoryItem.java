package com.medicmedia.medilink.domain.model.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: HistoryItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u00100\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u00101J\u001a\u00100\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\u0094\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0011\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0013\u0010&\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0013\u0010(\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0013\u0010*\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006G"}, d2 = {"Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", HistoryRepositoryImpl.FieldName.TITLE, "", "subTitle", "updatedDate", "Ljava/util/Date;", "option", "id", "url", "contentsId", "documentReferenceId", "contentsTitle", "thumbnailUrl", "videoThumbnailUrl", "isMasking", "", "isQbv4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getUpdatedDate", "()Ljava/util/Date;", "getOption", "getId", "getUrl", "getContentsId", "getDocumentReferenceId", "getContentsTitle", "getThumbnailUrl", "getVideoThumbnailUrl", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "fileName", "getFileName", "courseId", "getCourseId", "chapterId", "getChapterId", BundleKey.VIDEO_ID, "getVideoId", "playTime", "", "getPlayTime", "()Ljava/lang/Long;", "copyItem", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "equals", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BrowsingHistoryItem implements CommonHistoryItem<BrowsingHistoryItem> {
    private final String contentsId;
    private final String contentsTitle;
    private final String documentReferenceId;
    private final String id;
    private final boolean isMasking;
    private final Boolean isQbv4;
    private final String option;
    private final String subTitle;
    private final String thumbnailUrl;
    private final String title;
    private final Date updatedDate;
    private final String url;
    private final String videoThumbnailUrl;

    public static /* synthetic */ BrowsingHistoryItem copy$default(BrowsingHistoryItem browsingHistoryItem, String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browsingHistoryItem.title;
        }
        return browsingHistoryItem.copy(str, (i & 2) != 0 ? browsingHistoryItem.subTitle : str2, (i & 4) != 0 ? browsingHistoryItem.updatedDate : date, (i & 8) != 0 ? browsingHistoryItem.option : str3, (i & 16) != 0 ? browsingHistoryItem.id : str4, (i & 32) != 0 ? browsingHistoryItem.url : str5, (i & 64) != 0 ? browsingHistoryItem.contentsId : str6, (i & 128) != 0 ? browsingHistoryItem.documentReferenceId : str7, (i & 256) != 0 ? browsingHistoryItem.contentsTitle : str8, (i & 512) != 0 ? browsingHistoryItem.thumbnailUrl : str9, (i & 1024) != 0 ? browsingHistoryItem.videoThumbnailUrl : str10, (i & 2048) != 0 ? browsingHistoryItem.isMasking : z, (i & 4096) != 0 ? browsingHistoryItem.isQbv4 : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsMasking() {
        return this.isMasking;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsQbv4() {
        return this.isQbv4;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDocumentReferenceId() {
        return this.documentReferenceId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    public final BrowsingHistoryItem copy(String title, String subTitle, Date updatedDate, String option, String id, String url, String contentsId, String documentReferenceId, String contentsTitle, String thumbnailUrl, String videoThumbnailUrl, boolean isMasking, Boolean isQbv4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(documentReferenceId, "documentReferenceId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        return new BrowsingHistoryItem(title, subTitle, updatedDate, option, id, url, contentsId, documentReferenceId, contentsTitle, thumbnailUrl, videoThumbnailUrl, isMasking, isQbv4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowsingHistoryItem)) {
            return false;
        }
        BrowsingHistoryItem browsingHistoryItem = (BrowsingHistoryItem) other;
        return Intrinsics.areEqual(this.title, browsingHistoryItem.title) && Intrinsics.areEqual(this.subTitle, browsingHistoryItem.subTitle) && Intrinsics.areEqual(this.updatedDate, browsingHistoryItem.updatedDate) && Intrinsics.areEqual(this.option, browsingHistoryItem.option) && Intrinsics.areEqual(this.id, browsingHistoryItem.id) && Intrinsics.areEqual(this.url, browsingHistoryItem.url) && Intrinsics.areEqual(this.contentsId, browsingHistoryItem.contentsId) && Intrinsics.areEqual(this.documentReferenceId, browsingHistoryItem.documentReferenceId) && Intrinsics.areEqual(this.contentsTitle, browsingHistoryItem.contentsTitle) && Intrinsics.areEqual(this.thumbnailUrl, browsingHistoryItem.thumbnailUrl) && Intrinsics.areEqual(this.videoThumbnailUrl, browsingHistoryItem.videoThumbnailUrl) && this.isMasking == browsingHistoryItem.isMasking && Intrinsics.areEqual(this.isQbv4, browsingHistoryItem.isQbv4);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.updatedDate.hashCode()) * 31) + this.option.hashCode()) * 31) + this.id.hashCode()) * 31) + this.url.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.documentReferenceId.hashCode()) * 31) + this.contentsTitle.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31;
        String str = this.videoThumbnailUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isMasking)) * 31;
        Boolean bool = this.isQbv4;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BrowsingHistoryItem(title=" + this.title + ", subTitle=" + this.subTitle + ", updatedDate=" + this.updatedDate + ", option=" + this.option + ", id=" + this.id + ", url=" + this.url + ", contentsId=" + this.contentsId + ", documentReferenceId=" + this.documentReferenceId + ", contentsTitle=" + this.contentsTitle + ", thumbnailUrl=" + this.thumbnailUrl + ", videoThumbnailUrl=" + this.videoThumbnailUrl + ", isMasking=" + this.isMasking + ", isQbv4=" + this.isQbv4 + ")";
    }

    public BrowsingHistoryItem(String title, String subTitle, Date updatedDate, String option, String id, String url, String contentsId, String documentReferenceId, String contentsTitle, String thumbnailUrl, String str, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(documentReferenceId, "documentReferenceId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        this.title = title;
        this.subTitle = subTitle;
        this.updatedDate = updatedDate;
        this.option = option;
        this.id = id;
        this.url = url;
        this.contentsId = contentsId;
        this.documentReferenceId = documentReferenceId;
        this.contentsTitle = contentsTitle;
        this.thumbnailUrl = thumbnailUrl;
        this.videoThumbnailUrl = str;
        this.isMasking = z;
        this.isQbv4 = bool;
    }

    public /* synthetic */ BrowsingHistoryItem(String str, String str2, Date date, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, date, str3, str4, str5, str6, str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? true : z, (i & 4096) != 0 ? null : bool);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getOption() {
        return this.option;
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getUrl() {
        return this.url;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getContentsId() {
        return this.contentsId;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getDocumentReferenceId() {
        return this.documentReferenceId;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getContentsTitle() {
        return this.contentsTitle;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public boolean isMasking() {
        return this.isMasking;
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public Boolean isQbv4() {
        return this.isQbv4;
    }

    public final String getFileName() {
        String strSubstringBefore$default;
        String str = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) getUrl(), new String[]{DomExceptionUtils.SEPARATOR}, false, 0, 6, (Object) null));
        if (str == null || (strSubstringBefore$default = StringsKt.substringBefore$default(str, MLConst.MLCommon.SHARP, (String) null, 2, (Object) null)) == null || StringsKt.isBlank(strSubstringBefore$default)) {
            return null;
        }
        return strSubstringBefore$default;
    }

    public final String getCourseId() {
        return (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) this.id, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null), 1);
    }

    public final String getChapterId() {
        return (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) this.id, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null), 2);
    }

    public final String getVideoId() {
        return (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) this.id, new String[]{MLConst.MLCommon.SEPALETER_SINGLE_TEXT}, false, 0, 6, (Object) null));
    }

    public final Long getPlayTime() {
        Object objM11499constructorimpl;
        String str = this.option;
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            BrowsingHistoryItem browsingHistoryItem = this;
            objM11499constructorimpl = Result.m11499constructorimpl(Long.valueOf(new JSONObject(str).getLong("play_msec")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        return (Long) (Result.m11505isFailureimpl(objM11499constructorimpl) ? null : objM11499constructorimpl);
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public BrowsingHistoryItem copyItem(String contentsTitle, String thumbnailUrl, boolean isMasking, Boolean isQbv4) {
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        return copy$default(this, null, null, null, null, null, null, null, null, contentsTitle, thumbnailUrl, null, isMasking, isQbv4, 1279, null);
    }

    @Override // com.medicmedia.medilink.domain.model.history.CommonHistoryItem
    public BrowsingHistoryItem copyItem(String videoThumbnailUrl, boolean isMasking) {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, videoThumbnailUrl, isMasking, null, 5119, null);
    }
}
