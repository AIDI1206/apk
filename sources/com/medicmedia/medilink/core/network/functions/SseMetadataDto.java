package com.medicmedia.medilink.core.network.functions;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import com.medicmedia.medilink.core.network.functions.response.SseEvent;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotSseNetwork.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001%BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/SseMetadataDto;", "", "answer", "", "answerOriginal", "image", "", "sources", "Lcom/medicmedia/medilink/core/network/functions/SseMetadataDto$SourceDto;", "remaining", "", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getAnswerOriginal", "getImage", "()Ljava/util/List;", "getSources", "getRemaining", "()I", "getSessionId", "toSseEvent", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent$Metadata;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "SourceDto", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* data */ class SseMetadataDto {
    private final String answer;

    @SerializedName("answer_original")
    private final String answerOriginal;
    private final List<String> image;
    private final int remaining;

    @SerializedName("session_id")
    private final String sessionId;
    private final List<SourceDto> sources;

    public SseMetadataDto() {
        this(null, null, null, null, 0, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SseMetadataDto copy$default(SseMetadataDto sseMetadataDto, String str, String str2, List list, List list2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sseMetadataDto.answer;
        }
        if ((i2 & 2) != 0) {
            str2 = sseMetadataDto.answerOriginal;
        }
        if ((i2 & 4) != 0) {
            list = sseMetadataDto.image;
        }
        if ((i2 & 8) != 0) {
            list2 = sseMetadataDto.sources;
        }
        if ((i2 & 16) != 0) {
            i = sseMetadataDto.remaining;
        }
        if ((i2 & 32) != 0) {
            str3 = sseMetadataDto.sessionId;
        }
        int i3 = i;
        String str4 = str3;
        return sseMetadataDto.copy(str, str2, list, list2, i3, str4);
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

    public final List<SourceDto> component4() {
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

    public final SseMetadataDto copy(String answer, String answerOriginal, List<String> image, List<SourceDto> sources, int remaining, String sessionId) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new SseMetadataDto(answer, answerOriginal, image, sources, remaining, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SseMetadataDto)) {
            return false;
        }
        SseMetadataDto sseMetadataDto = (SseMetadataDto) other;
        return Intrinsics.areEqual(this.answer, sseMetadataDto.answer) && Intrinsics.areEqual(this.answerOriginal, sseMetadataDto.answerOriginal) && Intrinsics.areEqual(this.image, sseMetadataDto.image) && Intrinsics.areEqual(this.sources, sseMetadataDto.sources) && this.remaining == sseMetadataDto.remaining && Intrinsics.areEqual(this.sessionId, sseMetadataDto.sessionId);
    }

    public int hashCode() {
        int iHashCode = ((this.answer.hashCode() * 31) + this.answerOriginal.hashCode()) * 31;
        List<String> list = this.image;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SourceDto> list2 = this.sources;
        return ((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + Integer.hashCode(this.remaining)) * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "SseMetadataDto(answer=" + this.answer + ", answerOriginal=" + this.answerOriginal + ", image=" + this.image + ", sources=" + this.sources + ", remaining=" + this.remaining + ", sessionId=" + this.sessionId + ")";
    }

    public SseMetadataDto(String answer, String answerOriginal, List<String> list, List<SourceDto> list2, int i, String sessionId) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(answerOriginal, "answerOriginal");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.answer = answer;
        this.answerOriginal = answerOriginal;
        this.image = list;
        this.sources = list2;
        this.remaining = i;
        this.sessionId = sessionId;
    }

    public /* synthetic */ SseMetadataDto(String str, String str2, List list, List list2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str3);
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

    public final List<SourceDto> getSources() {
        return this.sources;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: compiled from: ChatbotSseNetwork.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/SseMetadataDto$SourceDto;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "license", "url", TypedValues.Custom.S_REFERENCE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getLicense", "getUrl", "getReference", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/core/network/functions/SseMetadataDto$SourceDto;", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SourceDto {
        private final String license;
        private final Integer reference;
        private final String title;
        private final String url;

        public SourceDto() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ SourceDto copy$default(SourceDto sourceDto, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sourceDto.title;
            }
            if ((i & 2) != 0) {
                str2 = sourceDto.license;
            }
            if ((i & 4) != 0) {
                str3 = sourceDto.url;
            }
            if ((i & 8) != 0) {
                num = sourceDto.reference;
            }
            return sourceDto.copy(str, str2, str3, num);
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

        public final SourceDto copy(String title, String license, String url, Integer reference) {
            return new SourceDto(title, license, url, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SourceDto)) {
                return false;
            }
            SourceDto sourceDto = (SourceDto) other;
            return Intrinsics.areEqual(this.title, sourceDto.title) && Intrinsics.areEqual(this.license, sourceDto.license) && Intrinsics.areEqual(this.url, sourceDto.url) && Intrinsics.areEqual(this.reference, sourceDto.reference);
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
            return "SourceDto(title=" + this.title + ", license=" + this.license + ", url=" + this.url + ", reference=" + this.reference + ")";
        }

        public SourceDto(String str, String str2, String str3, Integer num) {
            this.title = str;
            this.license = str2;
            this.url = str3;
            this.reference = num;
        }

        public /* synthetic */ SourceDto(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final SseEvent.Metadata toSseEvent() {
        String str = this.answer;
        String str2 = this.answerOriginal;
        List<String> listEmptyList = this.image;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        List<SourceDto> listEmptyList2 = this.sources;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<SourceDto> list2 = listEmptyList2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (SourceDto sourceDto : list2) {
            arrayList.add(new SseEvent.Metadata.Source(sourceDto.getTitle(), sourceDto.getLicense(), sourceDto.getUrl(), sourceDto.getReference()));
        }
        return new SseEvent.Metadata(str, str2, list, arrayList, this.remaining, this.sessionId);
    }
}
