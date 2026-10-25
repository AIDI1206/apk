package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class SWIGTYPE_p_realm_thread_safe_reference {
    private transient long swigCPtr;

    protected SWIGTYPE_p_realm_thread_safe_reference(long j, boolean z) {
        this.swigCPtr = j;
    }

    protected SWIGTYPE_p_realm_thread_safe_reference() {
        this.swigCPtr = 0L;
    }

    protected static long getCPtr(SWIGTYPE_p_realm_thread_safe_reference sWIGTYPE_p_realm_thread_safe_reference) {
        if (sWIGTYPE_p_realm_thread_safe_reference == null) {
            return 0L;
        }
        return sWIGTYPE_p_realm_thread_safe_reference.swigCPtr;
    }

    protected static long swigRelease(SWIGTYPE_p_realm_thread_safe_reference sWIGTYPE_p_realm_thread_safe_reference) {
        if (sWIGTYPE_p_realm_thread_safe_reference == null) {
            return 0L;
        }
        return sWIGTYPE_p_realm_thread_safe_reference.swigCPtr;
    }
}
