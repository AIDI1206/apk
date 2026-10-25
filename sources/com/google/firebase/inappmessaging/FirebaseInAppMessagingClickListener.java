package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: loaded from: classes5.dex */
public interface FirebaseInAppMessagingClickListener {
    void messageClicked(InAppMessage inAppMessage, Action action);
}
