package com.medicmedia.medilink;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class ConnectionReceiver extends BroadcastReceiver {
    private final Observer mObserver;

    interface Observer {
        void onConnect();

        void onDisconnect();
    }

    public ConnectionReceiver(Observer observer) {
        this.mObserver = observer;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) Objects.requireNonNull((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.mObserver.onConnect();
        } else {
            this.mObserver.onDisconnect();
        }
    }
}
