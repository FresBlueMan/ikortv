package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C0825h;
import p000a.p001a.p002a.p003a.p013e.p014a.C0047a;
import p000a.p001a.p002a.p003a.p013e.p014a.C0048b;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: ConnPoolByRoute */
/* renamed from: a.a.a.a.i.c.a.d */
public class C0860d extends C0113a {
    /* renamed from: f */
    public C0097b f1548f;
    /* renamed from: g */
    protected final C0071d f1549g;
    /* renamed from: h */
    protected final C0048b f1550h;
    /* renamed from: i */
    protected final Set<C0858b> f1551i;
    /* renamed from: j */
    protected final Queue<C0858b> f1552j;
    /* renamed from: k */
    protected final Queue<C0116h> f1553k;
    /* renamed from: l */
    protected final Map<C0817b, C0115f> f1554l;
    /* renamed from: m */
    protected volatile boolean f1555m;
    /* renamed from: n */
    protected volatile int f1556n;
    /* renamed from: o */
    protected volatile int f1557o;
    /* renamed from: p */
    private final Lock f1558p;
    /* renamed from: q */
    private final long f1559q;
    /* renamed from: r */
    private final TimeUnit f1560r;

    public C0860d(C0071d c0071d, C0048b c0048b, int i) {
        this(c0071d, c0048b, i, -1, TimeUnit.MILLISECONDS);
    }

    public C0860d(C0071d c0071d, C0048b c0048b, int i, long j, TimeUnit timeUnit) {
        this.f1548f = new C0097b(getClass());
        C0160a.m478a((Object) c0071d, "Connection operator");
        C0160a.m478a((Object) c0048b, "Connections per route");
        this.f1558p = this.f225b;
        this.f1551i = this.f226c;
        this.f1549g = c0071d;
        this.f1550h = c0048b;
        this.f1556n = i;
        this.f1552j = m1693b();
        this.f1553k = m1694c();
        this.f1554l = m1695d();
        this.f1559q = j;
        this.f1560r = timeUnit;
    }

    @Deprecated
    public C0860d(C0071d c0071d, C0152e c0152e) {
        this(c0071d, C0047a.m147a(c0152e), C0047a.m151b(c0152e));
    }

    /* renamed from: b */
    protected Queue<C0858b> m1693b() {
        return new LinkedList();
    }

    /* renamed from: c */
    protected Queue<C0116h> m1694c() {
        return new LinkedList();
    }

    /* renamed from: d */
    protected Map<C0817b, C0115f> m1695d() {
        return new HashMap();
    }

    /* renamed from: a */
    protected C0115f m1686a(C0817b c0817b) {
        return new C0115f(c0817b, this.f1550h);
    }

    /* renamed from: a */
    protected C0116h m1688a(Condition condition, C0115f c0115f) {
        return new C0116h(condition, c0115f);
    }

    /* renamed from: b */
    private void m1681b(C0858b c0858b) {
        c0858b = c0858b.m1676c();
        if (c0858b != null) {
            try {
                c0858b.close();
            } catch (C0858b c0858b2) {
                this.f1548f.m261a("I/O error closing connection", c0858b2);
            }
        }
    }

    /* renamed from: a */
    protected C0115f m1687a(C0817b c0817b, boolean z) {
        this.f1558p.lock();
        try {
            C0115f c0115f = (C0115f) this.f1554l.get(c0817b);
            if (c0115f == null && z) {
                c0115f = m1686a(c0817b);
                this.f1554l.put(c0817b, c0115f);
            }
            this.f1558p.unlock();
            return c0115f;
        } catch (Throwable th) {
            this.f1558p.unlock();
        }
    }

    /* renamed from: a */
    public C0114e m1685a(final C0817b c0817b, final Object obj) {
        final C0117i c0117i = new C0117i();
        return new C0114e(this) {
            /* renamed from: d */
            final /* synthetic */ C0860d f1547d;

            /* renamed from: a */
            public void mo64a() {
                this.f1547d.f1558p.lock();
                try {
                    c0117i.m343a();
                } finally {
                    this.f1547d.f1558p.unlock();
                }
            }

            /* renamed from: a */
            public C0858b mo63a(long j, TimeUnit timeUnit) {
                return this.f1547d.m1682a(c0817b, obj, j, timeUnit, c0117i);
            }
        };
    }

