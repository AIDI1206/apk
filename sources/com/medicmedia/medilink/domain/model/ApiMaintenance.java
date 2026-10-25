package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiCommon.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ApiMaintenance;", "", "name", "", TtmlNode.START, TtmlNode.END, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStart", "getEnd", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ApiMaintenance {
    private final String end;
    private final String name;
    private final String start;
    private final String text;

    public ApiMaintenance() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ApiMaintenance copy$default(ApiMaintenance apiMaintenance, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMaintenance.name;
        }
        if ((i & 2) != 0) {
            str2 = apiMaintenance.start;
        }
        if ((i & 4) != 0) {
            str3 = apiMaintenance.end;
        }
        if ((i & 8) != 0) {
            str4 = apiMaintenance.text;
        }
        return apiMaintenance.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final ApiMaintenance copy(String name, String start, String end, String text) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ApiMaintenance(name, start, end, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMaintenance)) {
            return false;
        }
        ApiMaintenance apiMaintenance = (ApiMaintenance) other;
        return Intrinsics.areEqual(this.name, apiMaintenance.name) && Intrinsics.areEqual(this.start, apiMaintenance.start) && Intrinsics.areEqual(this.end, apiMaintenance.end) && Intrinsics.areEqual(this.text, apiMaintenance.text);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "ApiMaintenance(name=" + this.name + ", start=" + this.start + ", end=" + this.end + ", text=" + this.text + ")";
    }

    public ApiMaintenance(String name, String start, String end, String text) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(text, "text");
        this.name = name;
        this.start = start;
        this.end = end;
        this.text = text;
    }

    public /* synthetic */ ApiMaintenance(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getName() {
        return this.name;
    }

    public final String getStart() {
        return this.start;
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getText() {
        return this.text;
    }
}
