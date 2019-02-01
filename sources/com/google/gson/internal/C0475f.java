package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
/* renamed from: com.google.gson.internal.f */
public final class C0475f<K, V> extends AbstractMap<K, V> implements Serializable {
    /* renamed from: f */
    static final /* synthetic */ boolean f494f = (C0475f.class.desiredAssertionStatus() ^ 1);
    /* renamed from: g */
    private static final Comparator<Comparable> f495g = new C04701();
    /* renamed from: a */
    Comparator<? super K> f496a;
    /* renamed from: b */
    C0474d<K, V> f497b;
    /* renamed from: c */
    int f498c;
    /* renamed from: d */
    int f499d;
    /* renamed from: e */
    final C0474d<K, V> f500e;
    /* renamed from: h */
    private C0471a f501h;
    /* renamed from: i */
    private C0472b f502i;

    /* compiled from: LinkedTreeMap */
    /* renamed from: com.google.gson.internal.f$1 */
    static class C04701 implements Comparator<Comparable> {
        C04701() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m702a((Comparable) obj, (Comparable) obj2);
        }

        /* renamed from: a */
        public int m702a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: com.google.gson.internal.f$a */
    class C0471a extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0475f f480a;

        /* compiled from: LinkedTreeMap */
        /* renamed from: com.google.gson.internal.f$a$1 */
        class C10331 extends C0473c<Entry<K, V>> {
            /* renamed from: a */
            final /* synthetic */ C0471a f1842a;

            C10331(C0471a c0471a) {
                this.f1842a = c0471a;
                super(c0471a.f480a);
            }

            public /* synthetic */ Object next() {
                return m2227a();
            }

            /* renamed from: a */
            public Entry<K, V> m2227a() {
                return m703b();
            }
        }

        C0471a(C0475f c0475f) {
            this.f480a = c0475f;
        }

        public int size() {
            return this.f480a.f498c;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C10331(this);
        }

        public boolean contains(Object obj) {
            return (!(obj instanceof Entry) || this.f480a.m713a((Entry) obj) == null) ? null : true;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C0474d a = this.f480a.m713a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f480a.m714a(a, true);
            return true;
        }

