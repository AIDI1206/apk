package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.medicmedia.medilink.core.network.adapter.RawJson;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.data.repository.UserDataRepositoryImpl;
import com.medicmedia.medilink.domain.model.WorkerKey;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001d\u001e\u001f B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Unique;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Unique;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "Contents", "ContentsTag", "ContentsResume", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ ContentsResponse copy$default(ContentsResponse contentsResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            commonResponse = contentsResponse.common;
        }
        if ((i & 2) != 0) {
            unique = contentsResponse.unique;
        }
        if ((i & 4) != 0) {
            errorResponse = contentsResponse.error;
        }
        return contentsResponse.copy(commonResponse, unique, errorResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiResponseInterface.CommonResponse getCommon() {
        return this.common;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unique getUnique() {
        return this.unique;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final ContentsResponse copy(ApiResponseInterface.CommonResponse common, Unique unique, ApiResponseErrorInterface.ErrorResponse error) {
        return new ContentsResponse(common, unique, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsResponse)) {
            return false;
        }
        ContentsResponse contentsResponse = (ContentsResponse) other;
        return Intrinsics.areEqual(this.common, contentsResponse.common) && Intrinsics.areEqual(this.unique, contentsResponse.unique) && Intrinsics.areEqual(this.error, contentsResponse.error);
    }

    public int hashCode() {
        ApiResponseInterface.CommonResponse commonResponse = this.common;
        int iHashCode = (commonResponse == null ? 0 : commonResponse.hashCode()) * 31;
        Unique unique = this.unique;
        int iHashCode2 = (iHashCode + (unique == null ? 0 : unique.hashCode())) * 31;
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        return iHashCode2 + (errorResponse != null ? errorResponse.hashCode() : 0);
    }

    public String toString() {
        return "ContentsResponse(common=" + this.common + ", unique=" + this.unique + ", error=" + this.error + ")";
    }

    public ContentsResponse(ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse) {
        this.common = commonResponse;
        this.unique = unique;
        this.error = errorResponse;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseInterface
    public ApiResponseInterface.CommonResponse getCommon() {
        return this.common;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseInterface
    public Unique getUnique() {
        return this.unique;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: ContentsResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Unique;", "", "contents", "", "Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Contents;", "<init>", "(Ljava/util/List;)V", "getContents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<Contents> contents;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.contents;
            }
            return unique.copy(list);
        }

        public final List<Contents> component1() {
            return this.contents;
        }

        public final Unique copy(List<Contents> contents) {
            return new Unique(contents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.contents, ((Unique) other).contents);
        }

        public int hashCode() {
            List<Contents> list = this.contents;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Unique(contents=" + this.contents + ")";
        }

        public Unique(List<Contents> list) {
            this.contents = list;
        }

        public final List<Contents> getContents() {
            return this.contents;
        }
    }

    /* JADX INFO: compiled from: ContentsResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010I\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00101J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003Jü\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0003\u0010\u001d\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00122\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0011\u00101R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0013\u00101R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!¨\u0006X"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Contents;", "", "possession", "", "dirName", "", "fileName", RemoteConfigComponent.ACTIVATE_FILE_NAME, "openDate", "closeDate", "option", "thumbnailUrl", "fileSize", "storeUrl", HistoryRepositoryImpl.FieldName.TITLE, "phonetic", "dataYear", "isQb", "", "isCbt", WorkerKey.KEY_VERSION, "id", "updateFlag", "category", HistoryRepositoryImpl.Path.TAGS, "", "Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsTag;", UserDataRepositoryImpl.Path.RESUME, "Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsResume;", "sortOrderWithinCategory", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsResume;I)V", "getPossession", "()I", "getDirName", "()Ljava/lang/String;", "getFileName", "getActivate", "getOpenDate", "getCloseDate", "getOption", "getThumbnailUrl", "getFileSize", "getStoreUrl", "getTitle", "getPhonetic", "getDataYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersion", "getId", "getUpdateFlag", "getCategory", "getTags", "()Ljava/util/List;", "getResume", "()Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsResume;", "getSortOrderWithinCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsResume;I)Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$Contents;", "equals", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Contents {
        private final int activate;
        private final String category;
        private final String closeDate;
        private final Integer dataYear;
        private final String dirName;
        private final String fileName;
        private final String fileSize;
        private final String id;
        private final Boolean isCbt;
        private final Boolean isQb;
        private final String openDate;
        private final String option;
        private final String phonetic;
        private final int possession;
        private final ContentsResume resume;
        private final int sortOrderWithinCategory;
        private final String storeUrl;
        private final List<ContentsTag> tags;
        private final String thumbnailUrl;
        private final String title;
        private final int updateFlag;
        private final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Contents copy$default(Contents contents, int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Boolean bool, Boolean bool2, String str11, String str12, int i3, String str13, List list, ContentsResume contentsResume, int i4, int i5, Object obj) {
            int i6;
            ContentsResume contentsResume2;
            int i7 = (i5 & 1) != 0 ? contents.possession : i;
            String str14 = (i5 & 2) != 0 ? contents.dirName : str;
            String str15 = (i5 & 4) != 0 ? contents.fileName : str2;
            int i8 = (i5 & 8) != 0 ? contents.activate : i2;
            String str16 = (i5 & 16) != 0 ? contents.openDate : str3;
            String str17 = (i5 & 32) != 0 ? contents.closeDate : str4;
            String str18 = (i5 & 64) != 0 ? contents.option : str5;
            String str19 = (i5 & 128) != 0 ? contents.thumbnailUrl : str6;
            String str20 = (i5 & 256) != 0 ? contents.fileSize : str7;
            String str21 = (i5 & 512) != 0 ? contents.storeUrl : str8;
            String str22 = (i5 & 1024) != 0 ? contents.title : str9;
            String str23 = (i5 & 2048) != 0 ? contents.phonetic : str10;
            Integer num2 = (i5 & 4096) != 0 ? contents.dataYear : num;
            Boolean bool3 = (i5 & 8192) != 0 ? contents.isQb : bool;
            int i9 = i7;
            Boolean bool4 = (i5 & 16384) != 0 ? contents.isCbt : bool2;
            String str24 = (i5 & 32768) != 0 ? contents.version : str11;
            String str25 = (i5 & 65536) != 0 ? contents.id : str12;
            int i10 = (i5 & 131072) != 0 ? contents.updateFlag : i3;
            String str26 = (i5 & 262144) != 0 ? contents.category : str13;
            List list2 = (i5 & 524288) != 0 ? contents.tags : list;
            ContentsResume contentsResume3 = (i5 & 1048576) != 0 ? contents.resume : contentsResume;
            if ((i5 & 2097152) != 0) {
                contentsResume2 = contentsResume3;
                i6 = contents.sortOrderWithinCategory;
            } else {
                i6 = i4;
                contentsResume2 = contentsResume3;
            }
            return contents.copy(i9, str14, str15, i8, str16, str17, str18, str19, str20, str21, str22, str23, num2, bool3, bool4, str24, str25, i10, str26, list2, contentsResume2, i6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPossession() {
            return this.possession;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getStoreUrl() {
            return this.storeUrl;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getPhonetic() {
            return this.phonetic;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getDataYear() {
            return this.dataYear;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Boolean getIsQb() {
            return this.isQb;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Boolean getIsCbt() {
            return this.isCbt;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final int getUpdateFlag() {
            return this.updateFlag;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDirName() {
            return this.dirName;
        }

        public final List<ContentsTag> component20() {
            return this.tags;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final ContentsResume getResume() {
            return this.resume;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final int getSortOrderWithinCategory() {
            return this.sortOrderWithinCategory;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getActivate() {
            return this.activate;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOpenDate() {
            return this.openDate;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCloseDate() {
            return this.closeDate;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOption() {
            return this.option;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getFileSize() {
            return this.fileSize;
        }

        public final Contents copy(int possession, @Json(name = "dir_name") String dirName, @Json(name = "file_name") String fileName, int activate, @Json(name = "open_date") String openDate, @Json(name = "close_date") String closeDate, @RawJson String option, @Json(name = "thumbnail_url") String thumbnailUrl, @Json(name = "file_size") String fileSize, @Json(name = "store_url") String storeUrl, String title, String phonetic, Integer dataYear, Boolean isQb, Boolean isCbt, String version, String id, @Json(name = "update_flg") int updateFlag, String category, List<ContentsTag> tags, ContentsResume resume, @Json(name = "sort_order_within_category") int sortOrderWithinCategory) {
            Intrinsics.checkNotNullParameter(dirName, "dirName");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(openDate, "openDate");
            Intrinsics.checkNotNullParameter(closeDate, "closeDate");
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            Intrinsics.checkNotNullParameter(storeUrl, "storeUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(phonetic, "phonetic");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            return new Contents(possession, dirName, fileName, activate, openDate, closeDate, option, thumbnailUrl, fileSize, storeUrl, title, phonetic, dataYear, isQb, isCbt, version, id, updateFlag, category, tags, resume, sortOrderWithinCategory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contents)) {
                return false;
            }
            Contents contents = (Contents) other;
            return this.possession == contents.possession && Intrinsics.areEqual(this.dirName, contents.dirName) && Intrinsics.areEqual(this.fileName, contents.fileName) && this.activate == contents.activate && Intrinsics.areEqual(this.openDate, contents.openDate) && Intrinsics.areEqual(this.closeDate, contents.closeDate) && Intrinsics.areEqual(this.option, contents.option) && Intrinsics.areEqual(this.thumbnailUrl, contents.thumbnailUrl) && Intrinsics.areEqual(this.fileSize, contents.fileSize) && Intrinsics.areEqual(this.storeUrl, contents.storeUrl) && Intrinsics.areEqual(this.title, contents.title) && Intrinsics.areEqual(this.phonetic, contents.phonetic) && Intrinsics.areEqual(this.dataYear, contents.dataYear) && Intrinsics.areEqual(this.isQb, contents.isQb) && Intrinsics.areEqual(this.isCbt, contents.isCbt) && Intrinsics.areEqual(this.version, contents.version) && Intrinsics.areEqual(this.id, contents.id) && this.updateFlag == contents.updateFlag && Intrinsics.areEqual(this.category, contents.category) && Intrinsics.areEqual(this.tags, contents.tags) && Intrinsics.areEqual(this.resume, contents.resume) && this.sortOrderWithinCategory == contents.sortOrderWithinCategory;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((Integer.hashCode(this.possession) * 31) + this.dirName.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.activate)) * 31) + this.openDate.hashCode()) * 31) + this.closeDate.hashCode()) * 31) + this.option.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31;
            String str = this.fileSize;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.storeUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.phonetic.hashCode()) * 31;
            Integer num = this.dataYear;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.isQb;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isCbt;
            int iHashCode5 = (((((((((iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.version.hashCode()) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.updateFlag)) * 31) + this.category.hashCode()) * 31;
            List<ContentsTag> list = this.tags;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            ContentsResume contentsResume = this.resume;
            return ((iHashCode6 + (contentsResume != null ? contentsResume.hashCode() : 0)) * 31) + Integer.hashCode(this.sortOrderWithinCategory);
        }

        public String toString() {
            return "Contents(possession=" + this.possession + ", dirName=" + this.dirName + ", fileName=" + this.fileName + ", activate=" + this.activate + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", option=" + this.option + ", thumbnailUrl=" + this.thumbnailUrl + ", fileSize=" + this.fileSize + ", storeUrl=" + this.storeUrl + ", title=" + this.title + ", phonetic=" + this.phonetic + ", dataYear=" + this.dataYear + ", isQb=" + this.isQb + ", isCbt=" + this.isCbt + ", version=" + this.version + ", id=" + this.id + ", updateFlag=" + this.updateFlag + ", category=" + this.category + ", tags=" + this.tags + ", resume=" + this.resume + ", sortOrderWithinCategory=" + this.sortOrderWithinCategory + ")";
        }

        public Contents(int i, @Json(name = "dir_name") String dirName, @Json(name = "file_name") String fileName, int i2, @Json(name = "open_date") String openDate, @Json(name = "close_date") String closeDate, @RawJson String option, @Json(name = "thumbnail_url") String thumbnailUrl, @Json(name = "file_size") String str, @Json(name = "store_url") String storeUrl, String title, String phonetic, Integer num, Boolean bool, Boolean bool2, String version, String id, @Json(name = "update_flg") int i3, String category, List<ContentsTag> list, ContentsResume contentsResume, @Json(name = "sort_order_within_category") int i4) {
            Intrinsics.checkNotNullParameter(dirName, "dirName");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(openDate, "openDate");
            Intrinsics.checkNotNullParameter(closeDate, "closeDate");
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            Intrinsics.checkNotNullParameter(storeUrl, "storeUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(phonetic, "phonetic");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(category, "category");
            this.possession = i;
            this.dirName = dirName;
            this.fileName = fileName;
            this.activate = i2;
            this.openDate = openDate;
            this.closeDate = closeDate;
            this.option = option;
            this.thumbnailUrl = thumbnailUrl;
            this.fileSize = str;
            this.storeUrl = storeUrl;
            this.title = title;
            this.phonetic = phonetic;
            this.dataYear = num;
            this.isQb = bool;
            this.isCbt = bool2;
            this.version = version;
            this.id = id;
            this.updateFlag = i3;
            this.category = category;
            this.tags = list;
            this.resume = contentsResume;
            this.sortOrderWithinCategory = i4;
        }

        public final int getPossession() {
            return this.possession;
        }

        public final String getDirName() {
            return this.dirName;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final int getActivate() {
            return this.activate;
        }

        public final String getOpenDate() {
            return this.openDate;
        }

        public final String getCloseDate() {
            return this.closeDate;
        }

        public final String getOption() {
            return this.option;
        }

        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final String getFileSize() {
            return this.fileSize;
        }

        public final String getStoreUrl() {
            return this.storeUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPhonetic() {
            return this.phonetic;
        }

        public final Integer getDataYear() {
            return this.dataYear;
        }

        public final Boolean isQb() {
            return this.isQb;
        }

        public final Boolean isCbt() {
            return this.isCbt;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getId() {
            return this.id;
        }

        public final int getUpdateFlag() {
            return this.updateFlag;
        }

        public final String getCategory() {
            return this.category;
        }

        public final List<ContentsTag> getTags() {
            return this.tags;
        }

        public final ContentsResume getResume() {
            return this.resume;
        }

        public final int getSortOrderWithinCategory() {
            return this.sortOrderWithinCategory;
        }
    }

    /* JADX INFO: compiled from: ContentsResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsTag;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsTag {
        private final String name;

        public static /* synthetic */ ContentsTag copy$default(ContentsTag contentsTag, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentsTag.name;
            }
            return contentsTag.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final ContentsTag copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ContentsTag(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentsTag) && Intrinsics.areEqual(this.name, ((ContentsTag) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "ContentsTag(name=" + this.name + ")";
        }

        public ContentsTag(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: ContentsResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ContentsResponse$ContentsResume;", "", "info", "", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsResume {
        private final String date;
        private final String info;

        public static /* synthetic */ ContentsResume copy$default(ContentsResume contentsResume, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentsResume.info;
            }
            if ((i & 2) != 0) {
                str2 = contentsResume.date;
            }
            return contentsResume.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final ContentsResume copy(String info, String date) {
            return new ContentsResume(info, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentsResume)) {
                return false;
            }
            ContentsResume contentsResume = (ContentsResume) other;
            return Intrinsics.areEqual(this.info, contentsResume.info) && Intrinsics.areEqual(this.date, contentsResume.date);
        }

        public int hashCode() {
            String str = this.info;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.date;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ContentsResume(info=" + this.info + ", date=" + this.date + ")";
        }

        public ContentsResume(String str, String str2) {
            this.info = str;
            this.date = str2;
        }

        public final String getInfo() {
            return this.info;
        }

        public final String getDate() {
            return this.date;
        }
    }
}
