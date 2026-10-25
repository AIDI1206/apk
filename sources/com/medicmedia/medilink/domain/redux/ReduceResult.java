package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonUi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/ReduceResult;", ExifInterface.LATITUDE_SOUTH, ExifInterface.LONGITUDE_EAST, "", RemoteConfigConstants.ResponseFieldKey.STATE, NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEvent", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/medicmedia/medilink/domain/redux/ReduceResult;", "equals", "", "other", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ReduceResult<S, E> {
    private final E event;
    private final S state;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReduceResult copy$default(ReduceResult reduceResult, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = reduceResult.state;
        }
        if ((i & 2) != 0) {
            obj2 = reduceResult.event;
        }
        return reduceResult.copy(obj, obj2);
    }

    public final S component1() {
        return this.state;
    }

    public final E component2() {
        return this.event;
    }

    public final ReduceResult<S, E> copy(S state, E event) {
        return new ReduceResult<>(state, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReduceResult)) {
            return false;
        }
        ReduceResult reduceResult = (ReduceResult) other;
        return Intrinsics.areEqual(this.state, reduceResult.state) && Intrinsics.areEqual(this.event, reduceResult.event);
    }

    public int hashCode() {
        S s = this.state;
        int iHashCode = (s == null ? 0 : s.hashCode()) * 31;
        E e = this.event;
        return iHashCode + (e != null ? e.hashCode() : 0);
    }

    public String toString() {
        return "ReduceResult(state=" + this.state + ", event=" + this.event + ")";
    }

    public ReduceResult(S s, E e) {
        this.state = s;
        this.event = e;
    }

    public /* synthetic */ ReduceResult(Object obj, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : obj2);
    }

    public final S getState() {
        return this.state;
    }

    public final E getEvent() {
        return this.event;
    }
}
