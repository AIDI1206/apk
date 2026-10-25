package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_collection_move_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_collection_move_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_collection_move_t realm_collection_move_tVar) {
        if (realm_collection_move_tVar == null) {
            return 0L;
        }
        return realm_collection_move_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_collection_move_t realm_collection_move_tVar) {
        if (realm_collection_move_tVar == null) {
            return 0L;
        }
        if (!realm_collection_move_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_collection_move_tVar.swigCPtr;
        realm_collection_move_tVar.swigCMemOwn = false;
        realm_collection_move_tVar.delete();
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
                realmcJNI.delete_realm_collection_move_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setFrom(long j) {
        realmcJNI.realm_collection_move_t_from_set(this.swigCPtr, this, j);
    }

    public long getFrom() {
        return realmcJNI.realm_collection_move_t_from_get(this.swigCPtr, this);
    }

    public void setTo(long j) {
        realmcJNI.realm_collection_move_t_to_set(this.swigCPtr, this, j);
    }

    public long getTo() {
        return realmcJNI.realm_collection_move_t_to_get(this.swigCPtr, this);
    }

    public realm_collection_move_t() {
        this(realmcJNI.new_realm_collection_move_t(), true);
    }
}
