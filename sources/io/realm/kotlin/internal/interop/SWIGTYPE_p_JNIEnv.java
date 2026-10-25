package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class SWIGTYPE_p_JNIEnv {
    private transient long swigCPtr;

    protected SWIGTYPE_p_JNIEnv(long j, boolean z) {
        this.swigCPtr = j;
    }

    protected SWIGTYPE_p_JNIEnv() {
        this.swigCPtr = 0L;
    }

    protected static long getCPtr(SWIGTYPE_p_JNIEnv sWIGTYPE_p_JNIEnv) {
        if (sWIGTYPE_p_JNIEnv == null) {
            return 0L;
        }
        return sWIGTYPE_p_JNIEnv.swigCPtr;
    }

    protected static long swigRelease(SWIGTYPE_p_JNIEnv sWIGTYPE_p_JNIEnv) {
        if (sWIGTYPE_p_JNIEnv == null) {
            return 0L;
        }
        return sWIGTYPE_p_JNIEnv.swigCPtr;
    }
}
