package com.medicmedia.medilink.ui.di;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.build.BuildTypeCondition;
import com.medicmedia.medilink.ui.build.UiBuildTypeBehavior;
import com.medicmedia.medilink.ui.build.UiBuildTypeBehaviorImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: UiBuildTypeBindModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/di/UiBuildTypeBindModule;", "", "<init>", "()V", "provideUiBuildTypeBehavior", "Lcom/medicmedia/medilink/ui/build/UiBuildTypeBehavior;", "provideBuildTypeCondition", "Lcom/medicmedia/medilink/ui/build/BuildTypeCondition;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class UiBuildTypeBindModule {
    public static final int $stable = 0;
    public static final UiBuildTypeBindModule INSTANCE = new UiBuildTypeBindModule();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean provideBuildTypeCondition$lambda$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean provideBuildTypeCondition$lambda$1() {
        return null;
    }

    private UiBuildTypeBindModule() {
    }

    @Provides
    public final UiBuildTypeBehavior provideUiBuildTypeBehavior() {
        return new UiBuildTypeBehaviorImpl();
    }

    @Provides
    @Singleton
    public final BuildTypeCondition provideBuildTypeCondition() {
        return new BuildTypeCondition(new Function0() { // from class: com.medicmedia.medilink.ui.di.UiBuildTypeBindModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiBuildTypeBindModule.provideBuildTypeCondition$lambda$0();
            }
        }, new Function0() { // from class: com.medicmedia.medilink.ui.di.UiBuildTypeBindModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiBuildTypeBindModule.provideBuildTypeCondition$lambda$1();
            }
        });
    }
}
