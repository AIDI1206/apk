package com.medicmedia.medilink.database;

import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.medicmedia.medilink.MLConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ContentsJson {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String[] ReplaceFileList = {"topmenu_tentative.html", "topmenu.html"};
    private String fileName;
    private String parentPath;
    public JSONObject rootsObject;

    public String getFileName() {
        return this.fileName;
    }

    public String getContentsPath() {
        return this.parentPath;
    }

    public boolean isAlive() {
        return this.rootsObject != null;
    }

    public ContentsJson(String str) {
        this.rootsObject = null;
        this.fileName = null;
        this.parentPath = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = new File(str).getParent().split(DomExceptionUtils.SEPARATOR);
        this.parentPath = strArrSplit[strArrSplit.length - 1];
        this.fileName = str;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            this.rootsObject = new JSONObject(new String(bArr));
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    public String getInfo() {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.rootsObject.getString("info");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getSearchDb() {
        if (this.rootsObject == null) {
            return null;
        }
        try {
            return this.parentPath + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.rootsObject.getString("search");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getSearchDbOrg() {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.parentPath + DomExceptionUtils.SEPARATOR + this.rootsObject.getString("search");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getIdDb() {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.parentPath + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + this.rootsObject.getString("idlst");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getIdDbOrg() {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.parentPath + DomExceptionUtils.SEPARATOR + this.rootsObject.getString("idlst");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getListInfo() {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.rootsObject.getJSONObject("list").getString("info");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getListCount() {
        if (!isAlive()) {
            return 0;
        }
        try {
            return this.rootsObject.getJSONObject("list").getJSONArray("tab").length();
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getListName(int i) {
        if (!isAlive()) {
            return null;
        }
        try {
            return this.rootsObject.getJSONObject("list").getJSONArray("tab").getJSONObject(i).getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getListDb(int i) {
        if (!isAlive()) {
            return null;
        }
        try {
            JSONObject jSONObject = this.rootsObject.getJSONObject("list").getJSONArray("tab").getJSONObject(i);
            if (jSONObject.getString("db").endsWith(".html")) {
                return null;
            }
            return this.parentPath + MLConst.MLCommon.SEPALETER_SINGLE_TEXT + jSONObject.getString("db");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getListHtml(int i) {
        if (!isAlive()) {
            return null;
        }
        try {
            JSONObject jSONObject = this.rootsObject.getJSONObject("list").getJSONArray("tab").getJSONObject(i);
            if (jSONObject.getString("db").endsWith(".html")) {
                return jSONObject.getString("db");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getListDbOrg(int i) {
        if (!isAlive()) {
            return null;
        }
        try {
            JSONObject jSONObject = this.rootsObject.getJSONObject("list").getJSONArray("tab").getJSONObject(i);
            if (jSONObject.getString("db").endsWith(".html")) {
                return null;
            }
            return this.parentPath + DomExceptionUtils.SEPARATOR + jSONObject.getString("db");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getContentsCount() {
        if (!isAlive()) {
            return 0;
        }
        try {
            return this.rootsObject.getJSONArray("contents").length();
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getTargetContentsNo(String str) {
        if (!isAlive()) {
            return 0;
        }
        try {
            JSONArray jSONArray = this.rootsObject.getJSONArray("contents");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    if (jSONArray2.getString(i2).indexOf(str) != -1) {
                        return i;
                    }
                }
            }
            return 0;
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String[] getContents(int i) {
        if (!isAlive()) {
            return null;
        }
        try {
            JSONArray jSONArray = this.rootsObject.getJSONArray("contents").getJSONArray(i);
            String[] strArr = new String[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                strArr[i2] = string;
                strArr[i2] = getReplaceFile(string);
            }
            return strArr;
        } catch (JSONException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    private String getReplaceFile(String str) throws JSONException {
        return (Arrays.asList(ReplaceFileList).contains(str) && this.rootsObject.has(str)) ? getReplaceFile(this.rootsObject.getString(str)) : str;
    }

    public int getTargetContentsCount(int i) {
        if (!isAlive()) {
            return 0;
        }
        try {
            return this.rootsObject.getJSONArray("contents").getJSONArray(i).length();
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String[] getcontentsFirstFile() {
        if (!isAlive()) {
            return null;
        }
        try {
            JSONArray jSONArray = this.rootsObject.getJSONArray("contentsFirstFile");
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            return strArr;
        } catch (JSONException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public String getcontentsId() {
        String[] strArr = getcontentsFirstFile();
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        String[] strArrSplit = strArr[0].split(DomExceptionUtils.SEPARATOR);
        String str = strArrSplit[strArrSplit.length - 1];
        if (str.length() <= 1) {
            return "";
        }
        return str.substring(0, 2);
    }

    public String content_id() {
        if (!isAlive()) {
            return "";
        }
        try {
            if (this.rootsObject.has(DownloadService.KEY_CONTENT_ID)) {
                return this.rootsObject.getString(DownloadService.KEY_CONTENT_ID);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";
    }
}
