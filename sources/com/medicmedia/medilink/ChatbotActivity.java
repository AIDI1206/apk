package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.analytics.AnalyticsClient;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.chatbot.ChatbotStartType;
import com.medicmedia.medilink.ui.chatbot.ChatbotViewKt;
import com.medicmedia.medilink.ui.navigation.AppNavigator;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatbotActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ChatbotActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "appNavigator", "Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "getAppNavigator", "()Lcom/medicmedia/medilink/ui/navigation/AppNavigator;", "setAppNavigator", "(Lcom/medicmedia/medilink/ui/navigation/AppNavigator;)V", "analyticsClient", "Lcom/medicmedia/medilink/analytics/AnalyticsClient;", "getAnalyticsClient", "()Lcom/medicmedia/medilink/analytics/AnalyticsClient;", "setAnalyticsClient", "(Lcom/medicmedia/medilink/analytics/AnalyticsClient;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class ChatbotActivity extends Hilt_ChatbotActivity {

    @Inject
    public AnalyticsClient analyticsClient;

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

    public final AnalyticsClient getAnalyticsClient() {
        AnalyticsClient analyticsClient = this.analyticsClient;
        if (analyticsClient != null) {
            return analyticsClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsClient");
        return null;
    }

    public final void setAnalyticsClient(AnalyticsClient analyticsClient) {
        Intrinsics.checkNotNullParameter(analyticsClient, "<set-?>");
        this.analyticsClient = analyticsClient;
    }

    /* JADX INFO: compiled from: ChatbotActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ChatbotActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$Chatbot;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.Chatbot destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) ChatbotActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("screen_name", destination.getScreenName());
            bundle.putString(BundleKey.CHAT_SESSION_ID, destination.getSessionId());
            intent.putExtras(bundle);
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_ChatbotActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        super.onCreate(savedInstanceState);
        ChatbotActivity chatbotActivity = this;
        EdgeToEdge.enable$default(chatbotActivity, null, null, 3, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("screen_name", ChatbotStartType.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("screen_name");
            if (!(serializableExtra2 instanceof ChatbotStartType)) {
                serializableExtra2 = null;
            }
            serializableExtra = (Serializable) ((ChatbotStartType) serializableExtra2);
        }
        final ChatbotStartType chatbotStartType = (ChatbotStartType) serializableExtra;
        final String stringExtra = getIntent().getStringExtra(BundleKey.CHAT_SESSION_ID);
        ComponentActivityKt.setContent$default(chatbotActivity, null, ComposableLambdaKt.composableLambdaInstance(-963740762, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.ChatbotActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.ChatbotActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: ChatbotActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01491 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ ChatbotStartType $screenName;
                final /* synthetic */ String $sessionId;
                final /* synthetic */ ChatbotActivity this$0;

                C01491(String str, ChatbotStartType chatbotStartType, ChatbotActivity chatbotActivity) {
                    this.$sessionId = str;
                    this.$screenName = chatbotStartType;
                    this.this$0 = chatbotActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C51@1904L56,54@1995L79,48@1774L319:ChatbotActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1447283711, i, -1, "com.medicmedia.medilink.ChatbotActivity.onCreate.<anonymous>.<anonymous> (ChatbotActivity.kt:48)");
                        }
                        String str = this.$sessionId;
                        ChatbotStartType chatbotStartType = this.$screenName;
                        composer.startReplaceGroup(1870476469);
                        ComposerKt.sourceInformation(composer, "CC(remember):ChatbotActivity.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ChatbotActivity chatbotActivity = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.ChatbotActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChatbotActivity.AnonymousClass1.C01491.invoke$lambda$1$lambda$0(chatbotActivity);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1870479404);
                        ComposerKt.sourceInformation(composer, "CC(remember):ChatbotActivity.kt#9igjgp");
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final ChatbotActivity chatbotActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.medicmedia.medilink.ChatbotActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChatbotActivity.AnonymousClass1.C01491.invoke$lambda$3$lambda$2(chatbotActivity2, (Destination) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ChatbotViewKt.ChatbotView(str, chatbotStartType, function0, (Function1) objRememberedValue2, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(ChatbotActivity chatbotActivity) {
                    chatbotActivity.finish();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(ChatbotActivity chatbotActivity, Destination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    chatbotActivity.getAppNavigator().navigate(chatbotActivity, it);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C47@1756L351,47@1742L365:ChatbotActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-963740762, i, -1, "com.medicmedia.medilink.ChatbotActivity.onCreate.<anonymous> (ChatbotActivity.kt:47)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(-1447283711, true, new C01491(stringExtra, chatbotStartType, this), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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
