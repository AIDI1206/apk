package com.medicmedia.medilink.data.repository;

import android.app.Activity;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.medicmedia.medilink.camera.CameraClient;
import com.medicmedia.medilink.camera.CameraPermissionResult;
import com.medicmedia.medilink.camera.CameraScanResult;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: CameraRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/data/repository/CameraRepositoryImpl;", "Lcom/medicmedia/medilink/data/repository/CameraRepository;", "cameraClient", "Lcom/medicmedia/medilink/camera/CameraClient;", "<init>", "(Lcom/medicmedia/medilink/camera/CameraClient;)V", "startCamera", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/medicmedia/medilink/camera/CameraScanResult;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "previewView", "Landroidx/camera/view/PreviewView;", "cameraType", "", "unbindAllCamera", "", "checkCameraPermission", "Lcom/medicmedia/medilink/camera/CameraPermissionResult;", "activity", "Landroid/app/Activity;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CameraRepositoryImpl implements CameraRepository {
    private final CameraClient cameraClient;

    @Inject
    public CameraRepositoryImpl(CameraClient cameraClient) {
        Intrinsics.checkNotNullParameter(cameraClient, "cameraClient");
        this.cameraClient = cameraClient;
    }

    @Override // com.medicmedia.medilink.data.repository.CameraRepository
    public Flow<List<CameraScanResult>> startCamera(LifecycleOwner lifecycleOwner, PreviewView previewView, int cameraType) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        return this.cameraClient.startScan(lifecycleOwner, previewView, cameraType);
    }

    @Override // com.medicmedia.medilink.data.repository.CameraRepository
    public void unbindAllCamera() {
        this.cameraClient.unbindAllCamera();
    }

    @Override // com.medicmedia.medilink.data.repository.CameraRepository
    public CameraPermissionResult checkCameraPermission(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.cameraClient.checkCameraPermission(activity);
    }
}
