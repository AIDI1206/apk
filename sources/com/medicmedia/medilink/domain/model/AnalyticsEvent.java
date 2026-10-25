package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.model.ConstKt;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalyticsEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent;", "", "<init>", "()V", "Name", "Param", "Value", "ReadContentsRef", ConstKt.notificationVideoDownloadId, "PlayVideoParam", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnalyticsEvent {
    public static final AnalyticsEvent INSTANCE = new AnalyticsEvent();

    private AnalyticsEvent() {
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$Name;", "", "<init>", "()V", "DASHBOARD_FAB_OPEN", "", "READ_QR_PAGE", "READ_QR_BOOK", "READ_QR_ERROR", "READ_CONTENTS_REF", "READ_CONTENTS_PAGE", "VIDEO_READ_CONTENTS_REF", "CHAT_START", "CHAT_MESSAGE_SEND", "SEARCH_AI_SUMMARY_USE", "CHAT_REFERENCE_CLICK", "VIDEO_SKIP_OPERATION", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Name {
        public static final String CHAT_MESSAGE_SEND = "chat_message_send";
        public static final String CHAT_REFERENCE_CLICK = "chat_reference_click";
        public static final String CHAT_START = "chat_start";
        public static final String DASHBOARD_FAB_OPEN = "dashboard_fab_open";
        public static final Name INSTANCE = new Name();
        public static final String READ_CONTENTS_PAGE = "read_contents_page";
        public static final String READ_CONTENTS_REF = "read_contents_ref";
        public static final String READ_QR_BOOK = "read_qr_book";
        public static final String READ_QR_ERROR = "read_qr_error";
        public static final String READ_QR_PAGE = "read_qr_page";
        public static final String SEARCH_AI_SUMMARY_USE = "search_ai_summary_use";
        public static final String VIDEO_READ_CONTENTS_REF = "video_read_contents_ref";
        public static final String VIDEO_SKIP_OPERATION = "video_skip_operation";

        private Name() {
        }
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$Param;", "", "<init>", "()V", "SERIAL_CODE", "", "IS_SUCCESS", "ENTRY_TYPE", "CURRENT_URL", "GOTO_URL", "CONTENTS_FORMAT", "CURRENT_LICENSE_CODE", "GOTO_LICENSE_CODE", "ERROR_TITLE", "ERROR_MESSAGE", "URL", "LICENSE_CODE", "STAY_TIME", "IS_ONLINE", "VIDEO_HASH", "ENTRY", "REMAINING_COUNT", "MAX_MONTHLY_QUERIES", "IS_FIRST_MESSAGE", "TEXT_LENGTH", "TEXT", "MESSAGE_INDEX", "VIDEO_ID", "OPERATION", "PLAYBACK_POSITION", "TRIGGER", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Param {
        public static final String CONTENTS_FORMAT = "contents_format";
        public static final String CURRENT_LICENSE_CODE = "current_license_code";
        public static final String CURRENT_URL = "current_url";
        public static final String ENTRY = "entry";
        public static final String ENTRY_TYPE = "entry_type";
        public static final String ERROR_MESSAGE = "error_message";
        public static final String ERROR_TITLE = "error_title";
        public static final String GOTO_LICENSE_CODE = "goto_license_code";
        public static final String GOTO_URL = "goto_url";
        public static final Param INSTANCE = new Param();
        public static final String IS_FIRST_MESSAGE = "is_first_message";
        public static final String IS_ONLINE = "is_online";
        public static final String IS_SUCCESS = "is_success";
        public static final String LICENSE_CODE = "license_code";
        public static final String MAX_MONTHLY_QUERIES = "max_monthly_queries";
        public static final String MESSAGE_INDEX = "message_index";
        public static final String OPERATION = "operation";
        public static final String PLAYBACK_POSITION = "playback_position";
        public static final String REMAINING_COUNT = "remaining_count";
        public static final String SERIAL_CODE = "serial_code";
        public static final String STAY_TIME = "stay_time";
        public static final String TEXT = "text";
        public static final String TEXT_LENGTH = "text_length";
        public static final String TRIGGER = "trigger";
        public static final String URL = "url";
        public static final String VIDEO_HASH = "video_hash";
        public static final String VIDEO_ID = "video_id";

        private Param() {
        }
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$Value;", "", "<init>", "()V", "NULL", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Value {
        public static final Value INSTANCE = new Value();
        public static final String NULL = "null";

        private Value() {
        }
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$ReadContentsRef;", "", "<init>", "()V", "LIBRARY", "", "INDEX", "WRITING_HISTORY", "BROWSING_HISTORY", "SEARCH", "PUSH_NOTIFICATION", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ReadContentsRef {
        public static final String BROWSING_HISTORY = "browsing_history";
        public static final String INDEX = "index";
        public static final ReadContentsRef INSTANCE = new ReadContentsRef();
        public static final String LIBRARY = "library";
        public static final String PUSH_NOTIFICATION = "push_notification";
        public static final String SEARCH = "search";
        public static final String WRITING_HISTORY = "note_history";

        private ReadContentsRef() {
        }
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$VideoDownload;", "", "<init>", "()V", "NAME", "", "CURRENT_URL", "VIDEO_HASH", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class VideoDownload {
        public static final String CURRENT_URL = "current_url";
        public static final VideoDownload INSTANCE = new VideoDownload();
        public static final String NAME = "video_download";
        public static final String VIDEO_HASH = "video_hash";

        private VideoDownload() {
        }
    }

    /* JADX INFO: compiled from: AnalyticsEvent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AnalyticsEvent$PlayVideoParam;", "", "courseTitle", "", "chapterTitle", "videoTitle", BundleKey.VIDEO_ID, "videoHash", "isBackground", "", "playTime", "", "startTime", "stopTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJJ)V", "getCourseTitle", "()Ljava/lang/String;", "getChapterTitle", "getVideoTitle", "getVideoId", "getVideoHash", "()Z", "getPlayTime", "()J", "getStartTime", "getStopTime", "convertToMap", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class PlayVideoParam {
        private final String chapterTitle;
        private final String courseTitle;
        private final boolean isBackground;
        private final long playTime;
        private final long startTime;
        private final long stopTime;
        private final String videoHash;
        private final String videoId;
        private final String videoTitle;

        public static /* synthetic */ PlayVideoParam copy$default(PlayVideoParam playVideoParam, String str, String str2, String str3, String str4, String str5, boolean z, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = playVideoParam.courseTitle;
            }
            if ((i & 2) != 0) {
                str2 = playVideoParam.chapterTitle;
            }
            if ((i & 4) != 0) {
                str3 = playVideoParam.videoTitle;
            }
            if ((i & 8) != 0) {
                str4 = playVideoParam.videoId;
            }
            if ((i & 16) != 0) {
                str5 = playVideoParam.videoHash;
            }
            if ((i & 32) != 0) {
                z = playVideoParam.isBackground;
            }
            if ((i & 64) != 0) {
                j = playVideoParam.playTime;
            }
            if ((i & 128) != 0) {
                j2 = playVideoParam.startTime;
            }
            if ((i & 256) != 0) {
                j3 = playVideoParam.stopTime;
            }
            long j4 = j3;
            long j5 = j2;
            long j6 = j;
            String str6 = str5;
            boolean z2 = z;
            return playVideoParam.copy(str, str2, str3, str4, str6, z2, j6, j5, j4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCourseTitle() {
            return this.courseTitle;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getChapterTitle() {
            return this.chapterTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVideoTitle() {
            return this.videoTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVideoId() {
            return this.videoId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVideoHash() {
            return this.videoHash;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsBackground() {
            return this.isBackground;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getPlayTime() {
            return this.playTime;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final PlayVideoParam copy(String courseTitle, String chapterTitle, String videoTitle, String videoId, String videoHash, boolean isBackground, long playTime, long startTime, long stopTime) {
            Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
            Intrinsics.checkNotNullParameter(chapterTitle, "chapterTitle");
            Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
            Intrinsics.checkNotNullParameter(videoId, "videoId");
            Intrinsics.checkNotNullParameter(videoHash, "videoHash");
            return new PlayVideoParam(courseTitle, chapterTitle, videoTitle, videoId, videoHash, isBackground, playTime, startTime, stopTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayVideoParam)) {
                return false;
            }
            PlayVideoParam playVideoParam = (PlayVideoParam) other;
            return Intrinsics.areEqual(this.courseTitle, playVideoParam.courseTitle) && Intrinsics.areEqual(this.chapterTitle, playVideoParam.chapterTitle) && Intrinsics.areEqual(this.videoTitle, playVideoParam.videoTitle) && Intrinsics.areEqual(this.videoId, playVideoParam.videoId) && Intrinsics.areEqual(this.videoHash, playVideoParam.videoHash) && this.isBackground == playVideoParam.isBackground && this.playTime == playVideoParam.playTime && this.startTime == playVideoParam.startTime && this.stopTime == playVideoParam.stopTime;
        }

        public int hashCode() {
            return (((((((((((((((this.courseTitle.hashCode() * 31) + this.chapterTitle.hashCode()) * 31) + this.videoTitle.hashCode()) * 31) + this.videoId.hashCode()) * 31) + this.videoHash.hashCode()) * 31) + Boolean.hashCode(this.isBackground)) * 31) + Long.hashCode(this.playTime)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.stopTime);
        }

        public String toString() {
            return "PlayVideoParam(courseTitle=" + this.courseTitle + ", chapterTitle=" + this.chapterTitle + ", videoTitle=" + this.videoTitle + ", videoId=" + this.videoId + ", videoHash=" + this.videoHash + ", isBackground=" + this.isBackground + ", playTime=" + this.playTime + ", startTime=" + this.startTime + ", stopTime=" + this.stopTime + ")";
        }

        public PlayVideoParam(String courseTitle, String chapterTitle, String videoTitle, String videoId, String videoHash, boolean z, long j, long j2, long j3) {
            Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
            Intrinsics.checkNotNullParameter(chapterTitle, "chapterTitle");
            Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
            Intrinsics.checkNotNullParameter(videoId, "videoId");
            Intrinsics.checkNotNullParameter(videoHash, "videoHash");
            this.courseTitle = courseTitle;
            this.chapterTitle = chapterTitle;
            this.videoTitle = videoTitle;
            this.videoId = videoId;
            this.videoHash = videoHash;
            this.isBackground = z;
            this.playTime = j;
            this.startTime = j2;
            this.stopTime = j3;
        }

        public final String getCourseTitle() {
            return this.courseTitle;
        }

        public final String getChapterTitle() {
            return this.chapterTitle;
        }

        public final String getVideoTitle() {
            return this.videoTitle;
        }

        public final String getVideoId() {
            return this.videoId;
        }

        public final String getVideoHash() {
            return this.videoHash;
        }

        public final boolean isBackground() {
            return this.isBackground;
        }

        public final long getPlayTime() {
            return this.playTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final long getStopTime() {
            return this.stopTime;
        }

        public final Map<String, Object> convertToMap() {
            return MapsKt.mapOf(TuplesKt.to("course_title", this.courseTitle), TuplesKt.to("chapter_title", this.chapterTitle), TuplesKt.to("video_title", this.videoTitle), TuplesKt.to(Param.VIDEO_ID, this.videoId), TuplesKt.to("video_hash", this.videoHash), TuplesKt.to("is_background", Boolean.valueOf(this.isBackground)), TuplesKt.to("play_time", Long.valueOf(this.playTime)), TuplesKt.to("start_time", Long.valueOf(this.startTime)), TuplesKt.to("stop_time", Long.valueOf(this.stopTime)));
        }
    }
}
