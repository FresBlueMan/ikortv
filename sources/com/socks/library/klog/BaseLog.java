package com.socks.library.klog;

import android.util.Log;

public class BaseLog {
    private static final int MAX_LENGTH = 4000;

    public static void printDefault(int i, String str, String str2) {
        int length = str2.length();
        int i2 = length / MAX_LENGTH;
        if (i2 > 0) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + MAX_LENGTH;
                printSub(i, str, str2.substring(i4, i5));
                i3++;
                i4 = i5;
            }
            printSub(i, str, str2.substring(i4, length));
            return;
        }
        printSub(i, str, str2);
    }

    private static void printSub(int i, String str, String str2) {
        switch (i) {
            case 1:
                Log.v(str, str2);
                return;
            case 2:
                Log.d(str, str2);
                return;
            case 3:
                Log.i(str, str2);
                return;
            case 4:
                Log.w(str, str2);
                return;
            case 5:
                Log.e(str, str2);
                return;
            case 6:
                Log.wtf(str, str2);
                return;
            default:
                return;
        }
    }
}
