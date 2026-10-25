package com.medicmedia.medilink.datastore.preferences;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.model.BaristaToken;
import com.medicmedia.medilink.datastore.model.BookShelfSortType;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: LoginPreferences.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b;\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001c\u0010\u001c\u001a\u00020\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010\"\u001a\u00020\fH&J\b\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H&J\b\u0010&\u001a\u00020 H&J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020 H&J\b\u0010)\u001a\u00020\fH&J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010+\u001a\u00020\fH&J\n\u0010,\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0010H&J\b\u00100\u001a\u00020\u0005H&J\u0010\u00101\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u00102\u001a\u00020\fH&J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u00104\u001a\u00020\fH&J\u0010\u00105\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u00106\u001a\u00020\fH&J\u0010\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u000209H&J\b\u0010:\u001a\u00020\u0005H&J\b\u0010;\u001a\u00020\u0005H&J\b\u0010<\u001a\u00020\u0005H&J\b\u0010=\u001a\u00020\fH&J\b\u0010>\u001a\u00020\u0003H&J\b\u0010?\u001a\u00020\u0010H&J\b\u0010@\u001a\u00020\u0003H&J\b\u0010A\u001a\u00020\u0003H&J\b\u0010B\u001a\u00020\u0005H&J\b\u0010C\u001a\u00020\u0005H&J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H&J\b\u0010E\u001a\u00020\u0010H&J\b\u0010F\u001a\u00020 H&J\b\u0010G\u001a\u00020\fH&J\b\u0010H\u001a\u00020\fH&J\b\u0010I\u001a\u00020\u0005H&J\b\u0010J\u001a\u00020\fH&J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010L\u001a\u00020\fH&J\u0010\u0010M\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010N\u001a\u00020 H&J\u0010\u0010O\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H&J\b\u0010P\u001a\u00020\fH&J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010R\u001a\u00020\fH&J\u0010\u0010S\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010T\u001a\u00020\fH&J\b\u0010U\u001a\u00020\u0005H&J\b\u0010V\u001a\u00020\fH&J\u0010\u0010W\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010X\u001a\u00020 H&J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H&J\b\u0010Z\u001a\u00020 H&J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020 H&J\b\u0010\\\u001a\u00020\fH&J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010^\u001a\u00020\u0005H&J\n\u0010_\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010a\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010c\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010e\u001a\u00020\fH&J\u0010\u0010f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\n\u0010g\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010h\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010i\u001a\u0004\u0018\u00010\u0003H&J\b\u0010j\u001a\u00020\u0003H&J\u0010\u0010k\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J\b\u0010l\u001a\u00020\fH&J\n\u0010m\u001a\u0004\u0018\u00010\u0003H&J\n\u0010n\u001a\u0004\u0018\u00010\u0003H&J\n\u0010o\u001a\u0004\u0018\u00010\u0003H&J\b\u0010p\u001a\u00020\fH&J\b\u0010q\u001a\u00020\fH&J\b\u0010r\u001a\u00020\fH&J\n\u0010s\u001a\u0004\u0018\u00010\u0003H&¨\u0006t"}, d2 = {"Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "", "refreshToken", "", "setRefreshToken", "", "value", "accessToken", "setAccessToken", "tokenId", "setRefreshTokenTime", "isQrPurchase", "", "baristaAccessToken", "baristaRefreshToken", "baristaAccessExpire", "", "baristaRefreshExpire", "displayContentsId", "qbExeMode", "getMediLinkId", "setMediLinkId", "userId", "setUserId", "userPassword", "versionName", "userInfo", "setUserInfo", "saveUserLoginInfo", "info", "Lkotlin/Pair;", "setLoginUserRole", "", "updateTutorialFlag", "tutorialOfService", "sortMode", "Lcom/medicmedia/medilink/datastore/model/BookShelfSortType;", "setSortMode", "videoFilterMode", "setVideoFilterMode", "mode", "videoStar", "setVideoStarFlag", "videPlayListMode", "getUUIDDeviceKey", "setUUIDDeviceKey", "setStartUpDate", "time", "clearTokenInfo", "setBackgroundVideoPlayback", "backgroundVideoPlayback", "setVideoPlayList", "enableVideoPlayList", "setVideoResume", "enableVideoResume", "saveBaristaToken", "item", "Lcom/medicmedia/medilink/datastore/model/BaristaToken;", "clearBaristaToken", "saveWithdrawalData", "clearWithdrawalData", "isWithdrawal", "withdrawalBaristaToken", "withdrawalLoginTime", "withdrawalTokenId", "withdrawalRefreshToken", "deleteUserInfo", "deleteLoginInfo", "saveAuthenticatedAt", "getAuthenticatedAt", "mainTabIndex", "isAlreadyLogout", "isTermsOfServiceAccepted", "acceptedTermsOfService", "isSavedCourses", "setSavedCourseFlag", "isReviewMode", "setReviewMode", "webViewFontSize", "setWebViewFontSize", "isOnlineSearch", "setOnlineSearch", "isResume", "setResume", "isSkipPdfOpenBrowserConfirm", "setSkipPdfOpenBrowserConfirm", "isOnlyWifi", "setOnlyWifi", "reviewModeUi", "setReviewModeUi", "historyTabIndex", "setHistoryTabIndex", "isMigratedContentsFilter", "setContentsFilterMigrationFlag", "clearLegacyContentsFilter", "contentsBrowsingListFilter", "setContentsBrowsingListFilter", "contentsWritingListFilter", "setContentsWritingListFilter", "contentsSearchListFilter", "setContentsSearchListFilter", "isDisplayedSearchTips", "setFlagToDisplaySearchTips", "markerColor", "setMarkerColor", "firstNoteTab", "getNoteParentId", "setDeletedDuplicateTagItemsFlag", "isDeletedDuplicateTagItems", "legacyContentsReadFilter", "legacyContentsWriteFilter", "legacyContentsWriteColorFilter", "legacyContentsWriteBookMarkFilter", "legacyContentsWriteMemoFilter", "legacySearchPurchaseFilter", "legacySearchOperationFilter", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LoginDataStore {
    void acceptedTermsOfService();

    String accessToken();

    boolean backgroundVideoPlayback();

    long baristaAccessExpire();

    String baristaAccessToken();

    long baristaRefreshExpire();

    String baristaRefreshToken();

    void clearBaristaToken();

    void clearLegacyContentsFilter();

    void clearTokenInfo();

    void clearWithdrawalData();

    String contentsBrowsingListFilter();

    String contentsSearchListFilter();

    String contentsWritingListFilter();

    void deleteLoginInfo();

    void deleteUserInfo();

    String displayContentsId();

    boolean enableVideoPlayList();

    boolean enableVideoResume();

    String firstNoteTab();

    long getAuthenticatedAt();

    String getMediLinkId();

    String getNoteParentId();

    String getUUIDDeviceKey();

    int historyTabIndex();

    boolean isAlreadyLogout();

    boolean isDeletedDuplicateTagItems();

    boolean isDisplayedSearchTips();

    boolean isMigratedContentsFilter();

    boolean isOnlineSearch();

    boolean isOnlyWifi();

    boolean isQrPurchase();

    boolean isResume();

    boolean isReviewMode();

    boolean isSavedCourses();

    boolean isSkipPdfOpenBrowserConfirm();

    boolean isTermsOfServiceAccepted();

    boolean isWithdrawal();

    String legacyContentsReadFilter();

    boolean legacyContentsWriteBookMarkFilter();

    String legacyContentsWriteColorFilter();

    String legacyContentsWriteFilter();

    boolean legacyContentsWriteMemoFilter();

    String legacySearchOperationFilter();

    boolean legacySearchPurchaseFilter();

    int mainTabIndex();

    String markerColor();

    String qbExeMode();

    String refreshToken();

    int reviewModeUi();

    void saveAuthenticatedAt(long value);

    void saveBaristaToken(BaristaToken item);

    void saveUserLoginInfo(Pair<String, String> info);

    void saveWithdrawalData();

    void setAccessToken(String value);

    void setBackgroundVideoPlayback(boolean value);

    void setContentsBrowsingListFilter(String value);

    void setContentsFilterMigrationFlag(boolean value);

    void setContentsSearchListFilter(String value);

    void setContentsWritingListFilter(String value);

    void setDeletedDuplicateTagItemsFlag(boolean value);

    void setFlagToDisplaySearchTips(boolean value);

    void setHistoryTabIndex(int value);

    void setLoginUserRole(int value);

    void setMarkerColor(String value);

    void setMediLinkId(String value);

    void setOnlineSearch(boolean value);

    void setOnlyWifi(boolean value);

    void setRefreshToken(String value);

    void setRefreshTokenTime(String value);

    void setResume(boolean value);

    void setReviewMode(boolean value);

    void setReviewModeUi(int value);

    void setSavedCourseFlag(boolean value);

    void setSkipPdfOpenBrowserConfirm();

    void setSortMode(int value);

    void setStartUpDate(long time);

    void setUUIDDeviceKey(String value);

    void setUserId(String value);

    void setUserInfo(String value);

    void setVideoFilterMode(int mode);

    void setVideoPlayList(boolean value);

    void setVideoResume(boolean value);

    void setVideoStarFlag(boolean value);

    void setWebViewFontSize(int value);

    BookShelfSortType sortMode();

    String tokenId();

    boolean tutorialOfService();

    void updateTutorialFlag(boolean value);

    String userId();

    String userInfo();

    String userPassword();

    String versionName();

    boolean videPlayListMode();

    int videoFilterMode();

    boolean videoStar();

    int webViewFontSize();

    String withdrawalBaristaToken();

    long withdrawalLoginTime();

    String withdrawalRefreshToken();

    String withdrawalTokenId();
}
