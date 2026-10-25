package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_version_id_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_version_id_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_version_id_t realm_version_id_tVar) {
        if (realm_version_id_tVar == null) {
            return 0L;
        }
        return realm_version_id_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_version_id_t realm_version_id_tVar) {
        if (realm_version_id_tVar == null) {
            return 0L;
        }
        if (!realm_version_id_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_version_id_tVar.swigCPtr;
        realm_version_id_tVar.swigCMemOwn = false;
        realm_version_id_tVar.delete();
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
                realmcJNI.delete_realm_version_id_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setVersion(long j) {
        realmcJNI.realm_version_id_t_version_set(this.swigCPtr, this, j);
    }

    public long getVersion() {
        return realmcJNI.realm_version_id_t_version_get(this.swigCPtr, this);
    }

    public void setIndex(long j) {
        realmcJNI.realm_version_id_t_index_set(this.swigCPtr, this, j);
    }

    public long getIndex() {
        return realmcJNI.realm_version_id_t_index_get(this.swigCPtr, this);
    }

    public realm_version_id_t() {
        this(realmcJNI.new_realm_version_id_t(), true);
    }
}
