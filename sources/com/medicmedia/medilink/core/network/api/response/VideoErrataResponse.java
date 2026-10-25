package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.medicmedia.medilink.domain.model.WorkerKey;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoErrataResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoErrataResponse;", "", BundleKey.VIDEO_ID, "", "errata", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoErrataResponse$Errata;", "<init>", "(ILjava/util/List;)V", "getVideoId", "()I", "getErrata", "()Ljava/util/List;", "Errata", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoErrataResponse {
    private final List<Errata> errata;
    private final int videoId;

    public VideoErrataResponse(@Json(name = AnalyticsEvent.Param.VIDEO_ID) int i, List<Errata> errata) {
        Intrinsics.checkNotNullParameter(errata, "errata");
        this.videoId = i;
        this.errata = errata;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final List<Errata> getErrata() {
        return this.errata;
    }

    /* JADX INFO: compiled from: VideoErrataResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoErrataResponse$Errata;", "", "errataId", "", "courseId", "chapterId", "modifiedDate", "", "media", "point", "overview", "wrong", "correct", "supplement", "insertedDate", "updatedDate", "insertedUser", "updatedUser", WorkerKey.KEY_VERSION, "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getErrataId", "()I", "getCourseId", "getChapterId", "getModifiedDate", "()Ljava/lang/String;", "getMedia", "getPoint", "getOverview", "getWrong", "getCorrect", "getSupplement", "getInsertedDate", "getUpdatedDate", "getInsertedUser", "getUpdatedUser", "getVersion", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Errata {
        private final int chapterId;
        private final String correct;
        private final int courseId;
        private final int errataId;
        private final String insertedDate;
        private final String insertedUser;
        private final String media;
        private final String modifiedDate;
        private final String overview;
        private final String point;
        private final String supplement;
        private final String updatedDate;
        private final String updatedUser;
        private final int version;
        private final String wrong;

        public Errata(@Json(name = "errata_id") int i, @Json(name = BundleKey.COURSE_ID) int i2, @Json(name = "chapter_id") int i3, @Json(name = "modified_date") String modifiedDate, String media, String point, String overview, String wrong, String correct, String supplement, @Json(name = "inserted_date") String insertedDate, @Json(name = "updated_date") String str, @Json(name = "inserted_user") String insertedUser, @Json(name = "updated_user") String str2, int i4) {
            Intrinsics.checkNotNullParameter(modifiedDate, "modifiedDate");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(overview, "overview");
            Intrinsics.checkNotNullParameter(wrong, "wrong");
            Intrinsics.checkNotNullParameter(correct, "correct");
            Intrinsics.checkNotNullParameter(supplement, "supplement");
            Intrinsics.checkNotNullParameter(insertedDate, "insertedDate");
            Intrinsics.checkNotNullParameter(insertedUser, "insertedUser");
            this.errataId = i;
            this.courseId = i2;
            this.chapterId = i3;
            this.modifiedDate = modifiedDate;
            this.media = media;
            this.point = point;
            this.overview = overview;
            this.wrong = wrong;
            this.correct = correct;
            this.supplement = supplement;
            this.insertedDate = insertedDate;
            this.updatedDate = str;
            this.insertedUser = insertedUser;
            this.updatedUser = str2;
            this.version = i4;
        }

        public final int getErrataId() {
            return this.errataId;
        }

        public final int getCourseId() {
            return this.courseId;
        }

        public final int getChapterId() {
            return this.chapterId;
        }

        public final String getModifiedDate() {
            return this.modifiedDate;
        }

        public final String getMedia() {
            return this.media;
        }

        public final String getPoint() {
            return this.point;
        }

        public final String getOverview() {
            return this.overview;
        }

        public final String getWrong() {
            return this.wrong;
        }

        public final String getCorrect() {
            return this.correct;
        }

        public final String getSupplement() {
            return this.supplement;
        }

        public final String getInsertedDate() {
            return this.insertedDate;
        }

        public final String getUpdatedDate() {
            return this.updatedDate;
        }

        public final String getInsertedUser() {
            return this.insertedUser;
        }

        public final String getUpdatedUser() {
            return this.updatedUser;
        }

        public final int getVersion() {
            return this.version;
        }
    }
}
