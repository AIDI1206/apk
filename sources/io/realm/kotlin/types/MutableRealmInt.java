package io.realm.kotlin.types;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.internal.UnmanagedMutableRealmInt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: MutableRealmInt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b&\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H&J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0011\u0010 \u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0011\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\"\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010#\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J\t\u0010&\u001a\u00020\u0000H\u0086\u0002J\t\u0010'\u001a\u00020\u0000H\u0086\u0002J\t\u0010(\u001a\u00020\u0000H\u0086\u0002J\t\u0010)\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0011H\u0086\u0004J\u0011\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0011H\u0086\u0004J\u0011\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0011H\u0086\u0004J\u0011\u0010.\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0004J\u0011\u0010/\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0004J\u0011\u00100\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0004J\u0006\u00101\u001a\u00020\u0000¨\u00063"}, d2 = {"Lio/realm/kotlin/types/MutableRealmInt;", "", "", "<init>", "()V", "get", "", "set", "", "value", "increment", "decrement", "equals", "", "other", "", "hashCode", "", "toByte", "", "toChar", "", "toDouble", "", "toFloat", "", "toInt", "toLong", "toShort", "", "toString", "", "compareTo", "plus", "minus", "times", TtmlNode.TAG_DIV, "rem", "inc", "dec", "unaryPlus", "unaryMinus", "shl", "bitCount", "shr", "ushr", "and", "or", "xor", "inv", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class MutableRealmInt extends Number implements Comparable<MutableRealmInt> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract void decrement(Number value);

    /* JADX INFO: renamed from: get */
    public abstract long getValue();

    public abstract void increment(Number value);

    public abstract void set(Number value);

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return toByte();
    }

    @Override // java.lang.Number
    public final /* bridge */ double doubleValue() {
        return toDouble();
    }

    @Override // java.lang.Number
    public final /* bridge */ float floatValue() {
        return toFloat();
    }

    @Override // java.lang.Number
    public final /* bridge */ int intValue() {
        return toInt();
    }

    @Override // java.lang.Number
    public final /* bridge */ long longValue() {
        return toLong();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return toShort();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return other != null && (other instanceof MutableRealmInt) && getValue() == ((MutableRealmInt) other).getValue();
    }

    public int hashCode() {
        return Long.hashCode(getValue());
    }

    public byte toByte() {
        return (byte) getValue();
    }

    @Deprecated(message = "Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.\nSee https://youtrack.jetbrains.com/issue/KT-46465 for details about the migration", replaceWith = @ReplaceWith(expression = "this.toInt().toChar()", imports = {}))
    public char toChar() {
        return (char) getValue();
    }

    public double toDouble() {
        return getValue();
    }

    public float toFloat() {
        return getValue();
    }

    public int toInt() {
        return (int) getValue();
    }

    public long toLong() {
        return getValue();
    }

    public short toShort() {
        return (short) getValue();
    }

    public String toString() {
        return "RealmMutableInt{" + getValue() + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableRealmInt other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(getValue(), other.getValue());
    }

    public final MutableRealmInt plus(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() + other.longValue());
    }

    public final MutableRealmInt minus(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() - other.longValue());
    }

    public final MutableRealmInt times(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() * other.longValue());
    }

    public final MutableRealmInt div(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() / other.longValue());
    }

    public final MutableRealmInt rem(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() % other.longValue());
    }

    public final MutableRealmInt inc() {
        return INSTANCE.create(getValue() + 1);
    }

    public final MutableRealmInt dec() {
        return INSTANCE.create(getValue() - 1);
    }

    public final MutableRealmInt unaryPlus() {
        return INSTANCE.create(getValue());
    }

    public final MutableRealmInt unaryMinus() {
        return INSTANCE.create(-getValue());
    }

    public final MutableRealmInt shl(int bitCount) {
        return INSTANCE.create(getValue() << bitCount);
    }

    public final MutableRealmInt shr(int bitCount) {
        return INSTANCE.create(getValue() >> bitCount);
    }

    public final MutableRealmInt ushr(int bitCount) {
        return INSTANCE.create(getValue() >>> bitCount);
    }

    public final MutableRealmInt and(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() & other.longValue());
    }

    public final MutableRealmInt or(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() | other.longValue());
    }

    public final MutableRealmInt xor(Number other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.create(getValue() ^ other.longValue());
    }

    public final MutableRealmInt inv() {
        return INSTANCE.create(~getValue());
    }

    /* JADX INFO: compiled from: MutableRealmInt.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/types/MutableRealmInt$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/types/MutableRealmInt;", "value", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MutableRealmInt create(long value) {
            return new UnmanagedMutableRealmInt(value);
        }
    }
}
