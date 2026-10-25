package org.zeroturnaround.zip;

import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
class Java6FileApiPermissionsStrategy implements ZTFilePermissionsStrategy {
    private final Method canExecuteMethod = ZTZipReflectionUtil.getDeclaredMethod(File.class, "canExecute", new Class[0]);
    private final Method setExecutableMethod = ZTZipReflectionUtil.getDeclaredMethod(File.class, "setExecutable", Boolean.TYPE, Boolean.TYPE);
    private final Method setReadableMethod = ZTZipReflectionUtil.getDeclaredMethod(File.class, "setReadable", Boolean.TYPE, Boolean.TYPE);
    private final Method setWritableMethod = ZTZipReflectionUtil.getDeclaredMethod(File.class, "setWritable", Boolean.TYPE, Boolean.TYPE);

    @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
    public ZTFilePermissions getPermissions(File file) {
        ZTFilePermissions zTFilePermissions = new ZTFilePermissions();
        zTFilePermissions.setDirectory(file.isDirectory());
        if (canExecute(file)) {
            zTFilePermissions.setOwnerCanExecute(true);
        }
        if (file.canWrite()) {
            zTFilePermissions.setOwnerCanWrite(true);
            if (file.isDirectory()) {
                zTFilePermissions.setGroupCanWrite(true);
                zTFilePermissions.setOthersCanWrite(true);
            }
        }
        if (file.canRead()) {
            zTFilePermissions.setOwnerCanRead(true);
            zTFilePermissions.setGroupCanRead(true);
            zTFilePermissions.setOthersCanRead(true);
        }
        return zTFilePermissions;
    }

    @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
    public void setPermissions(File file, ZTFilePermissions zTFilePermissions) {
        setExecutable(file, zTFilePermissions.isOwnerCanExecute(), (zTFilePermissions.isGroupCanExecute() || zTFilePermissions.isOthersCanExecute()) ? false : true);
        setWritable(file, zTFilePermissions.isOwnerCanWrite(), (zTFilePermissions.isGroupCanWrite() || zTFilePermissions.isOthersCanWrite()) ? false : true);
        setReadable(file, zTFilePermissions.isOwnerCanRead(), (zTFilePermissions.isGroupCanRead() || zTFilePermissions.isOthersCanRead()) ? false : true);
    }

    private boolean setExecutable(File file, boolean z, boolean z2) {
        return ((Boolean) ZTZipReflectionUtil.invoke(this.setExecutableMethod, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    private boolean setWritable(File file, boolean z, boolean z2) {
        return ((Boolean) ZTZipReflectionUtil.invoke(this.setWritableMethod, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    private boolean setReadable(File file, boolean z, boolean z2) {
        return ((Boolean) ZTZipReflectionUtil.invoke(this.setReadableMethod, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    private boolean canExecute(File file) {
        return ((Boolean) ZTZipReflectionUtil.invoke(this.canExecuteMethod, file, new Object[0])).booleanValue();
    }
}
