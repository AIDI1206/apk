package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: RealmMapInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00018\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/realm/kotlin/internal/ManagedRealmMapEntry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "operator", "Lio/realm/kotlin/internal/MapOperator;", "<init>", "(Ljava/lang/Object;Lio/realm/kotlin/internal/MapOperator;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "hashCode", "", "equals", "", "other", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ManagedRealmMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final K key;
    private final MapOperator<K, V> operator;

    public ManagedRealmMapEntry(K k, MapOperator<K, V> operator) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        this.key = k;
        this.operator = operator;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.operator.get(getKey());
    }

    @Override // java.util.Map.Entry
    public V setValue(V newValue) {
        V v = this.operator.get(getKey());
        MapOperator.DefaultImpls.insert$default(this.operator, getKey(), newValue, null, null, 12, null);
        return v;
    }

    public String toString() {
        return "ManagedRealmMapEntry{" + getKey() + AbstractJsonLexerKt.COMMA + getValue() + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object other) {
        if (!(other instanceof Map.Entry)) {
            return false;
        }
        if (getValue() instanceof byte[]) {
            Map.Entry entry = (Map.Entry) other;
            if (entry.getValue() instanceof byte[]) {
                V value = getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray");
                byte[] bArr = (byte[]) value;
                Object value2 = entry.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.ByteArray");
                return Intrinsics.areEqual(getKey(), entry.getKey()) && Arrays.equals(bArr, (byte[]) value2);
            }
        }
        Map.Entry entry2 = (Map.Entry) other;
        return Intrinsics.areEqual(getKey(), entry2.getKey()) && Intrinsics.areEqual(getValue(), entry2.getValue());
    }
}
