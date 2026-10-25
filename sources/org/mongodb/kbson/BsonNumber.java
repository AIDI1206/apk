package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BsonNumber.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/mongodb/kbson/BsonNumber;", "Lorg/mongodb/kbson/BsonValue;", "number", "", "(Ljava/lang/Number;)V", "doubleValue", "", "intValue", "", "longValue", "", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class BsonNumber extends BsonValue {
    private final Number number;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsonNumber(Number number) {
        super(null);
        Intrinsics.checkNotNullParameter(number, "number");
        this.number = number;
    }

    public final int intValue() {
        return this.number.intValue();
    }

    public final long longValue() {
        return this.number.longValue();
    }

    public final double doubleValue() {
        return this.number.doubleValue();
    }
}
