package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.InputStream;
import p000a.p001a.p002a.p003a.p030j.C0135a;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: IdentityInputStream */
/* renamed from: a.a.a.a.i.f.l */
public class C0133l extends InputStream {
    /* renamed from: a */
    private final C0140f f283a;
    /* renamed from: b */
    private boolean f284b = false;

    public C0133l(C0140f c0140f) {
        this.f283a = (C0140f) C0160a.m478a((Object) c0140f, "Session input buffer");
    }

    public int available() {
        return this.f283a instanceof C0135a ? ((C0135a) this.f283a).mo106e() : 0;
    }

    public void close() {
        this.f284b = true;
    }

    public int read() {
        if (this.f284b) {
            return -1;
        }
        return this.f283a.mo78a();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f284b) {
            return -1;
        }
        return this.f283a.mo80a(bArr, i, i2);
    }
}
