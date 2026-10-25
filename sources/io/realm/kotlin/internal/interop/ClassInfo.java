package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClassInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u0012J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006+"}, d2 = {"Lio/realm/kotlin/internal/interop/ClassInfo;", "", "name", "", "primaryKey", "numProperties", "", "numComputedProperties", "key", "Lio/realm/kotlin/internal/interop/ClassKey;", "flags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getPrimaryKey", "getNumProperties", "()J", "getNumComputedProperties", "getKey-QNRHIEo", "J", "getFlags", "()I", "isEmbedded", "", "()Z", "isAsymmetric", "component1", "component2", "component3", "component4", "component5", "component5-QNRHIEo", "component6", "copy", "copy-dpAbt4Y", "(Ljava/lang/String;Ljava/lang/String;JJJI)Lio/realm/kotlin/internal/interop/ClassInfo;", "equals", "other", "hashCode", "toString", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ClassInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int flags;
    private final boolean isAsymmetric;
    private final boolean isEmbedded;
    private final long key;
    private final String name;
    private final long numComputedProperties;
    private final long numProperties;
    private final String primaryKey;

    public /* synthetic */ ClassInfo(String str, String str2, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, i);
    }

    /* JADX INFO: renamed from: copy-dpAbt4Y$default, reason: not valid java name */
    public static /* synthetic */ ClassInfo m11346copydpAbt4Y$default(ClassInfo classInfo, String str, String str2, long j, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = classInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = classInfo.primaryKey;
        }
        if ((i2 & 4) != 0) {
            j = classInfo.numProperties;
        }
        if ((i2 & 8) != 0) {
            j2 = classInfo.numComputedProperties;
        }
        if ((i2 & 16) != 0) {
            j3 = classInfo.key;
        }
        if ((i2 & 32) != 0) {
            i = classInfo.flags;
        }
        int i3 = i;
        long j4 = j3;
        long j5 = j2;
        return classInfo.m11348copydpAbt4Y(str, str2, j, j5, j4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getNumProperties() {
        return this.numProperties;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getNumComputedProperties() {
        return this.numComputedProperties;
    }

    /* JADX INFO: renamed from: component5-QNRHIEo, reason: not valid java name and from getter */
    public final long getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: copy-dpAbt4Y, reason: not valid java name */
    public final ClassInfo m11348copydpAbt4Y(String name, String primaryKey, long numProperties, long numComputedProperties, long key, int flags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return new ClassInfo(name, primaryKey, numProperties, numComputedProperties, key, flags, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassInfo)) {
            return false;
        }
        ClassInfo classInfo = (ClassInfo) other;
        return Intrinsics.areEqual(this.name, classInfo.name) && Intrinsics.areEqual(this.primaryKey, classInfo.primaryKey) && this.numProperties == classInfo.numProperties && this.numComputedProperties == classInfo.numComputedProperties && ClassKey.m11353equalsimpl0(this.key, classInfo.key) && this.flags == classInfo.flags;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.primaryKey.hashCode()) * 31) + Long.hashCode(this.numProperties)) * 31) + Long.hashCode(this.numComputedProperties)) * 31) + ClassKey.m11354hashCodeimpl(this.key)) * 31) + Integer.hashCode(this.flags);
    }

    public String toString() {
        return "ClassInfo(name=" + this.name + ", primaryKey=" + this.primaryKey + ", numProperties=" + this.numProperties + ", numComputedProperties=" + this.numComputedProperties + ", key=" + ((Object) ClassKey.m11355toStringimpl(this.key)) + ", flags=" + this.flags + ')';
    }

    private ClassInfo(String name, String primaryKey, long j, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        this.name = name;
        this.primaryKey = primaryKey;
        this.numProperties = j;
        this.numComputedProperties = j2;
        this.key = j3;
        this.flags = i;
        this.isEmbedded = (ClassFlags.INSTANCE.getRLM_CLASS_EMBEDDED() & i) != 0;
        this.isAsymmetric = (ClassFlags.INSTANCE.getRLM_CLASS_ASYMMETRIC() & i) != 0;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ ClassInfo(String str, String str2, long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, j, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? RealmInteropKt.getINVALID_CLASS_KEY() : j3, (i2 & 32) != 0 ? ClassFlags.INSTANCE.getRLM_CLASS_NORMAL() : i, null);
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final long getNumProperties() {
        return this.numProperties;
    }

    public final long getNumComputedProperties() {
        return this.numComputedProperties;
    }

    /* JADX INFO: renamed from: getKey-QNRHIEo, reason: not valid java name */
    public final long m11349getKeyQNRHIEo() {
        return this.key;
    }

    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: isEmbedded, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* JADX INFO: renamed from: isAsymmetric, reason: from getter */
    public final boolean getIsAsymmetric() {
        return this.isAsymmetric;
    }

    /* JADX INFO: compiled from: ClassInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/internal/interop/ClassInfo$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/internal/interop/ClassInfo;", "name", "", "primaryKey", "numProperties", "", "isEmbedded", "", "isAsymmetric", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ClassInfo create$default(Companion companion, String str, String str2, long j, boolean z, boolean z2, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                z2 = false;
            }
            return companion.create(str, str2, j, z, z2);
        }

        public final ClassInfo create(String name, String primaryKey, long numProperties, boolean isEmbedded, boolean isAsymmetric) {
            int rlm_class_normal;
            Intrinsics.checkNotNullParameter(name, "name");
            if (isEmbedded) {
                rlm_class_normal = ClassFlags.INSTANCE.getRLM_CLASS_EMBEDDED();
            } else if (isAsymmetric) {
                rlm_class_normal = ClassFlags.INSTANCE.getRLM_CLASS_ASYMMETRIC();
            } else {
                rlm_class_normal = ClassFlags.INSTANCE.getRLM_CLASS_NORMAL();
            }
            int i = rlm_class_normal;
            if (primaryKey == null) {
                primaryKey = "";
            }
            return new ClassInfo(name, primaryKey, numProperties, 0L, 0L, i, 16, null);
        }
    }
}
