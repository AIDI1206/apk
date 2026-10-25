package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.platform.CoroutineUtilsSharedJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lio/realm/kotlin/internal/util/CoroutineDispatcherFactory;", "", "create", "Lio/realm/kotlin/internal/util/DispatcherHolder;", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CoroutineDispatcherFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    DispatcherHolder create();

    /* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/util/CoroutineDispatcherFactory$Companion;", "", "<init>", "()V", "managed", "Lio/realm/kotlin/internal/util/CoroutineDispatcherFactory;", "name", "", "threads", "", "unmanaged", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ CoroutineDispatcherFactory managed$default(Companion companion, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            return companion.managed(str, i);
        }

        public final CoroutineDispatcherFactory managed(final String name, final int threads) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new CoroutineDispatcherFactory() { // from class: io.realm.kotlin.internal.util.CoroutineDispatcherFactory$Companion$$ExternalSyntheticLambda1
                @Override // io.realm.kotlin.internal.util.CoroutineDispatcherFactory
                public final DispatcherHolder create() {
                    return CoroutineDispatcherFactory.Companion.managed$lambda$0(threads, name);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DispatcherHolder managed$lambda$0(int i, String str) {
            ExecutorCoroutineDispatcher executorCoroutineDispatcherMultiThreadDispatcher;
            if (i == 1) {
                executorCoroutineDispatcherMultiThreadDispatcher = CoroutineUtilsSharedJvmKt.singleThreadDispatcher(str);
            } else {
                executorCoroutineDispatcherMultiThreadDispatcher = CoroutineUtilsSharedJvmKt.multiThreadDispatcher(i);
            }
            return new ManagedDispatcherHolder(executorCoroutineDispatcherMultiThreadDispatcher);
        }

        public final CoroutineDispatcherFactory unmanaged(final CoroutineDispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            return new CoroutineDispatcherFactory() { // from class: io.realm.kotlin.internal.util.CoroutineDispatcherFactory$Companion$$ExternalSyntheticLambda0
                @Override // io.realm.kotlin.internal.util.CoroutineDispatcherFactory
                public final DispatcherHolder create() {
                    return CoroutineDispatcherFactory.Companion.unmanaged$lambda$1(dispatcher);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DispatcherHolder unmanaged$lambda$1(CoroutineDispatcher coroutineDispatcher) {
            return new UnmanagedDispatcherHolder(coroutineDispatcher);
        }
    }
}
