package com.medicmedia.medilink.ui.web;

import android.content.Context;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.usecase.WebViewUseCase;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.UIError;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: OtherWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u001e\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0015J\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010&J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/medicmedia/medilink/ui/web/OtherWebViewModel;", "Landroidx/lifecycle/ViewModel;", "webViewUseCase", "Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/web/OtherWebUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialized", "", "setInitialArgsIfNeeded", "", "args", "Lcom/medicmedia/medilink/ui/web/OtherWebViewArgs;", "onPageStarted", "url", "", "onPageFinished", "onProgressChanged", "progress", "", "onReceivedError", "message", "onReceivedTitle", HistoryRepositoryImpl.FieldName.TITLE, "onRefresh", "isExternalBrowser", "handleUrl", "context", "Landroid/content/Context;", "setWebViewAuthCookies", "domain", "authHeader", "", "addAppInfoToUserAgent", "userAgent", "OtherWebViewError", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OtherWebViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<OtherWebUiState> _uiState;
    private boolean initialized;
    private final StateFlow<OtherWebUiState> uiState;
    private final WebViewUseCase webViewUseCase;

    @Inject
    public OtherWebViewModel(WebViewUseCase webViewUseCase) {
        Intrinsics.checkNotNullParameter(webViewUseCase, "webViewUseCase");
        this.webViewUseCase = webViewUseCase;
        MutableStateFlow<OtherWebUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new OtherWebUiState(null, null, null, null, false, false, 0, null, false, 511, null));
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
    }

    public final StateFlow<OtherWebUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: compiled from: OtherWebViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\fB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/web/OtherWebViewModel$OtherWebViewError;", "Lcom/medicmedia/medilink/ui/common/UIError;", "resourceId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getResourceId", "()I", "getArgs", "()Ljava/lang/String;", "OnReceived", "Lcom/medicmedia/medilink/ui/web/OtherWebViewModel$OtherWebViewError$OnReceived;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class OtherWebViewError implements UIError {
        public static final int $stable = 0;
        private final String args;
        private final int resourceId;

        public /* synthetic */ OtherWebViewError(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str);
        }

        private OtherWebViewError(int i, String str) {
            this.resourceId = i;
            this.args = str;
        }

        public /* synthetic */ OtherWebViewError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str, null);
        }

        @Override // com.medicmedia.medilink.ui.common.UIError
        public int getResourceId() {
            return this.resourceId;
        }

        @Override // com.medicmedia.medilink.ui.common.UIError
        public String getArgs() {
            return this.args;
        }

        /* JADX INFO: compiled from: OtherWebViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/web/OtherWebViewModel$OtherWebViewError$OnReceived;", "Lcom/medicmedia/medilink/ui/web/OtherWebViewModel$OtherWebViewError;", QueryParameterKey.CODE, "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class OnReceived extends OtherWebViewError {
            public static final int $stable = 0;
            private final String code;

            public static /* synthetic */ OnReceived copy$default(OnReceived onReceived, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = onReceived.code;
                }
                return onReceived.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            public final OnReceived copy(String code) {
                return new OnReceived(code);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnReceived) && Intrinsics.areEqual(this.code, ((OnReceived) other).code);
            }

            public int hashCode() {
                String str = this.code;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "OnReceived(code=" + this.code + ")";
            }

            public final String getCode() {
                return this.code;
            }

            public OnReceived(String str) {
                super(R.string.other_web_view_on_received, str, null);
                this.code = str;
            }
        }
    }

    public final void setInitialArgsIfNeeded(OtherWebViewArgs args) {
        OtherWebUiState value;
        OtherWebUiState otherWebUiState;
        String url;
        String url2;
        String title;
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.initialized || StringsKt.isBlank(args.getUrl())) {
            return;
        }
        this.initialized = true;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            otherWebUiState = value;
            url = args.getUrl();
            url2 = args.getUrl();
            title = args.getTitle();
            if (title == null) {
                title = "";
            }
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, url, url2, title, null, false, false, 0, null, args.isPrimaryColor(), 248, null)));
    }

    public final void onPageStarted(String url) {
        OtherWebUiState value;
        OtherWebUiState otherWebUiState;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            otherWebUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, null, url == null ? otherWebUiState.getCurrentUrl() : url, null, null, true, false, 0, null, false, 301, null)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    public final void onPageFinished(String url) {
        String str;
        Object objM11499constructorimpl;
        String title;
        MutableStateFlow<OtherWebUiState> mutableStateFlow;
        OtherWebUiState value;
        OtherWebUiState otherWebUiState;
        String currentUrl;
        if (this._uiState.getValue().getTitle().length() > 0) {
            title = this._uiState.getValue().getTitle();
        } else {
            String str2 = url;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    OtherWebViewModel otherWebViewModel = this;
                    objM11499constructorimpl = Result.m11499constructorimpl(Uri.parse(url).getHost());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m11505isFailureimpl(objM11499constructorimpl)) {
                    objM11499constructorimpl = null;
                }
                title = (String) objM11499constructorimpl;
                if (title == null) {
                }
                mutableStateFlow = this._uiState;
                do {
                    value = mutableStateFlow.getValue();
                    otherWebUiState = value;
                    if (url == null) {
                        currentUrl = otherWebUiState.getCurrentUrl();
                    } else {
                        currentUrl = url;
                    }
                } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, null, currentUrl, str, null, false, false, 100, null, false, 393, null)));
            }
            str = "";
            mutableStateFlow = this._uiState;
            do {
                value = mutableStateFlow.getValue();
                otherWebUiState = value;
                if (url == null) {
                    currentUrl = otherWebUiState.getCurrentUrl();
                } else {
                    currentUrl = url;
                }
            } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, null, currentUrl, str, null, false, false, 100, null, false, 393, null)));
        }
        str = title;
        mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            otherWebUiState = value;
            if (url == null) {
                currentUrl = otherWebUiState.getCurrentUrl();
            } else {
                currentUrl = url;
            }
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, null, currentUrl, str, null, false, false, 100, null, false, 393, null)));
    }

    public final void onProgressChanged(int progress) {
        OtherWebUiState value;
        OtherWebUiState otherWebUiState;
        boolean z;
        int iCoerceIn;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            otherWebUiState = value;
            z = false;
            iCoerceIn = RangesKt.coerceIn(progress, 0, 100);
            if (progress >= 0 && progress < 100) {
                z = true;
            }
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(otherWebUiState, null, null, null, null, z, false, iCoerceIn, null, false, 431, null)));
    }

    public final void onReceivedError(String message) {
        OtherWebUiState value;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(value, null, null, null, null, false, false, 0, new OtherWebViewError.OnReceived(message), false, 335, null)));
    }

    public final void onReceivedTitle(String title) {
        if (title == null) {
            return;
        }
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        while (true) {
            OtherWebUiState value = mutableStateFlow.getValue();
            String str = title;
            if (mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(value, null, null, str, null, false, false, 0, null, false, TypedValues.PositionType.TYPE_PERCENT_Y, null))) {
                return;
            } else {
                title = str;
            }
        }
    }

    public final void onRefresh() {
        OtherWebUiState value;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(value, null, null, null, null, false, true, 0, null, false, 479, null)));
    }

    public final boolean isExternalBrowser(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.webViewUseCase.isExternalBrowser(url);
    }

    public final boolean handleUrl(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (!isExternalBrowser(url)) {
            return StringsKt.startsWith$default(url, "medilink-study.com/medilink_app/", false, 2, (Object) null);
        }
        ContextExtensionKt.showExternalBrowser(context, url);
        return true;
    }

    public final void setWebViewAuthCookies(String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.webViewUseCase.setWebViewAuthCookies(domain);
    }

    public final Map<String, String> authHeader() {
        return this.webViewUseCase.authHeader();
    }

    public final String addAppInfoToUserAgent(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        return this.webViewUseCase.addAppInfoToUserAgent(userAgent);
    }
}
