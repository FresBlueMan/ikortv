package com.iptv2.p043b;

import android.util.Log;

/* compiled from: Log */
/* renamed from: com.iptv2.b.c */
public class C0591c {
    /* renamed from: a */
    public static boolean f644a = false;

    /* renamed from: a */
    public static void m790a(String str) {
        if (f644a) {
            Log.d("iptv", str);
        }
    }

    /* renamed from: b */
    public static void m793b(String str) {
        if (f644a) {
            Log.e("iptv", str);
        }
    }

    /* renamed from: a */
    public static void m791a(String str, String str2) {
        if (f644a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m794b(String str, String str2) {
        if (f644a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m792a(String str, String str2, Throwable th) {
        if (f644a) {
            Log.e(str, str2, th);
        }
    }
}
