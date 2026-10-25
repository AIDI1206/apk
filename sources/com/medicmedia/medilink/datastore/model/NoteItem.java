package com.medicmedia.medilink.datastore.model;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.IgnoreExtraProperties;
import com.medicmedia.medilink.MLConst;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@IgnoreExtraProperties
public class NoteItem {
    protected String color;
    protected boolean delete_flg;
    protected int mode;
    protected String note_data_id;
    protected String option;
    protected String range;
    protected String sub;
    protected String subtitle;
    protected String tab_id;
    protected List<DocumentReference> tags;
    protected String text;
    protected String title;
    protected String title_kana;
    protected Timestamp updated_date;
    protected String url;
    protected Timestamp view_date;

    public String getSub() {
        return this.sub;
    }

    public void setSub(String str) {
        this.sub = str;
    }

    public NoteItem() {
    }

    public NoteItem(int i, String str, Timestamp timestamp, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Timestamp timestamp2, List<DocumentReference> list, String str9, String str10, String str11) {
        this.mode = i;
        this.text = str;
        this.updated_date = timestamp;
        this.option = str2;
        this.delete_flg = z;
        this.tab_id = str5;
        this.note_data_id = str6;
        this.range = str7;
        this.title = str3;
        this.subtitle = str4;
        this.url = str8;
        this.view_date = timestamp2;
        this.tags = list;
        this.color = str9;
        this.title_kana = str10;
        this.sub = str11;
    }

    public String courseId() {
        String[] strArrSplit = this.note_data_id.split(MLConst.MLCommon.SEPALETER_SINGLE_TEXT);
        if (strArrSplit.length > 1) {
            return strArrSplit[1];
        }
        return null;
    }

    public String getTitle_kana() {
        return this.title_kana;
    }

    public void setTitle_kana(String str) {
        this.title_kana = str;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public List<DocumentReference> getTags() {
        return this.tags;
    }

    public void setTags(List<DocumentReference> list) {
        this.tags = list;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public Timestamp getView_date() {
        return this.view_date;
    }

    public void setView_date(Timestamp timestamp) {
        this.view_date = timestamp;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String str) {
        this.range = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public int getMode() {
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
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

    public String gettab_id() {
        return this.tab_id;
    }

    public void settab_id(String str) {
        this.tab_id = str;
    }

    public String getNote_data_id() {
        return this.note_data_id;
    }

    public void setNote_data_id(String str) {
        this.note_data_id = str;
    }

    public boolean isPdf() {
        String str = this.option;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(this.option);
                if (jSONObject.has("is_pdf")) {
                    return jSONObject.getBoolean("is_pdf");
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
