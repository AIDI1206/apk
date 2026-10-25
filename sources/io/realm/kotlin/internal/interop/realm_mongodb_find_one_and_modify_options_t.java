package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_mongodb_find_one_and_modify_options_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_mongodb_find_one_and_modify_options_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar) {
        if (realm_mongodb_find_one_and_modify_options_tVar == null) {
            return 0L;
        }
        return realm_mongodb_find_one_and_modify_options_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar) {
        if (realm_mongodb_find_one_and_modify_options_tVar == null) {
            return 0L;
        }
        if (!realm_mongodb_find_one_and_modify_options_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_mongodb_find_one_and_modify_options_tVar.swigCPtr;
        realm_mongodb_find_one_and_modify_options_tVar.swigCMemOwn = false;
        realm_mongodb_find_one_and_modify_options_tVar.delete();
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
                realmcJNI.delete_realm_mongodb_find_one_and_modify_options_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setProjection_bson(String str) {
        realmcJNI.realm_mongodb_find_one_and_modify_options_t_projection_bson_set(this.swigCPtr, this, str);
    }

    public String getProjection_bson() {
        return realmcJNI.realm_mongodb_find_one_and_modify_options_t_projection_bson_get(this.swigCPtr, this);
    }

    public void setSort_bson(String str) {
        realmcJNI.realm_mongodb_find_one_and_modify_options_t_sort_bson_set(this.swigCPtr, this, str);
    }

    public String getSort_bson() {
        return realmcJNI.realm_mongodb_find_one_and_modify_options_t_sort_bson_get(this.swigCPtr, this);
    }

    public void setUpsert(boolean z) {
        realmcJNI.realm_mongodb_find_one_and_modify_options_t_upsert_set(this.swigCPtr, this, z);
    }

    public boolean getUpsert() {
        return realmcJNI.realm_mongodb_find_one_and_modify_options_t_upsert_get(this.swigCPtr, this);
    }

    public void setReturn_new_document(boolean z) {
        realmcJNI.realm_mongodb_find_one_and_modify_options_t_return_new_document_set(this.swigCPtr, this, z);
    }

    public boolean getReturn_new_document() {
        return realmcJNI.realm_mongodb_find_one_and_modify_options_t_return_new_document_get(this.swigCPtr, this);
    }

    public realm_mongodb_find_one_and_modify_options_t() {
        this(realmcJNI.new_realm_mongodb_find_one_and_modify_options_t(), true);
    }
}
