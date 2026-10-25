package com.facebook.stetho.dumpapp;

/* JADX INFO: loaded from: classes3.dex */
class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b, byte b2) {
        super("Expected '" + ((int) b) + "', got: '" + ((int) b2) + "'");
    }
}
