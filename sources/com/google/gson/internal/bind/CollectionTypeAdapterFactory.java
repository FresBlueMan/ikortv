package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.C0459b;
import com.google.gson.internal.C0467c;
import com.google.gson.internal.C0476g;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C0488u {
    /* renamed from: a */
    private final C0467c f1741a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    private static final class C0999a<E> extends C0487t<Collection<E>> {
        /* renamed from: a */
        private final C0487t<E> f1739a;
        /* renamed from: b */
        private final C0476g<? extends Collection<E>> f1740b;

        /* renamed from: b */
        public /* synthetic */ Object mo1260b(C0446a c0446a) {
            return m1996a(c0446a);
        }

        public C0999a(C0451e c0451e, Type type, C0487t<E> c0487t, C0476g<? extends Collection<E>> c0476g) {
            this.f1739a = new C1013h(c0451e, c0487t, type);
            this.f1740b = c0476g;
        }

        /* renamed from: a */
        public Collection<E> m1996a(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            Collection<E> collection = (Collection) this.f1740b.mo1303a();
            c0446a.mo1271a();
            while (c0446a.mo1276e()) {
                collection.add(this.f1739a.mo1260b(c0446a));
            }
            c0446a.mo1272b();
            return collection;
        }

        /* renamed from: a */
        public void m1998a(C0448c c0448c, Collection<E> collection) {
            if (collection == null) {
                c0448c.mo1301f();
                return;
            }
            c0448c.mo1295b();
            for (E a : collection) {
                this.f1739a.mo1259a(c0448c, a);
            }
            c0448c.mo1297c();
        }
    }

    public CollectionTypeAdapterFactory(C0467c c0467c) {
        this.f1741a = c0467c;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        Type b = c0444a.m573b();
        Class a = c0444a.m572a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        b = C0459b.m670a(b, a);
        return new C0999a(c0451e, b, c0451e.m647a(C0444a.m569a(b)), this.f1741a.m700a((C0444a) c0444a));
    }
}
