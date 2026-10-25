package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.provider.FontsContractCompat;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001:\u00049:;<B\u0093\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016\u0012\u000e\b\u0003\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0004\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b*\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b/\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b1\u0010\"R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b2\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016¢\u0006\b\n\u0000\u001a\u0004\b8\u00105¨\u0006="}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse;", "", "courseId", "", "isWebinar", "courseTitle", "", "courseType", "fieldTypeId", "detail", "thumb", "videogId", "videoHash", "thumbnailXl", "thumbnailL", "videoNumber", "playTime", "timeLimitTo", "displayOrder", "videoConditionId", "timeLimitFrom", "conditions", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Condition;", "webinar", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Webinar;", "chapters", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter;", "courseTypes", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$CourseType;", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCourseId", "()I", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseTitle", "()Ljava/lang/String;", "getCourseType", "getFieldTypeId", "getDetail", "getThumb", "getVideogId", "getVideoHash", "getThumbnailXl", "getThumbnailL", "getVideoNumber", "getPlayTime", "getTimeLimitTo", "getDisplayOrder", "getVideoConditionId", "getTimeLimitFrom", "getConditions", "()Ljava/util/List;", "getWebinar", "getChapters", "getCourseTypes", "Condition", "CourseType", "Webinar", "Chapter", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoCourseResponse {
    private final List<Chapter> chapters;
    private final List<Condition> conditions;
    private final int courseId;
    private final String courseTitle;
    private final Integer courseType;
    private final List<CourseType> courseTypes;
    private final String detail;
    private final Integer displayOrder;
    private final Integer fieldTypeId;
    private final Integer isWebinar;
    private final Integer playTime;
    private final String thumb;
    private final String thumbnailL;
    private final String thumbnailXl;
    private final String timeLimitFrom;
    private final String timeLimitTo;
    private final Integer videoConditionId;
    private final String videoHash;
    private final Integer videoNumber;
    private final Integer videogId;
    private final List<Webinar> webinar;

    public VideoCourseResponse(@Json(name = BundleKey.COURSE_ID) int i, @Json(name = "is_webinar") Integer num, @Json(name = "course_title") String str, @Json(name = "course_type") Integer num2, @Json(name = "field_type_id") Integer num3, String str2, String str3, @Json(name = "videog_id") Integer num4, @Json(name = "video_hash") String str4, @Json(name = "thumbnail_xl") String str5, @Json(name = "thumbnail_l") String str6, @Json(name = "video_number") Integer num5, @Json(name = "play_time") Integer num6, @Json(name = "time_limit_to") String str7, @Json(name = "display_order") Integer num7, @Json(name = "view_condition_id") Integer num8, @Json(name = "time_limit_from") String str8, List<Condition> conditions, List<Webinar> list, List<Chapter> chapters, @Json(name = "course_types") List<CourseType> courseTypes) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        Intrinsics.checkNotNullParameter(courseTypes, "courseTypes");
        this.courseId = i;
        this.isWebinar = num;
        this.courseTitle = str;
        this.courseType = num2;
        this.fieldTypeId = num3;
        this.detail = str2;
        this.thumb = str3;
        this.videogId = num4;
        this.videoHash = str4;
        this.thumbnailXl = str5;
        this.thumbnailL = str6;
        this.videoNumber = num5;
        this.playTime = num6;
        this.timeLimitTo = str7;
        this.displayOrder = num7;
        this.videoConditionId = num8;
        this.timeLimitFrom = str8;
        this.conditions = conditions;
        this.webinar = list;
        this.chapters = chapters;
        this.courseTypes = courseTypes;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: isWebinar, reason: from getter */
    public final Integer getIsWebinar() {
        return this.isWebinar;
    }

    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final Integer getCourseType() {
        return this.courseType;
    }

    public final Integer getFieldTypeId() {
        return this.fieldTypeId;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final Integer getVideogId() {
        return this.videogId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    public final String getThumbnailL() {
        return this.thumbnailL;
    }

    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    public final Integer getPlayTime() {
        return this.playTime;
    }

    public final String getTimeLimitTo() {
        return this.timeLimitTo;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final Integer getVideoConditionId() {
        return this.videoConditionId;
    }

    public final String getTimeLimitFrom() {
        return this.timeLimitFrom;
    }

    public /* synthetic */ VideoCourseResponse(int i, Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, Integer num6, String str7, Integer num7, Integer num8, String str8, List list, List list2, List list3, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : num4, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : num5, (i2 & 4096) != 0 ? null : num6, (i2 & 8192) != 0 ? null : str7, (i2 & 16384) != 0 ? null : num7, (i2 & 32768) != 0 ? null : num8, (i2 & 65536) != 0 ? null : str8, (i2 & 131072) != 0 ? CollectionsKt.emptyList() : list, (i2 & 262144) == 0 ? list2 : null, (i2 & 524288) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 1048576) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final List<Condition> getConditions() {
        return this.conditions;
    }

    public final List<Webinar> getWebinar() {
        return this.webinar;
    }

    public final List<Chapter> getChapters() {
        return this.chapters;
    }

    public final List<CourseType> getCourseTypes() {
        return this.courseTypes;
    }

    /* JADX INFO: compiled from: VideoCourseResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Condition;", "", "viewConditionId", "", "conditionTarget", "", "licenseCodes", "conditionValid", "conditionExpireDate", "updatedDate", "isMaster", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getViewConditionId", "()I", "getConditionTarget", "()Ljava/lang/String;", "getLicenseCodes", "getConditionValid", "getConditionExpireDate", "getUpdatedDate", "()Z", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Condition {
        private final String conditionExpireDate;
        private final String conditionTarget;
        private final String conditionValid;
        private final boolean isMaster;
        private final String licenseCodes;
        private final String updatedDate;
        private final int viewConditionId;

        public Condition(@Json(name = "view_condition_id") int i, @Json(name = "condition_target") String str, @Json(name = "license_codes") String str2, @Json(name = "condition_valid") String str3, @Json(name = "condition_expire_date") String str4, @Json(name = "updated_date") String str5, @Json(name = "is_master") boolean z) {
            this.viewConditionId = i;
            this.conditionTarget = str;
            this.licenseCodes = str2;
            this.conditionValid = str3;
            this.conditionExpireDate = str4;
            this.updatedDate = str5;
            this.isMaster = z;
        }

        public final int getViewConditionId() {
            return this.viewConditionId;
        }

        public final String getConditionTarget() {
            return this.conditionTarget;
        }

        public final String getLicenseCodes() {
            return this.licenseCodes;
        }

        public final String getConditionValid() {
            return this.conditionValid;
        }

        public final String getConditionExpireDate() {
            return this.conditionExpireDate;
        }

        public final String getUpdatedDate() {
            return this.updatedDate;
        }

        /* JADX INFO: renamed from: isMaster, reason: from getter */
        public final boolean getIsMaster() {
            return this.isMaster;
        }
    }

    /* JADX INFO: compiled from: VideoCourseResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$CourseType;", "", "id", "", "courseId", "", "courseType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "getId", "()Ljava/lang/String;", "getCourseId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseType", "()I", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class CourseType {
        private final Integer courseId;
        private final int courseType;
        private final String id;

        public CourseType(String str, @Json(name = BundleKey.COURSE_ID) Integer num, @Json(name = "course_type") int i) {
            this.id = str;
            this.courseId = num;
            this.courseType = i;
        }

        public final String getId() {
            return this.id;
        }

        public final Integer getCourseId() {
            return this.courseId;
        }

        public final int getCourseType() {
            return this.courseType;
        }
    }

    /* JADX INFO: compiled from: VideoCourseResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Webinar;", "", "meetingNumber", "", "password", "leaveUrl", "memberIdPname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMeetingNumber", "()Ljava/lang/String;", "getPassword", "getLeaveUrl", "getMemberIdPname", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Webinar {
        private final String leaveUrl;
        private final String meetingNumber;
        private final String memberIdPname;
        private final String password;

        public Webinar(@Json(name = "meeting_number") String str, String str2, @Json(name = "leave_url") String str3, @Json(name = "member_id_pname") String str4) {
            this.meetingNumber = str;
            this.password = str2;
            this.leaveUrl = str3;
            this.memberIdPname = str4;
        }

        public final String getMeetingNumber() {
            return this.meetingNumber;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getLeaveUrl() {
            return this.leaveUrl;
        }

        public final String getMemberIdPname() {
            return this.memberIdPname;
        }
    }

    /* JADX INFO: compiled from: VideoCourseResponse.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0003,-.B±\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter;", "", "chapterId", "", "courseId", "chaptersTitle", "", "displayOrder", "videoTimeSec", "videoNumber", "hasCategory", "", "revisionText", "revisionStartDate", "revisionEndDate", "videoIds", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video;", "category", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Category;", "pdfFiles", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$PDFFile;", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChapterId", "()I", "getCourseId", "getChaptersTitle", "()Ljava/lang/String;", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVideoTimeSec", "getVideoNumber", "getHasCategory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRevisionText", "getRevisionStartDate", "getRevisionEndDate", "getVideoIds", "()Ljava/util/List;", "getCategory", "getPdfFiles", "Video", "Category", "PDFFile", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Chapter {
        private final List<Category> category;
        private final int chapterId;
        private final String chaptersTitle;
        private final int courseId;
        private final Integer displayOrder;
        private final Boolean hasCategory;
        private final List<PDFFile> pdfFiles;
        private final String revisionEndDate;
        private final String revisionStartDate;
        private final String revisionText;
        private final List<Video> videoIds;
        private final Integer videoNumber;
        private final Integer videoTimeSec;

        public Chapter(@Json(name = "chapter_id") int i, @Json(name = BundleKey.COURSE_ID) int i2, @Json(name = "chapters_title") String str, @Json(name = "display_order") Integer num, @Json(name = "video_time_sec") Integer num2, @Json(name = "video_number") Integer num3, @Json(name = "has_category") Boolean bool, @Json(name = "revision_text") String str2, @Json(name = "revision_start_date") String str3, @Json(name = "revision_end_date") String str4, @Json(name = "video_ids") List<Video> list, List<Category> list2, @Json(name = "pdf_files") List<PDFFile> list3) {
            this.chapterId = i;
            this.courseId = i2;
            this.chaptersTitle = str;
            this.displayOrder = num;
            this.videoTimeSec = num2;
            this.videoNumber = num3;
            this.hasCategory = bool;
            this.revisionText = str2;
            this.revisionStartDate = str3;
            this.revisionEndDate = str4;
            this.videoIds = list;
            this.category = list2;
            this.pdfFiles = list3;
        }

        public /* synthetic */ Chapter(int i, int i2, String str, Integer num, Integer num2, Integer num3, Boolean bool, String str2, String str3, String str4, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : list2, (i3 & 4096) != 0 ? null : list3);
        }

        public final int getChapterId() {
            return this.chapterId;
        }

        public final int getCourseId() {
            return this.courseId;
        }

        public final String getChaptersTitle() {
            return this.chaptersTitle;
        }

        public final Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public final Integer getVideoTimeSec() {
            return this.videoTimeSec;
        }

        public final Integer getVideoNumber() {
            return this.videoNumber;
        }

        public final Boolean getHasCategory() {
            return this.hasCategory;
        }

        public final String getRevisionText() {
            return this.revisionText;
        }

        public final String getRevisionStartDate() {
            return this.revisionStartDate;
        }

        public final String getRevisionEndDate() {
            return this.revisionEndDate;
        }

        public final List<Video> getVideoIds() {
            return this.videoIds;
        }

        public final List<Category> getCategory() {
            return this.category;
        }

        public final List<PDFFile> getPdfFiles() {
            return this.pdfFiles;
        }

        /* JADX INFO: compiled from: VideoCourseResponse.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b,\u0018\u00002\u00020\u0001:\u0002RSB\u008d\u0003\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\b7\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\b@\u00102R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\bA\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0018\u00102R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\bC\u00102R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\bD\u00102R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\bI\u00102R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010,R\u0015\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00103\u001a\u0004\bN\u00102R\u0015\u0010'\u001a\u0004\u0018\u00010(¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video;", "", "documentId", "", BundleKey.VIDEO_ID, "", "courseId", "chapterId", "subcategoryId", "displayOrder", "videoTitle", "detail", "recommend", "linkCode1", "linkCode2", "linkCode3", "linkUrl1", "linkUrl2", "linkUrl3", "videoCode", "lecture", "playTimeMin", "playTimeSec", "viewConditionId", "isCbt", "frequentOrder", "videogId", HistoryRepositoryImpl.FieldName.TITLE, "thumbnailXl", "thumbnailL", "videoHash", "courseVideoId", "qbQuestions", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video$VideoQBQuestion;", "refItems", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video$VideoRefItem;", "inputCardUrl", "downloadable", "srcSize", "", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "getDocumentId", "()Ljava/lang/String;", "getVideoId", "()I", "getCourseId", "getChapterId", "getSubcategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayOrder", "getVideoTitle", "getDetail", "getRecommend", "getLinkCode1", "getLinkCode2", "getLinkCode3", "getLinkUrl1", "getLinkUrl2", "getLinkUrl3", "getVideoCode", "getLecture", "getPlayTimeMin", "getPlayTimeSec", "getViewConditionId", "getFrequentOrder", "getVideogId", "getTitle", "getThumbnailXl", "getThumbnailL", "getVideoHash", "getCourseVideoId", "getQbQuestions", "()Ljava/util/List;", "getRefItems", "getInputCardUrl", "getDownloadable", "getSrcSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "VideoQBQuestion", "VideoRefItem", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Video {
            private final int chapterId;
            private final int courseId;
            private final Integer courseVideoId;
            private final String detail;
            private final int displayOrder;
            private final String documentId;
            private final Integer downloadable;
            private final Integer frequentOrder;
            private final String inputCardUrl;
            private final Integer isCbt;
            private final String lecture;
            private final String linkCode1;
            private final String linkCode2;
            private final String linkCode3;
            private final String linkUrl1;
            private final String linkUrl2;
            private final String linkUrl3;
            private final Integer playTimeMin;
            private final Integer playTimeSec;
            private final List<VideoQBQuestion> qbQuestions;
            private final Integer recommend;
            private final List<VideoRefItem> refItems;
            private final Double srcSize;
            private final Integer subcategoryId;
            private final String thumbnailL;
            private final String thumbnailXl;
            private final String title;
            private final String videoCode;
            private final String videoHash;
            private final int videoId;
            private final String videoTitle;
            private final Integer videogId;
            private final String viewConditionId;

            public Video(@Json(name = "document_id") String str, @Json(name = AnalyticsEvent.Param.VIDEO_ID) int i, @Json(name = BundleKey.COURSE_ID) int i2, @Json(name = "chapter_id") int i3, @Json(name = "subcategory_id") Integer num, @Json(name = "display_order") int i4, @Json(name = "video_title") String str2, String str3, Integer num2, @Json(name = "link_code1") String str4, @Json(name = "link_code2") String str5, @Json(name = "link_code3") String str6, @Json(name = "link_url1") String str7, @Json(name = "link_url2") String str8, @Json(name = "link_url3") String str9, @Json(name = "video_code") String str10, String str11, @Json(name = "play_time_min") Integer num3, @Json(name = "play_time_sec") Integer num4, @Json(name = "view_condition_id") String str12, @Json(name = "is_cbt") Integer num5, @Json(name = "frequent_order") Integer num6, @Json(name = "videog_id") Integer num7, String str13, @Json(name = "thumbnail_xl") String str14, @Json(name = "thumbnail_l") String str15, @Json(name = "video_hash") String str16, @Json(name = QueryParameterKey.COURSE_VIDEO_ID) Integer num8, @Json(name = "qb_questions") List<VideoQBQuestion> list, @Json(name = "ref_items") List<VideoRefItem> list2, @Json(name = "input_card_url") String str17, Integer num9, @Json(name = "src_size") Double d) {
                this.documentId = str;
                this.videoId = i;
                this.courseId = i2;
                this.chapterId = i3;
                this.subcategoryId = num;
                this.displayOrder = i4;
                this.videoTitle = str2;
                this.detail = str3;
                this.recommend = num2;
                this.linkCode1 = str4;
                this.linkCode2 = str5;
                this.linkCode3 = str6;
                this.linkUrl1 = str7;
                this.linkUrl2 = str8;
                this.linkUrl3 = str9;
                this.videoCode = str10;
                this.lecture = str11;
                this.playTimeMin = num3;
                this.playTimeSec = num4;
                this.viewConditionId = str12;
                this.isCbt = num5;
                this.frequentOrder = num6;
                this.videogId = num7;
                this.title = str13;
                this.thumbnailXl = str14;
                this.thumbnailL = str15;
                this.videoHash = str16;
                this.courseVideoId = num8;
                this.qbQuestions = list;
                this.refItems = list2;
                this.inputCardUrl = str17;
                this.downloadable = num9;
                this.srcSize = d;
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            public final int getVideoId() {
                return this.videoId;
            }

            public final int getCourseId() {
                return this.courseId;
            }

            public final int getChapterId() {
                return this.chapterId;
            }

            public final Integer getSubcategoryId() {
                return this.subcategoryId;
            }

            public final int getDisplayOrder() {
                return this.displayOrder;
            }

            public final String getVideoTitle() {
                return this.videoTitle;
            }

            public final String getDetail() {
                return this.detail;
            }

            public final Integer getRecommend() {
                return this.recommend;
            }

            public final String getLinkCode1() {
                return this.linkCode1;
            }

            public final String getLinkCode2() {
                return this.linkCode2;
            }

            public final String getLinkCode3() {
                return this.linkCode3;
            }

            public final String getLinkUrl1() {
                return this.linkUrl1;
            }

            public final String getLinkUrl2() {
                return this.linkUrl2;
            }

            public final String getLinkUrl3() {
                return this.linkUrl3;
            }

            public final String getVideoCode() {
                return this.videoCode;
            }

            public final String getLecture() {
                return this.lecture;
            }

            public final Integer getPlayTimeMin() {
                return this.playTimeMin;
            }

            public final Integer getPlayTimeSec() {
                return this.playTimeSec;
            }

            public final String getViewConditionId() {
                return this.viewConditionId;
            }

            /* JADX INFO: renamed from: isCbt, reason: from getter */
            public final Integer getIsCbt() {
                return this.isCbt;
            }

            public final Integer getFrequentOrder() {
                return this.frequentOrder;
            }

            public final Integer getVideogId() {
                return this.videogId;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getThumbnailXl() {
                return this.thumbnailXl;
            }

            public final String getThumbnailL() {
                return this.thumbnailL;
            }

            public final String getVideoHash() {
                return this.videoHash;
            }

            public final Integer getCourseVideoId() {
                return this.courseVideoId;
            }

            public final List<VideoQBQuestion> getQbQuestions() {
                return this.qbQuestions;
            }

            public final List<VideoRefItem> getRefItems() {
                return this.refItems;
            }

            public final String getInputCardUrl() {
                return this.inputCardUrl;
            }

            public final Integer getDownloadable() {
                return this.downloadable;
            }

            public final Double getSrcSize() {
                return this.srcSize;
            }

            /* JADX INFO: compiled from: VideoCourseResponse.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video$VideoQBQuestion;", "", "questionCode", "", "<init>", "(Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class VideoQBQuestion {
                private final String questionCode;

                public VideoQBQuestion(@Json(name = "question_code") String str) {
                    this.questionCode = str;
                }

                public final String getQuestionCode() {
                    return this.questionCode;
                }
            }

            /* JADX INFO: compiled from: VideoCourseResponse.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video$VideoRefItem;", "", QueryParameterKey.CODE, "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getUrl", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class VideoRefItem {
                private final String code;
                private final String url;

                public VideoRefItem(String str, String str2) {
                    this.code = str;
                    this.url = str2;
                }

                public final String getCode() {
                    return this.code;
                }

                public final String getUrl() {
                    return this.url;
                }
            }
        }

        /* JADX INFO: compiled from: VideoCourseResponse.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Category;", "", "categoryId", "", "chapterId", "subcategoryName", "", "displayOrder", "videoIds", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$Video;", "categoryVideoTime", "categoryVideoCount", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCategoryId", "()I", "getChapterId", "getSubcategoryName", "()Ljava/lang/String;", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVideoIds", "()Ljava/util/List;", "getCategoryVideoTime", "getCategoryVideoCount", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Category {
            private final int categoryId;
            private final Integer categoryVideoCount;
            private final Integer categoryVideoTime;
            private final int chapterId;
            private final Integer displayOrder;
            private final String subcategoryName;
            private final List<Video> videoIds;

            public Category(@Json(name = "category_id") int i, @Json(name = "chapter_id") int i2, @Json(name = "subcategory_name") String str, @Json(name = "display_order") Integer num, @Json(name = "video_ids") List<Video> list, @Json(name = "category_video_time") Integer num2, @Json(name = "category_video_count") Integer num3) {
                this.categoryId = i;
                this.chapterId = i2;
                this.subcategoryName = str;
                this.displayOrder = num;
                this.videoIds = list;
                this.categoryVideoTime = num2;
                this.categoryVideoCount = num3;
            }

            public final int getCategoryId() {
                return this.categoryId;
            }

            public final int getChapterId() {
                return this.chapterId;
            }

            public final String getSubcategoryName() {
                return this.subcategoryName;
            }

            public final Integer getDisplayOrder() {
                return this.displayOrder;
            }

            public final List<Video> getVideoIds() {
                return this.videoIds;
            }

            public final Integer getCategoryVideoTime() {
                return this.categoryVideoTime;
            }

            public final Integer getCategoryVideoCount() {
                return this.categoryVideoCount;
            }
        }

        /* JADX INFO: compiled from: VideoCourseResponse.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter$PDFFile;", "", "fileId", "", "chapterId", "fileName", "", "saveFileName", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getFileId", "()I", "getChapterId", "getFileName", "()Ljava/lang/String;", "getSaveFileName", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class PDFFile {
            private final int chapterId;
            private final int fileId;
            private final String fileName;
            private final String saveFileName;

            public PDFFile(@Json(name = FontsContractCompat.Columns.FILE_ID) int i, @Json(name = "chapter_id") int i2, @Json(name = "file_name") String fileName, @Json(name = "save_file_name") String saveFileName) {
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(saveFileName, "saveFileName");
                this.fileId = i;
                this.chapterId = i2;
                this.fileName = fileName;
                this.saveFileName = saveFileName;
            }

            public final int getFileId() {
                return this.fileId;
            }

            public final int getChapterId() {
                return this.chapterId;
            }

            public final String getFileName() {
                return this.fileName;
            }

            public final String getSaveFileName() {
                return this.saveFileName;
            }
        }
    }
}
