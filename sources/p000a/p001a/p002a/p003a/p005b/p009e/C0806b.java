package p000a.p001a.p002a.p003a.p005b.p009e;

import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.p021h.C0097b;

/* compiled from: RequestAddCookies */
/* renamed from: a.a.a.a.b.e.b */
public class C0806b implements C0170r {
    /* renamed from: a */
    public C0097b f1425a = new C0097b(getClass());

    public void process(p000a.p001a.p002a.p003a.C0915q r12, p000a.p001a.p002a.p003a.p034n.C0157e r13) {
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
        r0 = "HTTP request";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r12, r0);
        r0 = "HTTP context";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r13, r0);
        r0 = r12.getRequestLine();
        r0 = r0.mo143a();
        r1 = "CONNECT";
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r0 = p000a.p001a.p002a.p003a.p005b.p009e.C1239a.m2524a(r13);
        r1 = r0.m2528b();
        if (r1 != 0) goto L_0x002d;
    L_0x0025:
        r12 = r11.f1425a;
        r13 = "Cookie store not specified in HTTP context";
        r12.m260a(r13);
        return;
    L_0x002d:
        r2 = r0.m2531e();
        if (r2 != 0) goto L_0x003b;
    L_0x0033:
        r12 = r11.f1425a;
        r13 = "CookieSpec registry not specified in HTTP context";
        r12.m260a(r13);
        return;
    L_0x003b:
        r3 = r0.m1918o();
        if (r3 != 0) goto L_0x0049;
    L_0x0041:
        r12 = r11.f1425a;
        r13 = "Target host not set in the context";
        r12.m260a(r13);
        return;
    L_0x0049:
        r4 = r0.m2526a();
        if (r4 != 0) goto L_0x0057;
    L_0x004f:
        r12 = r11.f1425a;
        r13 = "Connection route not set in the context";
        r12.m260a(r13);
        return;
    L_0x0057:
        r5 = r0.m2537k();
        r5 = r5.m57a();
        if (r5 != 0) goto L_0x0063;
    L_0x0061:
        r5 = "best-match";
    L_0x0063:
        r6 = r11.f1425a;
        r6 = r6.m262a();
        if (r6 == 0) goto L_0x0081;
    L_0x006b:
        r6 = r11.f1425a;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "CookieSpec selected: ";
        r7.append(r8);
        r7.append(r5);
        r7 = r7.toString();
        r6.m260a(r7);
    L_0x0081:
        r6 = r12 instanceof p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
        r7 = 0;
        if (r6 == 0) goto L_0x008e;
    L_0x0086:
        r6 = r12;
        r6 = (p000a.p001a.p002a.p003a.p005b.p007c.C1238l) r6;
        r6 = r6.getURI();
        goto L_0x009d;
    L_0x008e:
        r6 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x009c }
        r8 = r12.getRequestLine();	 Catch:{ URISyntaxException -> 0x009c }
        r8 = r8.mo145c();	 Catch:{ URISyntaxException -> 0x009c }
        r6.<init>(r8);	 Catch:{ URISyntaxException -> 0x009c }
        goto L_0x009d;
    L_0x009c:
        r6 = r7;
    L_0x009d:
        if (r6 == 0) goto L_0x00a3;
    L_0x009f:
        r7 = r6.getPath();
    L_0x00a3:
        r6 = r3.m470a();
        r3 = r3.m471b();
        if (r3 >= 0) goto L_0x00b5;
    L_0x00ad:
        r3 = r4.mo10a();
        r3 = r3.m471b();
    L_0x00b5:
        r8 = new a.a.a.a.f.e;
        r9 = 0;
        if (r3 < 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00bc;
    L_0x00bb:
        r3 = 0;
    L_0x00bc:
        r10 = p000a.p001a.p002a.p003a.p035o.C0167h.m527a(r7);
        if (r10 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c5;
    L_0x00c3:
        r7 = "/";
    L_0x00c5:
        r4 = r4.mo17g();
        r8.<init>(r6, r3, r7, r4);
        r2 = r2.mo2b(r5);
        r2 = (p000a.p001a.p002a.p003a.p019f.C0090j) r2;
        if (r2 == 0) goto L_0x01ac;
    L_0x00d4:
        r0 = r2.mo26a(r0);
        r2 = new java.util.ArrayList;
        r1 = r1.getCookies();
        r2.<init>(r1);
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = new java.util.Date;
        r3.<init>();
        r2 = r2.iterator();
    L_0x00ef:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0155;
    L_0x00f5:
        r4 = r2.next();
        r4 = (p000a.p001a.p002a.p003a.p019f.C0083b) r4;
        r5 = r4.mo1609a(r3);
        if (r5 != 0) goto L_0x0131;
    L_0x0101:
        r5 = r0.mo101b(r4, r8);
        if (r5 == 0) goto L_0x00ef;
    L_0x0107:
        r5 = r11.f1425a;
        r5 = r5.m262a();
        if (r5 == 0) goto L_0x012d;
    L_0x010f:
        r5 = r11.f1425a;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "Cookie ";
        r6.append(r7);
        r6.append(r4);
        r7 = " match ";
        r6.append(r7);
        r6.append(r8);
        r6 = r6.toString();
        r5.m260a(r6);
    L_0x012d:
        r1.add(r4);
        goto L_0x00ef;
    L_0x0131:
        r5 = r11.f1425a;
        r5 = r5.m262a();
        if (r5 == 0) goto L_0x00ef;
    L_0x0139:
        r5 = r11.f1425a;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "Cookie ";
        r6.append(r7);
        r6.append(r4);
        r4 = " expired";
        r6.append(r4);
        r4 = r6.toString();
        r5.m260a(r4);
        goto L_0x00ef;
    L_0x0155:
        r2 = r1.isEmpty();
        if (r2 != 0) goto L_0x0173;
    L_0x015b:
        r2 = r0.mo98a(r1);
        r2 = r2.iterator();
    L_0x0163:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0173;
    L_0x0169:
        r3 = r2.next();
        r3 = (p000a.p001a.p002a.p003a.C0082e) r3;
        r12.addHeader(r3);
        goto L_0x0163;
    L_0x0173:
        r2 = r0.mo96a();
        if (r2 <= 0) goto L_0x01a1;
    L_0x0179:
        r1 = r1.iterator();
    L_0x017d:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0196;
    L_0x0183:
        r3 = r1.next();
        r3 = (p000a.p001a.p002a.p003a.p019f.C0083b) r3;
        r4 = r3.mo1623j();
        if (r2 != r4) goto L_0x0193;
    L_0x018f:
        r3 = r3 instanceof p000a.p001a.p002a.p003a.p019f.C1255n;
        if (r3 != 0) goto L_0x017d;
    L_0x0193:
        r3 = 1;
        r9 = 1;
        goto L_0x017d;
    L_0x0196:
        if (r9 == 0) goto L_0x01a1;
    L_0x0198:
        r1 = r0.mo100b();
        if (r1 == 0) goto L_0x01a1;
    L_0x019e:
        r12.addHeader(r1);
    L_0x01a1:
        r12 = "http.cookie-spec";
        r13.mo160a(r12, r0);
        r12 = "http.cookie-origin";
        r13.mo160a(r12, r8);
        return;
    L_0x01ac:
        r12 = new a.a.a.a.m;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r0 = "Unsupported cookie policy: ";
        r13.append(r0);
        r13.append(r5);
        r13 = r13.toString();
        r12.<init>(r13);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.b.e.b.process(a.a.a.a.q, a.a.a.a.n.e):void");
    }
}
