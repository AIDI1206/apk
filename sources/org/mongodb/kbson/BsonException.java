package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BsonException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\r\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lorg/mongodb/kbson/BsonException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "errorCode", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "hasErrorCode", "", "toString", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class BsonException extends RuntimeException {
    private final Integer errorCode;

    public BsonException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BsonException(String str, Throwable th, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : num);
    }

    public BsonException(String str, Throwable th, Integer num) {
        super(str, th);
        this.errorCode = num;
    }

    public final boolean hasErrorCode() {
        return this.errorCode != null;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "BsonException(message=" + getMessage() + ", cause=" + getCause() + ", errorCode=" + this.errorCode + ')';
    }
}
