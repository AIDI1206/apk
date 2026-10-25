package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_sync_error_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_sync_error_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_sync_error_t realm_sync_error_tVar) {
        if (realm_sync_error_tVar == null) {
            return 0L;
        }
        return realm_sync_error_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_sync_error_t realm_sync_error_tVar) {
        if (realm_sync_error_tVar == null) {
            return 0L;
        }
        if (!realm_sync_error_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_sync_error_tVar.swigCPtr;
        realm_sync_error_tVar.swigCMemOwn = false;
        realm_sync_error_tVar.delete();
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
                realmcJNI.delete_realm_sync_error_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setStatus(realm_error_t realm_error_tVar) {
        realmcJNI.realm_sync_error_t_status_set(this.swigCPtr, this, realm_error_t.getCPtr(realm_error_tVar), realm_error_tVar);
    }

    public realm_error_t getStatus() {
        long jRealm_sync_error_t_status_get = realmcJNI.realm_sync_error_t_status_get(this.swigCPtr, this);
        if (jRealm_sync_error_t_status_get == 0) {
            return null;
        }
        return new realm_error_t(jRealm_sync_error_t_status_get, false);
    }

    public void setC_original_file_path_key(String str) {
        realmcJNI.realm_sync_error_t_c_original_file_path_key_set(this.swigCPtr, this, str);
    }

    public String getC_original_file_path_key() {
        return realmcJNI.realm_sync_error_t_c_original_file_path_key_get(this.swigCPtr, this);
    }

    public void setC_recovery_file_path_key(String str) {
        realmcJNI.realm_sync_error_t_c_recovery_file_path_key_set(this.swigCPtr, this, str);
    }

    public String getC_recovery_file_path_key() {
        return realmcJNI.realm_sync_error_t_c_recovery_file_path_key_get(this.swigCPtr, this);
    }

    public void setIs_fatal(boolean z) {
        realmcJNI.realm_sync_error_t_is_fatal_set(this.swigCPtr, this, z);
    }

    public boolean getIs_fatal() {
        return realmcJNI.realm_sync_error_t_is_fatal_get(this.swigCPtr, this);
    }

    public void setIs_unrecognized_by_client(boolean z) {
        realmcJNI.realm_sync_error_t_is_unrecognized_by_client_set(this.swigCPtr, this, z);
    }

    public boolean getIs_unrecognized_by_client() {
        return realmcJNI.realm_sync_error_t_is_unrecognized_by_client_get(this.swigCPtr, this);
    }

    public void setIs_client_reset_requested(boolean z) {
        realmcJNI.realm_sync_error_t_is_client_reset_requested_set(this.swigCPtr, this, z);
    }

    public boolean getIs_client_reset_requested() {
        return realmcJNI.realm_sync_error_t_is_client_reset_requested_get(this.swigCPtr, this);
    }

    public void setServer_requests_action(int i) {
        realmcJNI.realm_sync_error_t_server_requests_action_set(this.swigCPtr, this, i);
    }

    public int getServer_requests_action() {
        return realmcJNI.realm_sync_error_t_server_requests_action_get(this.swigCPtr, this);
    }

    public void setUser_info_map(realm_sync_error_user_info_t realm_sync_error_user_info_tVar) {
        realmcJNI.realm_sync_error_t_user_info_map_set(this.swigCPtr, this, realm_sync_error_user_info_t.getCPtr(realm_sync_error_user_info_tVar), realm_sync_error_user_info_tVar);
    }

    public realm_sync_error_user_info_t getUser_info_map() {
        long jRealm_sync_error_t_user_info_map_get = realmcJNI.realm_sync_error_t_user_info_map_get(this.swigCPtr, this);
        if (jRealm_sync_error_t_user_info_map_get == 0) {
            return null;
        }
        return new realm_sync_error_user_info_t(jRealm_sync_error_t_user_info_map_get, false);
    }

    public void setUser_info_length(long j) {
        realmcJNI.realm_sync_error_t_user_info_length_set(this.swigCPtr, this, j);
    }

    public long getUser_info_length() {
        return realmcJNI.realm_sync_error_t_user_info_length_get(this.swigCPtr, this);
    }

    public void setCompensating_writes(realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar) {
        realmcJNI.realm_sync_error_t_compensating_writes_set(this.swigCPtr, this, realm_sync_error_compensating_write_info_t.getCPtr(realm_sync_error_compensating_write_info_tVar), realm_sync_error_compensating_write_info_tVar);
    }

    public realm_sync_error_compensating_write_info_t getCompensating_writes() {
        long jRealm_sync_error_t_compensating_writes_get = realmcJNI.realm_sync_error_t_compensating_writes_get(this.swigCPtr, this);
        if (jRealm_sync_error_t_compensating_writes_get == 0) {
            return null;
        }
        return new realm_sync_error_compensating_write_info_t(jRealm_sync_error_t_compensating_writes_get, false);
    }

    public void setCompensating_writes_length(long j) {
        realmcJNI.realm_sync_error_t_compensating_writes_length_set(this.swigCPtr, this, j);
    }

    public long getCompensating_writes_length() {
        return realmcJNI.realm_sync_error_t_compensating_writes_length_get(this.swigCPtr, this);
    }

    public void setUser_code_error(long j) {
        realmcJNI.realm_sync_error_t_user_code_error_set(this.swigCPtr, this, j);
    }

    public long getUser_code_error() {
        return realmcJNI.realm_sync_error_t_user_code_error_get(this.swigCPtr, this);
    }

    public realm_sync_error_t() {
        this(realmcJNI.new_realm_sync_error_t(), true);
    }
}
