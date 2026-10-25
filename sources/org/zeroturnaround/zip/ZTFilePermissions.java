package org.zeroturnaround.zip;

/* JADX INFO: loaded from: classes7.dex */
class ZTFilePermissions {
    private boolean groupCanExecute;
    private boolean groupCanRead;
    private boolean groupCanWrite;
    private boolean isDirectory;
    private boolean othersCanExecute;
    private boolean othersCanRead;
    private boolean othersCanWrite;
    private boolean ownerCanExecute;
    private boolean ownerCanRead;
    private boolean ownerCanWrite;

    ZTFilePermissions() {
    }

    boolean isDirectory() {
        return this.isDirectory;
    }

    void setDirectory(boolean z) {
        this.isDirectory = z;
    }

    boolean isOwnerCanRead() {
        return this.ownerCanRead;
    }

    void setOwnerCanRead(boolean z) {
        this.ownerCanRead = z;
    }

    boolean isOwnerCanWrite() {
        return this.ownerCanWrite;
    }

    void setOwnerCanWrite(boolean z) {
        this.ownerCanWrite = z;
    }

    boolean isOwnerCanExecute() {
        return this.ownerCanExecute;
    }

    void setOwnerCanExecute(boolean z) {
        this.ownerCanExecute = z;
    }

    boolean isGroupCanRead() {
        return this.groupCanRead;
    }

    void setGroupCanRead(boolean z) {
        this.groupCanRead = z;
    }

    boolean isGroupCanWrite() {
        return this.groupCanWrite;
    }

    void setGroupCanWrite(boolean z) {
        this.groupCanWrite = z;
    }

    boolean isGroupCanExecute() {
        return this.groupCanExecute;
    }

    void setGroupCanExecute(boolean z) {
        this.groupCanExecute = z;
    }

    boolean isOthersCanRead() {
        return this.othersCanRead;
    }

    void setOthersCanRead(boolean z) {
        this.othersCanRead = z;
    }

    boolean isOthersCanWrite() {
        return this.othersCanWrite;
    }

    void setOthersCanWrite(boolean z) {
        this.othersCanWrite = z;
    }

    boolean isOthersCanExecute() {
        return this.othersCanExecute;
    }

    void setOthersCanExecute(boolean z) {
        this.othersCanExecute = z;
    }
}
