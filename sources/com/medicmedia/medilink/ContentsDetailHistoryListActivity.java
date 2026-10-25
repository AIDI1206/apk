package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.ui.extension.ActivityExtensionKt;
import com.medicmedia.medilink.ui.history.HistoryListParentType;
import com.medicmedia.medilink.ui.history.HistoryListViewKt;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.navigation.VideoPipDestinationHandler;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDetailHistoryListActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ContentsDetailHistoryListActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "videoPipDestinationHandler", "Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;", "getVideoPipDestinationHandler", "()Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;", "setVideoPipDestinationHandler", "(Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class ContentsDetailHistoryListActivity extends Hilt_ContentsDetailHistoryListActivity {

    @Inject
    public VideoPipDestinationHandler videoPipDestinationHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final VideoPipDestinationHandler getVideoPipDestinationHandler() {
        VideoPipDestinationHandler videoPipDestinationHandler = this.videoPipDestinationHandler;
        if (videoPipDestinationHandler != null) {
            return videoPipDestinationHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoPipDestinationHandler");
        return null;
    }

    public final void setVideoPipDestinationHandler(VideoPipDestinationHandler videoPipDestinationHandler) {
        Intrinsics.checkNotNullParameter(videoPipDestinationHandler, "<set-?>");
        this.videoPipDestinationHandler = videoPipDestinationHandler;
    }

    /* JADX INFO: compiled from: ContentsDetailHistoryListActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ContentsDetailHistoryListActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$ContentsDetailHistoryList;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.ContentsDetailHistoryList destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) ContentsDetailHistoryListActivity.class);
            intent.putExtra("contents_id", destination.getContentsId());
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_ContentsDetailHistoryListActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final HistoryListParentType.MainTab contentsDetail;
        super.onCreate(savedInstanceState);
        ContentsDetailHistoryListActivity contentsDetailHistoryListActivity = this;
        ActivityExtensionKt.enableEdgeToEdgeWithStyleLight(contentsDetailHistoryListActivity);
        String stringExtra = getIntent().getStringExtra("contents_id");
        if (stringExtra != null) {
            contentsDetail = new HistoryListParentType.ContentsDetail(stringExtra);
        } else {
            contentsDetail = HistoryListParentType.MainTab.INSTANCE;
        }
        ComponentActivityKt.setContent$default(contentsDetailHistoryListActivity, null, ComposableLambdaKt.composableLambdaInstance(1504345766, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.ContentsDetailHistoryListActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.ContentsDetailHistoryListActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: ContentsDetailHistoryListActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01501 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ HistoryListParentType $parentType;
                final /* synthetic */ ContentsDetailHistoryListActivity this$0;

                C01501(HistoryListParentType historyListParentType, ContentsDetailHistoryListActivity contentsDetailHistoryListActivity) {
                    this.$parentType = historyListParentType;
                    this.this$0 = contentsDetailHistoryListActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C42@1633L56,40@1542L166:ContentsDetailHistoryListActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2029755007, i, -1, "com.medicmedia.medilink.ContentsDetailHistoryListActivity.onCreate.<anonymous>.<anonymous> (ContentsDetailHistoryListActivity.kt:40)");
                        }
                        HistoryListParentType historyListParentType = this.$parentType;
                        composer.startReplaceGroup(129156093);
                        ComposerKt.sourceInformation(composer, "CC(remember):ContentsDetailHistoryListActivity.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ContentsDetailHistoryListActivity contentsDetailHistoryListActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.ContentsDetailHistoryListActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ContentsDetailHistoryListActivity.AnonymousClass1.C01501.invoke$lambda$1$lambda$0(contentsDetailHistoryListActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        HistoryListViewKt.HistoryListView(historyListParentType, null, (Function0) objRememberedValue, null, composer, 0, 10);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(ContentsDetailHistoryListActivity contentsDetailHistoryListActivity) {
                    contentsDetailHistoryListActivity.finish();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C39@1524L198,39@1510L212:ContentsDetailHistoryListActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1504345766, i, -1, "com.medicmedia.medilink.ContentsDetailHistoryListActivity.onCreate.<anonymous> (ContentsDetailHistoryListActivity.kt:39)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(-2029755007, true, new C01501(contentsDetail, this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        getVideoPipDestinationHandler().consumeAndNavigate(this);
    }
}
