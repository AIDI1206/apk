package com.medicmedia.medilink.datastore.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.firestore.PropertyName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoteTagItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/NoteTagItem;", "", "name", "", "presetFlg", "", "updatedDate", "Ljava/util/Date;", "deleteFlg", "<init>", "(Ljava/lang/String;ZLjava/util/Date;Z)V", "getName", "()Ljava/lang/String;", "getPresetFlg", "()Z", "getUpdatedDate", "()Ljava/util/Date;", "getDeleteFlg", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class NoteTagItem {

    @PropertyName("delete_flg")
    private final boolean deleteFlg;
    private final String name;

    @PropertyName("preset_flg")
    private final boolean presetFlg;

    @PropertyName("updated_date")
    private final Date updatedDate;

    public static /* synthetic */ NoteTagItem copy$default(NoteTagItem noteTagItem, String str, boolean z, Date date, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteTagItem.name;
        }
        if ((i & 2) != 0) {
            z = noteTagItem.presetFlg;
        }
        if ((i & 4) != 0) {
            date = noteTagItem.updatedDate;
        }
        if ((i & 8) != 0) {
            z2 = noteTagItem.deleteFlg;
        }
        return noteTagItem.copy(str, z, date, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPresetFlg() {
        return this.presetFlg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }

    public final NoteTagItem copy(String name, boolean presetFlg, Date updatedDate, boolean deleteFlg) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        return new NoteTagItem(name, presetFlg, updatedDate, deleteFlg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteTagItem)) {
            return false;
        }
        NoteTagItem noteTagItem = (NoteTagItem) other;
        return Intrinsics.areEqual(this.name, noteTagItem.name) && this.presetFlg == noteTagItem.presetFlg && Intrinsics.areEqual(this.updatedDate, noteTagItem.updatedDate) && this.deleteFlg == noteTagItem.deleteFlg;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Boolean.hashCode(this.presetFlg)) * 31) + this.updatedDate.hashCode()) * 31) + Boolean.hashCode(this.deleteFlg);
    }

    public String toString() {
        return "NoteTagItem(name=" + this.name + ", presetFlg=" + this.presetFlg + ", updatedDate=" + this.updatedDate + ", deleteFlg=" + this.deleteFlg + ")";
    }

    public NoteTagItem(String name, boolean z, Date updatedDate, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.name = name;
        this.presetFlg = z;
        this.updatedDate = updatedDate;
        this.deleteFlg = z2;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPresetFlg() {
        return this.presetFlg;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    public final boolean getDeleteFlg() {
        return this.deleteFlg;
    }
}
