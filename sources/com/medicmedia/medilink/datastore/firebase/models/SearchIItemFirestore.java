package com.medicmedia.medilink.datastore.firebase.models;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class SearchIItemFirestore {
    private String contents_id;
    private String contents_title;
    private String entry;
    private String id;
    private int index;
    public String input_keyword;
    public String keyword;
    private int level;
    private String refbody;
    private String refid;
    private String title;
    private Date updated_date;

    public SearchIItemFirestore() {
    }

    public SearchIItemFirestore(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, Date date, String str9) {
        setId(str);
        setKeyword(str2);
        setEntry(str3);
        setLevel(i);
        setRefid(str4);
        setTitle(str5);
        setRefbody(str6);
        setIndex(i2);
        setContents_id(str7);
        setContents_title(str8);
        setUpdated_date(date);
        setInput_keyword(str9);
    }

    public String getInput_keyword() {
        return this.input_keyword;
    }

    public void setInput_keyword(String str) {
        this.input_keyword = str;
    }

    public Date getUpdated_date() {
        return this.updated_date;
    }

    public void setUpdated_date(Date date) {
        this.updated_date = date;
    }

    public String getContents_id() {
        return this.contents_id;
    }

    public void setContents_id(String str) {
        this.contents_id = str;
    }

    public String getContents_title() {
        return this.contents_title;
    }

    public void setContents_title(String str) {
        this.contents_title = str;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public String getEntry() {
        return this.entry;
    }

    public void setEntry(String str) {
        this.entry = str;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String getRefid() {
        return this.refid;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getRefbody() {
        return this.refbody;
    }

    public void setRefbody(String str) {
        this.refbody = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }
}
