package sh.calvin.reorderable;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002R\u001a\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0018\u0010\u0010\u001a\u00020\u0004X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0012\u001a\u00020\u0013X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lsh/calvin/reorderable/LazyCollectionItemInfo;", ExifInterface.GPS_DIRECTION_TRUE, "", TtmlNode.CENTER, "Landroidx/compose/ui/unit/IntOffset;", "getCenter-nOcc-ac", "()J", "data", "getData", "()Ljava/lang/Object;", "index", "", "getIndex", "()I", "key", "getKey", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LazyCollectionItemInfo<T> {
    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    long mo13406getCenternOccac();

    T getData();

    int getIndex();

    Object getKey();

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo13407getOffsetnOccac();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo13408getSizeYbymL2g();

    /* JADX INFO: compiled from: ReorderableLazyCollection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
        public static <T> long m13409getCenternOccac(LazyCollectionItemInfo<? extends T> lazyCollectionItemInfo) {
            return IntOffsetKt.IntOffset(IntOffset.m8831getXimpl(lazyCollectionItemInfo.mo13407getOffsetnOccac()) + (IntSize.m8874getWidthimpl(lazyCollectionItemInfo.mo13408getSizeYbymL2g()) / 2), IntOffset.m8832getYimpl(lazyCollectionItemInfo.mo13407getOffsetnOccac()) + (IntSize.m8873getHeightimpl(lazyCollectionItemInfo.mo13408getSizeYbymL2g()) / 2));
        }
    }
}
