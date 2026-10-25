package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: MainTabUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/MainTabUseCase;", "", "enabledDashboard", "", "isEnableContinuousCheckMode", "isNotEmptyWritingHistories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendStartContinuousCheckEvent", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MainTabUseCase {
    boolean enabledDashboard();

    boolean isEnableContinuousCheckMode();

    Object isNotEmptyWritingHistories(Continuation<? super Boolean> continuation);

    void sendStartContinuousCheckEvent();
}
