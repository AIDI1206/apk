package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MemAllocator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\b\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "Lio/realm/kotlin/internal/interop/MemAllocator;", "stringTransport", "Lio/realm/kotlin/internal/interop/RealmValue;", "value", "", "stringTransport-ajuLxiE", "(Ljava/lang/String;)Lio/realm/kotlin/internal/interop/realm_value_t;", "byteArrayTransport", "", "byteArrayTransport-ajuLxiE", "([B)Lio/realm/kotlin/internal/interop/realm_value_t;", "queryArgsOf", "Lio/realm/kotlin/internal/interop/RealmQueryArgumentList;", "queryArgs", "", "Lio/realm/kotlin/internal/interop/RealmQueryArgument;", "free", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MemTrackingAllocator extends MemAllocator {
    /* JADX INFO: renamed from: byteArrayTransport-ajuLxiE */
    realm_value_t mo11372byteArrayTransportajuLxiE(byte[] value);

    void free();

    RealmQueryArgumentList queryArgsOf(List<? extends RealmQueryArgument> queryArgs);

    /* JADX INFO: renamed from: stringTransport-ajuLxiE */
    realm_value_t mo11373stringTransportajuLxiE(String value);
}
