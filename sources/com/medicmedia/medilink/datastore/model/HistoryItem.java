package com.medicmedia.medilink.datastore.model;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.IgnoreExtraProperties;
import com.medicmedia.medilink.MLConst;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@IgnoreExtraProperties
public class HistoryItem {
    protected String contents_id;
    protected String id;
    protected String option;
    protected String subtitle;
    protected String title;
    protected Timestamp updated_date;
    protected String url;

    public HistoryItem() {
    }

    public HistoryItem(String str, String str2, Timestamp timestamp, String str3, String str4, String str5, String str6) {
        this.id = str4;
        this.updated_date = timestamp;
        this.option = str3;
        this.title = str;
        this.subtitle = str2;
        this.contents_id = str6;
        this.url = str5;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
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

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getContents_id() {
        return this.contents_id;
    }

    public void setContents_id(String str) {
        this.contents_id = str;
    }

    public String getChapterId() {
        String str = this.contents_id;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrSplit = this.contents_id.split(MLConst.MLCommon.SEPALETER_SINGLE_TEXT);
        if (strArrSplit.length > 2) {
            return strArrSplit[2];
        }
        return null;
    }

    public String getVideoId() {
        String str = this.contents_id;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrSplit = this.contents_id.split(MLConst.MLCommon.SEPALETER_SINGLE_TEXT);
        if (strArrSplit.length > 4) {
            return strArrSplit[4];
        }
        return null;
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

    public int playMs() {
        String str = this.option;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(this.option);
                if (jSONObject.has("play_msec")) {
                    return jSONObject.getInt("play_msec");
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
