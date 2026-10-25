package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.mongodb.kbson.BsonObjectId;

/* JADX INFO: compiled from: RealmInterop.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u000e\u001a\u000e\u0010\u0011\u001a\u00020\u0012*\u00060\u0013j\u0002`\u0014\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"INVALID_CLASS_KEY", "Lio/realm/kotlin/internal/interop/ClassKey;", "getINVALID_CLASS_KEY", "()J", "INVALID_CLASS_KEY$delegate", "Lkotlin/Lazy;", "INVALID_PROPERTY_KEY", "Lio/realm/kotlin/internal/interop/PropertyKey;", "getINVALID_PROPERTY_KEY", "INVALID_PROPERTY_KEY$delegate", "NULL_POINTER_VALUE", "", "asTimestamp", "Lio/realm/kotlin/internal/interop/Timestamp;", "Lio/realm/kotlin/internal/interop/realm_value_t;", "asLink", "Lio/realm/kotlin/internal/interop/Link;", "asRealmObjectIdT", "Lio/realm/kotlin/internal/interop/realm_object_id_t;", "Lorg/mongodb/kbson/BsonObjectId;", "Lorg/mongodb/kbson/ObjectId;", "cinterop_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmInteropKt {
    private static final Lazy INVALID_CLASS_KEY$delegate = LazyKt.lazy(new Function0() { // from class: io.realm.kotlin.internal.interop.RealmInteropKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RealmInteropKt.INVALID_CLASS_KEY_delegate$lambda$0();
        }
    });
    private static final Lazy INVALID_PROPERTY_KEY$delegate = LazyKt.lazy(new Function0() { // from class: io.realm.kotlin.internal.interop.RealmInteropKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RealmInteropKt.INVALID_PROPERTY_KEY_delegate$lambda$1();
        }
    });
    public static final long NULL_POINTER_VALUE = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassKey INVALID_CLASS_KEY_delegate$lambda$0() {
        return ClassKey.m11350boximpl(ClassKey.m11351constructorimpl(realmc.getRLM_INVALID_CLASS_KEY()));
    }

    public static final long getINVALID_CLASS_KEY() {
        return ((ClassKey) INVALID_CLASS_KEY$delegate.getValue()).m11356unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyKey INVALID_PROPERTY_KEY_delegate$lambda$1() {
        return PropertyKey.m11387boximpl(PropertyKey.m11388constructorimpl(realmc.getRLM_INVALID_PROPERTY_KEY()));
    }

    public static final long getINVALID_PROPERTY_KEY() {
        return ((PropertyKey) INVALID_PROPERTY_KEY$delegate.getValue()).m11393unboximpl();
    }

    public static final Timestamp asTimestamp(realm_value_t realm_value_tVar) {
        Intrinsics.checkNotNullParameter(realm_value_tVar, "<this>");
        if (realm_value_tVar.getType() != 5) {
            throw new IllegalStateException(("Value is not of type Timestamp: " + realm_value_tVar + ".type").toString());
        }
        return new TimestampImpl(realm_value_tVar.getTimestamp().getSeconds(), realm_value_tVar.getTimestamp().getNanoseconds());
    }

    public static final Link asLink(realm_value_t realm_value_tVar) {
        Intrinsics.checkNotNullParameter(realm_value_tVar, "<this>");
        if (realm_value_tVar.getType() != 10) {
            throw new IllegalStateException(("Value is not of type link: " + realm_value_tVar + ".type").toString());
        }
        return new Link(ClassKey.m11351constructorimpl(realm_value_tVar.getLink().getTarget_table()), realm_value_tVar.getLink().getTarget(), null);
    }

    public static final realm_object_id_t asRealmObjectIdT(BsonObjectId bsonObjectId) {
        Intrinsics.checkNotNullParameter(bsonObjectId, "<this>");
        realm_object_id_t realm_object_id_tVar = new realm_object_id_t();
        short[] sArr = new short[12];
        byte[] byteArray = bsonObjectId.toByteArray();
        IntRange intRangeUntil = RangesKt.until(0, 12);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            sArr[iNextInt] = byteArray[iNextInt];
            arrayList.add(Unit.INSTANCE);
        }
        realm_object_id_tVar.setBytes(sArr);
        return realm_object_id_tVar;
    }
}
