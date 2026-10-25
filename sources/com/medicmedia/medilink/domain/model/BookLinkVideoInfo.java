package com.medicmedia.medilink.domain.model;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.VideoCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookLinkVideoInfo;", "Lcom/medicmedia/medilink/domain/model/LinkVideoInfo;", "contentId", "", "courseId", "", "chapterId", "courseVideoId", "playSec", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getCourseId", "()I", "getChapterId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseVideoId", "getPlaySec", "isVideoLink", "", "()Z", "isChapterLink", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/domain/model/BookLinkVideoInfo;", "equals", "other", "", "hashCode", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BookLinkVideoInfo implements LinkVideoInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer chapterId;
    private final String contentId;
    private final int courseId;
    private final Integer courseVideoId;
    private final String playSec;

    public static /* synthetic */ BookLinkVideoInfo copy$default(BookLinkVideoInfo bookLinkVideoInfo, String str, int i, Integer num, Integer num2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bookLinkVideoInfo.contentId;
        }
        if ((i2 & 2) != 0) {
            i = bookLinkVideoInfo.courseId;
        }
        if ((i2 & 4) != 0) {
            num = bookLinkVideoInfo.chapterId;
        }
        if ((i2 & 8) != 0) {
            num2 = bookLinkVideoInfo.courseVideoId;
        }
        if ((i2 & 16) != 0) {
            str2 = bookLinkVideoInfo.playSec;
        }
        String str3 = str2;
        Integer num3 = num;
        return bookLinkVideoInfo.copy(str, i, num3, num2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlaySec() {
        return this.playSec;
    }

    public final BookLinkVideoInfo copy(String contentId, int courseId, Integer chapterId, Integer courseVideoId, String playSec) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        return new BookLinkVideoInfo(contentId, courseId, chapterId, courseVideoId, playSec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookLinkVideoInfo)) {
            return false;
        }
        BookLinkVideoInfo bookLinkVideoInfo = (BookLinkVideoInfo) other;
        return Intrinsics.areEqual(this.contentId, bookLinkVideoInfo.contentId) && this.courseId == bookLinkVideoInfo.courseId && Intrinsics.areEqual(this.chapterId, bookLinkVideoInfo.chapterId) && Intrinsics.areEqual(this.courseVideoId, bookLinkVideoInfo.courseVideoId) && Intrinsics.areEqual(this.playSec, bookLinkVideoInfo.playSec);
    }

    public int hashCode() {
        int iHashCode = ((this.contentId.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31;
        Integer num = this.chapterId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.courseVideoId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.playSec;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BookLinkVideoInfo(contentId=" + this.contentId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", courseVideoId=" + this.courseVideoId + ", playSec=" + this.playSec + ")";
    }

    public BookLinkVideoInfo(String contentId, int i, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        this.contentId = contentId;
        this.courseId = i;
        this.chapterId = num;
        this.courseVideoId = num2;
        this.playSec = str;
    }

    public /* synthetic */ BookLinkVideoInfo(String str, int i, Integer num, Integer num2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, num, num2, (i2 & 16) != 0 ? null : str2);
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public String getContentId() {
        return this.contentId;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public int getCourseId() {
        return this.courseId;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public Integer getChapterId() {
        return this.chapterId;
    }

    @Override // com.medicmedia.medilink.domain.model.LinkVideoInfo
    public Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    public final String getPlaySec() {
        return this.playSec;
    }

    public final boolean isVideoLink() {
        return (getChapterId() == null || getCourseVideoId() == null) ? false : true;
    }

    public final boolean isChapterLink() {
        return getChapterId() != null && getCourseVideoId() == null;
    }

    /* JADX INFO: compiled from: VideoCourseItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookLinkVideoInfo$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/BookLinkVideoInfo;", "url", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BookLinkVideoInfo convertTo(String url) {
            Uri uri;
            String queryParameter;
            Integer intOrNull;
            String value;
            Long longOrNull;
            Intrinsics.checkNotNullParameter(url, "url");
            String string = null;
            if (!StringsKt.startsWith$default(url, "https://lec.medilink-study.com/front/open", false, 2, (Object) null) || (queryParameter = (uri = Uri.parse(url)).getQueryParameter("courseId")) == null || (intOrNull = StringsKt.toIntOrNull(queryParameter)) == null) {
                return null;
            }
            int iIntValue = intOrNull.intValue();
            String queryParameter2 = uri.getQueryParameter("chapterId");
            Integer intOrNull2 = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
            String queryParameter3 = uri.getQueryParameter("movieId");
            Integer intOrNull3 = queryParameter3 != null ? StringsKt.toIntOrNull(queryParameter3) : null;
            String queryParameter4 = uri.getQueryParameter(NotificationCompat.CATEGORY_SERVICE);
            if (queryParameter4 == null || (value = VideoCode.INSTANCE.contentCode(queryParameter4)) == null) {
                value = VideoCode.IGAKU.getValue();
            }
            String str = value;
            String queryParameter5 = uri.getQueryParameter(QueryParameterKey.PLAY_SEC);
            if (queryParameter5 != null && (longOrNull = StringsKt.toLongOrNull(queryParameter5)) != null) {
                string = longOrNull.toString();
            }
            return new BookLinkVideoInfo(str, iIntValue, intOrNull2, intOrNull3, string);
        }
    }
}
