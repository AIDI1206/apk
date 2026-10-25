package com.aheaditec.talsec.security;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 {
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254a;
    public final String b;

    public static final class a {
        public a() {
        }

        public final k2 a(String str, String str2) {
            if (str == null || str2 == null) {
                return null;
            }
            return new k2(str, str2, null);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public k2(String str, String str2) {
        this.f254a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f254a;
    }

    public final String b() {
        return this.b;
    }

    public k2(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f254a = str;
        this.b = str2;
    }
}
