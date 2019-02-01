package p000a.p001a.p002a.p003a.p035o;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.p034n.C0156d;

/* compiled from: CharArrayBuffer */
/* renamed from: a.a.a.a.o.d */
public final class C0163d implements Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    /* renamed from: a */
    private char[] f311a;
    /* renamed from: b */
    private int f312b;

    public C0163d(int i) {
        C0160a.m482b(i, "Buffer capacity");
        this.f311a = new char[i];
    }

    /* renamed from: d */
    private void m499d(int i) {
        i = new char[Math.max(this.f311a.length << 1, i)];
        System.arraycopy(this.f311a, 0, i, 0, this.f312b);
        this.f311a = i;
    }

    /* renamed from: a */
    public void m509a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        i3 = this.f312b + i2;
                        if (i3 > this.f311a.length) {
                            m499d(i3);
                        }
                        System.arraycopy(cArr, i, this.f311a, this.f312b, i2);
                        this.f312b = i3;
                        return;
                    }
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("off: ");
            stringBuilder.append(i);
            stringBuilder.append(" len: ");
            stringBuilder.append(i2);
            stringBuilder.append(" b.length: ");
            stringBuilder.append(cArr.length);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void m507a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f312b + length;
        if (i > this.f311a.length) {
            m499d(i);
        }
        str.getChars(0, length, this.f311a, this.f312b);
        this.f312b = i;
    }

    /* renamed from: a */
    public void m506a(C0163d c0163d, int i, int i2) {
        if (c0163d != null) {
            m509a(c0163d.f311a, i, i2);
        }
    }

    /* renamed from: a */
    public void m504a(char c) {
        int i = this.f312b + 1;
        if (i > this.f311a.length) {
            m499d(i);
        }
        this.f311a[this.f312b] = c;
        this.f312b = i;
    }

    /* renamed from: a */
    public void m508a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        i3 = this.f312b;
                        i2 += i3;
                        if (i2 > this.f311a.length) {
                            m499d(i2);
                        }
                        while (i3 < i2) {
                            this.f311a[i3] = (char) (bArr[i] & 255);
                            i++;
                            i3++;
                        }
                        this.f312b = i2;
                        return;
                    }
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("off: ");
            stringBuilder.append(i);
            stringBuilder.append(" len: ");
            stringBuilder.append(i2);
            stringBuilder.append(" b.length: ");
            stringBuilder.append(bArr.length);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void m505a(C0162c c0162c, int i, int i2) {
        if (c0162c != null) {
            m508a(c0162c.m496e(), i, i2);
        }
    }

    /* renamed from: a */
    public void m503a() {
        this.f312b = 0;
    }

    /* renamed from: a */
    public char m500a(int i) {
        return this.f311a[i];
    }

    /* renamed from: b */
    public char[] m512b() {
        return this.f311a;
    }

    /* renamed from: c */
    public int m513c() {
        return this.f312b;
    }

    /* renamed from: b */
    public void m511b(int i) {
        if (i > 0 && i > this.f311a.length - this.f312b) {
            m499d(this.f312b + i);
        }
    }

    /* renamed from: d */
    public boolean m515d() {
        return this.f312b == 0;
    }

    /* renamed from: a */
    public int m501a(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.f312b) {
            i3 = this.f312b;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f311a[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: c */
    public int m514c(int i) {
        return m501a(i, 0, this.f312b);
    }

    /* renamed from: a */
    public String m502a(int i, int i2) {
        return new String(this.f311a, i, i2 - i);
    }

    /* renamed from: b */
    public String m510b(int i, int i2) {
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Negative beginIndex: ");
            stringBuilder.append(i);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 > this.f312b) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex: ");
            stringBuilder.append(i2);
            stringBuilder.append(" > length: ");
            stringBuilder.append(this.f312b);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i <= i2) {
            while (i < i2 && C0156d.m460a(this.f311a[i])) {
                i++;
            }
            while (i2 > i && C0156d.m460a(this.f311a[i2 - 1])) {
                i2--;
            }
            return new String(this.f311a, i, i2 - i);
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("beginIndex: ");
            stringBuilder2.append(i);
            stringBuilder2.append(" > endIndex: ");
            stringBuilder2.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        }
    }

    public String toString() {
        return new String(this.f311a, 0, this.f312b);
    }
}
