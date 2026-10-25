package com.medicmedia.medilink.datastore.firebase.models;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes6.dex */
public class QBShareSetItem {
    public String content_code;
    public Timestamp created_date;
    public long member_id;
    public boolean official;
    public String origin_user;
    public String set_id;
    public String set_title;
    public Timestamp shared_date;

    public QBShareSetItem() {
    }

    public QBShareSetItem(Timestamp timestamp, Timestamp timestamp2, boolean z, String str, String str2, long j, String str3, String str4) {
        this.created_date = timestamp;
        this.shared_date = timestamp2;
        this.official = z;
        this.origin_user = str;
        this.set_id = str2;
        this.member_id = j;
        this.content_code = str3;
        this.set_title = str4;
    }
}
