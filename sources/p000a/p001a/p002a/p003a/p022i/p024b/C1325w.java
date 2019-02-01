package p000a.p001a.p002a.p003a.p022i.p024b;

import java.net.URI;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ae;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p031k.C0893a;
import p000a.p001a.p002a.p003a.p031k.C0902m;
import p000a.p001a.p002a.p003a.p032l.C0153f;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: RequestWrapper */
/* renamed from: a.a.a.a.i.b.w */
public class C1325w extends C0893a implements C1238l {
    /* renamed from: a */
    private final C0915q f2284a;
    /* renamed from: b */
    private URI f2285b;
    /* renamed from: c */
    private String f2286c;
    /* renamed from: d */
    private ac f2287d;
    /* renamed from: e */
    private int f2288e;

    /* renamed from: a */
    public boolean mo2010a() {
        return true;
    }

    public boolean isAborted() {
        return false;
    }

    public C1325w(C0915q c0915q) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        this.f2284a = c0915q;
        setParams(c0915q.getParams());
        setHeaders(c0915q.getAllHeaders());
        if (c0915q instanceof C1238l) {
            C1238l c1238l = (C1238l) c0915q;
            this.f2285b = c1238l.getURI();
            this.f2286c = c1238l.getMethod();
            this.f2287d = null;
        } else {
            ae requestLine = c0915q.getRequestLine();
            try {
                this.f2285b = new URI(requestLine.mo145c());
                this.f2286c = requestLine.mo143a();
                this.f2287d = c0915q.getProtocolVersion();
            } catch (C0915q c0915q2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid request URI: ");
                stringBuilder.append(requestLine.mo145c());
                throw new ab(stringBuilder.toString(), c0915q2);
            }
        }
        this.f2288e = null;
    }

    /* renamed from: b */
    public void m2800b() {
        this.headergroup.m405a();
        setHeaders(this.f2284a.getAllHeaders());
    }

    public String getMethod() {
        return this.f2286c;
    }

    public ac getProtocolVersion() {
        if (this.f2287d == null) {
            this.f2287d = C0153f.m452b(getParams());
        }
        return this.f2287d;
    }

    public URI getURI() {
        return this.f2285b;
    }

    /* renamed from: a */
    public void m2798a(URI uri) {
        this.f2285b = uri;
    }

    public ae getRequestLine() {
        String method = getMethod();
        ac protocolVersion = getProtocolVersion();
        String toASCIIString = this.f2285b != null ? this.f2285b.toASCIIString() : null;
        if (toASCIIString == null || toASCIIString.length() == 0) {
            toASCIIString = "/";
        }
        return new C0902m(method, toASCIIString, protocolVersion);
    }

    public void abort() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public C0915q m2801c() {
        return this.f2284a;
    }

    /* renamed from: d */
    public int m2802d() {
        return this.f2288e;
    }

    /* renamed from: e */
    public void m2803e() {
        this.f2288e++;
    }
}
