package org.zeroturnaround.zip;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class ZTFilePermissionsUtil {
    private static final int GROUP_EXECUTE_FLAG = 8;
    private static final int GROUP_READ_FLAG = 32;
    private static final int GROUP_WRITE_FLAG = 16;
    private static final int OTHERS_EXECUTE_FLAG = 1;
    private static final int OTHERS_READ_FLAG = 4;
    private static final int OTHERS_WRITE_FLAG = 2;
    private static final int OWNER_EXECUTE_FLAG = 64;
    private static final int OWNER_READ_FLAG = 256;
    private static final int OWNER_WRITE_FLAG = 128;
    private static final ZTFilePermissionsStrategy NOP_STRATEGY = new ZTFilePermissionsStrategy() { // from class: org.zeroturnaround.zip.ZTFilePermissionsUtil.1
        @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
        public ZTFilePermissions getPermissions(File file) {
            return null;
        }

        @Override // org.zeroturnaround.zip.ZTFilePermissionsStrategy
        public void setPermissions(File file, ZTFilePermissions zTFilePermissions) {
        }
    };
    private static final ZTFilePermissionsStrategy DEFAULT_STRATEGY = fetchDefaultStrategy();

    private static int addFlag(boolean z, int i) {
        if (z) {
            return i;
        }
        return 0;
    }

    private ZTFilePermissionsUtil() {
    }

    static ZTFilePermissionsStrategy getDefaultStategy() {
        return DEFAULT_STRATEGY;
    }

    static int toPosixFileMode(ZTFilePermissions zTFilePermissions) {
        return addFlag(zTFilePermissions.isOthersCanRead(), 4) | addFlag(zTFilePermissions.isOwnerCanExecute(), 64) | addFlag(zTFilePermissions.isGroupCanExecute(), 8) | addFlag(zTFilePermissions.isOthersCanExecute(), 1) | addFlag(zTFilePermissions.isOwnerCanWrite(), 128) | addFlag(zTFilePermissions.isGroupCanWrite(), 16) | addFlag(zTFilePermissions.isOthersCanWrite(), 2) | addFlag(zTFilePermissions.isOwnerCanRead(), 256) | addFlag(zTFilePermissions.isGroupCanRead(), 32);
    }

    static ZTFilePermissions fromPosixFileMode(int i) {
        ZTFilePermissions zTFilePermissions = new ZTFilePermissions();
        zTFilePermissions.setOwnerCanExecute((i & 64) > 0);
        zTFilePermissions.setGroupCanExecute((i & 8) > 0);
        zTFilePermissions.setOthersCanExecute((i & 1) > 0);
        zTFilePermissions.setOwnerCanWrite((i & 128) > 0);
        zTFilePermissions.setGroupCanWrite((i & 16) > 0);
        zTFilePermissions.setOthersCanWrite((i & 2) > 0);
        zTFilePermissions.setOwnerCanRead((i & 256) > 0);
        zTFilePermissions.setGroupCanRead((i & 32) > 0);
        zTFilePermissions.setOthersCanRead((i & 4) > 0);
        return zTFilePermissions;
    }

    private static ZTFilePermissionsStrategy fetchDefaultStrategy() {
        ZTFilePermissionsStrategy zTFilePermissionsStrategyTryInstantiateStrategy = tryInstantiateStrategy(Java7Nio2ApiPermissionsStrategy.class);
        if (zTFilePermissionsStrategyTryInstantiateStrategy == null) {
            zTFilePermissionsStrategyTryInstantiateStrategy = tryInstantiateStrategy(Java6FileApiPermissionsStrategy.class);
        }
        return zTFilePermissionsStrategyTryInstantiateStrategy == null ? NOP_STRATEGY : zTFilePermissionsStrategyTryInstantiateStrategy;
    }

    private static ZTFilePermissionsStrategy tryInstantiateStrategy(Class<? extends ZTFilePermissionsStrategy> cls) {
        try {
            return cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
