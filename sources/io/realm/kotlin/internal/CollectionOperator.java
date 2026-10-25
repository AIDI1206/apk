package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.CapiT;
import io.realm.kotlin.internal.interop.NativePointer;
import kotlin.Metadata;

/* JADX INFO: compiled from: CollectionOperator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/internal/CollectionOperator;", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_DIRECTION_TRUE, "", "mediator", "Lio/realm/kotlin/internal/Mediator;", "getMediator", "()Lio/realm/kotlin/internal/Mediator;", "realmReference", "Lio/realm/kotlin/internal/RealmReference;", "getRealmReference", "()Lio/realm/kotlin/internal/RealmReference;", "nativePointer", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/CapiT;", "getNativePointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CollectionOperator<E, T> {
    Mediator getMediator();

    NativePointer<? extends CapiT> getNativePointer();

    RealmReference getRealmReference();
}
