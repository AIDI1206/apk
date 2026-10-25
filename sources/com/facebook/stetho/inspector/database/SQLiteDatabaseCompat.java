package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQLiteDatabaseCompat {
    public static final int ENABLE_FOREIGN_KEY_CONSTRAINTS = 2;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 1;
    private static final SQLiteDatabaseCompat sInstance = new JellyBeanAndBeyondImpl();

    public @interface SQLiteOpenOptions {
    }

    public abstract void enableFeatures(int i, SQLiteDatabase sQLiteDatabase);

    public abstract int provideOpenFlags(int i);

    public static SQLiteDatabaseCompat getInstance() {
        return sInstance;
    }

    private static class JellyBeanAndBeyondImpl extends SQLiteDatabaseCompat {
        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public int provideOpenFlags(int i) {
            return (i & 1) != 0 ? 536870912 : 0;
        }

        private JellyBeanAndBeyondImpl() {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public void enableFeatures(int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 2) != 0) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }
    }

    private static class IceCreamSandwichImpl extends SQLiteDatabaseCompat {
        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public int provideOpenFlags(int i) {
            return 0;
        }

        private IceCreamSandwichImpl() {
        }

        @Override // com.facebook.stetho.inspector.database.SQLiteDatabaseCompat
        public void enableFeatures(int i, SQLiteDatabase sQLiteDatabase) {
            if ((i & 1) != 0) {
                sQLiteDatabase.enableWriteAheadLogging();
            }
            if ((i & 2) != 0) {
                sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            }
        }
    }
}
