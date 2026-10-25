package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import kotlin.Metadata;

/* JADX INFO: compiled from: BsonType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0012\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lorg/mongodb/kbson/BsonType;", "", "value", "Lkotlin/UByte;", "(Ljava/lang/String;IB)V", "getValue-w2LRezQ", "()B", "B", "isContainer", "", "toByte", "", "toByte$kbson_release", "END_OF_DOCUMENT", "DOUBLE", "STRING", "DOCUMENT", "ARRAY", "BINARY", "UNDEFINED", "OBJECT_ID", "BOOLEAN", "DATE_TIME", "NULL", "REGULAR_EXPRESSION", "DB_POINTER", "JAVASCRIPT", "SYMBOL", "JAVASCRIPT_WITH_SCOPE", "INT32", "TIMESTAMP", "INT64", "DECIMAL128", "MIN_KEY", "MAX_KEY", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum BsonType {
    END_OF_DOCUMENT((byte) 0),
    DOUBLE((byte) 1),
    STRING((byte) 2),
    DOCUMENT((byte) 3),
    ARRAY((byte) 4),
    BINARY((byte) 5),
    UNDEFINED((byte) 6),
    OBJECT_ID((byte) 7),
    BOOLEAN((byte) 8),
    DATE_TIME((byte) 9),
    NULL((byte) 10),
    REGULAR_EXPRESSION(Ascii.VT),
    DB_POINTER((byte) 12),
    JAVASCRIPT(Ascii.CR),
    SYMBOL(Ascii.SO),
    JAVASCRIPT_WITH_SCOPE(Ascii.SI),
    INT32(Ascii.DLE),
    TIMESTAMP((byte) 17),
    INT64(Ascii.DC2),
    DECIMAL128((byte) 19),
    MIN_KEY((byte) -1),
    MAX_KEY((byte) 127);

    private final byte value;

    BsonType(byte b) {
        this.value = b;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }

    public final boolean isContainer() {
        return this == DOCUMENT || this == ARRAY;
    }

    public final byte toByte$kbson_release() {
        return this.value;
    }
}
