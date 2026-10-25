package com.medicmedia.medilink.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.medicmedia.medilink.BuildConfig;
import com.medicmedia.medilink.models.searchModel;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class SearchContentProvider extends ContentProvider {
    private static final String STORES = "book_words/search_suggest_query/*";
    private static final String[] matrixCursorColumns;
    private static final UriMatcher uriMatcher;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher = uriMatcher2;
        uriMatcher2.addURI(BuildConfig.APPLICATION_ID, STORES, 1);
        matrixCursorColumns = new String[]{"_id", "suggest_text_1", "suggest_icon_1", "suggest_intent_data"};
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uriMatcher.match(uri) != 1) {
            return null;
        }
        return getSearchResultsCursor(((String) Objects.requireNonNull(uri.getLastPathSegment())).toLowerCase());
    }

    private MatrixCursor getSearchResultsCursor(String str) {
        MatrixCursor matrixCursor = new MatrixCursor(matrixCursorColumns);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            int i = 0;
            for (String str2 : searchModel.getStores()) {
                if (str2.toLowerCase().contains(lowerCase)) {
                    int i2 = i + 1;
                    i += 2;
                    matrixCursor.addRow(new Object[]{"" + i, str2, Integer.valueOf(((Context) Objects.requireNonNull(getContext())).getResources().getIdentifier(getStoreName(str2), "drawable", getContext().getPackageName())), "" + i2});
                }
            }
        }
        return matrixCursor;
    }

    private String getStoreName(String str) {
        return str.split(" ")[0].toLowerCase();
    }
}
