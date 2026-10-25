package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_http_response_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_http_response_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_http_response_t realm_http_response_tVar) {
        if (realm_http_response_tVar == null) {
            return 0L;
        }
        return realm_http_response_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_http_response_t realm_http_response_tVar) {
        if (realm_http_response_tVar == null) {
            return 0L;
        }
        if (!realm_http_response_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_http_response_tVar.swigCPtr;
        realm_http_response_tVar.swigCMemOwn = false;
        realm_http_response_tVar.delete();
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
                realmcJNI.delete_realm_http_response_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setStatus_code(int i) {
        realmcJNI.realm_http_response_t_status_code_set(this.swigCPtr, this, i);
    }

    public int getStatus_code() {
        return realmcJNI.realm_http_response_t_status_code_get(this.swigCPtr, this);
    }

    public void setCustom_status_code(int i) {
        realmcJNI.realm_http_response_t_custom_status_code_set(this.swigCPtr, this, i);
    }

    public int getCustom_status_code() {
        return realmcJNI.realm_http_response_t_custom_status_code_get(this.swigCPtr, this);
    }

    public void setHeaders(realm_http_header_t realm_http_header_tVar) {
        realmcJNI.realm_http_response_t_headers_set(this.swigCPtr, this, realm_http_header_t.getCPtr(realm_http_header_tVar), realm_http_header_tVar);
    }

    public realm_http_header_t getHeaders() {
        long jRealm_http_response_t_headers_get = realmcJNI.realm_http_response_t_headers_get(this.swigCPtr, this);
        if (jRealm_http_response_t_headers_get == 0) {
            return null;
        }
        return new realm_http_header_t(jRealm_http_response_t_headers_get, false);
    }

    public void setNum_headers(long j) {
        realmcJNI.realm_http_response_t_num_headers_set(this.swigCPtr, this, j);
    }

    public long getNum_headers() {
        return realmcJNI.realm_http_response_t_num_headers_get(this.swigCPtr, this);
    }

    public void setBody(String str) {
        realmcJNI.realm_http_response_t_body_set(this.swigCPtr, this, str);
    }

    public String getBody() {
        return realmcJNI.realm_http_response_t_body_get(this.swigCPtr, this);
    }

    public void setBody_size(long j) {
        realmcJNI.realm_http_response_t_body_size_set(this.swigCPtr, this, j);
    }

    public long getBody_size() {
        return realmcJNI.realm_http_response_t_body_size_get(this.swigCPtr, this);
    }

    public realm_http_response_t() {
        this(realmcJNI.new_realm_http_response_t(), true);
    }
}
