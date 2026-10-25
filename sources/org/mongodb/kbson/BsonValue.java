package org.mongodb.kbson;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.mongodb.kbson.serialization.Bson;
import org.mongodb.kbson.serialization.BsonValueSerializer;

/* JADX INFO: compiled from: BsonValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b7\u0018\u0000 O2\u00020\u0001:\u0001OB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000204J\u0006\u00106\u001a\u000204J\u0006\u00107\u001a\u000204J\u0006\u00108\u001a\u000204J\u0006\u00109\u001a\u000204J\u0006\u0010:\u001a\u000204J\u0006\u0010;\u001a\u000204J\u0006\u0010<\u001a\u000204J\u0006\u0010=\u001a\u000204J\u0006\u0010>\u001a\u000204J\u0006\u0010?\u001a\u000204J\u0006\u0010@\u001a\u000204J\u0006\u0010A\u001a\u000204J\u0006\u0010B\u001a\u000204J\u0006\u0010C\u001a\u000204J\u0006\u0010D\u001a\u000204J\u0006\u0010E\u001a\u000204J\u0006\u0010F\u001a\u000204J\u0006\u0010G\u001a\u000204J\u0006\u0010H\u001a\u000204J\u0006\u0010I\u001a\u000204J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0006\u0010M\u001a\u00020NR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0013\b\n\f\u0016\u0018\u001a\u001c$&\u000e\u0010\u0012(*,.02\u0014¨\u0006P"}, d2 = {"Lorg/mongodb/kbson/BsonValue;", "", "()V", "bsonType", "Lorg/mongodb/kbson/BsonType;", "getBsonType", "()Lorg/mongodb/kbson/BsonType;", "asArray", "Lorg/mongodb/kbson/BsonArray;", "asBinary", "Lorg/mongodb/kbson/BsonBinary;", "asBoolean", "Lorg/mongodb/kbson/BsonBoolean;", "asBsonMaxKey", "Lorg/mongodb/kbson/BsonMaxKey;", "asBsonMinKey", "Lorg/mongodb/kbson/BsonMinKey;", "asBsonNull", "Lorg/mongodb/kbson/BsonNull;", "asBsonUndefined", "Lorg/mongodb/kbson/BsonUndefined;", "asDBPointer", "Lorg/mongodb/kbson/BsonDBPointer;", "asDateTime", "Lorg/mongodb/kbson/BsonDateTime;", "asDecimal128", "Lorg/mongodb/kbson/BsonDecimal128;", "asDocument", "Lorg/mongodb/kbson/BsonDocument;", "asDouble", "Lorg/mongodb/kbson/BsonDouble;", "asInt32", "Lorg/mongodb/kbson/BsonInt32;", "asInt64", "Lorg/mongodb/kbson/BsonInt64;", "asJavaScript", "Lorg/mongodb/kbson/BsonJavaScript;", "asJavaScriptWithScope", "Lorg/mongodb/kbson/BsonJavaScriptWithScope;", "asNumber", "Lorg/mongodb/kbson/BsonNumber;", "asObjectId", "Lorg/mongodb/kbson/BsonObjectId;", "asRegularExpression", "Lorg/mongodb/kbson/BsonRegularExpression;", "asString", "Lorg/mongodb/kbson/BsonString;", "asSymbol", "Lorg/mongodb/kbson/BsonSymbol;", "asTimestamp", "Lorg/mongodb/kbson/BsonTimestamp;", "isArray", "", "isBinary", "isBoolean", "isDBPointer", "isDateTime", "isDecimal128", "isDocument", "isDouble", "isInt32", "isInt64", "isJavaScript", "isJavaScriptWithScope", "isMaxKey", "isMinKey", "isNull", "isNumber", "isObjectId", "isRegularExpression", "isString", "isSymbol", "isTimestamp", "isUndefined", "throwIfInvalidType", "", "expectedType", "toJson", "", "Companion", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable(with = BsonValueSerializer.class)
public abstract class BsonValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BsonValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract BsonType getBsonType();

    /* JADX INFO: compiled from: BsonValue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lorg/mongodb/kbson/BsonValue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/mongodb/kbson/BsonValue;", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BsonValue> serializer() {
            return BsonValueSerializer.INSTANCE;
        }
    }

    private BsonValue() {
    }

    public final boolean isNull() {
        return this instanceof BsonNull;
    }

    public final boolean isDocument() {
        return this instanceof BsonDocument;
    }

    public final boolean isArray() {
        return this instanceof BsonArray;
    }

    public final boolean isString() {
        return this instanceof BsonString;
    }

    public final boolean isNumber() {
        return isInt32() || isInt64() || isDouble();
    }

    public final boolean isInt32() {
        return this instanceof BsonInt32;
    }

    public final boolean isInt64() {
        return this instanceof BsonInt64;
    }

    public final boolean isDecimal128() {
        return this instanceof BsonDecimal128;
    }

    public final boolean isDouble() {
        return this instanceof BsonDouble;
    }

    public final boolean isBoolean() {
        return this instanceof BsonBoolean;
    }

    public final boolean isObjectId() {
        return this instanceof BsonObjectId;
    }

    public final boolean isDBPointer() {
        return this instanceof BsonDBPointer;
    }

    public final boolean isTimestamp() {
        return this instanceof BsonTimestamp;
    }

    public final boolean isBinary() {
        return this instanceof BsonBinary;
    }

    public final boolean isDateTime() {
        return this instanceof BsonDateTime;
    }

    public final boolean isSymbol() {
        return this instanceof BsonSymbol;
    }

    public final boolean isRegularExpression() {
        return this instanceof BsonRegularExpression;
    }

    public final boolean isJavaScript() {
        return this instanceof BsonJavaScript;
    }

    public final boolean isJavaScriptWithScope() {
        return this instanceof BsonJavaScriptWithScope;
    }

    public final boolean isMaxKey() {
        return this instanceof BsonMaxKey;
    }

    public final boolean isMinKey() {
        return this instanceof BsonMinKey;
    }

    public final boolean isUndefined() {
        return this instanceof BsonUndefined;
    }

    public final BsonDocument asDocument() {
        throwIfInvalidType(BsonType.DOCUMENT);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonDocument");
        return (BsonDocument) this;
    }

    public final BsonArray asArray() {
        throwIfInvalidType(BsonType.ARRAY);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonArray");
        return (BsonArray) this;
    }

    public final BsonString asString() {
        throwIfInvalidType(BsonType.STRING);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonString");
        return (BsonString) this;
    }

    public final BsonNumber asNumber() {
        if (getBsonType() != BsonType.INT32 && getBsonType() != BsonType.INT64 && getBsonType() != BsonType.DOUBLE) {
            throw new BsonInvalidOperationException("Value expected to be of a numerical BSON type is of unexpected type " + getBsonType(), null, 2, null);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonNumber");
        return (BsonNumber) this;
    }

    public final BsonInt32 asInt32() {
        throwIfInvalidType(BsonType.INT32);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonInt32");
        return (BsonInt32) this;
    }

    public final BsonInt64 asInt64() {
        throwIfInvalidType(BsonType.INT64);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonInt64");
        return (BsonInt64) this;
    }

    public final BsonDecimal128 asDecimal128() {
        throwIfInvalidType(BsonType.DECIMAL128);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonDecimal128");
        return (BsonDecimal128) this;
    }

    public final BsonDouble asDouble() {
        throwIfInvalidType(BsonType.DOUBLE);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonDouble");
        return (BsonDouble) this;
    }

    public final BsonBoolean asBoolean() {
        throwIfInvalidType(BsonType.BOOLEAN);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonBoolean");
        return (BsonBoolean) this;
    }

    public final BsonObjectId asObjectId() {
        throwIfInvalidType(BsonType.OBJECT_ID);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonObjectId");
        return (BsonObjectId) this;
    }

    public final BsonDBPointer asDBPointer() {
        throwIfInvalidType(BsonType.DB_POINTER);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonDBPointer");
        return (BsonDBPointer) this;
    }

    public final BsonTimestamp asTimestamp() {
        throwIfInvalidType(BsonType.TIMESTAMP);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonTimestamp");
        return (BsonTimestamp) this;
    }

    public final BsonBinary asBinary() {
        throwIfInvalidType(BsonType.BINARY);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonBinary");
        return (BsonBinary) this;
    }

    public final BsonDateTime asDateTime() {
        throwIfInvalidType(BsonType.DATE_TIME);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonDateTime");
        return (BsonDateTime) this;
    }

    public final BsonSymbol asSymbol() {
        throwIfInvalidType(BsonType.SYMBOL);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonSymbol");
        return (BsonSymbol) this;
    }

    public final BsonRegularExpression asRegularExpression() {
        throwIfInvalidType(BsonType.REGULAR_EXPRESSION);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonRegularExpression");
        return (BsonRegularExpression) this;
    }

    public final BsonJavaScript asJavaScript() {
        throwIfInvalidType(BsonType.JAVASCRIPT);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonJavaScript");
        return (BsonJavaScript) this;
    }

    public final BsonJavaScriptWithScope asJavaScriptWithScope() {
        throwIfInvalidType(BsonType.JAVASCRIPT_WITH_SCOPE);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonJavaScriptWithScope");
        return (BsonJavaScriptWithScope) this;
    }

    public final BsonNull asBsonNull() {
        throwIfInvalidType(BsonType.NULL);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonNull");
        return (BsonNull) this;
    }

    public final BsonMinKey asBsonMinKey() {
        throwIfInvalidType(BsonType.MIN_KEY);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonMinKey");
        return (BsonMinKey) this;
    }

    public final BsonMaxKey asBsonMaxKey() {
        throwIfInvalidType(BsonType.MAX_KEY);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonMaxKey");
        return (BsonMaxKey) this;
    }

    public final BsonUndefined asBsonUndefined() {
        throwIfInvalidType(BsonType.UNDEFINED);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.mongodb.kbson.BsonUndefined");
        return (BsonUndefined) this;
    }

    public final String toJson() {
        return Bson.INSTANCE.toJson(this);
    }

    private final void throwIfInvalidType(BsonType expectedType) {
        if (getBsonType() != expectedType) {
            throw new BsonInvalidOperationException("Value expected to be of type " + expectedType + " is of unexpected type " + getBsonType(), null, 2, null);
        }
    }
}
