package com.medicmedia.medilink.domain.model.chatbot;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotMessageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent;", "", "<init>", "()V", "Delta", "Complete", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent$Complete;", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent$Delta;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class ChatbotStreamEvent {
    public /* synthetic */ ChatbotStreamEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: ChatbotMessageItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent$Delta;", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Delta extends ChatbotStreamEvent {
        private final String text;

        public static /* synthetic */ Delta copy$default(Delta delta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = delta.text;
            }
            return delta.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Delta copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Delta(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Delta) && Intrinsics.areEqual(this.text, ((Delta) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Delta(text=" + this.text + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delta(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    private ChatbotStreamEvent() {
    }

    /* JADX INFO: compiled from: ChatbotMessageItem.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent$Complete;", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotStreamEvent;", "sessionId", "", "answer", "answerOriginal", "image", "", "sources", "Lcom/medicmedia/medilink/domain/model/chatbot/ChatbotMessageItem$Source;", "remaining", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getSessionId", "()Ljava/lang/String;", "getAnswer", "getAnswerOriginal", "getImage", "()Ljava/util/List;", "getSources", "getRemaining", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Complete extends ChatbotStreamEvent {
        private final String answer;
        private final String answerOriginal;
        private final List<String> image;
        private final int remaining;
        private final String sessionId;
        private final List<ChatbotMessageItem.Source> sources;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, String str, String str2, String str3, List list, List list2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = complete.sessionId;
            }
            if ((i2 & 2) != 0) {
                str2 = complete.answer;
            }
            if ((i2 & 4) != 0) {
                str3 = complete.answerOriginal;
            }
            if ((i2 & 8) != 0) {
                list = complete.image;
            }
            if ((i2 & 16) != 0) {
                list2 = complete.sources;
            }
            if ((i2 & 32) != 0) {
                i = complete.remaining;
            }
            List list3 = list2;
            int i3 = i;
            return complete.copy(str, str2, str3, list, list3, i3);
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

        public final List<ChatbotMessageItem.Source> component5() {
            return this.sources;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getRemaining() {
            return this.remaining;
        }

        public final Complete copy(String sessionId, String answer, String answerOriginal, List<String> image, List<ChatbotMessageItem.Source> sources, int remaining) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(sources, "sources");
            return new Complete(sessionId, answer, answerOriginal, image, sources, remaining);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.sessionId, complete.sessionId) && Intrinsics.areEqual(this.answer, complete.answer) && Intrinsics.areEqual(this.answerOriginal, complete.answerOriginal) && Intrinsics.areEqual(this.image, complete.image) && Intrinsics.areEqual(this.sources, complete.sources) && this.remaining == complete.remaining;
        }

        public int hashCode() {
            return (((((((((this.sessionId.hashCode() * 31) + this.answer.hashCode()) * 31) + this.answerOriginal.hashCode()) * 31) + this.image.hashCode()) * 31) + this.sources.hashCode()) * 31) + Integer.hashCode(this.remaining);
        }

        public String toString() {
            return "Complete(sessionId=" + this.sessionId + ", answer=" + this.answer + ", answerOriginal=" + this.answerOriginal + ", image=" + this.image + ", sources=" + this.sources + ", remaining=" + this.remaining + ")";
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

        public final List<ChatbotMessageItem.Source> getSources() {
            return this.sources;
        }

        public final int getRemaining() {
            return this.remaining;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(String sessionId, String answer, String answerOriginal, List<String> image, List<ChatbotMessageItem.Source> sources, int i) {
            super(null);
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
    }
}
