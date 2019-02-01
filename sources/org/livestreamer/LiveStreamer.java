package org.livestreamer;

import com.iptv2.p043b.C0591c;

public class LiveStreamer {
    private static final String TAG = "LiveStreamer";
    private static LiveStreamer instance = null;

    public native void enableLogCache();

    public native void enableLogConsole();

    public native void start(String str, String str2, String str3, String str4, String str5, String str6, boolean z);

    public native void stop();

    static {
        try {
            System.loadLibrary("livestreamer");
        } catch (Throwable e) {
            C0591c.m792a(TAG, "load livestream lib err!", e);
        }
    }

    private LiveStreamer() {
    }

    public static LiveStreamer getInstance() {
        if (instance == null) {
            instance = new LiveStreamer();
        }
        return instance;
    }

    public static void deInstance() {
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
        r0 = instance;	 Catch:{ Exception -> 0x000c }
        if (r0 == 0) goto L_0x0009;	 Catch:{ Exception -> 0x000c }
    L_0x0004:
        r0 = instance;	 Catch:{ Exception -> 0x000c }
        r0.stop();	 Catch:{ Exception -> 0x000c }
    L_0x0009:
        r0 = 0;	 Catch:{ Exception -> 0x000c }
        instance = r0;	 Catch:{ Exception -> 0x000c }
    L_0x000c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.livestreamer.LiveStreamer.deInstance():void");
    }
}
