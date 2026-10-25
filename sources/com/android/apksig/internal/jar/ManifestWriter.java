package com.android.apksig.internal.jar;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ManifestWriter {
    private static final byte[] CRLF = {Ascii.CR, 10};
    private static final int MAX_LINE_LENGTH = 70;

    private ManifestWriter() {
    }

    public static void writeMainSection(OutputStream out, Attributes attributes) throws IOException {
        String value = attributes.getValue(Attributes.Name.MANIFEST_VERSION);
        if (value == null) {
            throw new IllegalArgumentException("Mandatory " + Attributes.Name.MANIFEST_VERSION + " attribute missing");
        }
        writeAttribute(out, Attributes.Name.MANIFEST_VERSION, value);
        if (attributes.size() > 1) {
            SortedMap<String, String> attributesSortedByName = getAttributesSortedByName(attributes);
            attributesSortedByName.remove(Attributes.Name.MANIFEST_VERSION.toString());
            writeAttributes(out, attributesSortedByName);
        }
        writeSectionDelimiter(out);
    }

    public static void writeIndividualSection(OutputStream out, String name, Attributes attributes) throws IOException {
        writeAttribute(out, "Name", name);
        if (!attributes.isEmpty()) {
            writeAttributes(out, getAttributesSortedByName(attributes));
        }
        writeSectionDelimiter(out);
    }

    static void writeSectionDelimiter(OutputStream out) throws IOException {
        out.write(CRLF);
    }

    static void writeAttribute(OutputStream out, Attributes.Name name, String value) throws IOException {
        writeAttribute(out, name.toString(), value);
    }

    private static void writeAttribute(OutputStream out, String name, String value) throws IOException {
        writeLine(out, name + ": " + value);
    }

    private static void writeLine(OutputStream out, String line) throws IOException {
        int iMin;
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        boolean z = true;
        int i = 0;
        while (length > 0) {
            if (z) {
                iMin = Math.min(length, MAX_LINE_LENGTH);
            } else {
                out.write(CRLF);
                out.write(32);
                iMin = Math.min(length, 69);
            }
            out.write(bytes, i, iMin);
            i += iMin;
            length -= iMin;
            z = false;
        }
        out.write(CRLF);
    }

    static SortedMap<String, String> getAttributesSortedByName(Attributes attributes) {
        Set<Map.Entry<Object, Object>> setEntrySet = attributes.entrySet();
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Object, Object> entry : setEntrySet) {
            treeMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return treeMap;
    }

    static void writeAttributes(OutputStream out, SortedMap<String, String> attributesSortedByName) throws IOException {
        for (Map.Entry<String, String> entry : attributesSortedByName.entrySet()) {
            writeAttribute(out, entry.getKey(), entry.getValue());
        }
    }
}
