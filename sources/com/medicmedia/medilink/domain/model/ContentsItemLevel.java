package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsItemLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BOOK", "COURSE", "HEADER", "CHAPTER", "CATEGORY", "SUB", "OTHER", "TOP", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ContentsItemLevel {
    BOOK(0),
    COURSE(1),
    HEADER(2),
    CHAPTER(3),
    CATEGORY(4),
    SUB(5),
    OTHER(6),
    TOP(10);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    public static EnumEntries<ContentsItemLevel> getEntries() {
        return $ENTRIES;
    }

    ContentsItemLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
