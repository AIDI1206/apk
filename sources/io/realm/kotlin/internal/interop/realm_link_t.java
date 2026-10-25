package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_link_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_link_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_link_t realm_link_tVar) {
        if (realm_link_tVar == null) {
            return 0L;
        }
        return realm_link_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_link_t realm_link_tVar) {
        if (realm_link_tVar == null) {
            return 0L;
        }
        if (!realm_link_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_link_tVar.swigCPtr;
        realm_link_tVar.swigCMemOwn = false;
        realm_link_tVar.delete();
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
                realmcJNI.delete_realm_link_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setTarget_table(long j) {
        realmcJNI.realm_link_t_target_table_set(this.swigCPtr, this, j);
    }

    public long getTarget_table() {
        return realmcJNI.realm_link_t_target_table_get(this.swigCPtr, this);
    }

    public void setTarget(long j) {
        realmcJNI.realm_link_t_target_set(this.swigCPtr, this, j);
    }

    public long getTarget() {
        return realmcJNI.realm_link_t_target_get(this.swigCPtr, this);
    }

    public realm_link_t() {
        this(realmcJNI.new_realm_link_t(), true);
    }
}
