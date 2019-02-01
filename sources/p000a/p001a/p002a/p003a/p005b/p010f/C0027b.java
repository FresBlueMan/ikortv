package p000a.p001a.p002a.p003a.p005b.p010f;

import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: DateUtils */
/* renamed from: a.a.a.a.b.f.b */
public final class C0027b {
    /* renamed from: a */
    public static final TimeZone f71a = TimeZone.getTimeZone("GMT");
    /* renamed from: b */
    private static final String[] f72b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    /* renamed from: c */
    private static final Date f73c;

    /* compiled from: DateUtils */
    /* renamed from: a.a.a.a.b.f.b$a */
    static final class C0026a {
        /* renamed from: a */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f70a = new C00251();

        /* compiled from: DateUtils */
        /* renamed from: a.a.a.a.b.f.b$a$1 */
        static class C00251 extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
            C00251() {
            }

            protected /* synthetic */ Object initialValue() {
                return m85a();
            }

            /* renamed from: a */
            protected SoftReference<Map<String, SimpleDateFormat>> m85a() {
                return new SoftReference(new HashMap());
            }
        }

        /* renamed from: a */
        public static SimpleDateFormat m86a(String str) {
            Map map = (Map) ((SoftReference) f70a.get()).get();
            if (map == null) {
                map = new HashMap();
                f70a.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat);
            return simpleDateFormat;
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f71a);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f73c = instance.getTime();
    }

    /* renamed from: a */
    public static Date m87a(String str, String[] strArr) {
        return C0027b.m88a(str, strArr, null);
    }

    /* renamed from: a */
    public static Date m88a(String str, String[] strArr, Date date) {
        C0160a.m478a((Object) str, "Date value");
        if (strArr == null) {
            strArr = f72b;
        }
        if (date == null) {
            date = f73c;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String a : r6) {
            SimpleDateFormat a2 = C0026a.m86a(a);
            a2.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = a2.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }
}
