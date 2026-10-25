package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoQBQuestion;", "", "questionCode", "", "<init>", "(Ljava/lang/String;)V", "getQuestionCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoQBQuestion {
    private final String questionCode;

    public static /* synthetic */ VideoQBQuestion copy$default(VideoQBQuestion videoQBQuestion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoQBQuestion.questionCode;
        }
        return videoQBQuestion.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestionCode() {
        return this.questionCode;
    }

    public final VideoQBQuestion copy(String questionCode) {
        return new VideoQBQuestion(questionCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoQBQuestion) && Intrinsics.areEqual(this.questionCode, ((VideoQBQuestion) other).questionCode);
    }

    public int hashCode() {
        String str = this.questionCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "VideoQBQuestion(questionCode=" + this.questionCode + ")";
    }

    public VideoQBQuestion(String str) {
        this.questionCode = str;
    }

    public final String getQuestionCode() {
        return this.questionCode;
    }
}
