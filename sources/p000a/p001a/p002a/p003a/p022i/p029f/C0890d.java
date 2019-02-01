package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import p000a.p001a.p002a.p003a.C0043c;
import p000a.p001a.p002a.p003a.p030j.C0135a;
import p000a.p001a.p002a.p003a.p030j.C0139e;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0162c;
import p000a.p001a.p002a.p003a.p035o.C0163d;

@Deprecated
/* compiled from: AbstractSessionOutputBuffer */
/* renamed from: a.a.a.a.i.f.d */
public abstract class C0890d implements C0135a, C0141g {
    /* renamed from: a */
    private static final byte[] f1641a = new byte[]{(byte) 13, (byte) 10};
    /* renamed from: b */
    private OutputStream f1642b;
    /* renamed from: c */
    private C0162c f1643c;
    /* renamed from: d */
    private Charset f1644d;
    /* renamed from: e */
    private boolean f1645e;
    /* renamed from: f */
    private int f1646f;
    /* renamed from: g */
    private C0891k f1647g;
    /* renamed from: h */
    private CodingErrorAction f1648h;
    /* renamed from: i */
    private CodingErrorAction f1649i;
    /* renamed from: j */
    private CharsetEncoder f1650j;
    /* renamed from: k */
    private ByteBuffer f1651k;

    /* renamed from: a */
    protected void m1827a(OutputStream outputStream, int i, C0152e c0152e) {
        C0160a.m478a((Object) outputStream, "Input stream");
        C0160a.m482b(i, "Buffer size");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        this.f1642b = outputStream;
        this.f1643c = new C0162c(i);
        String str = (String) c0152e.mo1602a("http.protocol.element-charset");
        this.f1644d = str != null ? Charset.forName(str) : C0043c.f98b;
        this.f1645e = this.f1644d.equals(C0043c.f98b);
        this.f1650j = null;
        this.f1646f = c0152e.mo151a("http.connection.min-chunk-limit", 512);
        this.f1647g = m1832c();
        outputStream = (CodingErrorAction) c0152e.mo1602a("http.malformed.input.action");
        if (outputStream == null) {
            outputStream = CodingErrorAction.REPORT;
        }
        this.f1648h = outputStream;
        outputStream = (CodingErrorAction) c0152e.mo1602a("http.unmappable.input.action");
        if (outputStream == null) {
            outputStream = CodingErrorAction.REPORT;
        }
        this.f1649i = outputStream;
    }

    /* renamed from: c */
    protected C0891k m1832c() {
        return new C0891k();
    }

    /* renamed from: e */
    public int mo106e() {
        return this.f1643c.m495d();
    }

    /* renamed from: d */
    protected void m1833d() {
        int d = this.f1643c.m495d();
        if (d > 0) {
            this.f1642b.write(this.f1643c.m496e(), 0, d);
            this.f1643c.m487a();
            this.f1647g.m1835a((long) d);
        }
    }

    /* renamed from: a */
    public void mo84a() {
        m1833d();
        this.f1642b.flush();
    }

    /* renamed from: a */
    public void mo88a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i2 <= this.f1646f) {
                if (i2 <= this.f1643c.m494c()) {
                    if (i2 > this.f1643c.m494c() - this.f1643c.m495d()) {
                        m1833d();
                    }
                    this.f1643c.m490a(bArr, i, i2);
                }
            }
            m1833d();
            this.f1642b.write(bArr, i, i2);
            this.f1647g.m1835a((long) i2);
        }
    }

    /* renamed from: a */
    public void m1829a(byte[] bArr) {
        if (bArr != null) {
            mo88a(bArr, 0, bArr.length);
        }
    }

    /* renamed from: a */
    public void mo85a(int i) {
        if (this.f1643c.m498g()) {
            m1833d();
        }
        this.f1643c.m488a(i);
    }

    /* renamed from: a */
    public void mo87a(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (this.f1645e) {
                    for (int i = 0; i < str.length(); i++) {
                        mo85a(str.charAt(i));
                    }
                } else {
                    m1822a(CharBuffer.wrap(str));
                }
            }
            m1829a(f1641a);
        }
    }

    /* renamed from: a */
    public void mo86a(C0163d c0163d) {
        if (c0163d != null) {
            int i = 0;
            if (this.f1645e) {
                int c = c0163d.m513c();
                while (c > 0) {
                    int min = Math.min(this.f1643c.m494c() - this.f1643c.m495d(), c);
                    if (min > 0) {
                        this.f1643c.m489a(c0163d, i, min);
                    }
                    if (this.f1643c.m498g()) {
                        m1833d();
                    }
                    i += min;
                    c -= min;
                }
            } else {
                m1822a(CharBuffer.wrap(c0163d.m512b(), 0, c0163d.m513c()));
            }
            m1829a(f1641a);
        }
    }

    /* renamed from: a */
    private void m1822a(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.f1650j == null) {
                this.f1650j = this.f1644d.newEncoder();
                this.f1650j.onMalformedInput(this.f1648h);
                this.f1650j.onUnmappableCharacter(this.f1649i);
            }
            if (this.f1651k == null) {
                this.f1651k = ByteBuffer.allocate(1024);
            }
            this.f1650j.reset();
            while (charBuffer.hasRemaining()) {
                m1823a(this.f1650j.encode(charBuffer, this.f1651k, true));
            }
            m1823a(this.f1650j.flush(this.f1651k));
            this.f1651k.clear();
        }
    }

    /* renamed from: a */
    private void m1823a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f1651k.flip();
        while (this.f1651k.hasRemaining() != null) {
            mo85a(this.f1651k.get());
        }
        this.f1651k.compact();
    }

    /* renamed from: b */
    public C0139e mo89b() {
        return this.f1647g;
    }
}
