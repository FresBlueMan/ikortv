package p000a.p001a.p002a.p003a.p022i.p023a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* compiled from: HttpEntityDigester */
/* renamed from: a.a.a.a.i.a.g */
class C0101g extends OutputStream {
    /* renamed from: a */
    private final MessageDigest f168a;
    /* renamed from: b */
    private boolean f169b;
    /* renamed from: c */
    private byte[] f170c;

    C0101g(MessageDigest messageDigest) {
        this.f168a = messageDigest;
        this.f168a.reset();
    }

    public void write(int i) {
        if (this.f169b) {
            throw new IOException("Stream has been already closed");
        }
        this.f168a.update((byte) i);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f169b) {
            throw new IOException("Stream has been already closed");
        }
        this.f168a.update(bArr, i, i2);
    }

    public void close() {
        if (!this.f169b) {
            this.f169b = true;
            this.f170c = this.f168a.digest();
            super.close();
        }
    }

    /* renamed from: a */
    public byte[] m274a() {
        return this.f170c;
    }
}
