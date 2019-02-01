package p000a.p001a.p002a.p003a.p022i.p029f;

import java.io.IOException;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.p030j.C0141g;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: ContentLengthOutputStream */
/* renamed from: a.a.a.a.i.f.h */
public class C0132h extends OutputStream {
    /* renamed from: a */
    private final C0141g f279a;
    /* renamed from: b */
    private final long f280b;
    /* renamed from: c */
    private long f281c = 0;
    /* renamed from: d */
    private boolean f282d = false;

    public C0132h(C0141g c0141g, long j) {
        this.f279a = (C0141g) C0160a.m478a((Object) c0141g, "Session output buffer");
        this.f280b = C0160a.m476a(j, "Content length");
    }

    public void close() {
        if (!this.f282d) {
            this.f282d = true;
            this.f279a.mo84a();
        }
    }

    public void flush() {
        this.f279a.mo84a();
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.f282d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f281c < this.f280b) {
            long j = this.f280b - this.f281c;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.f279a.mo88a(bArr, i, i2);
            this.f281c += (long) i2;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) {
        if (this.f282d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f281c < this.f280b) {
            this.f279a.mo85a(i);
            this.f281c++;
        }
    }
}
