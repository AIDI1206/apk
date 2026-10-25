package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.CollectionChangeSetBuilder;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmChangesT;
import io.realm.kotlin.internal.interop.RealmInterop;
import io.realm.kotlin.notifications.ListChangeSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionChangeSetBuilderImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2%\u0010\u000e\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r0\u000fj\u0002`\u0013H\u0016Ji\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\f\u001a\u00020\r2%\u0010\u0016\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r0\u000fj\u0002`\u00132%\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r0\u000fj\u0002`\u0013H\u0016¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/realm/kotlin/internal/CollectionChangeSetBuilderImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/interop/CollectionChangeSetBuilder;", "Lio/realm/kotlin/notifications/ListChangeSet$Range;", "change", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmChangesT;", "Lio/realm/kotlin/internal/interop/RealmChangesPointer;", "<init>", "(Lio/realm/kotlin/internal/interop/NativePointer;)V", "initIndicesArray", "", "size", "", "indicesAccessor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "Lio/realm/kotlin/internal/interop/ArrayAccessor;", "initRangesArray", "", "fromAccessor", "toAccessor", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Lio/realm/kotlin/notifications/ListChangeSet$Range;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class CollectionChangeSetBuilderImpl<T> extends CollectionChangeSetBuilder<T, ListChangeSet.Range> {
    @Override // io.realm.kotlin.internal.interop.CollectionChangeSetBuilder
    public /* bridge */ /* synthetic */ ListChangeSet.Range[] initRangesArray(int i, Function1 function1, Function1 function2) {
        return initRangesArray(i, (Function1<? super Integer, Integer>) function1, (Function1<? super Integer, Integer>) function2);
    }

    public CollectionChangeSetBuilderImpl(NativePointer<RealmChangesT> change) {
        Intrinsics.checkNotNullParameter(change, "change");
        CollectionChangeSetBuilderImpl<T> collectionChangeSetBuilderImpl = this;
        RealmInterop.INSTANCE.realm_collection_changes_get_indices(change, collectionChangeSetBuilderImpl);
        RealmInterop.INSTANCE.realm_collection_changes_get_ranges(change, collectionChangeSetBuilderImpl);
    }

    @Override // io.realm.kotlin.internal.interop.CollectionChangeSetBuilder
    public int[] initIndicesArray(int size, Function1<? super Integer, Integer> indicesAccessor) {
        Intrinsics.checkNotNullParameter(indicesAccessor, "indicesAccessor");
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = indicesAccessor.invoke(Integer.valueOf(i)).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.kotlin.internal.interop.CollectionChangeSetBuilder
    public ListChangeSet.Range[] initRangesArray(int size, Function1<? super Integer, Integer> fromAccessor, Function1<? super Integer, Integer> toAccessor) {
        Intrinsics.checkNotNullParameter(fromAccessor, "fromAccessor");
        Intrinsics.checkNotNullParameter(toAccessor, "toAccessor");
        ListChangeSet.Range[] rangeArr = new ListChangeSet.Range[size];
        for (int i = 0; i < size; i++) {
            int iIntValue = fromAccessor.invoke(Integer.valueOf(i)).intValue();
            rangeArr[i] = new ListChangeSet.Range(iIntValue, toAccessor.invoke(Integer.valueOf(i)).intValue() - iIntValue);
        }
        return rangeArr;
    }
}
