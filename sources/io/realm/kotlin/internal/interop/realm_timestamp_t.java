package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_timestamp_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_timestamp_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_timestamp_t realm_timestamp_tVar) {
        if (realm_timestamp_tVar == null) {
            return 0L;
        }
        return realm_timestamp_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_timestamp_t realm_timestamp_tVar) {
        if (realm_timestamp_tVar == null) {
            return 0L;
        }
        if (!realm_timestamp_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_timestamp_tVar.swigCPtr;
        realm_timestamp_tVar.swigCMemOwn = false;
        realm_timestamp_tVar.delete();
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
                realmcJNI.delete_realm_timestamp_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setSeconds(long j) {
        realmcJNI.realm_timestamp_t_seconds_set(this.swigCPtr, this, j);
    }

    public long getSeconds() {
        return realmcJNI.realm_timestamp_t_seconds_get(this.swigCPtr, this);
    }

    public void setNanoseconds(int i) {
        realmcJNI.realm_timestamp_t_nanoseconds_set(this.swigCPtr, this, i);
    }

    public int getNanoseconds() {
        return realmcJNI.realm_timestamp_t_nanoseconds_get(this.swigCPtr, this);
    }

    public realm_timestamp_t() {
        this(realmcJNI.new_realm_timestamp_t(), true);
    }
}
