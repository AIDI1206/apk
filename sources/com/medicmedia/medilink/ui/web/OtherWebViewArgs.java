package com.medicmedia.medilink.ui.web;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtherWebViewArgs.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/web/OtherWebViewArgs;", "Landroid/os/Parcelable;", "url", "", HistoryRepositoryImpl.FieldName.TITLE, "isPrimaryColor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getTitle", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OtherWebViewArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OtherWebViewArgs> CREATOR = new Creator();
    private final boolean isPrimaryColor;
    private final String title;
    private final String url;

    /* JADX INFO: compiled from: OtherWebViewArgs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<OtherWebViewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherWebViewArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtherWebViewArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherWebViewArgs[] newArray(int i) {
            return new OtherWebViewArgs[i];
        }
    }

    public OtherWebViewArgs() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ OtherWebViewArgs copy$default(OtherWebViewArgs otherWebViewArgs, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otherWebViewArgs.url;
        }
        if ((i & 2) != 0) {
            str2 = otherWebViewArgs.title;
        }
        if ((i & 4) != 0) {
            z = otherWebViewArgs.isPrimaryColor;
        }
        return otherWebViewArgs.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPrimaryColor() {
        return this.isPrimaryColor;
    }

    public final OtherWebViewArgs copy(String url, String title, boolean isPrimaryColor) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new OtherWebViewArgs(url, title, isPrimaryColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherWebViewArgs)) {
            return false;
        }
        OtherWebViewArgs otherWebViewArgs = (OtherWebViewArgs) other;
        return Intrinsics.areEqual(this.url, otherWebViewArgs.url) && Intrinsics.areEqual(this.title, otherWebViewArgs.title) && this.isPrimaryColor == otherWebViewArgs.isPrimaryColor;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.title;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryColor);
    }

    public String toString() {
        return "OtherWebViewArgs(url=" + this.url + ", title=" + this.title + ", isPrimaryColor=" + this.isPrimaryColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.url);
        dest.writeString(this.title);
        dest.writeInt(this.isPrimaryColor ? 1 : 0);
    }

    public OtherWebViewArgs(String url, String str, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.title = str;
        this.isPrimaryColor = z;
    }

    public /* synthetic */ OtherWebViewArgs(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPrimaryColor() {
        return this.isPrimaryColor;
    }
}
