package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_http_header_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_http_header_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_http_header_t realm_http_header_tVar) {
        if (realm_http_header_tVar == null) {
            return 0L;
        }
        return realm_http_header_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_http_header_t realm_http_header_tVar) {
        if (realm_http_header_tVar == null) {
            return 0L;
        }
        if (!realm_http_header_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_http_header_tVar.swigCPtr;
        realm_http_header_tVar.swigCMemOwn = false;
        realm_http_header_tVar.delete();
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
                realmcJNI.delete_realm_http_header_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setName(String str) {
        realmcJNI.realm_http_header_t_name_set(this.swigCPtr, this, str);
    }

    public String getName() {
        return realmcJNI.realm_http_header_t_name_get(this.swigCPtr, this);
    }

    public void setValue(String str) {
        realmcJNI.realm_http_header_t_value_set(this.swigCPtr, this, str);
    }

    public String getValue() {
        return realmcJNI.realm_http_header_t_value_get(this.swigCPtr, this);
    }

    public realm_http_header_t() {
        this(realmcJNI.new_realm_http_header_t(), true);
    }
}
