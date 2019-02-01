package com.google.gson.internal;

/* compiled from: $Gson$Preconditions */
/* renamed from: com.google.gson.internal.a */
public final class C0455a {
    /* renamed from: a */
    public static <T> T m663a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m664a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