    /* renamed from: a */
    protected C0858b m1682a(C0817b c0817b, Object obj, long j, TimeUnit timeUnit, C0117i c0117i) {
        C0858b c0858b = null;
        Date date = j > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j)) : null;
        this.f1558p.lock();
        C0115f a = m1687a(c0817b, true);
        timeUnit = null;
        while (c0858b == null) {
            C0161b.m485a(this.f1555m ^ true, "Connection pool shut down");
            if (this.f1548f.m262a()) {
                C0097b c0097b = this.f1548f;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                stringBuilder.append(c0817b);
                stringBuilder.append("] total kept alive: ");
                stringBuilder.append(this.f1552j.size());
                stringBuilder.append(", total issued: ");
                stringBuilder.append(this.f1551i.size());
                stringBuilder.append(", total allocated: ");
                stringBuilder.append(this.f1557o);
                stringBuilder.append(" out of ");
                stringBuilder.append(this.f1556n);
                c0097b.m260a(stringBuilder.toString());
            }
            c0858b = m1684a(a, obj);
            if (c0858b != null) {
                break;
            }
            Object obj2 = a.m336d() > 0 ? 1 : null;
            if (this.f1548f.m262a()) {
                C0097b c0097b2 = this.f1548f;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Available capacity: ");
                stringBuilder2.append(a.m336d());
                stringBuilder2.append(" out of ");
                stringBuilder2.append(a.m331b());
                stringBuilder2.append(" [");
                stringBuilder2.append(c0817b);
                stringBuilder2.append("][");
                stringBuilder2.append(obj);
                stringBuilder2.append("]");
                c0097b2.m260a(stringBuilder2.toString());
            }
            if (obj2 != null && this.f1557o < this.f1556n) {
                c0858b = m1683a(a, this.f1549g);
            } else if (obj2 == null || this.f1552j.isEmpty()) {
                if (this.f1548f.m262a()) {
                    C0097b c0097b3 = this.f1548f;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Need to wait for connection [");
                    stringBuilder3.append(c0817b);
                    stringBuilder3.append("][");
                    stringBuilder3.append(obj);
                    stringBuilder3.append("]");
                    c0097b3.m260a(stringBuilder3.toString());
                }
                if (timeUnit == null) {
                    timeUnit = m1688a(this.f1558p.newCondition(), a);
                    c0117i.m344a(timeUnit);
                }
                try {
                    a.m330a((C0116h) timeUnit);
                    this.f1553k.add(timeUnit);
                    boolean a2 = timeUnit.m341a(date);
                    a.m333b((C0116h) timeUnit);
                    this.f1553k.remove(timeUnit);
                    if (!(a2 || date == null)) {
                        if (date.getTime() <= System.currentTimeMillis()) {
                            throw new C0825h("Timeout waiting for connection from pool");
                        }
                    }
                } catch (Throwable th) {
                    this.f1558p.unlock();
                }
            } else {
                m1696e();
                a = m1687a(c0817b, true);
                c0858b = m1683a(a, this.f1549g);
            }
        }
        this.f1558p.unlock();
        return c0858b;
    }

    /* renamed from: a */
    public void m1691a(C0858b c0858b, boolean z, long j, TimeUnit timeUnit) {
        C0817b d = c0858b.m1677d();
        if (this.f1548f.m262a()) {
            C0097b c0097b = this.f1548f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Releasing connection [");
            stringBuilder.append(d);
            stringBuilder.append("][");
            stringBuilder.append(c0858b.m345a());
            stringBuilder.append("]");
            c0097b.m260a(stringBuilder.toString());
        }
        this.f1558p.lock();
        try {
            if (this.f1555m) {
                m1681b(c0858b);
                return;
            }
            this.f1551i.remove(c0858b);
            C0115f a = m1687a(d, true);
            if (!z || a.m336d() >= false) {
                m1681b(c0858b);
                a.m337e();
                this.f1557o -= 1;
            } else {
                if (this.f1548f.m262a()) {
                    if (j > 0) {
                        z = new StringBuilder();
                        z.append("for ");
                        z.append(j);
                        z.append(" ");
                        z.append(timeUnit);
                        z = z.toString();
                    } else {
                        z = "indefinitely";
                    }
                    c0097b = this.f1548f;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Pooling connection [");
                    stringBuilder2.append(d);
                    stringBuilder2.append("][");
                    stringBuilder2.append(c0858b.m345a());
                    stringBuilder2.append("]; keep alive ");
                    stringBuilder2.append(z);
                    c0097b.m260a(stringBuilder2.toString());
                }
                a.m329a(c0858b);
                c0858b.m1673a(j, timeUnit);
                this.f1552j.add(c0858b);
            }
            m1692a(a);
            this.f1558p.unlock();
        } finally {
            this.f1558p.unlock();
        }
    }

    /* renamed from: a */
    protected C0858b m1684a(C0115f c0115f, Object obj) {
        this.f1558p.lock();
        Object obj2 = null;
        C0858b c0858b = null;
        while (obj2 == null) {
            try {
                c0858b = c0115f.m328a(obj);
                if (c0858b != null) {
                    C0097b c0097b;
                    StringBuilder stringBuilder;
                    if (this.f1548f.m262a()) {
                        c0097b = this.f1548f;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Getting free connection [");
                        stringBuilder.append(c0115f.m327a());
                        stringBuilder.append("][");
                        stringBuilder.append(obj);
                        stringBuilder.append("]");
                        c0097b.m260a(stringBuilder.toString());
                    }
                    this.f1552j.remove(c0858b);
                    if (c0858b.m1674a(System.currentTimeMillis())) {
                        if (this.f1548f.m262a()) {
                            c0097b = this.f1548f;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Closing expired free connection [");
                            stringBuilder.append(c0115f.m327a());
                            stringBuilder.append("][");
                            stringBuilder.append(obj);
                            stringBuilder.append("]");
                            c0097b.m260a(stringBuilder.toString());
                        }
                        m1681b(c0858b);
                        c0115f.m337e();
                        this.f1557o--;
                    } else {
                        this.f1551i.add(c0858b);
                    }
                } else if (this.f1548f.m262a()) {
                    C0097b c0097b2 = this.f1548f;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("No free connections [");
                    stringBuilder2.append(c0115f.m327a());
                    stringBuilder2.append("][");
                    stringBuilder2.append(obj);
                    stringBuilder2.append("]");
                    c0097b2.m260a(stringBuilder2.toString());
                }
                obj2 = 1;
            } catch (Throwable th) {
                this.f1558p.unlock();
            }
        }
        this.f1558p.unlock();
        return c0858b;
    }

    /* renamed from: a */
    protected C0858b m1683a(C0115f c0115f, C0071d c0071d) {
        if (this.f1548f.m262a()) {
            C0097b c0097b = this.f1548f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating new connection [");
            stringBuilder.append(c0115f.m327a());
            stringBuilder.append("]");
            c0097b.m260a(stringBuilder.toString());
        }
        C0858b c0858b = new C0858b(c0071d, c0115f.m327a(), this.f1559q, this.f1560r);
        this.f1558p.lock();
        try {
            c0115f.m332b(c0858b);
            this.f1557o++;
            this.f1551i.add(c0858b);
            return c0858b;
        } finally {
            this.f1558p.unlock();
        }
    }

    /* renamed from: a */
    protected void m1690a(C0858b c0858b) {
        C0817b d = c0858b.m1677d();
        if (this.f1548f.m262a()) {
            C0097b c0097b = this.f1548f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleting connection [");
            stringBuilder.append(d);
            stringBuilder.append("][");
            stringBuilder.append(c0858b.m345a());
            stringBuilder.append("]");
            c0097b.m260a(stringBuilder.toString());
        }
        this.f1558p.lock();
        try {
            m1681b(c0858b);
            C0115f a = m1687a(d, true);
            a.m335c(c0858b);
            this.f1557o -= 1;
            if (a.m334c() != null) {
                this.f1554l.remove(d);
            }
            this.f1558p.unlock();
        } catch (Throwable th) {
            this.f1558p.unlock();
        }
    }

    /* renamed from: e */
    protected void m1696e() {
        this.f1558p.lock();
        try {
            C0858b c0858b = (C0858b) this.f1552j.remove();
            if (c0858b != null) {
                m1690a(c0858b);
            } else if (this.f1548f.m262a()) {
                this.f1548f.m260a("No free connection to delete");
            }
            this.f1558p.unlock();
        } catch (Throwable th) {
            this.f1558p.unlock();
        }
    }

    /* renamed from: a */
    protected void m1692a(C0115f c0115f) {
        this.f1558p.lock();
        if (c0115f != null) {
            try {
                if (c0115f.m338f()) {
                    if (this.f1548f.m262a()) {
                        C0097b c0097b = this.f1548f;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Notifying thread waiting on pool [");
                        stringBuilder.append(c0115f.m327a());
                        stringBuilder.append("]");
                        c0097b.m260a(stringBuilder.toString());
                    }
                    c0115f = c0115f.m339g();
                    if (c0115f != null) {
                        c0115f.m340a();
                    }
                    this.f1558p.unlock();
                }
            } catch (Throwable th) {
                this.f1558p.unlock();
            }
        }
        if (this.f1553k.isEmpty() == null) {
            if (this.f1548f.m262a() != null) {
                this.f1548f.m260a("Notifying thread waiting on any pool");
            }
            c0115f = (C0116h) this.f1553k.remove();
        } else {
            if (this.f1548f.m262a() != null) {
                this.f1548f.m260a("Notifying no-one, there are no waiting threads");
            }
            c0115f = null;
        }
        if (c0115f != null) {
            c0115f.m340a();
        }
        this.f1558p.unlock();
    }

    /* renamed from: a */
    public void mo65a() {
        this.f1558p.lock();
        try {
            if (!this.f1555m) {
                C0858b c0858b;
                this.f1555m = true;
                Iterator it = this.f1551i.iterator();
                while (it.hasNext()) {
                    c0858b = (C0858b) it.next();
                    it.remove();
                    m1681b(c0858b);
                }
                it = this.f1552j.iterator();
                while (it.hasNext()) {
                    c0858b = (C0858b) it.next();
                    it.remove();
                    if (this.f1548f.m262a()) {
                        C0097b c0097b = this.f1548f;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Closing connection [");
                        stringBuilder.append(c0858b.m1677d());
                        stringBuilder.append("][");
                        stringBuilder.append(c0858b.m345a());
                        stringBuilder.append("]");
                        c0097b.m260a(stringBuilder.toString());
                    }
                    m1681b(c0858b);
                }
                it = this.f1553k.iterator();
                while (it.hasNext()) {
                    C0116h c0116h = (C0116h) it.next();
                    it.remove();
                    c0116h.m340a();
                }
                this.f1554l.clear();
                this.f1558p.unlock();
            }
        } finally {
            this.f1558p.unlock();
        }
    }
}
