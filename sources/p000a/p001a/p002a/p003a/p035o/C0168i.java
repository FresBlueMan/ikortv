package p000a.p001a.p002a.p003a.p035o;

import java.util.Map;

/* compiled from: VersionInfo */
/* renamed from: a.a.a.a.o.i */
public class C0168i {
    /* renamed from: a */
    private final String f313a;
    /* renamed from: b */
    private final String f314b;
    /* renamed from: c */
    private final String f315c;
    /* renamed from: d */
    private final String f316d;
    /* renamed from: e */
    private final String f317e;

    protected C0168i(String str, String str2, String str3, String str4, String str5) {
        C0160a.m478a((Object) str, "Package identifier");
        this.f313a = str;
        if (str2 == null) {
            str2 = "UNAVAILABLE";
        }
        this.f314b = str2;
        if (str3 == null) {
            str3 = "UNAVAILABLE";
        }
        this.f315c = str3;
        if (str4 == null) {
            str4 = "UNAVAILABLE";
        }
        this.f316d = str4;
        if (str5 == null) {
            str5 = "UNAVAILABLE";
        }
        this.f317e = str5;
    }

    /* renamed from: a */
    public final String m531a() {
        return this.f315c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(((((this.f313a.length() + 20) + this.f314b.length()) + this.f315c.length()) + this.f316d.length()) + this.f317e.length());
        stringBuilder.append("VersionInfo(");
        stringBuilder.append(this.f313a);
        stringBuilder.append(':');
        stringBuilder.append(this.f314b);
        if (!"UNAVAILABLE".equals(this.f315c)) {
            stringBuilder.append(':');
            stringBuilder.append(this.f315c);
        }
        if (!"UNAVAILABLE".equals(this.f316d)) {
            stringBuilder.append(':');
            stringBuilder.append(this.f316d);
        }
        stringBuilder.append(')');
        if (!"UNAVAILABLE".equals(this.f317e)) {
            stringBuilder.append('@');
            stringBuilder.append(this.f317e);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static p000a.p001a.p002a.p003a.p035o.C0168i m529a(java.lang.String r4, java.lang.ClassLoader r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r0 = "Package identifier";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r4, r0);
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0010;
    L_0x0008:
        r5 = java.lang.Thread.currentThread();
        r5 = r5.getContextClassLoader();
    L_0x0010:
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0046 }
        r1.<init>();	 Catch:{ IOException -> 0x0046 }
        r2 = 46;	 Catch:{ IOException -> 0x0046 }
        r3 = 47;	 Catch:{ IOException -> 0x0046 }
        r2 = r4.replace(r2, r3);	 Catch:{ IOException -> 0x0046 }
        r1.append(r2);	 Catch:{ IOException -> 0x0046 }
        r2 = "/";	 Catch:{ IOException -> 0x0046 }
        r1.append(r2);	 Catch:{ IOException -> 0x0046 }
        r2 = "version.properties";	 Catch:{ IOException -> 0x0046 }
        r1.append(r2);	 Catch:{ IOException -> 0x0046 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0046 }
        r1 = r5.getResourceAsStream(r1);	 Catch:{ IOException -> 0x0046 }
        if (r1 == 0) goto L_0x0046;
    L_0x0035:
        r2 = new java.util.Properties;	 Catch:{ all -> 0x0041 }
        r2.<init>();	 Catch:{ all -> 0x0041 }
        r2.load(r1);	 Catch:{ all -> 0x0041 }
        r1.close();	 Catch:{ IOException -> 0x0047 }
        goto L_0x0047;
    L_0x0041:
        r2 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0046 }
        throw r2;	 Catch:{ IOException -> 0x0046 }
    L_0x0046:
        r2 = r0;
    L_0x0047:
        if (r2 == 0) goto L_0x004d;
    L_0x0049:
        r0 = p000a.p001a.p002a.p003a.p035o.C0168i.m530a(r4, r2, r5);
    L_0x004d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.o.i.a(java.lang.String, java.lang.ClassLoader):a.a.a.a.o.i");
    }

    /* renamed from: a */
    protected static C0168i m530a(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        C0160a.m478a((Object) str, "Package identifier");
        String str5 = null;
        if (map != null) {
            String str6 = (String) map.get("info.module");
            if (str6 != null && str6.length() < 1) {
                str6 = null;
            }
            String str7 = (String) map.get("info.release");
            if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                str7 = null;
            }
            String str8 = (String) map.get("info.timestamp");
            str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
            str3 = str6;
            str4 = str7;
        } else {
            str3 = null;
            str4 = str3;
            str2 = str4;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new C0168i(str, str3, str4, str2, str5);
    }
}
