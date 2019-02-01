package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p039b.C0444a;

class TypeAdapters$33 implements C0488u {
    /* renamed from: a */
    final /* synthetic */ Class f1781a;
    /* renamed from: b */
    final /* synthetic */ Class f1782b;
    /* renamed from: c */
    final /* synthetic */ C0487t f1783c;

    TypeAdapters$33(Class cls, Class cls2, C0487t c0487t) {
        this.f1781a = cls;
        this.f1782b = cls2;
        this.f1783c = c0487t;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        c0451e = c0444a.m572a();
        if (c0451e != this.f1781a) {
            if (c0451e != this.f1782b) {
                return null;
            }
        }
        return this.f1783c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[type=");
        stringBuilder.append(this.f1782b.getName());
        stringBuilder.append("+");
        stringBuilder.append(this.f1781a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f1783c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
