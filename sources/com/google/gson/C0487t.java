package com.google.gson;

import com.google.gson.internal.bind.C1009d;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;

/* compiled from: TypeAdapter */
/* renamed from: com.google.gson.t */
public abstract class C0487t<T> {

    /* compiled from: TypeAdapter */
    /* renamed from: com.google.gson.t$1 */
    class C10461 extends C0487t<T> {
        /* renamed from: a */
        final /* synthetic */ C0487t f1853a;

        C10461(C0487t c0487t) {
            this.f1853a = c0487t;
        }

        /* renamed from: a */
        public void mo1259a(C0448c c0448c, T t) {
            if (t == null) {
                c0448c.mo1301f();
            } else {
                this.f1853a.mo1259a(c0448c, t);
            }
        }

        /* renamed from: b */
        public T mo1260b(C0446a c0446a) {
            if (c0446a.mo1277f() != C0447b.NULL) {
                return this.f1853a.mo1260b(c0446a);
            }
            c0446a.mo1281j();
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo1259a(C0448c c0448c, T t);

    /* renamed from: b */
    public abstract T mo1260b(C0446a c0446a);

    /* renamed from: a */
    public final C0487t<T> m742a() {
        return new C10461(this);
    }

    /* renamed from: a */
    public final C0482j m741a(T t) {
        try {
            C0448c c1009d = new C1009d();
            mo1259a(c1009d, t);
            return c1009d.mo1294a();
        } catch (Throwable e) {
            throw new C1039k(e);
        }
    }
}
