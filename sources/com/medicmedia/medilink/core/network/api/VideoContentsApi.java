package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.medicmedia.medilink.core.network.api.response.QrContentsResponse;
import com.medicmedia.medilink.core.network.api.response.VideoCourseResponse;
import com.medicmedia.medilink.core.network.api.response.VideoErrataResponse;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: compiled from: VideoContentsApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/VideoContentsApi;", "", "getVideosTop", "", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoCourse", "courseId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoChapter", "Lcom/medicmedia/medilink/core/network/api/response/VideoCourseResponse$Chapter;", "chapterId", "getVideoErrata", "Lcom/medicmedia/medilink/core/network/api/response/VideoErrataResponse;", BundleKey.VIDEO_ID, "getQrContents", "Lcom/medicmedia/medilink/core/network/api/response/QrContentsResponse;", OptionalModuleUtils.BARCODE, "Path", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoContentsApi {
    @GET("qr_contents/{barcode}.json")
    Object getQrContents(@retrofit2.http.Path(encoded = true, value = OptionalModuleUtils.BARCODE) String str, Continuation<? super QrContentsResponse> continuation);

    @GET("videos_chapter/{chapterId}.json")
    Object getVideoChapter(@retrofit2.http.Path(encoded = true, value = "chapterId") String str, Continuation<? super VideoCourseResponse.Chapter> continuation);

    @GET("videos_course/{courseId}.json")
    Object getVideoCourse(@retrofit2.http.Path(encoded = true, value = "courseId") String str, Continuation<? super VideoCourseResponse> continuation);

    @GET("errata/video/{videoId}.json")
    Object getVideoErrata(@retrofit2.http.Path(encoded = true, value = BundleKey.VIDEO_ID) String str, Continuation<? super VideoErrataResponse> continuation);

    @GET("videos_top/top_all.json")
    Object getVideosTop(Continuation<? super List<VideoCourseResponse>> continuation);

    /* JADX INFO: compiled from: VideoContentsApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/VideoContentsApi$Path;", "", "<init>", "()V", "VIDEO_TOP", "", "VIDEO_COURSE", "VIDEO_CHAPTER", "VIDEO_ERRATA", "QR", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Path {
        public static final Path INSTANCE = new Path();
        public static final String QR = "qr_contents/{barcode}.json";
        public static final String VIDEO_CHAPTER = "videos_chapter/{chapterId}.json";
        public static final String VIDEO_COURSE = "videos_course/{courseId}.json";
        public static final String VIDEO_ERRATA = "errata/video/{videoId}.json";
        public static final String VIDEO_TOP = "videos_top/top_all.json";

        private Path() {
        }
    }
}
