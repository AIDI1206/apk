package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_sync_error_user_info_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_sync_error_user_info_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_sync_error_user_info_t realm_sync_error_user_info_tVar) {
        if (realm_sync_error_user_info_tVar == null) {
            return 0L;
        }
        return realm_sync_error_user_info_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_sync_error_user_info_t realm_sync_error_user_info_tVar) {
        if (realm_sync_error_user_info_tVar == null) {
            return 0L;
        }
        if (!realm_sync_error_user_info_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_sync_error_user_info_tVar.swigCPtr;
        realm_sync_error_user_info_tVar.swigCMemOwn = false;
        realm_sync_error_user_info_tVar.delete();
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
                realmcJNI.delete_realm_sync_error_user_info_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setKey(String str) {
        realmcJNI.realm_sync_error_user_info_t_key_set(this.swigCPtr, this, str);
    }

    public String getKey() {
        return realmcJNI.realm_sync_error_user_info_t_key_get(this.swigCPtr, this);
    }

    public void setValue(String str) {
        realmcJNI.realm_sync_error_user_info_t_value_set(this.swigCPtr, this, str);
    }

    public String getValue() {
        return realmcJNI.realm_sync_error_user_info_t_value_get(this.swigCPtr, this);
    }

    public realm_sync_error_user_info_t() {
        this(realmcJNI.new_realm_sync_error_user_info_t(), true);
    }
}
