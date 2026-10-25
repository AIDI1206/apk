package com.medicmedia.medilink.ui.checkmode;

import android.content.Context;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.ui.common.SelectionActionHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ContinuousCheckModeItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J3\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\bH&J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\rH&J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0004H&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/ui/checkmode/ContinuousCheckModeWebViewCallbacks;", "", "addCustomUserAgent", "Lkotlin/Function1;", "", "getAddCustomUserAgent", "()Lkotlin/jvm/functions/Function1;", "onReceivedTitle", "", "pageId", HistoryRepositoryImpl.FieldName.TITLE, "onProgressChanged", "progress", "", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", BundleKey.TAB_NO, "(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/Integer;)V", "onHandleUrl", "", "context", "Landroid/content/Context;", "onWebViewTap", "onWebViewScroll", "dyPx", "onWebViewOverScrollTop", "onWebViewOverScrollBottom", "createSelectionActionHandler", "Lcom/medicmedia/medilink/ui/common/SelectionActionHandler;", "onImageLongTap", "imageUrl", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContinuousCheckModeWebViewCallbacks {
    SelectionActionHandler createSelectionActionHandler(Context context);

    Function1<String, String> getAddCustomUserAgent();

    boolean onHandleUrl(Context context, String pageId, String url);

    void onImageLongTap(String imageUrl);

    void onPageFinished(String pageId, WebView view, String url, Integer tabNo);

    void onProgressChanged(String pageId, int progress);

    void onReceivedTitle(String pageId, String title);

    void onWebViewOverScrollBottom(String pageId);

    void onWebViewOverScrollTop(String pageId);

    void onWebViewScroll(int dyPx);

    void onWebViewTap();
}
