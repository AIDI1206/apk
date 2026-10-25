package com.medicmedia.medilink.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Const.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/TrialContentsCode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "YEAR_NOTE", "REVIEW_BOOK_KANGO", "VISIBLE_SERIES_BYOUKI", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TrialContentsCode {
    YEAR_NOTE("2A1ZQ00"),
    REVIEW_BOOK_KANGO("3ADZR00"),
    VISIBLE_SERIES_BYOUKI("1A6Z200");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<TrialContentsCode> getEntries() {
        return $ENTRIES;
    }

    TrialContentsCode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: Const.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/TrialContentsCode$Companion;", "", "<init>", "()V", "isTrialContents", "", "contentsCode", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x002c A[RETURN] */
        public final boolean isTrialContents(String contentsCode) {
            Intrinsics.checkNotNullParameter(contentsCode, "contentsCode");
            for (TrialContentsCode trialContentsCode : TrialContentsCode.getEntries()) {
                if (Intrinsics.areEqual(trialContentsCode.getValue(), contentsCode)) {
                    if (trialContentsCode != null) {
                        return true;
                    }
                    return false;
                }
            }
            trialContentsCode = null;
            if (trialContentsCode != null) {
                return true;
            }
            return false;
        }
    }
}
