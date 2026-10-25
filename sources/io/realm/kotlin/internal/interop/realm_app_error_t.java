package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_app_error_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_app_error_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_app_error_t realm_app_error_tVar) {
        if (realm_app_error_tVar == null) {
            return 0L;
        }
        return realm_app_error_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_app_error_t realm_app_error_tVar) {
        if (realm_app_error_tVar == null) {
            return 0L;
        }
        if (!realm_app_error_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_app_error_tVar.swigCPtr;
        realm_app_error_tVar.swigCMemOwn = false;
        realm_app_error_tVar.delete();
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
                realmcJNI.delete_realm_app_error_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setError(int i) {
        realmcJNI.realm_app_error_t_error_set(this.swigCPtr, this, i);
    }

    public int getError() {
        return realmcJNI.realm_app_error_t_error_get(this.swigCPtr, this);
    }

    public void setCategories(long j) {
        realmcJNI.realm_app_error_t_categories_set(this.swigCPtr, this, j);
    }

    public long getCategories() {
        return realmcJNI.realm_app_error_t_categories_get(this.swigCPtr, this);
    }

    public void setMessage(String str) {
        realmcJNI.realm_app_error_t_message_set(this.swigCPtr, this, str);
    }

    public String getMessage() {
        return realmcJNI.realm_app_error_t_message_get(this.swigCPtr, this);
    }

    public void setHttp_status_code(int i) {
        realmcJNI.realm_app_error_t_http_status_code_set(this.swigCPtr, this, i);
    }

    public int getHttp_status_code() {
        return realmcJNI.realm_app_error_t_http_status_code_get(this.swigCPtr, this);
    }

    public void setLink_to_server_logs(String str) {
        realmcJNI.realm_app_error_t_link_to_server_logs_set(this.swigCPtr, this, str);
    }

    public String getLink_to_server_logs() {
        return realmcJNI.realm_app_error_t_link_to_server_logs_get(this.swigCPtr, this);
    }

    public realm_app_error_t() {
        this(realmcJNI.new_realm_app_error_t(), true);
    }
}
