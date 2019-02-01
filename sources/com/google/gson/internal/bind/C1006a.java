package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ArrayTypeAdapter */
/* renamed from: com.google.gson.internal.bind.a */
public final class C1006a<E> extends C0487t<Object> {
    /* renamed from: a */
    public static final C0488u f1791a = new ArrayTypeAdapter$1();
    /* renamed from: b */
    private final Class<E> f1792b;
    /* renamed from: c */
    private final C0487t<E> f1793c;

    public C1006a(C0451e c0451e, C0487t<E> c0487t, Class<E> cls) {
        this.f1793c = new C1013h(c0451e, c0487t, cls);
        this.f1792b = cls;
    }

    /* renamed from: b */
    public Object mo1260b(C0446a c0446a) {
        if (c0446a.mo1277f() == C0447b.NULL) {
            c0446a.mo1281j();
            return null;
        }
        List arrayList = new ArrayList();
        c0446a.mo1271a();
        while (c0446a.mo1276e()) {
            arrayList.add(this.f1793c.mo1260b(c0446a));
        }
        c0446a.mo1272b();
        c0446a = arrayList.size();
        Object newInstance = Array.newInstance(this.f1792b, c0446a);
        for (int i = 0; i < c0446a; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo1259a(C0448c c0448c, Object obj) {
        if (obj == null) {
            c0448c.mo1301f();
            return;
        }
        c0448c.mo1295b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1793c.mo1259a(c0448c, Array.get(obj, i));
        }
        c0448c.mo1297c();
    }
}
