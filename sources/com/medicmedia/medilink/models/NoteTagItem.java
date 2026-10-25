package com.medicmedia.medilink.models;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class NoteTagItem {
    private boolean delete_flg;
    private String name;
    private boolean preset_flg;
    private Date updated_date;

    public NoteTagItem() {
    }

    public NoteTagItem(String str, boolean z, Date date, boolean z2) {
        this.name = str;
        this.preset_flg = z;
        this.updated_date = date;
        this.delete_flg = z2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean isPreset_flg() {
        return this.preset_flg;
    }

    public void setPreset_flg(boolean z) {
        this.preset_flg = z;
    }

    public boolean isDelete_flg() {
        return this.delete_flg;
    }

    public void setDelete_flg(boolean z) {
        this.delete_flg = z;
    }

    public Date getUpdated_date() {
        return this.updated_date;
    }

    public void setUpdated_date(Date date) {
        this.updated_date = date;
    }
}
