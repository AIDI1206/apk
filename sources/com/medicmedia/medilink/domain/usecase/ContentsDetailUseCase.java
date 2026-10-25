package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.ReferenceItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ContentsDetailUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J8\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\nH¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/ContentsDetailUseCase;", "", "buildNextUrl", "", "url", "formattedHighlightText", "Lkotlin/Pair;", "", "value", "getReferenceItems", "", "Lcom/medicmedia/medilink/domain/model/ReferenceItem;", "saveHistory", "", "contentsId", "contentsTitle", "subTitle", BundleKey.TAG_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userActionLog", "arguments", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContentsDetailUseCase {
    String buildNextUrl(String url);

    Pair<Boolean, String> formattedHighlightText(String value);

    List<ReferenceItem> getReferenceItems();

    Object saveHistory(String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation);

    Object userActionLog(List<? extends Object> list, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: ContentsDetailUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object saveHistory$default(ContentsDetailUseCase contentsDetailUseCase, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveHistory");
            }
            if ((i & 16) != 0) {
                str5 = "";
            }
            return contentsDetailUseCase.saveHistory(str, str2, str3, str4, str5, continuation);
        }
    }
}
