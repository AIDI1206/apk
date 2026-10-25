package com.facebook.stetho.inspector.helper;

import android.view.ViewDebug;

/* JADX INFO: loaded from: classes3.dex */
public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    public static IntegerFormatter getInstance() {
        if (cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (cachedFormatter == null) {
                    cachedFormatter = new IntegerFormatterWithHex();
                }
            }
        }
        return cachedFormatter;
    }

    private IntegerFormatter() {
    }

    public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
        return String.valueOf(num);
    }

    private static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
            super();
        }

        @Override // com.facebook.stetho.inspector.helper.IntegerFormatter
        public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
            if (exportedProperty != null && exportedProperty.formatToHexString()) {
                return "0x" + Integer.toHexString(num.intValue());
            }
            return super.format(num, exportedProperty);
        }
    }
}
