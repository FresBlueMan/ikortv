package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.p030j.C0135a;
import p000a.p001a.p002a.p003a.p030j.C0139e;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0162c;
import p000a.p001a.p002a.p003a.p035o.C0163d;

@Deprecated
/* compiled from: AbstractSessionInputBuffer */
/* renamed from: a.a.a.a.i.f.c */
public abstract class C0889c implements C0135a, C0140f {
    /* renamed from: a */
    private InputStream f1627a;
    /* renamed from: b */
    private byte[] f1628b;
    /* renamed from: c */
    private C0162c f1629c;
    /* renamed from: d */
    private Charset f1630d;
    /* renamed from: e */
    private boolean f1631e;
    /* renamed from: f */
    private int f1632f;
    /* renamed from: g */
    private int f1633g;
    /* renamed from: h */
    private C0891k f1634h;
    /* renamed from: i */
    private CodingErrorAction f1635i;
    /* renamed from: j */
    private CodingErrorAction f1636j;
    /* renamed from: k */
    private int f1637k;
    /* renamed from: l */
    private int f1638l;
    /* renamed from: m */
    private CharsetDecoder f1639m;
    /* renamed from: n */
    private CharBuffer f1640n;

    /* renamed from: a */
    protected void m1816a(InputStream inputStream, int i, C0152e c0152e) {
        C0160a.m478a((Object) inputStream, "Input stream");
        C0160a.m482b(i, "Buffer size");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        this.f1627a = inputStream;
        this.f1628b = new byte[i];
        this.f1637k = 0;
        this.f1638l = 0;
        this.f1629c = new C0162c(i);
        String str = (String) c0152e.mo1602a("http.protocol.element-charset");
        this.f1630d = str != null ? Charset.forName(str) : C0043c.f98b;
        this.f1631e = this.f1630d.equals(C0043c.f98b);
        this.f1639m = null;
        this.f1632f = c0152e.mo151a("http.connection.max-line-length", -1);
        this.f1633g = c0152e.mo151a("http.connection.min-chunk-limit", 512);
        this.f1634h = m1818d();
        inputStream = (CodingErrorAction) c0152e.mo1602a("http.malformed.input.action");
        if (inputStream == null) {
            inputStream = CodingErrorAction.REPORT;
        }
        this.f1635i = inputStream;
        inputStream = (CodingErrorAction) c0152e.mo1602a("http.unmappable.input.action");
        if (inputStream == null) {
            inputStream = CodingErrorAction.REPORT;
        }
        this.f1636j = inputStream;
    }

    /* renamed from: d */
    protected C0891k m1818d() {
        return new C0891k();
    }

    /* renamed from: e */
    public int mo106e() {
        return this.f1638l - this.f1637k;
    }

    /* renamed from: f */
    protected int mo1625f() {
        int i;
        if (this.f1637k > 0) {
            i = this.f1638l - this.f1637k;
            if (i > 0) {
                System.arraycopy(this.f1628b, this.f1637k, this.f1628b, 0, i);
            }
            this.f1637k = 0;
            this.f1638l = i;
        }
        i = this.f1638l;
        int read = this.f1627a.read(this.f1628b, i, this.f1628b.length - i);
        if (read == -1) {
            return -1;
        }
        this.f1638l = i + read;
        this.f1634h.m1835a((long) read);
        return read;
    }

    /* renamed from: g */
    protected boolean m1821g() {
        return this.f1637k < this.f1638l;
    }

