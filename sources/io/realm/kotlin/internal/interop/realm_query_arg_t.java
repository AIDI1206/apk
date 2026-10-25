package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_query_arg_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_query_arg_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_query_arg_t realm_query_arg_tVar) {
        if (realm_query_arg_tVar == null) {
            return 0L;
        }
        return realm_query_arg_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_query_arg_t realm_query_arg_tVar) {
        if (realm_query_arg_tVar == null) {
            return 0L;
        }
        if (!realm_query_arg_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_query_arg_tVar.swigCPtr;
        realm_query_arg_tVar.swigCMemOwn = false;
        realm_query_arg_tVar.delete();
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
                realmcJNI.delete_realm_query_arg_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setNb_args(long j) {
        realmcJNI.realm_query_arg_t_nb_args_set(this.swigCPtr, this, j);
    }

    public long getNb_args() {
        return realmcJNI.realm_query_arg_t_nb_args_get(this.swigCPtr, this);
    }

    public void setIs_list(boolean z) {
        realmcJNI.realm_query_arg_t_is_list_set(this.swigCPtr, this, z);
    }

    public boolean getIs_list() {
        return realmcJNI.realm_query_arg_t_is_list_get(this.swigCPtr, this);
    }

    public void setArg(realm_value_t realm_value_tVar) {
        realmcJNI.realm_query_arg_t_arg_set(this.swigCPtr, this, realm_value_t.getCPtr(realm_value_tVar), realm_value_tVar);
    }

    public realm_value_t getArg() {
        long jRealm_query_arg_t_arg_get = realmcJNI.realm_query_arg_t_arg_get(this.swigCPtr, this);
        if (jRealm_query_arg_t_arg_get == 0) {
            return null;
        }
        return new realm_value_t(jRealm_query_arg_t_arg_get, false);
    }

    public realm_query_arg_t() {
        this(realmcJNI.new_realm_query_arg_t(), true);
    }
}
