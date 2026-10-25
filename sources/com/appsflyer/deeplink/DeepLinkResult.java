package com.appsflyer.deeplink;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeepLinkResult {
    private final DeepLink deepLink;
    private final Error error;
    private final Status status;

    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR
    }

    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    public DeepLinkResult(DeepLink deepLink, Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }

    public Error getError() {
        return this.error;
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.error);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.status);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", e);
        }
        return jSONObject.toString();
    }
}
