package com.google.gson.p039b;

import com.google.gson.internal.C0455a;
import com.google.gson.internal.C0459b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken */
/* renamed from: com.google.gson.b.a */
public class C0444a<T> {
    /* renamed from: a */
    final Class<? super T> f357a;
    /* renamed from: b */
    final Type f358b;
    /* renamed from: c */
    final int f359c;

    protected C0444a() {
        this.f358b = C0444a.m570a(getClass());
        this.f357a = C0459b.m682e(this.f358b);
        this.f359c = this.f358b.hashCode();
    }

    C0444a(Type type) {
        this.f358b = C0459b.m681d((Type) C0455a.m663a((Object) type));
        this.f357a = C0459b.m682e(this.f358b);
        this.f359c = this.f358b.hashCode();
    }

    /* renamed from: a */
    static Type m570a(Class<?> cls) {
        cls = cls.getGenericSuperclass();
        if (!(cls instanceof Class)) {
            return C0459b.m681d(((ParameterizedType) cls).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> m572a() {
        return this.f357a;
    }

    /* renamed from: b */
    public final Type m573b() {
        return this.f358b;
    }

    public final int hashCode() {
        return this.f359c;
    }

    public final boolean equals(Object obj) {
        return (!(obj instanceof C0444a) || C0459b.m676a(this.f358b, ((C0444a) obj).f358b) == null) ? null : true;
    }

    public final String toString() {
        return C0459b.m683f(this.f358b);
    }

    /* renamed from: a */
    public static C0444a<?> m569a(Type type) {
        return new C0444a(type);
    }

    /* renamed from: b */
    public static <T> C0444a<T> m571b(Class<T> cls) {
        return new C0444a(cls);
    }
}
