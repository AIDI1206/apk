package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.medicmedia.medilink.ui.navigation.AppNavigator;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.scan.CameraScanScreenKt;
import com.medicmedia.medilink.ui.scan.ScanViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: CameraScanActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/CameraScanActivity;", "Lcom/medicmedia/medilink/SplashedActivity;", "<init>", "()V", "appNavigator", "Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "getAppNavigator", "()Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "setAppNavigator", "(Lcom/medicmedia/medilink/ui/navigation/AppNavigator;)V", "viewModel", "Lcom/medicmedia/medilink/ui/scan/ScanViewModel;", "getViewModel", "()Lcom/medicmedia/medilink/ui/scan/ScanViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class CameraScanActivity extends Hilt_CameraScanActivity {

    @Inject
    public AppNavigator appNavigator;
    private final ActivityResultLauncher<String> requestPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.medicmedia.medilink.CameraScanActivity$$ExternalSyntheticLambda0
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CameraScanActivity.requestPermissionLauncher$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CameraScanActivity() {
        final CameraScanActivity cameraScanActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScanViewModel.class), new Function0<ViewModelStore>() { // from class: com.medicmedia.medilink.CameraScanActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return cameraScanActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.medicmedia.medilink.CameraScanActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return cameraScanActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.medicmedia.medilink.CameraScanActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? cameraScanActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final AppNavigator getAppNavigator() {
        AppNavigator appNavigator = this.appNavigator;
        if (appNavigator != null) {
            return appNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appNavigator");
        return null;
    }

    public final void setAppNavigator(AppNavigator appNavigator) {
        Intrinsics.checkNotNullParameter(appNavigator, "<set-?>");
        this.appNavigator = appNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScanViewModel getViewModel() {
        return (ScanViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: compiled from: CameraScanActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/CameraScanActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) CameraScanActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermissionLauncher$lambda$0(CameraScanActivity cameraScanActivity, boolean z) {
        if (z) {
            cameraScanActivity.getViewModel().emitStartCamera();
        } else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(cameraScanActivity, "android.permission.CAMERA")) {
                return;
            }
            cameraScanActivity.getViewModel().emitPermissionDenied();
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.CameraScanActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: CameraScanActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C48@1559L12,49@1602L71,52@1713L100,46@1475L353:CameraScanActivity.kt#ha4l3u");
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-577373332, i, -1, "com.medicmedia.medilink.CameraScanActivity.onCreate.<anonymous> (CameraScanActivity.kt:46)");
                }
                ScanViewModel viewModel = CameraScanActivity.this.getViewModel();
                composer.startReplaceGroup(-799389617);
                ComposerKt.sourceInformation(composer, "CC(remember):CameraScanActivity.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(CameraScanActivity.this);
                final CameraScanActivity cameraScanActivity = CameraScanActivity.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.CameraScanActivity$onCreate$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraScanActivity.AnonymousClass1.invoke$lambda$1$lambda$0(cameraScanActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-799388182);
                ComposerKt.sourceInformation(composer, "CC(remember):CameraScanActivity.kt#9igjgp");
                boolean zChangedInstance2 = composer.changedInstance(CameraScanActivity.this);
                final CameraScanActivity cameraScanActivity2 = CameraScanActivity.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.medicmedia.medilink.CameraScanActivity$onCreate$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CameraScanActivity.AnonymousClass1.invoke$lambda$3$lambda$2(cameraScanActivity2, (Destination) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-799384601);
                ComposerKt.sourceInformation(composer, "CC(remember):CameraScanActivity.kt#9igjgp");
                boolean zChangedInstance3 = composer.changedInstance(CameraScanActivity.this);
                final CameraScanActivity cameraScanActivity3 = CameraScanActivity.this;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.medicmedia.medilink.CameraScanActivity$onCreate$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraScanActivity.AnonymousClass1.invoke$lambda$5$lambda$4(cameraScanActivity3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                CameraScanScreenKt.CameraScanScreen(viewModel, function0, function1, (Function0) objRememberedValue3, composer, ScanViewModel.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CameraScanActivity cameraScanActivity) {
            cameraScanActivity.finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CameraScanActivity cameraScanActivity, Destination it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cameraScanActivity.getAppNavigator().navigate(cameraScanActivity, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CameraScanActivity cameraScanActivity) {
            cameraScanActivity.requestPermissionLauncher.launch("android.permission.CAMERA");
            return Unit.INSTANCE;
        }
    }

    @Override // com.medicmedia.medilink.SplashedActivity, com.medicmedia.medilink.MLDownloadActivity, com.medicmedia.medilink.MLSessionActivity, com.medicmedia.medilink.Hilt_MLSessionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-577373332, true, new AnonymousClass1()), 1, null);
    }
}
