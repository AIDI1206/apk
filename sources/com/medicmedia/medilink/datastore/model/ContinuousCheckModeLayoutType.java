package com.medicmedia.medilink.datastore.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContinuousCheckModeLayoutType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/ContinuousCheckModeLayoutType;", "", "index", "", "value", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", "LEFT", "CENTER", "RIGHT", "Companion", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ContinuousCheckModeLayoutType {
    LEFT(0, TtmlNode.LEFT),
    CENTER(1, TtmlNode.CENTER),
    RIGHT(2, TtmlNode.RIGHT);

    private final int index;
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ContinuousCheckModeLayoutType> getEntries() {
        return $ENTRIES;
    }

    ContinuousCheckModeLayoutType(int i, String str) {
        this.index = i;
        this.value = str;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: ContinuousCheckModeLayoutType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/ContinuousCheckModeLayoutType$Companion;", "", "<init>", "()V", "findOrNull", "Lcom/medicmedia/medilink/datastore/model/ContinuousCheckModeLayoutType;", "index", "", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContinuousCheckModeLayoutType findOrNull(int index) {
            ContinuousCheckModeLayoutType next;
            Iterator<ContinuousCheckModeLayoutType> it = ContinuousCheckModeLayoutType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getIndex() == index) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }
}
