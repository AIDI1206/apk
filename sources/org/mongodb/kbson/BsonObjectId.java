package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mongodb.kbson.internal.AtomicInt;
import org.mongodb.kbson.internal.CurrentTime;
import org.mongodb.kbson.internal.HexUtils;
import org.mongodb.kbson.serialization.BsonObjectIdSerializer;

/* JADX INFO: compiled from: BsonObjectId.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lorg/mongodb/kbson/BsonObjectId;", "Lorg/mongodb/kbson/BsonValue;", "", "timestamp", "", "randomValue1", "randomValue2", "", "counter", "(IISI)V", "bsonType", "Lorg/mongodb/kbson/BsonType;", "getBsonType", "()Lorg/mongodb/kbson/BsonType;", "getTimestamp", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toByteArray", "", "toHexString", "", "toString", "Companion", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable(with = BsonObjectIdSerializer.class)
public final class BsonObjectId extends BsonValue implements Comparable<BsonObjectId> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int LOW_ORDER_THREE_BYTES = 16777215;
    private static final int MILLIS_IN_SECOND = 1000;
    private static final AtomicInt NEXT_COUNTER;
    public static final int OBJECT_ID_LENGTH = 12;
    private static final int RANDOM_VALUE1;
    private static final short RANDOM_VALUE2;
    private final int counter;
    private final int randomValue1;
    private final short randomValue2;
    private final int timestamp;

    public final int getTimestamp() {
        return this.timestamp;
    }

    public BsonObjectId(int i, int i2, short s, int i3) {
        super(null);
        this.timestamp = i;
        this.randomValue1 = i2;
        this.randomValue2 = s;
        this.counter = i3;
        if ((i2 & ViewCompat.MEASURED_STATE_MASK) != 0) {
            throw new IllegalArgumentException("The random value must be between 0 and 16777215 (it must fit in three bytes).".toString());
        }
        if (((-16777216) & i3) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).".toString());
        }
    }

    public final byte[] toByteArray() {
        int i = this.timestamp;
        int i2 = this.randomValue1;
        short s = this.randomValue2;
        int i3 = this.counter;
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2, (byte) (s >> 8), (byte) s, (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3};
    }

    public final String toHexString() {
        String lowerCase = HexUtils.INSTANCE.toHexString(toByteArray()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @Override // org.mongodb.kbson.BsonValue
    public BsonType getBsonType() {
        return BsonType.OBJECT_ID;
    }

    public String toString() {
        return "BsonObjectId(" + toHexString() + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonObjectId other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] byteArray = toByteArray();
        byte[] byteArray2 = other.toByteArray();
        for (int i = 0; i < 12; i++) {
            byte b = byteArray[i];
            byte b2 = byteArray2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        BsonObjectId bsonObjectId = (BsonObjectId) other;
        return this.timestamp == bsonObjectId.timestamp && this.randomValue1 == bsonObjectId.randomValue1 && this.randomValue2 == bsonObjectId.randomValue2 && this.counter == bsonObjectId.counter;
    }

    public int hashCode() {
        return (((((this.timestamp * 31) + this.randomValue1) * 31) + this.randomValue2) * 31) + this.counter;
    }

    /* JADX INFO: compiled from: BsonObjectId.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\t\u0010\u000f\u001a\u00020\rH\u0086\u0002J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0086\u0002J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u00020\u0011\"\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0016\u001a\u00020\u0011\"\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001bHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/mongodb/kbson/BsonObjectId$Companion;", "", "()V", "LOW_ORDER_THREE_BYTES", "", "MILLIS_IN_SECOND", "NEXT_COUNTER", "Lorg/mongodb/kbson/internal/AtomicInt;", "OBJECT_ID_LENGTH", "RANDOM_VALUE1", "RANDOM_VALUE2", "", "fromTimeInSeconds", "Lorg/mongodb/kbson/BsonObjectId;", "timestamp", "invoke", "byteArray", "", "", "hexString", "", "makeInt", "bytes", "", "makeShort", "nextCounter", "serializer", "Lkotlinx/serialization/KSerializer;", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BsonObjectId> serializer() {
            return BsonObjectIdSerializer.INSTANCE;
        }

        public final BsonObjectId invoke() {
            return fromTimeInSeconds(CurrentTime.INSTANCE.getCurrentTimeInSeconds());
        }

        public final BsonObjectId invoke(long timestamp) {
            return fromTimeInSeconds((int) (timestamp / ((long) 1000)));
        }

        public final BsonObjectId invoke(String hexString) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            if (hexString.length() != 24) {
                throw new IllegalArgumentException(("invalid hexadecimal representation of an ObjectId: [" + hexString + AbstractJsonLexerKt.END_LIST).toString());
            }
            return invoke(HexUtils.INSTANCE.toByteArray(hexString));
        }

        public final BsonObjectId invoke(byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (byteArray.length != 12) {
                throw new IllegalArgumentException(("invalid byteArray.size() " + byteArray.length + " != 12").toString());
            }
            return new BsonObjectId(makeInt(byteArray[0], byteArray[1], byteArray[2], byteArray[3]), makeInt(0, byteArray[4], byteArray[5], byteArray[6]), makeShort(byteArray[7], byteArray[8]), makeInt(0, byteArray[9], byteArray[10], byteArray[11]));
        }

        private final BsonObjectId fromTimeInSeconds(int timestamp) {
            return new BsonObjectId(timestamp, BsonObjectId.RANDOM_VALUE1, BsonObjectId.RANDOM_VALUE2, nextCounter());
        }

        private final int nextCounter() {
            return BsonObjectId.NEXT_COUNTER.addAndGet(1) & 16777215;
        }

        private final int makeInt(byte... bytes) {
            if (bytes.length != 4) {
                throw new IllegalArgumentException("The byte array must be 4 bytes long.".toString());
            }
            return (bytes[3] & 255) | (bytes[0] << Ascii.CAN) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8);
        }

        private final short makeShort(byte... bytes) {
            if (bytes.length != 2) {
                throw new IllegalArgumentException("The byte array must be 2 bytes long.".toString());
            }
            return (short) ((bytes[1] & 255) | ((bytes[0] & 255) << 8));
        }
    }

    static {
        Random Random = RandomKt.Random(CurrentTime.INSTANCE.getCurrentTimeInSeconds());
        NEXT_COUNTER = new AtomicInt(Random.nextInt());
        RANDOM_VALUE1 = Random.nextInt(16777216);
        RANDOM_VALUE2 = (short) Random.nextInt(32768);
    }
}
