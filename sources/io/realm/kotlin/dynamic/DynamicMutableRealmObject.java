package io.realm.kotlin.dynamic;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.internal.dynamic.DynamicUnmanagedRealmObject;
import io.realm.kotlin.types.RealmDictionary;
import io.realm.kotlin.types.RealmList;
import io.realm.kotlin.types.RealmSet;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DynamicMutableRealmObject.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n2\u0006\u0010\u0003\u001a\u00020\u0004H&J#\u0010\u000b\u001a\u00020\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u0002H\fH&¢\u0006\u0002\u0010\u000eJ=\u0010\u000b\u001a\u00020\u00002.\u0010\u000f\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0010\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Lio/realm/kotlin/dynamic/DynamicRealmObject;", "getObject", "propertyName", "", "getObjectList", "Lio/realm/kotlin/types/RealmList;", "getObjectSet", "Lio/realm/kotlin/types/RealmSet;", "getObjectDictionary", "Lio/realm/kotlin/types/RealmDictionary;", "set", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/String;Ljava/lang/Object;)Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DynamicMutableRealmObject extends DynamicRealmObject {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Override // io.realm.kotlin.dynamic.DynamicRealmObject
    DynamicMutableRealmObject getObject(String propertyName);

    @Override // io.realm.kotlin.dynamic.DynamicRealmObject
    RealmDictionary<DynamicMutableRealmObject> getObjectDictionary(String propertyName);

    @Override // io.realm.kotlin.dynamic.DynamicRealmObject
    RealmList<DynamicMutableRealmObject> getObjectList(String propertyName);

    @Override // io.realm.kotlin.dynamic.DynamicRealmObject
    RealmSet<DynamicMutableRealmObject> getObjectSet(String propertyName);

    <T> DynamicMutableRealmObject set(String propertyName, T value);

    DynamicMutableRealmObject set(Pair<String, ? extends Object>... pairs);

    /* JADX INFO: compiled from: DynamicMutableRealmObject.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072.\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0002\u0010\u000bJ&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¨\u0006\r"}, d2 = {"Lio/realm/kotlin/dynamic/DynamicMutableRealmObject$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "properties", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DynamicMutableRealmObject create(String type, Pair<String, ? extends Object>... properties) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(properties, "properties");
            return new DynamicUnmanagedRealmObject(type, (Pair<String, ? extends Object>[]) Arrays.copyOf(properties, properties.length));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DynamicMutableRealmObject create$default(Companion companion, String str, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.create(str, (Map<String, ? extends Object>) map);
        }

        public final DynamicMutableRealmObject create(String type, Map<String, ? extends Object> properties) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(properties, "properties");
            return new DynamicUnmanagedRealmObject(type, properties);
        }
    }

    /* JADX INFO: compiled from: DynamicMutableRealmObject.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static DynamicMutableRealmObject set(DynamicMutableRealmObject dynamicMutableRealmObject, Pair<String, ? extends Object>... pairs) {
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            for (Pair<String, ? extends Object> pair : pairs) {
                dynamicMutableRealmObject.set(pair.getFirst(), pair.getSecond());
            }
            return dynamicMutableRealmObject;
        }
    }
}
