package com.google.gson.internal.bind;

import com.google.gson.C0997g;
import com.google.gson.C1040l;
import com.google.gson.C1041m;
import com.google.gson.C1042o;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: JsonTreeReader */
/* renamed from: com.google.gson.internal.bind.c */
public final class C1008c extends C0446a {
    /* renamed from: b */
    private static final Reader f1797b = new C04631();
    /* renamed from: c */
    private static final Object f1798c = new Object();
    /* renamed from: d */
    private Object[] f1799d;
    /* renamed from: e */
    private int f1800e;
    /* renamed from: f */
    private String[] f1801f;
    /* renamed from: g */
    private int[] f1802g;

    /* compiled from: JsonTreeReader */
    /* renamed from: com.google.gson.internal.bind.c$1 */
    static class C04631 extends Reader {
        C04631() {
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void close() {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo1271a() {
        m2049a(C0447b.BEGIN_ARRAY);
        m2050a(((C0997g) m2051t()).iterator());
        this.f1802g[this.f1800e - 1] = 0;
    }

    /* renamed from: b */
    public void mo1272b() {
        m2049a(C0447b.END_ARRAY);
        m2052u();
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: c */
    public void mo1273c() {
        m2049a(C0447b.BEGIN_OBJECT);
        m2050a(((C1041m) m2051t()).m2233o().iterator());
    }

    /* renamed from: d */
    public void mo1275d() {
        m2049a(C0447b.END_OBJECT);
        m2052u();
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: e */
    public boolean mo1276e() {
        C0447b f = mo1277f();
        return (f == C0447b.END_OBJECT || f == C0447b.END_ARRAY) ? false : true;
    }

    /* renamed from: f */
    public C0447b mo1277f() {
        if (this.f1800e == 0) {
            return C0447b.END_DOCUMENT;
        }
        Object t = m2051t();
        if (t instanceof Iterator) {
            boolean z = this.f1799d[this.f1800e - 2] instanceof C1041m;
            Iterator it = (Iterator) t;
            if (!it.hasNext()) {
                return z ? C0447b.END_OBJECT : C0447b.END_ARRAY;
            } else if (z) {
                return C0447b.NAME;
            } else {
                m2050a(it.next());
                return mo1277f();
            }
        } else if (t instanceof C1041m) {
            return C0447b.BEGIN_OBJECT;
        } else {
            if (t instanceof C0997g) {
                return C0447b.BEGIN_ARRAY;
            }
            if (t instanceof C1042o) {
                C1042o c1042o = (C1042o) t;
                if (c1042o.m2246q()) {
                    return C0447b.STRING;
                }
                if (c1042o.m2244o()) {
                    return C0447b.BOOLEAN;
                }
                if (c1042o.m2245p()) {
                    return C0447b.NUMBER;
                }
                throw new AssertionError();
            } else if (t instanceof C1040l) {
                return C0447b.NULL;
            } else {
                if (t == f1798c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: t */
    private Object m2051t() {
        return this.f1799d[this.f1800e - 1];
    }

    /* renamed from: u */
    private Object m2052u() {
        Object[] objArr = this.f1799d;
        int i = this.f1800e - 1;
        this.f1800e = i;
        Object obj = objArr[i];
        this.f1799d[this.f1800e] = null;
        return obj;
    }

    /* renamed from: a */
    private void m2049a(C0447b c0447b) {
        if (mo1277f() != c0447b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(c0447b);
            stringBuilder.append(" but was ");
            stringBuilder.append(mo1277f());
            stringBuilder.append(m2053v());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: g */
    public String mo1278g() {
        m2049a(C0447b.NAME);
        Entry entry = (Entry) ((Iterator) m2051t()).next();
        String str = (String) entry.getKey();
        this.f1801f[this.f1800e - 1] = str;
        m2050a(entry.getValue());
        return str;
    }

    /* renamed from: h */
    public String mo1279h() {
        C0447b f = mo1277f();
        if (f != C0447b.STRING) {
            if (f != C0447b.NUMBER) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0447b.STRING);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m2053v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        String b = ((C1042o) m2052u()).mo1262b();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return b;
    }

    /* renamed from: i */
    public boolean mo1280i() {
        m2049a(C0447b.BOOLEAN);
        boolean f = ((C1042o) m2052u()).mo1266f();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return f;
    }

    /* renamed from: j */
    public void mo1281j() {
        m2049a(C0447b.NULL);
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: k */
    public double mo1282k() {
        C0447b f = mo1277f();
        if (f != C0447b.NUMBER) {
            if (f != C0447b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0447b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m2053v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        double c = ((C1042o) m2051t()).mo1263c();
        if (!m606q()) {
            if (Double.isNaN(c) || Double.isInfinite(c)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("JSON forbids NaN and infinities: ");
                stringBuilder2.append(c);
                throw new NumberFormatException(stringBuilder2.toString());
            }
        }
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return c;
    }

    /* renamed from: l */
    public long mo1283l() {
        C0447b f = mo1277f();
        if (f != C0447b.NUMBER) {
            if (f != C0447b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0447b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m2053v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        long d = ((C1042o) m2051t()).mo1264d();
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return d;
    }

    /* renamed from: m */
    public int mo1284m() {
        C0447b f = mo1277f();
        if (f != C0447b.NUMBER) {
            if (f != C0447b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0447b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m2053v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        int e = ((C1042o) m2051t()).mo1265e();
        m2052u();
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return e;
    }

    public void close() {
        this.f1799d = new Object[]{f1798c};
        this.f1800e = 1;
    }

    /* renamed from: n */
    public void mo1285n() {
        if (mo1277f() == C0447b.NAME) {
            mo1278g();
            this.f1801f[this.f1800e - 2] = "null";
        } else {
            m2052u();
            if (this.f1800e > 0) {
                this.f1801f[this.f1800e - 1] = "null";
            }
        }
        if (this.f1800e > 0) {
            int[] iArr = this.f1802g;
            int i = this.f1800e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: o */
    public void mo1286o() {
        m2049a(C0447b.NAME);
        Entry entry = (Entry) ((Iterator) m2051t()).next();
        m2050a(entry.getValue());
        m2050a(new C1042o((String) entry.getKey()));
    }

    /* renamed from: a */
    private void m2050a(Object obj) {
        if (this.f1800e == this.f1799d.length) {
            Object obj2 = new Object[(this.f1800e * 2)];
            Object obj3 = new int[(this.f1800e * 2)];
            Object obj4 = new String[(this.f1800e * 2)];
            System.arraycopy(this.f1799d, 0, obj2, 0, this.f1800e);
            System.arraycopy(this.f1802g, 0, obj3, 0, this.f1800e);
            System.arraycopy(this.f1801f, 0, obj4, 0, this.f1800e);
            this.f1799d = obj2;
            this.f1802g = obj3;
            this.f1801f = obj4;
        }
        Object[] objArr = this.f1799d;
        int i = this.f1800e;
        this.f1800e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: p */
    public String mo1287p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = 0;
        while (i < this.f1800e) {
            if (this.f1799d[i] instanceof C0997g) {
                i++;
                if (this.f1799d[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.f1802g[i]);
                    stringBuilder.append(']');
                }
            } else if (this.f1799d[i] instanceof C1041m) {
                i++;
                if (this.f1799d[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    if (this.f1801f[i] != null) {
                        stringBuilder.append(this.f1801f[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: v */
    private String m2053v() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(mo1287p());
        return stringBuilder.toString();
    }
}
