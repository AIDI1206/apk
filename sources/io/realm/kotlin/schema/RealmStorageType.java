package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.BaseRealmObject;
import io.realm.kotlin.types.RealmAny;
import io.realm.kotlin.types.RealmInstant;
import io.realm.kotlin.types.RealmUUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.mongodb.kbson.BsonDecimal128;
import org.mongodb.kbson.BsonObjectId;

/* JADX INFO: compiled from: RealmStorageType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/schema/RealmStorageType;", "", "kClass", "Lkotlin/reflect/KClass;", "<init>", "(Ljava/lang/String;ILkotlin/reflect/KClass;)V", "getKClass", "()Lkotlin/reflect/KClass;", "BOOL", "INT", "STRING", "BINARY", "OBJECT", "FLOAT", "DOUBLE", "DECIMAL128", "TIMESTAMP", "OBJECT_ID", "UUID", "ANY", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum RealmStorageType {
    BOOL(Reflection.getOrCreateKotlinClass(Boolean.TYPE)),
    INT(Reflection.getOrCreateKotlinClass(Long.TYPE)),
    STRING(Reflection.getOrCreateKotlinClass(String.class)),
    BINARY(Reflection.getOrCreateKotlinClass(byte[].class)),
    OBJECT(Reflection.getOrCreateKotlinClass(BaseRealmObject.class)),
    FLOAT(Reflection.getOrCreateKotlinClass(Float.TYPE)),
    DOUBLE(Reflection.getOrCreateKotlinClass(Double.TYPE)),
    DECIMAL128(Reflection.getOrCreateKotlinClass(BsonDecimal128.class)),
    TIMESTAMP(Reflection.getOrCreateKotlinClass(RealmInstant.class)),
    OBJECT_ID(Reflection.getOrCreateKotlinClass(BsonObjectId.class)),
    UUID(Reflection.getOrCreateKotlinClass(RealmUUID.class)),
    ANY(Reflection.getOrCreateKotlinClass(RealmAny.class));

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final KClass<?> kClass;

    public static EnumEntries<RealmStorageType> getEntries() {
        return $ENTRIES;
    }

    RealmStorageType(KClass kClass) {
        this.kClass = kClass;
    }

    public final KClass<?> getKClass() {
        return this.kClass;
    }
}
