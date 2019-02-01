package p000a.p001a.p002a.p003a.p013e.p018e;

import java.util.regex.Pattern;

/* compiled from: InetAddressUtils */
/* renamed from: a.a.a.a.e.e.a */
public class C0072a {
    /* renamed from: a */
    private static final Pattern f130a = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    /* renamed from: b */
    private static final Pattern f131b = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    /* renamed from: c */
    private static final Pattern f132c = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    /* renamed from: d */
    private static final Pattern f133d = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    /* renamed from: a */
    public static boolean m197a(String str) {
        return f130a.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m198b(String str) {
        return f132c.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m199c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        if (i > 7 || f133d.matcher(str).matches() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m200d(String str) {
        if (!C0072a.m198b(str)) {
            if (C0072a.m199c(str) == null) {
                return null;
            }
        }
        return true;
    }
}
