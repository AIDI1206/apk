package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: RealmPropertyType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \t2\u00020\u0001:\u0001\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/schema/RealmPropertyType;", "", "storageType", "Lio/realm/kotlin/schema/RealmStorageType;", "getStorageType", "()Lio/realm/kotlin/schema/RealmStorageType;", "isNullable", "", "()Z", "Companion", "Lio/realm/kotlin/schema/ListPropertyType;", "Lio/realm/kotlin/schema/MapPropertyType;", "Lio/realm/kotlin/schema/SetPropertyType;", "Lio/realm/kotlin/schema/ValuePropertyType;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmPropertyType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    RealmStorageType getStorageType();

    boolean isNullable();

    /* JADX INFO: compiled from: RealmPropertyType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/realm/kotlin/schema/RealmPropertyType$Companion;", "", "<init>", "()V", "subTypes", "", "Lkotlin/reflect/KClass;", "Lio/realm/kotlin/schema/RealmPropertyType;", "getSubTypes$io_realm_kotlin_library", "()Ljava/util/Set;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Set<KClass<? extends RealmPropertyType>> subTypes = SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(ValuePropertyType.class), Reflection.getOrCreateKotlinClass(ListPropertyType.class), Reflection.getOrCreateKotlinClass(SetPropertyType.class), Reflection.getOrCreateKotlinClass(MapPropertyType.class)});

        private Companion() {
        }

        public final Set<KClass<? extends RealmPropertyType>> getSubTypes$io_realm_kotlin_library() {
            return subTypes;
        }
    }
}