        public void clear() {
            this.f480a.clear();
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: com.google.gson.internal.f$b */
    final class C0472b extends AbstractSet<K> {
        /* renamed from: a */
        final /* synthetic */ C0475f f481a;

        /* compiled from: LinkedTreeMap */
        /* renamed from: com.google.gson.internal.f$b$1 */
        class C10341 extends C0473c<K> {
            /* renamed from: a */
            final /* synthetic */ C0472b f1843a;

            C10341(C0472b c0472b) {
                this.f1843a = c0472b;
                super(c0472b.f481a);
            }

            public K next() {
                return m703b().f491f;
            }
        }

        C0472b(C0475f c0475f) {
            this.f481a = c0475f;
        }

        public int size() {
            return this.f481a.f498c;
        }

        public Iterator<K> iterator() {
            return new C10341(this);
        }

        public boolean contains(Object obj) {
            return this.f481a.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.f481a.m715b(obj) != null ? true : null;
        }

        public void clear() {
            this.f481a.clear();
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: com.google.gson.internal.f$c */
    private abstract class C0473c<T> implements Iterator<T> {
        /* renamed from: b */
        C0474d<K, V> f482b = this.f485e.f500e.f489d;
        /* renamed from: c */
        C0474d<K, V> f483c = null;
        /* renamed from: d */
        int f484d = this.f485e.f499d;
        /* renamed from: e */
        final /* synthetic */ C0475f f485e;

        C0473c(C0475f c0475f) {
            this.f485e = c0475f;
        }

        public final boolean hasNext() {
            return this.f482b != this.f485e.f500e;
        }

        /* renamed from: b */
        final C0474d<K, V> m703b() {
            C0474d<K, V> c0474d = this.f482b;
            if (c0474d == this.f485e.f500e) {
                throw new NoSuchElementException();
            } else if (this.f485e.f499d == this.f484d) {
                this.f482b = c0474d.f489d;
                this.f483c = c0474d;
                return c0474d;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final void remove() {
            if (this.f483c != null) {
                this.f485e.m714a(this.f483c, true);
                this.f483c = null;
                this.f484d = this.f485e.f499d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: com.google.gson.internal.f$d */
    static final class C0474d<K, V> implements Entry<K, V> {
        /* renamed from: a */
        C0474d<K, V> f486a;
        /* renamed from: b */
        C0474d<K, V> f487b;
        /* renamed from: c */
        C0474d<K, V> f488c;
        /* renamed from: d */
        C0474d<K, V> f489d;
        /* renamed from: e */
        C0474d<K, V> f490e;
        /* renamed from: f */
        final K f491f;
        /* renamed from: g */
        V f492g;
        /* renamed from: h */
        int f493h;

        C0474d() {
            this.f491f = null;
            this.f490e = this;
            this.f489d = this;
        }

        C0474d(C0474d<K, V> c0474d, K k, C0474d<K, V> c0474d2, C0474d<K, V> c0474d3) {
            this.f486a = c0474d;
            this.f491f = k;
            this.f493h = 1;
            this.f489d = c0474d2;
            this.f490e = c0474d3;
            c0474d3.f489d = this;
            c0474d2.f490e = this;
        }

        public K getKey() {
            return this.f491f;
        }

        public V getValue() {
            return this.f492g;
        }

        public V setValue(V v) {
            V v2 = this.f492g;
            this.f492g = v;
            return v2;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
            r3 = this;
            r0 = r4 instanceof java.util.Map.Entry;
            r1 = 0;
            if (r0 == 0) goto L_0x0037;
        L_0x0005:
            r4 = (java.util.Map.Entry) r4;
            r0 = r3.f491f;
            if (r0 != 0) goto L_0x0012;
        L_0x000b:
            r0 = r4.getKey();
            if (r0 != 0) goto L_0x0036;
        L_0x0011:
            goto L_0x001e;
        L_0x0012:
            r0 = r3.f491f;
            r2 = r4.getKey();
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0036;
        L_0x001e:
            r0 = r3.f492g;
            if (r0 != 0) goto L_0x0029;
        L_0x0022:
            r4 = r4.getValue();
            if (r4 != 0) goto L_0x0036;
        L_0x0028:
            goto L_0x0035;
        L_0x0029:
            r0 = r3.f492g;
            r4 = r4.getValue();
            r4 = r0.equals(r4);
            if (r4 == 0) goto L_0x0036;
        L_0x0035:
            r1 = 1;
        L_0x0036:
            return r1;
        L_0x0037:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f491f == null ? 0 : this.f491f.hashCode();
            if (this.f492g != null) {
                i = this.f492g.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f491f);
            stringBuilder.append("=");
            stringBuilder.append(this.f492g);
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public C0474d<K, V> m704a() {
            C0474d<K, V> c0474d = this;
            for (C0474d<K, V> c0474d2 = this.f487b; c0474d2 != null; c0474d2 = c0474d2.f487b) {
                c0474d = c0474d2;
            }
            return c0474d;
        }

        /* renamed from: b */
        public C0474d<K, V> m705b() {
            C0474d<K, V> c0474d = this;
            for (C0474d<K, V> c0474d2 = this.f488c; c0474d2 != null; c0474d2 = c0474d2.f488c) {
                c0474d = c0474d2;
            }
            return c0474d;
        }
    }

    public C0475f() {
        this(f495g);
    }

    public C0475f(Comparator<? super K> comparator) {
        this.f498c = 0;
        this.f499d = 0;
        this.f500e = new C0474d();
        if (comparator == null) {
            comparator = f495g;
        }
        this.f496a = comparator;
    }

    public int size() {
        return this.f498c;
    }

    public V get(Object obj) {
        obj = m711a(obj);
        return obj != null ? obj.f492g : null;
    }

    public boolean containsKey(Object obj) {
        return m711a(obj) != null ? true : null;
    }

    public V put(K k, V v) {
        if (k != null) {
            k = m712a((Object) k, true);
            V v2 = k.f492g;
            k.f492g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public void clear() {
        this.f497b = null;
        this.f498c = 0;
        this.f499d++;
        C0474d c0474d = this.f500e;
        c0474d.f490e = c0474d;
        c0474d.f489d = c0474d;
    }

    public V remove(Object obj) {
        obj = m715b(obj);
        return obj != null ? obj.f492g : null;
    }

    /* renamed from: a */
    C0474d<K, V> m712a(K k, boolean z) {
        int compareTo;
        Comparator comparator = this.f496a;
        C0474d c0474d = this.f497b;
        if (c0474d != null) {
            Comparable comparable = comparator == f495g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compareTo = comparable.compareTo(c0474d.f491f);
                } else {
                    compareTo = comparator.compare(k, c0474d.f491f);
                }
                if (compareTo == 0) {
                    return c0474d;
                }
                C0474d c0474d2;
                if (compareTo < 0) {
                    c0474d2 = c0474d.f487b;
                } else {
                    c0474d2 = c0474d.f488c;
                }
                if (c0474d2 == null) {
                    break;
                }
                c0474d = c0474d2;
            }
        } else {
            compareTo = 0;
        }
        if (!z) {
            return null;
        }
        C0474d<K, V> c0474d3;
        z = this.f500e;
        if (c0474d == null) {
            if (comparator == f495g) {
                if (!(k instanceof Comparable)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(k.getClass().getName());
                    stringBuilder.append(" is not Comparable");
                    throw new ClassCastException(stringBuilder.toString());
                }
            }
            c0474d3 = new C0474d(c0474d, k, z, z.f490e);
            this.f497b = c0474d3;
        } else {
            c0474d3 = new C0474d(c0474d, k, z, z.f490e);
            if (compareTo < 0) {
                c0474d.f487b = c0474d3;
            } else {
                c0474d.f488c = c0474d3;
            }
            m710b(c0474d, true);
        }
        this.f498c += 1;
        this.f499d += 1;
        return c0474d3;
    }

    /* renamed from: a */
    com.google.gson.internal.C0475f.C0474d<K, V> m711a(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x000a;
    L_0x0003:
        r1 = 0;
        r3 = r2.m712a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        goto L_0x000b;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r0;
    L_0x000b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.a(java.lang.Object):com.google.gson.internal.f$d<K, V>");
    }

    /* renamed from: a */
    C0474d<K, V> m713a(Entry<?, ?> entry) {
        C0474d<K, V> a = m711a(entry.getKey());
        entry = (a == null || m708a(a.f492g, entry.getValue()) == null) ? null : true;
        return entry != null ? a : null;
    }

    /* renamed from: a */
    private boolean m708a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m714a(C0474d<K, V> c0474d, boolean z) {
        if (z) {
            c0474d.f490e.f489d = c0474d.f489d;
            c0474d.f489d.f490e = c0474d.f490e;
        }
        C0474d c0474d2 = c0474d.f487b;
        C0474d c0474d3 = c0474d.f488c;
        C0474d c0474d4 = c0474d.f486a;
        int i = 0;
        if (!c0474d2 != false || c0474d3 == null) {
            if (c0474d2 == true) {
                m707a((C0474d) c0474d, c0474d2);
                c0474d.f487b = null;
            } else if (c0474d3 != null) {
                m707a((C0474d) c0474d, c0474d3);
                c0474d.f488c = null;
            } else {
                m707a((C0474d) c0474d, null);
            }
            m710b(c0474d4, false);
            this.f498c--;
            this.f499d++;
            return;
        }
        int i2;
        c0474d2 = c0474d2.f493h > c0474d3.f493h ? c0474d2.m705b() : c0474d3.m704a();
        m714a(c0474d2, false);
        c0474d3 = c0474d.f487b;
        if (c0474d3 != null) {
            i2 = c0474d3.f493h;
            c0474d2.f487b = c0474d3;
            c0474d3.f486a = c0474d2;
            c0474d.f487b = null;
        } else {
            i2 = 0;
        }
        c0474d3 = c0474d.f488c;
        if (c0474d3 != null) {
            i = c0474d3.f493h;
            c0474d2.f488c = c0474d3;
            c0474d3.f486a = c0474d2;
            c0474d.f488c = null;
        }
        c0474d2.f493h = Math.max(i2, i) + 1;
        m707a((C0474d) c0474d, c0474d2);
    }

    /* renamed from: b */
    C0474d<K, V> m715b(Object obj) {
        C0474d a = m711a(obj);
        if (a != null) {
            m714a(a, true);
        }
        return a;
    }

    /* renamed from: a */
    private void m707a(C0474d<K, V> c0474d, C0474d<K, V> c0474d2) {
        C0474d c0474d3 = c0474d.f486a;
        c0474d.f486a = null;
        if (c0474d2 != null) {
            c0474d2.f486a = c0474d3;
        }
        if (c0474d3 == null) {
            this.f497b = c0474d2;
        } else if (c0474d3.f487b == c0474d) {
            c0474d3.f487b = c0474d2;
        } else {
            if (!f494f) {
                if (c0474d3.f488c != c0474d) {
                    throw new AssertionError();
                }
            }
            c0474d3.f488c = c0474d2;
        }
    }

    /* renamed from: b */
    private void m710b(C0474d<K, V> c0474d, boolean z) {
        C0474d c0474d2;
        while (c0474d2 != null) {
            C0474d c0474d3 = c0474d2.f487b;
            C0474d c0474d4 = c0474d2.f488c;
            int i = 0;
            int i2 = c0474d3 != null ? c0474d3.f493h : 0;
            int i3 = c0474d4 != null ? c0474d4.f493h : 0;
            int i4 = i2 - i3;
            C0474d c0474d5;
            if (i4 == -2) {
                c0474d3 = c0474d4.f487b;
                c0474d5 = c0474d4.f488c;
                i2 = c0474d5 != null ? c0474d5.f493h : 0;
                if (c0474d3 != null) {
                    i = c0474d3.f493h;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (!f494f) {
                            if (i != 1) {
                                throw new AssertionError();
                            }
                        }
                        m709b(c0474d4);
                        m706a(c0474d2);
                        if (z) {
                            return;
                        }
                    }
                }
                m706a(c0474d2);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                c0474d4 = c0474d3.f487b;
                c0474d5 = c0474d3.f488c;
                i2 = c0474d5 != null ? c0474d5.f493h : 0;
                if (c0474d4 != null) {
                    i = c0474d4.f493h;
                }
                i -= i2;
                if (i != 1) {
                    if (i != 0 || z) {
                        if (!f494f) {
                            if (i != -1) {
                                throw new AssertionError();
                            }
                        }
                        m706a(c0474d3);
                        m709b(c0474d2);
                        if (z) {
                            return;
                        }
                    }
                }
                m709b(c0474d2);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                c0474d2.f493h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                if (!(f494f || i4 == -1)) {
                    if (i4 != 1) {
                        throw new AssertionError();
                    }
                }
                c0474d2.f493h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            c0474d2 = c0474d2.f486a;
        }
    }

    /* renamed from: a */
    private void m706a(C0474d<K, V> c0474d) {
        C0474d c0474d2 = c0474d.f487b;
        C0474d c0474d3 = c0474d.f488c;
        C0474d c0474d4 = c0474d3.f487b;
        C0474d c0474d5 = c0474d3.f488c;
        c0474d.f488c = c0474d4;
        if (c0474d4 != null) {
            c0474d4.f486a = c0474d;
        }
        m707a((C0474d) c0474d, c0474d3);
        c0474d3.f487b = c0474d;
        c0474d.f486a = c0474d3;
        int i = 0;
        c0474d.f493h = Math.max(c0474d2 != null ? c0474d2.f493h : 0, c0474d4 != null ? c0474d4.f493h : 0) + 1;
        c0474d = c0474d.f493h;
        if (c0474d5 != null) {
            i = c0474d5.f493h;
        }
        c0474d3.f493h = Math.max(c0474d, i) + 1;
    }

    /* renamed from: b */
    private void m709b(C0474d<K, V> c0474d) {
        C0474d c0474d2 = c0474d.f487b;
        C0474d c0474d3 = c0474d.f488c;
        C0474d c0474d4 = c0474d2.f487b;
        C0474d c0474d5 = c0474d2.f488c;
        c0474d.f487b = c0474d5;
        if (c0474d5 != null) {
            c0474d5.f486a = c0474d;
        }
        m707a((C0474d) c0474d, c0474d2);
        c0474d2.f488c = c0474d;
        c0474d.f486a = c0474d2;
        int i = 0;
        c0474d.f493h = Math.max(c0474d3 != null ? c0474d3.f493h : 0, c0474d5 != null ? c0474d5.f493h : 0) + 1;
        c0474d = c0474d.f493h;
        if (c0474d4 != null) {
            i = c0474d4.f493h;
        }
        c0474d2.f493h = Math.max(c0474d, i) + 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f501h;
        if (set != null) {
            return set;
        }
        Set c0471a = new C0471a(this);
        this.f501h = c0471a;
        return c0471a;
    }

    public Set<K> keySet() {
        Set<K> set = this.f502i;
        if (set != null) {
            return set;
        }
        Set c0472b = new C0472b(this);
        this.f502i = c0472b;
        return c0472b;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
}
