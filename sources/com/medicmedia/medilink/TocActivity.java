package com.medicmedia.medilink;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.TocType;
import com.medicmedia.medilink.ui.extension.ActivityExtensionKt;
import com.medicmedia.medilink.ui.navigation.Destination;
import com.medicmedia.medilink.ui.navigation.VideoPipDestinationHandler;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import com.medicmedia.medilink.ui.video.VideoTocViewKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TocActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/TocActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "videoPipDestinationHandler", "Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;", "getVideoPipDestinationHandler", "()Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;", "setVideoPipDestinationHandler", "(Lcom/medicmedia/medilink/ui/navigation/VideoPipDestinationHandler;)V", BundleKey.TOC_TYPE, "Lcom/medicmedia/medilink/domain/TocType;", "getTocType", "()Lcom/medicmedia/medilink/domain/TocType;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class TocActivity extends Hilt_TocActivity {

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

    /* JADX INFO: Access modifiers changed from: private */
    public final TocType getTocType() {
        if (Build.VERSION.SDK_INT >= 33) {
            return (TocType) getIntent().getSerializableExtra(BundleKey.TOC_TYPE, TocType.class);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra(BundleKey.TOC_TYPE);
        if (serializableExtra instanceof TocType) {
            return (TocType) serializableExtra;
        }
        return null;
    }

    /* JADX INFO: compiled from: TocActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/TocActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/ui/navigation/Destination$Toc;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, Destination.Toc destination) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intent intent = new Intent(context, (Class<?>) TocActivity.class);
            if (destination instanceof Destination.Toc.Book) {
                intent.putExtra(BundleKey.TOC_TYPE, TocType.BOOK);
                Destination.Toc.Book book = (Destination.Toc.Book) destination;
                intent.putExtra("contents_id", book.getContentsId());
                String tagId = book.getTagId();
                if (tagId != null) {
                    intent.putExtra(BundleKey.TAG_ID, tagId);
                    return intent;
                }
            } else {
                if (!(destination instanceof Destination.Toc.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                intent.putExtra(BundleKey.TOC_TYPE, TocType.VIDEO);
                Destination.Toc.Video video = (Destination.Toc.Video) destination;
                intent.putExtra("contents_id", video.getContentsId());
                intent.putExtra("chapter_id", video.getChapterId());
                Integer videoId = video.getVideoId();
                if (videoId != null) {
                    intent.putExtra(BundleKey.VIDEO_ID, videoId.intValue());
                }
            }
            return intent;
        }
    }

    @Override // com.medicmedia.medilink.Hilt_TocActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TocActivity tocActivity = this;
        ActivityExtensionKt.enableEdgeToEdgeWithStyleLight(tocActivity);
        final String stringExtra = getIntent().getStringExtra("contents_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ComponentActivityKt.setContent$default(tocActivity, null, ComposableLambdaKt.composableLambdaInstance(1901126406, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.TocActivity.onCreate.1

            /* JADX INFO: renamed from: com.medicmedia.medilink.TocActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TocActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class C01661 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ String $contentsId;
                final /* synthetic */ TocActivity this$0;

                /* JADX INFO: renamed from: com.medicmedia.medilink.TocActivity$onCreate$1$1$WhenMappings */
                /* JADX INFO: compiled from: TocActivity.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TocType.values().length];
                        try {
                            iArr[TocType.BOOK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TocType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                C01661(TocActivity tocActivity, String str) {
                    this.this$0 = tocActivity;
                    this.$contentsId = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C:TocActivity.kt#ha4l3u");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-736221599, i, -1, "com.medicmedia.medilink.TocActivity.onCreate.<anonymous>.<anonymous> (TocActivity.kt:75)");
                        }
                        TocType tocType = this.this$0.getTocType();
                        int i2 = tocType != null ? WhenMappings.$EnumSwitchMapping$0[tocType.ordinal()] : -1;
                        if (i2 == 1) {
                            composer.startReplaceGroup(-1494678081);
                            ComposerKt.sourceInformation(composer, "81@3463L72,78@3309L253");
                            String stringExtra = this.this$0.getIntent().getStringExtra(BundleKey.TAG_ID);
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            String str = this.$contentsId;
                            composer.startReplaceGroup(1060171308);
                            ComposerKt.sourceInformation(composer, "CC(remember):TocActivity.kt#9igjgp");
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final TocActivity tocActivity = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.medicmedia.medilink.TocActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TocActivity.AnonymousClass1.C01661.invoke$lambda$1$lambda$0(tocActivity);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            TocActivityKt.BookContentsTocView(str, stringExtra, (Function0) objRememberedValue, composer, 0);
                            composer.endReplaceGroup();
                        } else if (i2 == 2) {
                            composer.startReplaceGroup(-1494255303);
                            ComposerKt.sourceInformation(composer, "93@4050L72,89@3836L313");
                            int intExtra = this.this$0.getIntent().getIntExtra("chapter_id", 0);
                            Integer numValueOf = Integer.valueOf(this.this$0.getIntent().getIntExtra(BundleKey.VIDEO_ID, 0));
                            if (numValueOf.intValue() <= 0) {
                                numValueOf = null;
                            }
                            Integer num = numValueOf;
                            String str2 = this.$contentsId;
                            composer.startReplaceGroup(1060190092);
                            ComposerKt.sourceInformation(composer, "CC(remember):TocActivity.kt#9igjgp");
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final TocActivity tocActivity2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.medicmedia.medilink.TocActivity$onCreate$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TocActivity.AnonymousClass1.C01661.invoke$lambda$4$lambda$3(tocActivity2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            VideoTocViewKt.VideoTocView(str2, intExtra, num, (Function0) objRememberedValue2, null, composer, 0, 16);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(1060194824);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(TocActivity tocActivity) {
                    tocActivity.finish();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3(TocActivity tocActivity) {
                    tocActivity.finish();
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C74@3130L1106,74@3116L1120:TocActivity.kt#ha4l3u");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1901126406, i, -1, "com.medicmedia.medilink.TocActivity.onCreate.<anonymous> (TocActivity.kt:74)");
                    }
                    ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(-736221599, true, new C01661(TocActivity.this, stringExtra), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
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
        TocType tocType = getTocType();
        if (tocType == null || !tocType.isVideo()) {
            return;
        }
        getVideoPipDestinationHandler().consumeAndNavigate(this);
    }
}
