package com.iptv2.p043b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* compiled from: Utility */
/* renamed from: com.iptv2.b.e */
public final class C0595e {
    /* renamed from: a */
    public static final Locale f658a = Locale.getDefault();
    /* renamed from: b */
    private static final AtomicInteger f659b = new AtomicInteger(1);

    /* renamed from: a */
    public static byte[] m814a(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m806a(String str) {
        int length = str.length();
        int i = 0;
        if (length > 0) {
            int i2 = 0;
            while (i < length) {
                i2 = (i2 * 31) + str.charAt(i);
                i++;
            }
            i = i2;
        }
        return String.valueOf(i >= 0 ? (long) i : ((long) i) + IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }

    /* renamed from: b */
    public static String m816b(int i) {
        return String.format(f658a, "%02d:%02d", new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)});
    }

    /* renamed from: a */
    public static String m804a(long j) {
        if (j >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format(f658a, "%.1fMB", new Object[]{Float.valueOf((((float) j) / 1149239296) / 1149239296)});
        }
        return String.format(f658a, "%.1fKB", new Object[]{Float.valueOf(((float) j) / 1149239296)});
    }

    /* renamed from: b */
    public static boolean m817b(String str) {
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    /* renamed from: a */
    public static int m801a(TextView textView) {
        if (textView == null) {
            return 0;
        }
        Rect rect = new Rect();
        String charSequence = textView.getText().toString();
        textView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
        return rect.left + rect.width();
    }

    /* renamed from: a */
    public static int m800a() {
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        int i;
        int i2;
        do {
            i = f659b.get();
            i2 = i + 1;
            if (i2 > ViewCompat.MEASURED_SIZE_MASK) {
                i2 = 1;
            }
        } while (!f659b.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static void m809a(View view, Drawable drawable) {
        if (VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    /* renamed from: a */
    public static void m810a(final View view, final Runnable runnable) {
        if (view.getHeight() > 0) {
            runnable.run();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: a */
    public static int m802a(String str, Class<?> cls) {
        try {
            str = cls.getDeclaredField(str);
            return str.getInt(str);
        } catch (String str2) {
            str2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public static void m811a(TextView textView, String str, int i) {
        Paint paint = textView.getPaint();
        String[] split = str.replaceAll("\r", "").split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : split) {
            float f = (float) i;
            if (paint.measureText(str2) <= f) {
                stringBuilder.append(str2);
            } else {
                int i2 = 0;
                float f2 = 0.0f;
                while (i2 != str2.length()) {
                    char charAt = str2.charAt(i2);
                    f2 += paint.measureText(String.valueOf(charAt));
                    if (f2 <= f) {
                        stringBuilder.append(charAt);
                    } else {
                        stringBuilder.append("\n");
                        i2--;
                        f2 = 0.0f;
                    }
                    i2++;
                }
            }
            stringBuilder.append("\n");
        }
        if (str.endsWith("\n") == null) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        textView.setText(stringBuilder.toString());
    }

    /* renamed from: c */
    public static String m818c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            str = instance.digest();
            StringBuilder stringBuilder = new StringBuilder(str.length * 2);
            for (byte b : str) {
                int i = b & 255;
                if (i < 16) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(Integer.toHexString(i));
            }
            return stringBuilder.toString().toUpperCase(f658a);
        } catch (String str2) {
            C0591c.m792a("Utility", "md5", str2);
            return "";
        }
    }

    /* renamed from: a */
    public static void m812a(java.lang.Object r3, java.io.File r4, javax.crypto.Cipher r5) {
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
        r1 = new com.google.gson.e;	 Catch:{ Exception -> 0x0035 }
        r1.<init>();	 Catch:{ Exception -> 0x0035 }
        r3 = r1.m655a(r3);	 Catch:{ Exception -> 0x0035 }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x0035 }
        r2 = r4.getParent();	 Catch:{ Exception -> 0x0035 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0035 }
        r2 = r1.exists();	 Catch:{ Exception -> 0x0035 }
        if (r2 != 0) goto L_0x001c;	 Catch:{ Exception -> 0x0035 }
    L_0x0019:
        r1.mkdirs();	 Catch:{ Exception -> 0x0035 }
    L_0x001c:
        r1 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x0035 }
        r1.<init>(r4);	 Catch:{ Exception -> 0x0035 }
        r4 = 1;
        r3 = com.iptv2.p043b.C0586a.m776a(r5, r3, r4);	 Catch:{ Exception -> 0x0030, all -> 0x002d }
        r1.write(r3);	 Catch:{ Exception -> 0x0030, all -> 0x002d }
        r1.close();	 Catch:{ Exception -> 0x0042 }
        goto L_0x0042;
    L_0x002d:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0043;
    L_0x0030:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0036;
    L_0x0033:
        r3 = move-exception;
        goto L_0x0043;
    L_0x0035:
        r3 = move-exception;
    L_0x0036:
        r4 = "Utility";	 Catch:{ all -> 0x0033 }
        r5 = "saveObjectToFile";	 Catch:{ all -> 0x0033 }
        com.iptv2.p043b.C0591c.m792a(r4, r5, r3);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0042;
    L_0x003f:
        r0.close();	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        return;
    L_0x0043:
        if (r0 == 0) goto L_0x0048;
    L_0x0045:
        r0.close();	 Catch:{ Exception -> 0x0048 }
    L_0x0048:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.b.e.a(java.lang.Object, java.io.File, javax.crypto.Cipher):void");
    }

    /* renamed from: a */
    public static <T> T m803a(java.lang.Class<T> r2, java.io.File r3, javax.crypto.Cipher r4) {
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
        r1 = r3.exists();	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        if (r1 != 0) goto L_0x001e;	 Catch:{ Exception -> 0x0041, all -> 0x003f }
    L_0x0007:
        r2 = "Utility";	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r4.<init>();	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r1 = "readObjectfromFile, file not exists:";	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r4.append(r1);	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r4.append(r3);	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r3 = r4.toString();	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        com.iptv2.p043b.C0591c.m794b(r2, r3);	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        return r0;	 Catch:{ Exception -> 0x0041, all -> 0x003f }
    L_0x001e:
        r1 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0041, all -> 0x003f }
        r3 = r1.available();	 Catch:{ Exception -> 0x003d }
        r3 = new byte[r3];	 Catch:{ Exception -> 0x003d }
        r1.read(r3);	 Catch:{ Exception -> 0x003d }
        r3 = com.iptv2.p043b.C0586a.m775a(r4, r3);	 Catch:{ Exception -> 0x003d }
        r4 = new com.google.gson.e;	 Catch:{ Exception -> 0x003d }
        r4.<init>();	 Catch:{ Exception -> 0x003d }
        r2 = r4.m652a(r3, r2);	 Catch:{ Exception -> 0x003d }
        r1.close();	 Catch:{ Exception -> 0x0050 }
        goto L_0x0050;
    L_0x003d:
        r2 = move-exception;
        goto L_0x0043;
    L_0x003f:
        r2 = move-exception;
        goto L_0x0053;
    L_0x0041:
        r2 = move-exception;
        r1 = r0;
    L_0x0043:
        r3 = "Utility";	 Catch:{ all -> 0x0051 }
        r4 = "readObjectfromFile";	 Catch:{ all -> 0x0051 }
        com.iptv2.p043b.C0591c.m792a(r3, r4, r2);	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r1.close();	 Catch:{ Exception -> 0x004f }
    L_0x004f:
        r2 = r0;
    L_0x0050:
        return r2;
    L_0x0051:
        r2 = move-exception;
        r0 = r1;
    L_0x0053:
        if (r0 == 0) goto L_0x0058;
    L_0x0055:
        r0.close();	 Catch:{ Exception -> 0x0058 }
    L_0x0058:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.b.e.a(java.lang.Class, java.io.File, javax.crypto.Cipher):T");
    }

    /* renamed from: b */
    public static String m815b() {
        byte[] hardwareAddress;
        CharSequence charSequence;
        StringBuilder stringBuilder;
        int length;
        int i;
        String stringBuilder2;
        Exception e;
        IOException iOException;
        String str = "";
        String str2 = "";
        if (VERSION.SDK_INT > 23) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface.getName().equalsIgnoreCase("eth0")) {
                        hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            charSequence = "";
                        } else {
                            stringBuilder = new StringBuilder();
                            length = hardwareAddress.length;
                            for (i = 0; i < length; i++) {
                                stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                            }
                            if (stringBuilder.length() > 0) {
                                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                            }
                            stringBuilder2 = stringBuilder.toString();
                            try {
                                charSequence = stringBuilder2.replaceAll(":", "");
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(">=7.0======eth0:");
                                stringBuilder.append(charSequence);
                                Log.i("getmac", stringBuilder.toString());
                            } catch (Exception e2) {
                                e = e2;
                                str = stringBuilder2;
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            try {
                LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/eth0/address").getInputStream()));
                while (str2 != null) {
                    str2 = lineNumberReader.readLine();
                    if (str2 != null) {
                        str2 = str2.trim();
                        try {
                            str = str2.replaceAll(":", "");
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("<6.0======eth0:");
                            stringBuilder3.append(str);
                            Log.i("getmac", stringBuilder3.toString());
                            break;
                        } catch (IOException e4) {
                            String str3 = str2;
                            iOException = e4;
                            str = str3;
                            iOException.printStackTrace();
                            try {
                                for (NetworkInterface networkInterface2 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                                    if (networkInterface2.getName().equalsIgnoreCase("wlan0")) {
                                        hardwareAddress = networkInterface2.getHardwareAddress();
                                        if (hardwareAddress != null) {
                                            charSequence = "";
                                        } else {
                                            stringBuilder = new StringBuilder();
                                            length = hardwareAddress.length;
                                            for (i = 0; i < length; i++) {
                                                stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                                            }
                                            if (stringBuilder.length() > 0) {
                                                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                                            }
                                            stringBuilder2 = stringBuilder.toString();
                                            try {
                                                charSequence = stringBuilder2.replaceAll(":", "");
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append("======wlan0:");
                                                stringBuilder.append(charSequence);
                                                Log.i("getmac", stringBuilder.toString());
                                            } catch (Exception e5) {
                                                e = e5;
                                                str = stringBuilder2;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                            str = "";
                            Log.e("getMac", "get mac address fail");
                            return str.toUpperCase();
                        }
                    }
                }
            } catch (IOException e7) {
                iOException = e7;
                iOException.printStackTrace();
                for (NetworkInterface networkInterface22 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface22.getName().equalsIgnoreCase("wlan0")) {
                        hardwareAddress = networkInterface22.getHardwareAddress();
                        if (hardwareAddress != null) {
                            stringBuilder = new StringBuilder();
                            length = hardwareAddress.length;
                            for (i = 0; i < length; i++) {
                                stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                            }
                            if (stringBuilder.length() > 0) {
                                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                            }
                            stringBuilder2 = stringBuilder.toString();
                            charSequence = stringBuilder2.replaceAll(":", "");
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("======wlan0:");
                            stringBuilder.append(charSequence);
                            Log.i("getmac", stringBuilder.toString());
                        } else {
                            charSequence = "";
                        }
                    }
                }
                str = "";
                Log.e("getMac", "get mac address fail");
                return str.toUpperCase();
            }
        }
        if (str == null || TextUtils.isEmpty(str) || "020000000000".equals(str)) {
            for (NetworkInterface networkInterface222 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface222.getName().equalsIgnoreCase("wlan0")) {
                    hardwareAddress = networkInterface222.getHardwareAddress();
                    if (hardwareAddress != null) {
                        charSequence = "";
                    } else {
                        stringBuilder = new StringBuilder();
                        length = hardwareAddress.length;
                        for (i = 0; i < length; i++) {
                            stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                        }
                        if (stringBuilder.length() > 0) {
                            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        }
                        stringBuilder2 = stringBuilder.toString();
                        charSequence = stringBuilder2.replaceAll(":", "");
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("======wlan0:");
                        stringBuilder.append(charSequence);
                        Log.i("getmac", stringBuilder.toString());
                    }
                }
            }
        }
        if (str == null || TextUtils.isEmpty(str) || "020000000000".equals(str)) {
            str = "";
            Log.e("getMac", "get mac address fail");
        }
        return str.toUpperCase();
        e.printStackTrace();
        Log.i("getmac", "error occur");
        str = "";
        Log.e("getMac", "get mac address fail");
        return str.toUpperCase();
        e.printStackTrace();
        for (NetworkInterface networkInterface2222 : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            if (networkInterface2222.getName().equalsIgnoreCase("wlan0")) {
                hardwareAddress = networkInterface2222.getHardwareAddress();
                if (hardwareAddress != null) {
                    stringBuilder = new StringBuilder();
                    length = hardwareAddress.length;
                    for (i = 0; i < length; i++) {
                        stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                    }
                    if (stringBuilder.length() > 0) {
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    }
                    stringBuilder2 = stringBuilder.toString();
                    charSequence = stringBuilder2.replaceAll(":", "");
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("======wlan0:");
                    stringBuilder.append(charSequence);
                    Log.i("getmac", stringBuilder.toString());
                } else {
                    charSequence = "";
                }
            }
        }
        str = "";
        Log.e("getMac", "get mac address fail");
        return str.toUpperCase();
    }

    /* renamed from: a */
    public static java.lang.String m805a(java.io.File r7) {
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
        r0 = r7.isFile();	 Catch:{ Exception -> 0x0034 }
        r1 = 0;	 Catch:{ Exception -> 0x0034 }
        if (r0 != 0) goto L_0x0008;	 Catch:{ Exception -> 0x0034 }
    L_0x0007:
        return r1;	 Catch:{ Exception -> 0x0034 }
    L_0x0008:
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x0034 }
        r2 = new byte[r0];	 Catch:{ Exception -> 0x0034 }
        r3 = "MD5";	 Catch:{ Exception -> 0x002f }
        r3 = java.security.MessageDigest.getInstance(r3);	 Catch:{ Exception -> 0x002f }
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x002f }
        r4.<init>(r7);	 Catch:{ Exception -> 0x002f }
    L_0x0017:
        r7 = 0;	 Catch:{ Exception -> 0x002f }
        r5 = r4.read(r2, r7, r0);	 Catch:{ Exception -> 0x002f }
        r6 = -1;	 Catch:{ Exception -> 0x002f }
        if (r5 == r6) goto L_0x0023;	 Catch:{ Exception -> 0x002f }
    L_0x001f:
        r3.update(r2, r7, r5);	 Catch:{ Exception -> 0x002f }
        goto L_0x0017;	 Catch:{ Exception -> 0x002f }
    L_0x0023:
        r4.close();	 Catch:{ Exception -> 0x002f }
        r7 = r3.digest();	 Catch:{ Exception -> 0x0034 }
        r7 = com.iptv2.p043b.C0595e.m808a(r7);	 Catch:{ Exception -> 0x0034 }
        return r7;	 Catch:{ Exception -> 0x0034 }
    L_0x002f:
        r7 = move-exception;	 Catch:{ Exception -> 0x0034 }
        r7.printStackTrace();	 Catch:{ Exception -> 0x0034 }
        return r1;
    L_0x0034:
        r7 = "";
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.b.e.a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static java.lang.String m807a(java.lang.String r4, org.json.JSONArray r5) {
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
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x002d }
        r4.<init>();	 Catch:{ Exception -> 0x002d }
        r0 = r5.length();	 Catch:{ Exception -> 0x002d }
        r1 = 0;	 Catch:{ Exception -> 0x002d }
    L_0x000a:
        if (r1 >= r0) goto L_0x0027;	 Catch:{ Exception -> 0x002d }
    L_0x000c:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x002d }
        r2.<init>();	 Catch:{ Exception -> 0x002d }
        r3 = ",";	 Catch:{ Exception -> 0x002d }
        r2.append(r3);	 Catch:{ Exception -> 0x002d }
        r3 = r5.getString(r1);	 Catch:{ Exception -> 0x002d }
        r2.append(r3);	 Catch:{ Exception -> 0x002d }
        r2 = r2.toString();	 Catch:{ Exception -> 0x002d }
        r4.append(r2);	 Catch:{ Exception -> 0x002d }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x002d }
        goto L_0x000a;	 Catch:{ Exception -> 0x002d }
    L_0x0027:
        r5 = 1;	 Catch:{ Exception -> 0x002d }
        r4 = r4.substring(r5);	 Catch:{ Exception -> 0x002d }
        return r4;
    L_0x002d:
        r4 = "";
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.b.e.a(java.lang.String, org.json.JSONArray):java.lang.String");
    }

    /* renamed from: a */
    public static String m808a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (bArr != null) {
            if (bArr.length > 0) {
                for (byte b : bArr) {
                    String toHexString = Integer.toHexString(b & 255);
                    if (toHexString.length() < 2) {
                        stringBuilder.append(0);
                    }
                    stringBuilder.append(toHexString);
                }
                return stringBuilder.toString().toUpperCase();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m813a(String str, String str2, Context context) {
        if (str != null) {
            if (!str.equals("")) {
                StringBuilder stringBuilder;
                if (!(str.startsWith("http://") || str.startsWith("https://"))) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("http://");
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                }
                if (!TextUtils.isEmpty(str2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str.contains("?") != null ? "&" : "?");
                    stringBuilder.append("username=");
                    stringBuilder.append(str2);
                    str = stringBuilder.toString();
                }
                str2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                str2.addFlags(268435456);
                context.startActivity(str2);
                return true;
            }
        }
        return null;
    }
}
