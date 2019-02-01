package p000a.p001a.p002a.p003a.p031k;

import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0098h;
import p000a.p001a.p002a.p003a.C0169p;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p032l.C1284b;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: AbstractHttpMessage */
/* renamed from: a.a.a.a.k.a */
public abstract class C0893a implements C0169p {
    protected C0144q headergroup;
    @Deprecated
    protected C0152e params;

    @Deprecated
    protected C0893a(C0152e c0152e) {
        this.headergroup = new C0144q();
        this.params = c0152e;
    }

    protected C0893a() {
        this(null);
    }

    public boolean containsHeader(String str) {
        return this.headergroup.m415d(str);
    }

    public C0082e[] getHeaders(String str) {
        return this.headergroup.m408a(str);
    }

    public C0082e getFirstHeader(String str) {
        return this.headergroup.m409b(str);
    }

    public C0082e getLastHeader(String str) {
        return this.headergroup.m412c(str);
    }

    public C0082e[] getAllHeaders() {
        return this.headergroup.m411b();
    }

    public void addHeader(C0082e c0082e) {
        this.headergroup.m406a(c0082e);
    }

    public void addHeader(String str, String str2) {
        C0160a.m478a((Object) str, "Header name");
        this.headergroup.m406a(new C0894b(str, str2));
    }

    public void setHeader(C0082e c0082e) {
        this.headergroup.m414c(c0082e);
    }

    public void setHeader(String str, String str2) {
        C0160a.m478a((Object) str, "Header name");
        this.headergroup.m414c(new C0894b(str, str2));
    }

    public void setHeaders(C0082e[] c0082eArr) {
        this.headergroup.m407a(c0082eArr);
    }

    public void removeHeader(C0082e c0082e) {
        this.headergroup.m410b(c0082e);
    }

    public void removeHeaders(String str) {
        if (str != null) {
            C0098h c = this.headergroup.m413c();
            while (c.hasNext()) {
                if (str.equalsIgnoreCase(c.mo139a().mo121c())) {
                    c.remove();
                }
            }
        }
    }

    public C0098h headerIterator() {
        return this.headergroup.m413c();
    }

    public C0098h headerIterator(String str) {
        return this.headergroup.m416e(str);
    }

    @Deprecated
    public C0152e getParams() {
        if (this.params == null) {
            this.params = new C1284b();
        }
        return this.params;
    }

    @Deprecated
    public void setParams(C0152e c0152e) {
        this.params = (C0152e) C0160a.m478a((Object) c0152e, "HTTP parameters");
    }
}
