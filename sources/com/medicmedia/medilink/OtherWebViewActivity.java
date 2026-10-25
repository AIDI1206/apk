package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import com.medicmedia.medilink.ui.web.OtherWebViewArgs;
import com.medicmedia.medilink.ui.web.OtherWebViewKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtherWebViewActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/OtherWebViewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class OtherWebViewActivity extends Hilt_OtherWebViewActivity {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: OtherWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/OtherWebViewActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$OtherWeb;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.OtherWeb destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) OtherWebViewActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(BundleKey.WEB_ARGS, destination.toArgs());
            intent.putExtras(bundle);
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_OtherWebViewActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        OtherWebViewActivity otherWebViewActivity = this;
        EdgeToEdge.enable$default(otherWebViewActivity, null, null, 3, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra(BundleKey.WEB_ARGS, OtherWebViewArgs.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra(BundleKey.WEB_ARGS);
            if (!(parcelableExtra instanceof OtherWebViewArgs)) {
                parcelableExtra = null;
            }
            parcelable = (OtherWebViewArgs) parcelableExtra;
        }
        final OtherWebViewArgs otherWebViewArgs = (OtherWebViewArgs) parcelable;
        if (otherWebViewArgs == null) {
            otherWebViewArgs = new OtherWebViewArgs(null, null, false, 7, null);
        }
        ComponentActivityKt.setContent$default(otherWebViewActivity, null, ComposableLambdaKt.composableLambdaInstance(-1849242530, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.OtherWebViewActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.OtherWebViewActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: OtherWebViewActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01641 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ OtherWebViewArgs $args;
                final /* synthetic */ OtherWebViewActivity this$0;

                C01641(OtherWebViewArgs otherWebViewArgs, OtherWebViewActivity otherWebViewActivity) {
                    this.$args = otherWebViewArgs;
                    this.this$0 = otherWebViewActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C41@1486L12,39@1404L113:OtherWebViewActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1853492985, i, -1, "com.medicmedia.medilink.OtherWebViewActivity.onCreate.<anonymous>.<anonymous> (OtherWebViewActivity.kt:39)");
                        }
                        OtherWebViewArgs otherWebViewArgs = this.$args;
                        composer.startReplaceGroup(1474235303);
                        ComposerKt.sourceInformation(composer, "CC(remember):OtherWebViewActivity.kt#9igjgp");
                        boolean zChanged = composer.changed(this.this$0);
                        final OtherWebViewActivity otherWebViewActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.OtherWebViewActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OtherWebViewActivity.AnonymousClass1.C01641.invoke$lambda$1$lambda$0(otherWebViewActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        OtherWebViewKt.OtherWebViewScreen(null, otherWebViewArgs, (Function0) objRememberedValue, null, null, composer, OtherWebViewArgs.$stable << 3, 25);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(OtherWebViewActivity otherWebViewActivity) {
                    otherWebViewActivity.finish();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C38@1386L145,38@1372L159:OtherWebViewActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1849242530, i, -1, "com.medicmedia.medilink.OtherWebViewActivity.onCreate.<anonymous> (OtherWebViewActivity.kt:38)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(1853492985, true, new C01641(otherWebViewArgs, this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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
