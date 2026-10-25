package org.zeroturnaround.zip;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
class Java7Nio2ApiPermissionsStrategy implements ZTFilePermissionsStrategy {
    private final Object GROUP_EXECUTE;
    private final Object GROUP_READ;
    private final Object GROUP_WRITE;
    private final Object OTHERS_EXECUTE;
    private final Object OTHERS_READ;
    private final Object OTHERS_WRITE;
    private final Object OWNER_EXECUTE;
    private final Object OWNER_READ;
    private final Object OWNER_WRITE;
    private final Class<?> filesClass;
    private final Method getPosixFilePermissionsMethod;
    private final Class<? extends Enum<?>> linkOptionClass;
    private final Enum<?>[] linkOptionsArray;
    private final Class<?> pathClass;
    private final Class<? extends Enum<?>> posixFilePermissionClass;
    private final Method setPosixFilePermissionsMethod;
    private final Method toPathMethod;

    public Java7Nio2ApiPermissionsStrategy() {
        if (!isPosix()) {
            throw new ZipException("File system does not support POSIX file attributes");
        }
        Class<? extends Enum<?>> classForName = ZTZipReflectionUtil.getClassForName("java.nio.file.attribute.PosixFilePermission", Enum.class);
        this.posixFilePermissionClass = classForName;
        Enum[] enumArr = (Enum[]) classForName.getEnumConstants();
        this.OWNER_READ = enumArr[0];
        this.OWNER_WRITE = enumArr[1];
        this.OWNER_EXECUTE = enumArr[2];
        this.GROUP_READ = enumArr[3];
        this.GROUP_WRITE = enumArr[4];
        this.GROUP_EXECUTE = enumArr[5];
        this.OTHERS_READ = enumArr[6];
        this.OTHERS_WRITE = enumArr[7];
        this.OTHERS_EXECUTE = enumArr[8];
        Class<? extends Enum<?>> classForName2 = ZTZipReflectionUtil.getClassForName("java.nio.file.LinkOption", Enum.class);
        this.linkOptionClass = classForName2;
        Enum<?>[] enumArr2 = (Enum[]) Array.newInstance(classForName2, 1);
        this.linkOptionsArray = enumArr2;
        enumArr2[0] = ((Enum[]) classForName2.getEnumConstants())[0];
        Class<?> classForName3 = ZTZipReflectionUtil.getClassForName("java.nio.file.Files", Object.class);
        this.filesClass = classForName3;
        Class<?> classForName4 = ZTZipReflectionUtil.getClassForName("java.nio.file.Path", Object.class);
        this.pathClass = classForName4;
        this.toPathMethod = ZTZipReflectionUtil.getDeclaredMethod(File.class, "toPath", new Class[0]);
        this.setPosixFilePermissionsMethod = ZTZipReflectionUtil.getDeclaredMethod(classForName3, "setPosixFilePermissions", classForName4, Set.class);
        this.getPosixFilePermissionsMethod = ZTZipReflectionUtil.getDeclaredMethod(classForName3, "getPosixFilePermissions", classForName4, enumArr2.getClass());
    }

    @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
    public ZTFilePermissions getPermissions(File file) {
        ZTFilePermissions zTFilePermissions = new ZTFilePermissions();
        zTFilePermissions.setDirectory(file.isDirectory());
        Set<?> posixFilePermissions = getPosixFilePermissions(file);
        zTFilePermissions.setOwnerCanRead(posixFilePermissions.contains(this.OWNER_READ));
        zTFilePermissions.setOwnerCanWrite(posixFilePermissions.contains(this.OWNER_WRITE));
        zTFilePermissions.setOwnerCanExecute(posixFilePermissions.contains(this.OWNER_EXECUTE));
        zTFilePermissions.setGroupCanRead(posixFilePermissions.contains(this.GROUP_READ));
        zTFilePermissions.setGroupCanWrite(posixFilePermissions.contains(this.GROUP_WRITE));
        zTFilePermissions.setGroupCanExecute(posixFilePermissions.contains(this.GROUP_EXECUTE));
        zTFilePermissions.setOthersCanRead(posixFilePermissions.contains(this.OTHERS_READ));
        zTFilePermissions.setOthersCanWrite(posixFilePermissions.contains(this.OTHERS_WRITE));
        zTFilePermissions.setOthersCanExecute(posixFilePermissions.contains(this.OTHERS_EXECUTE));
        return zTFilePermissions;
    }

    @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
    public void setPermissions(File file, ZTFilePermissions zTFilePermissions) {
        HashSet hashSet = new HashSet();
        addIf(zTFilePermissions.isOwnerCanRead(), hashSet, this.OWNER_READ);
        addIf(zTFilePermissions.isOwnerCanRead(), hashSet, this.OWNER_READ);
        addIf(zTFilePermissions.isOwnerCanWrite(), hashSet, this.OWNER_WRITE);
        addIf(zTFilePermissions.isOwnerCanExecute(), hashSet, this.OWNER_EXECUTE);
        addIf(zTFilePermissions.isGroupCanRead(), hashSet, this.GROUP_READ);
        addIf(zTFilePermissions.isGroupCanWrite(), hashSet, this.GROUP_WRITE);
        addIf(zTFilePermissions.isGroupCanExecute(), hashSet, this.GROUP_EXECUTE);
        addIf(zTFilePermissions.isOthersCanRead(), hashSet, this.OTHERS_READ);
        addIf(zTFilePermissions.isOthersCanWrite(), hashSet, this.OTHERS_WRITE);
        addIf(zTFilePermissions.isOthersCanExecute(), hashSet, this.OTHERS_EXECUTE);
        setPosixFilePermissions(file, hashSet);
    }

    private <E> void addIf(boolean z, Set<E> set, E e) {
        if (z) {
            set.add(e);
        }
    }

    private Object toPath(File file) {
        return ZTZipReflectionUtil.invoke(this.toPathMethod, file, new Object[0]);
    }

    private void setPosixFilePermissions(File file, Set<?> set) {
        ZTZipReflectionUtil.invoke(this.setPosixFilePermissionsMethod, null, toPath(file), set);
    }

    private Set<?> getPosixFilePermissions(File file) {
        return (Set) ZTZipReflectionUtil.invoke(this.getPosixFilePermissionsMethod, null, toPath(file), this.linkOptionsArray);
    }

    private static boolean isPosix() {
        return ((Set) ZTZipReflectionUtil.invoke(ZTZipReflectionUtil.getDeclaredMethod(ZTZipReflectionUtil.getClassForName("java.nio.file.FileSystem", Object.class), "supportedFileAttributeViews", new Class[0]), ZTZipReflectionUtil.invoke(ZTZipReflectionUtil.getDeclaredMethod(ZTZipReflectionUtil.getClassForName("java.nio.file.FileSystems", Object.class), "getDefault", new Class[0]), null, new Object[0]), new Object[0])).contains("posix");
    }
}
