package p000a.p001a.p002a.p003a.p013e;

import java.io.IOException;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: EofSensorInputStream */
/* renamed from: a.a.a.a.e.k */
public class C0826k extends InputStream implements C0076i {
    /* renamed from: a */
    protected InputStream f1451a;
    /* renamed from: b */
    private boolean f1452b = null;
    /* renamed from: c */
    private final C0078l f1453c;

    public C0826k(InputStream inputStream, C0078l c0078l) {
        C0160a.m478a((Object) inputStream, "Wrapped stream");
        this.f1451a = inputStream;
        this.f1453c = c0078l;
    }

    /* renamed from: c */
    protected boolean m1539c() {
        if (!this.f1452b) {
            return this.f1451a != null;
        } else {
            throw new IOException("Attempted read on closed stream.");
        }
    }

    public int read() {
        if (!m1539c()) {
            return -1;
        }
        try {
            int read = this.f1451a.read();
            m1537a(read);
            return read;
        } catch (IOException e) {
            m1541e();
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!m1539c()) {
            return -1;
        }
        try {
            bArr = this.f1451a.read(bArr, i, i2);
            m1537a(bArr);
            return bArr;
        } catch (byte[] bArr2) {
            m1541e();
            throw bArr2;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int available() {
        if (!m1539c()) {
            return 0;
        }
        try {
            return this.f1451a.available();
        } catch (IOException e) {
            m1541e();
            throw e;
        }
    }

    public void close() {
        this.f1452b = true;
        m1540d();
    }

    /* renamed from: a */
    protected void m1537a(int i) {
        if (this.f1451a != null && i < 0) {
            i = 1;
            try {
                if (this.f1453c != null) {
                    i = this.f1453c.mo1583a(this.f1451a);
                }
                if (i != 0) {
                    this.f1451a.close();
                }
                this.f1451a = null;
            } catch (Throwable th) {
                this.f1451a = null;
            }
        }
    }

    /* renamed from: d */
    protected void m1540d() {
        if (this.f1451a != null) {
            boolean z = true;
            try {
                if (this.f1453c != null) {
                    z = this.f1453c.mo1584b(this.f1451a);
                }
                if (z) {
                    this.f1451a.close();
                }
                this.f1451a = null;
            } catch (Throwable th) {
                this.f1451a = null;
            }
        }
    }

    /* renamed from: e */
    protected void m1541e() {
        if (this.f1451a != null) {
            boolean z = true;
            try {
                if (this.f1453c != null) {
                    z = this.f1453c.mo1585c(this.f1451a);
                }
                if (z) {
                    this.f1451a.close();
                }
                this.f1451a = null;
            } catch (Throwable th) {
                this.f1451a = null;
            }
        }
    }

    public void b_() {
        close();
    }

    /* renamed from: b */
    public void mo24b() {
        this.f1452b = true;
        m1541e();
    }
}
