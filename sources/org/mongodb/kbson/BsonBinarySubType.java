package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: BsonBinarySubType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lorg/mongodb/kbson/BsonBinarySubType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "BINARY", "FUNCTION", "OLD_BINARY", "UUID_LEGACY", "UUID_STANDARD", "MD5", "ENCRYPTED", "COLUMN", "USER_DEFINED", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum BsonBinarySubType {
    BINARY((byte) 0),
    FUNCTION((byte) 1),
    OLD_BINARY((byte) 2),
    UUID_LEGACY((byte) 3),
    UUID_STANDARD((byte) 4),
    MD5((byte) 5),
    ENCRYPTED((byte) 6),
    COLUMN((byte) 7),
    USER_DEFINED((byte) -128);

    private final byte value;

    BsonBinarySubType(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
