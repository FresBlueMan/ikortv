package com.google.gson.internal;

import com.google.gson.C0443a;
import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p038a.C0441d;
import com.google.gson.p038a.C0442e;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C0488u, Cloneable {
    /* renamed from: a */
    public static final Excluder f1732a = new Excluder();
    /* renamed from: b */
    private double f1733b = -1.0d;
    /* renamed from: c */
    private int f1734c = 136;
    /* renamed from: d */
    private boolean f1735d = true;
    /* renamed from: e */
    private boolean f1736e;
    /* renamed from: f */
    private List<C0443a> f1737f = Collections.emptyList();
    /* renamed from: g */
    private List<C0443a> f1738g = Collections.emptyList();

    protected /* synthetic */ Object clone() {
        return m1991a();
    }

    /* renamed from: a */
    protected Excluder m1991a() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        Class a = c0444a.m572a();
        final boolean a2 = m1993a(a, true);
        final boolean a3 = m1993a(a, false);
        if (!a2 && !a3) {
            return null;
        }
        final C0451e c0451e2 = c0451e;
        final C0444a<T> c0444a2 = c0444a;
        return new C0487t<T>(this) {
            /* renamed from: e */
            final /* synthetic */ Excluder f1730e;
            /* renamed from: f */
            private C0487t<T> f1731f;

            /* renamed from: b */
            public T mo1260b(C0446a c0446a) {
                if (!a3) {
                    return m1982b().mo1260b(c0446a);
                }
                c0446a.mo1285n();
                return null;
            }

            /* renamed from: a */
            public void mo1259a(C0448c c0448c, T t) {
                if (a2) {
                    c0448c.mo1301f();
                } else {
                    m1982b().mo1259a(c0448c, t);
                }
            }

            /* renamed from: b */
            private C0487t<T> m1982b() {
                C0487t<T> c0487t = this.f1731f;
                if (c0487t != null) {
                    return c0487t;
                }
                c0487t = c0451e2.m648a(this.f1730e, c0444a2);
                this.f1731f = c0487t;
                return c0487t;
            }
        };
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m1994a(java.lang.reflect.Field r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r6.f1734c;
        r1 = r7.getModifiers();
        r0 = r0 & r1;
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r2 = r6.f1733b;
        r4 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r0 = com.google.gson.p038a.C0441d.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.google.gson.p038a.C0441d) r0;
        r2 = com.google.gson.p038a.C0442e.class;
        r2 = r7.getAnnotation(r2);
        r2 = (com.google.gson.p038a.C0442e) r2;
        r0 = r6.m1986a(r0, r2);
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r0 = r7.isSynthetic();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r6.f1736e;
        if (r0 == 0) goto L_0x004f;
    L_0x0035:
        r0 = com.google.gson.p038a.C0438a.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.google.gson.p038a.C0438a) r0;
        if (r0 == 0) goto L_0x004e;
    L_0x003f:
        if (r8 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r0.m559a();
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        goto L_0x004e;
    L_0x0048:
        r0 = r0.m560b();
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        return r1;
    L_0x004f:
        r0 = r6.f1735d;
        if (r0 != 0) goto L_0x005e;
    L_0x0053:
        r0 = r7.getType();
        r0 = r6.m1989b(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r1;
    L_0x005e:
        r0 = r7.getType();
        r0 = r6.m1988a(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        if (r8 == 0) goto L_0x006e;
    L_0x006b:
        r8 = r6.f1737f;
        goto L_0x0070;
    L_0x006e:
        r8 = r6.f1738g;
    L_0x0070:
        r0 = r8.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x0076:
        r0 = new com.google.gson.b;
        r0.<init>(r7);
        r7 = r8.iterator();
    L_0x007f:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0092;
    L_0x0085:
        r8 = r7.next();
        r8 = (com.google.gson.C0443a) r8;
        r8 = r8.m567a(r0);
        if (r8 == 0) goto L_0x007f;
    L_0x0091:
        return r1;
    L_0x0092:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.a(java.lang.reflect.Field, boolean):boolean");
    }

    /* renamed from: a */
    public boolean m1993a(Class<?> cls, boolean z) {
        if (this.f1733b != -1.0d && !m1986a((C0441d) cls.getAnnotation(C0441d.class), (C0442e) cls.getAnnotation(C0442e.class))) {
            return true;
        }
        if ((!this.f1735d && m1989b(cls)) || m1988a((Class) cls)) {
            return true;
        }
        for (C0443a a : z ? this.f1737f : this.f1738g) {
            if (a.m568a((Class) cls)) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m1988a(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && cls.isLocalClass() == null)) ? null : true;
    }

    /* renamed from: b */
    private boolean m1989b(Class<?> cls) {
        return (cls.isMemberClass() && m1990c(cls) == null) ? true : null;
    }

    /* renamed from: c */
    private boolean m1990c(Class<?> cls) {
        return (cls.getModifiers() & 8) != null ? true : null;
    }

    /* renamed from: a */
    private boolean m1986a(C0441d c0441d, C0442e c0442e) {
        return (m1985a(c0441d) == null || m1987a(c0442e) == null) ? null : true;
    }

    /* renamed from: a */
    private boolean m1985a(C0441d c0441d) {
        return (c0441d == null || c0441d.m565a() <= this.f1733b) ? true : null;
    }

    /* renamed from: a */
    private boolean m1987a(C0442e c0442e) {
        return (c0442e == null || c0442e.m566a() > this.f1733b) ? true : null;
    }
}
