package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_websocket_endpoint_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_websocket_endpoint_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_websocket_endpoint_t realm_websocket_endpoint_tVar) {
        if (realm_websocket_endpoint_tVar == null) {
            return 0L;
        }
        return realm_websocket_endpoint_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_websocket_endpoint_t realm_websocket_endpoint_tVar) {
        if (realm_websocket_endpoint_tVar == null) {
            return 0L;
        }
        if (!realm_websocket_endpoint_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_websocket_endpoint_tVar.swigCPtr;
        realm_websocket_endpoint_tVar.swigCMemOwn = false;
        realm_websocket_endpoint_tVar.delete();
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
                realmcJNI.delete_realm_websocket_endpoint_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setAddress(String str) {
        realmcJNI.realm_websocket_endpoint_t_address_set(this.swigCPtr, this, str);
    }

    public String getAddress() {
        return realmcJNI.realm_websocket_endpoint_t_address_get(this.swigCPtr, this);
    }

    public void setPort(int i) {
        realmcJNI.realm_websocket_endpoint_t_port_set(this.swigCPtr, this, i);
    }

    public int getPort() {
        return realmcJNI.realm_websocket_endpoint_t_port_get(this.swigCPtr, this);
    }

    public void setPath(String str) {
        realmcJNI.realm_websocket_endpoint_t_path_set(this.swigCPtr, this, str);
    }

    public String getPath() {
        return realmcJNI.realm_websocket_endpoint_t_path_get(this.swigCPtr, this);
    }

    public void setNum_protocols(long j) {
        realmcJNI.realm_websocket_endpoint_t_num_protocols_set(this.swigCPtr, this, j);
    }

    public long getNum_protocols() {
        return realmcJNI.realm_websocket_endpoint_t_num_protocols_get(this.swigCPtr, this);
    }

    public void setIs_ssl(boolean z) {
        realmcJNI.realm_websocket_endpoint_t_is_ssl_set(this.swigCPtr, this, z);
    }

    public boolean getIs_ssl() {
        return realmcJNI.realm_websocket_endpoint_t_is_ssl_get(this.swigCPtr, this);
    }

    public realm_websocket_endpoint_t() {
        this(realmcJNI.new_realm_websocket_endpoint_t(), true);
    }
}
