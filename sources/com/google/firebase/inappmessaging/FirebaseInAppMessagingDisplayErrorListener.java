package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: loaded from: classes5.dex */
public interface FirebaseInAppMessagingDisplayErrorListener {
    void displayErrorEncountered(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason);
}
