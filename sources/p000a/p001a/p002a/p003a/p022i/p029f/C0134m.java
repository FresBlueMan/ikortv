package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: IdentityOutputStream */
/* renamed from: a.a.a.a.i.f.m */
public class C0134m extends OutputStream {
    /* renamed from: a */
    private final C0141g f285a;
    /* renamed from: b */
    private boolean f286b = false;

    public C0134m(C0141g c0141g) {
        this.f285a = (C0141g) C0160a.m478a((Object) c0141g, "Session output buffer");
    }

    public void close() {
        if (!this.f286b) {
            this.f286b = true;
            this.f285a.mo84a();
        }
    }

    public void flush() {
        this.f285a.mo84a();
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f286b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f285a.mo88a(bArr, i, i2);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) {
        if (this.f286b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f285a.mo85a(i);
    }
}
