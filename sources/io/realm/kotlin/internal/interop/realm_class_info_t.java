package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_class_info_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_class_info_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_class_info_t realm_class_info_tVar) {
        if (realm_class_info_tVar == null) {
            return 0L;
        }
        return realm_class_info_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_class_info_t realm_class_info_tVar) {
        if (realm_class_info_tVar == null) {
            return 0L;
        }
        if (!realm_class_info_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_class_info_tVar.swigCPtr;
        realm_class_info_tVar.swigCMemOwn = false;
        realm_class_info_tVar.delete();
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
                realmcJNI.delete_realm_class_info_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setName(String str) {
        realmcJNI.realm_class_info_t_name_set(this.swigCPtr, this, str);
    }

    public String getName() {
        return realmcJNI.realm_class_info_t_name_get(this.swigCPtr, this);
    }

    public void setPrimary_key(String str) {
        realmcJNI.realm_class_info_t_primary_key_set(this.swigCPtr, this, str);
    }

    public String getPrimary_key() {
        return realmcJNI.realm_class_info_t_primary_key_get(this.swigCPtr, this);
    }

    public void setNum_properties(long j) {
        realmcJNI.realm_class_info_t_num_properties_set(this.swigCPtr, this, j);
    }

    public long getNum_properties() {
        return realmcJNI.realm_class_info_t_num_properties_get(this.swigCPtr, this);
    }

    public void setNum_computed_properties(long j) {
        realmcJNI.realm_class_info_t_num_computed_properties_set(this.swigCPtr, this, j);
    }

    public long getNum_computed_properties() {
        return realmcJNI.realm_class_info_t_num_computed_properties_get(this.swigCPtr, this);
    }

    public void setKey(long j) {
        realmcJNI.realm_class_info_t_key_set(this.swigCPtr, this, j);
    }

    public long getKey() {
        return realmcJNI.realm_class_info_t_key_get(this.swigCPtr, this);
    }

    public void setFlags(int i) {
        realmcJNI.realm_class_info_t_flags_set(this.swigCPtr, this, i);
    }

    public int getFlags() {
        return realmcJNI.realm_class_info_t_flags_get(this.swigCPtr, this);
    }

    public realm_class_info_t() {
        this(realmcJNI.new_realm_class_info_t(), true);
    }
}
