package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.C0459b;
import com.google.gson.p039b.C0444a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements C0488u {
    ArrayTypeAdapter$1() {
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        c0444a = c0444a.m573b();
        if (!(c0444a instanceof GenericArrayType) && (!(c0444a instanceof Class) || !((Class) c0444a).isArray())) {
            return null;
        }
        Type g = C0459b.m684g(c0444a);
        return new C1006a(c0451e, c0451e.m647a(C0444a.m569a(g)), C0459b.m682e(g));
    }
}
