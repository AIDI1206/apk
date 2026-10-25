package com.instacart.truetime;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.net.InetAddress;
import kotlin.Metadata;

/* JADX INFO: compiled from: TrueTimeEventListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/instacart/truetime/SntpEventListener;", "", "sntpRequest", "", "address", "Ljava/net/InetAddress;", "sntpRequestFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sntpRequestSuccessful", "library_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SntpEventListener {
    void sntpRequest(InetAddress address);

    void sntpRequestFailed(InetAddress address, Exception e);

    void sntpRequestSuccessful(InetAddress address);
}
