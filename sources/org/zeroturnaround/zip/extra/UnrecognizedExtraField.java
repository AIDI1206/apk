package org.zeroturnaround.zip.extra;

/* JADX INFO: loaded from: classes7.dex */
public class UnrecognizedExtraField implements ZipExtraField {
    private byte[] centralData;
    private ZipShort headerId;
    private byte[] localData;

    public void setHeaderId(ZipShort zipShort) {
        this.headerId = zipShort;
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getHeaderId() {
        return this.headerId;
    }

    public void setLocalFileDataData(byte[] bArr) {
        this.localData = copy(bArr);
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(this.localData.length);
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public byte[] getLocalFileDataData() {
        return copy(this.localData);
    }

    public void setCentralDirectoryData(byte[] bArr) {
        this.centralData = copy(bArr);
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        if (this.centralData != null) {
            return new ZipShort(this.centralData.length);
        }
        return getLocalFileDataLength();
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.centralData;
        if (bArr != null) {
            return copy(bArr);
        }
        return getLocalFileDataData();
    }

    @Override // org.zeroturnaround.zip.extra.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        setLocalFileDataData(bArr2);
    }

    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        setCentralDirectoryData(bArr2);
        if (this.localData == null) {
            setLocalFileDataData(bArr2);
        }
    }

    private static byte[] copy(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
