package com.medicmedia.medilink.datastore.firebase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebasePreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/datastore/firebase/ContentsResponse;", "", "contentsCode", "", "", "<init>", "(Ljava/util/List;)V", "getContentsCode", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* data */ class ContentsResponse {

    @SerializedName("contents_code")
    private final List<String> contentsCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsResponse copy$default(ContentsResponse contentsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentsResponse.contentsCode;
        }
        return contentsResponse.copy(list);
    }

    public final List<String> component1() {
        return this.contentsCode;
    }

    public final ContentsResponse copy(List<String> contentsCode) {
        return new ContentsResponse(contentsCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentsResponse) && Intrinsics.areEqual(this.contentsCode, ((ContentsResponse) other).contentsCode);
    }

    public int hashCode() {
        List<String> list = this.contentsCode;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ContentsResponse(contentsCode=" + this.contentsCode + ")";
    }

    public ContentsResponse(List<String> list) {
        this.contentsCode = list;
    }

    public final List<String> getContentsCode() {
        return this.contentsCode;
    }
}
