package p000a.p001a.p002a.p003a.p022i.p024b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p005b.C0036k;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p005b.p009e.C1239a;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: DefaultHttpRequestRetryHandler */
/* renamed from: a.a.a.a.i.b.l */
public class C0849l implements C0036k {
    /* renamed from: a */
    public static final C0849l f1505a = new C0849l();
    /* renamed from: b */
    private final int f1506b;
    /* renamed from: c */
    private final boolean f1507c;
    /* renamed from: d */
    private final Set<Class<? extends IOException>> f1508d;

    protected C0849l(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.f1506b = i;
        this.f1507c = z;
        this.f1508d = new HashSet();
        for (Class add : collection) {
            this.f1508d.add(add);
        }
    }

    public C0849l(int i, boolean z) {
        this(i, z, Arrays.asList(new Class[]{InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class}));
    }

    public C0849l() {
        this(3, false);
    }

    public boolean retryRequest(IOException iOException, int i, C0157e c0157e) {
        C0160a.m478a((Object) iOException, "Exception parameter");
        C0160a.m478a((Object) c0157e, "HTTP context");
        if (i > this.f1506b || this.f1508d.contains(iOException.getClass()) != 0) {
            return false;
        }
        for (Class isInstance : this.f1508d) {
            if (isInstance.isInstance(iOException)) {
                return false;
            }
        }
        iOException = C1239a.m2524a(c0157e);
        i = iOException.m1916m();
        if (m1644b(i) != null) {
            return false;
        }
        if (m1643a(i) == 0 && iOException.m1917n() != null) {
            if (this.f1507c == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected boolean m1643a(C0915q c0915q) {
        return (c0915q instanceof C1285l) == null ? true : null;
    }

    @Deprecated
    /* renamed from: b */
    protected boolean m1644b(C0915q c0915q) {
        if (c0915q instanceof C1325w) {
            c0915q = ((C1325w) c0915q).m2801c();
        }
        return (!(c0915q instanceof C1238l) || ((C1238l) c0915q).isAborted() == null) ? null : true;
    }
}
