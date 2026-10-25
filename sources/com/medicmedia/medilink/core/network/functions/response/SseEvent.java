package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SseEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "", "<init>", "()V", "Status", "AnswerDelta", "Metadata", "Done", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$AnswerDelta;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Done;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Status;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class SseEvent {
    public /* synthetic */ SseEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: SseEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Status;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "stage", "", "<init>", "(Ljava/lang/String;)V", "getStage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Status extends SseEvent {
        private final String stage;

        public static /* synthetic */ Status copy$default(Status status, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.stage;
            }
            return status.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStage() {
            return this.stage;
        }

        public final Status copy(String stage) {
            Intrinsics.checkNotNullParameter(stage, "stage");
            return new Status(stage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Status) && Intrinsics.areEqual(this.stage, ((Status) other).stage);
        }

        public int hashCode() {
            return this.stage.hashCode();
        }

        public String toString() {
            return "Status(stage=" + this.stage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Status(String stage) {
            super(null);
            Intrinsics.checkNotNullParameter(stage, "stage");
            this.stage = stage;
        }

        public final String getStage() {
            return this.stage;
        }
    }

    private SseEvent() {
    }

    /* JADX INFO: compiled from: SseEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$AnswerDelta;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class AnswerDelta extends SseEvent {
        private final String text;

        public static /* synthetic */ AnswerDelta copy$default(AnswerDelta answerDelta, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = answerDelta.text;
            }
            return answerDelta.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final AnswerDelta copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new AnswerDelta(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnswerDelta) && Intrinsics.areEqual(this.text, ((AnswerDelta) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "AnswerDelta(text=" + this.text + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnswerDelta(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* JADX INFO: compiled from: SseEvent.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006%"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "answer", "", "answerOriginal", "image", "", "sources", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata$Source;", "remaining", "", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getAnswerOriginal", "getImage", "()Ljava/util/List;", "getSources", "getRemaining", "()I", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Source", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Metadata extends SseEvent {
        private final String answer;
        private final String answerOriginal;
        private final List<String> image;
        private final int remaining;
        private final String sessionId;
        private final List<Source> sources;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, List list, List list2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = metadata.answer;
            }
            if ((i2 & 2) != 0) {
                str2 = metadata.answerOriginal;
            }
            if ((i2 & 4) != 0) {
                list = metadata.image;
            }
            if ((i2 & 8) != 0) {
                list2 = metadata.sources;
            }
            if ((i2 & 16) != 0) {
                i = metadata.remaining;
            }
            if ((i2 & 32) != 0) {
                str3 = metadata.sessionId;
            }
            int i3 = i;
            String str4 = str3;
            return metadata.copy(str, str2, list, list2, i3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAnswerOriginal() {
            return this.answerOriginal;
        }

        public final List<String> component3() {
            return this.image;
        }

        public final List<Source> component4() {
            return this.sources;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getRemaining() {
            return this.remaining;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Metadata copy(String answer, String answerOriginal, List<String> image, List<Source> sources, int remaining, String sessionId) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new Metadata(answer, answerOriginal, image, sources, remaining, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.answer, metadata.answer) && Intrinsics.areEqual(this.answerOriginal, metadata.answerOriginal) && Intrinsics.areEqual(this.image, metadata.image) && Intrinsics.areEqual(this.sources, metadata.sources) && this.remaining == metadata.remaining && Intrinsics.areEqual(this.sessionId, metadata.sessionId);
        }

        public int hashCode() {
            return (((((((((this.answer.hashCode() * 31) + this.answerOriginal.hashCode()) * 31) + this.image.hashCode()) * 31) + this.sources.hashCode()) * 31) + Integer.hashCode(this.remaining)) * 31) + this.sessionId.hashCode();
        }

        public String toString() {
            return "Metadata(answer=" + this.answer + ", answerOriginal=" + this.answerOriginal + ", image=" + this.image + ", sources=" + this.sources + ", remaining=" + this.remaining + ", sessionId=" + this.sessionId + ")";
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

        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: compiled from: SseEvent.kt */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata$Source;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "license", "url", TypedValues.Custom.S_REFERENCE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getLicense", "getUrl", "getReference", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata$Source;", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String answer, String answerOriginal, List<String> image, List<Source> sources, int i, String sessionId) {
            super(null);
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.answer = answer;
            this.answerOriginal = answerOriginal;
            this.image = image;
            this.sources = sources;
            this.remaining = i;
            this.sessionId = sessionId;
        }
    }

    /* JADX INFO: compiled from: SseEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Done;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Done extends SseEvent {
        public static final Done INSTANCE = new Done();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Done)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -257118436;
        }

        public String toString() {
            return "Done";
        }

        private Done() {
            super(null);
        }
    }
}
