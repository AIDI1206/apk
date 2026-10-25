package com.medicmedia.medilink.domain.model;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiErrorInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B1\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "Lcom/medicmedia/medilink/domain/model/ApiErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "throwable", "", "<init>", "(IILjava/lang/String;Ljava/lang/Throwable;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "Ap043003Ap042008", "Ap043009Ap042010", "Ap043011Ap042012", "Ap043099", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043003Ap042008;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043009Ap042010;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043011Ap042012;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043099;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class QrPageErrorInfo implements ApiErrorInfo {
    private final String code;
    private final int messageId;
    private final Throwable throwable;
    private final int titleId;

    public /* synthetic */ QrPageErrorInfo(int i, int i2, String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, th);
    }

    private QrPageErrorInfo(int i, int i2, String str, Throwable th) {
        this.titleId = i;
        this.messageId = i2;
        this.code = str;
        this.throwable = th;
    }

    public /* synthetic */ QrPageErrorInfo(int i, int i2, String str, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043003Ap042008;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap043003Ap042008 extends QrPageErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap043003Ap042008() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap043003Ap042008 copy$default(Ap043003Ap042008 ap043003Ap042008, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap043003Ap042008.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap043003Ap042008.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap043003Ap042008.code;
            }
            return ap043003Ap042008.copy(i, i2, str);
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

        public final Ap043003Ap042008 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap043003Ap042008(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap043003Ap042008)) {
                return false;
            }
            Ap043003Ap042008 ap043003Ap042008 = (Ap043003Ap042008) other;
            return this.titleId == ap043003Ap042008.titleId && this.messageId == ap043003Ap042008.messageId && Intrinsics.areEqual(this.code, ap043003Ap042008.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap043003Ap042008(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap043003Ap042008(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.api_error_failed_to_request_title : i, (i3 & 2) != 0 ? R.string.api_error_failed_to_request_message : i2, (i3 & 4) != 0 ? "AP043_003" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap043003Ap042008(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043009Ap042010;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "message", "context", "Landroid/content/Context;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap043009Ap042010 extends QrPageErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap043009Ap042010() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap043009Ap042010 copy$default(Ap043009Ap042010 ap043009Ap042010, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap043009Ap042010.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap043009Ap042010.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap043009Ap042010.code;
            }
            return ap043009Ap042010.copy(i, i2, str);
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

        public final Ap043009Ap042010 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap043009Ap042010(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap043009Ap042010)) {
                return false;
            }
            Ap043009Ap042010 ap043009Ap042010 = (Ap043009Ap042010) other;
            return this.titleId == ap043009Ap042010.titleId && this.messageId == ap043009Ap042010.messageId && Intrinsics.areEqual(this.code, ap043009Ap042010.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap043009Ap042010(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap043009Ap042010(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.contents_error_ready_or_mismatch_title : i, (i3 & 2) != 0 ? R.string.contents_error_ready_or_mismatch_message : i2, (i3 & 4) != 0 ? "AP043_009" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap043009Ap042010(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }

        public final String message(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getString(getMessageId()) + "(" + getCode() + ")";
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043011Ap042012;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "<init>", "(IILjava/lang/String;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap043011Ap042012 extends QrPageErrorInfo {
        private final String code;
        private final int messageId;
        private final int titleId;

        public Ap043011Ap042012() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ Ap043011Ap042012 copy$default(Ap043011Ap042012 ap043011Ap042012, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap043011Ap042012.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap043011Ap042012.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap043011Ap042012.code;
            }
            return ap043011Ap042012.copy(i, i2, str);
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

        public final Ap043011Ap042012 copy(int titleId, int messageId, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap043011Ap042012(titleId, messageId, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap043011Ap042012)) {
                return false;
            }
            Ap043011Ap042012 ap043011Ap042012 = (Ap043011Ap042012) other;
            return this.titleId == ap043011Ap042012.titleId && this.messageId == ap043011Ap042012.messageId && Intrinsics.areEqual(this.code, ap043011Ap042012.code);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode();
        }

        public String toString() {
            return "Ap043011Ap042012(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ")";
        }

        public /* synthetic */ Ap043011Ap042012(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.api_error_offline_title : i, (i3 & 2) != 0 ? R.string.api_error_offline_message : i2, (i3 & 4) != 0 ? "AP043_011" : str);
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap043011Ap042012(int i, int i2, String code) {
            super(i, i2, code, null, 8, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
        }
    }

    /* JADX INFO: compiled from: ApiErrorInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo$Ap043099;", "Lcom/medicmedia/medilink/domain/model/QrPageErrorInfo;", "titleId", "", "messageId", QueryParameterKey.CODE, "", "throwable", "", "<init>", "(IILjava/lang/String;Ljava/lang/Throwable;)V", "getTitleId", "()I", "getMessageId", "getCode", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Ap043099 extends QrPageErrorInfo {
        private final String code;
        private final int messageId;
        private final Throwable throwable;
        private final int titleId;

        public static /* synthetic */ Ap043099 copy$default(Ap043099 ap043099, int i, int i2, String str, Throwable th, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ap043099.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = ap043099.messageId;
            }
            if ((i3 & 4) != 0) {
                str = ap043099.code;
            }
            if ((i3 & 8) != 0) {
                th = ap043099.throwable;
            }
            return ap043099.copy(i, i2, str, th);
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

        public final Ap043099 copy(int titleId, int messageId, String code, Throwable throwable) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new Ap043099(titleId, messageId, code, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ap043099)) {
                return false;
            }
            Ap043099 ap043099 = (Ap043099) other;
            return this.titleId == ap043099.titleId && this.messageId == ap043099.messageId && Intrinsics.areEqual(this.code, ap043099.code) && Intrinsics.areEqual(this.throwable, ap043099.throwable);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.messageId)) * 31) + this.code.hashCode()) * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Ap043099(titleId=" + this.titleId + ", messageId=" + this.messageId + ", code=" + this.code + ", throwable=" + this.throwable + ")";
        }

        public /* synthetic */ Ap043099(int i, int i2, String str, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.unknown_error_title : i, (i3 & 2) != 0 ? R.string.unknown_error_message : i2, (i3 & 4) != 0 ? "AP043_099" : str, th);
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getTitleId() {
            return this.titleId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public String getCode() {
            return this.code;
        }

        @Override // com.medicmedia.medilink.domain.model.QrPageErrorInfo, com.medicmedia.medilink.domain.model.ApiErrorInfo
        public Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ap043099(int i, int i2, String code, Throwable th) {
            super(i, i2, code, th, null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.titleId = i;
            this.messageId = i2;
            this.code = code;
            this.throwable = th;
        }
    }
}
