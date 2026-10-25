package com.google.android.gms.internal.p002firebaseauthapi;

import com.medicmedia.medilink.MLConst;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.zeroturnaround.zip.commons.IOUtils;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* JADX INFO: loaded from: classes4.dex */
final class zzamn {
    private static final char[] zza;

    static String zza(zzamm zzammVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        zza(zzammVar, sb, 0);
        return sb.toString();
    }

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(MLConst.MLCommon.SEPALETER_SINGLE_TEXT);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(zzann.zza(zzajv.zza((String) obj))).append('\"');
            return;
        }
        if (obj instanceof zzajv) {
            sb.append(": \"").append(zzann.zza((zzajv) obj)).append('\"');
            return;
        }
        if (obj instanceof zzalf) {
            sb.append(" {");
            zza((zzalf) obj, sb, i + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zza(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, "key", entry.getKey());
            zza(sb, i3, "value", entry.getValue());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zza(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ").append(obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020c  */
    /* JADX WARN: Code duplicated, block: B:101:0x020e  */
    /* JADX WARN: Code duplicated, block: B:103:0x021c  */
    /* JADX WARN: Code duplicated, block: B:131:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:65:0x019b  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01db  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ed  */
    private static void zza(zzamm zzammVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        Method method;
        Method method2;
        Object objZza;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzammVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method5 = declaredMethods[i4];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method4.getReturnType().equals(List.class)) {
                    zza(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzalf.zza(method4, zzammVar, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                zza(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzalf.zza(method3, zzammVar, new Object[0]));
            } else if (hashSet.contains("set" + strSubstring)) {
                if (!strSubstring.endsWith("Bytes")) {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has" + strSubstring);
                    if (method != null) {
                        objZza = zzalf.zza(method, zzammVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objZza instanceof Boolean) {
                                if (((Boolean) objZza).booleanValue()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                            } else if (objZza instanceof Integer) {
                                if (((Integer) objZza).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof String) {
                                zEquals = objZza.equals("");
                            } else if (objZza instanceof zzajv) {
                                zEquals = objZza.equals(zzajv.zza);
                            } else if (objZza instanceof zzamm) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) zzalf.zza(method2, zzammVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            zza(sb, i, strSubstring, objZza);
                        }
                    }
                } else if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has" + strSubstring);
                    if (method != null) {
                        objZza = zzalf.zza(method, zzammVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objZza instanceof Boolean) {
                                if (((Boolean) objZza).booleanValue()) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof Integer) {
                                if (((Integer) objZza).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objZza instanceof String) {
                                zEquals = objZza.equals("");
                            } else if (objZza instanceof zzajv) {
                                zEquals = objZza.equals(zzajv.zza);
                            } else if ((objZza instanceof zzamm) ? !((objZza instanceof Enum) && ((Enum) objZza).ordinal() == 0) : objZza != ((zzamm) objZza).zzs()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) zzalf.zza(method2, zzammVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            zza(sb, i, strSubstring, objZza);
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (zzammVar instanceof zzalf.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzalf.zzd) zzammVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzalf zzalfVar = (zzalf) zzammVar;
        if (zzalfVar.zzb != null) {
            zzalfVar.zzb.zza(sb, i);
        }
    }
}
