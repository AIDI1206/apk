package org.zeroturnaround.zip;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public interface ZTFilePermissionsStrategy {
    ZTFilePermissions getPermissions(File file);

    void setPermissions(File file, ZTFilePermissions zTFilePermissions);
}
