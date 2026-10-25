package com.auth0.android.jwt;

import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface Claim {
    <T> T[] asArray(Class<T> cls) throws DecodeException;

    Boolean asBoolean();

    Date asDate();

    Double asDouble();

    Integer asInt();

    <T> List<T> asList(Class<T> cls) throws DecodeException;

    String asString();
}
