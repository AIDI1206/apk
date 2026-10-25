package com.medicmedia.medilink.datastore.firebase.models;

import com.google.firebase.Timestamp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ExerciseHistoryItem {
    public ArrayList<InnerHistory> answer_histories;
    public int answer_pattern;
    public int answer_status;
    public Timestamp answered_date;
    public ArrayList<String> chapter_codes;
    public Timestamp create_set_updated_date;
    public String exam_block;
    public int exam_version;
    public boolean has_create_set;
    public int kind;
    public String kind_data;
    public Timestamp latest_missed_date;
    public int member_id;
    public String question_data_id;
    public String question_id;
    public int question_score;
    public int required;
    public String required_data;
    public Timestamp updated_date;
    public int user_status;
    public String users_answer;

    public static class InnerHistory {
        public int answer_status;
        public Timestamp answered_date;
        public int user_status;
        public String users_answer;

        public InnerHistory(Timestamp timestamp, int i, String str, int i2) {
            this.answered_date = timestamp;
            this.answer_status = i;
            this.users_answer = str;
            this.user_status = i2;
        }

        public InnerHistory() {
        }
    }

    public ExerciseHistoryItem() {
        this.answer_histories = new ArrayList<>();
    }

    public ExerciseHistoryItem(int i, Timestamp timestamp, String str, String str2, boolean z, ArrayList<InnerHistory> arrayList, int i2, ArrayList<String> arrayList2, int i3, String str3, Timestamp timestamp2, int i4, int i5, int i6, int i7, Timestamp timestamp3, Timestamp timestamp4, String str4, String str5, String str6, int i8) {
        new ArrayList();
        this.answer_status = i;
        this.updated_date = timestamp;
        this.users_answer = str;
        this.question_id = str2;
        this.has_create_set = z;
        this.answer_histories = arrayList;
        this.user_status = i2;
        this.answered_date = timestamp2;
        this.member_id = i4;
        this.chapter_codes = arrayList2;
        this.exam_version = i3;
        this.exam_block = str3;
        this.required = i5;
        this.kind = i6;
        this.required_data = str4;
        this.kind_data = str5;
        this.answer_pattern = i7;
        this.create_set_updated_date = timestamp3;
        this.latest_missed_date = timestamp4;
        this.question_data_id = str6;
        this.question_score = i8;
    }
}
