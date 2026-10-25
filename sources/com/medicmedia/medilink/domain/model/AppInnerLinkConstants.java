package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/AppInnerLinkConstants;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", HistoryRepositoryImpl.TITLE_QB, "MY_NOTE", "VIDEO_COURSE", "VIDEO_CHAPTER", "QR", "QBV4", "OTHER_REFERENCE", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum AppInnerLinkConstants {
    QB("qbref"),
    MY_NOTE("mynoteref"),
    VIDEO_COURSE("lecref?course_video_id"),
    VIDEO_CHAPTER("lecref?chapter_id"),
    QR("qrref"),
    QBV4("^qb.+refv4.*"),
    OTHER_REFERENCE("^[a-z]{2}ref.*");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String value;

    public static EnumEntries<AppInnerLinkConstants> getEntries() {
        return $ENTRIES;
    }

    AppInnerLinkConstants(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
