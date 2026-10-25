package com.medicmedia.medilink.core.network.cookie;

import android.webkit.CookieManager;
import android.webkit.WebStorage;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.MLConst;
import com.medicmedia.medilink.core.network.BuildConfig;
import com.medicmedia.medilink.util.rate.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppCookie.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/core/network/cookie/AppCookieClient;", "Lcom/medicmedia/medilink/core/network/cookie/AppCookie;", "cookieManager", "Landroid/webkit/CookieManager;", "webStorage", "Landroid/webkit/WebStorage;", "<init>", "(Landroid/webkit/CookieManager;Landroid/webkit/WebStorage;)V", "setAcceptCookie", "", "value", "", "getDomain", "", "toHttpsUrl", "domainOrUrl", "toCookieDomain", "createCookieForAuthorization", "key", "domain", "createCookieForAuthenticatedAt", "getCookie", "url", "setCookie", "flush", "removeAll", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AppCookieClient implements AppCookie {
    private final CookieManager cookieManager;
    private final WebStorage webStorage;

    @Inject
    public AppCookieClient(CookieManager cookieManager, WebStorage webStorage) {
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(webStorage, "webStorage");
        this.cookieManager = cookieManager;
        this.webStorage = webStorage;
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public void setAcceptCookie(boolean value) {
        this.cookieManager.setAcceptCookie(value);
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public String getDomain() {
        return BuildConfig.COOKIE_DOMAIN;
    }

    private final String toHttpsUrl(String domainOrUrl) {
        if (domainOrUrl == null) {
            domainOrUrl = getDomain();
        }
        String string = StringsKt.trim((CharSequence) domainOrUrl).toString();
        if (StringsKt.startsWith$default(string, MLConst.MLCommon.HTTPS_FORMAT, false, 2, (Object) null)) {
            return string;
        }
        if (StringsKt.startsWith$default(string, MLConst.MLCommon.HTTP_FORMAT, false, 2, (Object) null)) {
            return StringsKt.replaceFirst$default(string, MLConst.MLCommon.HTTP_FORMAT, MLConst.MLCommon.HTTPS_FORMAT, false, 4, (Object) null);
        }
        return MLConst.MLCommon.HTTPS_FORMAT + StringsKt.removePrefix(string, (CharSequence) ".");
    }

    private final String toCookieDomain(String domainOrUrl) {
        if (domainOrUrl == null) {
            domainOrUrl = getDomain();
        }
        return StringsKt.removePrefix(StringsKt.removePrefix(domainOrUrl, (CharSequence) MLConst.MLCommon.HTTPS_FORMAT), (CharSequence) MLConst.MLCommon.HTTP_FORMAT);
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public String createCookieForAuthorization(String key, String value, String domain) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Date date = new Date(System.currentTimeMillis() + Time.YEAR);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return key + "=" + value + "; domain=" + toCookieDomain(domain) + "; path=/; Secure; Expires=" + simpleDateFormat.format(date);
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public String createCookieForAuthenticatedAt(String key, String value, String domain) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return key + "=" + value + "; domain=" + toCookieDomain(domain) + "; path=/; Secure; max-age=3600;";
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public String getCookie(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.cookieManager.getCookie(toHttpsUrl(url));
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public void setCookie(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cookieManager.setCookie(toHttpsUrl(getDomain()), value);
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public void setCookie(String domain, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cookieManager.setCookie(toHttpsUrl(domain), value);
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public void flush() {
        this.cookieManager.flush();
    }

    @Override // com.medicmedia.medilink.core.network.cookie.AppCookie
    public void removeAll() {
        this.cookieManager.removeAllCookies(null);
        this.cookieManager.flush();
        this.webStorage.deleteAllData();
    }
}
