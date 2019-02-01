package com.google.gson.internal.bind;

import com.google.gson.C0482j;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C0997g;
import com.google.gson.C1039k;
import com.google.gson.C1040l;
import com.google.gson.C1041m;
import com.google.gson.C1042o;
import com.google.gson.C1043r;
import com.google.gson.internal.C0469e;
import com.google.gson.internal.bind.i.AnonymousClass23;
import com.google.gson.p038a.C0440c;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters */
/* renamed from: com.google.gson.internal.bind.i */
public final class C0466i {
    /* renamed from: A */
    public static final C0487t<String> f425A = new C10218();
    /* renamed from: B */
    public static final C0487t<BigDecimal> f426B = new C10229();
    /* renamed from: C */
    public static final C0487t<BigInteger> f427C = new C0487t<BigInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2097a(c0446a);
        }

        /* renamed from: a */
        public BigInteger m2097a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return new BigInteger(c0446a.mo1279h());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2099a(C0448c c0448c, BigInteger bigInteger) {
            c0448c.mo1291a((Number) bigInteger);
        }
    };
    /* renamed from: D */
    public static final C0488u f428D = C0466i.m693a(String.class, f425A);
    /* renamed from: E */
    public static final C0487t<StringBuilder> f429E = new C0487t<StringBuilder>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2101a(c0446a);
        }

        /* renamed from: a */
        public StringBuilder m2101a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return new StringBuilder(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2103a(C0448c c0448c, StringBuilder stringBuilder) {
            c0448c.mo1296b(stringBuilder == null ? null : stringBuilder.toString());
        }
    };
    /* renamed from: F */
    public static final C0488u f430F = C0466i.m693a(StringBuilder.class, f429E);
    /* renamed from: G */
    public static final C0487t<StringBuffer> f431G = new C0487t<StringBuffer>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2109a(c0446a);
        }

        /* renamed from: a */
        public StringBuffer m2109a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return new StringBuffer(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2111a(C0448c c0448c, StringBuffer stringBuffer) {
            c0448c.mo1296b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    /* renamed from: H */
    public static final C0488u f432H = C0466i.m693a(StringBuffer.class, f431G);
    /* renamed from: I */
    public static final C0487t<URL> f433I = new C0487t<URL>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2113a(c0446a);
        }

        /* renamed from: a */
        public URL m2113a(C0446a c0446a) {
            URL url = null;
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            c0446a = c0446a.mo1279h();
            if (!"null".equals(c0446a)) {
                url = new URL(c0446a);
            }
            return url;
        }

        /* renamed from: a */
        public void m2115a(C0448c c0448c, URL url) {
            c0448c.mo1296b(url == null ? null : url.toExternalForm());
        }
    };
    /* renamed from: J */
    public static final C0488u f434J = C0466i.m693a(URL.class, f433I);
    /* renamed from: K */
    public static final C0487t<URI> f435K = new C0487t<URI>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2117a(c0446a);
        }

        /* renamed from: a */
        public URI m2117a(C0446a c0446a) {
            URI uri = null;
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                c0446a = c0446a.mo1279h();
                if (!"null".equals(c0446a)) {
                    uri = new URI(c0446a);
                }
                return uri;
            } catch (Throwable e) {
                throw new C1039k(e);
            }
        }

        /* renamed from: a */
        public void m2119a(C0448c c0448c, URI uri) {
            c0448c.mo1296b(uri == null ? null : uri.toASCIIString());
        }
    };
    /* renamed from: L */
    public static final C0488u f436L = C0466i.m693a(URI.class, f435K);
    /* renamed from: M */
    public static final C0487t<InetAddress> f437M = new C0487t<InetAddress>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2121a(c0446a);
        }

        /* renamed from: a */
        public InetAddress m2121a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return InetAddress.getByName(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2123a(C0448c c0448c, InetAddress inetAddress) {
            c0448c.mo1296b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    /* renamed from: N */
    public static final C0488u f438N = C0466i.m695b(InetAddress.class, f437M);
    /* renamed from: O */
    public static final C0487t<UUID> f439O = new C0487t<UUID>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2125a(c0446a);
        }

        /* renamed from: a */
        public UUID m2125a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return UUID.fromString(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2127a(C0448c c0448c, UUID uuid) {
            c0448c.mo1296b(uuid == null ? null : uuid.toString());
        }
    };
    /* renamed from: P */
    public static final C0488u f440P = C0466i.m693a(UUID.class, f439O);
    /* renamed from: Q */
    public static final C0487t<Currency> f441Q = new C0487t<Currency>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2129a(c0446a);
        }

        /* renamed from: a */
        public Currency m2129a(C0446a c0446a) {
            return Currency.getInstance(c0446a.mo1279h());
        }

        /* renamed from: a */
        public void m2131a(C0448c c0448c, Currency currency) {
            c0448c.mo1296b(currency.getCurrencyCode());
        }
    }.m742a();
    /* renamed from: R */
    public static final C0488u f442R = C0466i.m693a(Currency.class, f441Q);
    /* renamed from: S */
    public static final C0488u f443S = new TypeAdapters$26();
    /* renamed from: T */
    public static final C0487t<Calendar> f444T = new C0487t<Calendar>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2133a(c0446a);
        }

        /* renamed from: a */
        public Calendar m2133a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            c0446a.mo1273c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c0446a.mo1277f() != C0447b.END_OBJECT) {
                String g = c0446a.mo1278g();
                int m = c0446a.mo1284m();
                if ("year".equals(g)) {
                    i = m;
                } else if ("month".equals(g)) {
                    i2 = m;
                } else if ("dayOfMonth".equals(g)) {
                    i3 = m;
                } else if ("hourOfDay".equals(g)) {
                    i4 = m;
                } else if ("minute".equals(g)) {
                    i5 = m;
                } else if ("second".equals(g)) {
                    i6 = m;
                }
            }
            c0446a.mo1275d();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: a */
        public void m2135a(C0448c c0448c, Calendar calendar) {
            if (calendar == null) {
                c0448c.mo1301f();
                return;
            }
            c0448c.mo1299d();
            c0448c.mo1292a("year");
            c0448c.mo1289a((long) calendar.get(1));
            c0448c.mo1292a("month");
            c0448c.mo1289a((long) calendar.get(2));
            c0448c.mo1292a("dayOfMonth");
            c0448c.mo1289a((long) calendar.get(5));
            c0448c.mo1292a("hourOfDay");
            c0448c.mo1289a((long) calendar.get(11));
            c0448c.mo1292a("minute");
            c0448c.mo1289a((long) calendar.get(12));
            c0448c.mo1292a("second");
            c0448c.mo1289a((long) calendar.get(13));
            c0448c.mo1300e();
        }
    };
    /* renamed from: U */
    public static final C0488u f445U = C0466i.m696b(Calendar.class, GregorianCalendar.class, f444T);
    /* renamed from: V */
    public static final C0487t<Locale> f446V = new C0487t<Locale>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2141a(c0446a);
        }

        /* renamed from: a */
        public Locale m2141a(C0446a c0446a) {
            String str = null;
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c0446a.mo1279h(), "_");
            c0446a = stringTokenizer.hasMoreElements() != null ? stringTokenizer.nextToken() : null;
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken == null && str == null) {
                return new Locale(c0446a);
            }
            if (str == null) {
                return new Locale(c0446a, nextToken);
            }
            return new Locale(c0446a, nextToken, str);
        }

        /* renamed from: a */
        public void m2143a(C0448c c0448c, Locale locale) {
            c0448c.mo1296b(locale == null ? null : locale.toString());
        }
    };
    /* renamed from: W */
    public static final C0488u f447W = C0466i.m693a(Locale.class, f446V);
    /* renamed from: X */
    public static final C0487t<C0482j> f448X = new C0487t<C0482j>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2145a(c0446a);
        }

        /* renamed from: a */
        public C0482j m2145a(C0446a c0446a) {
            C0482j c0997g;
            switch (c0446a.mo1277f()) {
                case NUMBER:
                    return new C1042o(new C0469e(c0446a.mo1279h()));
                case BOOLEAN:
                    return new C1042o(Boolean.valueOf(c0446a.mo1280i()));
                case STRING:
                    return new C1042o(c0446a.mo1279h());
                case NULL:
                    c0446a.mo1281j();
                    return C1040l.f1849a;
                case BEGIN_ARRAY:
                    c0997g = new C0997g();
                    c0446a.mo1271a();
                    while (c0446a.mo1276e()) {
                        c0997g.m1976a(m2145a(c0446a));
                    }
                    c0446a.mo1272b();
                    return c0997g;
                case BEGIN_OBJECT:
                    c0997g = new C1041m();
                    c0446a.mo1273c();
                    while (c0446a.mo1276e()) {
                        c0997g.m2232a(c0446a.mo1278g(), m2145a(c0446a));
                    }
                    c0446a.mo1275d();
                    return c0997g;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void m2146a(C0448c c0448c, C0482j c0482j) {
            if (c0482j != null) {
                if (!c0482j.m735j()) {
                    if (c0482j.m734i()) {
                        c0482j = c0482j.m738m();
                        if (c0482j.m2245p()) {
                            c0448c.mo1291a(c0482j.mo1261a());
                            return;
                        } else if (c0482j.m2244o()) {
                            c0448c.mo1293a(c0482j.mo1266f());
                            return;
                        } else {
                            c0448c.mo1296b(c0482j.mo1262b());
                            return;
                        }
                    } else if (c0482j.m732g()) {
                        c0448c.mo1295b();
                        c0482j = c0482j.m737l().iterator();
                        while (c0482j.hasNext()) {
                            m2146a(c0448c, (C0482j) c0482j.next());
                        }
                        c0448c.mo1297c();
                        return;
                    } else if (c0482j.m733h()) {
                        c0448c.mo1299d();
                        for (Entry entry : c0482j.m736k().m2233o()) {
                            c0448c.mo1292a((String) entry.getKey());
                            m2146a(c0448c, (C0482j) entry.getValue());
                        }
                        c0448c.mo1300e();
                        return;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Couldn't write ");
                        stringBuilder.append(c0482j.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            c0448c.mo1301f();
        }
    };
    /* renamed from: Y */
    public static final C0488u f449Y = C0466i.m695b(C0482j.class, f448X);
    /* renamed from: Z */
    public static final C0488u f450Z = new TypeAdapters$30();
    /* renamed from: a */
    public static final C0487t<Class> f451a = new C10141().m742a();
    /* renamed from: b */
    public static final C0488u f452b = C0466i.m693a(Class.class, f451a);
    /* renamed from: c */
    public static final C0487t<BitSet> f453c = new C0487t<BitSet>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2105a(c0446a);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public java.util.BitSet m2105a(com.google.gson.p040c.C0446a r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = new java.util.BitSet;
            r0.<init>();
            r7.mo1271a();
            r1 = r7.mo1277f();
            r2 = 0;
            r3 = 0;
        L_0x000e:
            r4 = com.google.gson.p040c.C0447b.END_ARRAY;
            if (r1 == r4) goto L_0x0070;
        L_0x0012:
            r4 = com.google.gson.internal.bind.i.AnonymousClass23.f424a;
            r5 = r1.ordinal();
            r4 = r4[r5];
            r5 = 1;
            switch(r4) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x0035;
                default: goto L_0x001e;
            };
        L_0x001e:
            r7 = new com.google.gson.r;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Invalid bitset value type: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0035:
            r1 = r7.mo1279h();
            r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0042 }
            if (r4 == 0) goto L_0x0040;
        L_0x003f:
            goto L_0x0064;
        L_0x0040:
            r5 = 0;
            goto L_0x0064;
        L_0x0042:
            r7 = new com.google.gson.r;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Error: Expecting: bitset number value (1, 0), Found: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0059:
            r5 = r7.mo1280i();
            goto L_0x0064;
        L_0x005e:
            r1 = r7.mo1284m();
            if (r1 == 0) goto L_0x0040;
        L_0x0064:
            if (r5 == 0) goto L_0x0069;
        L_0x0066:
            r0.set(r3);
        L_0x0069:
            r3 = r3 + 1;
            r1 = r7.mo1277f();
            goto L_0x000e;
        L_0x0070:
            r7.mo1272b();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.i.12.a(com.google.gson.c.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void m2107a(C0448c c0448c, BitSet bitSet) {
            c0448c.mo1295b();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c0448c.mo1289a((long) bitSet.get(i));
            }
            c0448c.mo1297c();
        }
    }.m742a();
    /* renamed from: d */
    public static final C0488u f454d = C0466i.m693a(BitSet.class, f453c);
    /* renamed from: e */
    public static final C0487t<Boolean> f455e = new C0487t<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2149a(c0446a);
        }

        /* renamed from: a */
        public Boolean m2149a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            } else if (c0446a.mo1277f() == C0447b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(c0446a.mo1279h()));
            } else {
                return Boolean.valueOf(c0446a.mo1280i());
            }
        }

        /* renamed from: a */
        public void m2150a(C0448c c0448c, Boolean bool) {
            c0448c.mo1290a(bool);
        }
    };
    /* renamed from: f */
    public static final C0487t<Boolean> f456f = new C0487t<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2153a(c0446a);
        }

        /* renamed from: a */
        public Boolean m2153a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Boolean.valueOf(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2154a(C0448c c0448c, Boolean bool) {
            c0448c.mo1296b(bool == null ? "null" : bool.toString());
        }
    };
    /* renamed from: g */
    public static final C0488u f457g = C0466i.m694a(Boolean.TYPE, Boolean.class, f455e);
    /* renamed from: h */
    public static final C0487t<Number> f458h = new C0487t<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2157a(c0446a);
        }

        /* renamed from: a */
        public Number m2157a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return Byte.valueOf((byte) c0446a.mo1284m());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2158a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    };
    /* renamed from: i */
    public static final C0488u f459i = C0466i.m694a(Byte.TYPE, Byte.class, f458h);
    /* renamed from: j */
    public static final C0487t<Number> f460j = new C0487t<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2161a(c0446a);
        }

        /* renamed from: a */
        public Number m2161a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return Short.valueOf((short) c0446a.mo1284m());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2162a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    };
    /* renamed from: k */
    public static final C0488u f461k = C0466i.m694a(Short.TYPE, Short.class, f460j);
    /* renamed from: l */
    public static final C0487t<Number> f462l = new C0487t<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2165a(c0446a);
        }

        /* renamed from: a */
        public Number m2165a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return Integer.valueOf(c0446a.mo1284m());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2166a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    };
    /* renamed from: m */
    public static final C0488u f463m = C0466i.m694a(Integer.TYPE, Integer.class, f462l);
    /* renamed from: n */
    public static final C0487t<AtomicInteger> f464n = new C0487t<AtomicInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2169a(c0446a);
        }

        /* renamed from: a */
        public AtomicInteger m2169a(C0446a c0446a) {
            try {
                return new AtomicInteger(c0446a.mo1284m());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2171a(C0448c c0448c, AtomicInteger atomicInteger) {
            c0448c.mo1289a((long) atomicInteger.get());
        }
    }.m742a();
    /* renamed from: o */
    public static final C0488u f465o = C0466i.m693a(AtomicInteger.class, f464n);
    /* renamed from: p */
    public static final C0487t<AtomicBoolean> f466p = new C0487t<AtomicBoolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2173a(c0446a);
        }

        /* renamed from: a */
        public AtomicBoolean m2173a(C0446a c0446a) {
            return new AtomicBoolean(c0446a.mo1280i());
        }

        /* renamed from: a */
        public void m2175a(C0448c c0448c, AtomicBoolean atomicBoolean) {
            c0448c.mo1293a(atomicBoolean.get());
        }
    }.m742a();
    /* renamed from: q */
    public static final C0488u f467q = C0466i.m693a(AtomicBoolean.class, f466p);
    /* renamed from: r */
    public static final C0487t<AtomicIntegerArray> f468r = new C10152().m742a();
    /* renamed from: s */
    public static final C0488u f469s = C0466i.m693a(AtomicIntegerArray.class, f468r);
    /* renamed from: t */
    public static final C0487t<Number> f470t = new C10163();
    /* renamed from: u */
    public static final C0487t<Number> f471u = new C10174();
    /* renamed from: v */
    public static final C0487t<Number> f472v = new C10185();
    /* renamed from: w */
    public static final C0487t<Number> f473w = new C10196();
    /* renamed from: x */
    public static final C0488u f474x = C0466i.m693a(Number.class, f473w);
    /* renamed from: y */
    public static final C0487t<Character> f475y = new C10207();
    /* renamed from: z */
    public static final C0488u f476z = C0466i.m694a(Character.TYPE, Character.class, f475y);

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$1 */
    static class C10141 extends C0487t<Class> {
        C10141() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2137a(c0446a);
        }

        /* renamed from: a */
        public void m2138a(C0448c c0448c, Class cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to serialize java.lang.Class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        /* renamed from: a */
        public Class m2137a(C0446a c0446a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$2 */
    static class C10152 extends C0487t<AtomicIntegerArray> {
        C10152() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2177a(c0446a);
        }

        /* renamed from: a */
        public AtomicIntegerArray m2177a(C0446a c0446a) {
            List arrayList = new ArrayList();
            c0446a.mo1271a();
            while (c0446a.mo1276e()) {
                try {
                    arrayList.add(Integer.valueOf(c0446a.mo1284m()));
                } catch (Throwable e) {
                    throw new C1043r(e);
                }
            }
            c0446a.mo1272b();
            c0446a = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(c0446a);
            for (int i = 0; i < c0446a; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void m2179a(C0448c c0448c, AtomicIntegerArray atomicIntegerArray) {
            c0448c.mo1295b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c0448c.mo1289a((long) atomicIntegerArray.get(i));
            }
            c0448c.mo1297c();
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$3 */
    static class C10163 extends C0487t<Number> {
        C10163() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2181a(c0446a);
        }

        /* renamed from: a */
        public Number m2181a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return Long.valueOf(c0446a.mo1283l());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2182a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$4 */
    static class C10174 extends C0487t<Number> {
        C10174() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2185a(c0446a);
        }

        /* renamed from: a */
        public Number m2185a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Float.valueOf((float) c0446a.mo1282k());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2186a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$5 */
    static class C10185 extends C0487t<Number> {
        C10185() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2189a(c0446a);
        }

        /* renamed from: a */
        public Number m2189a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Double.valueOf(c0446a.mo1282k());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2190a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$6 */
    static class C10196 extends C0487t<Number> {
        C10196() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2193a(c0446a);
        }

        /* renamed from: a */
        public Number m2193a(C0446a c0446a) {
            C0447b f = c0446a.mo1277f();
            int i = AnonymousClass23.f424a[f.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        c0446a.mo1281j();
                        return null;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expecting number, got: ");
                        stringBuilder.append(f);
                        throw new C1043r(stringBuilder.toString());
                }
            }
            return new C0469e(c0446a.mo1279h());
        }

        /* renamed from: a */
        public void m2194a(C0448c c0448c, Number number) {
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$7 */
    static class C10207 extends C0487t<Character> {
        C10207() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2197a(c0446a);
        }

        /* renamed from: a */
        public Character m2197a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            c0446a = c0446a.mo1279h();
            if (c0446a.length() == 1) {
                return Character.valueOf(c0446a.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting character, got: ");
            stringBuilder.append(c0446a);
            throw new C1043r(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m2198a(C0448c c0448c, Character ch) {
            c0448c.mo1296b(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$8 */
    static class C10218 extends C0487t<String> {
        C10218() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2201a(c0446a);
        }

        /* renamed from: a */
        public String m2201a(C0446a c0446a) {
            C0447b f = c0446a.mo1277f();
            if (f == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            } else if (f == C0447b.BOOLEAN) {
                return Boolean.toString(c0446a.mo1280i());
            } else {
                return c0446a.mo1279h();
            }
        }

        /* renamed from: a */
        public void m2203a(C0448c c0448c, String str) {
            c0448c.mo1296b(str);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$9 */
    static class C10229 extends C0487t<BigDecimal> {
        C10229() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2205a(c0446a);
        }

        /* renamed from: a */
        public BigDecimal m2205a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            try {
                return new BigDecimal(c0446a.mo1279h());
            } catch (Throwable e) {
                throw new C1043r(e);
            }
        }

        /* renamed from: a */
        public void m2207a(C0448c c0448c, BigDecimal bigDecimal) {
            c0448c.mo1291a((Number) bigDecimal);
        }
    }

    /* compiled from: TypeAdapters */
    /* renamed from: com.google.gson.internal.bind.i$a */
    private static final class C1023a<T extends Enum<T>> extends C0487t<T> {
        /* renamed from: a */
        private final Map<String, T> f1817a = new HashMap();
        /* renamed from: b */
        private final Map<T, String> f1818b = new HashMap();

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2209a(c0446a);
        }

        public C1023a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    Object name = enumR.name();
                    C0440c c0440c = (C0440c) cls.getField(name).getAnnotation(C0440c.class);
                    if (c0440c != null) {
                        name = c0440c.m563a();
                        for (Object put : c0440c.m564b()) {
                            this.f1817a.put(put, enumR);
                        }
                    }
                    this.f1817a.put(name, enumR);
                    this.f1818b.put(enumR, name);
                }
            } catch (Class<T> cls2) {
                throw new AssertionError(cls2);
            }
        }

        /* renamed from: a */
        public T m2209a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return (Enum) this.f1817a.get(c0446a.mo1279h());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m2210a(C0448c c0448c, T t) {
            c0448c.mo1296b(t == null ? null : (String) this.f1818b.get(t));
        }
    }

    /* renamed from: a */
    public static <TT> C0488u m693a(Class<TT> cls, C0487t<TT> c0487t) {
        return new TypeAdapters$32(cls, c0487t);
    }

    /* renamed from: a */
    public static <TT> C0488u m694a(Class<TT> cls, Class<TT> cls2, C0487t<? super TT> c0487t) {
        return new TypeAdapters$33(cls, cls2, c0487t);
    }

    /* renamed from: b */
    public static <TT> C0488u m696b(Class<TT> cls, Class<? extends TT> cls2, C0487t<? super TT> c0487t) {
        return new TypeAdapters$34(cls, cls2, c0487t);
    }

    /* renamed from: b */
    public static <T1> C0488u m695b(Class<T1> cls, C0487t<T1> c0487t) {
        return new TypeAdapters$35(cls, c0487t);
    }
}
