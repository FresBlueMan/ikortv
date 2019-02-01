package p000a.p001a.p002a.p003a.p013e.p017d;

import javax.net.ssl.SSLContext;

/* compiled from: SSLContexts */
/* renamed from: a.a.a.a.e.d.g */
public class C0067g {
    /* renamed from: a */
    public static SSLContext m189a() {
        try {
            SSLContext instance = SSLContext.getInstance(C1249i.TLS);
            instance.init(null, null, null);
            return instance;
        } catch (Throwable e) {
            throw new C0068h(e.getMessage(), e);
        } catch (Throwable e2) {
            throw new C0068h(e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public static C0066f m190b() {
        return new C0066f();
    }
}
