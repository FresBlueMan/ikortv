package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C1002a;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper */
/* renamed from: com.google.gson.internal.bind.h */
final class C1013h<T> extends C0487t<T> {
    /* renamed from: a */
    private final C0451e f1814a;
    /* renamed from: b */
    private final C0487t<T> f1815b;
    /* renamed from: c */
    private final Type f1816c;

    C1013h(C0451e c0451e, C0487t<T> c0487t, Type type) {
        this.f1814a = c0451e;
        this.f1815b = c0487t;
        this.f1816c = type;
    }

    /* renamed from: b */
    public T mo1260b(C0446a c0446a) {
        return this.f1815b.mo1260b(c0446a);
    }

    /* renamed from: a */
    public void mo1259a(C0448c c0448c, T t) {
        C0487t c0487t = this.f1815b;
        Type a = m2094a(this.f1816c, (Object) t);
        if (a != this.f1816c) {
            c0487t = this.f1814a.m647a(C0444a.m569a(a));
            if (c0487t instanceof C1002a) {
                if (!(this.f1815b instanceof C1002a)) {
                    c0487t = this.f1815b;
                }
            }
        }
        c0487t.mo1259a(c0448c, t);
    }

    /* renamed from: a */
    private Type m2094a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        } else {
            return type;
        }
    }
}
