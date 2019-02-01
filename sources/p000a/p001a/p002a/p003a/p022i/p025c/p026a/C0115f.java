package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import p000a.p001a.p002a.p003a.p013e.p014a.C0048b;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;
import p000a.p001a.p002a.p003a.p035o.C0166g;

@Deprecated
/* compiled from: RouteSpecificPool */
/* renamed from: a.a.a.a.i.c.a.f */
public class C0115f {
    /* renamed from: a */
    public C0097b f229a = new C0097b(getClass());
    /* renamed from: b */
    protected final C0817b f230b;
    /* renamed from: c */
    protected final int f231c;
    /* renamed from: d */
    protected final C0048b f232d;
    /* renamed from: e */
    protected final LinkedList<C0858b> f233e;
    /* renamed from: f */
    protected final Queue<C0116h> f234f;
    /* renamed from: g */
    protected int f235g;

    public C0115f(C0817b c0817b, C0048b c0048b) {
        this.f230b = c0817b;
        this.f232d = c0048b;
        this.f231c = c0048b.mo8a(c0817b);
        this.f233e = new LinkedList();
        this.f234f = new LinkedList();
        this.f235g = null;
    }

    /* renamed from: a */
    public final C0817b m327a() {
        return this.f230b;
    }

    /* renamed from: b */
    public final int m331b() {
        return this.f231c;
    }

    /* renamed from: c */
    public boolean m334c() {
        return this.f235g < 1 && this.f234f.isEmpty();
    }

    /* renamed from: d */
    public int m336d() {
        return this.f232d.mo8a(this.f230b) - this.f235g;
    }

    /* renamed from: a */
    public C0858b m328a(Object obj) {
        if (!this.f233e.isEmpty()) {
            ListIterator listIterator = this.f233e.listIterator(this.f233e.size());
            while (listIterator.hasPrevious()) {
                C0858b c0858b = (C0858b) listIterator.previous();
                if (c0858b.m345a() != null) {
                    if (C0166g.m525a(obj, c0858b.m345a())) {
                    }
                }
                listIterator.remove();
                return c0858b;
            }
        }
        if (m336d() != null || this.f233e.isEmpty() != null) {
            return null;
        }
        C0858b c0858b2 = (C0858b) this.f233e.remove();
        c0858b2.mo62b();
        try {
            c0858b2.m1676c().close();
        } catch (Throwable e) {
            this.f229a.m261a("I/O error closing connection", e);
        }
        return c0858b2;
    }

    /* renamed from: a */
    public void m329a(C0858b c0858b) {
        StringBuilder stringBuilder;
        if (this.f235g < 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No entry created for this pool. ");
            stringBuilder.append(this.f230b);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f235g > this.f233e.size()) {
            this.f233e.add(c0858b);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No entry allocated from this pool. ");
            stringBuilder.append(this.f230b);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public void m332b(C0858b c0858b) {
        C0160a.m480a(this.f230b.equals(c0858b.m1677d()), "Entry not planned for this pool");
        this.f235g++;
    }

    /* renamed from: c */
    public boolean m335c(C0858b c0858b) {
        c0858b = this.f233e.remove(c0858b);
        if (c0858b != null) {
            this.f235g--;
        }
        return c0858b;
    }

    /* renamed from: e */
    public void m337e() {
        C0161b.m485a(this.f235g > 0, "There is no entry that could be dropped");
        this.f235g--;
    }

    /* renamed from: a */
    public void m330a(C0116h c0116h) {
        C0160a.m478a((Object) c0116h, "Waiting thread");
        this.f234f.add(c0116h);
    }

    /* renamed from: f */
    public boolean m338f() {
        return this.f234f.isEmpty() ^ 1;
    }

    /* renamed from: g */
    public C0116h m339g() {
        return (C0116h) this.f234f.peek();
    }

    /* renamed from: b */
    public void m333b(C0116h c0116h) {
        if (c0116h != null) {
            this.f234f.remove(c0116h);
        }
    }
}
