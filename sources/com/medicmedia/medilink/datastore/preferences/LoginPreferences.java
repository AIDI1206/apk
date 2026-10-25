package com.medicmedia.medilink.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.model.BaristaToken;
import com.medicmedia.medilink.datastore.model.BookShelfSortType;
import com.medicmedia.medilink.datastore.model.CryptoClient;
import com.medicmedia.medilink.datastore.model.StringExtensionKt;
import com.medicmedia.medilink.datastore.preferences.di.PreferencesName;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.crypto.AEADBadTagException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: LoginPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bA\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010$\u001a\u00020\r2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0&H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0010\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020(H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\u0010\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u00103\u001a\u00020\u0014H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u00105\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u00020\rH\u0016J\u0010\u00109\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010:\u001a\u00020\u0014H\u0016J\u0010\u0010;\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010<\u001a\u00020\u0014H\u0016J\u0010\u0010=\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\u0014H\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\rH\u0016J\b\u0010C\u001a\u00020\rH\u0016J\b\u0010D\u001a\u00020\rH\u0016J\b\u0010E\u001a\u00020\u0014H\u0016J\b\u0010F\u001a\u00020\u000bH\u0016J\b\u0010G\u001a\u00020\u0018H\u0016J\b\u0010H\u001a\u00020\u000bH\u0016J\b\u0010I\u001a\u00020\u000bH\u0016J\b\u0010J\u001a\u00020\rH\u0016J\b\u0010K\u001a\u00020\u0014H\u0016J\b\u0010L\u001a\u00020\rH\u0016J\b\u0010M\u001a\u00020\u0014H\u0016J\b\u0010N\u001a\u00020\u0014H\u0016J\u0010\u0010O\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010P\u001a\u00020\u0014H\u0016J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010R\u001a\u00020\rH\u0016J\u0010\u0010S\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0018H\u0016J\b\u0010T\u001a\u00020\u0018H\u0016J\b\u0010U\u001a\u00020(H\u0016J\b\u0010V\u001a\u00020(H\u0016J\u0010\u0010W\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0016J\b\u0010X\u001a\u00020\u0014H\u0016J\u0010\u0010Y\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010Z\u001a\u00020\u0014H\u0016J\u0010\u0010[\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010\\\u001a\u00020\u0014H\u0016J\b\u0010]\u001a\u00020\rH\u0016J\b\u0010^\u001a\u00020\u0014H\u0016J\u0010\u0010_\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010`\u001a\u00020(H\u0016J\u0010\u0010a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0016J\b\u0010b\u001a\u00020(H\u0016J\u0010\u0010c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020(H\u0016J\b\u0010d\u001a\u00020\u0014H\u0016J\u0010\u0010e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010f\u001a\u00020\rH\u0016J\n\u0010g\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010h\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010i\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010j\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010k\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010l\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010m\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010o\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010p\u001a\u00020\u0014H\u0016J\b\u0010q\u001a\u00020\u0014H\u0016J\b\u0010r\u001a\u00020\u0014H\u0016J\n\u0010s\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010t\u001a\u00020\u0014H\u0016J\u0010\u0010u\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\n\u0010v\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010w\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010x\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010y\u001a\u00020\u000bH\u0016J\u0010\u0010z\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010{\u001a\u00020\u0014H\u0016J\u0018\u0010|\u001a\u00020\r2\u0006\u0010}\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010~\u001a\u0004\u0018\u00010\u000b2\u0006\u0010}\u001a\u00020\u000bH\u0002J\u0018\u0010\u007f\u001a\u00020\r2\u0006\u0010}\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0018H\u0002J\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00182\u0006\u0010}\u001a\u00020\u000bH\u0002¢\u0006\u0003\u0010\u0081\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/LoginPreferences;", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "cryptoClient", "Lcom/medicmedia/medilink/datastore/model/CryptoClient;", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lcom/medicmedia/medilink/datastore/model/CryptoClient;)V", "refreshToken", "", "setRefreshToken", "", "value", "accessToken", "setAccessToken", "tokenId", "setRefreshTokenTime", "isQrPurchase", "", "baristaAccessToken", "baristaRefreshToken", "baristaAccessExpire", "", "baristaRefreshExpire", "displayContentsId", "qbExeMode", "getMediLinkId", "setMediLinkId", "userId", "setUserId", "userPassword", "versionName", "userInfo", "setUserInfo", "saveUserLoginInfo", "info", "Lkotlin/Pair;", "setLoginUserRole", "", "updateTutorialFlag", "tutorialOfService", "sortMode", "Lcom/medicmedia/medilink/datastore/model/BookShelfSortType;", "setSortMode", "videoFilterMode", "setVideoFilterMode", "mode", "videoStar", "setVideoStarFlag", "videPlayListMode", "getUUIDDeviceKey", "setUUIDDeviceKey", "setStartUpDate", "time", "clearTokenInfo", "setBackgroundVideoPlayback", "backgroundVideoPlayback", "setVideoPlayList", "enableVideoPlayList", "setVideoResume", "enableVideoResume", "saveBaristaToken", "item", "Lcom/medicmedia/medilink/datastore/model/BaristaToken;", "clearBaristaToken", "saveWithdrawalData", "clearWithdrawalData", "isWithdrawal", "withdrawalBaristaToken", "withdrawalLoginTime", "withdrawalTokenId", "withdrawalRefreshToken", "deleteUserInfo", "isTermsOfServiceAccepted", "acceptedTermsOfService", "isAlreadyLogout", "isReviewMode", "setReviewMode", "isSavedCourses", "setSavedCourseFlag", "deleteLoginInfo", "saveAuthenticatedAt", "getAuthenticatedAt", "mainTabIndex", "webViewFontSize", "setWebViewFontSize", "isOnlineSearch", "setOnlineSearch", "isResume", "setResume", "isSkipPdfOpenBrowserConfirm", "setSkipPdfOpenBrowserConfirm", "isOnlyWifi", "setOnlyWifi", "reviewModeUi", "setReviewModeUi", "historyTabIndex", "setHistoryTabIndex", "isMigratedContentsFilter", "setContentsFilterMigrationFlag", "clearLegacyContentsFilter", "contentsBrowsingListFilter", "setContentsBrowsingListFilter", "contentsWritingListFilter", "setContentsWritingListFilter", "contentsSearchListFilter", "setContentsSearchListFilter", "legacyContentsReadFilter", "legacyContentsWriteFilter", "legacyContentsWriteColorFilter", "legacyContentsWriteBookMarkFilter", "legacyContentsWriteMemoFilter", "legacySearchPurchaseFilter", "legacySearchOperationFilter", "isDisplayedSearchTips", "setFlagToDisplaySearchTips", "markerColor", "setMarkerColor", "firstNoteTab", "getNoteParentId", "setDeletedDuplicateTagItemsFlag", "isDeletedDuplicateTagItems", "putSecureString", "key", "getSecureString", "putSecureLong", "getSecureLong", "(Ljava/lang/String;)Ljava/lang/Long;", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LoginPreferences implements LoginDataStore {
    private final Context context;
    private final CryptoClient cryptoClient;
    private final SharedPreferences preferences;

    @Inject
    public LoginPreferences(@ApplicationContext Context context, @Named(PreferencesName.LOGIN) SharedPreferences preferences, CryptoClient cryptoClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(cryptoClient, "cryptoClient");
        this.context = context;
        this.preferences = preferences;
        this.cryptoClient = cryptoClient;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String refreshToken() {
        return this.preferences.getString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH, "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setRefreshToken(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.edit().putString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH, value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String accessToken() {
        return this.preferences.getString(LoginPreferencesKey.COGNITO_TOKEN_ACCESS, "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setAccessToken(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.edit().putString(LoginPreferencesKey.COGNITO_TOKEN_ACCESS, value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String tokenId() {
        return this.preferences.getString(LoginPreferencesKey.COGNITO_TOKEN_ID, "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setRefreshTokenTime(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.edit().putString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH_TIME, value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isQrPurchase() {
        return this.preferences.getBoolean("qr_purchase_check", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String baristaAccessToken() {
        return this.preferences.getString("access_token", "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String baristaRefreshToken() {
        return this.preferences.getString("reflesh_token", "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public long baristaAccessExpire() {
        return this.preferences.getLong("access_token_limit_date", 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public long baristaRefreshExpire() {
        return this.preferences.getLong("reflesh_token_limit_date", 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String displayContentsId() {
        return this.preferences.getString("NOW_DISPLAY_VIDEO_CONTENTS_ID", LoginPreferencesDefault.DISPLAY_VIDEO_CONTENTS_ID);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String qbExeMode() {
        String string = this.preferences.getString("qb_exe_mode", "normal");
        return string == null ? "" : string;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String getMediLinkId() {
        String string = this.preferences.getString("medilink_id", "AND");
        return string == null ? "" : string;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setMediLinkId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("medilink_id", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String userId() {
        return this.preferences.getString("login", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setUserId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("login", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String userPassword() {
        return this.preferences.getString("password", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String versionName() {
        String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        return str == null ? "" : str;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String userInfo() {
        String string = this.preferences.getString("barista_user_info", null);
        if (string != null) {
            return StringExtensionKt.jsonKeysCamelToSnake(string);
        }
        return null;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setUserInfo(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("barista_user_info", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void saveUserLoginInfo(Pair<String, String> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("login", info.getFirst());
        editorEdit.putString("password", info.getSecond());
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setLoginUserRole(int value) {
        this.preferences.edit().putInt("login_user_role", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void updateTutorialFlag(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("tutorial", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean tutorialOfService() {
        return this.preferences.getBoolean("tutorial", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public BookShelfSortType sortMode() {
        BookShelfSortType bookShelfSortTypeRawValue = BookShelfSortType.INSTANCE.rawValue(this.preferences.getInt(LoginPreferencesKey.SORT_MODE, BookShelfSortType.CATEGORY.getValue()));
        if (bookShelfSortTypeRawValue == null) {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            editorEdit.putInt(LoginPreferencesKey.SORT_MODE, BookShelfSortType.CATEGORY.getValue());
            editorEdit.apply();
        }
        return bookShelfSortTypeRawValue == null ? BookShelfSortType.CATEGORY : bookShelfSortTypeRawValue;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setSortMode(int value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putInt(LoginPreferencesKey.SORT_MODE, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public int videoFilterMode() {
        return this.preferences.getInt(LoginPreferencesKey.VIDEO_FILTER_MODE, 0);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setVideoFilterMode(int mode) {
        this.preferences.edit().putInt(LoginPreferencesKey.VIDEO_FILTER_MODE, mode).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean videoStar() {
        return this.preferences.getBoolean("movie_star", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setVideoStarFlag(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("movie_star", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean videPlayListMode() {
        return this.preferences.getBoolean("movie_play_playlist", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String getUUIDDeviceKey() {
        return this.preferences.getString(LoginPreferencesKey.UUID_DEVICE_KEY, "");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setUUIDDeviceKey(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preferences.edit().putString(LoginPreferencesKey.UUID_DEVICE_KEY, value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setStartUpDate(long time) {
        this.preferences.edit().putLong(LoginPreferencesKey.START_UP_DATE, time).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void clearTokenInfo() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(LoginPreferencesKey.COGNITO_JWT_SUB, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_ID, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_ACCESS, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH_TIME, "");
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setBackgroundVideoPlayback(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("video_play_enable_background", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean backgroundVideoPlayback() {
        return this.preferences.getBoolean("video_play_enable_background", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setVideoPlayList(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("movie_play_playlist", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean enableVideoPlayList() {
        return this.preferences.getBoolean("movie_play_playlist", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setVideoResume(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("read_resume_toggle", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean enableVideoResume() {
        return this.preferences.getBoolean("read_resume_toggle", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void saveBaristaToken(BaristaToken item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("access_token", item.getAccessToken());
        editorEdit.putString("reflesh_token", item.getRefreshToken());
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_ID, item.getTokenId());
        editorEdit.putLong("access_token_limit_date", item.getAccessTokenLimit());
        editorEdit.putLong("reflesh_token_limit_date", item.getRefreshTokenLimit());
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void clearBaristaToken() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("access_token", "");
        editorEdit.putString("reflesh_token", "");
        editorEdit.putLong("access_token_limit_date", 0L);
        editorEdit.putLong("reflesh_token_limit_date", 0L);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void saveWithdrawalData() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        String strBaristaAccessToken = baristaAccessToken();
        if (strBaristaAccessToken != null) {
            putSecureString(LoginPreferencesKey.WITHDRAWAL_BARISTA_TOKEN, strBaristaAccessToken);
        }
        String string = this.preferences.getString(LoginPreferencesKey.COGNITO_JWT_SUB, "");
        if (string != null) {
            putSecureString(LoginPreferencesKey.WITHDRAWAL_BARISTA_SUB, string);
        }
        String str = tokenId();
        if (str != null) {
            putSecureString(LoginPreferencesKey.WITHDRAWAL_TOKEN_ID, str);
        }
        String strBaristaRefreshToken = baristaRefreshToken();
        if (strBaristaRefreshToken != null) {
            putSecureString(LoginPreferencesKey.WITHDRAWAL_REFRESH_TOKEN, strBaristaRefreshToken);
        }
        long authenticatedAt = getAuthenticatedAt();
        if (authenticatedAt > 0) {
            putSecureLong(LoginPreferencesKey.WITHDRAWAL_LOGIN_TIME, authenticatedAt);
        }
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void clearWithdrawalData() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove(LoginPreferencesKey.WITHDRAWAL_LOGIN_TIME);
        editorEdit.remove(LoginPreferencesKey.WITHDRAWAL_BARISTA_TOKEN);
        editorEdit.remove(LoginPreferencesKey.WITHDRAWAL_BARISTA_SUB);
        editorEdit.remove(LoginPreferencesKey.WITHDRAWAL_TOKEN_ID);
        editorEdit.remove(LoginPreferencesKey.WITHDRAWAL_REFRESH_TOKEN);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isWithdrawal() {
        String secureString = getSecureString(LoginPreferencesKey.WITHDRAWAL_BARISTA_TOKEN);
        if (secureString != null && secureString.length() > 0) {
            return true;
        }
        String secureString2 = getSecureString(LoginPreferencesKey.WITHDRAWAL_BARISTA_SUB);
        if (secureString2 != null && secureString2.length() > 0) {
            return true;
        }
        String secureString3 = getSecureString(LoginPreferencesKey.WITHDRAWAL_TOKEN_ID);
        if (secureString3 != null && secureString3.length() > 0) {
            return true;
        }
        String secureString4 = getSecureString(LoginPreferencesKey.WITHDRAWAL_REFRESH_TOKEN);
        return secureString4 != null && secureString4.length() > 0;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String withdrawalBaristaToken() {
        String secureString = getSecureString(LoginPreferencesKey.WITHDRAWAL_BARISTA_TOKEN);
        return secureString == null ? "" : secureString;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public long withdrawalLoginTime() {
        Long secureLong = getSecureLong(LoginPreferencesKey.WITHDRAWAL_LOGIN_TIME);
        if (secureLong != null) {
            return secureLong.longValue();
        }
        return 0L;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String withdrawalTokenId() {
        String secureString = getSecureString(LoginPreferencesKey.WITHDRAWAL_TOKEN_ID);
        return secureString == null ? "" : secureString;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String withdrawalRefreshToken() {
        String secureString = getSecureString(LoginPreferencesKey.WITHDRAWAL_REFRESH_TOKEN);
        return secureString == null ? "" : secureString;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void deleteUserInfo() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove("access_token");
        editorEdit.remove("reflesh_token");
        editorEdit.remove("access_token_limit_date");
        editorEdit.remove("reflesh_token_limit_date");
        editorEdit.remove("login");
        editorEdit.remove("password");
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isTermsOfServiceAccepted() {
        return this.preferences.getBoolean("term_of_service", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void acceptedTermsOfService() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("term_of_service", true);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isAlreadyLogout() {
        String string = this.preferences.getString("access_token", "");
        boolean z = (string == null || string.length() == 0) ? false : true;
        String string2 = this.preferences.getString("reflesh_token", "");
        return !z && !(string2 != null && string2.length() != 0) && ((this.preferences.getLong("access_token_limit_date", 0L) > 0L ? 1 : (this.preferences.getLong("access_token_limit_date", 0L) == 0L ? 0 : -1)) == 0) && ((this.preferences.getLong("reflesh_token_limit_date", 0L) > 0L ? 1 : (this.preferences.getLong("reflesh_token_limit_date", 0L) == 0L ? 0 : -1)) == 0);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isReviewMode() {
        return this.preferences.getBoolean("REVIEW_MODE_NEW", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setReviewMode(boolean value) {
        this.preferences.edit().putBoolean("REVIEW_MODE_NEW", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isSavedCourses() {
        return this.preferences.getBoolean(LoginPreferencesKey.SAVED_COURSES, false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setSavedCourseFlag(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(LoginPreferencesKey.SAVED_COURSES, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void deleteLoginInfo() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(LoginPreferencesKey.COGNITO_JWT_SUB, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_ID, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_REFRESH, "");
        editorEdit.putString(LoginPreferencesKey.COGNITO_TOKEN_ACCESS, "");
        editorEdit.putLong(LoginPreferencesKey.COGNITO_TOKEN_REFRESH_TIME, 0L);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void saveAuthenticatedAt(long value) {
        this.preferences.edit().putLong("authenticated_at", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public long getAuthenticatedAt() {
        return this.preferences.getLong("authenticated_at", 0L);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public int mainTabIndex() {
        return this.preferences.getInt("main_tab_index", 0);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public int webViewFontSize() {
        return this.preferences.getInt("webview_font_size", 100);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setWebViewFontSize(int value) {
        this.preferences.edit().putInt("webview_font_size", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isOnlineSearch() {
        return this.preferences.getBoolean("online_search", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setOnlineSearch(boolean value) {
        this.preferences.edit().putBoolean("online_search", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isResume() {
        return this.preferences.getBoolean("read_resume_toggle", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setResume(boolean value) {
        this.preferences.edit().putBoolean("read_resume_toggle", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isSkipPdfOpenBrowserConfirm() {
        return this.preferences.getBoolean(LoginPreferencesKey.PDF_OPEN_BROWSER_SKIP_CONFIRM, false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setSkipPdfOpenBrowserConfirm() {
        this.preferences.edit().putBoolean(LoginPreferencesKey.PDF_OPEN_BROWSER_SKIP_CONFIRM, true).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isOnlyWifi() {
        return this.preferences.getBoolean("only_wifi_download", false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setOnlyWifi(boolean value) {
        this.preferences.edit().putBoolean("only_wifi_download", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public int reviewModeUi() {
        return this.preferences.getInt("review_menu_layout", 0);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setReviewModeUi(int value) {
        this.preferences.edit().putInt("review_menu_layout", value).apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public int historyTabIndex() {
        return this.preferences.getInt("history_tab_index", 0);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setHistoryTabIndex(int value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putInt("history_tab_index", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isMigratedContentsFilter() {
        return this.preferences.getBoolean(LoginPreferencesKey.CONTENTS_FILTER_MIGRATION_FLAG, false);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setContentsFilterMigrationFlag(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(LoginPreferencesKey.CONTENTS_FILTER_MIGRATION_FLAG, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void clearLegacyContentsFilter() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove("read_history_filter");
        editorEdit.remove("read_history_color_filter");
        editorEdit.remove("write_history_filter");
        editorEdit.remove("write_history_color_filter");
        editorEdit.remove("write_history_bookmark_filter");
        editorEdit.remove("write_history_memo_filter");
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String contentsBrowsingListFilter() {
        return this.preferences.getString(LoginPreferencesKey.CONTENTS_BROWSING_LIST_FILTER, null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setContentsBrowsingListFilter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(LoginPreferencesKey.CONTENTS_BROWSING_LIST_FILTER, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String contentsWritingListFilter() {
        return this.preferences.getString(LoginPreferencesKey.CONTENTS_WRITING_LIST_FILTER, null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setContentsWritingListFilter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(LoginPreferencesKey.CONTENTS_WRITING_LIST_FILTER, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String contentsSearchListFilter() {
        return this.preferences.getString(LoginPreferencesKey.CONTENTS_SEARCH_LIST_FILTER, null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setContentsSearchListFilter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(LoginPreferencesKey.CONTENTS_SEARCH_LIST_FILTER, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String legacyContentsReadFilter() {
        return this.preferences.getString("read_history_filter", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String legacyContentsWriteFilter() {
        return this.preferences.getString("write_history_filter", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String legacyContentsWriteColorFilter() {
        return this.preferences.getString("write_history_color_filter", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean legacyContentsWriteBookMarkFilter() {
        return this.preferences.getBoolean("write_history_bookmark_filter", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean legacyContentsWriteMemoFilter() {
        return this.preferences.getBoolean("write_history_memo_filter", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean legacySearchPurchaseFilter() {
        return this.preferences.getBoolean("online_search_purchase", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String legacySearchOperationFilter() {
        return this.preferences.getString("search_filter_and_or", "AND");
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isDisplayedSearchTips() {
        return this.preferences.getBoolean("search_option_first_display", true);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setFlagToDisplaySearchTips(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("search_option_first_display", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String markerColor() {
        return this.preferences.getString("marker_color", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setMarkerColor(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("marker_color", value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String firstNoteTab() {
        return this.preferences.getString("first_note_tab", null);
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public String getNoteParentId() {
        String string = this.preferences.getString("inner_note_default", "first_note_tab");
        return string == null ? "first_note_tab" : string;
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public void setDeletedDuplicateTagItemsFlag(boolean value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean(LoginPreferencesKey.DUPLICATE_TAG_ITEMS_FLAG, value);
        editorEdit.apply();
    }

    @Override // com.medicmedia.medilink.datastore.preferences.LoginDataStore
    public boolean isDeletedDuplicateTagItems() {
        return this.preferences.getBoolean(LoginPreferencesKey.DUPLICATE_TAG_ITEMS_FLAG, false);
    }

    private final void putSecureString(String key, String value) {
        if (value.length() == 0) {
            return;
        }
        CryptoClient cryptoClient = this.cryptoClient;
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncrypt = cryptoClient.encrypt(bytes);
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(key, strEncrypt);
        editorEdit.apply();
    }

    private final String getSecureString(String key) {
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new String(this.cryptoClient.decrypt(string), Charsets.UTF_8);
        } catch (AEADBadTagException unused) {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            editorEdit.remove(key);
            editorEdit.apply();
            return null;
        }
    }

    private final void putSecureLong(String key, long value) {
        CryptoClient cryptoClient = this.cryptoClient;
        byte[] bytes = String.valueOf(value).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncrypt = cryptoClient.encrypt(bytes);
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(key, strEncrypt);
        editorEdit.apply();
    }

    private final Long getSecureLong(String key) {
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(new String(this.cryptoClient.decrypt(string), Charsets.UTF_8)));
        } catch (AEADBadTagException unused) {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            editorEdit.remove(key);
            editorEdit.apply();
            return null;
        }
    }
}
