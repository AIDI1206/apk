package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_sync_error_compensating_write_info_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_sync_error_compensating_write_info_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar) {
        if (realm_sync_error_compensating_write_info_tVar == null) {
            return 0L;
        }
        return realm_sync_error_compensating_write_info_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar) {
        if (realm_sync_error_compensating_write_info_tVar == null) {
            return 0L;
        }
        if (!realm_sync_error_compensating_write_info_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_sync_error_compensating_write_info_tVar.swigCPtr;
        realm_sync_error_compensating_write_info_tVar.swigCMemOwn = false;
        realm_sync_error_compensating_write_info_tVar.delete();
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
                realmcJNI.delete_realm_sync_error_compensating_write_info_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setReason(String str) {
        realmcJNI.realm_sync_error_compensating_write_info_t_reason_set(this.swigCPtr, this, str);
    }

    public String getReason() {
        return realmcJNI.realm_sync_error_compensating_write_info_t_reason_get(this.swigCPtr, this);
    }

    public void setObject_name(String str) {
        realmcJNI.realm_sync_error_compensating_write_info_t_object_name_set(this.swigCPtr, this, str);
    }

    public String getObject_name() {
        return realmcJNI.realm_sync_error_compensating_write_info_t_object_name_get(this.swigCPtr, this);
    }

    public void setPrimary_key(realm_value_t realm_value_tVar) {
        realmcJNI.realm_sync_error_compensating_write_info_t_primary_key_set(this.swigCPtr, this, realm_value_t.getCPtr(realm_value_tVar), realm_value_tVar);
    }

    public realm_value_t getPrimary_key() {
        long jRealm_sync_error_compensating_write_info_t_primary_key_get = realmcJNI.realm_sync_error_compensating_write_info_t_primary_key_get(this.swigCPtr, this);
        if (jRealm_sync_error_compensating_write_info_t_primary_key_get == 0) {
            return null;
        }
        return new realm_value_t(jRealm_sync_error_compensating_write_info_t_primary_key_get, false);
    }

    public realm_sync_error_compensating_write_info_t() {
        this(realmcJNI.new_realm_sync_error_compensating_write_info_t(), true);
    }
}
