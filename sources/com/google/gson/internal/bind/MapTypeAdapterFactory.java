package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0482j;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C1043r;
import com.google.gson.internal.C0459b;
import com.google.gson.internal.C0467c;
import com.google.gson.internal.C0468d;
import com.google.gson.internal.C0476g;
import com.google.gson.internal.C0480i;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class MapTypeAdapterFactory implements C0488u {
    /* renamed from: a */
    final boolean f1747a;
    /* renamed from: b */
    private final C0467c f1748b;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    private final class C1000a<K, V> extends C0487t<Map<K, V>> {
        /* renamed from: a */
        final /* synthetic */ MapTypeAdapterFactory f1743a;
        /* renamed from: b */
        private final C0487t<K> f1744b;
        /* renamed from: c */
        private final C0487t<V> f1745c;
        /* renamed from: d */
        private final C0476g<? extends Map<K, V>> f1746d;

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m2005a(c0446a);
        }

        public C1000a(MapTypeAdapterFactory mapTypeAdapterFactory, C0451e c0451e, Type type, C0487t<K> c0487t, Type type2, C0487t<V> c0487t2, C0476g<? extends Map<K, V>> c0476g) {
            this.f1743a = mapTypeAdapterFactory;
            this.f1744b = new C1013h(c0451e, c0487t, type);
            this.f1745c = new C1013h(c0451e, c0487t2, type2);
            this.f1746d = c0476g;
        }

        /* renamed from: a */
        public Map<K, V> m2005a(C0446a c0446a) {
            C0447b f = c0446a.mo1277f();
            if (f == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            Map<K, V> map = (Map) this.f1746d.mo1303a();
            Object b;
            StringBuilder stringBuilder;
            if (f == C0447b.BEGIN_ARRAY) {
                c0446a.mo1271a();
                while (c0446a.mo1276e()) {
                    c0446a.mo1271a();
                    b = this.f1744b.mo1260b(c0446a);
                    if (map.put(b, this.f1745c.mo1260b(c0446a)) == null) {
                        c0446a.mo1272b();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new C1043r(stringBuilder.toString());
                    }
                }
                c0446a.mo1272b();
            } else {
                c0446a.mo1273c();
                while (c0446a.mo1276e()) {
                    C0468d.f478a.mo1258a(c0446a);
                    b = this.f1744b.mo1260b(c0446a);
                    if (map.put(b, this.f1745c.mo1260b(c0446a)) != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new C1043r(stringBuilder.toString());
                    }
                }
                c0446a.mo1275d();
            }
            return map;
        }

        /* renamed from: a */
        public void m2007a(C0448c c0448c, Map<K, V> map) {
            if (map == null) {
                c0448c.mo1301f();
            } else if (this.f1743a.f1747a) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                map = map.entrySet().iterator();
                int i = 0;
                int i2 = 0;
                while (map.hasNext()) {
                    int i3;
                    Entry entry = (Entry) map.next();
                    C0482j a = this.f1744b.m741a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    if (!a.m732g()) {
                        if (!a.m733h()) {
                            i3 = 0;
                            i2 |= i3;
                        }
                    }
                    i3 = 1;
                    i2 |= i3;
                }
                if (i2 != 0) {
                    c0448c.mo1295b();
                    map = arrayList.size();
                    while (i < map) {
                        c0448c.mo1295b();
                        C0480i.m722a((C0482j) arrayList.get(i), c0448c);
                        this.f1745c.mo1259a(c0448c, arrayList2.get(i));
                        c0448c.mo1297c();
                        i++;
                    }
                    c0448c.mo1297c();
                } else {
                    c0448c.mo1299d();
                    map = arrayList.size();
                    while (i < map) {
                        c0448c.mo1292a(m2004a((C0482j) arrayList.get(i)));
                        this.f1745c.mo1259a(c0448c, arrayList2.get(i));
                        i++;
                    }
                    c0448c.mo1300e();
                }
            } else {
                c0448c.mo1299d();
                map = map.entrySet().iterator();
                while (map.hasNext()) {
                    Entry entry2 = (Entry) map.next();
                    c0448c.mo1292a(String.valueOf(entry2.getKey()));
                    this.f1745c.mo1259a(c0448c, entry2.getValue());
                }
                c0448c.mo1300e();
            }
        }

        /* renamed from: a */
        private String m2004a(C0482j c0482j) {
            if (c0482j.m734i()) {
                c0482j = c0482j.m738m();
                if (c0482j.m2245p()) {
                    return String.valueOf(c0482j.mo1261a());
                }
                if (c0482j.m2244o()) {
                    return Boolean.toString(c0482j.mo1266f());
                }
                if (c0482j.m2246q()) {
                    return c0482j.mo1262b();
                }
                throw new AssertionError();
            } else if (c0482j.m735j() != null) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public MapTypeAdapterFactory(C0467c c0467c, boolean z) {
        this.f1748b = c0467c;
        this.f1747a = z;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        Type b = c0444a.m573b();
        if (!Map.class.isAssignableFrom(c0444a.m572a())) {
            return null;
        }
        Type[] b2 = C0459b.m679b(b, C0459b.m682e(b));
        return new C1000a(this, c0451e, b2[0], m2009a(c0451e, b2[0]), b2[1], c0451e.m647a(C0444a.m569a(b2[1])), this.f1748b.m700a((C0444a) c0444a));
    }

    /* renamed from: a */
    private C0487t<?> m2009a(C0451e c0451e, Type type) {
        if (type != Boolean.TYPE) {
            if (type != Boolean.class) {
                return c0451e.m647a(C0444a.m569a(type));
            }
        }
        return C0466i.f456f;
    }
}
