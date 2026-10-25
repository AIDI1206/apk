package com.medicmedia.medilink.data.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ContentStatus.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/data/model/ContentStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NOT_DOWNLOAD", "SUCCESS_DOWNLOAD", "NOW_DOWNLOADING", "ZIP_UNPACK_SUCCESS", "GENE_READ_ITEM_SUCCESS", "GENE_SEARCH_DATA_SUCCESS", "GENE_TAG_DATA_SUCCESS", "GENE_MENU_SUCCESS", "COMPLETE_SUCCESS", "FULL_COMPLETE_SUCCESS", "ZIP_UNPACK_ERROR", "GENE_READ_ITEM_ERROR", "GENE_MENU_ERROR", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ContentStatus {
    NOT_DOWNLOAD(0),
    SUCCESS_DOWNLOAD(1),
    NOW_DOWNLOADING(2),
    ZIP_UNPACK_SUCCESS(3),
    GENE_READ_ITEM_SUCCESS(4),
    GENE_SEARCH_DATA_SUCCESS(5),
    GENE_TAG_DATA_SUCCESS(6),
    GENE_MENU_SUCCESS(7),
    COMPLETE_SUCCESS(8),
    FULL_COMPLETE_SUCCESS(9),
    ZIP_UNPACK_ERROR(100),
    GENE_READ_ITEM_ERROR(101),
    GENE_MENU_ERROR(102);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    public static EnumEntries<ContentStatus> getEntries() {
        return $ENTRIES;
    }

    ContentStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
