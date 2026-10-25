package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.Versioned;
import io.realm.kotlin.internal.CoreNotifiable;
import io.realm.kotlin.internal.interop.Callback;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmChangesT;
import io.realm.kotlin.internal.interop.RealmKeyPathArrayT;
import io.realm.kotlin.internal.interop.RealmNotificationTokenT;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Notifiable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00020\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ@\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fj\u0004\u0018\u0001`\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\fj\u0002`\u00150\u0013H&J\u0017\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0016J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001d"}, d2 = {"Lio/realm/kotlin/internal/CoreNotifiable;", ExifInterface.GPS_DIRECTION_TRUE, "C", "Lio/realm/kotlin/internal/Notifiable;", "Lio/realm/kotlin/internal/Observable;", "Lio/realm/kotlin/Versioned;", "Lio/realm/kotlin/internal/KeyPathFlowable;", "thaw", "liveRealm", "Lio/realm/kotlin/internal/RealmReference;", "(Lio/realm/kotlin/internal/RealmReference;)Lio/realm/kotlin/internal/CoreNotifiable;", "registerForNotification", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmNotificationTokenT;", "Lio/realm/kotlin/internal/interop/RealmNotificationTokenPointer;", "keyPaths", "Lio/realm/kotlin/internal/interop/RealmKeyPathArrayT;", "Lio/realm/kotlin/internal/interop/RealmKeyPathArrayPointer;", "callback", "Lio/realm/kotlin/internal/interop/Callback;", "Lio/realm/kotlin/internal/interop/RealmChangesT;", "Lio/realm/kotlin/internal/interop/RealmChangesPointer;", "freeze", "frozenRealm", "notifiable", "coreObservable", "Lio/realm/kotlin/internal/LiveRealm;", "isValid", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CoreNotifiable<T extends CoreNotifiable<T, C>, C> extends Notifiable<T, C>, Observable<T, C>, Versioned, KeyPathFlowable<C> {
    @Override // io.realm.kotlin.internal.Notifiable
    CoreNotifiable<T, C> coreObservable(LiveRealm liveRealm);

    T freeze(RealmReference frozenRealm);

    boolean isValid();

    @Override // io.realm.kotlin.internal.Observable
    Notifiable<T, C> notifiable();

    NativePointer<RealmNotificationTokenT> registerForNotification(NativePointer<RealmKeyPathArrayT> keyPaths, Callback<NativePointer<RealmChangesT>> callback);

    T thaw(RealmReference liveRealm);

    /* JADX INFO: compiled from: Notifiable.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static <T extends CoreNotifiable<T, C>, C> Notifiable<T, C> notifiable(CoreNotifiable<T, C> coreNotifiable) {
            return coreNotifiable;
        }

        public static <T extends CoreNotifiable<T, C>, C> CoreNotifiable<T, C> coreObservable(CoreNotifiable<T, C> coreNotifiable, LiveRealm liveRealm) {
            Intrinsics.checkNotNullParameter(liveRealm, "liveRealm");
            return coreNotifiable.thaw(liveRealm.getRealmReference());
        }
    }
}
