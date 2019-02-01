package com.nostra13.universalimageloader.utils;

import android.util.Log;
import com.nostra13.universalimageloader.core.ImageLoader;

/* renamed from: com.nostra13.universalimageloader.utils.L */
public final class C0778L {
    private static final String LOG_FORMAT = "%1$s\n%2$s";
    private static volatile boolean writeDebugLogs = false;
    private static volatile boolean writeLogs = true;

    private C0778L() {
    }

    @Deprecated
    public static void enableLogging() {
        C0778L.writeLogs(true);
    }

    @Deprecated
    public static void disableLogging() {
        C0778L.writeLogs(false);
    }

    public static void writeDebugLogs(boolean z) {
        writeDebugLogs = z;
    }

    public static void writeLogs(boolean z) {
        writeLogs = z;
    }

    /* renamed from: d */
    public static void m1428d(String str, Object... objArr) {
        if (writeDebugLogs) {
            C0778L.log(3, null, str, objArr);
        }
    }

    /* renamed from: i */
    public static void m1432i(String str, Object... objArr) {
        C0778L.log(4, null, str, objArr);
    }

    /* renamed from: w */
    public static void m1433w(String str, Object... objArr) {
        C0778L.log(5, null, str, objArr);
    }

    /* renamed from: e */
    public static void m1430e(Throwable th) {
        C0778L.log(6, th, null, new Object[0]);
    }

    /* renamed from: e */
    public static void m1429e(String str, Object... objArr) {
        C0778L.log(6, null, str, objArr);
    }

    /* renamed from: e */
    public static void m1431e(Throwable th, String str, Object... objArr) {
        C0778L.log(6, th, str, objArr);
    }

    private static void log(int i, Throwable th, String str, Object... objArr) {
        if (writeLogs) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                th = Log.getStackTraceString(th);
                str = String.format(LOG_FORMAT, new Object[]{str, th});
            }
            Log.println(i, ImageLoader.TAG, str);
        }
    }
}
