package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULongArray;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aH\u0086\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001eH\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\"H\u0086\b¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020&H\u0086\b¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u001aH\u0086\b¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u001aH\u0086\b¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010-\u001a\u00020.H\u0086\b¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u000202H\u0086\b¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b6\u0010\u0014J\u000f\u00107\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u0010\u0018J\u0013\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006="}, d2 = {"Lio/realm/kotlin/internal/interop/RealmValue;", "", "value", "Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/RealmValueT;", "constructor-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Lio/realm/kotlin/internal/interop/realm_value_t;", "getValue", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "getType", "Lio/realm/kotlin/internal/interop/ValueType;", "getType-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Lio/realm/kotlin/internal/interop/ValueType;", "getLong", "", "getLong-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)J", "getBoolean", "", "getBoolean-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Z", "getString", "", "getString-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/String;", "getByteArray", "", "getByteArray-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)[B", "getTimestamp", "Lio/realm/kotlin/internal/interop/Timestamp;", "getTimestamp-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Lio/realm/kotlin/internal/interop/Timestamp;", "getFloat", "", "getFloat-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)F", "getDouble", "", "getDouble-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)D", "getObjectIdBytes", "getObjectIdBytes-impl", "getUUIDBytes", "getUUIDBytes-impl", "getDecimal128Array", "Lkotlin/ULongArray;", "getDecimal128Array-Y2RjT0g", "(Lio/realm/kotlin/internal/interop/realm_value_t;)[J", "getLink", "Lio/realm/kotlin/internal/interop/Link;", "getLink-impl", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Lio/realm/kotlin/internal/interop/Link;", "isNull", "isNull-impl", "toString", "toString-impl", "equals", "other", "hashCode", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
public final class RealmValue {
    private final realm_value_t value;

    /* JADX INFO: compiled from: RealmValue.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.RLM_TYPE_NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.RLM_TYPE_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.RLM_TYPE_BOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValueType.RLM_TYPE_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValueType.RLM_TYPE_BINARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValueType.RLM_TYPE_TIMESTAMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValueType.RLM_TYPE_FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValueType.RLM_TYPE_DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ValueType.RLM_TYPE_DECIMAL128.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ValueType.RLM_TYPE_OBJECT_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ValueType.RLM_TYPE_LINK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ValueType.RLM_TYPE_UUID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RealmValue m11449boximpl(realm_value_t realm_value_tVar) {
        return new RealmValue(realm_value_tVar);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static realm_value_t m11450constructorimpl(realm_value_t value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m11451equalsimpl(realm_value_t realm_value_tVar, Object obj) {
        return (obj instanceof RealmValue) && Intrinsics.areEqual(realm_value_tVar, ((RealmValue) obj).m11468unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11452equalsimpl0(realm_value_t realm_value_tVar, realm_value_t realm_value_tVar2) {
        return Intrinsics.areEqual(realm_value_tVar, realm_value_tVar2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m11465hashCodeimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.hashCode();
    }

    public boolean equals(Object other) {
        return m11451equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m11465hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ realm_value_t m11468unboximpl() {
        return this.value;
    }

    private /* synthetic */ RealmValue(realm_value_t realm_value_tVar) {
        this.value = realm_value_tVar;
    }

    public final realm_value_t getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: getType-impl, reason: not valid java name */
    public static final ValueType m11463getTypeimpl(realm_value_t realm_value_tVar) {
        return ValueType.INSTANCE.from(realm_value_tVar.getType());
    }

    /* JADX INFO: renamed from: getLong-impl, reason: not valid java name */
    public static final long m11459getLongimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.getInteger();
    }

    /* JADX INFO: renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m11453getBooleanimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.get_boolean();
    }

    /* JADX INFO: renamed from: getString-impl, reason: not valid java name */
    public static final String m11461getStringimpl(realm_value_t realm_value_tVar) {
        String string = realm_value_tVar.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: getByteArray-impl, reason: not valid java name */
    public static final byte[] m11454getByteArrayimpl(realm_value_t realm_value_tVar) {
        byte[] data = realm_value_tVar.getBinary().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return data;
    }

    /* JADX INFO: renamed from: getTimestamp-impl, reason: not valid java name */
    public static final Timestamp m11462getTimestampimpl(realm_value_t realm_value_tVar) {
        return RealmInteropKt.asTimestamp(realm_value_tVar);
    }

    /* JADX INFO: renamed from: getFloat-impl, reason: not valid java name */
    public static final float m11457getFloatimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.getFnum();
    }

    /* JADX INFO: renamed from: getDouble-impl, reason: not valid java name */
    public static final double m11456getDoubleimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.getDnum();
    }

    /* JADX INFO: renamed from: getObjectIdBytes-impl, reason: not valid java name */
    public static final byte[] m11460getObjectIdBytesimpl(realm_value_t realm_value_tVar) {
        byte[] bArr = new byte[12];
        short[] bytes = realm_value_tVar.getObject_id().getBytes();
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ArrayList arrayList = new ArrayList(bytes.length);
        int length = bytes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) bytes[i];
            arrayList.add(Unit.INSTANCE);
            i++;
            i2++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: getUUIDBytes-impl, reason: not valid java name */
    public static final byte[] m11464getUUIDBytesimpl(realm_value_t realm_value_tVar) {
        byte[] bArr = new byte[16];
        short[] bytes = realm_value_tVar.getUuid().getBytes();
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ArrayList arrayList = new ArrayList(bytes.length);
        int length = bytes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) bytes[i];
            arrayList.add(Unit.INSTANCE);
            i++;
            i2++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: getDecimal128Array-Y2RjT0g, reason: not valid java name */
    public static final long[] m11455getDecimal128ArrayY2RjT0g(realm_value_t realm_value_tVar) {
        long[] w = realm_value_tVar.getDecimal128().getW();
        Intrinsics.checkNotNullExpressionValue(w, "getW(...)");
        long[] jArrCopyOf = Arrays.copyOf(w, w.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m11728constructorimpl(jArrCopyOf);
    }

    /* JADX INFO: renamed from: getLink-impl, reason: not valid java name */
    public static final Link m11458getLinkimpl(realm_value_t realm_value_tVar) {
        return RealmInteropKt.asLink(realm_value_tVar);
    }

    /* JADX INFO: renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m11466isNullimpl(realm_value_t realm_value_tVar) {
        return realm_value_tVar.getType() == ValueType.RLM_TYPE_NULL.getNativeValue();
    }

    public String toString() {
        return m11467toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m11467toStringimpl(realm_value_t realm_value_tVar) {
        Object objValueOf;
        int i = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[ValueType.INSTANCE.from(realm_value_tVar.getType()).ordinal()]) {
            case 1:
                objValueOf = "null";
                break;
            case 2:
                objValueOf = Long.valueOf(realm_value_tVar.getInteger());
                break;
            case 3:
                objValueOf = Boolean.valueOf(realm_value_tVar.get_boolean());
                break;
            case 4:
                objValueOf = realm_value_tVar.getString();
                Intrinsics.checkNotNullExpressionValue(objValueOf, "getString(...)");
                break;
            case 5:
                byte[] data = realm_value_tVar.getBinary().getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                objValueOf = data.toString();
                break;
            case 6:
                objValueOf = RealmInteropKt.asTimestamp(realm_value_tVar).toString();
                break;
            case 7:
                objValueOf = Float.valueOf(realm_value_tVar.getFnum());
                break;
            case 8:
                objValueOf = Double.valueOf(realm_value_tVar.getDnum());
                break;
            case 9:
                long[] w = realm_value_tVar.getDecimal128().getW();
                Intrinsics.checkNotNullExpressionValue(w, "getW(...)");
                long[] jArrCopyOf = Arrays.copyOf(w, w.length);
                Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                objValueOf = ULongArray.m11739toStringimpl(ULongArray.m11728constructorimpl(jArrCopyOf));
                break;
            case 10:
                byte[] bArr = new byte[12];
                short[] bytes = realm_value_tVar.getObject_id().getBytes();
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                ArrayList arrayList = new ArrayList(bytes.length);
                int length = bytes.length;
                int i2 = 0;
                while (i < length) {
                    bArr[i2] = (byte) bytes[i];
                    arrayList.add(Unit.INSTANCE);
                    i++;
                    i2++;
                }
                objValueOf = bArr.toString();
                break;
            case 11:
                objValueOf = RealmInteropKt.asLink(realm_value_tVar).toString();
                break;
            case 12:
                byte[] bArr2 = new byte[16];
                short[] bytes2 = realm_value_tVar.getUuid().getBytes();
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                ArrayList arrayList2 = new ArrayList(bytes2.length);
                int length2 = bytes2.length;
                int i3 = 0;
                while (i < length2) {
                    bArr2[i3] = (byte) bytes2[i];
                    arrayList2.add(Unit.INSTANCE);
                    i++;
                    i3++;
                }
                objValueOf = bArr2.toString();
                break;
            default:
                objValueOf = "RealmValueTransport{type: UNKNOWN, value: UNKNOWN}";
                break;
        }
        return "RealmValueTransport{type: " + ValueType.INSTANCE.from(realm_value_tVar.getType()) + ", value: " + objValueOf + AbstractJsonLexerKt.END_OBJ;
    }
}
