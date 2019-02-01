package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.p030j.C0141g;

/* compiled from: ChunkedOutputStream */
/* renamed from: a.a.a.a.i.f.f */
public class C0130f extends OutputStream {
    /* renamed from: a */
    private final C0141g f270a;
    /* renamed from: b */
    private final byte[] f271b;
    /* renamed from: c */
    private int f272c;
    /* renamed from: d */
    private boolean f273d;
    /* renamed from: e */
    private boolean f274e;

    @Deprecated
    public C0130f(C0141g c0141g) {
        this(2048, c0141g);
    }

    public C0130f(int i, C0141g c0141g) {
        this.f272c = 0;
        this.f273d = false;
        this.f274e = false;
        this.f271b = new byte[i];
        this.f270a = c0141g;
    }

    /* renamed from: a */
    protected void m373a() {
        if (this.f272c > 0) {
            this.f270a.mo87a(Integer.toHexString(this.f272c));
            this.f270a.mo88a(this.f271b, 0, this.f272c);
            this.f270a.mo87a("");
            this.f272c = 0;
        }
    }

    /* renamed from: a */
    protected void m374a(byte[] bArr, int i, int i2) {
        this.f270a.mo87a(Integer.toHexString(this.f272c + i2));
        this.f270a.mo88a(this.f271b, 0, this.f272c);
        this.f270a.mo88a(bArr, i, i2);
        this.f270a.mo87a("");
        this.f272c = 0;
    }

    /* renamed from: b */
    protected void m375b() {
        this.f270a.mo87a("0");
        this.f270a.mo87a("");
    }

    /* renamed from: c */
    public void m376c() {
        if (!this.f273d) {
            m373a();
            m375b();
            this.f273d = true;
        }
    }

    public void write(int i) {
        if (this.f274e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f271b[this.f272c] = (byte) i;
        this.f272c++;
        if (this.f272c == this.f271b.length) {
            m373a();
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f274e) {
            throw new IOException("Attempted write to closed stream.");
        } else if (i2 >= this.f271b.length - this.f272c) {
            m374a(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.f271b, this.f272c, i2);
            this.f272c += i2;
        }
    }

    public void flush() {
        m373a();
        this.f270a.mo84a();
    }

    public void close() {
        if (!this.f274e) {
            this.f274e = true;
            m376c();
            this.f270a.mo84a();
        }
    }
}
