package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_salted_file_ident_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_salted_file_ident_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_salted_file_ident_t realm_salted_file_ident_tVar) {
        if (realm_salted_file_ident_tVar == null) {
            return 0L;
        }
        return realm_salted_file_ident_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_salted_file_ident_t realm_salted_file_ident_tVar) {
        if (realm_salted_file_ident_tVar == null) {
            return 0L;
        }
        if (!realm_salted_file_ident_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_salted_file_ident_tVar.swigCPtr;
        realm_salted_file_ident_tVar.swigCMemOwn = false;
        realm_salted_file_ident_tVar.delete();
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
                realmcJNI.delete_realm_salted_file_ident_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setIdent(long j) {
        realmcJNI.realm_salted_file_ident_t_ident_set(this.swigCPtr, this, j);
    }

    public long getIdent() {
        return realmcJNI.realm_salted_file_ident_t_ident_get(this.swigCPtr, this);
    }

    public void setSalt(long j) {
        realmcJNI.realm_salted_file_ident_t_salt_set(this.swigCPtr, this, j);
    }

    public long getSalt() {
        return realmcJNI.realm_salted_file_ident_t_salt_get(this.swigCPtr, this);
    }

    public realm_salted_file_ident_t() {
        this(realmcJNI.new_realm_salted_file_ident_t(), true);
    }
}
