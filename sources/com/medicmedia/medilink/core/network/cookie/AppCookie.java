package com.medicmedia.medilink.core.network.cookie;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppCookie.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/cookie/AppCookie;", "", "setAcceptCookie", "", "value", "", "getDomain", "", "createCookieForAuthorization", "key", "domain", "createCookieForAuthenticatedAt", "getCookie", "setCookie", "flush", "removeAll", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AppCookie {
    String createCookieForAuthenticatedAt(String key, String value, String domain);

    String createCookieForAuthorization(String key, String value, String domain);

    void flush();

    String getCookie(String key);

    String getDomain();

    void removeAll();

    void setAcceptCookie(boolean value);

    void setCookie(String value);

    void setCookie(String domain, String value);
}
