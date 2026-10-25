package io.realm.kotlin.internal;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.startup.Initializer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmInitializer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/RealmInitializer;", "Landroidx/startup/Initializer;", "Landroid/content/Context;", "<init>", "()V", "create", "context", "dependencies", "", "Ljava/lang/Class;", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmInitializer implements Initializer<Context> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static AssetManager assetManager;
    public static File filesDir;

    /* JADX INFO: compiled from: RealmInitializer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/internal/RealmInitializer$Companion;", "", "<init>", "()V", "filesDir", "Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "setFilesDir", "(Ljava/io/File;)V", "assetManager", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "setAssetManager", "(Landroid/content/res/AssetManager;)V", "asset", "Ljava/io/InputStream;", "filename", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final File getFilesDir() {
            File file = RealmInitializer.filesDir;
            if (file != null) {
                return file;
            }
            Intrinsics.throwUninitializedPropertyAccessException("filesDir");
            return null;
        }

        public final void setFilesDir(File file) {
            Intrinsics.checkNotNullParameter(file, "<set-?>");
            RealmInitializer.filesDir = file;
        }

        public final AssetManager getAssetManager() {
            AssetManager assetManager = RealmInitializer.assetManager;
            if (assetManager != null) {
                return assetManager;
            }
            Intrinsics.throwUninitializedPropertyAccessException("assetManager");
            return null;
        }

        public final void setAssetManager(AssetManager assetManager) {
            Intrinsics.checkNotNullParameter(assetManager, "<set-?>");
            RealmInitializer.assetManager = assetManager;
        }

        public final InputStream asset(String filename) throws IOException {
            Intrinsics.checkNotNullParameter(filename, "filename");
            InputStream inputStreamOpen = getAssetManager().open(filename);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            return inputStreamOpen;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public Context create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        companion.setFilesDir(context.getFilesDir());
        companion.setAssetManager(context.getAssets());
        AndroidUtilsKt.loadAndroidNativeLibs(context, VersionKt.SDK_VERSION);
        return context;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return new ArrayList();
    }
}
