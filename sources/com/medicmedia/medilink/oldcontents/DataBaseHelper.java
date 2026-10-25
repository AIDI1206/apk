package com.medicmedia.medilink.oldcontents;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class DataBaseHelper extends SQLiteOpenHelper {
    private static String DB_PATH = "//data/data/com.medic.media.medilink/databases/";
    private String DB_NAME;
    private final Context myContext;
    private SQLiteDatabase myDataBase;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public DataBaseHelper(Context context) {
        super(context, (String) null, (SQLiteDatabase.CursorFactory) null, 1);
        this.DB_NAME = null;
        this.myContext = context;
    }

    public void setDbName(String str) {
        this.DB_NAME = str;
    }

    public boolean createDataBase() throws IOException {
        return checkDataBase();
    }

    private boolean checkDataBase() {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = null;
        try {
            sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.DB_NAME, null, 0);
        } catch (SQLiteException unused) {
        }
        if (sQLiteDatabaseOpenDatabase != null) {
            sQLiteDatabaseOpenDatabase.close();
        }
        return sQLiteDatabaseOpenDatabase != null;
    }

    private void copyDataBase() throws IOException {
        InputStream inputStreamOpen = this.myContext.getAssets().open(this.DB_NAME);
        Log.d("sqlite", this.DB_NAME);
        File databasePath = this.myContext.getDatabasePath(this.DB_NAME);
        String absolutePath = databasePath.getAbsolutePath();
        if (!databasePath.exists()) {
            new File(databasePath.getParent()).mkdir();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
            Log.d("sqlite", absolutePath);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i > 0) {
                    Log.d("sqlite", "read");
                    fileOutputStream.write(bArr, 0, i);
                    Log.d("sqlite", "write " + i);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStreamOpen.close();
                    this.myContext.getSharedPreferences("pref", 0).edit().putString(this.DB_NAME, "20150225").commit();
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("ファイルを開けません");
            e.printStackTrace();
        }
    }

    public SQLiteDatabase openDataBase() throws SQLException {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.DB_NAME, null, 0);
        this.myDataBase = sQLiteDatabaseOpenDatabase;
        return sQLiteDatabaseOpenDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        SQLiteDatabase sQLiteDatabase = this.myDataBase;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        super.close();
    }
}
