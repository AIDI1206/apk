package com.medicmedia.medilink.core.network.functions;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FirebaseFunctionsError.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/FirebaseFunctionsError;", "Ljava/io/IOException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class FirebaseFunctionsError extends IOException {
    private final Throwable cause;
    private final String message;

    public static /* synthetic */ FirebaseFunctionsError copy$default(FirebaseFunctionsError firebaseFunctionsError, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseFunctionsError.message;
        }
        if ((i & 2) != 0) {
            th = firebaseFunctionsError.cause;
        }
        return firebaseFunctionsError.copy(str, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    public final FirebaseFunctionsError copy(String message, Throwable cause) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new FirebaseFunctionsError(message, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseFunctionsError)) {
            return false;
        }
        FirebaseFunctionsError firebaseFunctionsError = (FirebaseFunctionsError) other;
        return Intrinsics.areEqual(this.message, firebaseFunctionsError.message) && Intrinsics.areEqual(this.cause, firebaseFunctionsError.cause);
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        Throwable th = this.cause;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "FirebaseFunctionsError(message=" + this.message + ", cause=" + this.cause + ")";
    }

    public /* synthetic */ FirebaseFunctionsError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseFunctionsError(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.cause = th;
    }
}
