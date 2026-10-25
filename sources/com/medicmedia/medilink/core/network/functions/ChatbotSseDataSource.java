package com.medicmedia.medilink.core.network.functions;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.functions.response.SseEvent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: ChatbotSseDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/ChatbotSseDataSource;", "", "sendChatMessageStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", "parameters", "Lcom/medicmedia/medilink/core/network/functions/ChatbotParameters;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ChatbotSseDataSource {
    Flow<SseEvent> sendChatMessageStream(ChatbotParameters parameters);
}
