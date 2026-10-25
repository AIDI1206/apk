package com.google.mlkit.vision.text.pipeline;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:text-recognition-bundled-common@@17.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zbg {
    static String zba(List list) {
        Iterator it = list.iterator();
        float fZbc = 0.0f;
        String strZbf = C.LANGUAGE_UNDETERMINED;
        while (it.hasNext()) {
            zbaaw zbaawVar = (zbaaw) it.next();
            if (fZbc < zbaawVar.zbc()) {
                fZbc = zbaawVar.zbc();
                strZbf = zbaawVar.zbf();
            }
        }
        return strZbf;
    }
}
