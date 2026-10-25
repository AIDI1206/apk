package org.zeroturnaround.zip;

/* JADX INFO: loaded from: classes7.dex */
final class IdentityNameMapper implements NameMapper {
    public static final NameMapper INSTANCE = new IdentityNameMapper();

    @Override // org.zeroturnaround.zip.NameMapper
    public String map(String str) {
        return str;
    }

    private IdentityNameMapper() {
    }
}
