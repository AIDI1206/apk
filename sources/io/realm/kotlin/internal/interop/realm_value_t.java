package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realm_value_t {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    protected realm_value_t(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    protected static long getCPtr(realm_value_t realm_value_tVar) {
        if (realm_value_tVar == null) {
            return 0L;
        }
        return realm_value_tVar.swigCPtr;
    }

    protected static long swigRelease(realm_value_t realm_value_tVar) {
        if (realm_value_tVar == null) {
            return 0L;
        }
        if (!realm_value_tVar.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = realm_value_tVar.swigCPtr;
        realm_value_tVar.swigCMemOwn = false;
        realm_value_tVar.delete();
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
                realmcJNI.delete_realm_value_t(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void setInteger(long j) {
        realmcJNI.realm_value_t_integer_set(this.swigCPtr, this, j);
    }

    public long getInteger() {
        return realmcJNI.realm_value_t_integer_get(this.swigCPtr, this);
    }

    public void set_boolean(boolean z) {
        realmcJNI.realm_value_t__boolean_set(this.swigCPtr, this, z);
    }

    public boolean get_boolean() {
        return realmcJNI.realm_value_t__boolean_get(this.swigCPtr, this);
    }

    public void setString(String str) {
        realmcJNI.realm_value_t_string_set(this.swigCPtr, this, str);
    }

    public String getString() {
        return realmcJNI.realm_value_t_string_get(this.swigCPtr, this);
    }

    public void setBinary(realm_binary_t realm_binary_tVar) {
        realmcJNI.realm_value_t_binary_set(this.swigCPtr, this, realm_binary_t.getCPtr(realm_binary_tVar), realm_binary_tVar);
    }

    public realm_binary_t getBinary() {
        long jRealm_value_t_binary_get = realmcJNI.realm_value_t_binary_get(this.swigCPtr, this);
        if (jRealm_value_t_binary_get == 0) {
            return null;
        }
        return new realm_binary_t(jRealm_value_t_binary_get, false);
    }

    public void setTimestamp(realm_timestamp_t realm_timestamp_tVar) {
        realmcJNI.realm_value_t_timestamp_set(this.swigCPtr, this, realm_timestamp_t.getCPtr(realm_timestamp_tVar), realm_timestamp_tVar);
    }

    public realm_timestamp_t getTimestamp() {
        long jRealm_value_t_timestamp_get = realmcJNI.realm_value_t_timestamp_get(this.swigCPtr, this);
        if (jRealm_value_t_timestamp_get == 0) {
            return null;
        }
        return new realm_timestamp_t(jRealm_value_t_timestamp_get, false);
    }

    public void setFnum(float f) {
        realmcJNI.realm_value_t_fnum_set(this.swigCPtr, this, f);
    }

    public float getFnum() {
        return realmcJNI.realm_value_t_fnum_get(this.swigCPtr, this);
    }

    public void setDnum(double d) {
        realmcJNI.realm_value_t_dnum_set(this.swigCPtr, this, d);
    }

    public double getDnum() {
        return realmcJNI.realm_value_t_dnum_get(this.swigCPtr, this);
    }

    public void setDecimal128(realm_decimal128_t realm_decimal128_tVar) {
        realmcJNI.realm_value_t_decimal128_set(this.swigCPtr, this, realm_decimal128_t.getCPtr(realm_decimal128_tVar), realm_decimal128_tVar);
    }

    public realm_decimal128_t getDecimal128() {
        long jRealm_value_t_decimal128_get = realmcJNI.realm_value_t_decimal128_get(this.swigCPtr, this);
        if (jRealm_value_t_decimal128_get == 0) {
            return null;
        }
        return new realm_decimal128_t(jRealm_value_t_decimal128_get, false);
    }

    public void setObject_id(realm_object_id_t realm_object_id_tVar) {
        realmcJNI.realm_value_t_object_id_set(this.swigCPtr, this, realm_object_id_t.getCPtr(realm_object_id_tVar), realm_object_id_tVar);
    }

    public realm_object_id_t getObject_id() {
        long jRealm_value_t_object_id_get = realmcJNI.realm_value_t_object_id_get(this.swigCPtr, this);
        if (jRealm_value_t_object_id_get == 0) {
            return null;
        }
        return new realm_object_id_t(jRealm_value_t_object_id_get, false);
    }

    public void setUuid(realm_uuid_t realm_uuid_tVar) {
        realmcJNI.realm_value_t_uuid_set(this.swigCPtr, this, realm_uuid_t.getCPtr(realm_uuid_tVar), realm_uuid_tVar);
    }

    public realm_uuid_t getUuid() {
        long jRealm_value_t_uuid_get = realmcJNI.realm_value_t_uuid_get(this.swigCPtr, this);
        if (jRealm_value_t_uuid_get == 0) {
            return null;
        }
        return new realm_uuid_t(jRealm_value_t_uuid_get, false);
    }

    public void setLink(realm_link_t realm_link_tVar) {
        realmcJNI.realm_value_t_link_set(this.swigCPtr, this, realm_link_t.getCPtr(realm_link_tVar), realm_link_tVar);
    }

    public realm_link_t getLink() {
        long jRealm_value_t_link_get = realmcJNI.realm_value_t_link_get(this.swigCPtr, this);
        if (jRealm_value_t_link_get == 0) {
            return null;
        }
        return new realm_link_t(jRealm_value_t_link_get, false);
    }

    public void setData(String str) {
        realmcJNI.realm_value_t_data_set(this.swigCPtr, this, str);
    }

    public String getData() {
        return realmcJNI.realm_value_t_data_get(this.swigCPtr, this);
    }

    public void setType(int i) {
        realmcJNI.realm_value_t_type_set(this.swigCPtr, this, i);
    }

    public int getType() {
        return realmcJNI.realm_value_t_type_get(this.swigCPtr, this);
    }

    public realm_value_t() {
        this(realmcJNI.new_realm_value_t(), true);
    }
}
