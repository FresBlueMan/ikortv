package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Primitives */
/* renamed from: com.google.gson.internal.h */
public final class C0477h {
    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f503a;
    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f504b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        C0477h.m718a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        C0477h.m718a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        C0477h.m718a(hashMap, hashMap2, Character.TYPE, Character.class);
        C0477h.m718a(hashMap, hashMap2, Double.TYPE, Double.class);
        C0477h.m718a(hashMap, hashMap2, Float.TYPE, Float.class);
        C0477h.m718a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        C0477h.m718a(hashMap, hashMap2, Long.TYPE, Long.class);
        C0477h.m718a(hashMap, hashMap2, Short.TYPE, Short.class);
        C0477h.m718a(hashMap, hashMap2, Void.TYPE, Void.class);
        f503a = Collections.unmodifiableMap(hashMap);
        f504b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m718a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m719a(Type type) {
        return f503a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m717a(Class<T> cls) {
        Class<T> cls2 = (Class) f503a.get(C0455a.m663a((Object) cls));
        return cls2 == null ? cls : cls2;
    }
}
