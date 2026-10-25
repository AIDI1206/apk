package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.medicmedia.medilink.domain.model.WithdrawalAuthItem;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: WebViewUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0014\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;", "", "isMedilinkDomain", "", "host", "", "authHeader", "", "withdrawalAuthHeader", "setWebViewAuthCookies", "", "domain", "setWithdrawalAuthCookies", "item", "Lcom/medicmedia/medilink/domain/model/WithdrawalAuthItem;", "addAppInfoToUserAgent", "userAgent", "isExternalBrowser", "url", "isImageExtensions", TtmlNode.ATTR_TTS_FONT_SIZE, "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface WebViewUseCase {
    String addAppInfoToUserAgent(String userAgent);

    Map<String, String> authHeader();

    int fontSize();

    boolean isExternalBrowser(String url);

    boolean isImageExtensions(String url);

    boolean isMedilinkDomain(String host);

    void setWebViewAuthCookies(String domain);

    void setWithdrawalAuthCookies(WithdrawalAuthItem item, String domain);

    Map<String, String> withdrawalAuthHeader();

    /* JADX INFO: compiled from: WebViewUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void setWebViewAuthCookies$default(WebViewUseCase webViewUseCase, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewAuthCookies");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            webViewUseCase.setWebViewAuthCookies(str);
        }
    }
}