    /* renamed from: a */
    public int mo78a() {
        while (!m1821g()) {
            if (mo1625f() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f1628b;
        int i = this.f1637k;
        this.f1637k = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: a */
    public int mo80a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (m1821g()) {
            i2 = Math.min(i2, this.f1638l - this.f1637k);
            System.arraycopy(this.f1628b, this.f1637k, bArr, i, i2);
            this.f1637k += i2;
            return i2;
        } else if (i2 > this.f1633g) {
            bArr = this.f1627a.read(bArr, i, i2);
            if (bArr > null) {
                this.f1634h.m1835a((long) bArr);
            }
            return bArr;
        } else {
            while (!m1821g()) {
                if (mo1625f() == -1) {
                    return -1;
                }
            }
            i2 = Math.min(i2, this.f1638l - this.f1637k);
            System.arraycopy(this.f1628b, this.f1637k, bArr, i, i2);
            this.f1637k += i2;
            return i2;
        }
    }

    /* renamed from: c */
    private int mo83c() {
        for (int i = this.f1637k; i < this.f1638l; i++) {
            if (this.f1628b[i] == (byte) 10) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo79a(C0163d c0163d) {
        C0160a.m478a((Object) c0163d, "Char array buffer");
        Object obj = 1;
        int i = 0;
        while (obj != null) {
            int c = mo83c();
            if (c == -1) {
                if (m1821g()) {
                    this.f1629c.m490a(this.f1628b, this.f1637k, this.f1638l - this.f1637k);
                    this.f1637k = this.f1638l;
                }
                i = mo1625f();
                if (i == -1) {
                }
                if (this.f1632f <= 0) {
                    if (this.f1629c.m495d() < this.f1632f) {
                        throw new IOException("Maximum line length limit exceeded");
                    }
                }
            } else if (this.f1629c.m497f()) {
                return m1808a(c0163d, c);
            } else {
                c++;
                this.f1629c.m490a(this.f1628b, this.f1637k, c - this.f1637k);
                this.f1637k = c;
            }
            obj = null;
            if (this.f1632f <= 0) {
                if (this.f1629c.m495d() < this.f1632f) {
                    throw new IOException("Maximum line length limit exceeded");
                }
            }
        }
        if (i == -1 && this.f1629c.m497f()) {
            return -1;
        }
        return m1811b(c0163d);
    }

    /* renamed from: b */
    private int m1811b(C0163d c0163d) {
        int d = this.f1629c.m495d();
        if (d > 0) {
            if (this.f1629c.m492b(d - 1) == 10) {
                d--;
            }
            if (d > 0 && this.f1629c.m492b(d - 1) == 13) {
                d--;
            }
        }
        if (this.f1631e) {
            c0163d.m505a(this.f1629c, 0, d);
        } else {
            d = m1809a(c0163d, ByteBuffer.wrap(this.f1629c.m496e(), 0, d));
        }
        this.f1629c.m487a();
        return d;
    }

    /* renamed from: a */
    private int m1808a(C0163d c0163d, int i) {
        int i2 = this.f1637k;
        this.f1637k = i + 1;
        if (i > i2 && this.f1628b[i - 1] == (byte) 13) {
            i--;
        }
        i -= i2;
        if (!this.f1631e) {
            return m1809a(c0163d, ByteBuffer.wrap(this.f1628b, i2, i));
        }
        c0163d.m508a(this.f1628b, i2, i);
        return i;
    }

    /* renamed from: a */
    private int m1809a(C0163d c0163d, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f1639m == null) {
            this.f1639m = this.f1630d.newDecoder();
            this.f1639m.onMalformedInput(this.f1635i);
            this.f1639m.onUnmappableCharacter(this.f1636j);
        }
        if (this.f1640n == null) {
            this.f1640n = CharBuffer.allocate(1024);
        }
        this.f1639m.reset();
        while (byteBuffer.hasRemaining()) {
            i += m1810a(this.f1639m.decode(byteBuffer, this.f1640n, true), c0163d, byteBuffer);
        }
        i += m1810a(this.f1639m.flush(this.f1640n), c0163d, byteBuffer);
        this.f1640n.clear();
        return i;
    }

    /* renamed from: a */
    private int m1810a(CoderResult coderResult, C0163d c0163d, ByteBuffer byteBuffer) {
        if (coderResult.isError() != null) {
            coderResult.throwException();
        }
        this.f1640n.flip();
        coderResult = this.f1640n.remaining();
        while (this.f1640n.hasRemaining() != null) {
            c0163d.m504a(this.f1640n.get());
        }
        this.f1640n.compact();
        return coderResult;
    }

    /* renamed from: b */
    public C0139e mo82b() {
        return this.f1634h;
    }
}
