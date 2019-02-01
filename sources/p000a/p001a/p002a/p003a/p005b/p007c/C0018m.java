package p000a.p001a.p002a.p003a.p005b.p007c;

import java.net.URI;
import java.util.LinkedList;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0175y;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.p005b.p006a.C0013a;
import p000a.p001a.p002a.p003a.p031k.C0144q;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestBuilder */
/* renamed from: a.a.a.a.b.c.m */
public class C0018m {
    /* renamed from: a */
    private String f62a;
    /* renamed from: b */
    private ac f63b;
    /* renamed from: c */
    private URI f64c;
    /* renamed from: d */
    private C0144q f65d;
    /* renamed from: e */
    private C0149k f66e;
    /* renamed from: f */
    private LinkedList<C0175y> f67f;
    /* renamed from: g */
    private C0013a f68g;

    /* compiled from: RequestBuilder */
    /* renamed from: a.a.a.a.b.c.m$b */
    static class C1342b extends C1317k {
        /* renamed from: a */
        private final String f2324a;

        C1342b(String str) {
            this.f2324a = str;
        }

        public String getMethod() {
            return this.f2324a;
        }
    }

    /* compiled from: RequestBuilder */
    /* renamed from: a.a.a.a.b.c.m$a */
    static class C1361a extends C1339e {
        /* renamed from: a */
        private final String f2467a;

        C1361a(String str) {
            this.f2467a = str;
        }

        public String getMethod() {
            return this.f2467a;
        }
    }

    C0018m(String str) {
        this.f62a = str;
    }

    C0018m() {
        this(null);
    }

    /* renamed from: a */
    public static C0018m m69a(C0915q c0915q) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        return new C0018m().m70b(c0915q);
    }

    /* renamed from: b */
    private C0018m m70b(C0915q c0915q) {
        if (c0915q == null) {
            return this;
        }
        this.f62a = c0915q.getRequestLine().mo143a();
        this.f63b = c0915q.getRequestLine().mo144b();
        if (c0915q instanceof C1238l) {
            this.f64c = ((C1238l) c0915q).getURI();
        } else {
            this.f64c = URI.create(c0915q.getRequestLine().mo145c());
        }
        if (this.f65d == null) {
            this.f65d = new C0144q();
        }
        this.f65d.m405a();
        this.f65d.m407a(c0915q.getAllHeaders());
        if (c0915q instanceof C1285l) {
            this.f66e = ((C1285l) c0915q).getEntity();
        } else {
            this.f66e = null;
        }
        if (c0915q instanceof C0017d) {
            this.f68g = ((C0017d) c0915q).getConfig();
        } else {
            this.f68g = null;
        }
        this.f67f = null;
        return this;
    }

    /* renamed from: a */
    public C0018m m72a(URI uri) {
        this.f64c = uri;
        return this;
    }

    /* renamed from: a */
    public p000a.p001a.p002a.p003a.p005b.p007c.C1238l m71a() {
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
        r4 = this;
        r0 = r4.f64c;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r4.f64c;
        goto L_0x000d;
    L_0x0007:
        r0 = "/";
        r0 = java.net.URI.create(r0);
    L_0x000d:
        r1 = r4.f66e;
        r2 = r4.f67f;
        if (r2 == 0) goto L_0x004b;
    L_0x0013:
        r2 = r4.f67f;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x004b;
    L_0x001b:
        if (r1 != 0) goto L_0x003b;
    L_0x001d:
        r2 = "POST";
        r3 = r4.f62a;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0031;
    L_0x0027:
        r2 = "PUT";
        r3 = r4.f62a;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x003b;
    L_0x0031:
        r1 = new a.a.a.a.b.b.a;
        r2 = r4.f67f;
        r3 = p000a.p001a.p002a.p003a.p034n.C0156d.f301a;
        r1.<init>(r2, r3);
        goto L_0x004b;
    L_0x003b:
        r2 = new a.a.a.a.b.f.c;	 Catch:{ URISyntaxException -> 0x004b }
        r2.<init>(r0);	 Catch:{ URISyntaxException -> 0x004b }
        r3 = r4.f67f;	 Catch:{ URISyntaxException -> 0x004b }
        r2 = r2.m99a(r3);	 Catch:{ URISyntaxException -> 0x004b }
        r2 = r2.m100a();	 Catch:{ URISyntaxException -> 0x004b }
        r0 = r2;
    L_0x004b:
        if (r1 != 0) goto L_0x0055;
    L_0x004d:
        r1 = new a.a.a.a.b.c.m$b;
        r2 = r4.f62a;
        r1.<init>(r2);
        goto L_0x0060;
    L_0x0055:
        r2 = new a.a.a.a.b.c.m$a;
        r3 = r4.f62a;
        r2.<init>(r3);
        r2.setEntity(r1);
        r1 = r2;
    L_0x0060:
        r2 = r4.f63b;
        r1.setProtocolVersion(r2);
        r1.setURI(r0);
        r0 = r4.f65d;
        if (r0 == 0) goto L_0x0075;
    L_0x006c:
        r0 = r4.f65d;
        r0 = r0.m411b();
        r1.setHeaders(r0);
    L_0x0075:
        r0 = r4.f68g;
        r1.setConfig(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.b.c.m.a():a.a.a.a.b.c.l");
    }
}
