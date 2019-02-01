package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p000a.p001a.p002a.p003a.p013e.C1253q;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p022i.p025c.C0120l;

@Deprecated
/* compiled from: AbstractConnPool */
/* renamed from: a.a.a.a.i.c.a.a */
public abstract class C0113a {
    /* renamed from: a */
    public C0097b f224a = new C0097b(getClass());
    /* renamed from: b */
    protected final Lock f225b = new ReentrantLock();
    /* renamed from: c */
    protected Set<C0858b> f226c = new HashSet();
    /* renamed from: d */
    protected volatile boolean f227d;
    /* renamed from: e */
    protected C0120l f228e = new C0120l();

    protected C0113a() {
    }

    /* renamed from: a */
    public void mo65a() {
        this.f225b.lock();
        try {
            if (!this.f227d) {
                Iterator it = this.f226c.iterator();
                while (it.hasNext()) {
                    C0858b c0858b = (C0858b) it.next();
                    it.remove();
                    m324a(c0858b.m1676c());
                }
                this.f228e.m352a();
                this.f227d = true;
                this.f225b.unlock();
            }
        } finally {
            this.f225b.unlock();
        }
    }

    /* renamed from: a */
    protected void m324a(C1253q c1253q) {
        if (c1253q != null) {
            try {
                c1253q.close();
            } catch (C1253q c1253q2) {
                this.f224a.m261a("I/O error closing connection", c1253q2);
            }
        }
    }
}
