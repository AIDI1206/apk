package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.RealmUUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mongodb.kbson.BsonBinary;
import org.mongodb.kbson.BsonBinarySubType;

/* JADX INFO: compiled from: RealmUUIDImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0086\b¨\u0006\u0004"}, d2 = {"asBsonBinary", "Lorg/mongodb/kbson/BsonBinary;", "Lio/realm/kotlin/types/RealmUUID;", "asRealmUUID", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmUUIDImplKt {
    public static final BsonBinary asBsonBinary(RealmUUID realmUUID) {
        Intrinsics.checkNotNullParameter(realmUUID, "<this>");
        return new BsonBinary(BsonBinarySubType.UUID_STANDARD, realmUUID.getBytes());
    }

    public static final RealmUUID asRealmUUID(BsonBinary bsonBinary) {
        Intrinsics.checkNotNullParameter(bsonBinary, "<this>");
        return RealmUUID.INSTANCE.from(bsonBinary.getData());
    }
}
