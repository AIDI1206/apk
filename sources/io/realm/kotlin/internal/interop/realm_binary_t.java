package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_binary_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_binary_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_binary_t realm_binary_tVar) {
        if (realm_binary_tVar == null) {
            return 0L;
        }
        return realm_binary_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_binary_t realm_binary_tVar) {
        if (realm_binary_tVar == null) {
            return 0L;
        }
        if (!realm_binary_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_binary_tVar.swigCPtr;
        realm_binary_tVar.swigCMemOwn = false;
        realm_binary_tVar.delete();
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
                realmcJNI.delete_realm_binary_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setData(byte[] bArr) {
        realmcJNI.realm_binary_t_data_set(this.swigCPtr, this, bArr);
    }

    public byte[] getData() {
        return realmcJNI.realm_binary_t_data_get(this.swigCPtr, this);
    }

    public void setSize(long j) {
        realmcJNI.realm_binary_t_size_set(this.swigCPtr, this, j);
    }

    public long getSize() {
        return realmcJNI.realm_binary_t_size_get(this.swigCPtr, this);
    }

    public realm_binary_t() {
        this(realmcJNI.new_realm_binary_t(), true);
    }
}
