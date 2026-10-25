package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.mongodb.kbson.BsonDecimal128;

/* JADX INFO: compiled from: RealmValueAllocator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\\\u0010\u0018\u001a\u00020\b\"\u0004\b\u0000\u0010\u00192\b\u0010\t\u001a\u0004\u0018\u0001H\u00192\u0006\u0010\u001a\u001a\u00020\u001b22\b\u0002\u0010\u001c\u001a,\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\u0013\u0012\u0011H\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00170\u001d¢\u0006\u0002\b\"H\u0082\b¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bH\u0096\u0001J\u0012\u0010(\u001a\u00060\u001ej\u0002`\u001fH\u0096\u0001¢\u0006\u0002\u0010)J\u001a\u0010*\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010+H\u0096\u0001¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0018\u00010/j\u0004\u0018\u0001`0H\u0096\u0001¢\u0006\u0004\b1\u00102J\u001a\u0010.\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u000103H\u0096\u0001¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u000107H\u0096\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010;H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010?H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\bC\u0010)J\u001a\u0010D\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\bE\u0010\u0010J\u001a\u0010F\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010J\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u001a\u0010N\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\bO\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lio/realm/kotlin/internal/interop/JvmMemTrackingAllocator;", "Lio/realm/kotlin/internal/interop/MemAllocator;", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "<init>", "()V", "scope", "Lio/realm/kotlin/internal/interop/JvmMemTrackingAllocator$MemScope;", "stringTransport", "Lio/realm/kotlin/internal/interop/RealmValue;", "value", "", "stringTransport-ajuLxiE", "(Ljava/lang/String;)Lio/realm/kotlin/internal/interop/realm_value_t;", "byteArrayTransport", "", "byteArrayTransport-ajuLxiE", "([B)Lio/realm/kotlin/internal/interop/realm_value_t;", "queryArgsOf", "Lio/realm/kotlin/internal/interop/RealmQueryArgumentList;", "queryArgs", "", "Lio/realm/kotlin/internal/interop/RealmQueryArgument;", "free", "", "createTransport", ExifInterface.GPS_DIRECTION_TRUE, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "block", "Lkotlin/Function2;", "Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/RealmValueT;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "createTransport--A2YVJI", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function2;)Lio/realm/kotlin/internal/interop/realm_value_t;", "allocRealmValueList", "Lio/realm/kotlin/internal/interop/RealmValueList;", "count", "allocRealmValueT", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "booleanTransport", "", "booleanTransport-ajuLxiE", "(Ljava/lang/Boolean;)Lio/realm/kotlin/internal/interop/realm_value_t;", "decimal128Transport", "Lorg/mongodb/kbson/BsonDecimal128;", "Lorg/mongodb/kbson/Decimal128;", "decimal128Transport-ajuLxiE", "(Lorg/mongodb/kbson/BsonDecimal128;)Lio/realm/kotlin/internal/interop/realm_value_t;", "Lkotlin/ULongArray;", "decimal128Transport-M6lP4FA", "([J)Lio/realm/kotlin/internal/interop/realm_value_t;", "doubleTransport", "", "doubleTransport-ajuLxiE", "(Ljava/lang/Double;)Lio/realm/kotlin/internal/interop/realm_value_t;", "floatTransport", "", "floatTransport-ajuLxiE", "(Ljava/lang/Float;)Lio/realm/kotlin/internal/interop/realm_value_t;", "longTransport", "", "longTransport-ajuLxiE", "(Ljava/lang/Long;)Lio/realm/kotlin/internal/interop/realm_value_t;", "nullTransport", "nullTransport-uWG8uMY", "objectIdTransport", "objectIdTransport-ajuLxiE", "realmObjectTransport", "Lio/realm/kotlin/internal/interop/RealmObjectInterop;", "realmObjectTransport-ajuLxiE", "(Lio/realm/kotlin/internal/interop/RealmObjectInterop;)Lio/realm/kotlin/internal/interop/realm_value_t;", "timestampTransport", "Lio/realm/kotlin/internal/interop/Timestamp;", "timestampTransport-ajuLxiE", "(Lio/realm/kotlin/internal/interop/Timestamp;)Lio/realm/kotlin/internal/interop/realm_value_t;", "uuidTransport", "uuidTransport-ajuLxiE", "MemScope", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class JvmMemTrackingAllocator implements MemAllocator, MemTrackingAllocator {
    private final /* synthetic */ JvmMemAllocator $$delegate_0 = JvmMemAllocator.INSTANCE;
    private final MemScope scope = new MemScope();

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: booleanTransport-ajuLxiE */
    public realm_value_t mo11359booleanTransportajuLxiE(Boolean value) {
        return this.$$delegate_0.mo11359booleanTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: decimal128Transport-M6lP4FA */
    public realm_value_t mo11360decimal128TransportM6lP4FA(long[] value) {
        return this.$$delegate_0.mo11360decimal128TransportM6lP4FA(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: decimal128Transport-ajuLxiE */
    public realm_value_t mo11361decimal128TransportajuLxiE(BsonDecimal128 value) {
        return this.$$delegate_0.mo11361decimal128TransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: doubleTransport-ajuLxiE */
    public realm_value_t mo11362doubleTransportajuLxiE(Double value) {
        return this.$$delegate_0.mo11362doubleTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: floatTransport-ajuLxiE */
    public realm_value_t mo11363floatTransportajuLxiE(Float value) {
        return this.$$delegate_0.mo11363floatTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: longTransport-ajuLxiE */
    public realm_value_t mo11364longTransportajuLxiE(Long value) {
        return this.$$delegate_0.mo11364longTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: nullTransport-uWG8uMY */
    public realm_value_t mo11365nullTransportuWG8uMY() {
        return this.$$delegate_0.mo11365nullTransportuWG8uMY();
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: objectIdTransport-ajuLxiE */
    public realm_value_t mo11366objectIdTransportajuLxiE(byte[] value) {
        return this.$$delegate_0.mo11366objectIdTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: realmObjectTransport-ajuLxiE */
    public realm_value_t mo11367realmObjectTransportajuLxiE(RealmObjectInterop value) {
        return this.$$delegate_0.mo11367realmObjectTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: timestampTransport-ajuLxiE */
    public realm_value_t mo11368timestampTransportajuLxiE(Timestamp value) {
        return this.$$delegate_0.mo11368timestampTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    /* JADX INFO: renamed from: uuidTransport-ajuLxiE */
    public realm_value_t mo11369uuidTransportajuLxiE(byte[] value) {
        return this.$$delegate_0.mo11369uuidTransportajuLxiE(value);
    }

    @Override // io.realm.kotlin.internal.interop.MemTrackingAllocator
    public RealmQueryArgumentList queryArgsOf(List<? extends RealmQueryArgument> queryArgs) {
        Intrinsics.checkNotNullParameter(queryArgs, "queryArgs");
        realm_query_arg_t realm_query_arg_tVarNew_queryArgArray = realmc.new_queryArgArray(queryArgs.size());
        List<? extends RealmQueryArgument> list = queryArgs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RealmQueryArgument realmQueryArgument = (RealmQueryArgument) obj;
            realm_query_arg_t realm_query_arg_tVar = new realm_query_arg_t();
            if (realmQueryArgument instanceof RealmQueryListArgument) {
                RealmQueryListArgument realmQueryListArgument = (RealmQueryListArgument) realmQueryArgument;
                realm_query_arg_tVar.setNb_args(realmQueryListArgument.getArguments().getSize());
                realm_query_arg_tVar.setIs_list(true);
                realm_query_arg_tVar.setArg(realmQueryListArgument.getArguments().getHead());
                this.scope.manageQueryListArgument(realmQueryListArgument);
            } else {
                if (!(realmQueryArgument instanceof RealmQuerySingleArgument)) {
                    throw new NoWhenBranchMatchedException();
                }
                realm_query_arg_tVar.setNb_args(1L);
                realm_query_arg_tVar.setIs_list(false);
                realm_query_arg_tVar.setArg(((RealmQuerySingleArgument) realmQueryArgument).getArgument());
            }
            realmc.queryArgArray_setitem(realm_query_arg_tVarNew_queryArgArray, i, realm_query_arg_tVar);
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        long size = queryArgs.size();
        Intrinsics.checkNotNull(realm_query_arg_tVarNew_queryArgArray);
        RealmQueryArgumentList realmQueryArgumentList = new RealmQueryArgumentList(size, realm_query_arg_tVarNew_queryArgArray);
        this.scope.manageQueryArgumentList(realmQueryArgumentList);
        return realmQueryArgumentList;
    }

    @Override // io.realm.kotlin.internal.interop.MemTrackingAllocator
    public void free() {
        this.scope.free();
    }

    /* JADX INFO: renamed from: createTransport--A2YVJI$default, reason: not valid java name */
    static /* synthetic */ realm_value_t m11371createTransportA2YVJI$default(JvmMemTrackingAllocator jvmMemTrackingAllocator, Object obj, int i, Function2 function2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            function2 = new Function2<realm_value_t, T, Unit>() { // from class: io.realm.kotlin.internal.interop.JvmMemTrackingAllocator$createTransport$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(realm_value_t realm_value_tVar, T t) {
                    Intrinsics.checkNotNullParameter(realm_value_tVar, "<this>");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(realm_value_t realm_value_tVar, Object obj3) {
                    invoke2(realm_value_tVar, obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        realm_value_t realm_value_tVarAllocRealmValueT = jvmMemTrackingAllocator.allocRealmValueT();
        if (obj == null) {
            i = 0;
        }
        realm_value_tVarAllocRealmValueT.setType(i);
        if (obj != null) {
            function2.invoke(realm_value_tVarAllocRealmValueT, obj);
        }
        jvmMemTrackingAllocator.scope.manageRealmValue(realm_value_tVarAllocRealmValueT);
        return RealmValue.m11450constructorimpl(realm_value_tVarAllocRealmValueT);
    }

    /* JADX INFO: renamed from: createTransport--A2YVJI, reason: not valid java name */
    private final <T> realm_value_t m11370createTransportA2YVJI(T value, int type, Function2<? super realm_value_t, ? super T, Unit> block) {
        realm_value_t realm_value_tVarAllocRealmValueT = allocRealmValueT();
        if (value == null) {
            type = 0;
        }
        realm_value_tVarAllocRealmValueT.setType(type);
        if (value != null) {
            block.invoke(realm_value_tVarAllocRealmValueT, value);
        }
        this.scope.manageRealmValue(realm_value_tVarAllocRealmValueT);
        return RealmValue.m11450constructorimpl(realm_value_tVarAllocRealmValueT);
    }

    /* JADX INFO: compiled from: RealmValueAllocator.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00060\tj\u0002`\n2\n\u0010\u000b\u001a\u00060\tj\u0002`\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/realm/kotlin/internal/interop/JvmMemTrackingAllocator$MemScope;", "", "<init>", "()V", "values", "", "getValues", "()Ljava/util/Set;", "manageRealmValue", "Lio/realm/kotlin/internal/interop/realm_value_t;", "Lio/realm/kotlin/internal/interop/RealmValueT;", "value", "manageQueryArgumentList", "Lio/realm/kotlin/internal/interop/RealmQueryArgumentList;", "manageQueryListArgument", "Lio/realm/kotlin/internal/interop/RealmQueryListArgument;", "free", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MemScope {
        private final Set<Object> values = new LinkedHashSet();

        public final Set<Object> getValues() {
            return this.values;
        }

        public final realm_value_t manageRealmValue(realm_value_t value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.add(value);
            return value;
        }

        public final RealmQueryArgumentList manageQueryArgumentList(RealmQueryArgumentList value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.add(value);
            return value;
        }

        public final RealmQueryListArgument manageQueryListArgument(RealmQueryListArgument value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.values.add(value);
            return value;
        }

        public final void free() {
            for (Object obj : this.values) {
                if (obj instanceof realm_value_t) {
                    realmc.realm_value_t_cleanup((realm_value_t) obj);
                } else if (obj instanceof RealmQueryArgumentList) {
                    realmc.delete_queryArgArray(((RealmQueryArgumentList) obj).getHead());
                } else if (obj instanceof RealmQueryListArgument) {
                    realmc.delete_valueArray(((RealmQueryListArgument) obj).getArguments().getHead());
                }
            }
        }
    }

    @Override // io.realm.kotlin.internal.interop.MemTrackingAllocator
    /* JADX INFO: renamed from: stringTransport-ajuLxiE, reason: not valid java name */
    public realm_value_t mo11373stringTransportajuLxiE(String value) {
        realm_value_t realm_value_tVarAllocRealmValueT = allocRealmValueT();
        realm_value_tVarAllocRealmValueT.setType(value == null ? 0 : 3);
        if (value != null) {
            realm_value_tVarAllocRealmValueT.setString(value);
        }
        this.scope.manageRealmValue(realm_value_tVarAllocRealmValueT);
        return RealmValue.m11450constructorimpl(realm_value_tVarAllocRealmValueT);
    }

    @Override // io.realm.kotlin.internal.interop.MemTrackingAllocator
    /* JADX INFO: renamed from: byteArrayTransport-ajuLxiE, reason: not valid java name */
    public realm_value_t mo11372byteArrayTransportajuLxiE(byte[] value) {
        realm_value_t realm_value_tVarAllocRealmValueT = allocRealmValueT();
        realm_value_tVarAllocRealmValueT.setType(value == null ? 0 : 4);
        if (value != null) {
            realm_binary_t realm_binary_tVar = new realm_binary_t();
            realm_binary_tVar.setData(value);
            realm_binary_tVar.setSize(value.length);
            realm_value_tVarAllocRealmValueT.setBinary(realm_binary_tVar);
        }
        this.scope.manageRealmValue(realm_value_tVarAllocRealmValueT);
        return RealmValue.m11450constructorimpl(realm_value_tVarAllocRealmValueT);
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    public realm_value_t allocRealmValueT() {
        return new realm_value_t();
    }

    @Override // io.realm.kotlin.internal.interop.MemAllocator
    public RealmValueList allocRealmValueList(int count) {
        realm_value_t realm_value_tVarNew_valueArray = realmc.new_valueArray(count);
        Intrinsics.checkNotNullExpressionValue(realm_value_tVarNew_valueArray, "new_valueArray(...)");
        return new RealmValueList(count, realm_value_tVarNew_valueArray);
    }
}
