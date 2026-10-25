package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mongodb.kbson.BsonObjectId;

/* JADX INFO: compiled from: ApiKeyWrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB+\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\r\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/ApiKeyWrapper;", "", "id", "Lorg/mongodb/kbson/BsonObjectId;", "Lorg/mongodb/kbson/ObjectId;", "value", "", "name", "disabled", "", "<init>", "(Lorg/mongodb/kbson/BsonObjectId;Ljava/lang/String;Ljava/lang/String;Z)V", "", "([BLjava/lang/String;Ljava/lang/String;Z)V", "getId", "()Lorg/mongodb/kbson/BsonObjectId;", "getValue", "()Ljava/lang/String;", "getName", "getDisabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ApiKeyWrapper {
    private final boolean disabled;
    private final BsonObjectId id;
    private final String name;
    private final String value;

    public static /* synthetic */ ApiKeyWrapper copy$default(ApiKeyWrapper apiKeyWrapper, BsonObjectId bsonObjectId, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bsonObjectId = apiKeyWrapper.id;
        }
        if ((i & 2) != 0) {
            str = apiKeyWrapper.value;
        }
        if ((i & 4) != 0) {
            str2 = apiKeyWrapper.name;
        }
        if ((i & 8) != 0) {
            z = apiKeyWrapper.disabled;
        }
        return apiKeyWrapper.copy(bsonObjectId, str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BsonObjectId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final ApiKeyWrapper copy(BsonObjectId id, String value, String name, boolean disabled) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ApiKeyWrapper(id, value, name, disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiKeyWrapper)) {
            return false;
        }
        ApiKeyWrapper apiKeyWrapper = (ApiKeyWrapper) other;
        return Intrinsics.areEqual(this.id, apiKeyWrapper.id) && Intrinsics.areEqual(this.value, apiKeyWrapper.value) && Intrinsics.areEqual(this.name, apiKeyWrapper.name) && this.disabled == apiKeyWrapper.disabled;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.value;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.disabled);
    }

    public String toString() {
        return "ApiKeyWrapper(id=" + this.id + ", value=" + this.value + ", name=" + this.name + ", disabled=" + this.disabled + ')';
    }

    public ApiKeyWrapper(BsonObjectId id, String str, String name, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.value = str;
        this.name = name;
        this.disabled = z;
    }

    public final BsonObjectId getId() {
        return this.id;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiKeyWrapper(byte[] id, String str, String name, boolean z) {
        this(BsonObjectId.INSTANCE.invoke(id), str, name, z);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
