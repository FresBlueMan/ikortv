package com.google.gson.internal.bind;

import com.google.gson.C0482j;
import com.google.gson.C0997g;
import com.google.gson.C1040l;
import com.google.gson.C1041m;
import com.google.gson.C1042o;
import com.google.gson.p040c.C0448c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter */
/* renamed from: com.google.gson.internal.bind.d */
public final class C1009d extends C0448c {
    /* renamed from: a */
    private static final Writer f1803a = new C04641();
    /* renamed from: b */
    private static final C1042o f1804b = new C1042o("closed");
    /* renamed from: c */
    private final List<C0482j> f1805c = new ArrayList();
    /* renamed from: d */
    private String f1806d;
    /* renamed from: e */
    private C0482j f1807e = C1040l.f1849a;

    /* compiled from: JsonTreeWriter */
    /* renamed from: com.google.gson.internal.bind.d$1 */
    static class C04641 extends Writer {
        C04641() {
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void close() {
            throw new AssertionError();
        }
    }

    public void flush() {
    }

    public C1009d() {
        super(f1803a);
    }

    /* renamed from: a */
    public C0482j mo1294a() {
        if (this.f1805c.isEmpty()) {
            return this.f1807e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.f1805c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: j */
    private C0482j m2071j() {
        return (C0482j) this.f1805c.get(this.f1805c.size() - 1);
    }

    /* renamed from: a */
    private void m2070a(C0482j c0482j) {
        if (this.f1806d != null) {
            if (!c0482j.m735j() || m636i()) {
                ((C1041m) m2071j()).m2232a(this.f1806d, c0482j);
            }
            this.f1806d = null;
        } else if (this.f1805c.isEmpty()) {
            this.f1807e = c0482j;
        } else {
            C0482j j = m2071j();
            if (j instanceof C0997g) {
                ((C0997g) j).m1976a(c0482j);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public C0448c mo1295b() {
        C0482j c0997g = new C0997g();
        m2070a(c0997g);
        this.f1805c.add(c0997g);
        return this;
    }

    /* renamed from: c */
    public C0448c mo1297c() {
        if (this.f1805c.isEmpty() || this.f1806d != null) {
            throw new IllegalStateException();
        } else if (m2071j() instanceof C0997g) {
            this.f1805c.remove(this.f1805c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public C0448c mo1299d() {
        C0482j c1041m = new C1041m();
        m2070a(c1041m);
        this.f1805c.add(c1041m);
        return this;
    }

    /* renamed from: e */
    public C0448c mo1300e() {
        if (this.f1805c.isEmpty() || this.f1806d != null) {
            throw new IllegalStateException();
        } else if (m2071j() instanceof C1041m) {
            this.f1805c.remove(this.f1805c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C0448c mo1292a(String str) {
        if (this.f1805c.isEmpty() || this.f1806d != null) {
            throw new IllegalStateException();
        } else if (m2071j() instanceof C1041m) {
            this.f1806d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public C0448c mo1296b(String str) {
        if (str == null) {
            return mo1301f();
        }
        m2070a(new C1042o(str));
        return this;
    }

    /* renamed from: f */
    public C0448c mo1301f() {
        m2070a(C1040l.f1849a);
        return this;
    }

    /* renamed from: a */
    public C0448c mo1293a(boolean z) {
        m2070a(new C1042o(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C0448c mo1290a(Boolean bool) {
        if (bool == null) {
            return mo1301f();
        }
        m2070a(new C1042o(bool));
        return this;
    }

    /* renamed from: a */
    public C0448c mo1289a(long j) {
        m2070a(new C1042o(Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C0448c mo1291a(Number number) {
        if (number == null) {
            return mo1301f();
        }
        if (!m634g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("JSON forbids NaN and infinities: ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m2070a(new C1042o(number));
        return this;
    }

    public void close() {
        if (this.f1805c.isEmpty()) {
            this.f1805c.add(f1804b);
            return;
        }
        throw new IOException("Incomplete document");
    }
}
