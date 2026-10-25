package com.medicmedia.medilink.ui.login;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.domain.usecase.WebViewUseCase;
import com.medicmedia.medilink.ui.web.OtherWebUiState;
import com.medicmedia.medilink.ui.web.OtherWebViewArgs;
import com.medicmedia.medilink.ui.web.OtherWebViewModel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: WithdrawalWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0017J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/ui/login/WithdrawalWebViewModel;", "Landroidx/lifecycle/ViewModel;", "launchUseCase", "Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;", "webViewUseCase", "Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/web/OtherWebUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialized", "", "setInitialArgsIfNeeded", "", "args", "Lcom/medicmedia/medilink/ui/web/OtherWebViewArgs;", "onPageStarted", "url", "", "onPageFinished", "onProgressChanged", "progress", "", "onReceivedTitle", HistoryRepositoryImpl.FieldName.TITLE, "onReceivedError", "message", "addAppInfoToUserAgent", "userAgent", "setCookies", "isMedilinkDomain", "host", "authHeader", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class WithdrawalWebViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<OtherWebUiState> _uiState;
    private boolean initialized;
    private final LaunchUseCase launchUseCase;
    private final StateFlow<OtherWebUiState> uiState;
    private final WebViewUseCase webViewUseCase;

    @Inject
    public WithdrawalWebViewModel(LaunchUseCase launchUseCase, WebViewUseCase webViewUseCase) {
        Intrinsics.checkNotNullParameter(launchUseCase, "launchUseCase");
        Intrinsics.checkNotNullParameter(webViewUseCase, "webViewUseCase");
        this.launchUseCase = launchUseCase;
        this.webViewUseCase = webViewUseCase;
        MutableStateFlow<OtherWebUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new OtherWebUiState(null, null, null, null, false, false, 0, null, false, 511, null));
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
    }

    public final StateFlow<OtherWebUiState> getUiState() {
        return this.uiState;
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
                    WithdrawalWebViewModel withdrawalWebViewModel = this;
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

    public final void onReceivedError(String message) {
        OtherWebUiState value;
        MutableStateFlow<OtherWebUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OtherWebUiState.copy$default(value, null, null, null, null, false, false, 0, new OtherWebViewModel.OtherWebViewError.OnReceived(message), false, 335, null)));
    }

    public final String addAppInfoToUserAgent(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        return this.webViewUseCase.addAppInfoToUserAgent(userAgent);
    }

    public final void setCookies() {
        this.webViewUseCase.setWithdrawalAuthCookies(this.launchUseCase.withdrawalAuthItem(), null);
    }

    public final boolean isMedilinkDomain(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.webViewUseCase.isMedilinkDomain(host);
    }

    public final Map<String, String> authHeader() {
        return this.webViewUseCase.withdrawalAuthHeader();
    }
}
