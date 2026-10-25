package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.mongodb.kbson.internal.Decimal128;
import org.mongodb.kbson.serialization.BsonDecimal128Serializer;

/* JADX INFO: compiled from: BsonDecimal128.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lorg/mongodb/kbson/BsonDecimal128;", "Lorg/mongodb/kbson/BsonValue;", "value", "Lorg/mongodb/kbson/internal/Decimal128;", "(Lorg/mongodb/kbson/internal/Decimal128;)V", "bsonType", "Lorg/mongodb/kbson/BsonType;", "getBsonType", "()Lorg/mongodb/kbson/BsonType;", "high", "Lkotlin/ULong;", "getHigh-s-VKNKU", "()J", "isFinite", "", "()Z", "isInfinite", "isNaN", "isNegative", "low", "getLow-s-VKNKU", "getValue$kbson_release", "()Lorg/mongodb/kbson/internal/Decimal128;", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable(with = BsonDecimal128Serializer.class)
public final class BsonDecimal128 extends BsonValue {
    private final Decimal128 value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BsonDecimal128 POSITIVE_INFINITY = new BsonDecimal128(Decimal128.INSTANCE.getPOSITIVE_INFINITY());
    private static final BsonDecimal128 NEGATIVE_INFINITY = new BsonDecimal128(Decimal128.INSTANCE.getNEGATIVE_INFINITY());
    private static final BsonDecimal128 NEGATIVE_NaN = new BsonDecimal128(Decimal128.INSTANCE.getNEGATIVE_NaN());
    private static final BsonDecimal128 NaN = new BsonDecimal128(Decimal128.INSTANCE.getNaN());
    private static final BsonDecimal128 POSITIVE_ZERO = new BsonDecimal128(Decimal128.INSTANCE.getPOSITIVE_ZERO());
    private static final BsonDecimal128 NEGATIVE_ZERO = new BsonDecimal128(Decimal128.INSTANCE.getNEGATIVE_ZERO());

    public /* synthetic */ BsonDecimal128(Decimal128 decimal128, DefaultConstructorMarker defaultConstructorMarker) {
        this(decimal128);
    }

    private BsonDecimal128(Decimal128 decimal128) {
        super(null);
        this.value = decimal128;
    }

    /* JADX INFO: renamed from: getValue$kbson_release, reason: from getter */
    public final Decimal128 getValue() {
        return this.value;
    }

    @Override // org.mongodb.kbson.BsonValue
    public BsonType getBsonType() {
        return BsonType.DECIMAL128;
    }

    /* JADX INFO: renamed from: getHigh-s-VKNKU, reason: not valid java name */
    public final long m13359getHighsVKNKU() {
        return this.value.getHigh();
    }

    /* JADX INFO: renamed from: getLow-s-VKNKU, reason: not valid java name */
    public final long m13360getLowsVKNKU() {
        return this.value.getLow();
    }

    public final boolean isNegative() {
        return this.value.isNegative();
    }

    public final boolean isInfinite() {
        return this.value.isInfinite();
    }

    public final boolean isFinite() {
        return this.value.isFinite();
    }

    public final boolean isNaN() {
        return this.value.isNaN();
    }

    public String toString() {
        return "BsonDecimal128(value=" + this.value + ')';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        return Intrinsics.areEqual(this.value, ((BsonDecimal128) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX INFO: compiled from: BsonDecimal128.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\u0002J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lorg/mongodb/kbson/BsonDecimal128$Companion;", "", "()V", "NEGATIVE_INFINITY", "Lorg/mongodb/kbson/BsonDecimal128;", "getNEGATIVE_INFINITY", "()Lorg/mongodb/kbson/BsonDecimal128;", "NEGATIVE_NaN", "getNEGATIVE_NaN", "NEGATIVE_ZERO", "getNEGATIVE_ZERO", "NaN", "getNaN", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY", "POSITIVE_ZERO", "getPOSITIVE_ZERO", "fromIEEE754BIDEncoding", "high", "Lkotlin/ULong;", "low", "fromIEEE754BIDEncoding-PWzV0Is", "(JJ)Lorg/mongodb/kbson/BsonDecimal128;", "invoke", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BsonDecimal128> serializer() {
            return BsonDecimal128Serializer.INSTANCE;
        }

        public final BsonDecimal128 getPOSITIVE_INFINITY() {
            return BsonDecimal128.POSITIVE_INFINITY;
        }

        public final BsonDecimal128 getNEGATIVE_INFINITY() {
            return BsonDecimal128.NEGATIVE_INFINITY;
        }

        public final BsonDecimal128 getNEGATIVE_NaN() {
            return BsonDecimal128.NEGATIVE_NaN;
        }

        public final BsonDecimal128 getNaN() {
            return BsonDecimal128.NaN;
        }

        public final BsonDecimal128 getPOSITIVE_ZERO() {
            return BsonDecimal128.POSITIVE_ZERO;
        }

        public final BsonDecimal128 getNEGATIVE_ZERO() {
            return BsonDecimal128.NEGATIVE_ZERO;
        }

        /* JADX INFO: renamed from: fromIEEE754BIDEncoding-PWzV0Is, reason: not valid java name */
        public final BsonDecimal128 m13361fromIEEE754BIDEncodingPWzV0Is(long high, long low) {
            return new BsonDecimal128(Decimal128.INSTANCE.m13376fromIEEE754BIDEncodingPWzV0Is(high, low), null);
        }

        public final BsonDecimal128 invoke(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new BsonDecimal128(Decimal128.INSTANCE.invoke(value), null);
        }
    }
}
