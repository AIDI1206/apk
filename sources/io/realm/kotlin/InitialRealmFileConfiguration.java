package io.realm.kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/InitialRealmFileConfiguration;", "", "assetFile", "", "checksum", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssetFile", "()Ljava/lang/String;", "getChecksum", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class InitialRealmFileConfiguration {
    private final String assetFile;
    private final String checksum;

    public static /* synthetic */ InitialRealmFileConfiguration copy$default(InitialRealmFileConfiguration initialRealmFileConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialRealmFileConfiguration.assetFile;
        }
        if ((i & 2) != 0) {
            str2 = initialRealmFileConfiguration.checksum;
        }
        return initialRealmFileConfiguration.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetFile() {
        return this.assetFile;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final InitialRealmFileConfiguration copy(String assetFile, String checksum) {
        Intrinsics.checkNotNullParameter(assetFile, "assetFile");
        return new InitialRealmFileConfiguration(assetFile, checksum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialRealmFileConfiguration)) {
            return false;
        }
        InitialRealmFileConfiguration initialRealmFileConfiguration = (InitialRealmFileConfiguration) other;
        return Intrinsics.areEqual(this.assetFile, initialRealmFileConfiguration.assetFile) && Intrinsics.areEqual(this.checksum, initialRealmFileConfiguration.checksum);
    }

    public int hashCode() {
        int iHashCode = this.assetFile.hashCode() * 31;
        String str = this.checksum;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitialRealmFileConfiguration(assetFile=" + this.assetFile + ", checksum=" + this.checksum + ')';
    }

    public InitialRealmFileConfiguration(String assetFile, String str) {
        Intrinsics.checkNotNullParameter(assetFile, "assetFile");
        this.assetFile = assetFile;
        this.checksum = str;
    }

    public final String getAssetFile() {
        return this.assetFile;
    }

    public final String getChecksum() {
        return this.checksum;
    }
}
