package com.google.gson.p040c;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter */
/* renamed from: com.google.gson.c.c */
public class C0448c implements Closeable, Flushable {
    /* renamed from: a */
    private static final String[] f388a = new String[128];
    /* renamed from: b */
    private static final String[] f389b = ((String[]) f388a.clone());
    /* renamed from: c */
    private final Writer f390c;
    /* renamed from: d */
    private int[] f391d = new int[32];
    /* renamed from: e */
    private int f392e = 0;
    /* renamed from: f */
    private String f393f;
    /* renamed from: g */
    private String f394g;
    /* renamed from: h */
    private boolean f395h;
    /* renamed from: i */
    private boolean f396i;
    /* renamed from: j */
    private String f397j;
    /* renamed from: k */
    private boolean f398k;

    static {
        for (int i = 0; i <= 31; i++) {
            f388a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f388a[34] = "\\\"";
        f388a[92] = "\\\\";
        f388a[9] = "\\t";
        f388a[8] = "\\b";
        f388a[10] = "\\n";
        f388a[13] = "\\r";
        f388a[12] = "\\f";
        f389b[60] = "\\u003c";
        f389b[62] = "\\u003e";
        f389b[38] = "\\u0026";
        f389b[61] = "\\u003d";
        f389b[39] = "\\u0027";
    }

    public C0448c(Writer writer) {
        m612a(6);
        this.f394g = ":";
        this.f398k = true;
        if (writer != null) {
            this.f390c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: c */
    public final void m628c(String str) {
        if (str.length() == 0) {
            this.f393f = null;
            this.f394g = ":";
            return;
        }
        this.f393f = str;
        this.f394g = ": ";
    }

    /* renamed from: b */
    public final void m626b(boolean z) {
        this.f395h = z;
    }

    /* renamed from: g */
    public boolean m634g() {
        return this.f395h;
    }

    /* renamed from: c */
    public final void m629c(boolean z) {
        this.f396i = z;
    }

    /* renamed from: h */
    public final boolean m635h() {
        return this.f396i;
    }

    /* renamed from: d */
    public final void m631d(boolean z) {
        this.f398k = z;
    }

    /* renamed from: i */
    public final boolean m636i() {
        return this.f398k;
    }

    /* renamed from: b */
    public C0448c mo1295b() {
        m615j();
        return m611a(1, "[");
    }

    /* renamed from: c */
    public C0448c mo1297c() {
        return m610a(1, 2, "]");
    }

    /* renamed from: d */
    public C0448c mo1299d() {
        m615j();
        return m611a(3, "{");
    }

    /* renamed from: e */
    public C0448c mo1300e() {
        return m610a(3, 5, "}");
    }

    /* renamed from: a */
    private C0448c m611a(int i, String str) {
        m618m();
        m612a(i);
        this.f390c.write(str);
        return this;
    }

    /* renamed from: a */
    private C0448c m610a(int i, int i2, String str) {
        int a = mo1294a();
        if (a != i2) {
            if (a != i) {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        if (this.f397j == 0) {
            this.f392e--;
            if (a == i2) {
                m616k();
            }
            this.f390c.write(str);
            return this;
        }
        i2 = new StringBuilder();
        i2.append("Dangling name: ");
        i2.append(this.f397j);
        throw new IllegalStateException(i2.toString());
    }

    /* renamed from: a */
    private void m612a(int i) {
        if (this.f392e == this.f391d.length) {
            Object obj = new int[(this.f392e * 2)];
            System.arraycopy(this.f391d, 0, obj, 0, this.f392e);
            this.f391d = obj;
        }
        int[] iArr = this.f391d;
        int i2 = this.f392e;
        this.f392e = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    private int mo1294a() {
        if (this.f392e != 0) {
            return this.f391d[this.f392e - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: b */
    private void m613b(int i) {
        this.f391d[this.f392e - 1] = i;
    }

    /* renamed from: a */
    public C0448c mo1292a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f397j != null) {
            throw new IllegalStateException();
        } else if (this.f392e != 0) {
            this.f397j = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: j */
    private void m615j() {
        if (this.f397j != null) {
            m617l();
            m614d(this.f397j);
            this.f397j = null;
        }
    }

    /* renamed from: b */
    public C0448c mo1296b(String str) {
        if (str == null) {
            return mo1301f();
        }
        m615j();
        m618m();
        m614d(str);
        return this;
    }

    /* renamed from: f */
    public C0448c mo1301f() {
        if (this.f397j != null) {
            if (this.f398k) {
                m615j();
            } else {
                this.f397j = null;
                return this;
            }
        }
        m618m();
        this.f390c.write("null");
        return this;
    }

    /* renamed from: a */
    public C0448c mo1293a(boolean z) {
        m615j();
        m618m();
        this.f390c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C0448c mo1290a(Boolean bool) {
        if (bool == null) {
            return mo1301f();
        }
        m615j();
        m618m();
        this.f390c.write(bool.booleanValue() != null ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C0448c mo1289a(long j) {
        m615j();
        m618m();
        this.f390c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C0448c mo1291a(Number number) {
        if (number == null) {
            return mo1301f();
        }
        m615j();
        CharSequence obj = number.toString();
        if (!this.f395h) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Numeric values must be finite, but was ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m618m();
        this.f390c.append(obj);
        return this;
    }

    public void flush() {
        if (this.f392e != 0) {
            this.f390c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void close() {
        this.f390c.close();
        int i = this.f392e;
        if (i > 1 || (i == 1 && this.f391d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f392e = 0;
    }

    /* renamed from: d */
    private void m614d(String str) {
        String[] strArr = this.f396i ? f389b : f388a;
        this.f390c.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str2;
            char charAt = str.charAt(i2);
            if (charAt < '') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == ' ') {
                str2 = "\\u2028";
            } else if (charAt == ' ') {
                str2 = "\\u2029";
            } else {
            }
            if (i < i2) {
                this.f390c.write(str, i, i2 - i);
            }
            this.f390c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f390c.write(str, i, length - i);
        }
        this.f390c.write("\"");
    }

    /* renamed from: k */
    private void m616k() {
        if (this.f393f != null) {
            this.f390c.write("\n");
            int i = this.f392e;
            for (int i2 = 1; i2 < i; i2++) {
                this.f390c.write(this.f393f);
            }
        }
    }

    /* renamed from: l */
    private void m617l() {
        int a = mo1294a();
        if (a == 5) {
            this.f390c.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m616k();
        m613b(4);
    }

    /* renamed from: m */
    private void m618m() {
        switch (mo1294a()) {
            case 1:
                m613b(2);
                m616k();
                return;
            case 2:
                this.f390c.append(',');
                m616k();
                return;
            case 4:
                this.f390c.append(this.f394g);
                m613b(5);
                return;
            case 6:
                break;
            case 7:
                if (this.f395h) {
                    break;
                }
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m613b(7);
    }
}
