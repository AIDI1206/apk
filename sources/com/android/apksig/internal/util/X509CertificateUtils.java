package com.android.apksig.internal.util;

import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import com.android.apksig.internal.x509.Certificate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertificateUtils {
    public static final byte[] BEGIN_CERT_HEADER = "-----BEGIN CERTIFICATE-----".getBytes();
    public static final byte[] END_CERT_FOOTER = "-----END CERTIFICATE-----".getBytes();
    private static volatile CertificateFactory sCertFactory;

    private static void buildCertFactory() {
        if (sCertFactory != null) {
            return;
        }
        buildCertFactoryHelper();
    }

    private static synchronized void buildCertFactoryHelper() {
        if (sCertFactory != null) {
            return;
        }
        try {
            sCertFactory = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
        }
    }

    public static X509Certificate generateCertificate(InputStream in) throws CertificateException {
        try {
            return generateCertificate(ByteStreams.toByteArray(in));
        } catch (IOException e) {
            throw new CertificateException("Failed to parse certificate", e);
        }
    }

    public static X509Certificate generateCertificate(byte[] encodedForm) throws CertificateException {
        buildCertFactory();
        return generateCertificate(encodedForm, sCertFactory);
    }

    public static X509Certificate generateCertificate(byte[] encodedForm, CertificateFactory certFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(encodedForm));
            } catch (CertificateException unused) {
                ByteBuffer nextDEREncodedCertificateBlock = getNextDEREncodedCertificateBlock(ByteBuffer.wrap(encodedForm));
                int iPosition = nextDEREncodedCertificateBlock.position();
                X509Certificate x509Certificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(Asn1DerEncoder.encode((Certificate) Asn1BerParser.parse(nextDEREncodedCertificateBlock, Certificate.class))));
                byte[] bArr = new byte[nextDEREncodedCertificateBlock.position() - iPosition];
                nextDEREncodedCertificateBlock.position(iPosition);
                nextDEREncodedCertificateBlock.get(bArr);
                return new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr);
            }
        } catch (Asn1DecodingException | Asn1EncodingException | CertificateException e) {
            throw new CertificateException("Failed to parse certificate", e);
        }
    }

    public static Collection<? extends java.security.cert.Certificate> generateCertificates(InputStream in) throws CertificateException {
        buildCertFactory();
        return generateCertificates(in, sCertFactory);
    }

    public static Collection<? extends java.security.cert.Certificate> generateCertificates(InputStream in, CertificateFactory certFactory) throws CertificateException {
        try {
            byte[] byteArray = ByteStreams.toByteArray(in);
            try {
                try {
                    return certFactory.generateCertificates(new ByteArrayInputStream(byteArray));
                } catch (CertificateException unused) {
                    ArrayList arrayList = new ArrayList(1);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
                    while (byteBufferWrap.hasRemaining()) {
                        ByteBuffer nextDEREncodedCertificateBlock = getNextDEREncodedCertificateBlock(byteBufferWrap);
                        int iPosition = nextDEREncodedCertificateBlock.position();
                        X509Certificate x509Certificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(Asn1DerEncoder.encode((Certificate) Asn1BerParser.parse(nextDEREncodedCertificateBlock, Certificate.class))));
                        byte[] bArr = new byte[nextDEREncodedCertificateBlock.position() - iPosition];
                        nextDEREncodedCertificateBlock.position(iPosition);
                        nextDEREncodedCertificateBlock.get(bArr);
                        arrayList.add(new GuaranteedEncodedFormX509Certificate(x509Certificate, bArr));
                    }
                    return arrayList;
                }
            } catch (Asn1DecodingException | Asn1EncodingException e) {
                throw new CertificateException("Failed to parse certificates", e);
            }
        } catch (IOException e2) {
            throw new CertificateException("Failed to read the input stream", e2);
        }
    }

    private static ByteBuffer getNextDEREncodedCertificateBlock(ByteBuffer certificateBuffer) throws CertificateException {
        char c;
        if (certificateBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        if (certificateBuffer.remaining() < BEGIN_CERT_HEADER.length) {
            return certificateBuffer;
        }
        certificateBuffer.mark();
        int i = 0;
        while (true) {
            byte[] bArr = BEGIN_CERT_HEADER;
            if (i < bArr.length) {
                if (certificateBuffer.get() != bArr[i]) {
                    certificateBuffer.reset();
                    return certificateBuffer;
                }
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                while (certificateBuffer.hasRemaining() && (c = (char) certificateBuffer.get()) != '-') {
                    if (!Character.isWhitespace(c)) {
                        sb.append(c);
                    }
                }
                int i2 = 1;
                while (true) {
                    byte[] bArr2 = END_CERT_FOOTER;
                    if (i2 < bArr2.length) {
                        if (!certificateBuffer.hasRemaining()) {
                            throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
                        }
                        if (certificateBuffer.get() != bArr2[i2]) {
                            throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
                        }
                        i2++;
                    } else {
                        byte[] bArrDecode = Base64.getDecoder().decode(sb.toString());
                        int iPosition = certificateBuffer.position();
                        while (certificateBuffer.hasRemaining() && Character.isWhitespace((char) certificateBuffer.get())) {
                            iPosition++;
                        }
                        certificateBuffer.position(iPosition);
                        return ByteBuffer.wrap(bArrDecode);
                    }
                }
            }
        }
    }
}
