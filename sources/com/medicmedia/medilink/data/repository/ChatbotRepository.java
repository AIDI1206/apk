package com.medicmedia.medilink.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.core.network.functions.response.SseEvent;
import com.medicmedia.medilink.data.model.ChatLog;
import com.medicmedia.medilink.data.model.ChatLogPage;
import com.medicmedia.medilink.data.model.ChatLogPagingToken;
import com.medicmedia.medilink.data.model.ChatSession;
import com.medicmedia.medilink.data.model.ChatUsage;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: ChatbotRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦@¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\nJ2\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H¦@¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\nJ\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010 \u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/data/repository/ChatbotRepository;", "", "getAllSessions", "", "", "Lcom/medicmedia/medilink/data/model/ChatSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "Lkotlin/Pair;", "documentId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "", "deleteAllSessions", "pageSize", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatLogs", "", "Lcom/medicmedia/medilink/data/model/ChatLog;", "sessionId", "getChatLogsPage", "Lcom/medicmedia/medilink/data/model/ChatLogPage;", "token", "Lcom/medicmedia/medilink/data/model/ChatLogPagingToken;", "(Ljava/lang/String;JLcom/medicmedia/medilink/data/model/ChatLogPagingToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendChatMessageStream", "Lkotlinx/coroutines/flow/Flow;", "Lcom/medicmedia/medilink/core/network/functions/response/SseEvent;", SearchIntents.EXTRA_QUERY, "chatUsageByMonth", "Lcom/medicmedia/medilink/data/model/ChatUsage;", "date", "chatUsageByDays", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ChatbotRepository {
    Object chatUsageByDays(String str, Continuation<? super List<ChatUsage>> continuation);

    Object chatUsageByMonth(String str, Continuation<? super ChatUsage> continuation);

    Object deleteAllSessions(long j, Continuation<? super Unit> continuation);

    Object deleteSession(String str, Continuation<? super Unit> continuation);

    Object getAllSessions(Continuation<? super Map<String, ChatSession>> continuation);

    Object getChatLogs(String str, Continuation<? super List<ChatLog>> continuation);

    Object getChatLogsPage(String str, long j, ChatLogPagingToken chatLogPagingToken, Continuation<? super ChatLogPage<ChatLog>> continuation);

    Object getSession(String str, Continuation<? super Pair<String, ChatSession>> continuation);

    Flow<SseEvent> sendChatMessageStream(String query, String sessionId);

    /* JADX INFO: compiled from: ChatbotRepository.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object deleteAllSessions$default(ChatbotRepository chatbotRepository, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAllSessions");
            }
            if ((i & 1) != 0) {
                j = 500;
            }
            return chatbotRepository.deleteAllSessions(j, continuation);
        }

        public static /* synthetic */ Object getChatLogsPage$default(ChatbotRepository chatbotRepository, String str, long j, ChatLogPagingToken chatLogPagingToken, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChatLogsPage");
            }
            if ((i & 4) != 0) {
                chatLogPagingToken = null;
            }
            return chatbotRepository.getChatLogsPage(str, j, chatLogPagingToken, continuation);
        }

        public static /* synthetic */ Flow sendChatMessageStream$default(ChatbotRepository chatbotRepository, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendChatMessageStream");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return chatbotRepository.sendChatMessageStream(str, str2);
        }
    }
}
