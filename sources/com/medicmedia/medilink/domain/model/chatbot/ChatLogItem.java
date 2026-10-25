package com.medicmedia.medilink.domain.model.chatbot;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.data.repository.ChatbotRepositoryImpl;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u00015B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\fHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b#\u0010%¨\u00066"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogItem;", "", "key", "", "sessionId", SearchIntents.EXTRA_QUERY, "answer", "image", "", "sources", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogItem$Source;", "latencyMs", "", NotificationCompat.CATEGORY_STATUS, "Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogStatus;", "errorDetail", ChatbotRepositoryImpl.Query.CREATE_AT, "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILcom/medicmedia/medilink/domain/model/chatbot/ChatLogStatus;Ljava/lang/String;Ljava/util/Date;)V", "getKey", "()Ljava/lang/String;", "getSessionId", "getQuery", "getAnswer", "getImage", "()Ljava/util/List;", "getSources", "getLatencyMs", "()I", "getStatus", "()Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogStatus;", "getErrorDetail", "getCreatedAt", "()Ljava/util/Date;", "isThinking", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "Source", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatLogItem {
    private final String answer;
    private final Date createdAt;
    private final String errorDetail;
    private final List<String> image;
    private final String key;
    private final int latencyMs;
    private final String query;
    private final String sessionId;
    private final List<Source> sources;
    private final ChatLogStatus status;

    public ChatLogItem() {
        this(null, null, null, null, null, null, 0, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatLogItem copy$default(ChatLogItem chatLogItem, String str, String str2, String str3, String str4, List list, List list2, int i, ChatLogStatus chatLogStatus, String str5, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatLogItem.key;
        }
        if ((i2 & 2) != 0) {
            str2 = chatLogItem.sessionId;
        }
        if ((i2 & 4) != 0) {
            str3 = chatLogItem.query;
        }
        if ((i2 & 8) != 0) {
            str4 = chatLogItem.answer;
        }
        if ((i2 & 16) != 0) {
            list = chatLogItem.image;
        }
        if ((i2 & 32) != 0) {
            list2 = chatLogItem.sources;
        }
        if ((i2 & 64) != 0) {
            i = chatLogItem.latencyMs;
        }
        if ((i2 & 128) != 0) {
            chatLogStatus = chatLogItem.status;
        }
        if ((i2 & 256) != 0) {
            str5 = chatLogItem.errorDetail;
        }
        if ((i2 & 512) != 0) {
            date = chatLogItem.createdAt;
        }
        String str6 = str5;
        Date date2 = date;
        int i3 = i;
        ChatLogStatus chatLogStatus2 = chatLogStatus;
        List list3 = list;
        List list4 = list2;
        return chatLogItem.copy(str, str2, str3, str4, list3, list4, i3, chatLogStatus2, str6, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final List<String> component5() {
        return this.image;
    }

    public final List<Source> component6() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ChatLogStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final ChatLogItem copy(String key, String sessionId, String query, String answer, List<String> image, List<Source> sources, int latencyMs, ChatLogStatus status, String errorDetail, Date createdAt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new ChatLogItem(key, sessionId, query, answer, image, sources, latencyMs, status, errorDetail, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatLogItem)) {
            return false;
        }
        ChatLogItem chatLogItem = (ChatLogItem) other;
        return Intrinsics.areEqual(this.key, chatLogItem.key) && Intrinsics.areEqual(this.sessionId, chatLogItem.sessionId) && Intrinsics.areEqual(this.query, chatLogItem.query) && Intrinsics.areEqual(this.answer, chatLogItem.answer) && Intrinsics.areEqual(this.image, chatLogItem.image) && Intrinsics.areEqual(this.sources, chatLogItem.sources) && this.latencyMs == chatLogItem.latencyMs && this.status == chatLogItem.status && Intrinsics.areEqual(this.errorDetail, chatLogItem.errorDetail) && Intrinsics.areEqual(this.createdAt, chatLogItem.createdAt);
    }

    public int hashCode() {
        int iHashCode = ((((this.key.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.query.hashCode()) * 31;
        String str = this.answer;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.image.hashCode()) * 31) + this.sources.hashCode()) * 31) + Integer.hashCode(this.latencyMs)) * 31) + this.status.hashCode()) * 31;
        String str2 = this.errorDetail;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "ChatLogItem(key=" + this.key + ", sessionId=" + this.sessionId + ", query=" + this.query + ", answer=" + this.answer + ", image=" + this.image + ", sources=" + this.sources + ", latencyMs=" + this.latencyMs + ", status=" + this.status + ", errorDetail=" + this.errorDetail + ", createdAt=" + this.createdAt + ")";
    }

    public ChatLogItem(String key, String sessionId, String query, String str, List<String> image, List<Source> sources, int i, ChatLogStatus status, String str2, Date createdAt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.key = key;
        this.sessionId = sessionId;
        this.query = query;
        this.answer = str;
        this.image = image;
        this.sources = sources;
        this.latencyMs = i;
        this.status = status;
        this.errorDetail = str2;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ChatLogItem(String str, String str2, String str3, String str4, List list, List list2, int i, ChatLogStatus chatLogStatus, String str5, Date date, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? ChatLogStatus.SUCCESS : chatLogStatus, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? new Date() : date);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSessionId() {
        return this.sessionId;
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

    public final ChatLogStatus getStatus() {
        return this.status;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean isThinking() {
        return this.answer == null && this.status == ChatLogStatus.SUCCESS;
    }

    /* JADX INFO: compiled from: ChatbotMessageItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogItem$Source;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "license", "url", TypedValues.Custom.S_REFERENCE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getLicense", "getUrl", "getReference", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/chatbot/ChatLogItem$Source;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Source {
        private final String license;
        private final Integer reference;
        private final String title;
        private final String url;

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
            this(str, str2, str3, (i & 8) != 0 ? null : num);
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
