package com.android.apksig.internal.pkcs7;

import com.android.apksig.internal.apk.v1.DigestAlgorithm;
import com.android.apksig.internal.asn1.Asn1Class;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1Field;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.asn1.Asn1Type;
import com.android.apksig.internal.oid.OidConstants;
import com.android.apksig.internal.util.Pair;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes3.dex */
@Asn1Class(type = Asn1Type.SEQUENCE)
public class AlgorithmIdentifier {

    @Asn1Field(index = 0, type = Asn1Type.OBJECT_IDENTIFIER)
    public String algorithm;

    @Asn1Field(index = 1, optional = true, type = Asn1Type.ANY)
    public Asn1OpaqueObject parameters;

    public AlgorithmIdentifier() {
    }

    public AlgorithmIdentifier(String algorithmOid, Asn1OpaqueObject parameters) {
        this.algorithm = algorithmOid;
        this.parameters = parameters;
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.pkcs7.AlgorithmIdentifier$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm;

        static {
            int[] iArr = new int[DigestAlgorithm.values().length];
            $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm = iArr;
            try {
                iArr[DigestAlgorithm.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[DigestAlgorithm.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static AlgorithmIdentifier getSignerInfoDigestAlgorithmOid(DigestAlgorithm digestAlgorithm) {
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[digestAlgorithm.ordinal()];
        if (i == 1) {
            return new AlgorithmIdentifier(OidConstants.OID_DIGEST_SHA1, Asn1DerEncoder.ASN1_DER_NULL);
        }
        if (i == 2) {
            return new AlgorithmIdentifier(OidConstants.OID_DIGEST_SHA256, Asn1DerEncoder.ASN1_DER_NULL);
        }
        throw new IllegalArgumentException("Unsupported digest algorithm: " + digestAlgorithm);
    }

    public static Pair<String, AlgorithmIdentifier> getSignerInfoSignatureAlgorithm(PublicKey publicKey, DigestAlgorithm digestAlgorithm, boolean deterministicDsaSigning) throws InvalidKeyException {
        String str;
        AlgorithmIdentifier algorithmIdentifier;
        String algorithm = publicKey.getAlgorithm();
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[digestAlgorithm.ordinal()];
        if (i == 1) {
            str = "SHA1";
        } else if (i == 2) {
            str = "SHA256";
        } else {
            throw new IllegalArgumentException("Unexpected digest algorithm: " + digestAlgorithm);
        }
        if ("RSA".equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return Pair.of(str.concat("withRSA"), new AlgorithmIdentifier("1.2.840.113549.1.1.1", Asn1DerEncoder.ASN1_DER_NULL));
        }
        if ("DSA".equalsIgnoreCase(algorithm)) {
            int i2 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$v1$DigestAlgorithm[digestAlgorithm.ordinal()];
            if (i2 == 1) {
                algorithmIdentifier = new AlgorithmIdentifier(OidConstants.OID_SIG_DSA, Asn1DerEncoder.ASN1_DER_NULL);
            } else if (i2 == 2) {
                algorithmIdentifier = new AlgorithmIdentifier(OidConstants.OID_SIG_SHA256_WITH_DSA, Asn1DerEncoder.ASN1_DER_NULL);
            } else {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + digestAlgorithm);
            }
            return Pair.of(str.concat(deterministicDsaSigning ? "withDetDSA" : "withDSA"), algorithmIdentifier);
        }
        if ("EC".equalsIgnoreCase(algorithm)) {
            return Pair.of(str.concat("withECDSA"), new AlgorithmIdentifier(OidConstants.OID_SIG_EC_PUBLIC_KEY, Asn1DerEncoder.ASN1_DER_NULL));
        }
        throw new InvalidKeyException("Unsupported key algorithm: " + algorithm);
    }

    public static String getJcaSignatureAlgorithm(String digestAlgorithmOid, String signatureAlgorithmOid) throws SignatureException {
        String str;
        String str2 = OidConstants.OID_TO_JCA_SIGNATURE_ALG.get(signatureAlgorithmOid);
        if (str2 != null) {
            return str2;
        }
        if ("1.2.840.113549.1.1.1".equals(signatureAlgorithmOid)) {
            str = "RSA";
        } else if (OidConstants.OID_SIG_DSA.equals(signatureAlgorithmOid)) {
            str = "DSA";
        } else if (OidConstants.OID_SIG_EC_PUBLIC_KEY.equals(signatureAlgorithmOid)) {
            str = "ECDSA";
        } else {
            throw new SignatureException("Unsupported JCA Signature algorithm . Digest algorithm: " + digestAlgorithmOid + ", signature algorithm: " + signatureAlgorithmOid);
        }
        String jcaDigestAlgorithm = getJcaDigestAlgorithm(digestAlgorithmOid);
        if (jcaDigestAlgorithm.startsWith("SHA-")) {
            jcaDigestAlgorithm = "SHA" + jcaDigestAlgorithm.substring("SHA-".length());
        }
        return jcaDigestAlgorithm + "with" + str;
    }

    public static String getJcaDigestAlgorithm(String oid) throws SignatureException {
        String str = OidConstants.OID_TO_JCA_DIGEST_ALG.get(oid);
        if (str != null) {
            return str;
        }
        throw new SignatureException("Unsupported digest algorithm: " + oid);
    }
}
