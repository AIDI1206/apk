package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.internal.interop.PropertyType;
import io.realm.kotlin.schema.RealmStorageType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmStorageTypeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/schema/RealmStorageTypeImpl;", "", "<init>", "()V", "fromCorePropertyType", "Lio/realm/kotlin/schema/RealmStorageType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/internal/interop/PropertyType;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmStorageTypeImpl {
    public static final RealmStorageTypeImpl INSTANCE = new RealmStorageTypeImpl();

    /* JADX INFO: compiled from: RealmStorageTypeImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PropertyType.values().length];
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_MIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_TIMESTAMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_LINKING_OBJECTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_DECIMAL128.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PropertyType.RLM_PROPERTY_TYPE_UUID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RealmStorageTypeImpl() {
    }

    public final RealmStorageType fromCorePropertyType(PropertyType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return RealmStorageType.INT;
            case 2:
                return RealmStorageType.BOOL;
            case 3:
                return RealmStorageType.STRING;
            case 4:
                return RealmStorageType.BINARY;
            case 5:
                return RealmStorageType.ANY;
            case 6:
                return RealmStorageType.TIMESTAMP;
            case 7:
                return RealmStorageType.FLOAT;
            case 8:
                return RealmStorageType.DOUBLE;
            case 9:
                return RealmStorageType.OBJECT;
            case 10:
                return RealmStorageType.OBJECT;
            case 11:
                return RealmStorageType.DECIMAL128;
            case 12:
                return RealmStorageType.OBJECT_ID;
            case 13:
                return RealmStorageType.UUID;
            default:
                throw new IllegalStateException(("Unknown storage type: " + type).toString());
        }
    }
}
