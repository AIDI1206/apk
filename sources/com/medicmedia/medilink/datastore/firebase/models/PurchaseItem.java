package com.medicmedia.medilink.datastore.firebase.models;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseItem {
    String content_code;
    Timestamp updated_date;
    String version;

    public PurchaseItem(String str, String str2, Timestamp timestamp) {
        this.content_code = str2;
        this.version = str;
        this.updated_date = timestamp;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getContent_code() {
        return this.content_code;
    }

    public void setContent_code(String str) {
        this.content_code = str;
    }

    public Timestamp getUpdated_date() {
        return this.updated_date;
    }

    public void setUpdated_date(Timestamp timestamp) {
        this.updated_date = timestamp;
    }
}
