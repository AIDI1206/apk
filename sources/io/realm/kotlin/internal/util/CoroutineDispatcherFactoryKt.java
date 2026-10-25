package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"createLiveRealmContext", "Lio/realm/kotlin/internal/util/LiveRealmContext;", "Lio/realm/kotlin/internal/util/CoroutineDispatcherFactory;", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CoroutineDispatcherFactoryKt {
    public static final LiveRealmContext createLiveRealmContext(CoroutineDispatcherFactory coroutineDispatcherFactory) {
        Intrinsics.checkNotNullParameter(coroutineDispatcherFactory, "<this>");
        return new LiveRealmContext(coroutineDispatcherFactory.create());
    }
}
