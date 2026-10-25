package com.medicmedia.medilink.datastore.firebase.models;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes6.dex */
public class MovieStarItem {
    protected String course_id;
    protected boolean delete_flg;
    protected String option;
    protected Timestamp updated_date;

    public MovieStarItem() {
    }

    public MovieStarItem(String str, Timestamp timestamp, String str2, boolean z) {
        this.course_id = str;
        this.updated_date = timestamp;
        this.option = str2;
        this.delete_flg = z;
    }

    public String getCourse_id() {
        return this.course_id;
    }

    public void setCourse_id(String str) {
        this.course_id = str;
    }

    public Timestamp getUpdated_date() {
        return this.updated_date;
    }

    public void setUpdated_date(Timestamp timestamp) {
        this.updated_date = timestamp;
    }

    public String getOption() {
        return this.option;
    }

    public void setOption(String str) {
        this.option = str;
    }

    public boolean isDelete_flg() {
        return this.delete_flg;
    }

    public void setDelete_flg(boolean z) {
        this.delete_flg = z;
    }
}
