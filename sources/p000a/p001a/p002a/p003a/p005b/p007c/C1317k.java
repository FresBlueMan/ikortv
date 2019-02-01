package p000a.p001a.p002a.p003a.p005b.p007c;

import java.net.URI;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ae;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p031k.C0902m;
import p000a.p001a.p002a.p003a.p032l.C0153f;

/* compiled from: HttpRequestBase */
/* renamed from: a.a.a.a.b.c.k */
public abstract class C1317k extends C1236b implements C0017d, C1238l {
    private C0013a config;
    private URI uri;
    private ac version;

    public abstract String getMethod();

    public void started() {
    }

    public void setProtocolVersion(ac acVar) {
        this.version = acVar;
    }

    public ac getProtocolVersion() {
        return this.version != null ? this.version : C0153f.m452b(getParams());
    }

    public URI getURI() {
        return this.uri;
    }

    public ae getRequestLine() {
        String method = getMethod();
        ac protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String toASCIIString = uri != null ? uri.toASCIIString() : null;
        if (toASCIIString == null || toASCIIString.length() == 0) {
            toASCIIString = "/";
        }
        return new C0902m(method, toASCIIString, protocolVersion);
    }

    public C0013a getConfig() {
        return this.config;
    }

    public void setConfig(C0013a c0013a) {
        this.config = c0013a;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    public void releaseConnection() {
        reset();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getMethod());
        stringBuilder.append(" ");
        stringBuilder.append(getURI());
        stringBuilder.append(" ");
        stringBuilder.append(getProtocolVersion());
        return stringBuilder.toString();
    }
}
