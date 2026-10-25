package com.medicmedia.medilink.domain.model;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecureUnzip.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "", "recourseId", "", "getRecourseId", "()I", "args", "", "getArgs", "()Ljava/lang/String;", "getMessage", "context", "Landroid/content/Context;", "TooManyFiles", "DangerousEntryName", "TraversalBlocked", "FailedToCreateDir", "UncompressedSizeLimitOver", "FailedToWrite", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$DangerousEntryName;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$FailedToCreateDir;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$FailedToWrite;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$TooManyFiles;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$TraversalBlocked;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError$UncompressedSizeLimitOver;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SecureUnzipError {
    String getArgs();

    String getMessage(Context context);

    int getRecourseId();

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$TooManyFiles;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TooManyFiles implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public TooManyFiles() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TooManyFiles copy$default(TooManyFiles tooManyFiles, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tooManyFiles.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = tooManyFiles.args;
            }
            return tooManyFiles.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final TooManyFiles copy(int recourseId, String args) {
            return new TooManyFiles(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooManyFiles)) {
                return false;
            }
            TooManyFiles tooManyFiles = (TooManyFiles) other;
            return this.recourseId == tooManyFiles.recourseId && Intrinsics.areEqual(this.args, tooManyFiles.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "TooManyFiles(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public TooManyFiles(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ TooManyFiles(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_too_many_files : i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$DangerousEntryName;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DangerousEntryName implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public static /* synthetic */ DangerousEntryName copy$default(DangerousEntryName dangerousEntryName, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dangerousEntryName.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = dangerousEntryName.args;
            }
            return dangerousEntryName.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final DangerousEntryName copy(int recourseId, String args) {
            return new DangerousEntryName(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DangerousEntryName)) {
                return false;
            }
            DangerousEntryName dangerousEntryName = (DangerousEntryName) other;
            return this.recourseId == dangerousEntryName.recourseId && Intrinsics.areEqual(this.args, dangerousEntryName.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DangerousEntryName(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public DangerousEntryName(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ DangerousEntryName(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_dangerous_entry_name : i, str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$TraversalBlocked;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class TraversalBlocked implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public static /* synthetic */ TraversalBlocked copy$default(TraversalBlocked traversalBlocked, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = traversalBlocked.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = traversalBlocked.args;
            }
            return traversalBlocked.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final TraversalBlocked copy(int recourseId, String args) {
            return new TraversalBlocked(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TraversalBlocked)) {
                return false;
            }
            TraversalBlocked traversalBlocked = (TraversalBlocked) other;
            return this.recourseId == traversalBlocked.recourseId && Intrinsics.areEqual(this.args, traversalBlocked.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "TraversalBlocked(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public TraversalBlocked(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ TraversalBlocked(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_traversal_blocked : i, str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$FailedToCreateDir;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class FailedToCreateDir implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public static /* synthetic */ FailedToCreateDir copy$default(FailedToCreateDir failedToCreateDir, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failedToCreateDir.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = failedToCreateDir.args;
            }
            return failedToCreateDir.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final FailedToCreateDir copy(int recourseId, String args) {
            return new FailedToCreateDir(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToCreateDir)) {
                return false;
            }
            FailedToCreateDir failedToCreateDir = (FailedToCreateDir) other;
            return this.recourseId == failedToCreateDir.recourseId && Intrinsics.areEqual(this.args, failedToCreateDir.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FailedToCreateDir(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public FailedToCreateDir(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ FailedToCreateDir(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_failed_to_create_dir : i, str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$UncompressedSizeLimitOver;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class UncompressedSizeLimitOver implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public UncompressedSizeLimitOver() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UncompressedSizeLimitOver copy$default(UncompressedSizeLimitOver uncompressedSizeLimitOver, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = uncompressedSizeLimitOver.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = uncompressedSizeLimitOver.args;
            }
            return uncompressedSizeLimitOver.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final UncompressedSizeLimitOver copy(int recourseId, String args) {
            return new UncompressedSizeLimitOver(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UncompressedSizeLimitOver)) {
                return false;
            }
            UncompressedSizeLimitOver uncompressedSizeLimitOver = (UncompressedSizeLimitOver) other;
            return this.recourseId == uncompressedSizeLimitOver.recourseId && Intrinsics.areEqual(this.args, uncompressedSizeLimitOver.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "UncompressedSizeLimitOver(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public UncompressedSizeLimitOver(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ UncompressedSizeLimitOver(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_uncompressed_size_limit_over : i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SecureUnzipError$FailedToWrite;", "Lcom/medicmedia/medilink/domain/model/SecureUnzipError;", "recourseId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getRecourseId", "()I", "getArgs", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class FailedToWrite implements SecureUnzipError {
        private final String args;
        private final int recourseId;

        public FailedToWrite() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FailedToWrite copy$default(FailedToWrite failedToWrite, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failedToWrite.recourseId;
            }
            if ((i2 & 2) != 0) {
                str = failedToWrite.args;
            }
            return failedToWrite.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRecourseId() {
            return this.recourseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getArgs() {
            return this.args;
        }

        public final FailedToWrite copy(int recourseId, String args) {
            return new FailedToWrite(recourseId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToWrite)) {
                return false;
            }
            FailedToWrite failedToWrite = (FailedToWrite) other;
            return this.recourseId == failedToWrite.recourseId && Intrinsics.areEqual(this.args, failedToWrite.args);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.recourseId) * 31;
            String str = this.args;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FailedToWrite(recourseId=" + this.recourseId + ", args=" + this.args + ")";
        }

        public FailedToWrite(int i, String str) {
            this.recourseId = i;
            this.args = str;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getMessage(Context context) {
            return DefaultImpls.getMessage(this, context);
        }

        public /* synthetic */ FailedToWrite(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.zip_unpack_failed_to_write : i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public int getRecourseId() {
            return this.recourseId;
        }

        @Override // com.medicmedia.medilink.domain.model.SecureUnzipError
        public String getArgs() {
            return this.args;
        }
    }

    /* JADX INFO: compiled from: SecureUnzip.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static String getMessage(SecureUnzipError secureUnzipError, Context context) {
            String string;
            Intrinsics.checkNotNullParameter(context, "context");
            String args = secureUnzipError.getArgs();
            if (args != null && (string = context.getString(secureUnzipError.getRecourseId(), args)) != null) {
                return string;
            }
            String string2 = context.getString(secureUnzipError.getRecourseId());
            Intrinsics.checkNotNullExpressionValue(string2, "run(...)");
            return string2;
        }
    }
}
