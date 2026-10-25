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
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.QrContentsItem;
import com.medicmedia.medilink.ui.intermediate.IntermediatePageViewKt;
import com.medicmedia.medilink.ui.navigation.AppNavigator;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntermediatePageActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/IntermediatePageActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "appNavigator", "Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "getAppNavigator", "()Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "setAppNavigator", "(Lcom/medicmedia/medilink/ui/navigation/AppNavigator;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class IntermediatePageActivity extends Hilt_IntermediatePageActivity {

    @Inject
    public AppNavigator appNavigator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    /* JADX INFO: compiled from: IntermediatePageActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/IntermediatePageActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$IntermediatePage;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.IntermediatePage destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) IntermediatePageActivity.class);
            intent.putExtra(BundleKey.QR_CONTENTS_ITEM, destination.getQrContentsItem().convertToJsonString());
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_IntermediatePageActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final QrContentsItem qrContentsItem;
        super.onCreate(savedInstanceState);
        IntermediatePageActivity intermediatePageActivity = this;
        EdgeToEdge.enable$default(intermediatePageActivity, null, null, 3, null);
        String stringExtra = getIntent().getStringExtra(BundleKey.QR_CONTENTS_ITEM);
        if (stringExtra == null || (qrContentsItem = QrContentsItem.INSTANCE.convertTo(stringExtra)) == null) {
            qrContentsItem = new QrContentsItem(null, null, null, 7, null);
        }
        ComponentActivityKt.setContent$default(intermediatePageActivity, null, ComposableLambdaKt.composableLambdaInstance(-1796805408, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.IntermediatePageActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.IntermediatePageActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: IntermediatePageActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01571 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ QrContentsItem $qrContentsItem;
                final /* synthetic */ IntermediatePageActivity this$0;

                C01571(QrContentsItem qrContentsItem, IntermediatePageActivity intermediatePageActivity) {
                    this.$qrContentsItem = qrContentsItem;
                    this.this$0 = intermediatePageActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C45@1613L56,48@1704L79,43@1519L283:IntermediatePageActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2024236155, i, -1, "com.medicmedia.medilink.IntermediatePageActivity.onCreate.<anonymous>.<anonymous> (IntermediatePageActivity.kt:43)");
                        }
                        QrContentsItem qrContentsItem = this.$qrContentsItem;
                        composer.startReplaceGroup(-982317036);
                        ComposerKt.sourceInformation(composer, "CC(remember):IntermediatePageActivity.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final IntermediatePageActivity intermediatePageActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.IntermediatePageActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IntermediatePageActivity.AnonymousClass1.C01571.invoke$lambda$1$lambda$0(intermediatePageActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-982314101);
                        ComposerKt.sourceInformation(composer, "CC(remember):IntermediatePageActivity.kt#9igjgp");
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final IntermediatePageActivity intermediatePageActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.medicmedia.medilink.IntermediatePageActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IntermediatePageActivity.AnonymousClass1.C01571.invoke$lambda$3$lambda$2(intermediatePageActivity2, (Destination) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IntermediatePageViewKt.IntermediatePageView(qrContentsItem, function0, (Function1) objRememberedValue2, null, composer, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(IntermediatePageActivity intermediatePageActivity) {
                    intermediatePageActivity.finish();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(IntermediatePageActivity intermediatePageActivity, Destination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    intermediatePageActivity.getAppNavigator().navigate(intermediatePageActivity, it);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C42@1501L315,42@1487L329:IntermediatePageActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1796805408, i, -1, "com.medicmedia.medilink.IntermediatePageActivity.onCreate.<anonymous> (IntermediatePageActivity.kt:42)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(2024236155, true, new C01571(qrContentsItem, this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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
}
