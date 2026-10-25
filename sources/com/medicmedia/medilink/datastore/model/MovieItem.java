package com.medicmedia.medilink.datastore.model;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes6.dex */
public class MovieItem {
    protected String category_id;
    protected String chapter_id;
    protected String course_id;
    protected boolean delete_flg;
    protected int mode;
    protected String note_data_id;
    protected String option;
    protected Timestamp updated_date;
    protected String url;
    protected String video_id;

    public MovieItem() {
    }

    public MovieItem(int i, String str, Timestamp timestamp, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        this.mode = i;
        this.course_id = str;
        this.updated_date = timestamp;
        this.option = str2;
        this.delete_flg = z;
        this.chapter_id = str3;
        this.category_id = str4;
        this.note_data_id = str5;
        this.video_id = str6;
        this.url = str7;
    }

    public int getMode() {
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i;
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

    public String getChapter_id() {
        return this.chapter_id;
    }

    public void setChapter_id(String str) {
        this.chapter_id = str;
    }

    public String getCategory_id() {
        return this.category_id;
    }

    public void setCategory_id(String str) {
        this.category_id = str;
    }

    public String getNote_data_id() {
        return this.note_data_id;
    }

    public void setNote_data_id(String str) {
        this.note_data_id = str;
    }

    public String getVideo_id() {
        return this.video_id;
    }

    public void setVideo_id(String str) {
        this.video_id = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
