package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_property_info_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_property_info_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_property_info_t realm_property_info_tVar) {
        if (realm_property_info_tVar == null) {
            return 0L;
        }
        return realm_property_info_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_property_info_t realm_property_info_tVar) {
        if (realm_property_info_tVar == null) {
            return 0L;
        }
        if (!realm_property_info_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_property_info_tVar.swigCPtr;
        realm_property_info_tVar.swigCMemOwn = false;
        realm_property_info_tVar.delete();
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
                realmcJNI.delete_realm_property_info_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setName(String str) {
        realmcJNI.realm_property_info_t_name_set(this.swigCPtr, this, str);
    }

    public String getName() {
        return realmcJNI.realm_property_info_t_name_get(this.swigCPtr, this);
    }

    public void setPublic_name(String str) {
        realmcJNI.realm_property_info_t_public_name_set(this.swigCPtr, this, str);
    }

    public String getPublic_name() {
        return realmcJNI.realm_property_info_t_public_name_get(this.swigCPtr, this);
    }

    public void setType(int i) {
        realmcJNI.realm_property_info_t_type_set(this.swigCPtr, this, i);
    }

    public int getType() {
        return realmcJNI.realm_property_info_t_type_get(this.swigCPtr, this);
    }

    public void setCollection_type(int i) {
        realmcJNI.realm_property_info_t_collection_type_set(this.swigCPtr, this, i);
    }

    public int getCollection_type() {
        return realmcJNI.realm_property_info_t_collection_type_get(this.swigCPtr, this);
    }

    public void setLink_target(String str) {
        realmcJNI.realm_property_info_t_link_target_set(this.swigCPtr, this, str);
    }

    public String getLink_target() {
        return realmcJNI.realm_property_info_t_link_target_get(this.swigCPtr, this);
    }

    public void setLink_origin_property_name(String str) {
        realmcJNI.realm_property_info_t_link_origin_property_name_set(this.swigCPtr, this, str);
    }

    public String getLink_origin_property_name() {
        return realmcJNI.realm_property_info_t_link_origin_property_name_get(this.swigCPtr, this);
    }

    public void setKey(long j) {
        realmcJNI.realm_property_info_t_key_set(this.swigCPtr, this, j);
    }

    public long getKey() {
        return realmcJNI.realm_property_info_t_key_get(this.swigCPtr, this);
    }

    public void setFlags(int i) {
        realmcJNI.realm_property_info_t_flags_set(this.swigCPtr, this, i);
    }

    public int getFlags() {
        return realmcJNI.realm_property_info_t_flags_get(this.swigCPtr, this);
    }

    public realm_property_info_t() {
        this(realmcJNI.new_realm_property_info_t(), true);
    }
}
