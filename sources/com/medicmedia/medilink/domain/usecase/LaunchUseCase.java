package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.core.network.api.BaristaTokenGrantType;
import com.medicmedia.medilink.datastore.model.BaristaToken;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.model.ApiCommon;
import com.medicmedia.medilink.domain.model.ApiLog;
import com.medicmedia.medilink.domain.model.BaristaUserInfo;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.model.CourseLicenseItems;
import com.medicmedia.medilink.domain.model.DeviceItem;
import com.medicmedia.medilink.domain.model.NewsList;
import com.medicmedia.medilink.domain.model.WithdrawalAuthItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: LaunchUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000bJ \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH¦@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H¦@¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u001c0\u000fH¦@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH¦@¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H¦@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H¦@¢\u0006\u0002\u0010%J\u001c\u0010'\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H¦@¢\u0006\u0002\u0010%J\u0016\u0010(\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\rH¦@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0007H&J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#H&J\b\u00104\u001a\u00020\u0015H&J\b\u00105\u001a\u00020\u0015H&J\b\u00106\u001a\u00020#H&J\b\u00107\u001a\u00020#H&J\b\u00108\u001a\u00020#H&J\b\u00109\u001a\u00020#H&J\u0010\u0010:\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0007H&J\n\u0010=\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\nH&J\u0010\u0010?\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0007H&J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0007H&J\b\u0010A\u001a\u00020\u0007H&J\b\u0010B\u001a\u00020#H&J\b\u0010C\u001a\u00020\u0015H&J\u001c\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020#2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0007H&J\b\u0010G\u001a\u00020#H&J\b\u0010H\u001a\u00020\u0015H&J\u000e\u0010I\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\u000e\u0010J\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\u000e\u0010K\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010\u000bJ\b\u0010L\u001a\u00020#H&J\b\u0010M\u001a\u00020#H&J\b\u0010N\u001a\u00020#H&J\b\u0010O\u001a\u00020#H&J\b\u0010P\u001a\u00020QH&J\b\u0010R\u001a\u00020SH&¨\u0006T"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;", "", "baristaToken", "Lcom/medicmedia/medilink/datastore/model/BaristaToken;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;", QueryParameterKey.CODE, "", "(Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baristaUserInfo", "Lcom/medicmedia/medilink/domain/model/BaristaUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startUp", "Lcom/medicmedia/medilink/domain/model/ApiCommon;", "getContents", "Lkotlin/Pair;", "", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "devices", "Lcom/medicmedia/medilink/domain/model/DeviceItem;", "deleteDevice", "", "deviceId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseLicense", "Lcom/medicmedia/medilink/domain/model/CourseLicenseItems;", "contentsLogin", "getNewsList", "Lcom/medicmedia/medilink/domain/model/NewsList;", "userActionLog", "item", "Lcom/medicmedia/medilink/domain/model/ApiLog;", "(Lcom/medicmedia/medilink/domain/model/ApiLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteShouldExcludedBookShelfItems", "saveBookShelfItems", "", FirebaseAnalytics.Param.ITEMS, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePurchaseContents", "updatePurchaseContentsField", "saveMovieLicenseItems", "(Lcom/medicmedia/medilink/domain/model/CourseLicenseItems;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveApiCommonInfo", "common", "(Lcom/medicmedia/medilink/domain/model/ApiCommon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsList", "(Lcom/medicmedia/medilink/domain/model/NewsList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSettingRealmItems", "isUpdateApp", "serverAppVersion", "isSkipLogRequest", "isUpdate", "setStartUpExpireTime", "clearAccountTokenInfo", "isLoggingIn", "isEnableNetwork", "isEnableAccessToken", "isEnableRefreshToken", "saveBaristaToken", "setUserId", "value", "userId", "setUserInfo", "saveUserLoginInfo", "setMediLinkId", "mediLinkId", "shouldShowTutorial", "completeTutorial", "sendLoginResult", "isSuccess", "errorMessage", "isNeedTpUpdateUserInfo", "deleteLoginInfo", "deleteDuplicateTagItems", "deleteUnpackedDownloadZipFiles", "saveHistoryItemRealm", "isFirstLoadContents", "isAlreadyLogout", "shouldForcedUpdate", "isWithdrawal", "withdrawalAuthItem", "Lcom/medicmedia/medilink/domain/model/WithdrawalAuthItem;", "mainTabIndex", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LaunchUseCase {
    Object baristaToken(BaristaTokenGrantType baristaTokenGrantType, String str, Continuation<? super BaristaToken> continuation);

    Object baristaUserInfo(Continuation<? super BaristaUserInfo> continuation);

    void clearAccountTokenInfo();

    void completeTutorial();

    Object contentsLogin(Continuation<? super Unit> continuation);

    Object deleteDevice(String str, Continuation<? super Unit> continuation);

    Object deleteDuplicateTagItems(Continuation<? super Unit> continuation);

    void deleteLoginInfo();

    Object deleteSettingRealmItems(Continuation<? super Unit> continuation);

    Object deleteShouldExcludedBookShelfItems(Continuation<? super Unit> continuation);

    Object deleteUnpackedDownloadZipFiles(Continuation<? super Unit> continuation);

    Object devices(Continuation<? super List<DeviceItem>> continuation);

    Object getContents(Continuation<? super Pair<ApiCommon, ? extends List<BookShelfViewItem>>> continuation);

    Object getCourseLicense(Continuation<? super CourseLicenseItems> continuation);

    Object getNewsList(Continuation<? super Pair<ApiCommon, NewsList>> continuation);

    boolean isAlreadyLogout();

    boolean isEnableAccessToken();

    boolean isEnableNetwork();

    boolean isEnableRefreshToken();

    boolean isFirstLoadContents();

    boolean isLoggingIn();

    boolean isNeedTpUpdateUserInfo();

    boolean isSkipLogRequest(boolean isUpdate);

    boolean isUpdateApp(String serverAppVersion);

    boolean isWithdrawal();

    int mainTabIndex();

    String mediLinkId();

    Object saveApiCommonInfo(ApiCommon apiCommon, Continuation<? super Unit> continuation);

    void saveBaristaToken(BaristaToken item);

    Object saveBookShelfItems(List<BookShelfViewItem> list, Continuation<? super Boolean> continuation);

    Object saveHistoryItemRealm(Continuation<? super Unit> continuation);

    Object saveMovieLicenseItems(CourseLicenseItems courseLicenseItems, Continuation<? super Unit> continuation);

    Object saveNewsList(NewsList newsList, Continuation<? super Unit> continuation);

    void saveUserLoginInfo(String value);

    void sendLoginResult(boolean isSuccess, String errorMessage);

    void setMediLinkId(String value);

    void setStartUpExpireTime();

    void setUserId(String value);

    void setUserInfo(BaristaUserInfo item);

    boolean shouldForcedUpdate();

    boolean shouldShowTutorial();

    Object startUp(Continuation<? super ApiCommon> continuation);

    Object updatePurchaseContents(List<BookShelfViewItem> list, Continuation<? super Unit> continuation);

    Object updatePurchaseContentsField(List<BookShelfViewItem> list, Continuation<? super Unit> continuation);

    Object userActionLog(ApiLog apiLog, Continuation<? super Unit> continuation);

    String userId();

    WithdrawalAuthItem withdrawalAuthItem();

    /* JADX INFO: compiled from: LaunchUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object baristaToken$default(LaunchUseCase launchUseCase, BaristaTokenGrantType baristaTokenGrantType, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: baristaToken");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return launchUseCase.baristaToken(baristaTokenGrantType, str, continuation);
        }

        public static /* synthetic */ Object deleteDevice$default(LaunchUseCase launchUseCase, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteDevice");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return launchUseCase.deleteDevice(str, continuation);
        }

        public static /* synthetic */ void sendLoginResult$default(LaunchUseCase launchUseCase, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLoginResult");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            launchUseCase.sendLoginResult(z, str);
        }
    }
}
