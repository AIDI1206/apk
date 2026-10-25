package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionChangeSetBuilder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H&¢\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H&¢\u0006\u0002\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H&¢\u0006\u0002\u0010\u0017J\r\u0010\u001a\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0086.¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0086.¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0086.¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/internal/interop/MapChangeSetBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "K", "", "<init>", "()V", "deletedKeys", "", "getDeletedKeys", "()[Ljava/lang/Object;", "setDeletedKeys", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "insertedKeys", "getInsertedKeys", "setInsertedKeys", "modifiedKeys", "getModifiedKeys", "setModifiedKeys", "initDeletions", "", UserMetadata.KEYDATA_FILENAME, "", "([Ljava/lang/String;)V", "initInsertions", "initModifications", "build", "()Ljava/lang/Object;", "isEmpty", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class MapChangeSetBuilder<T, K> {
    public K[] deletedKeys;
    public K[] insertedKeys;
    public K[] modifiedKeys;

    public abstract T build();

    public abstract void initDeletions(String[] keys);

    public abstract void initInsertions(String[] keys);

    public abstract void initModifications(String[] keys);

    public final K[] getDeletedKeys() {
        K[] kArr = this.deletedKeys;
        if (kArr != null) {
            return kArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deletedKeys");
        return null;
    }

    public final void setDeletedKeys(K[] kArr) {
        Intrinsics.checkNotNullParameter(kArr, "<set-?>");
        this.deletedKeys = kArr;
    }

    public final K[] getInsertedKeys() {
        K[] kArr = this.insertedKeys;
        if (kArr != null) {
            return kArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("insertedKeys");
        return null;
    }

    public final void setInsertedKeys(K[] kArr) {
        Intrinsics.checkNotNullParameter(kArr, "<set-?>");
        this.insertedKeys = kArr;
    }

    public final K[] getModifiedKeys() {
        K[] kArr = this.modifiedKeys;
        if (kArr != null) {
            return kArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modifiedKeys");
        return null;
    }

    public final void setModifiedKeys(K[] kArr) {
        Intrinsics.checkNotNullParameter(kArr, "<set-?>");
        this.modifiedKeys = kArr;
    }

    public final boolean isEmpty() {
        return getInsertedKeys().length == 0 && getModifiedKeys().length == 0 && getDeletedKeys().length == 0;
    }
}
