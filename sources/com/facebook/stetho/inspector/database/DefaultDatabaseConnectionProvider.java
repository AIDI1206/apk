package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    @Override // com.facebook.stetho.inspector.database.DatabaseConnectionProvider
    public SQLiteDatabase openDatabase(File file) throws SQLiteException {
        return performOpen(file, determineOpenOptions(file));
    }

    protected int determineOpenOptions(File file) {
        return new File(file.getParent(), new StringBuilder().append(file.getName()).append("-wal").toString()).exists() ? 1 : 0;
    }

    protected SQLiteDatabase performOpen(File file, int i) {
        SQLiteDatabaseCompat sQLiteDatabaseCompat = SQLiteDatabaseCompat.getInstance();
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, sQLiteDatabaseCompat.provideOpenFlags(i));
        sQLiteDatabaseCompat.enableFeatures(i, sQLiteDatabaseOpenDatabase);
        return sQLiteDatabaseOpenDatabase;
    }
}
