package org.zeroturnaround.zip;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
class ZTZipReflectionUtil {
    private ZTZipReflectionUtil() {
    }

    static <T> Class<? extends T> getClassForName(String str, Class<T> cls) {
        try {
            return (Class<? extends T>) Class.forName(str).asSubclass(cls);
        } catch (ClassCastException e) {
            throw new ZipException(e);
        } catch (ClassNotFoundException e2) {
            throw new ZipException(e2);
        }
    }

    static Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new ZipException(e);
        }
    }

    static Object invoke(Method method, Object obj, Object... objArr) throws ZipException {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new ZipException(e);
        } catch (IllegalArgumentException e2) {
            throw new ZipException(e2);
        } catch (InvocationTargetException e3) {
            throw new ZipException(e3);
        }
    }
}
