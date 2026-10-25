package com.medicmedia.medilink.provider;

import android.content.SearchRecentSuggestionsProvider;

/* JADX INFO: loaded from: classes6.dex */
public class MLSuggestionProvider extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY = "com.example.MySuggestionProvider";
    public static final int MODE = 1;

    public MLSuggestionProvider() {
        setupSuggestions(AUTHORITY, 1);
    }
}
