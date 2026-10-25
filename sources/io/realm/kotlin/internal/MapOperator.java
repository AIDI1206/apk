package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.UpdatePolicy;
import io.realm.kotlin.internal.interop.JvmMemAllocator;
import io.realm.kotlin.internal.interop.JvmMemTrackingAllocator;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmInterop;
import io.realm.kotlin.internal.interop.RealmMapT;
import io.realm.kotlin.internal.interop.RealmResultsT;
import io.realm.kotlin.types.BaseRealmObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmMapInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003JQ\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` H&¢\u0006\u0002\u0010!J#\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010%\u001a\u00020\bH&J\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0001H&¢\u0006\u0002\u0010)J!\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00018\u00012\b\u0010,\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010-JQ\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` H\u0016¢\u0006\u0002\u0010!J#\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010%\u001a\u00020\bH\u0016J\u0017\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\u0015\u00102\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010)J)\u00103\u001a\u0004\u0018\u00018\u00012\u0010\u00104\u001a\f\u0012\u0004\u0012\u0002050\u0004j\u0002`62\u0006\u00107\u001a\u00020\bH&¢\u0006\u0002\u00108J'\u00109\u001a\u00028\u00002\u0010\u00104\u001a\f\u0012\u0004\u0012\u0002050\u0004j\u0002`62\u0006\u00107\u001a\u00020\bH\u0016¢\u0006\u0002\u00108JC\u0010:\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` H\u0016¢\u0006\u0002\u0010;JB\u0010<\u001a\u00020=2\u0014\u0010>\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` H\u0016J\u0017\u0010@\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\b\u0010A\u001a\u00020=H\u0016J\u0015\u0010B\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010)J.\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010D\u001a\u00020E2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H&R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\n¨\u0006F"}, d2 = {"Lio/realm/kotlin/internal/MapOperator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lio/realm/kotlin/internal/CollectionOperator;", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmMapT;", "Lio/realm/kotlin/internal/interop/RealmMapPointer;", "modCount", "", "getModCount", "()I", "setModCount", "(I)V", "keyConverter", "Lio/realm/kotlin/internal/RealmValueConverter;", "getKeyConverter", "()Lio/realm/kotlin/internal/RealmValueConverter;", "nativePointer", "getNativePointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", "size", "getSize", "insertInternal", "Lkotlin/Pair;", "", "key", "value", "updatePolicy", "Lio/realm/kotlin/UpdatePolicy;", "cache", "", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/internal/UnmanagedToManagedObjectCache;", "(Ljava/lang/Object;Ljava/lang/Object;Lio/realm/kotlin/UpdatePolicy;Ljava/util/Map;)Lkotlin/Pair;", "eraseInternal", "(Ljava/lang/Object;)Lkotlin/Pair;", "getEntryInternal", "position", "getInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "containsValueInternal", "(Ljava/lang/Object;)Z", "areValuesEqual", "expected", "actual", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "insert", "erase", "getEntry", "get", "containsValue", "getValue", "resultsPointer", "Lio/realm/kotlin/internal/interop/RealmResultsT;", "Lio/realm/kotlin/internal/interop/RealmResultsPointer;", "index", "(Lio/realm/kotlin/internal/interop/NativePointer;I)Ljava/lang/Object;", "getKey", "put", "(Ljava/lang/Object;Ljava/lang/Object;Lio/realm/kotlin/UpdatePolicy;Ljava/util/Map;)Ljava/lang/Object;", "putAll", "", "from", "", "remove", "clear", "containsKey", "copy", "realmReference", "Lio/realm/kotlin/internal/RealmReference;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MapOperator<K, V> extends CollectionOperator<V, NativePointer<RealmMapT>> {
    boolean areValuesEqual(V expected, V actual);

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    boolean containsValueInternal(V value);

    MapOperator<K, V> copy(RealmReference realmReference, NativePointer<RealmMapT> nativePointer);

    Pair<V, Boolean> erase(K key);

    Pair<V, Boolean> eraseInternal(K key);

    V get(K key);

    Pair<K, V> getEntry(int position);

    Pair<K, V> getEntryInternal(int position);

    V getInternal(K key);

    K getKey(NativePointer<RealmResultsT> resultsPointer, int index);

    RealmValueConverter<K> getKeyConverter();

    int getModCount();

    @Override // io.realm.kotlin.internal.CollectionOperator
    NativePointer<RealmMapT> getNativePointer();

    int getSize();

    V getValue(NativePointer<RealmResultsT> resultsPointer, int index);

    Pair<V, Boolean> insert(K key, V value, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache);

    Pair<V, Boolean> insertInternal(K key, V value, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache);

    V put(K key, V value, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache);

    void putAll(Map<? extends K, ? extends V> from, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache);

    V remove(K key);

    void setModCount(int i);

    /* JADX INFO: compiled from: RealmMapInternal.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static <K, V> int getSize(MapOperator<K, V> mapOperator) {
            mapOperator.getRealmReference().checkClosed();
            return (int) RealmInterop.INSTANCE.realm_dictionary_size(mapOperator.getNativePointer());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pair insertInternal$default(MapOperator mapOperator, Object obj, Object obj2, UpdatePolicy updatePolicy, Map map, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertInternal");
            }
            if ((i & 4) != 0) {
                updatePolicy = UpdatePolicy.ALL;
            }
            if ((i & 8) != 0) {
                map = new LinkedHashMap();
            }
            return mapOperator.insertInternal(obj, obj2, updatePolicy, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pair insert$default(MapOperator mapOperator, Object obj, Object obj2, UpdatePolicy updatePolicy, Map map, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insert");
            }
            if ((i & 4) != 0) {
                updatePolicy = UpdatePolicy.ALL;
            }
            if ((i & 8) != 0) {
                map = new LinkedHashMap();
            }
            return mapOperator.insert(obj, obj2, updatePolicy, map);
        }

        public static <K, V> Pair<V, Boolean> insert(MapOperator<K, V> mapOperator, K k, V v, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache) {
            Intrinsics.checkNotNullParameter(updatePolicy, "updatePolicy");
            Intrinsics.checkNotNullParameter(cache, "cache");
            mapOperator.getRealmReference().checkClosed();
            Pair<V, Boolean> pairInsertInternal = mapOperator.insertInternal(k, v, updatePolicy, cache);
            mapOperator.setModCount(mapOperator.getModCount() + 1);
            return pairInsertInternal;
        }

        public static <K, V> Pair<V, Boolean> erase(MapOperator<K, V> mapOperator, K k) {
            mapOperator.getRealmReference().checkClosed();
            Pair<V, Boolean> pairEraseInternal = mapOperator.eraseInternal(k);
            mapOperator.setModCount(mapOperator.getModCount() + 1);
            return pairEraseInternal;
        }

        public static <K, V> Pair<K, V> getEntry(MapOperator<K, V> mapOperator, int i) {
            mapOperator.getRealmReference().checkClosed();
            return mapOperator.getEntryInternal(i);
        }

        public static <K, V> V get(MapOperator<K, V> mapOperator, K k) {
            mapOperator.getRealmReference().checkClosed();
            return mapOperator.getInternal(k);
        }

        public static <K, V> boolean containsValue(MapOperator<K, V> mapOperator, V v) {
            mapOperator.getRealmReference().checkClosed();
            return mapOperator.containsValueInternal(v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object put$default(MapOperator mapOperator, Object obj, Object obj2, UpdatePolicy updatePolicy, Map map, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i & 4) != 0) {
                updatePolicy = UpdatePolicy.ALL;
            }
            if ((i & 8) != 0) {
                map = new LinkedHashMap();
            }
            return mapOperator.put(obj, obj2, updatePolicy, map);
        }

        public static <K, V> V put(MapOperator<K, V> mapOperator, K k, V v, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache) {
            Intrinsics.checkNotNullParameter(updatePolicy, "updatePolicy");
            Intrinsics.checkNotNullParameter(cache, "cache");
            mapOperator.getRealmReference().checkClosed();
            V first = mapOperator.insertInternal(k, v, updatePolicy, cache).getFirst();
            mapOperator.setModCount(mapOperator.getModCount() + 1);
            return first;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void putAll$default(MapOperator mapOperator, Map map, UpdatePolicy updatePolicy, Map map2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putAll");
            }
            if ((i & 2) != 0) {
                updatePolicy = UpdatePolicy.ALL;
            }
            if ((i & 4) != 0) {
                map2 = new LinkedHashMap();
            }
            mapOperator.putAll(map, updatePolicy, map2);
        }

        public static <K, V> void putAll(MapOperator<K, V> mapOperator, Map<? extends K, ? extends V> from, UpdatePolicy updatePolicy, Map<BaseRealmObject, BaseRealmObject> cache) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(updatePolicy, "updatePolicy");
            Intrinsics.checkNotNullParameter(cache, "cache");
            mapOperator.getRealmReference().checkClosed();
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                mapOperator.put(entry.getKey(), entry.getValue(), updatePolicy, cache);
            }
        }

        public static <K, V> V remove(MapOperator<K, V> mapOperator, K k) {
            mapOperator.getRealmReference().checkClosed();
            V first = mapOperator.eraseInternal(k).getFirst();
            mapOperator.setModCount(mapOperator.getModCount() + 1);
            return first;
        }

        public static <K, V> void clear(MapOperator<K, V> mapOperator) {
            mapOperator.getRealmReference().checkClosed();
            RealmInterop.INSTANCE.realm_dictionary_clear(mapOperator.getNativePointer());
            mapOperator.setModCount(mapOperator.getModCount() + 1);
        }

        public static <K, V> boolean containsKey(MapOperator<K, V> mapOperator, K k) {
            mapOperator.getRealmReference().checkClosed();
            JvmMemTrackingAllocator jvmMemTrackingAllocator = new JvmMemTrackingAllocator();
            boolean zM11396realm_dictionary_contains_key7Gcd38g = RealmInterop.INSTANCE.m11396realm_dictionary_contains_key7Gcd38g(mapOperator.getNativePointer(), mapOperator.getKeyConverter().mo11267publicToRealmValue399rIkc(jvmMemTrackingAllocator, k));
            jvmMemTrackingAllocator.free();
            return zM11396realm_dictionary_contains_key7Gcd38g;
        }

        public static <K, V> K getKey(MapOperator<K, V> mapOperator, NativePointer<RealmResultsT> resultsPointer, int i) {
            Intrinsics.checkNotNullParameter(resultsPointer, "resultsPointer");
            return mapOperator.getKeyConverter().mo11268realmValueToPublic28b4FhY(RealmInterop.INSTANCE.m11429realm_results_getA2YVJI(JvmMemAllocator.INSTANCE, resultsPointer, i));
        }
    }
}
