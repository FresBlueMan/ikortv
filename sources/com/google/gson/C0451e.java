package com.google.gson;

import com.google.gson.internal.C0467c;
import com.google.gson.internal.C0477h;
import com.google.gson.internal.C0480i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C0466i;
import com.google.gson.internal.bind.C1006a;
import com.google.gson.internal.bind.C1007b;
import com.google.gson.internal.bind.C1010e;
import com.google.gson.internal.bind.C1011f;
import com.google.gson.internal.bind.C1012g;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson */
/* renamed from: com.google.gson.e */
public final class C0451e {
    /* renamed from: a */
    private static final C0444a<?> f399a = C0444a.m571b(Object.class);
    /* renamed from: b */
    private final ThreadLocal<Map<C0444a<?>, C0996a<?>>> f400b;
    /* renamed from: c */
    private final Map<C0444a<?>, C0487t<?>> f401c;
    /* renamed from: d */
    private final List<C0488u> f402d;
    /* renamed from: e */
    private final C0467c f403e;
    /* renamed from: f */
    private final Excluder f404f;
    /* renamed from: g */
    private final C0450d f405g;
    /* renamed from: h */
    private final boolean f406h;
    /* renamed from: i */
    private final boolean f407i;
    /* renamed from: j */
    private final boolean f408j;
    /* renamed from: k */
    private final boolean f409k;
    /* renamed from: l */
    private final boolean f410l;
    /* renamed from: m */
    private final JsonAdapterAnnotationTypeAdapterFactory f411m;

    /* compiled from: Gson */
    /* renamed from: com.google.gson.e$1 */
    class C09911 extends C0487t<Number> {
        /* renamed from: a */
        final /* synthetic */ C0451e f1720a;

        C09911(C0451e c0451e) {
            this.f1720a = c0451e;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m1952a(c0446a);
        }

        /* renamed from: a */
        public Double m1952a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Double.valueOf(c0446a.mo1282k());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m1953a(C0448c c0448c, Number number) {
            if (number == null) {
                c0448c.mo1301f();
                return;
            }
            C0451e.m641a(number.doubleValue());
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: Gson */
    /* renamed from: com.google.gson.e$2 */
    class C09922 extends C0487t<Number> {
        /* renamed from: a */
        final /* synthetic */ C0451e f1721a;

        C09922(C0451e c0451e) {
            this.f1721a = c0451e;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m1956a(c0446a);
        }

        /* renamed from: a */
        public Float m1956a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Float.valueOf((float) c0446a.mo1282k());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m1957a(C0448c c0448c, Number number) {
            if (number == null) {
                c0448c.mo1301f();
                return;
            }
            C0451e.m641a((double) number.floatValue());
            c0448c.mo1291a(number);
        }
    }

    /* compiled from: Gson */
    /* renamed from: com.google.gson.e$3 */
    static class C09933 extends C0487t<Number> {
        C09933() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m1960a(c0446a);
        }

        /* renamed from: a */
        public Number m1960a(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return Long.valueOf(c0446a.mo1283l());
            }
            c0446a.mo1281j();
            return null;
        }

        /* renamed from: a */
        public void m1961a(C0448c c0448c, Number number) {
            if (number == null) {
                c0448c.mo1301f();
            } else {
                c0448c.mo1296b(number.toString());
            }
        }
    }

    /* compiled from: Gson */
    /* renamed from: com.google.gson.e$a */
    static class C0996a<T> extends C0487t<T> {
        /* renamed from: a */
        private C0487t<T> f1724a;

        C0996a() {
        }

