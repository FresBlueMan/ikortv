package com.iptv2.core;

import android.util.Base64;
import android.util.Log;
import com.iptv2.p043b.C0591c;
import com.socks.library.KLog;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Application extends android.app.Application {
    /* renamed from: a */
    public static boolean f1062a = false;
    /* renamed from: b */
    public static boolean f1063b = false;
    /* renamed from: c */
    public static int f1064c;
    /* renamed from: d */
    public C0730c f1065d;
    /* renamed from: e */
    public Cipher f1066e;
    /* renamed from: f */
    public Cipher f1067f;

    public void onCreate() {
        super.onCreate();
        m1201a();
        this.f1065d = new C0730c(this);
        if (m1200a(this)) {
            C0591c.f644a = true;
        } else {
            C0591c.f644a = false;
            C0740e.f1315a = false;
            f1062a = false;
            f1063b = false;
            C0728b.f1230a = false;
        }
        KLog.init(C0591c.f644a, "iptv");
    }

    /* renamed from: a */
    public void m1201a() {
        try {
            int i = 0;
            String[] split = new String(Base64.decode("MTE1LDM0LC03NywxNiw0OCwtODQsLTExMiwtNjYsLTI1LDg2LC02NywxNiwtNTksNjMsLTYsLTEsODYsMjQsMzksMjMsNzUsLTExNiwxLDQ0LC0xMDQsNTMsLTE4LC00LDU3LC0xLC0xLDA=", 0)).split(",");
            byte[] bArr = new byte[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                bArr[i2] = (byte) Integer.parseInt(split[i2]);
            }
            split = new String(Base64.decode("LTE2LC00LDIyLDUzLC0xMjEsMzMsMTE2LC0yMyw5OCwtMjksOTIsOTcsLTc3LDEyNywtMSwxNQ==", 0)).split(",");
            byte[] bArr2 = new byte[split.length];
            while (i < split.length) {
                bArr2[i] = (byte) Integer.parseInt(split[i]);
                i++;
            }
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            this.f1066e = Cipher.getInstance("AES/CTR/NoPadding", "BC");
            this.f1066e.init(1, secretKeySpec, ivParameterSpec);
            this.f1067f = Cipher.getInstance("AES/CTR/NoPadding", "BC");
            this.f1067f.init(2, secretKeySpec, ivParameterSpec);
        } catch (Throwable e) {
            Log.e("Application", "init cipher", e);
        }
    }

    /* renamed from: a */
    public static boolean m1200a(android.content.Context r1) {
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
        r0 = 0;
        r1 = r1.getApplicationInfo();	 Catch:{ Exception -> 0x000d }
        r1 = r1.flags;	 Catch:{ Exception -> 0x000d }
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        r0 = 1;
    L_0x000c:
        return r0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.Application.a(android.content.Context):boolean");
    }
}
