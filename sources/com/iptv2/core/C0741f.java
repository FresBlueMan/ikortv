package com.iptv2.core;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: UiLocal */
/* renamed from: com.iptv2.core.f */
public final class C0741f {
    /* renamed from: a */
    private C0730c f1320a;
    /* renamed from: b */
    private JSONObject f1321b;
    /* renamed from: c */
    private JSONObject f1322c;
    /* renamed from: d */
    private HashMap<String, Object> f1323d = new HashMap();
    /* renamed from: e */
    private HashMap<String, Object> f1324e = new HashMap();
    /* renamed from: f */
    private String f1325f = "";

    public C0741f(C0730c c0730c) {
        this.f1320a = c0730c;
    }

    /* renamed from: a */
    public String m1345a() {
        return this.f1325f;
    }

    /* renamed from: a */
    public void m1346a(String str) {
        if (!this.f1325f.equals(str)) {
            this.f1325f = str;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("lang/lang.");
            stringBuilder.append(str);
            stringBuilder.append(".json");
            m1344f(stringBuilder.toString());
        }
    }

    /* renamed from: f */
    private void m1344f(java.lang.String r5) {
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
        r4 = this;
        r0 = "UiLocal";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "loadFromFile ";
        r1.append(r2);
        r1.append(r5);
        r1 = r1.toString();
        com.iptv2.p043b.C0591c.m791a(r0, r1);
        r0 = r4.f1323d;
        r0.clear();
        r0 = r4.f1324e;
        r0.clear();
        r0 = 0;
        r1 = r4.f1320a;	 Catch:{ Exception -> 0x0059, all -> 0x0054 }
        r1 = r1.f1271s;	 Catch:{ Exception -> 0x0059, all -> 0x0054 }
        r5 = r1.open(r5);	 Catch:{ Exception -> 0x0059, all -> 0x0054 }
        r0 = r5.available();	 Catch:{ Exception -> 0x0052 }
        r0 = new byte[r0];	 Catch:{ Exception -> 0x0052 }
        r5.read(r0);	 Catch:{ Exception -> 0x0052 }
        r1 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0052 }
        r2 = new java.lang.String;	 Catch:{ Exception -> 0x0052 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0052 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0052 }
        r0 = "label";	 Catch:{ Exception -> 0x0052 }
        r0 = r1.getJSONObject(r0);	 Catch:{ Exception -> 0x0052 }
        r4.f1321b = r0;	 Catch:{ Exception -> 0x0052 }
        r0 = "message";	 Catch:{ Exception -> 0x0052 }
        r0 = r1.getJSONObject(r0);	 Catch:{ Exception -> 0x0052 }
        r4.f1322c = r0;	 Catch:{ Exception -> 0x0052 }
        if (r5 == 0) goto L_0x0075;
    L_0x004e:
        r5.close();	 Catch:{ IOException -> 0x0075 }
        goto L_0x0075;
    L_0x0052:
        r0 = move-exception;
        goto L_0x005d;
    L_0x0054:
        r5 = move-exception;
        r3 = r0;
        r0 = r5;
        r5 = r3;
        goto L_0x0077;
    L_0x0059:
        r5 = move-exception;
        r3 = r0;
        r0 = r5;
        r5 = r3;
    L_0x005d:
        r1 = "UiLocal";	 Catch:{ all -> 0x0076 }
        r2 = "loadFromFile";	 Catch:{ all -> 0x0076 }
        com.iptv2.p043b.C0591c.m792a(r1, r2, r0);	 Catch:{ all -> 0x0076 }
        r0 = new org.json.JSONObject;	 Catch:{ all -> 0x0076 }
        r0.<init>();	 Catch:{ all -> 0x0076 }
        r4.f1321b = r0;	 Catch:{ all -> 0x0076 }
        r0 = new org.json.JSONObject;	 Catch:{ all -> 0x0076 }
        r0.<init>();	 Catch:{ all -> 0x0076 }
        r4.f1322c = r0;	 Catch:{ all -> 0x0076 }
        if (r5 == 0) goto L_0x0075;
    L_0x0074:
        goto L_0x004e;
    L_0x0075:
        return;
    L_0x0076:
        r0 = move-exception;
    L_0x0077:
        if (r5 == 0) goto L_0x007c;
    L_0x0079:
        r5.close();	 Catch:{ IOException -> 0x007c }
    L_0x007c:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.f.f(java.lang.String):void");
    }

    /* renamed from: b */
    public java.lang.String m1347b(java.lang.String r3) {
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
        r2 = this;
        r0 = r2.f1323d;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.containsKey(r3);	 Catch:{ Exception -> 0x0020 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x0020 }
    L_0x0008:
        r0 = r2.f1323d;	 Catch:{ Exception -> 0x0020 }
        r3 = r0.get(r3);	 Catch:{ Exception -> 0x0020 }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x0020 }
        goto L_0x001f;	 Catch:{ Exception -> 0x0020 }
    L_0x0011:
        r0 = r2.f1321b;	 Catch:{ Exception -> 0x0020 }
        r1 = "";	 Catch:{ Exception -> 0x0020 }
        r0 = r0.optString(r3, r1);	 Catch:{ Exception -> 0x0020 }
        r1 = r2.f1323d;	 Catch:{ Exception -> 0x0020 }
        r1.put(r3, r0);	 Catch:{ Exception -> 0x0020 }
        r3 = r0;
    L_0x001f:
        return r3;
    L_0x0020:
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.f.b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public java.lang.String[] m1348c(java.lang.String r6) {
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
        r5 = this;
        r0 = 0;
        r1 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r1 = r1.containsKey(r6);	 Catch:{ Exception -> 0x003f }
        if (r1 == 0) goto L_0x0014;	 Catch:{ Exception -> 0x003f }
    L_0x0009:
        r1 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r6 = r1.get(r6);	 Catch:{ Exception -> 0x003f }
        r6 = (java.lang.String[]) r6;	 Catch:{ Exception -> 0x003f }
        r6 = (java.lang.String[]) r6;	 Catch:{ Exception -> 0x003f }
        goto L_0x003e;	 Catch:{ Exception -> 0x003f }
    L_0x0014:
        r1 = r5.f1321b;	 Catch:{ Exception -> 0x003f }
        r1 = r1.optJSONArray(r6);	 Catch:{ Exception -> 0x003f }
        if (r1 == 0) goto L_0x0036;	 Catch:{ Exception -> 0x003f }
    L_0x001c:
        r2 = r1.length();	 Catch:{ Exception -> 0x003f }
        r2 = new java.lang.String[r2];	 Catch:{ Exception -> 0x003f }
        r3 = 0;	 Catch:{ Exception -> 0x003f }
    L_0x0023:
        r4 = r1.length();	 Catch:{ Exception -> 0x003f }
        if (r3 >= r4) goto L_0x0034;	 Catch:{ Exception -> 0x003f }
    L_0x0029:
        r4 = "";	 Catch:{ Exception -> 0x003f }
        r4 = r1.optString(r3, r4);	 Catch:{ Exception -> 0x003f }
        r2[r3] = r4;	 Catch:{ Exception -> 0x003f }
        r3 = r3 + 1;	 Catch:{ Exception -> 0x003f }
        goto L_0x0023;	 Catch:{ Exception -> 0x003f }
    L_0x0034:
        r1 = r2;	 Catch:{ Exception -> 0x003f }
        goto L_0x0038;	 Catch:{ Exception -> 0x003f }
    L_0x0036:
        r1 = new java.lang.String[r0];	 Catch:{ Exception -> 0x003f }
    L_0x0038:
        r2 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r2.put(r6, r1);	 Catch:{ Exception -> 0x003f }
        r6 = r1;
    L_0x003e:
        return r6;
    L_0x003f:
        r6 = new java.lang.String[r0];
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.f.c(java.lang.String):java.lang.String[]");
    }

    /* renamed from: d */
    public java.util.LinkedHashMap<java.lang.String, java.lang.String> m1349d(java.lang.String r6) {
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
        r5 = this;
        r0 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r0 = r0.containsKey(r6);	 Catch:{ Exception -> 0x003f }
        if (r0 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x003f }
    L_0x0008:
        r0 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r6 = r0.get(r6);	 Catch:{ Exception -> 0x003f }
        r6 = (java.util.LinkedHashMap) r6;	 Catch:{ Exception -> 0x003f }
        goto L_0x003e;	 Catch:{ Exception -> 0x003f }
    L_0x0011:
        r0 = r5.f1321b;	 Catch:{ Exception -> 0x003f }
        r0 = r0.optJSONObject(r6);	 Catch:{ Exception -> 0x003f }
        r1 = new java.util.LinkedHashMap;	 Catch:{ Exception -> 0x003f }
        r1.<init>();	 Catch:{ Exception -> 0x003f }
        if (r0 == 0) goto L_0x0038;	 Catch:{ Exception -> 0x003f }
    L_0x001e:
        r2 = r0.keys();	 Catch:{ Exception -> 0x003f }
    L_0x0022:
        r3 = r2.hasNext();	 Catch:{ Exception -> 0x003f }
        if (r3 == 0) goto L_0x0038;	 Catch:{ Exception -> 0x003f }
    L_0x0028:
        r3 = r2.next();	 Catch:{ Exception -> 0x003f }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x003f }
        r4 = "";	 Catch:{ Exception -> 0x003f }
        r4 = r0.optString(r3, r4);	 Catch:{ Exception -> 0x003f }
        r1.put(r3, r4);	 Catch:{ Exception -> 0x003f }
        goto L_0x0022;	 Catch:{ Exception -> 0x003f }
    L_0x0038:
        r0 = r5.f1323d;	 Catch:{ Exception -> 0x003f }
        r0.put(r6, r1);	 Catch:{ Exception -> 0x003f }
        r6 = r1;
    L_0x003e:
        return r6;
    L_0x003f:
        r6 = new java.util.LinkedHashMap;
        r6.<init>();
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.f.d(java.lang.String):java.util.LinkedHashMap<java.lang.String, java.lang.String>");
    }

    /* renamed from: e */
    public java.lang.String m1350e(java.lang.String r3) {
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
        r2 = this;
        r0 = r2.f1324e;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.containsKey(r3);	 Catch:{ Exception -> 0x0020 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x0020 }
    L_0x0008:
        r0 = r2.f1324e;	 Catch:{ Exception -> 0x0020 }
        r3 = r0.get(r3);	 Catch:{ Exception -> 0x0020 }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x0020 }
        goto L_0x001f;	 Catch:{ Exception -> 0x0020 }
    L_0x0011:
        r0 = r2.f1322c;	 Catch:{ Exception -> 0x0020 }
        r1 = "";	 Catch:{ Exception -> 0x0020 }
        r0 = r0.optString(r3, r1);	 Catch:{ Exception -> 0x0020 }
        r1 = r2.f1324e;	 Catch:{ Exception -> 0x0020 }
        r1.put(r3, r0);	 Catch:{ Exception -> 0x0020 }
        r3 = r0;
    L_0x001f:
        return r3;
    L_0x0020:
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.f.e(java.lang.String):java.lang.String");
    }
}
