package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_string_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_string_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_string_t realm_string_tVar) {
        if (realm_string_tVar == null) {
            return 0L;
        }
        return realm_string_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_string_t realm_string_tVar) {
        if (realm_string_tVar == null) {
            return 0L;
        }
        if (!realm_string_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_string_tVar.swigCPtr;
        realm_string_tVar.swigCMemOwn = false;
        realm_string_tVar.delete();
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
                realmcJNI.delete_realm_string_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setData(String str) {
        realmcJNI.realm_string_t_data_set(this.swigCPtr, this, str);
    }

    public String getData() {
        return realmcJNI.realm_string_t_data_get(this.swigCPtr, this);
    }

    public void setSize(long j) {
        realmcJNI.realm_string_t_size_set(this.swigCPtr, this, j);
    }

    public long getSize() {
        return realmcJNI.realm_string_t_size_get(this.swigCPtr, this);
    }

    public realm_string_t() {
        this(realmcJNI.new_realm_string_t(), true);
    }
}
