package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import io.realm.kotlin.internal.interop.CoreError;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SyncError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013Be\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0018J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0015HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncError;", "", "errorCode", "Lio/realm/kotlin/internal/interop/CoreError;", "originalFilePath", "", "recoveryFilePath", "isFatal", "", "isUnrecognizedByClient", "isClientResetRequested", "compensatingWrites", "", "Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;", "userError", "", "<init>", "(Lio/realm/kotlin/internal/interop/CoreError;Ljava/lang/String;Ljava/lang/String;ZZZ[Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;Ljava/lang/Throwable;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Lio/realm/kotlin/internal/interop/CoreError;)V", "categoryFlags", "", "value", "message", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ[Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;Ljava/lang/Throwable;)V", "getErrorCode", "()Lio/realm/kotlin/internal/interop/CoreError;", "getOriginalFilePath", "()Ljava/lang/String;", "getRecoveryFilePath", "()Z", "getCompensatingWrites", "()[Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;", "[Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;", "getUserError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/realm/kotlin/internal/interop/CoreError;Ljava/lang/String;Ljava/lang/String;ZZZ[Lio/realm/kotlin/internal/interop/sync/CoreCompensatingWriteInfo;Ljava/lang/Throwable;)Lio/realm/kotlin/internal/interop/sync/SyncError;", "equals", "other", "hashCode", "toString", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SyncError {
    private final CoreCompensatingWriteInfo[] compensatingWrites;
    private final CoreError errorCode;
    private final boolean isClientResetRequested;
    private final boolean isFatal;
    private final boolean isUnrecognizedByClient;
    private final String originalFilePath;
    private final String recoveryFilePath;
    private final Throwable userError;

    public static /* synthetic */ SyncError copy$default(SyncError syncError, CoreError coreError, String str, String str2, boolean z, boolean z2, boolean z3, CoreCompensatingWriteInfo[] coreCompensatingWriteInfoArr, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            coreError = syncError.errorCode;
        }
        if ((i & 2) != 0) {
            str = syncError.originalFilePath;
        }
        if ((i & 4) != 0) {
            str2 = syncError.recoveryFilePath;
        }
        if ((i & 8) != 0) {
            z = syncError.isFatal;
        }
        if ((i & 16) != 0) {
            z2 = syncError.isUnrecognizedByClient;
        }
        if ((i & 32) != 0) {
            z3 = syncError.isClientResetRequested;
        }
        if ((i & 64) != 0) {
            coreCompensatingWriteInfoArr = syncError.compensatingWrites;
        }
        if ((i & 128) != 0) {
            th = syncError.userError;
        }
        CoreCompensatingWriteInfo[] coreCompensatingWriteInfoArr2 = coreCompensatingWriteInfoArr;
        Throwable th2 = th;
        boolean z4 = z2;
        boolean z5 = z3;
        return syncError.copy(coreError, str, str2, z, z4, z5, coreCompensatingWriteInfoArr2, th2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoreError getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalFilePath() {
        return this.originalFilePath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecoveryFilePath() {
        return this.recoveryFilePath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFatal() {
        return this.isFatal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsUnrecognizedByClient() {
        return this.isUnrecognizedByClient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsClientResetRequested() {
        return this.isClientResetRequested;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CoreCompensatingWriteInfo[] getCompensatingWrites() {
        return this.compensatingWrites;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Throwable getUserError() {
        return this.userError;
    }

    public final SyncError copy(CoreError errorCode, String originalFilePath, String recoveryFilePath, boolean isFatal, boolean isUnrecognizedByClient, boolean isClientResetRequested, CoreCompensatingWriteInfo[] compensatingWrites, Throwable userError) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(compensatingWrites, "compensatingWrites");
        return new SyncError(errorCode, originalFilePath, recoveryFilePath, isFatal, isUnrecognizedByClient, isClientResetRequested, compensatingWrites, userError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncError)) {
            return false;
        }
        SyncError syncError = (SyncError) other;
        return Intrinsics.areEqual(this.errorCode, syncError.errorCode) && Intrinsics.areEqual(this.originalFilePath, syncError.originalFilePath) && Intrinsics.areEqual(this.recoveryFilePath, syncError.recoveryFilePath) && this.isFatal == syncError.isFatal && this.isUnrecognizedByClient == syncError.isUnrecognizedByClient && this.isClientResetRequested == syncError.isClientResetRequested && Intrinsics.areEqual(this.compensatingWrites, syncError.compensatingWrites) && Intrinsics.areEqual(this.userError, syncError.userError);
    }

    public int hashCode() {
        int iHashCode = this.errorCode.hashCode() * 31;
        String str = this.originalFilePath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recoveryFilePath;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isFatal)) * 31) + Boolean.hashCode(this.isUnrecognizedByClient)) * 31) + Boolean.hashCode(this.isClientResetRequested)) * 31) + Arrays.hashCode(this.compensatingWrites)) * 31;
        Throwable th = this.userError;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "SyncError(errorCode=" + this.errorCode + ", originalFilePath=" + this.originalFilePath + ", recoveryFilePath=" + this.recoveryFilePath + ", isFatal=" + this.isFatal + ", isUnrecognizedByClient=" + this.isUnrecognizedByClient + ", isClientResetRequested=" + this.isClientResetRequested + ", compensatingWrites=" + Arrays.toString(this.compensatingWrites) + ", userError=" + this.userError + ')';
    }

    public SyncError(CoreError errorCode, String str, String str2, boolean z, boolean z2, boolean z3, CoreCompensatingWriteInfo[] compensatingWrites, Throwable th) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(compensatingWrites, "compensatingWrites");
        this.errorCode = errorCode;
        this.originalFilePath = str;
        this.recoveryFilePath = str2;
        this.isFatal = z;
        this.isUnrecognizedByClient = z2;
        this.isClientResetRequested = z3;
        this.compensatingWrites = compensatingWrites;
        this.userError = th;
    }

    public final CoreError getErrorCode() {
        return this.errorCode;
    }

    public final String getOriginalFilePath() {
        return this.originalFilePath;
    }

    public final String getRecoveryFilePath() {
        return this.recoveryFilePath;
    }

    public final boolean isFatal() {
        return this.isFatal;
    }

    public final boolean isUnrecognizedByClient() {
        return this.isUnrecognizedByClient;
    }

    public final boolean isClientResetRequested() {
        return this.isClientResetRequested;
    }

    public final CoreCompensatingWriteInfo[] getCompensatingWrites() {
        return this.compensatingWrites;
    }

    public final Throwable getUserError() {
        return this.userError;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyncError(CoreError error) {
        this(error, null, null, false, false, false, new CoreCompensatingWriteInfo[0], null);
        Intrinsics.checkNotNullParameter(error, "error");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyncError(int i, int i2, String message, String str, String str2, boolean z, boolean z2, boolean z3, CoreCompensatingWriteInfo[] compensatingWrites, Throwable th) {
        this(new CoreError(i, i2, message), str, str2, z, z2, z3, compensatingWrites, th);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(compensatingWrites, "compensatingWrites");
    }
}
