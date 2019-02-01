package p000a.p001a.p002a.p003a.p022i.p024b;

import java.net.URI;
import p000a.p001a.p002a.p003a.C0041b;
import p000a.p001a.p002a.p003a.C0155m;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p004a.C0002c;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p005b.C0015b;
import p000a.p001a.p002a.p003a.p005b.C0019c;
import p000a.p001a.p002a.p003a.p005b.C0036k;
import p000a.p001a.p002a.p003a.p005b.C0037o;
import p000a.p001a.p002a.p003a.p005b.C0038p;
import p000a.p001a.p002a.p003a.p005b.C0039q;
import p000a.p001a.p002a.p003a.p005b.C0040r;
import p000a.p001a.p002a.p003a.p005b.C1243n;
import p000a.p001a.p002a.p003a.p005b.p008d.C0021b;
import p000a.p001a.p002a.p003a.p005b.p010f.C0029d;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C0075g;
import p000a.p001a.p002a.p003a.p013e.C1319o;
import p000a.p001a.p002a.p003a.p013e.p015b.C0050c;
import p000a.p001a.p002a.p003a.p013e.p015b.C0051d;
import p000a.p001a.p002a.p003a.p013e.p015b.C0816a;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p020g.C1257c;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p031k.C1281g;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p032l.C0153f;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p034n.C0158h;
import p000a.p001a.p002a.p003a.p034n.C0909g;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0165f;

@Deprecated
/* compiled from: DefaultRequestDirector */
/* renamed from: a.a.a.a.i.b.p */
public class C0853p implements C0039q {
    /* renamed from: a */
    public C0097b f1513a;
    /* renamed from: b */
    protected final C0055b f1514b;
    /* renamed from: c */
    protected final C0051d f1515c;
    /* renamed from: d */
    protected final C0041b f1516d;
    /* renamed from: e */
    protected final C0075g f1517e;
    /* renamed from: f */
    protected final C0158h f1518f;
    /* renamed from: g */
    protected final C0909g f1519g;
    /* renamed from: h */
    protected final C0036k f1520h;
    @Deprecated
    /* renamed from: i */
    protected final C0037o f1521i;
    /* renamed from: j */
    protected final C0038p f1522j;
    @Deprecated
    /* renamed from: k */
    protected final C0015b f1523k;
    /* renamed from: l */
    protected final C0019c f1524l;
    @Deprecated
    /* renamed from: m */
    protected final C0015b f1525m;
    /* renamed from: n */
    protected final C0019c f1526n;
    /* renamed from: o */
    protected final C0040r f1527o;
    /* renamed from: p */
    protected final C0152e f1528p;
    /* renamed from: q */
    protected C1319o f1529q;
    /* renamed from: r */
    protected final C0006h f1530r;
    /* renamed from: s */
    protected final C0006h f1531s;
    /* renamed from: t */
    private final C0855s f1532t;
    /* renamed from: u */
    private int f1533u;
    /* renamed from: v */
    private int f1534v;
    /* renamed from: w */
    private final int f1535w;
    /* renamed from: x */
    private C0159n f1536x;

    public C0853p(C0097b c0097b, C0158h c0158h, C0055b c0055b, C0041b c0041b, C0075g c0075g, C0051d c0051d, C0909g c0909g, C0036k c0036k, C0038p c0038p, C0019c c0019c, C0019c c0019c2, C0040r c0040r, C0152e c0152e) {
        C0160a.m478a((Object) c0097b, "Log");
        C0160a.m478a((Object) c0158h, "Request executor");
        C0160a.m478a((Object) c0055b, "Client connection manager");
        C0160a.m478a((Object) c0041b, "Connection reuse strategy");
        C0160a.m478a((Object) c0075g, "Connection keep alive strategy");
        C0160a.m478a((Object) c0051d, "Route planner");
        C0160a.m478a((Object) c0909g, "HTTP protocol processor");
        C0160a.m478a((Object) c0036k, "HTTP request retry handler");
        C0160a.m478a((Object) c0038p, "Redirect strategy");
        C0160a.m478a((Object) c0019c, "Target authentication strategy");
        C0160a.m478a((Object) c0019c2, "Proxy authentication strategy");
        C0160a.m478a((Object) c0040r, "User token handler");
        C0160a.m478a((Object) c0152e, "HTTP parameters");
        this.f1513a = c0097b;
        this.f1532t = new C0855s(c0097b);
        this.f1518f = c0158h;
        this.f1514b = c0055b;
        this.f1516d = c0041b;
        this.f1517e = c0075g;
        this.f1515c = c0051d;
        this.f1519g = c0909g;
        this.f1520h = c0036k;
        this.f1522j = c0038p;
        this.f1524l = c0019c;
        this.f1526n = c0019c2;
        this.f1527o = c0040r;
        this.f1528p = c0152e;
        if ((c0038p instanceof C0852o) != null) {
            this.f1521i = ((C0852o) c0038p).m1650a();
        } else {
            this.f1521i = null;
        }
        if ((c0019c instanceof C0842b) != null) {
            this.f1523k = ((C0842b) c0019c).m1618a();
        } else {
            this.f1523k = null;
        }
        if ((c0019c2 instanceof C0842b) != null) {
            this.f1525m = ((C0842b) c0019c2).m1618a();
        } else {
            this.f1525m = null;
        }
        this.f1529q = null;
        this.f1533u = 0;
        this.f1534v = 0;
        this.f1530r = new C0006h();
        this.f1531s = new C0006h();
        this.f1535w = this.f1528p.mo151a("http.protocol.max-redirects", 100);
    }

