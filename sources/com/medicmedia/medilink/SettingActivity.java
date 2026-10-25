package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import com.medicmedia.medilink.ui.settings.SettingDefinition;
import com.medicmedia.medilink.ui.settings.SettingId;
import com.medicmedia.medilink.ui.settings.SettingViewKt;
import com.medicmedia.medilink.ui.settings.SettingsViewModel;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import com.medicmedia.medilink.ui.web.OtherWebViewArgs;
import com.medicmedia.medilink.util.GlideApp;
import com.medicmedia.medilink.worker.ZipUnpackWorker;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: SettingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/SettingActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/medicmedia/medilink/ui/settings/SettingsViewModel;", "getViewModel", "()Lcom/medicmedia/medilink/ui/settings/SettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onClickSettingItem", "definition", "Lcom/medicmedia/medilink/ui/settings/SettingDefinition;", "startWebView", "url", "", "clearCache", "startMain", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class SettingActivity extends Hilt_SettingActivity {

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: SettingActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingId.values().length];
            try {
                iArr[SettingId.PushSetting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingId.GotoMedilinkSite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingId.GotoFaq.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingId.GotoGuide.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingId.GotoAppStore.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingId.ClearCache.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SettingActivity() {
        final SettingActivity settingActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.medicmedia.medilink.SettingActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return settingActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.medicmedia.medilink.SettingActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return settingActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.medicmedia.medilink.SettingActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? settingActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsViewModel getViewModel() {
        return (SettingsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: compiled from: SettingActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/SettingActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) SettingActivity.class);
        }
    }

    @Override // com.medicmedia.medilink.Hilt_SettingActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SettingActivity settingActivity = this;
        EdgeToEdge.enable$default(settingActivity, null, null, 3, null);
        ComponentActivityKt.setContent$default(settingActivity, null, ComposableLambdaKt.composableLambdaInstance(-1786862202, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.SettingActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.SettingActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: SettingActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01651 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ SettingActivity this$0;

                C01651(SettingActivity settingActivity) {
                    this.this$0 = settingActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C42@1619L12,43@1663L24,44@1730L177,48@1940L59,40@1528L490:SettingActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2024562145, i, -1, "com.medicmedia.medilink.SettingActivity.onCreate.<anonymous>.<anonymous> (SettingActivity.kt:40)");
                        }
                        SettingsViewModel viewModel = this.this$0.getViewModel();
                        composer.startReplaceGroup(1730636648);
                        ComposerKt.sourceInformation(composer, "CC(remember):SettingActivity.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final SettingActivity settingActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.SettingActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SettingActivity.AnonymousClass1.C01651.invoke$lambda$1$lambda$0(settingActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        SettingActivity settingActivity2 = this.this$0;
                        composer.startReplaceGroup(1730638068);
                        ComposerKt.sourceInformation(composer, "CC(remember):SettingActivity.kt#9igjgp");
                        boolean zChangedInstance2 = composer.changedInstance(settingActivity2);
                        SettingActivity$onCreate$1$1$2$1 settingActivity$onCreate$1$1$2$1RememberedValue = composer.rememberedValue();
                        if (zChangedInstance2 || settingActivity$onCreate$1$1$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            settingActivity$onCreate$1$1$2$1RememberedValue = new SettingActivity$onCreate$1$1$2$1(settingActivity2);
                            composer.updateRememberedValue(settingActivity$onCreate$1$1$2$1RememberedValue);
                        }
                        composer.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) settingActivity$onCreate$1$1$2$1RememberedValue);
                        composer.startReplaceGroup(1730640365);
                        ComposerKt.sourceInformation(composer, "CC(remember):SettingActivity.kt#9igjgp");
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final SettingActivity settingActivity3 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.medicmedia.medilink.SettingActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SettingActivity.AnonymousClass1.C01651.invoke$lambda$4$lambda$3(settingActivity3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function2 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1730646967);
                        ComposerKt.sourceInformation(composer, "CC(remember):SettingActivity.kt#9igjgp");
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final SettingActivity settingActivity4 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.medicmedia.medilink.SettingActivity$onCreate$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SettingActivity.AnonymousClass1.C01651.invoke$lambda$6$lambda$5(settingActivity4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        SettingViewKt.SettingListScreen(null, viewModel, function0, function1, function2, (Function0) objRememberedValue3, composer, SettingsViewModel.$stable << 3, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(SettingActivity settingActivity) {
                    settingActivity.finish();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3(SettingActivity settingActivity) {
                    settingActivity.getViewModel().restartDownload(ZipUnpackWorker.class);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$6$lambda$5(SettingActivity settingActivity) {
                    settingActivity.startMain();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C39@1510L522,39@1496L536:SettingActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1786862202, i, -1, "com.medicmedia.medilink.SettingActivity.onCreate.<anonymous> (SettingActivity.kt:39)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(2024562145, true, new C01651(SettingActivity.this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickSettingItem(SettingDefinition definition) {
        switch (WhenMappings.$EnumSwitchMapping$0[definition.getId().ordinal()]) {
            case 1:
                ContextExtensionKt.showPushSetting(this);
                break;
            case 2:
                ContextExtensionKt.showExternalBrowser(this, definition.getOption().getUrl());
                break;
            case 3:
            case 4:
                startWebView(definition.getOption().getUrl());
                break;
            case 5:
                ContextExtensionKt.showAppStore(this);
                break;
            case 6:
                clearCache();
                break;
        }
    }

    private final void startWebView(String url) {
        Intent intent = new Intent(this, (Class<?>) OtherWebViewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BundleKey.WEB_ARGS, new OtherWebViewArgs(url, null, false, 6, null));
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private final void clearCache() {
        if (getViewModel().isVideoDownloading()) {
            ContextExtensionKt.showLongTextToastWithMessageId(this, R.string.not_delete_local_storage_data);
        } else {
            GlideApp.get(this).clearMemory();
            getViewModel().clearCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startMain() {
        Intent intent = new Intent(this, (Class<?>) MLMainActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        finish();
    }
}
