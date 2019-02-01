package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p039b.C0444a;

class TypeAdapters$32 implements C0488u {
    /* renamed from: a */
    final /* synthetic */ Class f1779a;
    /* renamed from: b */
    final /* synthetic */ C0487t f1780b;

    TypeAdapters$32(Class cls, C0487t c0487t) {
        this.f1779a = cls;
        this.f1780b = c0487t;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        return c0444a.m572a() == this.f1779a ? this.f1780b : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[type=");
        stringBuilder.append(this.f1779a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f1780b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
