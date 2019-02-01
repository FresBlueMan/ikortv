package p000a.p001a.p002a.p003a.p005b.p007c;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p005b.p010f.C0024a;
import p000a.p001a.p002a.p003a.p011c.C0042a;
import p000a.p001a.p002a.p003a.p013e.C0073e;
import p000a.p001a.p002a.p003a.p013e.C0076i;
import p000a.p001a.p002a.p003a.p031k.C0144q;
import p000a.p001a.p002a.p003a.p031k.C0893a;
import p000a.p001a.p002a.p003a.p032l.C0152e;

/* compiled from: AbstractExecutionAwareRequest */
/* renamed from: a.a.a.a.b.c.b */
public abstract class C1236b extends C0893a implements C0016a, C0915q, Cloneable {
    private final AtomicBoolean aborted = new AtomicBoolean(false);
    private final AtomicReference<C0042a> cancellableRef = new AtomicReference(null);

    protected C1236b() {
    }

    @Deprecated
    public void setConnectionRequest(final C0073e c0073e) {
        setCancellable(new C0042a(this) {
            /* renamed from: b */
            final /* synthetic */ C1236b f1422b;

            /* renamed from: a */
            public boolean mo5a() {
                c0073e.mo67a();
                return true;
            }
        });
    }

    @Deprecated
    public void setReleaseTrigger(final C0076i c0076i) {
        setCancellable(new C0042a(this) {
            /* renamed from: b */
            final /* synthetic */ C1236b f1424b;

            /* renamed from: a */
            public boolean mo5a() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r2;	 Catch:{ IOException -> 0x0007 }
                r0.mo24b();	 Catch:{ IOException -> 0x0007 }
                r0 = 1;
                return r0;
            L_0x0007:
                r0 = 0;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.b.c.b.2.a():boolean");
            }
        });
    }

    public void abort() {
        if (this.aborted.compareAndSet(false, true)) {
            C0042a c0042a = (C0042a) this.cancellableRef.getAndSet(null);
            if (c0042a != null) {
                c0042a.mo5a();
            }
        }
    }

    public boolean isAborted() {
        return this.aborted.get();
    }

    public void setCancellable(C0042a c0042a) {
        if (!this.aborted.get()) {
            this.cancellableRef.set(c0042a);
        }
    }

    public Object clone() {
        C1236b c1236b = (C1236b) super.clone();
        c1236b.headergroup = (C0144q) C0024a.m84a(this.headergroup);
        c1236b.params = (C0152e) C0024a.m84a(this.params);
        return c1236b;
    }

    public void completed() {
        this.cancellableRef.set(null);
    }

    public void reset() {
        C0042a c0042a = (C0042a) this.cancellableRef.getAndSet(null);
        if (c0042a != null) {
            c0042a.mo5a();
        }
        this.aborted.set(false);
    }
}
