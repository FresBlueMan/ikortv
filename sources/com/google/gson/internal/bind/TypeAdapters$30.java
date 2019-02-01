package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.bind.C0466i.C1023a;
import com.google.gson.p039b.C0444a;

class TypeAdapters$30 implements C0488u {
    TypeAdapters$30() {
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        c0451e = c0444a.m572a();
        if (Enum.class.isAssignableFrom(c0451e) != null) {
            if (c0451e != Enum.class) {
                if (c0451e.isEnum() == null) {
                    c0451e = c0451e.getSuperclass();
                }
                return new C1023a(c0451e);
            }
        }
        return null;
    }
}
