package com.fingerprintjs.android.fingerprint;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import com.medicmedia.medilink.domain.model.WorkerKey;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Configuration;", "", WorkerKey.KEY_VERSION, "", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "(ILcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)V", "getHasher", "()Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class Configuration {
    private final Hasher hasher;
    private final int version;

    public Configuration(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, int i, Hasher hasher, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = configuration.version;
        }
        if ((i2 & 2) != 0) {
            hasher = configuration.hasher;
        }
        return configuration.copy(i, hasher);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Hasher getHasher() {
        return this.hasher;
    }

    public final Configuration copy(int version, Hasher hasher) {
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        return new Configuration(version, hasher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return this.version == configuration.version && Intrinsics.areEqual(this.hasher, configuration.hasher);
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.hasher.hashCode();
    }

    public String toString() {
        return "Configuration(version=" + this.version + ", hasher=" + this.hasher + ')';
    }

    public Configuration(int i, Hasher hasher) {
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        this.version = i;
        this.hasher = hasher;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ Configuration(int i, MurMur3x64x128Hasher murMur3x64x128Hasher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new MurMur3x64x128Hasher() : murMur3x64x128Hasher);
    }

    public final Hasher getHasher() {
        return this.hasher;
    }
}
