package com.medicmedia.medilink.ui.common;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ContentsDetailLinkHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkHandler;", "", "linkQBRef", "Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult;", "nextUri", "Landroid/net/Uri;", "linkLcRef", "contentsId", "", "linkQrRef", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkOtherRef", "linkQBv4", "nextUrl", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContentsDetailLinkHandler {
    ContentsDetailLinkResult linkLcRef(Uri nextUri, String contentsId);

    ContentsDetailLinkResult linkOtherRef(Uri nextUri, String contentsId);

    ContentsDetailLinkResult linkQBRef(Uri nextUri);

    ContentsDetailLinkResult linkQBv4(String nextUrl);

    Object linkQrRef(Uri uri, Continuation<? super ContentsDetailLinkResult> continuation);

    /* JADX INFO: compiled from: ContentsDetailLinkHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ ContentsDetailLinkResult linkOtherRef$default(ContentsDetailLinkHandler contentsDetailLinkHandler, Uri uri, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkOtherRef");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return contentsDetailLinkHandler.linkOtherRef(uri, str);
        }
    }
}
