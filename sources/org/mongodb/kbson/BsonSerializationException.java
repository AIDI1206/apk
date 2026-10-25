package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BsonSerializationException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lorg/mongodb/kbson/BsonSerializationException;", "Lorg/mongodb/kbson/BsonException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BsonSerializationException extends BsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsonSerializationException(String message, Throwable th) {
        super(message, th, null, 4, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ BsonSerializationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    @Override // org.mongodb.kbson.BsonException, java.lang.Throwable
    public String toString() {
        StringBuilder sbAppend = new StringBuilder("BsonSerializationException(message=").append(getMessage()).append(", cause=");
        Throwable cause = getCause();
        return sbAppend.append(cause != null ? cause.getMessage() : null).append(')').toString();
    }
}
