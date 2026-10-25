package dagger.hilt.android.lifecycle;

/* JADX INFO: loaded from: classes6.dex */
public interface RetainedLifecycle {

    public interface OnClearedListener {
        void onCleared();
    }

    void addOnClearedListener(OnClearedListener listener);

    void removeOnClearedListener(OnClearedListener listener);
}
