package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_app_user_apikey_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_app_user_apikey_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_app_user_apikey_t realm_app_user_apikey_tVar) {
        if (realm_app_user_apikey_tVar == null) {
            return 0L;
        }
        return realm_app_user_apikey_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_app_user_apikey_t realm_app_user_apikey_tVar) {
        if (realm_app_user_apikey_tVar == null) {
            return 0L;
        }
        if (!realm_app_user_apikey_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_app_user_apikey_tVar.swigCPtr;
        realm_app_user_apikey_tVar.swigCMemOwn = false;
        realm_app_user_apikey_tVar.delete();
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
                realmcJNI.delete_realm_app_user_apikey_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setId(realm_object_id_t realm_object_id_tVar) {
        realmcJNI.realm_app_user_apikey_t_id_set(this.swigCPtr, this, realm_object_id_t.getCPtr(realm_object_id_tVar), realm_object_id_tVar);
    }

    public realm_object_id_t getId() {
        long jRealm_app_user_apikey_t_id_get = realmcJNI.realm_app_user_apikey_t_id_get(this.swigCPtr, this);
        if (jRealm_app_user_apikey_t_id_get == 0) {
            return null;
        }
        return new realm_object_id_t(jRealm_app_user_apikey_t_id_get, false);
    }

    public void setKey(String str) {
        realmcJNI.realm_app_user_apikey_t_key_set(this.swigCPtr, this, str);
    }

    public String getKey() {
        return realmcJNI.realm_app_user_apikey_t_key_get(this.swigCPtr, this);
    }

    public void setName(String str) {
        realmcJNI.realm_app_user_apikey_t_name_set(this.swigCPtr, this, str);
    }

    public String getName() {
        return realmcJNI.realm_app_user_apikey_t_name_get(this.swigCPtr, this);
    }

    public void setDisabled(boolean z) {
        realmcJNI.realm_app_user_apikey_t_disabled_set(this.swigCPtr, this, z);
    }

    public boolean getDisabled() {
        return realmcJNI.realm_app_user_apikey_t_disabled_get(this.swigCPtr, this);
    }

    public realm_app_user_apikey_t() {
        this(realmcJNI.new_realm_app_user_apikey_t(), true);
    }
}
