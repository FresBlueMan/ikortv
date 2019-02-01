package com.socks.library.klog;

public class JsonLog {
    public static void printJson(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
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
        r0 = "{";	 Catch:{ JSONException -> 0x0026 }
        r0 = r6.startsWith(r0);	 Catch:{ JSONException -> 0x0026 }
        r1 = 4;	 Catch:{ JSONException -> 0x0026 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ JSONException -> 0x0026 }
    L_0x0009:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0026 }
        r0.<init>(r6);	 Catch:{ JSONException -> 0x0026 }
        r0 = r0.toString(r1);	 Catch:{ JSONException -> 0x0026 }
    L_0x0012:
        r6 = r0;	 Catch:{ JSONException -> 0x0026 }
        goto L_0x0026;	 Catch:{ JSONException -> 0x0026 }
    L_0x0014:
        r0 = "[";	 Catch:{ JSONException -> 0x0026 }
        r0 = r6.startsWith(r0);	 Catch:{ JSONException -> 0x0026 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ JSONException -> 0x0026 }
    L_0x001c:
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0026 }
        r0.<init>(r6);	 Catch:{ JSONException -> 0x0026 }
        r0 = r0.toString(r1);	 Catch:{ JSONException -> 0x0026 }
        goto L_0x0012;
    L_0x0026:
        r0 = 1;
        com.socks.library.KLogUtil.printLine(r5, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r7);
        r7 = com.socks.library.KLog.LINE_SEPARATOR;
        r0.append(r7);
        r0.append(r6);
        r6 = r0.toString();
        r7 = com.socks.library.KLog.LINE_SEPARATOR;
        r6 = r6.split(r7);
        r7 = r6.length;
        r0 = 0;
        r1 = 0;
    L_0x0047:
        if (r1 >= r7) goto L_0x0062;
    L_0x0049:
        r2 = r6[r1];
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "║ ";
        r3.append(r4);
        r3.append(r2);
        r2 = r3.toString();
        android.util.Log.d(r5, r2);
        r1 = r1 + 1;
        goto L_0x0047;
    L_0x0062:
        com.socks.library.KLogUtil.printLine(r5, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.socks.library.klog.JsonLog.printJson(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
