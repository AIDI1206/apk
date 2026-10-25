package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class SWIGTYPE_p_bool {
    private transient long swigCPtr;

    protected SWIGTYPE_p_bool(long j, boolean z) {
        this.swigCPtr = j;
    }

    protected SWIGTYPE_p_bool() {
        this.swigCPtr = 0L;
    }

    protected static long getCPtr(SWIGTYPE_p_bool sWIGTYPE_p_bool) {
        if (sWIGTYPE_p_bool == null) {
            return 0L;
        }
        return sWIGTYPE_p_bool.swigCPtr;
    }

    protected static long swigRelease(SWIGTYPE_p_bool sWIGTYPE_p_bool) {
        if (sWIGTYPE_p_bool == null) {
            return 0L;
        }
        return sWIGTYPE_p_bool.swigCPtr;
    }
}
