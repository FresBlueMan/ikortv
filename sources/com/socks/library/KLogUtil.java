package com.socks.library;

import android.text.TextUtils;
import android.util.Log;

public class KLogUtil {
    public static boolean isEmpty(String str) {
        if (!(TextUtils.isEmpty(str) || str.equals("\n") || str.equals("\t"))) {
            if (TextUtils.isEmpty(str.trim()) == null) {
                return null;
            }
        }
        return true;
    }

    public static void printLine(String str, boolean z) {
        if (z) {
            Log.d(str, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.d(str, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }
}
