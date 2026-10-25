package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.VersionId;
import io.realm.kotlin.internal.interop.Callback;
import io.realm.kotlin.internal.interop.ClassKey;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.PropertyKey;
import io.realm.kotlin.internal.interop.RealmChangesT;
import io.realm.kotlin.internal.interop.RealmInterop;
import io.realm.kotlin.internal.interop.RealmKeyPathArrayT;
import io.realm.kotlin.internal.interop.RealmNotificationTokenT;
import io.realm.kotlin.internal.interop.RealmObjectInterop;
import io.realm.kotlin.internal.interop.RealmObjectT;
import io.realm.kotlin.internal.schema.ClassMetadata;
import io.realm.kotlin.internal.schema.PropertyMetadata;
import io.realm.kotlin.notifications.ObjectChange;
import io.realm.kotlin.types.BaseRealmObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmObjectReference.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 L*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00070\u0006:\u0001LB?\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tJ\b\u0010'\u001a\u00020(H\u0016J<\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0010\u0010*\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\u0010\b\u0002\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000bH\u0002J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010-\u001a\u00020\rH\u0016J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\rH\u0016J&\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\r2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000bJ@\u00100\u001a\f\u0012\u0004\u0012\u0002010\u0011j\u0002`22\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u000204\u0018\u00010\u0011j\u0004\u0018\u0001`52\u0016\u00106\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002080\u0011j\u0002`907H\u0016J4\u0010:\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070;2\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070=H\u0016J'\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0?2\u0010\u0010@\u001a\f\u0012\u0004\u0012\u0002080\u0011j\u0002`9H\u0000¢\u0006\u0004\bA\u0010BJ$\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070D2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020IH\u0016J\r\u0010J\u001a\u00020GH\u0000¢\u0006\u0002\bKR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006M"}, d2 = {"Lio/realm/kotlin/internal/RealmObjectReference;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/internal/RealmStateHolder;", "Lio/realm/kotlin/internal/interop/RealmObjectInterop;", "Lio/realm/kotlin/internal/InternalDeleteable;", "Lio/realm/kotlin/internal/CoreNotifiable;", "Lio/realm/kotlin/notifications/ObjectChange;", "className", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lkotlin/reflect/KClass;", "owner", "Lio/realm/kotlin/internal/RealmReference;", "mediator", "Lio/realm/kotlin/internal/Mediator;", "objectPointer", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmObjectT;", "Lio/realm/kotlin/internal/interop/RealmObjectPointer;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lio/realm/kotlin/internal/RealmReference;Lio/realm/kotlin/internal/Mediator;Lio/realm/kotlin/internal/interop/NativePointer;)V", "getClassName", "()Ljava/lang/String;", "getType", "()Lkotlin/reflect/KClass;", "getOwner", "()Lio/realm/kotlin/internal/RealmReference;", "getMediator", "()Lio/realm/kotlin/internal/Mediator;", "getObjectPointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", TtmlNode.TAG_METADATA, "Lio/realm/kotlin/internal/schema/ClassMetadata;", "getMetadata", "()Lio/realm/kotlin/internal/schema/ClassMetadata;", "propertyInfoOrThrow", "Lio/realm/kotlin/internal/schema/PropertyMetadata;", "propertyName", "realmState", "Lio/realm/kotlin/internal/RealmState;", "newObjectReference", "pointer", "clazz", "freeze", "frozenRealm", "thaw", "liveRealm", "registerForNotification", "Lio/realm/kotlin/internal/interop/RealmNotificationTokenT;", "Lio/realm/kotlin/internal/interop/RealmNotificationTokenPointer;", "keyPaths", "Lio/realm/kotlin/internal/interop/RealmKeyPathArrayT;", "Lio/realm/kotlin/internal/interop/RealmKeyPathArrayPointer;", "callback", "Lio/realm/kotlin/internal/interop/Callback;", "Lio/realm/kotlin/internal/interop/RealmChangesT;", "Lio/realm/kotlin/internal/interop/RealmChangesPointer;", "changeFlow", "Lio/realm/kotlin/internal/ChangeFlow;", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "getChangedFieldNames", "", "change", "getChangedFieldNames$io_realm_kotlin_library", "(Lio/realm/kotlin/internal/interop/NativePointer;)[Ljava/lang/String;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "", "delete", "", "isValid", "", "checkValid", "checkValid$io_realm_kotlin_library", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmObjectReference<T extends BaseRealmObject> implements RealmStateHolder, RealmObjectInterop, InternalDeleteable, CoreNotifiable<RealmObjectReference<T>, ObjectChange<T>> {
    public static final String INVALID_OBJECT_MSG = "Cannot perform this operation on an invalid/deleted object";
    private final String className;
    private final Mediator mediator;
    private final ClassMetadata metadata;
    private final NativePointer<RealmObjectT> objectPointer;
    private final RealmReference owner;
    private final KClass<T> type;

    public RealmObjectReference(String className, KClass<T> type, RealmReference owner, Mediator mediator, NativePointer<RealmObjectT> objectPointer) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(objectPointer, "objectPointer");
        this.className = className;
        this.type = type;
        this.owner = owner;
        this.mediator = mediator;
        this.objectPointer = objectPointer;
        ClassMetadata classMetadata = owner.getSchemaMetadata().get(className);
        Intrinsics.checkNotNull(classMetadata);
        this.metadata = classMetadata;
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable, io.realm.kotlin.internal.Notifiable
    public CoreNotifiable<RealmObjectReference<T>, ObjectChange<T>> coreObservable(LiveRealm liveRealm) {
        return CoreNotifiable.DefaultImpls.coreObservable(this, liveRealm);
    }

    @Override // io.realm.kotlin.internal.RealmStateHolder, io.realm.kotlin.internal.RealmState
    public boolean isClosed() {
        return RealmStateHolder.DefaultImpls.isClosed(this);
    }

    @Override // io.realm.kotlin.internal.RealmStateHolder, io.realm.kotlin.internal.RealmState
    public boolean isFrozen() {
        return RealmStateHolder.DefaultImpls.isFrozen(this);
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable, io.realm.kotlin.internal.Observable
    public Notifiable<RealmObjectReference<T>, ObjectChange<T>> notifiable() {
        return CoreNotifiable.DefaultImpls.notifiable(this);
    }

    @Override // io.realm.kotlin.internal.RealmStateHolder
    public VersionId version() {
        return RealmStateHolder.DefaultImpls.version(this);
    }

    public final String getClassName() {
        return this.className;
    }

    public final KClass<T> getType() {
        return this.type;
    }

    public final RealmReference getOwner() {
        return this.owner;
    }

    public final Mediator getMediator() {
        return this.mediator;
    }

    @Override // io.realm.kotlin.internal.interop.RealmObjectInterop
    public NativePointer<RealmObjectT> getObjectPointer() {
        return this.objectPointer;
    }

    public final ClassMetadata getMetadata() {
        return this.metadata;
    }

    public final PropertyMetadata propertyInfoOrThrow(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        return this.metadata.getOrThrow(propertyName);
    }

    @Override // io.realm.kotlin.internal.RealmStateHolder
    public RealmState realmState() {
        return this.owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ RealmObjectReference newObjectReference$default(RealmObjectReference realmObjectReference, RealmReference realmReference, NativePointer nativePointer, KClass kClass, int i, Object obj) {
        if ((i & 4) != 0) {
            kClass = realmObjectReference.type;
        }
        return realmObjectReference.newObjectReference(realmReference, nativePointer, kClass);
    }

    private final RealmObjectReference<? extends BaseRealmObject> newObjectReference(RealmReference owner, NativePointer<RealmObjectT> pointer, KClass<? extends BaseRealmObject> clazz) {
        return new RealmObjectReference<>(this.className, clazz, owner, this.mediator, pointer);
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable
    public RealmObjectReference<T> freeze(RealmReference frozenRealm) {
        Intrinsics.checkNotNullParameter(frozenRealm, "frozenRealm");
        NativePointer<RealmObjectT> nativePointerRealm_object_resolve_in = RealmInterop.INSTANCE.realm_object_resolve_in(getObjectPointer(), frozenRealm.getDbPointer());
        if (nativePointerRealm_object_resolve_in != null) {
            return newObjectReference$default(this, frozenRealm, nativePointerRealm_object_resolve_in, null, 4, null);
        }
        return null;
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable
    public RealmObjectReference<T> thaw(RealmReference liveRealm) {
        Intrinsics.checkNotNullParameter(liveRealm, "liveRealm");
        return thaw(liveRealm, this.type);
    }

    public final RealmObjectReference<T> thaw(RealmReference liveRealm, KClass<? extends BaseRealmObject> clazz) {
        Intrinsics.checkNotNullParameter(liveRealm, "liveRealm");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        NativePointer<RealmObjectT> nativePointerRealm_object_resolve_in = RealmInterop.INSTANCE.realm_object_resolve_in(getObjectPointer(), liveRealm.getDbPointer());
        if (nativePointerRealm_object_resolve_in != null) {
            return (RealmObjectReference<T>) newObjectReference(liveRealm, nativePointerRealm_object_resolve_in, clazz);
        }
        return null;
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable
    public NativePointer<RealmNotificationTokenT> registerForNotification(NativePointer<RealmKeyPathArrayT> keyPaths, Callback<NativePointer<RealmChangesT>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return RealmInterop.INSTANCE.realm_object_add_notification_callback(getObjectPointer(), keyPaths, callback);
    }

    @Override // io.realm.kotlin.internal.Notifiable
    public ChangeFlow<RealmObjectReference<T>, ObjectChange<T>> changeFlow(ProducerScope<? super ObjectChange<T>> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new ObjectChangeFlow(scope);
    }

    public final String[] getChangedFieldNames$io_realm_kotlin_library(NativePointer<RealmChangesT> change) {
        String name;
        Intrinsics.checkNotNullParameter(change, "change");
        List<PropertyKey> listRealm_object_changes_get_modified_properties = RealmInterop.INSTANCE.realm_object_changes_get_modified_properties(change);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRealm_object_changes_get_modified_properties, 10));
        Iterator<T> it = listRealm_object_changes_get_modified_properties.iterator();
        while (it.hasNext()) {
            PropertyMetadata propertyMetadataMo11487getXxIY2SY = this.metadata.mo11487getXxIY2SY(((PropertyKey) it.next()).m11393unboximpl());
            if (propertyMetadataMo11487getXxIY2SY == null || (name = propertyMetadataMo11487getXxIY2SY.getName()) == null) {
                name = "";
            }
            arrayList.add(name);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // io.realm.kotlin.internal.KeyPathFlowable
    public Flow<ObjectChange<T>> asFlow(List<String> keyPaths) {
        return this.owner.getOwner().registerObserver$io_realm_kotlin_library(this, keyPaths != null ? new Pair<>(ClassKey.m11350boximpl(this.metadata.mo11488getClassKeyQNRHIEo()), keyPaths) : null);
    }

    @Override // io.realm.kotlin.internal.InternalDeleteable
    public void delete() {
        if (isFrozen()) {
            throw new IllegalArgumentException("Frozen objects cannot be deleted. They must be converted to live objects first by using `MutableRealm/DynamicMutableRealm.findLatest(frozenObject)`.");
        }
        if (!isValid()) {
            throw new IllegalArgumentException(INVALID_OBJECT_MSG);
        }
        RealmInterop.INSTANCE.realm_object_delete(getObjectPointer());
    }

    @Override // io.realm.kotlin.internal.CoreNotifiable
    public boolean isValid() {
        NativePointer<RealmObjectT> objectPointer = getObjectPointer();
        return !objectPointer.isReleased() && RealmInterop.INSTANCE.realm_object_is_valid(objectPointer);
    }

    public final void checkValid$io_realm_kotlin_library() {
        if (!isValid()) {
            throw new IllegalStateException(INVALID_OBJECT_MSG);
        }
    }
}
