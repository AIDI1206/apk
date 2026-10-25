package com.medicmedia.medilink.domain.model.chatbot;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem;", "", "sessionId", "", "answer", "answerOriginal", "image", "", "sources", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem$Source;", "remaining", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getSessionId", "()Ljava/lang/String;", "getAnswer", "getAnswerOriginal", "getImage", "()Ljava/util/List;", "getSources", "getRemaining", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Source", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChatbotMessageItem {
    private final String answer;
    private final String answerOriginal;
    private final List<String> image;
    private final int remaining;
    private final String sessionId;
    private final List<Source> sources;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatbotMessageItem copy$default(ChatbotMessageItem chatbotMessageItem, String str, String str2, String str3, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatbotMessageItem.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatbotMessageItem.answer;
        }
        if ((i2 & 4) != 0) {
            str3 = chatbotMessageItem.answerOriginal;
        }
        if ((i2 & 8) != 0) {
            list = chatbotMessageItem.image;
        }
        if ((i2 & 16) != 0) {
            list2 = chatbotMessageItem.sources;
        }
        if ((i2 & 32) != 0) {
            i = chatbotMessageItem.remaining;
        }
        List list3 = list2;
        int i3 = i;
        return chatbotMessageItem.copy(str, str2, str3, list, list3, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnswerOriginal() {
        return this.answerOriginal;
    }

    public final List<String> component4() {
        return this.image;
    }

    public final List<Source> component5() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    public final ChatbotMessageItem copy(String sessionId, String answer, String answerOriginal, List<String> image, List<Source> sources, int remaining) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(sources, "sources");
        return new ChatbotMessageItem(sessionId, answer, answerOriginal, image, sources, remaining);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatbotMessageItem)) {
            return false;
        }
        ChatbotMessageItem chatbotMessageItem = (ChatbotMessageItem) other;
        return Intrinsics.areEqual(this.sessionId, chatbotMessageItem.sessionId) && Intrinsics.areEqual(this.answer, chatbotMessageItem.answer) && Intrinsics.areEqual(this.answerOriginal, chatbotMessageItem.answerOriginal) && Intrinsics.areEqual(this.image, chatbotMessageItem.image) && Intrinsics.areEqual(this.sources, chatbotMessageItem.sources) && this.remaining == chatbotMessageItem.remaining;
    }

    public int hashCode() {
        return (((((((((this.sessionId.hashCode() * 31) + this.answer.hashCode()) * 31) + this.answerOriginal.hashCode()) * 31) + this.image.hashCode()) * 31) + this.sources.hashCode()) * 31) + Integer.hashCode(this.remaining);
    }

    public String toString() {
        return "ChatbotMessageItem(sessionId=" + this.sessionId + ", answer=" + this.answer + ", answerOriginal=" + this.answerOriginal + ", image=" + this.image + ", sources=" + this.sources + ", remaining=" + this.remaining + ")";
    }

    public ChatbotMessageItem(String sessionId, String answer, String answerOriginal, List<String> image, List<Source> sources, int i) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.sessionId = sessionId;
        this.answer = answer;
        this.answerOriginal = answerOriginal;
        this.image = image;
        this.sources = sources;
        this.remaining = i;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getAnswerOriginal() {
        return this.answerOriginal;
    }

    public final List<String> getImage() {
        return this.image;
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: compiled from: ChatbotMessageItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem$Source;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "license", "url", TypedValues.Custom.S_REFERENCE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getLicense", "getUrl", "getReference", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isEmpty", "", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem$Source;", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Source {
        private final boolean isEmpty;
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
            String str4;
            this.title = str;
            this.license = str2;
            this.url = str3;
            this.reference = num;
            String str5 = str;
            this.isEmpty = (str5 == null || str5.length() == 0) && ((str4 = str3) == null || str4.length() == 0);
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

        /* JADX INFO: renamed from: isEmpty, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }
    }
}
