package p000a.p001a.p002a.p003a.p013e;

import java.io.InputStream;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p020g.C0832f;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0165f;

@Deprecated
/* compiled from: BasicManagedEntity */
/* renamed from: a.a.a.a.e.a */
public class C1244a extends C0832f implements C0076i, C0078l {
    /* renamed from: a */
    protected C1319o f2128a;
    /* renamed from: b */
    protected final boolean f2129b;

    public boolean isRepeatable() {
        return false;
    }

    public C1244a(C0149k c0149k, C1319o c1319o, boolean z) {
        super(c0149k);
        C0160a.m478a((Object) c1319o, "Connection");
        this.f2128a = c1319o;
        this.f2129b = z;
    }

    public InputStream getContent() {
        return new C0826k(this.wrappedEntity.getContent(), this);
    }

    /* renamed from: d */
    private void m2538d() {
        if (this.f2128a != null) {
            try {
                if (this.f2129b) {
                    C0165f.m520a(this.wrappedEntity);
                    this.f2128a.mo2012i();
                } else {
                    this.f2128a.mo2013j();
                }
                m2542c();
            } catch (Throwable th) {
                m2542c();
            }
        }
    }

    @Deprecated
    public void consumeContent() {
        m2538d();
    }

    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        m2538d();
    }

    public void b_() {
        m2538d();
    }

    /* renamed from: b */
    public void mo24b() {
        if (this.f2128a != null) {
            try {
                this.f2128a.mo24b();
            } finally {
                this.f2128a = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo1583a(InputStream inputStream) {
        try {
            if (this.f2128a != null) {
                if (this.f2129b) {
                    inputStream.close();
                    this.f2128a.mo2012i();
                } else {
                    this.f2128a.mo2013j();
                }
            }
            m2542c();
            return null;
        } catch (Throwable th) {
            m2542c();
        }
    }

    /* renamed from: b */
    public boolean mo1584b(InputStream inputStream) {
        boolean c;
        try {
            if (this.f2128a != null) {
                if (this.f2129b) {
                    c = this.f2128a.mo1932c();
                    inputStream.close();
                    this.f2128a.mo2012i();
                } else {
                    this.f2128a.mo2013j();
                }
            }
        } catch (InputStream inputStream2) {
            if (c) {
                throw inputStream2;
            }
        } catch (Throwable th) {
            m2542c();
        }
        m2542c();
        return null;
    }

    /* renamed from: c */
    public boolean mo1585c(InputStream inputStream) {
        if (this.f2128a != null) {
            this.f2128a.mo24b();
        }
        return null;
    }

    /* renamed from: c */
    protected void m2542c() {
        if (this.f2128a != null) {
            try {
                this.f2128a.b_();
            } finally {
                this.f2128a = null;
            }
        }
    }
}
