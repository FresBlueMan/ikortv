package tv.danmaku.ijk.media.player.pragma;

import android.util.Log;
import java.util.Locale;

public class DebugLog {
    public static final boolean ENABLE_DEBUG = true;
    public static final boolean ENABLE_ERROR = true;
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_VERBOSE = true;
    public static final boolean ENABLE_WARN = true;

    /* renamed from: e */
    public static void m1464e(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: e */
    public static void m1465e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: i */
    public static void m1466i(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: i */
    public static void m1467i(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    public static void ifmt(String str, String str2, Object... objArr) {
        Log.i(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: w */
    public static void m1470w(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: w */
    public static void m1471w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void wfmt(String str, String str2, Object... objArr) {
        Log.w(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: d */
    public static void m1462d(String str, String str2) {
        Log.d(str, str2);
    }

    /* renamed from: d */
    public static void m1463d(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }

    public static void dfmt(String str, String str2, Object... objArr) {
        Log.d(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: v */
    public static void m1468v(String str, String str2) {
        Log.v(str, str2);
    }

    /* renamed from: v */
    public static void m1469v(String str, String str2, Throwable th) {
        Log.v(str, str2, th);
    }

    public static void vfmt(String str, String str2, Object... objArr) {
        Log.v(str, String.format(Locale.US, str2, objArr));
    }

    public static void printStackTrace(Throwable th) {
        th.printStackTrace();
    }

    public static void printCause(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            th = cause;
        }
        printStackTrace(th);
    }
}
