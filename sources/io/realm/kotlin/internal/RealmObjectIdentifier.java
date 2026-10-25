package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.VersionId;
import io.realm.kotlin.internal.interop.ClassKey;
import io.realm.kotlin.internal.interop.ObjectKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lio/realm/kotlin/internal/RealmObjectIdentifier;", "", "classKey", "Lio/realm/kotlin/internal/interop/ClassKey;", "objectKey", "Lio/realm/kotlin/internal/interop/ObjectKey;", "versionId", "Lio/realm/kotlin/VersionId;", "path", "", "<init>", "(JJLio/realm/kotlin/VersionId;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClassKey-QNRHIEo", "()J", "J", "getObjectKey-Re3QlUs", "getVersionId", "()Lio/realm/kotlin/VersionId;", "getPath", "()Ljava/lang/String;", "component1", "component1-QNRHIEo", "component2", "component2-Re3QlUs", "component3", "component4", "copy", "copy-K9kG4gI", "(JJLio/realm/kotlin/VersionId;Ljava/lang/String;)Lio/realm/kotlin/internal/RealmObjectIdentifier;", "equals", "", "other", "hashCode", "", "toString", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RealmObjectIdentifier {
    private final long classKey;
    private final long objectKey;
    private final String path;
    private final VersionId versionId;

    public /* synthetic */ RealmObjectIdentifier(long j, long j2, VersionId versionId, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, versionId, str);
    }

    /* JADX INFO: renamed from: copy-K9kG4gI$default, reason: not valid java name */
    public static /* synthetic */ RealmObjectIdentifier m11331copyK9kG4gI$default(RealmObjectIdentifier realmObjectIdentifier, long j, long j2, VersionId versionId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = realmObjectIdentifier.classKey;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = realmObjectIdentifier.objectKey;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            versionId = realmObjectIdentifier.versionId;
        }
        VersionId versionId2 = versionId;
        if ((i & 8) != 0) {
            str = realmObjectIdentifier.path;
        }
        return realmObjectIdentifier.m11334copyK9kG4gI(j3, j4, versionId2, str);
    }

    /* JADX INFO: renamed from: component1-QNRHIEo, reason: not valid java name and from getter */
    public final long getClassKey() {
        return this.classKey;
    }

    /* JADX INFO: renamed from: component2-Re3QlUs, reason: not valid java name and from getter */
    public final long getObjectKey() {
        return this.objectKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VersionId getVersionId() {
        return this.versionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: copy-K9kG4gI, reason: not valid java name */
    public final RealmObjectIdentifier m11334copyK9kG4gI(long classKey, long objectKey, VersionId versionId, String path) {
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        Intrinsics.checkNotNullParameter(path, "path");
        return new RealmObjectIdentifier(classKey, objectKey, versionId, path, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealmObjectIdentifier)) {
            return false;
        }
        RealmObjectIdentifier realmObjectIdentifier = (RealmObjectIdentifier) other;
        return ClassKey.m11353equalsimpl0(this.classKey, realmObjectIdentifier.classKey) && ObjectKey.m11379equalsimpl0(this.objectKey, realmObjectIdentifier.objectKey) && Intrinsics.areEqual(this.versionId, realmObjectIdentifier.versionId) && Intrinsics.areEqual(this.path, realmObjectIdentifier.path);
    }

    public int hashCode() {
        return (((((ClassKey.m11354hashCodeimpl(this.classKey) * 31) + ObjectKey.m11380hashCodeimpl(this.objectKey)) * 31) + this.versionId.hashCode()) * 31) + this.path.hashCode();
    }

    public String toString() {
        return "RealmObjectIdentifier(classKey=" + ((Object) ClassKey.m11355toStringimpl(this.classKey)) + ", objectKey=" + ((Object) ObjectKey.m11381toStringimpl(this.objectKey)) + ", versionId=" + this.versionId + ", path=" + this.path + ')';
    }

    private RealmObjectIdentifier(long j, long j2, VersionId versionId, String path) {
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        Intrinsics.checkNotNullParameter(path, "path");
        this.classKey = j;
        this.objectKey = j2;
        this.versionId = versionId;
        this.path = path;
    }

    /* JADX INFO: renamed from: getClassKey-QNRHIEo, reason: not valid java name */
    public final long m11335getClassKeyQNRHIEo() {
        return this.classKey;
    }

    /* JADX INFO: renamed from: getObjectKey-Re3QlUs, reason: not valid java name */
    public final long m11336getObjectKeyRe3QlUs() {
        return this.objectKey;
    }

    public final VersionId getVersionId() {
        return this.versionId;
    }

    public final String getPath() {
        return this.path;
    }
}
