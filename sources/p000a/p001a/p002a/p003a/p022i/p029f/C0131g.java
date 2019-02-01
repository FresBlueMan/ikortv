package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.C0011a;
import p000a.p001a.p002a.p003a.p030j.C0135a;
import p000a.p001a.p002a.p003a.p030j.C0140f;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: ContentLengthInputStream */
/* renamed from: a.a.a.a.i.f.g */
public class C0131g extends InputStream {
    /* renamed from: a */
    private final long f275a;
    /* renamed from: b */
    private long f276b = 0;
    /* renamed from: c */
    private boolean f277c = false;
    /* renamed from: d */
    private C0140f f278d = null;

    public C0131g(C0140f c0140f, long j) {
        this.f278d = (C0140f) C0160a.m478a((Object) c0140f, "Session input buffer");
        this.f275a = C0160a.m476a(j, "Content length");
    }

    public void close() {
        if (!this.f277c) {
            try {
                if (this.f276b < this.f275a) {
                    while (read(new byte[2048]) >= 0) {
                    }
                }
                this.f277c = true;
            } catch (Throwable th) {
                this.f277c = true;
            }
        }
    }

    public int available() {
        return this.f278d instanceof C0135a ? Math.min(((C0135a) this.f278d).mo106e(), (int) (this.f275a - this.f276b)) : 0;
    }

    public int read() {
        if (this.f277c) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f276b >= this.f275a) {
            return -1;
        } else {
            int a = this.f278d.mo78a();
            if (a != -1) {
                this.f276b++;
            } else if (this.f276b < this.f275a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Premature end of Content-Length delimited message body (expected: ");
                stringBuilder.append(this.f275a);
                stringBuilder.append("; received: ");
                stringBuilder.append(this.f276b);
                throw new C0011a(stringBuilder.toString());
            }
            return a;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f277c) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f276b >= this.f275a) {
            return -1;
        } else {
            if (this.f276b + ((long) i2) > this.f275a) {
                i2 = (int) (this.f275a - this.f276b);
            }
            bArr = this.f278d.mo80a(bArr, i, i2);
            if (bArr == -1) {
                if (this.f276b < this.f275a) {
                    i = new StringBuilder();
                    i.append("Premature end of Content-Length delimited message body (expected: ");
                    i.append(this.f275a);
                    i.append("; received: ");
                    i.append(this.f276b);
                    throw new C0011a(i.toString());
                }
            }
            if (bArr > null) {
                this.f276b += (long) bArr;
            }
            return bArr;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        j = Math.min(j, this.f275a - this.f276b);
        long j2 = 0;
        while (j > 0) {
            int read = read(bArr, 0, (int) Math.min(2048, j));
            if (read == -1) {
                break;
            }
            long j3 = (long) read;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }
}
