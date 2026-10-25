package com.medicmedia.medilink.datastore.firebase.models;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class CreateSetItem {
    public Timestamp addition_date;
    public Timestamp created_date;
    public boolean delete_flg;
    public String display_license_id;
    public boolean enable_edit;
    public Timestamp exercise_date;
    public long member_id;
    public boolean official;
    public String set_id;
    public ArrayList<InnerHistory> set_list;
    public String set_title;
    public int type;
    public Timestamp updated_date;

    public static class InnerHistory {
        public String license_code;
        public String question_data_id;
        public String question_id;

        public InnerHistory(String str, String str2) {
            this.license_code = str;
            this.question_id = str2;
        }

        public InnerHistory(String str, String str2, String str3) {
            this.license_code = str;
            this.question_id = str2;
            this.question_data_id = str3;
        }

        public InnerHistory() {
        }
    }

    public CreateSetItem() {
        this.set_list = new ArrayList<>();
    }

    public CreateSetItem(Timestamp timestamp, Timestamp timestamp2, Timestamp timestamp3, boolean z, boolean z2, boolean z3, String str, long j, String str2, String str3, Timestamp timestamp4, int i, ArrayList<InnerHistory> arrayList) {
        new ArrayList();
        this.addition_date = timestamp;
        this.created_date = timestamp2;
        this.updated_date = timestamp3;
        this.delete_flg = z;
        this.enable_edit = z2;
        this.official = z3;
        this.display_license_id = str;
        this.member_id = j;
        this.set_id = str2;
        this.set_title = str3;
        this.exercise_date = timestamp4;
        this.type = i;
        this.set_list = arrayList;
    }

    public CreateSetItem createNewItem(String str) {
        Timestamp timestamp = new Timestamp(new Date());
        return new CreateSetItem(this.addition_date, timestamp, timestamp, this.delete_flg, this.enable_edit, this.official, this.display_license_id, Long.parseLong(str), UUID.randomUUID().toString(), this.set_title, this.exercise_date, this.type, this.set_list);
    }
}
