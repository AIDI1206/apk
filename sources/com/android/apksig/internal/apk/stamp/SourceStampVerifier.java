package com.android.apksig.internal.apk.stamp;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.ApkSignerInfo;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.ApkSupportedSignature;
import com.android.apksig.internal.apk.NoApkSupportedSignaturesException;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.util.ByteBufferUtils;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class SourceStampVerifier {
    private SourceStampVerifier() {
    }

    public static void verifyV1SourceStamp(ByteBuffer sourceStampBlockData, CertificateFactory certFactory, ApkSignerInfo result, byte[] apkDigest, byte[] sourceStampCertificateDigest, int minSdkVersion, int maxSdkVersion) throws NoSuchAlgorithmException, ApkFormatException {
        X509Certificate x509CertificateVerifySourceStampCertificate = verifySourceStampCertificate(sourceStampBlockData, certFactory, sourceStampCertificateDigest, result);
        if (result.containsWarnings() || result.containsErrors()) {
            return;
        }
        verifySourceStampSignature(apkDigest, minSdkVersion, maxSdkVersion, x509CertificateVerifySourceStampCertificate, ApkSigningBlockUtilsLite.getLengthPrefixedSlice(sourceStampBlockData), result);
    }

    public static void verifyV2SourceStamp(ByteBuffer sourceStampBlockData, CertificateFactory certFactory, ApkSignerInfo result, Map<Integer, byte[]> signatureSchemeApkDigests, byte[] sourceStampCertificateDigest, int minSdkVersion, int maxSdkVersion) throws NoSuchAlgorithmException, ApkFormatException {
        X509Certificate x509CertificateVerifySourceStampCertificate = verifySourceStampCertificate(sourceStampBlockData, certFactory, sourceStampCertificateDigest, result);
        if (result.containsWarnings() || result.containsErrors()) {
            return;
        }
        ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(sourceStampBlockData);
        HashMap map = new HashMap();
        while (lengthPrefixedSlice.hasRemaining()) {
            ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(lengthPrefixedSlice);
            int i = lengthPrefixedSlice2.getInt();
            map.put(Integer.valueOf(i), ApkSigningBlockUtilsLite.getLengthPrefixedSlice(lengthPrefixedSlice2));
        }
        for (Map.Entry<Integer, byte[]> entry : signatureSchemeApkDigests.entrySet()) {
            if (entry.getKey().intValue() == 31) {
                result.addInfoMessage(39, 31);
            } else {
                if (!map.containsKey(entry.getKey())) {
                    result.addWarning(17, new Object[0]);
                    return;
                }
                int i2 = minSdkVersion;
                int i3 = maxSdkVersion;
                ApkSignerInfo apkSignerInfo = result;
                verifySourceStampSignature(entry.getValue(), i2, i3, x509CertificateVerifySourceStampCertificate, (ByteBuffer) map.get(entry.getKey()), apkSignerInfo);
                X509Certificate x509Certificate = x509CertificateVerifySourceStampCertificate;
                if (apkSignerInfo.containsWarnings() || apkSignerInfo.containsErrors()) {
                    return;
                }
                maxSdkVersion = i3;
                x509CertificateVerifySourceStampCertificate = x509Certificate;
                result = apkSignerInfo;
                minSdkVersion = i2;
            }
        }
        X509Certificate x509Certificate2 = x509CertificateVerifySourceStampCertificate;
        int i4 = minSdkVersion;
        ApkSignerInfo apkSignerInfo2 = result;
        int i5 = maxSdkVersion;
        if (sourceStampBlockData.hasRemaining()) {
            ByteBuffer lengthPrefixedSlice3 = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(sourceStampBlockData);
            ByteBuffer lengthPrefixedSlice4 = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(sourceStampBlockData);
            byte[] bArr = new byte[lengthPrefixedSlice3.remaining()];
            lengthPrefixedSlice3.get(bArr);
            lengthPrefixedSlice3.flip();
            verifySourceStampSignature(bArr, i4, i5, x509Certificate2, lengthPrefixedSlice4, apkSignerInfo2);
            if (apkSignerInfo2.containsErrors() || apkSignerInfo2.containsWarnings()) {
                return;
            }
            parseStampAttributes(lengthPrefixedSlice3, x509Certificate2, apkSignerInfo2);
        }
    }

    private static X509Certificate verifySourceStampCertificate(ByteBuffer sourceStampBlockData, CertificateFactory certFactory, byte[] sourceStampCertificateDigest, ApkSignerInfo result) throws NoSuchAlgorithmException, ApkFormatException {
        byte[] lengthPrefixedByteArray = ApkSigningBlockUtilsLite.readLengthPrefixedByteArray(sourceStampBlockData);
        try {
            GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = new GuaranteedEncodedFormX509Certificate((X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(lengthPrefixedByteArray)), lengthPrefixedByteArray);
            result.certs.add(guaranteedEncodedFormX509Certificate);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(lengthPrefixedByteArray);
            byte[] bArrDigest = messageDigest.digest();
            if (Arrays.equals(sourceStampCertificateDigest, bArrDigest)) {
                return guaranteedEncodedFormX509Certificate;
            }
            result.addWarning(27, ApkSigningBlockUtilsLite.toHex(bArrDigest), ApkSigningBlockUtilsLite.toHex(sourceStampCertificateDigest));
            return null;
        } catch (CertificateException e) {
            result.addWarning(18, e);
            return null;
        }
    }

    private static void verifySourceStampSignature(byte[] data, int minSdkVersion, int maxSdkVersion, X509Certificate sourceStampCertificate, ByteBuffer signatures, ApkSignerInfo result) {
        ArrayList<ApkSupportedSignature> arrayList = new ArrayList(1);
        int i = 0;
        while (signatures.hasRemaining()) {
            i++;
            try {
                ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(signatures);
                int i2 = lengthPrefixedSlice.getInt();
                byte[] lengthPrefixedByteArray = ApkSigningBlockUtilsLite.readLengthPrefixedByteArray(lengthPrefixedSlice);
                SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(i2);
                if (signatureAlgorithmFindById == null) {
                    result.addInfoMessage(19, Integer.valueOf(i2));
                } else {
                    arrayList.add(new ApkSupportedSignature(signatureAlgorithmFindById, lengthPrefixedByteArray));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                result.addWarning(20, Integer.valueOf(i));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            result.addWarning(17, new Object[0]);
            return;
        }
        try {
            for (ApkSupportedSignature apkSupportedSignature : ApkSigningBlockUtilsLite.getSignaturesToVerify(arrayList, minSdkVersion, maxSdkVersion, true)) {
                SignatureAlgorithm signatureAlgorithm = apkSupportedSignature.algorithm;
                String first = signatureAlgorithm.getJcaSignatureAlgorithmAndParams().getFirst();
                AlgorithmParameterSpec second = signatureAlgorithm.getJcaSignatureAlgorithmAndParams().getSecond();
                PublicKey publicKey = sourceStampCertificate.getPublicKey();
                try {
                    Signature signature = Signature.getInstance(first);
                    signature.initVerify(publicKey);
                    if (second != null) {
                        signature.setParameter(second);
                    }
                    signature.update(data);
                    if (!signature.verify(apkSupportedSignature.signature)) {
                        result.addWarning(21, signatureAlgorithm);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    result.addWarning(22, signatureAlgorithm, e);
                    return;
                }
            }
        } catch (NoApkSupportedSignaturesException e2) {
            StringBuilder sb = new StringBuilder();
            for (ApkSupportedSignature apkSupportedSignature2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(apkSupportedSignature2.algorithm);
            }
            result.addWarning(26, sb.toString(), e2);
        }
    }

    private static void parseStampAttributes(ByteBuffer stampAttributeData, X509Certificate sourceStampCertificate, ApkSignerInfo result) throws ApkFormatException {
        ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(stampAttributeData);
        int i = 0;
        while (lengthPrefixedSlice.hasRemaining()) {
            i++;
            try {
                ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(lengthPrefixedSlice);
                int i2 = lengthPrefixedSlice2.getInt();
                byte[] byteArray = ByteBufferUtils.toByteArray(lengthPrefixedSlice2);
                if (i2 == -1654455305) {
                    readStampCertificateLineage(byteArray, sourceStampCertificate, result);
                } else if (i2 == -465807034) {
                    long j = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getLong();
                    if (j > 0) {
                        result.timestamp = j;
                    } else {
                        result.addWarning(38, Long.valueOf(j));
                    }
                } else {
                    result.addInfoMessage(32, Integer.valueOf(i2));
                }
            } catch (ApkFormatException | BufferUnderflowException unused) {
                result.addWarning(31, Integer.valueOf(i));
                return;
            }
        }
    }

    private static void readStampCertificateLineage(byte[] lineageBytes, X509Certificate sourceStampCertificate, ApkSignerInfo result) {
        try {
            List<SourceStampCertificateLineage.SigningCertificateNode> signingCertificateLineage = SourceStampCertificateLineage.readSigningCertificateLineage(ByteBuffer.wrap(lineageBytes).order(ByteOrder.LITTLE_ENDIAN));
            for (int i = 0; i < signingCertificateLineage.size(); i++) {
                result.certificateLineage.add(signingCertificateLineage.get(i).signingCert);
            }
            if (sourceStampCertificate.equals(result.certificateLineage.get(result.certificateLineage.size() - 1))) {
                return;
            }
            result.addWarning(34, new Object[0]);
        } catch (IllegalArgumentException unused) {
            result.addWarning(34, new Object[0]);
        } catch (SecurityException unused2) {
            result.addWarning(35, new Object[0]);
        } catch (Exception unused3) {
            result.addWarning(33, new Object[0]);
        }
    }
}
