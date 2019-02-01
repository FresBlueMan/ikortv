package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.C0475f;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ObjectTypeAdapter */
/* renamed from: com.google.gson.internal.bind.e */
public final class C1010e extends C0487t<Object> {
    /* renamed from: a */
    public static final C0488u f1808a = new ObjectTypeAdapter$1();
    /* renamed from: b */
    private final C0451e f1809b;

    C1010e(C0451e c0451e) {
        this.f1809b = c0451e;
    }

    /* renamed from: b */
    public Object mo1260b(C0446a c0446a) {
        switch (c0446a.mo1277f()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                c0446a.mo1271a();
                while (c0446a.mo1276e()) {
                    arrayList.add(mo1260b(c0446a));
                }
                c0446a.mo1272b();
                return arrayList;
            case BEGIN_OBJECT:
                Map c0475f = new C0475f();
                c0446a.mo1273c();
                while (c0446a.mo1276e()) {
                    c0475f.put(c0446a.mo1278g(), mo1260b(c0446a));
                }
                c0446a.mo1275d();
                return c0475f;
            case STRING:
                return c0446a.mo1279h();
            case NUMBER:
                return Double.valueOf(c0446a.mo1282k());
            case BOOLEAN:
                return Boolean.valueOf(c0446a.mo1280i());
            case NULL:
                c0446a.mo1281j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo1259a(C0448c c0448c, Object obj) {
        if (obj == null) {
            c0448c.mo1301f();
            return;
        }
        C0487t a = this.f1809b.m649a(obj.getClass());
        if (a instanceof C1010e) {
            c0448c.mo1299d();
            c0448c.mo1300e();
            return;
        }
        a.mo1259a(c0448c, obj);
    }
}
