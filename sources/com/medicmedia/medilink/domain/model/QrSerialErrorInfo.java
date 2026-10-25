package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiErrorInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B1\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "Lcom/medicmedia/medilink/domain/model/ApiErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "throwable", "", "<init>", "(IILjava/lang/String;Ljava/lang/Throwable;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "Ap042001", "Ap042002Ap042007", "Ap042008", "Ap042099", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042001;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042002Ap042007;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042008;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042099;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class QrSerialErrorInfo implements ApiErrorInfo {
    private final String code;
    private final int messageId;
    private final Throwable throwable;
    private final int titleId;

    public /* synthetic */ QrSerialErrorInfo(int i, int i2, String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, th);
    }

    private QrSerialErrorInfo(int i, int i2, String str, Throwable th) {
        this.titleId = i;
        this.messageId = i2;
        this.code = str;
        this.throwable = th;
    }

    public /* synthetic */ QrSerialErrorInfo(int i, int i2, String str, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? null : th, null);
    }

    @Override // com.medicmedia.medilink.domain.model.ApiErrorInfo
    public int getTitleId() {
        return this.titleId;
    }

    @Override // com.medicmedia.medilink.domain.model.ApiErrorInfo
    public int getMessageId() {
        return this.messageId;
    }

    @Override // com.medicmedia.medilink.domain.model.ApiErrorInfo
    public String getCode() {
        return this.code;
    }

    @Override // com.medicmedia.medilink.domain.model.ApiErrorInfo
    public Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042001;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap042001 extends QrSerialErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap042001() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap042001 copy$default(Ap042001 ap042001, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap042001.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap042001.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap042001.code;
            }
            return ap042001.copy(i, i2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Ap042001 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap042001(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap042001)) {
                return false;
            }
            Ap042001 ap042001 = (Ap042001) other;
            return this.titleId == ap042001.titleId && this.messageId == ap042001.messageId && Intrinsics.areEqual(this.code, ap042001.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap042001(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap042001(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.api_error_offline_title : i, (i3 & 2) != 0 ? R.string.api_error_offline_message : i2, (i3 & 4) != 0 ? "AP042_001" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap042001(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042002Ap042007;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap042002Ap042007 extends QrSerialErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap042002Ap042007() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap042002Ap042007 copy$default(Ap042002Ap042007 ap042002Ap042007, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap042002Ap042007.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap042002Ap042007.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap042002Ap042007.code;
            }
            return ap042002Ap042007.copy(i, i2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Ap042002Ap042007 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap042002Ap042007(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap042002Ap042007)) {
                return false;
            }
            Ap042002Ap042007 ap042002Ap042007 = (Ap042002Ap042007) other;
            return this.titleId == ap042002Ap042007.titleId && this.messageId == ap042002Ap042007.messageId && Intrinsics.areEqual(this.code, ap042002Ap042007.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap042002Ap042007(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap042002Ap042007(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.api_error_failed_to_request_title : i, (i3 & 2) != 0 ? R.string.api_error_failed_to_request_message : i2, (i3 & 4) != 0 ? "AP042_002" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap042002Ap042007(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042008;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap042008 extends QrSerialErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap042008() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap042008 copy$default(Ap042008 ap042008, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap042008.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap042008.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap042008.code;
            }
            return ap042008.copy(i, i2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Ap042008 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap042008(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap042008)) {
                return false;
            }
            Ap042008 ap042008 = (Ap042008) other;
            return this.titleId == ap042008.titleId && this.messageId == ap042008.messageId && Intrinsics.areEqual(this.code, ap042008.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap042008(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap042008(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.db_error_failed_to_connect_title : i, (i3 & 2) != 0 ? R.string.db_error_failed_to_connect_message : i2, (i3 & 4) != 0 ? "AP042_008" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap042008(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo$Ap042099;", "Lcom/medicmedia/medilink/domain/model/QrSerialErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "throwable", "", "<init>", "(IILjava/lang/String;Ljava/lang/Throwable;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap042099 extends QrSerialErrorInfo {
        private final String code;
        private final int messageId;
        private final Throwable throwable;
        private final int titleId;

        public static /* synthetic */ Ap042099 copy$default(Ap042099 ap042099, int i, int i2, String str, Throwable th, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap042099.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap042099.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap042099.code;
            }
            if ((i3 & 8) != 0) {
                th = ap042099.throwable;
            }
            return ap042099.copy(i, i2, str, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Ap042099 copy(int titleId, int messageId, String code, Throwable throwable) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap042099(titleId, messageId, code, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap042099)) {
                return false;
            }
            Ap042099 ap042099 = (Ap042099) other;
            return this.titleId == ap042099.titleId && this.messageId == ap042099.messageId && Intrinsics.areEqual(this.code, ap042099.code) && Intrinsics.areEqual(this.throwable, ap042099.throwable);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode()) * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Ap042099(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ", throwable=" + this.throwable + ")";
        }

        public /* synthetic */ Ap042099(int i, int i2, String str, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.unknown_error_title : i, (i3 & 2) != 0 ? R.string.unknown_error_message : i2, (i3 & 4) != 0 ? "AP042_099" : str, th);
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        @Override // com.medicmedia.medilink.domain.model.QrSerialErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap042099(int i, int i2, String code, Throwable th) {
            super(i, i2, code, th, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
            this.throwable = th;
        }
    }
}
