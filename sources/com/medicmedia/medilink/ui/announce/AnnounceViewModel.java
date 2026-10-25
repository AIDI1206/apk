package com.medicmedia.medilink.ui.announce;

import android.content.Context;
import androidx.compose.material.MenuKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import com.medicmedia.medilink.core.network.api.response.ApiErrorCodeException;
import com.medicmedia.medilink.database.realm.QueryType;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.domain.model.ApiCommon;
import com.medicmedia.medilink.domain.model.ApiLog;
import com.medicmedia.medilink.domain.model.LogDetail;
import com.medicmedia.medilink.domain.model.LogLevel;
import com.medicmedia.medilink.domain.model.LogOperation;
import com.medicmedia.medilink.domain.model.NewsList;
import com.medicmedia.medilink.domain.model.announce.AnnounceItem;
import com.medicmedia.medilink.domain.usecase.AnnounceUseCase;
import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.UIError;
import com.medicmedia.medilink.ui.navigation.AppNavigator;
import com.medicmedia.medilink.ui.navigation.Destination;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import io.realm.kotlin.query.Sort;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: compiled from: AnnounceViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002)*B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0014J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001bJ\u001e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel;", "Landroidx/lifecycle/ViewModel;", "launchUseCase", "Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;", "announceUseCase", "Lcom/medicmedia/medilink/domain/usecase/AnnounceUseCase;", "appNavigator", "Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "crashAnalyticsClient", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/LaunchUseCase;Lcom/medicmedia/medilink/domain/usecase/AnnounceUseCase;Lcom/medicmedia/medilink/ui/navigation/AppNavigator;Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$UiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialized", "", "loadInitial", "", "refresh", "showLoading", "loadAnnounceItems", "", "Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAnnounce", "item", "startOtherWeb", "context", "Landroid/content/Context;", "url", "", "isPrimaryColor", "mapToInfoError", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError;", "throwable", "", "UiState", "AnnounceError", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AnnounceViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<UiState> _uiState;
    private final AnnounceUseCase announceUseCase;
    private final AppNavigator appNavigator;
    private final CrashAnalyticsClient crashAnalyticsClient;
    private boolean initialized;
    private final LaunchUseCase launchUseCase;
    private final StateFlow<UiState> uiState;

    @Inject
    public AnnounceViewModel(LaunchUseCase launchUseCase, AnnounceUseCase announceUseCase, AppNavigator appNavigator, CrashAnalyticsClient crashAnalyticsClient) {
        Intrinsics.checkNotNullParameter(launchUseCase, "launchUseCase");
        Intrinsics.checkNotNullParameter(announceUseCase, "announceUseCase");
        Intrinsics.checkNotNullParameter(appNavigator, "appNavigator");
        Intrinsics.checkNotNullParameter(crashAnalyticsClient, "crashAnalyticsClient");
        this.launchUseCase = launchUseCase;
        this.announceUseCase = announceUseCase;
        this.appNavigator = appNavigator;
        this.crashAnalyticsClient = crashAnalyticsClient;
        MutableStateFlow<UiState> MutableStateFlow = StateFlowKt.MutableStateFlow(UiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$UiState;", "", "isLoading", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/ui/common/UIError;", "<init>", "(ZLjava/util/List;Lcom/medicmedia/medilink/ui/common/UIError;)V", "()Z", "getItems", "()Ljava/util/List;", "getError", "()Lcom/medicmedia/medilink/ui/common/UIError;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class UiState {
        private final UIError error;
        private final boolean isLoading;
        private final List<AnnounceItem> items;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private static final UiState f61default = new UiState(false, null, null, 7, null);

        public UiState() {
            this(false, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, List list, UIError uIError, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                list = uiState.items;
            }
            if ((i & 4) != 0) {
                uIError = uiState.error;
            }
            return uiState.copy(z, list, uIError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final List<AnnounceItem> component2() {
            return this.items;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final UIError getError() {
            return this.error;
        }

        public final UiState copy(boolean isLoading, List<AnnounceItem> items, UIError error) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new UiState(isLoading, items, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiState)) {
                return false;
            }
            UiState uiState = (UiState) other;
            return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.items, uiState.items) && Intrinsics.areEqual(this.error, uiState.error);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.items.hashCode()) * 31;
            UIError uIError = this.error;
            return iHashCode + (uIError == null ? 0 : uIError.hashCode());
        }

        public String toString() {
            return "UiState(isLoading=" + this.isLoading + ", items=" + this.items + ", error=" + this.error + ")";
        }

        public UiState(boolean z, List<AnnounceItem> items, UIError uIError) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.isLoading = z;
            this.items = items;
            this.error = uIError;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ UiState(boolean z, List list, UIError uIError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : uIError);
        }

        public final List<AnnounceItem> getItems() {
            return this.items;
        }

        public final UIError getError() {
            return this.error;
        }

        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$UiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$UiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$UiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final UiState getDefault() {
                return UiState.f61default;
            }
        }
    }

    public final StateFlow<UiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError;", "Lcom/medicmedia/medilink/ui/common/UIError;", "resourceId", "", "args", "", "<init>", "(ILjava/lang/String;)V", "getResourceId", "()I", "getArgs", "()Ljava/lang/String;", "Api", ResourceType.NETWORK, "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError$Api;", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError$Network;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class AnnounceError implements UIError {
        public static final int $stable = 0;
        private final String args;
        private final int resourceId;

        public /* synthetic */ AnnounceError(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str);
        }

        private AnnounceError(int i, String str) {
            this.resourceId = i;
            this.args = str;
        }

        public /* synthetic */ AnnounceError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError$Api;", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError;", QueryParameterKey.CODE, "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Api extends AnnounceError {
            public static final int $stable = 0;
            private final String code;

            public static /* synthetic */ Api copy$default(Api api, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = api.code;
                }
                return api.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            public final Api copy(String code) {
                return new Api(code);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Api) && Intrinsics.areEqual(this.code, ((Api) other).code);
            }

            public int hashCode() {
                String str = this.code;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Api(code=" + this.code + ")";
            }

            public final String getCode() {
                return this.code;
            }

            public Api(String str) {
                super(R.string.failed_to_get_announce_data, str, null);
                this.code = str;
            }
        }

        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError$Network;", "Lcom/medicmedia/medilink/ui/announce/AnnounceViewModel$AnnounceError;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Network extends AnnounceError {
            public static final int $stable = 0;
            public static final Network INSTANCE = new Network();

            private Network() {
                super(R.string.app_error_01, null, 2, 0 == true ? 1 : 0);
            }
        }
    }

    public final void loadInitial() {
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$loadInitial$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$loadInitial$1", f = "AnnounceViewModel.kt", i = {}, l = {HelpFormatter.DEFAULT_WIDTH}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnnounceViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = AnnounceViewModel.this.loadAnnounceItems(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<AnnounceItem> list = (List) obj;
            if (!list.isEmpty()) {
                MutableStateFlow mutableStateFlow = AnnounceViewModel.this._uiState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, ((UiState) value).copy(false, list, null)));
                AnnounceViewModel.this.refresh(false);
            } else {
                AnnounceViewModel.this.refresh(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refresh$default(AnnounceViewModel announceViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        announceViewModel.refresh(z);
    }

    public final void refresh(boolean showLoading) {
        if (this._uiState.getValue().isLoading() && showLoading) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08331(showLoading, this, null), 3, null);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1", f = "AnnounceViewModel.kt", i = {1, 4}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_SESSION_IDENT, realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_HEADER_SYNTAX, MenuKt.InTransitionDuration, 124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {"newsList", FirebaseAnalytics.Param.ITEMS}, s = {"L$0", "L$0"})
    static final class C08331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $showLoading;
        Object L$0;
        int label;
        final /* synthetic */ AnnounceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08331(boolean z, AnnounceViewModel announceViewModel, Continuation<? super C08331> continuation) {
            super(2, continuation);
            this.$showLoading = z;
            this.this$0 = announceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08331(this.$showLoading, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[Catch: Exception -> 0x0047, PHI: r2
  0x00d5: PHI (r2v18 com.medicmedia.medilink.domain.model.NewsList) = 
  (r2v17 com.medicmedia.medilink.domain.model.NewsList)
  (r2v17 com.medicmedia.medilink.domain.model.NewsList)
  (r2v30 com.medicmedia.medilink.domain.model.NewsList)
 binds: [B:36:0x00b6, B:38:0x00d2, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0047, blocks: (B:10:0x001f, B:50:0x0120, B:51:0x0128, B:53:0x0131, B:57:0x013a, B:14:0x002c, B:46:0x0100, B:15:0x0033, B:43:0x00f2, B:18:0x003c, B:40:0x00d5, B:19:0x0041, B:35:0x00a8, B:37:0x00b8, B:32:0x008c), top: B:71:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:10:0x001f, B:50:0x0120, B:51:0x0128, B:53:0x0131, B:57:0x013a, B:14:0x002c, B:46:0x0100, B:15:0x0033, B:43:0x00f2, B:18:0x003c, B:40:0x00d5, B:19:0x0041, B:35:0x00a8, B:37:0x00b8, B:32:0x008c), top: B:71:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:46:0x0100 A[Catch: Exception -> 0x0047, PHI: r2
  0x0100: PHI (r2v24 java.lang.Object) = (r2v23 java.lang.Object), (r2v31 java.lang.Object) binds: [B:44:0x00fd, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0047, blocks: (B:10:0x001f, B:50:0x0120, B:51:0x0128, B:53:0x0131, B:57:0x013a, B:14:0x002c, B:46:0x0100, B:15:0x0033, B:43:0x00f2, B:18:0x003c, B:40:0x00d5, B:19:0x0041, B:35:0x00a8, B:37:0x00b8, B:32:0x008c), top: B:71:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:49:0x011f  */
        /* JADX WARN: Code duplicated, block: B:53:0x0131 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:10:0x001f, B:50:0x0120, B:51:0x0128, B:53:0x0131, B:57:0x013a, B:14:0x002c, B:46:0x0100, B:15:0x0033, B:43:0x00f2, B:18:0x003c, B:40:0x00d5, B:19:0x0041, B:35:0x00a8, B:37:0x00b8, B:32:0x008c), top: B:71:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            UiState uiState;
            Object value2;
            Object objWithContext;
            Object value3;
            NewsList newsList;
            Object objLoadAnnounceItems;
            List<AnnounceItem> list;
            List<AnnounceItem> list2;
            MutableStateFlow mutableStateFlow;
            boolean z;
            Object value4;
            UiState uiState2;
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        objWithContext = obj;
                    } else {
                        if (i == 2) {
                            newsList = (NewsList) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 3;
                            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.this$0, newsList, null), this) != coroutine_suspended) {
                                this.label = 4;
                                objLoadAnnounceItems = this.this$0.loadAnnounceItems(this);
                                if (objLoadAnnounceItems == coroutine_suspended) {
                                    list = (List) objLoadAnnounceItems;
                                    this.L$0 = list;
                                    this.label = 5;
                                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.this$0, null), this) != coroutine_suspended) {
                                        list2 = list;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 4;
                            objLoadAnnounceItems = this.this$0.loadAnnounceItems(this);
                            if (objLoadAnnounceItems == coroutine_suspended) {
                                list = (List) objLoadAnnounceItems;
                                this.L$0 = list;
                                this.label = 5;
                                if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.this$0, null), this) != coroutine_suspended) {
                                    list2 = list;
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            objLoadAnnounceItems = obj;
                            list = (List) objLoadAnnounceItems;
                            this.L$0 = list;
                            this.label = 5;
                            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.this$0, null), this) != coroutine_suspended) {
                                list2 = list;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    mutableStateFlow = this.this$0._uiState;
                    z = this.$showLoading;
                    do {
                        value4 = mutableStateFlow.getValue();
                        uiState2 = (UiState) value4;
                        if (z && uiState2.isLoading()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } while (!mutableStateFlow.compareAndSet(value4, uiState2.copy(z2, list2, null)));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (this.$showLoading) {
                    MutableStateFlow mutableStateFlow2 = this.this$0._uiState;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, UiState.copy$default((UiState) value3, true, null, null, 2, null)));
                } else {
                    MutableStateFlow mutableStateFlow3 = this.this$0._uiState;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, UiState.copy$default((UiState) value2, false, null, null, 3, null)));
                }
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(this.this$0, null), this);
                if (objWithContext == coroutine_suspended) {
                }
                return coroutine_suspended;
                Pair pair = (Pair) objWithContext;
                ApiCommon apiCommon = (ApiCommon) pair.component1();
                newsList = (NewsList) pair.component2();
                if (apiCommon != null) {
                    this.L$0 = newsList;
                    this.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(this.this$0, apiCommon, null), this) != coroutine_suspended) {
                        this.L$0 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.this$0, newsList, null), this) != coroutine_suspended) {
                            this.label = 4;
                            objLoadAnnounceItems = this.this$0.loadAnnounceItems(this);
                            if (objLoadAnnounceItems == coroutine_suspended) {
                                list = (List) objLoadAnnounceItems;
                                this.L$0 = list;
                                this.label = 5;
                                if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.this$0, null), this) != coroutine_suspended) {
                                    list2 = list;
                                    mutableStateFlow = this.this$0._uiState;
                                    z = this.$showLoading;
                                    do {
                                        value4 = mutableStateFlow.getValue();
                                        uiState2 = (UiState) value4;
                                        if (z) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                    } while (!mutableStateFlow.compareAndSet(value4, uiState2.copy(z2, list2, null)));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                } else {
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass5(this.this$0, newsList, null), this) != coroutine_suspended) {
                        this.label = 4;
                        objLoadAnnounceItems = this.this$0.loadAnnounceItems(this);
                        if (objLoadAnnounceItems == coroutine_suspended) {
                            list = (List) objLoadAnnounceItems;
                            this.L$0 = list;
                            this.label = 5;
                            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(this.this$0, null), this) != coroutine_suspended) {
                                list2 = list;
                                mutableStateFlow = this.this$0._uiState;
                                z = this.$showLoading;
                                do {
                                    value4 = mutableStateFlow.getValue();
                                    uiState2 = (UiState) value4;
                                    if (z) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                } while (!mutableStateFlow.compareAndSet(value4, uiState2.copy(z2, list2, null)));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Exception e) {
                Exception exc = e;
                CrashAnalyticsClient.DefaultImpls.recordException$default(this.this$0.crashAnalyticsClient, exc, null, 2, null);
                AnnounceError announceErrorMapToInfoError = this.this$0.mapToInfoError(exc);
                MutableStateFlow mutableStateFlow4 = this.this$0._uiState;
                boolean z3 = this.$showLoading;
                do {
                    value = mutableStateFlow4.getValue();
                    uiState = (UiState) value;
                } while (!mutableStateFlow4.compareAndSet(value, UiState.copy$default(uiState, !z3 && uiState.isLoading(), null, announceErrorMapToInfoError, 2, null)));
            }
        }

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/medicmedia/medilink/domain/model/ApiCommon;", "Lcom/medicmedia/medilink/domain/model/NewsList;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$3", f = "AnnounceViewModel.kt", i = {}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends ApiCommon, ? extends NewsList>>, Object> {
            int label;
            final /* synthetic */ AnnounceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AnnounceViewModel announceViewModel, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = announceViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends ApiCommon, ? extends NewsList>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Pair<ApiCommon, NewsList>>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<ApiCommon, NewsList>> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                Object newsList = this.this$0.launchUseCase.getNewsList(this);
                return newsList == coroutine_suspended ? coroutine_suspended : newsList;
            }
        }

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$4", f = "AnnounceViewModel.kt", i = {}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ApiCommon $common;
            int label;
            final /* synthetic */ AnnounceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AnnounceViewModel announceViewModel, ApiCommon apiCommon, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = announceViewModel;
                this.$common = apiCommon;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$common, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.launchUseCase.saveApiCommonInfo(this.$common, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    CrashAnalyticsClient.DefaultImpls.recordException$default(this.this$0.crashAnalyticsClient, e, null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$5", f = "AnnounceViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NewsList $newsList;
            int label;
            final /* synthetic */ AnnounceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AnnounceViewModel announceViewModel, NewsList newsList, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = announceViewModel;
                this.$newsList = newsList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$newsList, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.launchUseCase.saveNewsList(this.$newsList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$refresh$1$6", f = "AnnounceViewModel.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AnnounceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(AnnounceViewModel announceViewModel, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = announceViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ApiLog apiLog = new ApiLog(LogLevel.INFO, LogOperation.API, LogDetail.APP_API, CollectionsKt.listOf("https://app.medilink-study.com/api/news"));
                        this.label = 1;
                        if (this.this$0.launchUseCase.userActionLog(apiLog, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    CrashAnalyticsClient.DefaultImpls.recordException$default(this.this$0.crashAnalyticsClient, e, null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$loadAnnounceItems$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/medicmedia/medilink/domain/model/announce/AnnounceItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$loadAnnounceItems$2", f = "AnnounceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AnnounceItem>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnnounceViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AnnounceItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AnnounceItem>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<AnnounceItem>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AnnounceViewModel.this.announceUseCase.findAnnounceItems(CollectionsKt.listOf(new QueryType.Sort("date", Sort.DESCENDING)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAnnounceItems(Continuation<? super List<AnnounceItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnnounceViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1", f = "AnnounceViewModel.kt", i = {}, l = {171, 174}, m = "invokeSuspend", n = {}, s = {})
    static final class C08321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnnounceItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08321(AnnounceItem announceItem, Continuation<? super C08321> continuation) {
            super(2, continuation);
            this.$item = announceItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnnounceViewModel.this.new C08321(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r12 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                r3 = 0
                r4 = 2
                if (r1 == 0) goto L22
                if (r1 == r2) goto L1b
                if (r1 != r4) goto L13
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Exception -> L1f
                goto L50
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Exception -> L1f
                goto L42
            L1f:
                r0 = move-exception
                r12 = r0
                goto L80
            L22:
                kotlin.ResultKt.throwOnFailure(r12)
                kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L1f
                kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12     // Catch: java.lang.Exception -> L1f
                com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1$1 r1 = new com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1$1     // Catch: java.lang.Exception -> L1f
                com.medicmedia.medilink.ui.announce.AnnounceViewModel r5 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.this     // Catch: java.lang.Exception -> L1f
                com.medicmedia.medilink.domain.model.announce.AnnounceItem r6 = r11.$item     // Catch: java.lang.Exception -> L1f
                r1.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L1f
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Exception -> L1f
                r5 = r11
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Exception -> L1f
                r11.label = r2     // Catch: java.lang.Exception -> L1f
                java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r1, r5)     // Catch: java.lang.Exception -> L1f
                if (r12 != r0) goto L42
                goto L4f
            L42:
                com.medicmedia.medilink.ui.announce.AnnounceViewModel r12 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.this     // Catch: java.lang.Exception -> L1f
                r1 = r11
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1     // Catch: java.lang.Exception -> L1f
                r11.label = r4     // Catch: java.lang.Exception -> L1f
                java.lang.Object r12 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.access$loadAnnounceItems(r12, r1)     // Catch: java.lang.Exception -> L1f
                if (r12 != r0) goto L50
            L4f:
                return r0
            L50:
                r7 = r12
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L1f
                com.medicmedia.medilink.ui.announce.AnnounceViewModel r12 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.this     // Catch: java.lang.Exception -> L1f
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.access$get_uiState$p(r12)     // Catch: java.lang.Exception -> L1f
            L59:
                java.lang.Object r0 = r12.getValue()     // Catch: java.lang.Exception -> L1f
                r5 = r0
                com.medicmedia.medilink.ui.announce.AnnounceViewModel$UiState r5 = (com.medicmedia.medilink.ui.announce.AnnounceViewModel.UiState) r5     // Catch: java.lang.Exception -> L1f
                r9 = 5
                r10 = 0
                r6 = 0
                r8 = 0
                com.medicmedia.medilink.ui.announce.AnnounceViewModel$UiState r1 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.UiState.copy$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L1f
                boolean r0 = r12.compareAndSet(r0, r1)     // Catch: java.lang.Exception -> L1f
                if (r0 == 0) goto L59
                com.medicmedia.medilink.domain.model.announce.AnnounceItem r12 = r11.$item     // Catch: java.lang.Exception -> L1f
                java.lang.String r12 = r12.getUrl()     // Catch: java.lang.Exception -> L1f
                if (r12 == 0) goto L8b
                com.medicmedia.medilink.ui.announce.AnnounceViewModel r0 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.this     // Catch: java.lang.Exception -> L1f
                com.medicmedia.medilink.domain.usecase.AnnounceUseCase r0 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.access$getAnnounceUseCase$p(r0)     // Catch: java.lang.Exception -> L1f
                r0.sendNewsOpenedEvent(r12)     // Catch: java.lang.Exception -> L1f
                goto L8b
            L80:
                com.medicmedia.medilink.ui.announce.AnnounceViewModel r0 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.this
                com.medicmedia.medilink.analytics.CrashAnalyticsClient r0 = com.medicmedia.medilink.ui.announce.AnnounceViewModel.access$getCrashAnalyticsClient$p(r0)
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                com.medicmedia.medilink.analytics.CrashAnalyticsClient.DefaultImpls.recordException$default(r0, r12, r3, r4, r3)
            L8b:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.announce.AnnounceViewModel.C08321.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AnnounceViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.medicmedia.medilink.ui.announce.AnnounceViewModel$readAnnounce$1$1", f = "AnnounceViewModel.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", n = {}, s = {})
        static final class C01801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AnnounceItem $item;
            int label;
            final /* synthetic */ AnnounceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01801(AnnounceViewModel announceViewModel, AnnounceItem announceItem, Continuation<? super C01801> continuation) {
                super(2, continuation);
                this.this$0 = announceViewModel;
                this.$item = announceItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01801(this.this$0, this.$item, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.announceUseCase.read(this.$item, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void readAnnounce(AnnounceItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08321(item, null), 3, null);
    }

    public final void startOtherWeb(Context context, String url, boolean isPrimaryColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.appNavigator.navigate(context, new Destination.OtherWeb(url, null, isPrimaryColor, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnnounceError mapToInfoError(Throwable throwable) {
        if (throwable instanceof ApiErrorCodeException) {
            return new AnnounceError.Api(((ApiErrorCodeException) throwable).getCode());
        }
        if (throwable instanceof IOException) {
            return AnnounceError.Network.INSTANCE;
        }
        return null;
    }
}