    /* renamed from: a */
    private C1325w m1653a(C0915q c0915q) {
        if (c0915q instanceof C1285l) {
            return new C1345r((C1285l) c0915q);
        }
        return new C1325w(c0915q);
    }

    /* renamed from: a */
    protected void m1661a(C1325w c1325w, C0817b c0817b) {
        try {
            URI uri = c1325w.getURI();
            if (c0817b.mo14d() == null || c0817b.mo15e()) {
                if (uri.isAbsolute() != null) {
                    c0817b = C0029d.m109a(uri, null, true);
                } else {
                    c0817b = C0029d.m108a(uri);
                }
            } else if (uri.isAbsolute()) {
                c0817b = C0029d.m108a(uri);
            } else {
                c0817b = C0029d.m109a(uri, c0817b.mo10a(), true);
            }
            c1325w.m2798a(c0817b);
        } catch (C0817b c0817b2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid URI: ");
            stringBuilder.append(c1325w.getRequestLine().mo145c());
            throw new ab(stringBuilder.toString(), c0817b2);
        }
    }

    /* renamed from: a */
    public p000a.p001a.p002a.p003a.C0916s mo59a(p000a.p001a.p002a.p003a.C0159n r12, p000a.p001a.p002a.p003a.C0915q r13, p000a.p001a.p002a.p003a.p034n.C0157e r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r11 = this;
        r0 = "http.auth.target-scope";
        r1 = r11.f1530r;
        r14.mo160a(r0, r1);
        r0 = "http.auth.proxy-scope";
        r1 = r11.f1531s;
        r14.mo160a(r0, r1);
        r0 = r11.m1653a(r13);
        r1 = r11.f1528p;
        r0.setParams(r1);
        r1 = r11.m1663b(r12, r0, r14);
        r2 = r0.getParams();
        r3 = "http.virtual-host";
        r2 = r2.mo1602a(r3);
        r2 = (p000a.p001a.p002a.p003a.C0159n) r2;
        r11.f1536x = r2;
        r2 = r11.f1536x;
        if (r2 == 0) goto L_0x0057;
    L_0x002d:
        r2 = r11.f1536x;
        r2 = r2.m471b();
        r3 = -1;
        if (r2 != r3) goto L_0x0057;
    L_0x0036:
        if (r12 == 0) goto L_0x003a;
    L_0x0038:
        r2 = r12;
        goto L_0x003e;
    L_0x003a:
        r2 = r1.mo10a();
    L_0x003e:
        r2 = r2.m471b();
        if (r2 == r3) goto L_0x0057;
    L_0x0044:
        r3 = new a.a.a.a.n;
        r4 = r11.f1536x;
        r4 = r4.m470a();
        r5 = r11.f1536x;
        r5 = r5.m472c();
        r3.<init>(r4, r2, r5);
        r11.f1536x = r3;
    L_0x0057:
        r2 = new a.a.a.a.i.b.x;
        r2.<init>(r0, r1);
        r0 = 0;
        r1 = 0;
        r3 = r12;
        r12 = 0;
    L_0x0060:
        if (r1 != 0) goto L_0x025b;
    L_0x0062:
        r0 = r2.m321a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r2.m322b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r5 = "http.user-token";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r5 = r14.mo159a(r5);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 != 0) goto L_0x00cb;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0074:
        r6 = r11.f1514b;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.mo69a(r4, r5);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = r13 instanceof p000a.p001a.p002a.p003a.p005b.p007c.C0016a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r7 == 0) goto L_0x0084;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x007e:
        r7 = r13;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = (p000a.p001a.p002a.p003a.p005b.p007c.C0016a) r7;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7.setConnectionRequest(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0084:
        r7 = r11.f1528p;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = p000a.p001a.p002a.p003a.p005b.p008d.C0021b.m81c(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00be }
        r6 = r6.mo66a(r7, r9);	 Catch:{ InterruptedException -> 0x00be }
        r11.f1529q = r6;	 Catch:{ InterruptedException -> 0x00be }
        r6 = r11.f1528p;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = p000a.p001a.p002a.p003a.p032l.C0150c.m437f(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00cb;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x009a:
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.mo1932c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00cb;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00a2:
        r6 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = "Stale connection check";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m260a(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.mo1599d();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00cb;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00b1:
        r6 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = "Stale connection detected";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m260a(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.close();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x00cb;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00be:
        r12 = java.lang.Thread.currentThread();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12.interrupt();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12 = new java.io.InterruptedIOException;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12.<init>();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        throw r12;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00cb:
        r6 = r13 instanceof p000a.p001a.p002a.p003a.p005b.p007c.C0016a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00d7;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00cf:
        r6 = r13;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = (p000a.p001a.p002a.p003a.p005b.p007c.C0016a) r6;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.setReleaseTrigger(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00d7:
        r11.m1654a(r2, r14);	 Catch:{ z -> 0x023c }
        r6 = r0.getURI();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.getUserInfo();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00f3;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00e4:
        r7 = r11.f1530r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8 = new a.a.a.a.i.a.b;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8.<init>();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9 = new a.a.a.a.a.r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9.<init>(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7.m14a(r8, r9);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00f3:
        r6 = r11.f1536x;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x00fa;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00f7:
        r3 = r11.f1536x;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0108;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x00fa:
        r6 = r0.getURI();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = r6.isAbsolute();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r7 == 0) goto L_0x0108;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0104:
        r3 = p000a.p001a.p002a.p003a.p005b.p010f.C0029d.m111b(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0108:
        if (r3 != 0) goto L_0x010e;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x010a:
        r3 = r4.mo10a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x010e:
        r0.m2800b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r11.m1661a(r0, r4);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = "http.target_host";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.mo160a(r6, r3);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = "http.route";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.mo160a(r6, r4);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = "http.connection";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.mo160a(r4, r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r11.f1518f;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1519g;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.m465a(r0, r6, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r0 = r11.m1655b(r2, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r0 != 0) goto L_0x0134;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0132:
        goto L_0x0060;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0134:
        r12 = r11.f1528p;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r0.setParams(r12);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12 = r11.f1518f;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r11.f1519g;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12.m466a(r0, r4, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12 = r11.f1516d;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12 = r12.mo61a(r0, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r12 == 0) goto L_0x0197;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0148:
        r4 = r11.f1517e;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r4.mo53a(r0, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r4.m262a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r4 == 0) goto L_0x0190;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0156:
        r8 = 0;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r4 <= 0) goto L_0x0178;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x015c:
        r4 = new java.lang.StringBuilder;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.<init>();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8 = "for ";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.append(r8);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.append(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8 = " ";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.append(r8);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.append(r8);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r4.toString();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x017a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0178:
        r4 = "indefinitely";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x017a:
        r8 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9 = new java.lang.StringBuilder;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9.<init>();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r10 = "Connection can be kept alive ";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9.append(r10);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r9.append(r4);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = r9.toString();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8.m260a(r4);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0190:
        r4 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.mo2011a(r6, r8);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0197:
        r4 = r11.m1657a(r2, r0, r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r4 != 0) goto L_0x01a0;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x019d:
        r1 = 1;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0222;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01a0:
        if (r12 == 0) goto L_0x01af;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01a2:
        r6 = r0.mo1630b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        p000a.p001a.p002a.p003a.p035o.C0165f.m520a(r6);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.mo2012i();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0210;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01af:
        r6 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.close();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1531s;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m17b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = p000a.p001a.p002a.p003a.p004a.C0001b.CHALLENGED;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.compareTo(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 <= 0) goto L_0x01e2;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01c2:
        r6 = r11.f1531s;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m18c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x01e2;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01ca:
        r6 = r11.f1531s;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m18c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.mo1921c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x01e2;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01d6:
        r6 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = "Resetting proxy auth state";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m260a(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1531s;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m11a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01e2:
        r6 = r11.f1530r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m17b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = p000a.p001a.p002a.p003a.p004a.C0001b.CHALLENGED;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.compareTo(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 <= 0) goto L_0x0210;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01f0:
        r6 = r11.f1530r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m18c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x0210;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x01f8:
        r6 = r11.f1530r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.m18c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r6.mo1921c();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r6 == 0) goto L_0x0210;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0204:
        r6 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r7 = "Resetting target auth state";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m260a(r7);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6 = r11.f1530r;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r6.m11a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0210:
        r6 = r4.m322b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r2 = r2.m322b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r2 = r6.equals(r2);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r2 != 0) goto L_0x0221;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x021e:
        r11.m1659a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0221:
        r2 = r4;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0222:
        r4 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r4 == 0) goto L_0x0060;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0226:
        if (r5 != 0) goto L_0x0233;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0228:
        r4 = r11.f1527o;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r5 = r4.mo60a(r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4 = "http.user-token";	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.mo160a(r4, r5);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0233:
        if (r5 == 0) goto L_0x0060;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0235:
        r4 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r4.mo2026a(r5);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0060;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x023c:
        r13 = move-exception;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14 = r14.m262a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r14 == 0) goto L_0x024e;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0245:
        r14 = r11.f1513a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r0 = r13.getMessage();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.m260a(r0);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x024e:
        r0 = r13.m1669a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x025b;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0253:
        r12 = move-exception;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0288;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0255:
        r12 = move-exception;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x028c;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0257:
        r12 = move-exception;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0290;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0259:
        r12 = move-exception;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0294;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x025b:
        if (r0 == 0) goto L_0x027d;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x025d:
        r13 = r0.mo1630b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r13 == 0) goto L_0x027d;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0263:
        r13 = r0.mo1630b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r13 = r13.isStreaming();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        if (r13 != 0) goto L_0x026e;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x026d:
        goto L_0x027d;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x026e:
        r13 = r0.mo1630b();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14 = new a.a.a.a.e.a;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r1 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r14.<init>(r13, r1, r12);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r0.mo1629a(r14);	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        goto L_0x0287;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x027d:
        if (r12 == 0) goto L_0x0284;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x027f:
        r12 = r11.f1529q;	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
        r12.mo2012i();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0284:
        r11.m1659a();	 Catch:{ e -> 0x0259, m -> 0x0257, IOException -> 0x0255, RuntimeException -> 0x0253 }
    L_0x0287:
        return r0;
    L_0x0288:
        r11.m1656b();
        throw r12;
    L_0x028c:
        r11.m1656b();
        throw r12;
    L_0x0290:
        r11.m1656b();
        throw r12;
    L_0x0294:
        r13 = new java.io.InterruptedIOException;
        r14 = "Connection has been shut down";
        r13.<init>(r14);
        r13.initCause(r12);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.b.p.a(a.a.a.a.n, a.a.a.a.q, a.a.a.a.n.e):a.a.a.a.s");
    }

    /* renamed from: a */
    private void m1654a(p000a.p001a.p002a.p003a.p022i.p024b.C0112x r7, p000a.p001a.p002a.p003a.p034n.C0157e r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r7.m322b();
        r7 = r7.m321a();
        r1 = 0;
    L_0x0009:
        r2 = "http.request";
        r8.mo160a(r2, r7);
        r1 = r1 + 1;
        r2 = r6.f1529q;	 Catch:{ IOException -> 0x002f }
        r2 = r2.mo1932c();	 Catch:{ IOException -> 0x002f }
        if (r2 != 0) goto L_0x0020;	 Catch:{ IOException -> 0x002f }
    L_0x0018:
        r2 = r6.f1529q;	 Catch:{ IOException -> 0x002f }
        r3 = r6.f1528p;	 Catch:{ IOException -> 0x002f }
        r2.mo2023a(r0, r8, r3);	 Catch:{ IOException -> 0x002f }
        goto L_0x002b;	 Catch:{ IOException -> 0x002f }
    L_0x0020:
        r2 = r6.f1529q;	 Catch:{ IOException -> 0x002f }
        r3 = r6.f1528p;	 Catch:{ IOException -> 0x002f }
        r3 = p000a.p001a.p002a.p003a.p032l.C0150c.m428a(r3);	 Catch:{ IOException -> 0x002f }
        r2.mo1931b(r3);	 Catch:{ IOException -> 0x002f }
    L_0x002b:
        r6.m1660a(r0, r8);	 Catch:{ IOException -> 0x002f }
        return;
    L_0x002f:
        r2 = move-exception;
        r3 = r6.f1529q;	 Catch:{ IOException -> 0x0035 }
        r3.close();	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        r3 = r6.f1520h;
        r3 = r3.retryRequest(r2, r1, r8);
        if (r3 == 0) goto L_0x00a0;
    L_0x003d:
        r3 = r6.f1513a;
        r3 = r3.m270d();
        if (r3 == 0) goto L_0x0009;
    L_0x0045:
        r3 = r6.f1513a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "I/O exception (";
        r4.append(r5);
        r5 = r2.getClass();
        r5 = r5.getName();
        r4.append(r5);
        r5 = ") caught when connecting to ";
        r4.append(r5);
        r4.append(r0);
        r5 = ": ";
        r4.append(r5);
        r5 = r2.getMessage();
        r4.append(r5);
        r4 = r4.toString();
        r3.m269d(r4);
        r3 = r6.f1513a;
        r3 = r3.m262a();
        if (r3 == 0) goto L_0x0088;
    L_0x007f:
        r3 = r6.f1513a;
        r4 = r2.getMessage();
        r3.m261a(r4, r2);
    L_0x0088:
        r2 = r6.f1513a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Retrying connect to ";
        r3.append(r4);
        r3.append(r0);
        r3 = r3.toString();
        r2.m269d(r3);
        goto L_0x0009;
    L_0x00a0:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.b.p.a(a.a.a.a.i.b.x, a.a.a.a.n.e):void");
    }

    /* renamed from: b */
    private p000a.p001a.p002a.p003a.C0916s m1655b(p000a.p001a.p002a.p003a.p022i.p024b.C0112x r7, p000a.p001a.p002a.p003a.p034n.C0157e r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r7.m321a();
        r7 = r7.m322b();
        r1 = 0;
        r2 = r1;
    L_0x000a:
        r3 = r6.f1533u;
        r3 = r3 + 1;
        r6.f1533u = r3;
        r0.m2803e();
        r3 = r0.mo2010a();
        if (r3 != 0) goto L_0x0032;
    L_0x0019:
        r7 = r6.f1513a;
        r8 = "Cannot retry non-repeatable request";
        r7.m260a(r8);
        if (r2 == 0) goto L_0x002a;
    L_0x0022:
        r7 = new a.a.a.a.b.m;
        r8 = "Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.";
        r7.<init>(r8, r2);
        throw r7;
    L_0x002a:
        r7 = new a.a.a.a.b.m;
        r8 = "Cannot retry request with a non-repeatable request entity.";
        r7.<init>(r8);
        throw r7;
    L_0x0032:
        r2 = r6.f1529q;	 Catch:{ IOException -> 0x0086 }
        r2 = r2.mo1932c();	 Catch:{ IOException -> 0x0086 }
        if (r2 != 0) goto L_0x0057;	 Catch:{ IOException -> 0x0086 }
    L_0x003a:
        r2 = r7.mo15e();	 Catch:{ IOException -> 0x0086 }
        if (r2 != 0) goto L_0x004f;	 Catch:{ IOException -> 0x0086 }
    L_0x0040:
        r2 = r6.f1513a;	 Catch:{ IOException -> 0x0086 }
        r3 = "Reopening the direct connection.";	 Catch:{ IOException -> 0x0086 }
        r2.m260a(r3);	 Catch:{ IOException -> 0x0086 }
        r2 = r6.f1529q;	 Catch:{ IOException -> 0x0086 }
        r3 = r6.f1528p;	 Catch:{ IOException -> 0x0086 }
        r2.mo2023a(r7, r8, r3);	 Catch:{ IOException -> 0x0086 }
        goto L_0x0057;	 Catch:{ IOException -> 0x0086 }
    L_0x004f:
        r2 = r6.f1513a;	 Catch:{ IOException -> 0x0086 }
        r3 = "Proxied connection. Need to start over.";	 Catch:{ IOException -> 0x0086 }
        r2.m260a(r3);	 Catch:{ IOException -> 0x0086 }
        goto L_0x0085;	 Catch:{ IOException -> 0x0086 }
    L_0x0057:
        r2 = r6.f1513a;	 Catch:{ IOException -> 0x0086 }
        r2 = r2.m262a();	 Catch:{ IOException -> 0x0086 }
        if (r2 == 0) goto L_0x007c;	 Catch:{ IOException -> 0x0086 }
    L_0x005f:
        r2 = r6.f1513a;	 Catch:{ IOException -> 0x0086 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0086 }
        r3.<init>();	 Catch:{ IOException -> 0x0086 }
        r4 = "Attempt ";	 Catch:{ IOException -> 0x0086 }
        r3.append(r4);	 Catch:{ IOException -> 0x0086 }
        r4 = r6.f1533u;	 Catch:{ IOException -> 0x0086 }
        r3.append(r4);	 Catch:{ IOException -> 0x0086 }
        r4 = " to execute request";	 Catch:{ IOException -> 0x0086 }
        r3.append(r4);	 Catch:{ IOException -> 0x0086 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0086 }
        r2.m260a(r3);	 Catch:{ IOException -> 0x0086 }
    L_0x007c:
        r2 = r6.f1518f;	 Catch:{ IOException -> 0x0086 }
        r3 = r6.f1529q;	 Catch:{ IOException -> 0x0086 }
        r2 = r2.m464a(r0, r3, r8);	 Catch:{ IOException -> 0x0086 }
        r1 = r2;
    L_0x0085:
        return r1;
    L_0x0086:
        r2 = move-exception;
        r3 = r6.f1513a;
        r4 = "Closing the connection.";
        r3.m260a(r4);
        r3 = r6.f1529q;	 Catch:{ IOException -> 0x0093 }
        r3.close();	 Catch:{ IOException -> 0x0093 }
    L_0x0093:
        r3 = r6.f1520h;
        r4 = r0.m2802d();
        r3 = r3.retryRequest(r2, r4, r8);
        if (r3 == 0) goto L_0x010a;
    L_0x009f:
        r3 = r6.f1513a;
        r3 = r3.m270d();
        if (r3 == 0) goto L_0x00d9;
    L_0x00a7:
        r3 = r6.f1513a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "I/O exception (";
        r4.append(r5);
        r5 = r2.getClass();
        r5 = r5.getName();
        r4.append(r5);
        r5 = ") caught when processing request to ";
        r4.append(r5);
        r4.append(r7);
        r5 = ": ";
        r4.append(r5);
        r5 = r2.getMessage();
        r4.append(r5);
        r4 = r4.toString();
        r3.m269d(r4);
    L_0x00d9:
        r3 = r6.f1513a;
        r3 = r3.m262a();
        if (r3 == 0) goto L_0x00ea;
    L_0x00e1:
        r3 = r6.f1513a;
        r4 = r2.getMessage();
        r3.m261a(r4, r2);
    L_0x00ea:
        r3 = r6.f1513a;
        r3 = r3.m270d();
        if (r3 == 0) goto L_0x000a;
    L_0x00f2:
        r3 = r6.f1513a;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Retrying request to ";
        r4.append(r5);
        r4.append(r7);
        r4 = r4.toString();
        r3.m269d(r4);
        goto L_0x000a;
    L_0x010a:
        r8 = r2 instanceof p000a.p001a.p002a.p003a.C0176z;
        if (r8 == 0) goto L_0x0134;
    L_0x010e:
        r8 = new a.a.a.a.z;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = r7.mo10a();
        r7 = r7.m474e();
        r0.append(r7);
        r7 = " failed to respond";
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        r7 = r2.getStackTrace();
        r8.setStackTrace(r7);
        throw r8;
    L_0x0134:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.b.p.b(a.a.a.a.i.b.x, a.a.a.a.n.e):a.a.a.a.s");
    }

    /* renamed from: a */
    protected void m1659a() {
        try {
            this.f1529q.b_();
        } catch (Throwable e) {
            this.f1513a.m261a("IOException releasing connection", e);
        }
        this.f1529q = null;
    }

    /* renamed from: b */
    protected C0817b m1663b(C0159n c0159n, C0915q c0915q, C0157e c0157e) {
        C0051d c0051d = this.f1515c;
        if (c0159n == null) {
            c0159n = (C0159n) c0915q.getParams().mo1602a("http.default-host");
        }
        return c0051d.mo75a(c0159n, c0915q, c0157e);
    }

    /* renamed from: a */
    protected void m1660a(C0817b c0817b, C0157e c0157e) {
        C0050c c0816a = new C0816a();
        int a;
        do {
            Object h = this.f1529q.mo1916h();
            a = c0816a.mo9a(c0817b, h);
            switch (a) {
                case -1:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to establish route: planned = ");
                    stringBuilder.append(c0817b);
                    stringBuilder.append("; current = ");
                    stringBuilder.append(h);
                    throw new C0155m(stringBuilder.toString());
                case 0:
                    break;
                case 1:
                case 2:
                    this.f1529q.mo2023a(c0817b, c0157e, this.f1528p);
                    continue;
                case 3:
                    boolean b = m1664b(c0817b, c0157e);
                    this.f1513a.m260a("Tunnel to target created.");
                    this.f1529q.mo2027a(b, this.f1528p);
                    continue;
                case 4:
                    int c = h.mo13c() - 1;
                    boolean a2 = m1662a(c0817b, c, c0157e);
                    this.f1513a.m260a("Tunnel to proxy created.");
                    this.f1529q.mo2025a(c0817b.mo11a(c), a2, this.f1528p);
                    continue;
                case 5:
                    this.f1529q.mo2024a(c0157e, this.f1528p);
                    continue;
                default:
                    c0157e = new StringBuilder();
                    c0157e.append("Unknown step indicator ");
                    c0157e.append(a);
                    c0157e.append(" from RouteDirector.");
                    throw new IllegalStateException(c0157e.toString());
            }
        } while (a > 0);
    }

    /* renamed from: b */
    protected boolean m1664b(C0817b c0817b, C0157e c0157e) {
        C0159n d = c0817b.mo14d();
        C0159n a = c0817b.mo10a();
        while (true) {
            if (!this.f1529q.mo1932c()) {
                this.f1529q.mo2023a(c0817b, c0157e, this.f1528p);
            }
            C0915q c = m1665c(c0817b, c0157e);
            c.setParams(this.f1528p);
            c0157e.mo160a("http.target_host", a);
            c0157e.mo160a("http.route", c0817b);
            c0157e.mo160a("http.proxy_host", d);
            c0157e.mo160a("http.connection", this.f1529q);
            c0157e.mo160a("http.request", c);
            this.f1518f.m465a(c, this.f1519g, c0157e);
            C0916s a2 = this.f1518f.m464a(c, this.f1529q, c0157e);
            a2.setParams(this.f1528p);
            this.f1518f.m466a(a2, this.f1519g, c0157e);
            if (a2.mo1628a().mo147b() < 200) {
                c0157e = new StringBuilder();
                c0157e.append("Unexpected response to CONNECT request: ");
                c0157e.append(a2.mo1628a());
                throw new C0155m(c0157e.toString());
            } else if (C0021b.m80b(this.f1528p)) {
                if (!this.f1532t.m272a(d, a2, this.f1526n, this.f1531s, c0157e)) {
                    break;
                }
                if (!this.f1532t.m1668c(d, a2, this.f1526n, this.f1531s, c0157e)) {
                    break;
                } else if (this.f1516d.mo61a(a2, c0157e)) {
                    this.f1513a.m260a("Connection kept alive");
                    C0165f.m520a(a2.mo1630b());
                } else {
                    this.f1529q.close();
                }
            }
        }
        if (a2.mo1628a().mo147b() > 299) {
            c0817b = a2.mo1630b();
            if (c0817b != null) {
                a2.mo1629a(new C1257c(c0817b));
            }
            this.f1529q.close();
            c0157e = new StringBuilder();
            c0157e.append("CONNECT refused by proxy: ");
            c0157e.append(a2.mo1628a());
            throw new C0856z(c0157e.toString(), a2);
        }
        this.f1529q.mo2012i();
        return null;
    }

    /* renamed from: a */
    protected boolean m1662a(C0817b c0817b, int i, C0157e c0157e) {
        throw new C0155m("Proxy chains are not supported.");
    }

    /* renamed from: c */
    protected C0915q m1665c(C0817b c0817b, C0157e c0157e) {
        c0817b = c0817b.mo10a();
        c0157e = c0817b.m470a();
        int b = c0817b.m471b();
        if (b < 0) {
            b = this.f1514b.mo68a().m178a(c0817b.m472c()).m171a();
        }
        c0817b = new StringBuilder(c0157e.length() + 6);
        c0817b.append(c0157e);
        c0817b.append(':');
        c0817b.append(Integer.toString(b));
        return new C1281g("CONNECT", c0817b.toString(), C0153f.m452b(this.f1528p));
    }

    /* renamed from: a */
    protected C0112x m1657a(C0112x c0112x, C0916s c0916s, C0157e c0157e) {
        C0853p c0853p = this;
        C0916s c0916s2 = c0916s;
        C0157e c0157e2 = c0157e;
        C0817b b = c0112x.m322b();
        Object a = c0112x.m321a();
        C0152e params = a.getParams();
        if (C0021b.m80b(params)) {
            C0159n c0159n;
            C0159n c0159n2 = (C0159n) c0157e2.mo159a("http.target_host");
            if (c0159n2 == null) {
                c0159n2 = b.mo10a();
            }
            if (c0159n2.m471b() < 0) {
                c0159n = new C0159n(c0159n2.m470a(), c0853p.f1514b.mo68a().m177a(c0159n2).m171a(), c0159n2.m472c());
            } else {
                c0159n = c0159n2;
            }
            boolean a2 = c0853p.f1532t.m272a(c0159n, c0916s, c0853p.f1524l, c0853p.f1530r, c0157e);
            c0159n2 = b.mo14d();
            if (c0159n2 == null) {
                c0159n2 = b.mo10a();
            }
            C0159n c0159n3 = c0159n2;
            boolean a3 = c0853p.f1532t.m272a(c0159n3, c0916s, c0853p.f1526n, c0853p.f1531s, c0157e);
            if (a2) {
                if (c0853p.f1532t.m1668c(c0159n, c0916s, c0853p.f1524l, c0853p.f1530r, c0157e)) {
                    return c0112x;
                }
            }
            if (a3) {
                if (c0853p.f1532t.m1668c(c0159n3, c0916s, c0853p.f1526n, c0853p.f1531s, c0157e)) {
                    return c0112x;
                }
            }
        }
        if (!C0021b.m79a(params) || !c0853p.f1522j.mo57a(a, c0916s2, c0157e2)) {
            return null;
        }
        if (c0853p.f1534v < c0853p.f1535w) {
            c0853p.f1534v++;
            c0853p.f1536x = null;
            C0915q b2 = c0853p.f1522j.mo58b(a, c0916s2, c0157e2);
            b2.setHeaders(a.m2801c().getAllHeaders());
            URI uri = b2.getURI();
            C0159n b3 = C0029d.m111b(uri);
            if (b3 != null) {
                if (!b.mo10a().equals(b3)) {
                    c0853p.f1513a.m260a("Resetting target auth state");
                    c0853p.f1530r.m11a();
                    C0002c c = c0853p.f1531s.m18c();
                    if (c != null && c.mo1921c()) {
                        c0853p.f1513a.m260a("Resetting proxy auth state");
                        c0853p.f1531s.m11a();
                    }
                }
                Object a4 = m1653a(b2);
                a4.setParams(params);
                C0817b b4 = m1663b(b3, a4, c0157e2);
                C0112x c0112x2 = new C0112x(a4, b4);
                if (c0853p.f1513a.m262a()) {
                    C0097b c0097b = c0853p.f1513a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Redirecting to '");
                    stringBuilder.append(uri);
                    stringBuilder.append("' via ");
                    stringBuilder.append(b4);
                    c0097b.m260a(stringBuilder.toString());
                }
                return c0112x2;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Redirect URI does not specify a valid host name: ");
            stringBuilder2.append(uri);
            throw new ab(stringBuilder2.toString());
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Maximum redirects (");
        stringBuilder3.append(c0853p.f1535w);
        stringBuilder3.append(") exceeded");
        throw new C1243n(stringBuilder3.toString());
    }

    /* renamed from: b */
    private void m1656b() {
        C1319o c1319o = this.f1529q;
        if (c1319o != null) {
            this.f1529q = null;
            try {
                c1319o.mo24b();
            } catch (Throwable e) {
                if (this.f1513a.m262a()) {
                    this.f1513a.m261a(e.getMessage(), e);
                }
            }
            try {
                c1319o.b_();
            } catch (Throwable e2) {
                this.f1513a.m261a("Error releasing connection", e2);
            }
        }
    }
}
