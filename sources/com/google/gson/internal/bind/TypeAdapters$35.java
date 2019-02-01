package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C1043r;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;

class TypeAdapters$35 implements C0488u {
    /* renamed from: a */
    final /* synthetic */ Class f1789a;
    /* renamed from: b */
    final /* synthetic */ C0487t f1790b;

    TypeAdapters$35(Class cls, C0487t c0487t) {
        this.f1789a = cls;
        this.f1790b = c0487t;
    }

    /* renamed from: a */
    public <T2> C0487t<T2> mo1267a(C0451e c0451e, C0444a<T2> c0444a) {
        c0451e = c0444a.m572a();
        if (this.f1789a.isAssignableFrom(c0451e) == null) {
            return null;
        }
        return new C0487t<T1>(this) {
            /* renamed from: b */
            final /* synthetic */ TypeAdapters$35 f1788b;

            /* renamed from: a */
            public void mo1259a(C0448c c0448c, T1 t1) {
                this.f1788b.f1790b.mo1259a(c0448c, t1);
            }

            /* renamed from: b */
            public T1 mo1260b(C0446a c0446a) {
                c0446a = this.f1788b.f1790b.mo1260b(c0446a);
                if (c0446a != null) {
                    if (!c0451e.isInstance(c0446a)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a ");
                        stringBuilder.append(c0451e.getName());
                        stringBuilder.append(" but was ");
                        stringBuilder.append(c0446a.getClass().getName());
                        throw new C1043r(stringBuilder.toString());
                    }
                }
                return c0446a;
            }
        };
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factory[typeHierarchy=");
        stringBuilder.append(this.f1789a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f1790b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
