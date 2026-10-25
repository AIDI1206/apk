package com.medicmedia.medilink.datastore.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: UserWriteHistory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/UserWriteHistory;", "", "<init>", "()V", "Path", "Document", "NoteTagItemName", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UserWriteHistory {
    public static final UserWriteHistory INSTANCE = new UserWriteHistory();

    private UserWriteHistory() {
    }

    /* JADX INFO: compiled from: UserWriteHistory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/UserWriteHistory$Path;", "", "<init>", "()V", "Companion", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Path {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String FIRST_NOTE_TAB = "UsersWriteHistory/%s/write_histories/first_note_tab";
        public static final String TABS = "UsersWriteHistory/%s/tags";

        /* JADX INFO: compiled from: UserWriteHistory.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/UserWriteHistory$Path$Companion;", "", "<init>", "()V", "FIRST_NOTE_TAB", "", "TABS", "firstNoteTag", "userId", "tabs", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String firstNoteTag(String userId) {
                Intrinsics.checkNotNullParameter(userId, "userId");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Path.FIRST_NOTE_TAB, Arrays.copyOf(new Object[]{userId}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            public final String tabs(String userId) {
                Intrinsics.checkNotNullParameter(userId, "userId");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Path.TABS, Arrays.copyOf(new Object[]{userId}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
        }
    }

    /* JADX INFO: compiled from: UserWriteHistory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/UserWriteHistory$Document;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MEMO", "BOOKMARK", "MARKER", "MARKER_BLUE", "MARKER_GREEN", "MARKER_RED", "MARKER_YELLOW", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum Document {
        MEMO(HistoryRepositoryImpl.Path.MEMO),
        BOOKMARK(HistoryRepositoryImpl.Path.BOOKMARK),
        MARKER("marker"),
        MARKER_BLUE("marker_blue"),
        MARKER_GREEN("marker_green"),
        MARKER_RED("marker_red"),
        MARKER_YELLOW("marker_yellow");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final String value;

        public static EnumEntries<Document> getEntries() {
            return $ENTRIES;
        }

        Document(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: UserWriteHistory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/UserWriteHistory$NoteTagItemName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MEMO", "BOOKMARK", "MARKER", "MARKER_BLUE", "MARKER_GREEN", "MARKER_RED", "MARKER_YELLOW", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum NoteTagItemName {
        MEMO("メモ"),
        BOOKMARK("ブックマーク"),
        MARKER("マーカー"),
        MARKER_BLUE("マーカー（青）"),
        MARKER_GREEN("マーカー（緑）"),
        MARKER_RED("マーカー（赤）"),
        MARKER_YELLOW("マーカー（黄）");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final String value;

        public static EnumEntries<NoteTagItemName> getEntries() {
            return $ENTRIES;
        }

        NoteTagItemName(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }
}
