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
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsEditListActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/ContentsEditListActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class ContentsEditListActivity extends Hilt_ContentsEditListActivity {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ContentsEditListActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ContentsEditListActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsEditList;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.ContentsEditList destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) ContentsEditListActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt(BundleKey.EDIT_MODE, destination.getEditMode());
            intent.putExtras(bundle);
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_ContentsEditListActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentsEditListActivity contentsEditListActivity = this;
        EdgeToEdge.enable$default(contentsEditListActivity, null, null, 3, null);
        final int intExtra = getIntent().getIntExtra(BundleKey.EDIT_MODE, 2);
        ComponentActivityKt.setContent$default(contentsEditListActivity, null, ComposableLambdaKt.composableLambdaInstance(2000415020, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.ContentsEditListActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.ContentsEditListActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: ContentsEditListActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01511 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ int $editMode;
                final /* synthetic */ ContentsEditListActivity this$0;

                C01511(int i, ContentsEditListActivity contentsEditListActivity) {
                    this.$editMode = i;
                    this.this$0 = contentsEditListActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C45@1669L56,43@1577L167:ContentsEditListActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1526489287, i, -1, "com.medicmedia.medilink.ContentsEditListActivity.onCreate.<anonymous>.<anonymous> (ContentsEditListActivity.kt:43)");
                        }
                        int i2 = this.$editMode;
                        composer.startReplaceGroup(1952602874);
                        ComposerKt.sourceInformation(composer, "CC(remember):ContentsEditListActivity.kt#9igjgp");
                        boolean zChanged = composer.changed(this.this$0);
                        final ContentsEditListActivity contentsEditListActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.ContentsEditListActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ContentsEditListActivity.AnonymousClass1.C01511.invoke$lambda$1$lambda$0(contentsEditListActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        ContentsEditListActivityKt.ContentsEditListView(i2, (Function0) objRememberedValue, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(ContentsEditListActivity contentsEditListActivity) {
                    contentsEditListActivity.finish();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C42@1559L199,42@1545L213:ContentsEditListActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2000415020, i, -1, "com.medicmedia.medilink.ContentsEditListActivity.onCreate.<anonymous> (ContentsEditListActivity.kt:42)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(1526489287, true, new C01511(intExtra, this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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
