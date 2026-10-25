package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_uuid_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_uuid_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_uuid_t realm_uuid_tVar) {
        if (realm_uuid_tVar == null) {
            return 0L;
        }
        return realm_uuid_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_uuid_t realm_uuid_tVar) {
        if (realm_uuid_tVar == null) {
            return 0L;
        }
        if (!realm_uuid_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_uuid_tVar.swigCPtr;
        realm_uuid_tVar.swigCMemOwn = false;
        realm_uuid_tVar.delete();
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
                realmcJNI.delete_realm_uuid_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setBytes(short[] sArr) {
        realmcJNI.realm_uuid_t_bytes_set(this.swigCPtr, this, sArr);
    }

    public short[] getBytes() {
        return realmcJNI.realm_uuid_t_bytes_get(this.swigCPtr, this);
    }

    public realm_uuid_t() {
        this(realmcJNI.new_realm_uuid_t(), true);
    }
}
