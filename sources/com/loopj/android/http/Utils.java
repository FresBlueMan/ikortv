package com.loopj.android.http;

class Utils {
    private Utils() {
    }

    public static void asserts(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    public static <T> T notNull(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" should not be null!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
