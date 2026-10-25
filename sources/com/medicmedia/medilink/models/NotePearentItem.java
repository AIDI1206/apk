package com.medicmedia.medilink.models;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class NotePearentItem {
    private boolean delete_flg;
    private String description;
    private int index;
    private String name;
    private String note_id;
    private String option;
    private Date updated_date;

    public NotePearentItem() {
    }

    public NotePearentItem(int i, String str, String str2, Date date, String str3, boolean z) {
        this.index = i;
        this.name = str;
        this.updated_date = date;
        this.description = str2;
        this.delete_flg = z;
        this.option = str3;
    }

    public String getNote_id() {
        return this.note_id;
    }

    public void setNote_id(String str) {
        this.note_id = str;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Date getUpdated_date() {
        return this.updated_date;
    }

    public void setUpdated_date(Date date) {
        this.updated_date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setdescription(String str) {
        this.description = str;
    }

    public boolean isDelete_flg() {
        return this.delete_flg;
    }

    public void setDelete_flg(boolean z) {
        this.delete_flg = z;
    }

    public String getOption() {
        return this.option;
    }

    public void setOption(String str) {
        this.option = str;
    }

    public String toString() {
        return this.name;
    }
}
