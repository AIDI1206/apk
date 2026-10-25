package com.medicmedia.medilink.core.network.di;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.functions.FirebaseFunctions;
import com.medicmedia.medilink.core.network.adapter.RawJsonAdapter;
import com.medicmedia.medilink.core.network.api.ApiDataSource;
import com.medicmedia.medilink.core.network.api.ApiNetwork;
import com.medicmedia.medilink.core.network.api.interceptor.ErrorPayload;
import com.medicmedia.medilink.core.network.api.interceptor.HeaderToCookieInterceptor;
import com.medicmedia.medilink.core.network.api.interceptor.NetworkErrorInterceptor;
import com.medicmedia.medilink.core.network.api.interceptor.RequestHeaderInterceptor;
import com.medicmedia.medilink.core.network.api.interceptor.ResponseErrorInterceptor;
import com.medicmedia.medilink.core.network.api.response.ApiErrorResponse;
import com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface;
import com.medicmedia.medilink.core.network.connect.NetworkHelper;
import com.medicmedia.medilink.core.network.connect.NetworkHelperImpl;
import com.medicmedia.medilink.core.network.cookie.AppCookie;
import com.medicmedia.medilink.core.network.cookie.AppCookieClient;
import com.medicmedia.medilink.core.network.functions.ChatbotSseDataSource;
import com.medicmedia.medilink.core.network.functions.ChatbotSseNetwork;
import com.medicmedia.medilink.core.network.functions.FirebaseFunctionsDataSource;
import com.medicmedia.medilink.core.network.functions.FirebaseFunctionsNetwork;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0007J\b\u0010\u0019\u001a\u00020\u0007H\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0007J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0011H\u0007J\u001a\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u001c\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010%\u001a\u00020&H\u0007J\b\u0010'\u001a\u00020&H\u0007¨\u0006("}, d2 = {"Lcom/medicmedia/medilink/core/network/di/NetworkModule;", "", "<init>", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "appCookie", "Lcom/medicmedia/medilink/core/network/cookie/AppCookie;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "provideImageHttpClient", "defaultClient", "provideCookieManager", "Landroid/webkit/CookieManager;", "provideWebStorage", "Landroid/webkit/WebStorage;", "provideFunction", "Lcom/google/firebase/functions/FirebaseFunctions;", "context", "Landroid/content/Context;", "provideFirebaseFunctions", "Lcom/medicmedia/medilink/core/network/functions/FirebaseFunctionsDataSource;", "functions", "provideChatbotSseOkHttpClient", "provideChatbotSseDataSource", "Lcom/medicmedia/medilink/core/network/functions/ChatbotSseDataSource;", "client", "provideAppCookie", "cookieManager", "webStorage", "provideApiDataSource", "Lcom/medicmedia/medilink/core/network/api/ApiDataSource;", "okHttpDefault", "provideNetworkHelper", "Lcom/medicmedia/medilink/core/network/connect/NetworkHelper;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "provideApplicationScope", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class NetworkModule {
    public static final NetworkModule INSTANCE = new NetworkModule();

    private NetworkModule() {
    }

    @Provides
    @Singleton
    public final Moshi moshi() {
        Moshi moshiBuild = new Moshi.Builder().add(new RawJsonAdapter()).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    @Provides
    @Singleton
    public final OkHttpClient okHttpClient(Moshi moshi, AppCookie appCookie, LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(appCookie, "appCookie");
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().connectTimeout(5000L, TimeUnit.MILLISECONDS).addInterceptor(new RequestHeaderInterceptor(appCookie, loginDataStore)).addInterceptor(new NetworkErrorInterceptor()).addInterceptor(new HeaderToCookieInterceptor(appCookie));
        JsonAdapter jsonAdapterAdapter = moshi.adapter(ApiErrorResponse.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        return builderAddInterceptor.addInterceptor(new ResponseErrorInterceptor(jsonAdapterAdapter, new Function1() { // from class: com.medicmedia.medilink.core.network.di.NetworkModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkModule.okHttpClient$lambda$0((ApiErrorResponse) obj);
            }
        })).addInterceptor(new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorPayload okHttpClient$lambda$0(ApiErrorResponse apiErrorResponse) {
        String message;
        Intrinsics.checkNotNull(apiErrorResponse, "null cannot be cast to non-null type com.medicmedia.medilink.core.network.api.response.ApiErrorResponse");
        ApiResponseErrorInterface.ErrorResponse error = apiErrorResponse.getError();
        String code = error != null ? error.getCode() : null;
        if (error == null || (message = error.getMessage()) == null) {
            message = "";
        }
        return new ErrorPayload(code, message);
    }

    @Provides
    @Singleton
    public final OkHttpClient provideImageHttpClient(OkHttpClient defaultClient) {
        Intrinsics.checkNotNullParameter(defaultClient, "defaultClient");
        return new OkHttpClient.Builder().cookieJar(defaultClient.cookieJar()).connectTimeout(defaultClient.connectTimeoutMillis(), TimeUnit.MILLISECONDS).build();
    }

    @Provides
    @Singleton
    public final CookieManager provideCookieManager() {
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
        return cookieManager;
    }

    @Provides
    @Singleton
    public final WebStorage provideWebStorage() {
        WebStorage webStorage = WebStorage.getInstance();
        Intrinsics.checkNotNullExpressionValue(webStorage, "getInstance(...)");
        return webStorage;
    }

    @Provides
    @Singleton
    public final FirebaseFunctions provideFunction(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (FirebaseApp.getApps(context).isEmpty()) {
            FirebaseApp.initializeApp(context);
        }
        return FirebaseFunctions.INSTANCE.getInstance("asia-northeast1");
    }

    @Provides
    @Singleton
    public final FirebaseFunctionsDataSource provideFirebaseFunctions(FirebaseFunctions functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        return new FirebaseFunctionsNetwork(functions);
    }

    @Provides
    @Singleton
    public final OkHttpClient provideChatbotSseOkHttpClient() {
        return new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).addInterceptor(new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0)).build();
    }

    @Provides
    @Singleton
    public final ChatbotSseDataSource provideChatbotSseDataSource(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return new ChatbotSseNetwork(client);
    }

    @Provides
    @Singleton
    public final AppCookie provideAppCookie(CookieManager cookieManager, WebStorage webStorage) {
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(webStorage, "webStorage");
        return new AppCookieClient(cookieManager, webStorage);
    }

    @Provides
    @Singleton
    public final ApiDataSource provideApiDataSource(OkHttpClient okHttpDefault, Moshi moshi) {
        Intrinsics.checkNotNullParameter(okHttpDefault, "okHttpDefault");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new ApiNetwork(okHttpDefault, moshi);
    }

    @Provides
    @Singleton
    public final NetworkHelper provideNetworkHelper(@ApplicationContext Context context, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        return new NetworkHelperImpl(context, appScope);
    }

    @Provides
    @Singleton
    public final CoroutineScope provideApplicationScope() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }
}
