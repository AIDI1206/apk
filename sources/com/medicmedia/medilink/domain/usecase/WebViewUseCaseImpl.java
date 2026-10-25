package com.medicmedia.medilink.domain.usecase;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.medicmedia.medilink.core.network.cookie.AppCookie;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import com.medicmedia.medilink.domain.AppInnerUrl;
import com.medicmedia.medilink.domain.AppUserAgent;
import com.medicmedia.medilink.domain.UriSchema;
import com.medicmedia.medilink.domain.WebViewKeyValue;
import com.medicmedia.medilink.domain.model.WithdrawalAuthItem;
import java.net.URI;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.zeroturnaround.zip.commons.FilenameUtils;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: compiled from: WebViewUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\u000f\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/WebViewUseCaseImpl;", "Lcom/medicmedia/medilink/domain/usecase/WebViewUseCase;", "appCookie", "Lcom/medicmedia/medilink/core/network/cookie/AppCookie;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "<init>", "(Lcom/medicmedia/medilink/core/network/cookie/AppCookie;Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;)V", "isMedilinkDomain", "", "host", "", "authHeader", "", "withdrawalAuthHeader", "setWebViewAuthCookies", "", "domain", "setWithdrawalAuthCookies", "item", "Lcom/medicmedia/medilink/domain/model/WithdrawalAuthItem;", "accessToken", "loginTime", "", "addAppInfoToUserAgent", "userAgent", "isExternalBrowser", "url", "isImageExtensions", TtmlNode.ATTR_TTS_FONT_SIZE, "", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class WebViewUseCaseImpl implements WebViewUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> IMAGE_EXTENSIONS = SetsKt.setOf((Object[]) new String[]{"jpg", "jpeg", "png", "gif", "webp", "bmp", "svg", "heic", "heif", "avif"});
    private final AppCookie appCookie;
    private final LoginDataStore loginDataStore;

    @Inject
    public WebViewUseCaseImpl(AppCookie appCookie, LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(appCookie, "appCookie");
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        this.appCookie = appCookie;
        this.loginDataStore = loginDataStore;
    }

    /* JADX INFO: compiled from: WebViewUseCase.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/WebViewUseCaseImpl$Companion;", "", "<init>", "()V", "IMAGE_EXTENSIONS", "", "", "getIMAGE_EXTENSIONS", "()Ljava/util/Set;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getIMAGE_EXTENSIONS() {
            return WebViewUseCaseImpl.IMAGE_EXTENSIONS;
        }
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public boolean isMedilinkDomain(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        String str = host;
        String domain = this.appCookie.getDomain();
        if (domain == null) {
            domain = "";
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) domain, false, 2, (Object) null);
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public Map<String, String> authHeader() {
        String strBaristaAccessToken = this.loginDataStore.baristaAccessToken();
        if (strBaristaAccessToken == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(WebViewKeyValue.Authorization.getValue(), Arrays.copyOf(new Object[]{strBaristaAccessToken}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return MapsKt.mapOf(TuplesKt.to(WebViewKeyValue.Authorization.getKey(), str));
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public Map<String, String> withdrawalAuthHeader() {
        String strWithdrawalBaristaToken = this.loginDataStore.withdrawalBaristaToken();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(WebViewKeyValue.Authorization.getValue(), Arrays.copyOf(new Object[]{strWithdrawalBaristaToken}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return MapsKt.mapOf(TuplesKt.to(WebViewKeyValue.Authorization.getKey(), str));
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public void setWebViewAuthCookies(String domain) {
        setWebViewAuthCookies(this.loginDataStore.baristaAccessToken(), this.loginDataStore.getAuthenticatedAt(), domain);
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public void setWithdrawalAuthCookies(WithdrawalAuthItem item, String domain) {
        Intrinsics.checkNotNullParameter(item, "item");
        setWebViewAuthCookies(item.getBaristaToken(), item.getLoginTime(), domain);
    }

    private final void setWebViewAuthCookies(String accessToken, long loginTime, String domain) {
        this.appCookie.setAcceptCookie(true);
        AppCookie appCookie = this.appCookie;
        String key = WebViewKeyValue.Authorization.getKey();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(WebViewKeyValue.Authorization.getValue(), Arrays.copyOf(new Object[]{accessToken}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.appCookie.setCookie(appCookie.createCookieForAuthorization(key, str, domain));
        AppCookie appCookie2 = this.appCookie;
        String key2 = WebViewKeyValue.AuthenticatedAt.getKey();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(WebViewKeyValue.AuthenticatedAt.getValue(), Arrays.copyOf(new Object[]{Long.valueOf(loginTime)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.appCookie.setCookie(appCookie2.createCookieForAuthenticatedAt(key2, str2, domain));
        this.appCookie.flush();
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public String addAppInfoToUserAgent(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(AppUserAgent.VALUE, Arrays.copyOf(new Object[]{this.loginDataStore.versionName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return userAgent + " " + str;
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public boolean isImageExtensions(String url) {
        Object objM11499constructorimpl;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            WebViewUseCaseImpl webViewUseCaseImpl = this;
            objM11499constructorimpl = Result.m11499constructorimpl(new URI(url).getPath());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11505isFailureimpl(objM11499constructorimpl)) {
            objM11499constructorimpl = null;
        }
        String str = (String) objM11499constructorimpl;
        if (str == null) {
            return false;
        }
        String strSubstringAfterLast = StringsKt.substringAfterLast(StringsKt.substringAfterLast(str, IOUtils.DIR_SEPARATOR_UNIX, ""), FilenameUtils.EXTENSION_SEPARATOR, "");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strSubstringAfterLast.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase.length() > 0 && IMAGE_EXTENSIONS.contains(lowerCase);
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public int fontSize() {
        return this.loginDataStore.webViewFontSize();
    }

    @Override // com.medicmedia.medilink.domain.usecase.WebViewUseCase
    public boolean isExternalBrowser(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        if (UriSchema.INSTANCE.isExternalBrowser(uri)) {
            return true;
        }
        String host = uri.getHost();
        if (host != null) {
            if (StringsKt.contains$default((CharSequence) host, (CharSequence) (AppInnerUrl.INFO_HTTPS.getValue() + this.appCookie.getDomain()), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
