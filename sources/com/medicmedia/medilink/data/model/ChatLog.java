package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.Timestamp;
import com.medicmedia.medilink.data.repository.ChatbotRepositoryImpl;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatLog;", "", SearchIntents.EXTRA_QUERY, "", "answer", "image", "", "sources", "Lcom/medicmedia/medilink/data/model/ChatLog$Source;", "latencyMs", "", NotificationCompat.CATEGORY_STATUS, "errorDetail", ChatbotRepositoryImpl.Query.CREATE_AT, "Lcom/google/firebase/Timestamp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;)V", "getQuery", "()Ljava/lang/String;", "getAnswer", "getImage", "()Ljava/util/List;", "getSources", "getLatencyMs", "()I", "getStatus", "getErrorDetail", "getCreatedAt", "()Lcom/google/firebase/Timestamp;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Source", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatLog {
    private final String answer;
    private final Timestamp createdAt;
    private final String errorDetail;
    private final List<String> image;
    private final int latencyMs;
    private final String query;
    private final List<Source> sources;
    private final String status;

    public ChatLog() {
        this(null, null, null, null, 0, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatLog copy$default(ChatLog chatLog, String str, String str2, List list, List list2, int i, String str3, String str4, Timestamp timestamp, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatLog.query;
        }
        if ((i2 & 2) != 0) {
            str2 = chatLog.answer;
        }
        if ((i2 & 4) != 0) {
            list = chatLog.image;
        }
        if ((i2 & 8) != 0) {
            list2 = chatLog.sources;
        }
        if ((i2 & 16) != 0) {
            i = chatLog.latencyMs;
        }
        if ((i2 & 32) != 0) {
            str3 = chatLog.status;
        }
        if ((i2 & 64) != 0) {
            str4 = chatLog.errorDetail;
        }
        if ((i2 & 128) != 0) {
            timestamp = chatLog.createdAt;
        }
        String str5 = str4;
        Timestamp timestamp2 = timestamp;
        int i3 = i;
        String str6 = str3;
        return chatLog.copy(str, str2, list, list2, i3, str6, str5, timestamp2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final List<String> component3() {
        return this.image;
    }

    public final List<Source> component4() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorDetail() {
        return this.errorDetail;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public final ChatLog copy(String query, String answer, List<String> image, List<Source> sources, int latencyMs, String status, String errorDetail, Timestamp createdAt) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ChatLog(query, answer, image, sources, latencyMs, status, errorDetail, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatLog)) {
            return false;
        }
        ChatLog chatLog = (ChatLog) other;
        return Intrinsics.areEqual(this.query, chatLog.query) && Intrinsics.areEqual(this.answer, chatLog.answer) && Intrinsics.areEqual(this.image, chatLog.image) && Intrinsics.areEqual(this.sources, chatLog.sources) && this.latencyMs == chatLog.latencyMs && Intrinsics.areEqual(this.status, chatLog.status) && Intrinsics.areEqual(this.errorDetail, chatLog.errorDetail) && Intrinsics.areEqual(this.createdAt, chatLog.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((this.query.hashCode() * 31) + this.answer.hashCode()) * 31;
        List<String> list = this.image;
        int iHashCode2 = (((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.sources.hashCode()) * 31) + Integer.hashCode(this.latencyMs)) * 31) + this.status.hashCode()) * 31;
        String str = this.errorDetail;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "ChatLog(query=" + this.query + ", answer=" + this.answer + ", image=" + this.image + ", sources=" + this.sources + ", latencyMs=" + this.latencyMs + ", status=" + this.status + ", errorDetail=" + this.errorDetail + ", createdAt=" + this.createdAt + ")";
    }

    public ChatLog(String query, String answer, List<String> list, List<Source> sources, int i, String status, String str, Timestamp createdAt) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.query = query;
        this.answer = answer;
        this.image = list;
        this.sources = sources;
        this.latencyMs = i;
        this.status = status;
        this.errorDetail = str;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ChatLog(String str, String str2, List list, List list2, int i, String str3, String str4, Timestamp timestamp, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? new Timestamp(new Date()) : timestamp);
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final List<String> getImage() {
        return this.image;
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public final int getLatencyMs() {
        return this.latencyMs;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final Timestamp getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: compiled from: ChatItems.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/data/model/ChatLog$Source;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "license", "url", TypedValues.Custom.S_REFERENCE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getLicense", "getUrl", "getReference", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/data/model/ChatLog$Source;", "equals", "", "other", "hashCode", "toString", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Source {
        private final String license;
        private final Integer reference;
        private final String title;
        private final String url;

        public Source() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Source copy$default(Source source, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = source.title;
            }
            if ((i & 2) != 0) {
                str2 = source.license;
            }
            if ((i & 4) != 0) {
                str3 = source.url;
            }
            if ((i & 8) != 0) {
                num = source.reference;
            }
            return source.copy(str, str2, str3, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLicense() {
            return this.license;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getReference() {
            return this.reference;
        }

        public final Source copy(String title, String license, String url, Integer reference) {
            return new Source(title, license, url, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Source)) {
                return false;
            }
            Source source = (Source) other;
            return Intrinsics.areEqual(this.title, source.title) && Intrinsics.areEqual(this.license, source.license) && Intrinsics.areEqual(this.url, source.url) && Intrinsics.areEqual(this.reference, source.reference);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.license;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.reference;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Source(title=" + this.title + ", license=" + this.license + ", url=" + this.url + ", reference=" + this.reference + ")";
        }

        public Source(String str, String str2, String str3, Integer num) {
            this.title = str;
            this.license = str2;
            this.url = str3;
            this.reference = num;
        }

        public /* synthetic */ Source(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getLicense() {
            return this.license;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getReference() {
            return this.reference;
        }
    }
}
