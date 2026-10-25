package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.common.base.Ascii;
import com.medicmedia.medilink.MLConst;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.mongodb.kbson.serialization.BsonBinarySerializer;

/* JADX INFO: compiled from: BsonBinary.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0000J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lorg/mongodb/kbson/BsonBinary;", "Lorg/mongodb/kbson/BsonValue;", "data", "", "([B)V", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lorg/mongodb/kbson/BsonBinarySubType;", "(Lorg/mongodb/kbson/BsonBinarySubType;[B)V", "", "(B[B)V", "bsonType", "Lorg/mongodb/kbson/BsonType;", "getBsonType", "()Lorg/mongodb/kbson/BsonType;", "getData", "()[B", "getType", "()B", "clone", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable(with = BsonBinarySerializer.class)
public final class BsonBinary extends BsonValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final byte[] data;
    private final byte type;

    /* JADX INFO: compiled from: BsonBinary.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lorg/mongodb/kbson/BsonBinary$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/mongodb/kbson/BsonBinary;", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BsonBinary> serializer() {
            return BsonBinarySerializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsonBinary(byte b, byte[] data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = b;
        this.data = data;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final byte getType() {
        return this.type;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BsonBinary(byte[] data) {
        this(BsonBinarySubType.BINARY, data);
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BsonBinary(BsonBinarySubType type, byte[] data) {
        this(type.getValue(), data);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final BsonBinary clone() {
        byte b = this.type;
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new BsonBinary(b, bArrCopyOf);
    }

    @Override // org.mongodb.kbson.BsonValue
    public BsonType getBsonType() {
        return BsonType.BINARY;
    }

    public String toString() {
        return "BsonBinary(type=" + ((int) this.type) + ", data=" + ArraysKt.joinToString$default(this.data, (CharSequence) MLConst.MLCommon.COMMA, (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) + ')';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(getClass()), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        BsonBinary bsonBinary = (BsonBinary) other;
        return this.type == bsonBinary.type && Arrays.equals(this.data, bsonBinary.data);
    }

    public int hashCode() {
        return (this.type * Ascii.US) + Arrays.hashCode(this.data);
    }
}
