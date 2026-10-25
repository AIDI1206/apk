package com.facebook.stetho.inspector.jsonrpc.protocol;

import com.facebook.stetho.json.annotation.JsonProperty;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class JsonRpcEvent {

    @JsonProperty(required = true)
    public String method;

    @JsonProperty
    public JSONObject params;

    public JsonRpcEvent() {
    }

    public JsonRpcEvent(String str, @Nullable JSONObject jSONObject) {
        this.method = str;
        this.params = jSONObject;
    }
}
