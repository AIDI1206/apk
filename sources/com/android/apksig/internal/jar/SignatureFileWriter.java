package com.android.apksig.internal.jar;

import java.io.IOException;
import java.io.OutputStream;
import java.util.SortedMap;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SignatureFileWriter {
    private SignatureFileWriter() {
    }

    public static void writeMainSection(OutputStream out, Attributes attributes) throws IOException {
        String value = attributes.getValue(Attributes.Name.SIGNATURE_VERSION);
        if (value == null) {
            throw new IllegalArgumentException("Mandatory " + Attributes.Name.SIGNATURE_VERSION + " attribute missing");
        }
        ManifestWriter.writeAttribute(out, Attributes.Name.SIGNATURE_VERSION, value);
        if (attributes.size() > 1) {
            SortedMap<String, String> attributesSortedByName = ManifestWriter.getAttributesSortedByName(attributes);
            attributesSortedByName.remove(Attributes.Name.SIGNATURE_VERSION.toString());
            ManifestWriter.writeAttributes(out, attributesSortedByName);
        }
        writeSectionDelimiter(out);
    }

    public static void writeIndividualSection(OutputStream out, String name, Attributes attributes) throws IOException {
        ManifestWriter.writeIndividualSection(out, name, attributes);
    }

    public static void writeSectionDelimiter(OutputStream out) throws IOException {
        ManifestWriter.writeSectionDelimiter(out);
    }
}
