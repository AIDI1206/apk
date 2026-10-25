package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_user_identity_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_user_identity_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_user_identity_t realm_user_identity_tVar) {
        if (realm_user_identity_tVar == null) {
            return 0L;
        }
        return realm_user_identity_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_user_identity_t realm_user_identity_tVar) {
        if (realm_user_identity_tVar == null) {
            return 0L;
        }
        if (!realm_user_identity_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_user_identity_tVar.swigCPtr;
        realm_user_identity_tVar.swigCMemOwn = false;
        realm_user_identity_tVar.delete();
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
                realmcJNI.delete_realm_user_identity_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setId(String str) {
        realmcJNI.realm_user_identity_t_id_set(this.swigCPtr, this, str);
    }

    public String getId() {
        return realmcJNI.realm_user_identity_t_id_get(this.swigCPtr, this);
    }

    public void setProvider_type(int i) {
        realmcJNI.realm_user_identity_t_provider_type_set(this.swigCPtr, this, i);
    }

    public int getProvider_type() {
        return realmcJNI.realm_user_identity_t_provider_type_get(this.swigCPtr, this);
    }

    public realm_user_identity_t() {
        this(realmcJNI.new_realm_user_identity_t(), true);
    }
}
