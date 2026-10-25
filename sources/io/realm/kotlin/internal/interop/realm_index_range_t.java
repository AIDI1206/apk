package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_index_range_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_index_range_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_index_range_t realm_index_range_tVar) {
        if (realm_index_range_tVar == null) {
            return 0L;
        }
        return realm_index_range_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_index_range_t realm_index_range_tVar) {
        if (realm_index_range_tVar == null) {
            return 0L;
        }
        if (!realm_index_range_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_index_range_tVar.swigCPtr;
        realm_index_range_tVar.swigCMemOwn = false;
        realm_index_range_tVar.delete();
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
                realmcJNI.delete_realm_index_range_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setFrom(long j) {
        realmcJNI.realm_index_range_t_from_set(this.swigCPtr, this, j);
    }

    public long getFrom() {
        return realmcJNI.realm_index_range_t_from_get(this.swigCPtr, this);
    }

    public void setTo(long j) {
        realmcJNI.realm_index_range_t_to_set(this.swigCPtr, this, j);
    }

    public long getTo() {
        return realmcJNI.realm_index_range_t_to_get(this.swigCPtr, this);
    }

    public realm_index_range_t() {
        this(realmcJNI.new_realm_index_range_t(), true);
    }
}
