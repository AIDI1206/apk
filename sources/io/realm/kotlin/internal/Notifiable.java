package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.CoreNotifiable;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: Notifiable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH&¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/Notifiable;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/CoreNotifiable;", "C", "", "coreObservable", "liveRealm", "Lio/realm/kotlin/internal/LiveRealm;", "changeFlow", "Lio/realm/kotlin/internal/ChangeFlow;", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Notifiable<T extends CoreNotifiable<T, C>, C> {
    ChangeFlow<T, C> changeFlow(ProducerScope<? super C> scope);

    CoreNotifiable<T, C> coreObservable(LiveRealm liveRealm);
}
