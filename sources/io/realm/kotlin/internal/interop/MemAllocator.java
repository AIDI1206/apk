package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.mongodb.kbson.BsonDecimal128;

/* JADX INFO: compiled from: MemAllocator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u000f\u0010\n\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\u0005J\u0019\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H&¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b,\u0010*J\u0019\u0010\"\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010-H&¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u000101H&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lio/realm/kotlin/internal/interop/MemAllocator;", "", "allocRealmValueT", "Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/RealmValueT;", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "allocRealmValueList", "Lio/realm/kotlin/internal/interop/RealmValueList;", "count", "", "nullTransport", "Lio/realm/kotlin/internal/interop/RealmValue;", "nullTransport-uWG8uMY", "longTransport", "value", "", "longTransport-ajuLxiE", "(Ljava/lang/Long;)Lio/realm/kotlin/internal/interop/realm_value_t;", "booleanTransport", "", "booleanTransport-ajuLxiE", "(Ljava/lang/Boolean;)Lio/realm/kotlin/internal/interop/realm_value_t;", "timestampTransport", "Lio/realm/kotlin/internal/interop/Timestamp;", "timestampTransport-ajuLxiE", "(Lio/realm/kotlin/internal/interop/Timestamp;)Lio/realm/kotlin/internal/interop/realm_value_t;", "floatTransport", "", "floatTransport-ajuLxiE", "(Ljava/lang/Float;)Lio/realm/kotlin/internal/interop/realm_value_t;", "doubleTransport", "", "doubleTransport-ajuLxiE", "(Ljava/lang/Double;)Lio/realm/kotlin/internal/interop/realm_value_t;", "decimal128Transport", "Lorg/mongodb/kbson/BsonDecimal128;", "Lorg/mongodb/kbson/Decimal128;", "decimal128Transport-ajuLxiE", "(Lorg/mongodb/kbson/BsonDecimal128;)Lio/realm/kotlin/internal/interop/realm_value_t;", "objectIdTransport", "", "objectIdTransport-ajuLxiE", "([B)Lio/realm/kotlin/internal/interop/realm_value_t;", "uuidTransport", "uuidTransport-ajuLxiE", "Lkotlin/ULongArray;", "decimal128Transport-M6lP4FA", "([J)Lio/realm/kotlin/internal/interop/realm_value_t;", "realmObjectTransport", "Lio/realm/kotlin/internal/interop/RealmObjectInterop;", "realmObjectTransport-ajuLxiE", "(Lio/realm/kotlin/internal/interop/RealmObjectInterop;)Lio/realm/kotlin/internal/interop/realm_value_t;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MemAllocator {
    RealmValueList allocRealmValueList(int count);

    realm_value_t allocRealmValueT();

    /* JADX INFO: renamed from: booleanTransport-ajuLxiE */
    realm_value_t mo11359booleanTransportajuLxiE(Boolean value);

    /* JADX INFO: renamed from: decimal128Transport-M6lP4FA */
    realm_value_t mo11360decimal128TransportM6lP4FA(long[] value);

    /* JADX INFO: renamed from: decimal128Transport-ajuLxiE */
    realm_value_t mo11361decimal128TransportajuLxiE(BsonDecimal128 value);

    /* JADX INFO: renamed from: doubleTransport-ajuLxiE */
    realm_value_t mo11362doubleTransportajuLxiE(Double value);

    /* JADX INFO: renamed from: floatTransport-ajuLxiE */
    realm_value_t mo11363floatTransportajuLxiE(Float value);

    /* JADX INFO: renamed from: longTransport-ajuLxiE */
    realm_value_t mo11364longTransportajuLxiE(Long value);

    /* JADX INFO: renamed from: nullTransport-uWG8uMY */
    realm_value_t mo11365nullTransportuWG8uMY();

    /* JADX INFO: renamed from: objectIdTransport-ajuLxiE */
    realm_value_t mo11366objectIdTransportajuLxiE(byte[] value);

    /* JADX INFO: renamed from: realmObjectTransport-ajuLxiE */
    realm_value_t mo11367realmObjectTransportajuLxiE(RealmObjectInterop value);

    /* JADX INFO: renamed from: timestampTransport-ajuLxiE */
    realm_value_t mo11368timestampTransportajuLxiE(Timestamp value);

    /* JADX INFO: renamed from: uuidTransport-ajuLxiE */
    realm_value_t mo11369uuidTransportajuLxiE(byte[] value);
}
