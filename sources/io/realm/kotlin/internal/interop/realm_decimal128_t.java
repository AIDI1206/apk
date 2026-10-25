package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_decimal128_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_decimal128_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_decimal128_t realm_decimal128_tVar) {
        if (realm_decimal128_tVar == null) {
            return 0L;
        }
        return realm_decimal128_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_decimal128_t realm_decimal128_tVar) {
        if (realm_decimal128_tVar == null) {
            return 0L;
        }
        if (!realm_decimal128_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_decimal128_tVar.swigCPtr;
        realm_decimal128_tVar.swigCMemOwn = false;
        realm_decimal128_tVar.delete();
        return j;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                realmcJNI.delete_realm_decimal128_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setW(long[] jArr) {
        realmcJNI.realm_decimal128_t_w_set(this.swigCPtr, this, jArr);
    }

    public long[] getW() {
        return realmcJNI.realm_decimal128_t_w_get(this.swigCPtr, this);
    }

    public realm_decimal128_t() {
        this(realmcJNI.new_realm_decimal128_t(), true);
    }
}
