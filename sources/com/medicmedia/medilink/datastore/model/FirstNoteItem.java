package com.medicmedia.medilink.datastore.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.firestore.PropertyName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirstNoteItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/FirstNoteItem;", "", "index", "", "name", "", "updatedDate", "Ljava/util/Date;", "description", "deleteFlg", "", "option", "noteId", "<init>", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getUpdatedDate", "()Ljava/util/Date;", "getDescription", "getDeleteFlg", "()Z", "getOption", "getNoteId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class FirstNoteItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @PropertyName("delete_flg")
    private final boolean deleteFlg;
    private final String description;
    private final int index;
    private final String name;

    @PropertyName("note_id")
    private final String noteId;
    private final String option;

    @PropertyName("updated_date")
    private final Date updatedDate;

    public static /* synthetic */ FirstNoteItem copy$default(FirstNoteItem firstNoteItem, int i, String str, Date date, String str2, boolean z, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = firstNoteItem.index;
        }
        if ((i2 & 2) != 0) {
            str = firstNoteItem.name;
        }
        if ((i2 & 4) != 0) {
            date = firstNoteItem.updatedDate;
        }
        if ((i2 & 8) != 0) {
            str2 = firstNoteItem.description;
        }
        if ((i2 & 16) != 0) {
            z = firstNoteItem.deleteFlg;
        }
        if ((i2 & 32) != 0) {
            str3 = firstNoteItem.option;
        }
        if ((i2 & 64) != 0) {
            str4 = firstNoteItem.noteId;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z2 = z;
        Date date2 = date;
        return firstNoteItem.copy(i, str, date2, str2, z2, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    public final FirstNoteItem copy(int index, String name, Date updatedDate, String description, boolean deleteFlg, String option, String noteId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(option, "option");
        return new FirstNoteItem(index, name, updatedDate, description, deleteFlg, option, noteId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstNoteItem)) {
            return false;
        }
        FirstNoteItem firstNoteItem = (FirstNoteItem) other;
        return this.index == firstNoteItem.index && Intrinsics.areEqual(this.name, firstNoteItem.name) && Intrinsics.areEqual(this.updatedDate, firstNoteItem.updatedDate) && Intrinsics.areEqual(this.description, firstNoteItem.description) && this.deleteFlg == firstNoteItem.deleteFlg && Intrinsics.areEqual(this.option, firstNoteItem.option) && Intrinsics.areEqual(this.noteId, firstNoteItem.noteId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.index) * 31) + this.name.hashCode()) * 31) + this.updatedDate.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.deleteFlg)) * 31) + this.option.hashCode()) * 31;
        String str = this.noteId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FirstNoteItem(index=" + this.index + ", name=" + this.name + ", updatedDate=" + this.updatedDate + ", description=" + this.description + ", deleteFlg=" + this.deleteFlg + ", option=" + this.option + ", noteId=" + this.noteId + ")";
    }

    public FirstNoteItem(int i, String name, Date updatedDate, String description, boolean z, String option, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(option, "option");
        this.index = i;
        this.name = name;
        this.updatedDate = updatedDate;
        this.description = description;
        this.deleteFlg = z;
        this.option = option;
        this.noteId = str;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    public /* synthetic */ FirstNoteItem(int i, String str, Date date, String str2, boolean z, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, date, str2, z, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : str4);
    }

    public final String getOption() {
        return this.option;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: compiled from: FirstNoteItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/FirstNoteItem$Companion;", "", "<init>", "()V", "createFirstItem", "Lcom/medicmedia/medilink/datastore/model/FirstNoteItem;", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FirstNoteItem createFirstItem() {
            return new FirstNoteItem(0, "最初のノート", new Date(), "これは最初に設定しているノートです。本のメモ、マーカー、ブックマークがここに記録されます。", false, null, null, 96, null);
        }
    }
}
