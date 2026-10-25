package com.medicmedia.medilink;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.medicmedia.medilink.ui.extension.ActivityExtensionKt;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import com.medicmedia.medilink.ui.login.LoginViewKt;
import com.medicmedia.medilink.ui.login.LoginViewModel;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0015R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/medicmedia/medilink/ui/login/LoginViewModel;", "getViewModel", "()Lcom/medicmedia/medilink/ui/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBaristaToken", "startBaristaAuth", "authUrl", "", "loginCompleted", "resultCode", "", "(Ljava/lang/Integer;)V", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class LoginActivity extends Hilt_LoginActivity {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public LoginActivity() {
        final LoginActivity loginActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginViewModel.class), new Function0<ViewModelStore>() { // from class: com.medicmedia.medilink.LoginActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return loginActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.medicmedia.medilink.LoginActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return loginActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.medicmedia.medilink.LoginActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? loginActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginViewModel getViewModel() {
        return (LoginViewModel) this.viewModel.getValue();
    }

    @Override // com.medicmedia.medilink.Hilt_LoginActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginActivity loginActivity = this;
        ActivityExtensionKt.enableEdgeToEdgeWithStyleLight(loginActivity);
        setupBaristaToken();
        ComponentActivityKt.setContent$default(loginActivity, null, ComposableLambdaKt.composableLambdaInstance(1064860390, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.LoginActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.LoginActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: LoginActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01581 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ LoginActivity this$0;

                C01581(LoginActivity loginActivity) {
                    this.this$0 = loginActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C40@1463L68,43@1568L71,46@1675L88,49@1812L64,38@1371L524:LoginActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(686725313, i, -1, "com.medicmedia.medilink.LoginActivity.onCreate.<anonymous>.<anonymous> (LoginActivity.kt:38)");
                        }
                        LoginViewModel viewModel = this.this$0.getViewModel();
                        composer.startReplaceGroup(1629666919);
                        ComposerKt.sourceInformation(composer, "CC(remember):LoginActivity.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final LoginActivity loginActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.medicmedia.medilink.LoginActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LoginActivity.AnonymousClass1.C01581.invoke$lambda$1$lambda$0(loginActivity, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1629670282);
                        ComposerKt.sourceInformation(composer, "CC(remember):LoginActivity.kt#9igjgp");
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final LoginActivity loginActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.medicmedia.medilink.LoginActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LoginActivity.AnonymousClass1.C01581.invoke$lambda$3$lambda$2(loginActivity2, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function2 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1629673723);
                        ComposerKt.sourceInformation(composer, "CC(remember):LoginActivity.kt#9igjgp");
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final LoginActivity loginActivity3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.medicmedia.medilink.LoginActivity$onCreate$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LoginActivity.AnonymousClass1.C01581.invoke$lambda$5$lambda$4(loginActivity3, (Integer) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function3 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1629678083);
                        ComposerKt.sourceInformation(composer, "CC(remember):LoginActivity.kt#9igjgp");
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final LoginActivity loginActivity4 = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.medicmedia.medilink.LoginActivity$onCreate$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LoginActivity.AnonymousClass1.C01581.invoke$lambda$7$lambda$6(loginActivity4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        LoginViewKt.LoginScreen(null, viewModel, function1, function2, function3, (Function0) objRememberedValue4, composer, LoginViewModel.$stable << 3, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(LoginActivity loginActivity, String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    loginActivity.startBaristaAuth(it);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(LoginActivity loginActivity, String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ContextExtensionKt.showExternalBrowser(loginActivity, it);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$5$lambda$4(LoginActivity loginActivity, Integer num) {
                    loginActivity.loginCompleted(num);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$7$lambda$6(LoginActivity loginActivity) {
                    loginActivity.finishAffinity();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C37@1353L556,37@1339L570:LoginActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1064860390, i, -1, "com.medicmedia.medilink.LoginActivity.onCreate.<anonymous> (LoginActivity.kt:37)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(686725313, true, new C01581(LoginActivity.this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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

    private final void setupBaristaToken() {
        String queryParameter;
        Uri data = getIntent().getData();
        if (data == null || (queryParameter = data.getQueryParameter(QueryParameterKey.CODE)) == null || queryParameter.length() <= 0) {
            return;
        }
        getViewModel().saveBaristaTokenAndUserInfo(queryParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loginCompleted(Integer resultCode) {
        if (resultCode != null) {
            setResult(resultCode.intValue());
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startBaristaAuth(String authUrl) {
        PendingIntent activity;
        Uri uri = Uri.parse(authUrl);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        LoginActivity loginActivity = this;
        CustomTabColorSchemeParams customTabColorSchemeParamsBuild = new CustomTabColorSchemeParams.Builder().setToolbarColor(ContextCompat.getColor(loginActivity, android.R.color.white)).build();
        Intrinsics.checkNotNullExpressionValue(customTabColorSchemeParamsBuild, "build(...)");
        builder.setDefaultColorSchemeParams(customTabColorSchemeParamsBuild);
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        Intent intent = customTabsIntentBuild.intent;
        intent.setData(uri);
        Intrinsics.checkNotNullExpressionValue(intent, "apply(...)");
        if (Build.VERSION.SDK_INT < 31) {
            activity = PendingIntent.getActivity(loginActivity, 100, intent, 134217728);
            Intrinsics.checkNotNull(activity);
        } else {
            activity = PendingIntent.getActivity(loginActivity, 100, intent, 201326592);
            Intrinsics.checkNotNull(activity);
        }
        builder.setActionButton(BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_menu_share), "Android", activity, true);
        builder.setShowTitle(true);
        try {
            CustomTabsIntent customTabsIntentBuild2 = builder.build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild2, "build(...)");
            customTabsIntentBuild2.launchUrl(this, uri);
        } catch (Exception e) {
            getViewModel().recordException(e);
            ContextExtensionKt.showLongTextToastWithMessageId(loginActivity, R.string.not_found_or_disable_browser);
        }
    }
}
