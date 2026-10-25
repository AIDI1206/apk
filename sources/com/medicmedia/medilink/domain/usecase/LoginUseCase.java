package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.medicmedia.medilink.core.network.api.BaristaTokenGrantType;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.QueryParameterKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: LoginUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H&J \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u0015\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0005H&J\u001c\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\nH&¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/LoginUseCase;", "", "isTermsOfServiceAccepted", "", "acceptedTermsOfService", "", "saveBaristaToken", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;", QueryParameterKey.CODE, "", "(Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBaristaUserInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existsBookShelfItem", "createDefaultNotebook", "Lkotlin/Result;", HistoryRepositoryImpl.FieldName.SUB, "createDefaultNotebook-YNEx5aM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDefaultNoteTag", "createDefaultNoteTag-CmtIpJM", "maxDeviceLimit", "", "clearWithdrawalData", "sendLoginResult", "isSuccess", "errorMessage", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LoginUseCase {
    void acceptedTermsOfService();

    void clearWithdrawalData();

    /* JADX INFO: renamed from: createDefaultNoteTag-CmtIpJM, reason: not valid java name */
    Object mo10415createDefaultNoteTagCmtIpJM(Continuation<? super Result<Unit>> continuation);

    /* JADX INFO: renamed from: createDefaultNotebook-YNEx5aM, reason: not valid java name */
    Object mo10416createDefaultNotebookYNEx5aM(String str, Continuation<? super Result<Boolean>> continuation);

    boolean existsBookShelfItem();

    boolean isTermsOfServiceAccepted();

    long maxDeviceLimit();

    Object saveBaristaToken(BaristaTokenGrantType baristaTokenGrantType, String str, Continuation<? super Unit> continuation);

    Object saveBaristaUserInfo(Continuation<? super String> continuation);

    void sendLoginResult(boolean isSuccess, String errorMessage);

    /* JADX INFO: compiled from: LoginUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object saveBaristaToken$default(LoginUseCase loginUseCase, BaristaTokenGrantType baristaTokenGrantType, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveBaristaToken");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return loginUseCase.saveBaristaToken(baristaTokenGrantType, str, continuation);
        }

        public static /* synthetic */ void sendLoginResult$default(LoginUseCase loginUseCase, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLoginResult");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            loginUseCase.sendLoginResult(z, str);
        }
    }
}
