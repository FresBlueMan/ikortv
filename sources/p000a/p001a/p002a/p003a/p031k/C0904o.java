package p000a.p001a.p002a.p003a.p031k;

import java.util.NoSuchElementException;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.aa;
import p000a.p001a.p002a.p003a.ag;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicTokenIterator */
/* renamed from: a.a.a.a.k.o */
public class C0904o implements ag {
    /* renamed from: a */
    protected final C0098h f1683a;
    /* renamed from: b */
    protected String f1684b;
    /* renamed from: c */
    protected String f1685c;
    /* renamed from: d */
    protected int f1686d = m1889a(-1);

    /* renamed from: a */
    protected boolean m1892a(char c) {
        return c == ',';
    }

    public C0904o(C0098h c0098h) {
        this.f1683a = (C0098h) C0160a.m478a((Object) c0098h, "Header iterator");
    }

    public boolean hasNext() {
        return this.f1685c != null;
    }

    /* renamed from: a */
    public String mo149a() {
        if (this.f1685c != null) {
            String str = this.f1685c;
            this.f1686d = m1889a(this.f1686d);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final Object next() {
        return mo149a();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    /* renamed from: a */
    protected int m1889a(int i) {
        if (i >= 0) {
            i = m1895c(i);
        } else if (this.f1683a.hasNext() == 0) {
            return -1;
        } else {
            this.f1684b = this.f1683a.mo139a().mo122d();
            i = 0;
        }
        i = m1893b(i);
        if (i < 0) {
            this.f1685c = 0;
            return -1;
        }
        int d = m1897d(i);
        this.f1685c = m1891a(this.f1684b, i, d);
        return d;
    }

    /* renamed from: a */
    protected String m1891a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* renamed from: b */
    protected int m1893b(int i) {
        int b = C0160a.m482b(i, "Search position");
        i = 0;
        while (i == 0 && this.f1684b != null) {
            int length = this.f1684b.length();
            while (i == 0 && b < length) {
                char charAt = this.f1684b.charAt(b);
                if (!m1892a(charAt)) {
                    if (!m1894b(charAt)) {
                        if (m1896c(this.f1684b.charAt(b)) != 0) {
                            i = 1;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid character before token (pos ");
                            stringBuilder.append(b);
                            stringBuilder.append("): ");
                            stringBuilder.append(this.f1684b);
                            throw new aa(stringBuilder.toString());
                        }
                    }
                }
                b++;
            }
            if (i == 0) {
                if (this.f1683a.hasNext()) {
                    this.f1684b = this.f1683a.mo139a().mo122d();
                    b = 0;
                } else {
                    this.f1684b = null;
                }
            }
        }
        return i != 0 ? b : -1;
    }

    /* renamed from: c */
    protected int m1895c(int i) {
        i = C0160a.m482b(i, "Search position");
        int length = this.f1684b.length();
        Object obj = null;
        while (obj == null && i < length) {
            char charAt = this.f1684b.charAt(i);
            if (m1892a(charAt)) {
                obj = 1;
            } else if (m1894b(charAt)) {
                i++;
            } else if (m1896c(charAt)) {
                r1 = new StringBuilder();
                r1.append("Tokens without separator (pos ");
                r1.append(i);
                r1.append("): ");
                r1.append(this.f1684b);
                throw new aa(r1.toString());
            } else {
                r1 = new StringBuilder();
                r1.append("Invalid character after token (pos ");
                r1.append(i);
                r1.append("): ");
                r1.append(this.f1684b);
                throw new aa(r1.toString());
            }
        }
        return i;
    }

    /* renamed from: d */
    protected int m1897d(int i) {
        C0160a.m482b(i, "Search position");
        int length = this.f1684b.length();
        i++;
        while (i < length && m1896c(this.f1684b.charAt(i))) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    protected boolean m1894b(char c) {
        if (c != '\t') {
            if (Character.isSpaceChar(c) == '\u0000') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    protected boolean m1896c(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (!Character.isISOControl(c) && m1898d(c) == '\u0000') {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    protected boolean m1898d(char c) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) >= '\u0000';
    }
}