        /* renamed from: a */
        public void m1973a(C0487t<T> c0487t) {
            if (this.f1724a == null) {
                this.f1724a = c0487t;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public T mo1260b(C0446a c0446a) {
            if (this.f1724a != null) {
                return this.f1724a.mo1260b(c0446a);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo1259a(C0448c c0448c, T t) {
            if (this.f1724a != null) {
                this.f1724a.mo1259a(c0448c, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C0451e() {
        this(Excluder.f1732a, C0990c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C0486s.DEFAULT, Collections.emptyList());
    }

    C0451e(Excluder excluder, C0450d c0450d, Map<Type, C0452f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C0486s c0486s, List<C0488u> list) {
        this.f400b = new ThreadLocal();
        this.f401c = new ConcurrentHashMap();
        this.f403e = new C0467c(map);
        this.f404f = excluder;
        this.f405g = c0450d;
        this.f406h = z;
        this.f408j = z3;
        this.f407i = z4;
        this.f409k = z5;
        this.f410l = z6;
        map = new ArrayList();
        map.add(C0466i.f449Y);
        map.add(C1010e.f1808a);
        map.add(excluder);
        map.addAll(list);
        map.add(C0466i.f428D);
        map.add(C0466i.f463m);
        map.add(C0466i.f457g);
        map.add(C0466i.f459i);
        map.add(C0466i.f461k);
        C0487t a = C0451e.m638a(c0486s);
        map.add(C0466i.m694a(Long.TYPE, Long.class, a));
        map.add(C0466i.m694a(Double.TYPE, Double.class, m640a(z7)));
        map.add(C0466i.m694a(Float.TYPE, Float.class, m644b(z7)));
        map.add(C0466i.f474x);
        map.add(C0466i.f465o);
        map.add(C0466i.f467q);
        map.add(C0466i.m693a(AtomicLong.class, C0451e.m639a(a)));
        map.add(C0466i.m693a(AtomicLongArray.class, C0451e.m643b(a)));
        map.add(C0466i.f469s);
        map.add(C0466i.f476z);
        map.add(C0466i.f430F);
        map.add(C0466i.f432H);
        map.add(C0466i.m693a(BigDecimal.class, C0466i.f426B));
        map.add(C0466i.m693a(BigInteger.class, C0466i.f427C));
        map.add(C0466i.f434J);
        map.add(C0466i.f436L);
        map.add(C0466i.f440P);
        map.add(C0466i.f442R);
        map.add(C0466i.f447W);
        map.add(C0466i.f438N);
        map.add(C0466i.f454d);
        map.add(C1007b.f1794a);
        map.add(C0466i.f445U);
        map.add(C1012g.f1812a);
        map.add(C1011f.f1810a);
        map.add(C0466i.f443S);
        map.add(C1006a.f1791a);
        map.add(C0466i.f452b);
        map.add(new CollectionTypeAdapterFactory(this.f403e));
        map.add(new MapTypeAdapterFactory(this.f403e, z2));
        this.f411m = new JsonAdapterAnnotationTypeAdapterFactory(this.f403e);
        map.add(this.f411m);
        map.add(C0466i.f450Z);
        map.add(new ReflectiveTypeAdapterFactory(this.f403e, c0450d, excluder, this.f411m));
        this.f402d = Collections.unmodifiableList(map);
    }

    /* renamed from: a */
    private C0487t<Number> m640a(boolean z) {
        if (z) {
            return C0466i.f472v;
        }
        return new C09911(this);
    }

    /* renamed from: b */
    private C0487t<Number> m644b(boolean z) {
        if (z) {
            return C0466i.f471u;
        }
        return new C09922(this);
    }

    /* renamed from: a */
    static void m641a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static C0487t<Number> m638a(C0486s c0486s) {
        if (c0486s == C0486s.DEFAULT) {
            return C0466i.f470t;
        }
        return new C09933();
    }

    /* renamed from: a */
    private static C0487t<AtomicLong> m639a(final C0487t<Number> c0487t) {
        return new C0487t<AtomicLong>() {
            /* renamed from: b */
            public /* synthetic */ Object mo1260b(C0446a c0446a) {
                return m1964a(c0446a);
            }

            /* renamed from: a */
            public void m1966a(C0448c c0448c, AtomicLong atomicLong) {
                c0487t.mo1259a(c0448c, Long.valueOf(atomicLong.get()));
            }

            /* renamed from: a */
            public AtomicLong m1964a(C0446a c0446a) {
                return new AtomicLong(((Number) c0487t.mo1260b(c0446a)).longValue());
            }
        }.m742a();
    }

    /* renamed from: b */
    private static C0487t<AtomicLongArray> m643b(final C0487t<Number> c0487t) {
        return new C0487t<AtomicLongArray>() {
            /* renamed from: b */
            public /* synthetic */ Object mo1260b(C0446a c0446a) {
                return m1968a(c0446a);
            }

            /* renamed from: a */
            public void m1970a(C0448c c0448c, AtomicLongArray atomicLongArray) {
                c0448c.mo1295b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    c0487t.mo1259a(c0448c, Long.valueOf(atomicLongArray.get(i)));
                }
                c0448c.mo1297c();
            }

            /* renamed from: a */
            public AtomicLongArray m1968a(C0446a c0446a) {
                List arrayList = new ArrayList();
                c0446a.mo1271a();
                while (c0446a.mo1276e()) {
                    arrayList.add(Long.valueOf(((Number) c0487t.mo1260b(c0446a)).longValue()));
                }
                c0446a.mo1272b();
                c0446a = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(c0446a);
                for (int i = 0; i < c0446a; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.m742a();
    }

    /* renamed from: a */
    public <T> C0487t<T> m647a(C0444a<T> c0444a) {
        C0487t<T> c0487t = (C0487t) this.f401c.get(c0444a == null ? f399a : c0444a);
        if (c0487t != null) {
            return c0487t;
        }
        Map map = (Map) this.f400b.get();
        Object obj = null;
        if (map == null) {
            map = new HashMap();
            this.f400b.set(map);
            obj = 1;
        }
        C0996a c0996a = (C0996a) map.get(c0444a);
        if (c0996a != null) {
            return c0996a;
        }
        try {
            C0487t<T> hasNext;
            c0996a = new C0996a();
            map.put(c0444a, c0996a);
            Iterator it = this.f402d.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != null) {
                    hasNext = ((C0488u) it.next()).mo1267a(this, c0444a);
                    if (hasNext != null) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GSON cannot handle ");
                stringBuilder.append(c0444a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            c0996a.m1973a(hasNext);
            this.f401c.put(c0444a, hasNext);
            return hasNext;
        } finally {
            map.remove(c0444a);
            if (obj != null) {
                this.f400b.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C0487t<T> m648a(C0488u c0488u, C0444a<T> c0444a) {
        if (!this.f402d.contains(c0488u)) {
            c0488u = this.f411m;
        }
        Object obj = null;
        for (C0488u c0488u2 : this.f402d) {
            if (obj != null) {
                C0487t<T> a = c0488u2.mo1267a(this, c0444a);
                if (a != null) {
                    return a;
                }
            } else if (c0488u2 == c0488u) {
                obj = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(c0444a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public <T> C0487t<T> m649a(Class<T> cls) {
        return m647a(C0444a.m571b(cls));
    }

    /* renamed from: a */
    public String m655a(Object obj) {
        if (obj == null) {
            return m654a(C1040l.f1849a);
        }
        return m656a(obj, obj.getClass());
    }

    /* renamed from: a */
    public String m656a(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        m660a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m660a(Object obj, Type type, Appendable appendable) {
        try {
            m659a(obj, type, m646a(C0480i.m721a(appendable)));
        } catch (Throwable e) {
            throw new C1039k(e);
        }
    }

    /* renamed from: a */
    public void m659a(Object obj, Type type, C0448c c0448c) {
        type = m647a(C0444a.m569a(type));
        boolean g = c0448c.m634g();
        c0448c.m626b(true);
        boolean h = c0448c.m635h();
        c0448c.m629c(this.f407i);
        boolean i = c0448c.m636i();
        c0448c.m631d(this.f406h);
        try {
            type.mo1259a(c0448c, obj);
            c0448c.m626b(g);
            c0448c.m629c(h);
            c0448c.m631d(i);
        } catch (Throwable e) {
            throw new C1039k(e);
        } catch (Throwable th) {
            c0448c.m626b(g);
            c0448c.m629c(h);
            c0448c.m631d(i);
        }
    }

    /* renamed from: a */
    public String m654a(C0482j c0482j) {
        Appendable stringWriter = new StringWriter();
        m658a(c0482j, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m658a(C0482j c0482j, Appendable appendable) {
        try {
            m657a(c0482j, m646a(C0480i.m721a(appendable)));
        } catch (Throwable e) {
            throw new C1039k(e);
        }
    }

    /* renamed from: a */
    public C0448c m646a(Writer writer) {
        if (this.f408j) {
            writer.write(")]}'\n");
        }
        C0448c c0448c = new C0448c(writer);
        if (this.f409k != null) {
            c0448c.m628c("  ");
        }
        c0448c.m631d(this.f406h);
        return c0448c;
    }

    /* renamed from: a */
    public C0446a m645a(Reader reader) {
        C0446a c0446a = new C0446a(reader);
        c0446a.m591a(this.f410l);
        return c0446a;
    }

    /* renamed from: a */
    public void m657a(C0482j c0482j, C0448c c0448c) {
        boolean g = c0448c.m634g();
        c0448c.m626b(true);
        boolean h = c0448c.m635h();
        c0448c.m629c(this.f407i);
        boolean i = c0448c.m636i();
        c0448c.m631d(this.f406h);
        try {
            C0480i.m722a(c0482j, c0448c);
            c0448c.m626b(g);
            c0448c.m629c(h);
            c0448c.m631d(i);
        } catch (Throwable e) {
            throw new C1039k(e);
        } catch (Throwable th) {
            c0448c.m626b(g);
            c0448c.m629c(h);
            c0448c.m631d(i);
        }
    }

    /* renamed from: a */
    public <T> T m652a(String str, Class<T> cls) {
        return C0477h.m717a((Class) cls).cast(m653a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m653a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return m651a(new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T m651a(Reader reader, Type type) {
        C0446a a = m645a(reader);
        Object a2 = m650a(a, type);
        C0451e.m642a(a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m642a(Object obj, C0446a c0446a) {
        if (obj != null) {
            try {
                if (c0446a.mo1277f() != C0447b.END_DOCUMENT) {
                    throw new C1039k("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new C1043r(e);
            } catch (Throwable e2) {
                throw new C1039k(e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T m650a(C0446a c0446a, Type type) {
        boolean q = c0446a.m606q();
        boolean z = true;
        c0446a.m591a(true);
        try {
            c0446a.mo1277f();
            z = false;
            type = m647a(C0444a.m569a(type)).mo1260b(c0446a);
            c0446a.m591a(q);
            return type;
        } catch (Throwable e) {
            if (z) {
                c0446a.m591a(q);
                return null;
            }
            throw new C1043r(e);
        } catch (Throwable e2) {
            throw new C1043r(e2);
        } catch (Throwable e22) {
            throw new C1043r(e22);
        } catch (Throwable th) {
            c0446a.m591a(q);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.f406h);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.f402d);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.f403e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
