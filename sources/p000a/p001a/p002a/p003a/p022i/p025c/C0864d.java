package p000a.p001a.p002a.p003a.p022i.p025c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p000a.p001a.p002a.p003a.C0892i;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.C0071d;
import p000a.p001a.p002a.p003a.p013e.C0073e;
import p000a.p001a.p002a.p003a.p013e.C1319o;
import p000a.p001a.p002a.p003a.p013e.p015b.C0817b;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p021h.C0097b;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

@Deprecated
/* compiled from: BasicClientConnectionManager */
/* renamed from: a.a.a.a.i.c.d */
public class C0864d implements C0055b {
    /* renamed from: b */
    private static final AtomicLong f1573b = new AtomicLong();
    /* renamed from: a */
    public C0097b f1574a;
    /* renamed from: c */
    private final C0058i f1575c;
    /* renamed from: d */
    private final C0071d f1576d;
    /* renamed from: e */
    private C0868k f1577e;
    /* renamed from: f */
    private C1348o f1578f;
    /* renamed from: g */
    private volatile boolean f1579g;

    public C0864d(C0058i c0058i) {
        this.f1574a = new C0097b(getClass());
        C0160a.m478a((Object) c0058i, "Scheme registry");
        this.f1575c = c0058i;
        this.f1576d = m1711a(c0058i);
    }

    public C0864d() {
        this(C0121p.m353a());
    }

    protected void finalize() {
        try {
            mo71b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    public C0058i mo68a() {
        return this.f1575c;
    }

    /* renamed from: a */
    protected C0071d m1711a(C0058i c0058i) {
        return new C0865g(c0058i);
    }

    /* renamed from: a */
    public final C0073e mo69a(final C0817b c0817b, final Object obj) {
        return new C0073e(this) {
            /* renamed from: c */
            final /* synthetic */ C0864d f1572c;

            /* renamed from: a */
            public void mo67a() {
            }

            /* renamed from: a */
            public C1319o mo66a(long j, TimeUnit timeUnit) {
                return this.f1572c.m1714b(c0817b, obj);
            }
        };
    }

    /* renamed from: c */
    private void m1709c() {
        C0161b.m485a(this.f1579g ^ 1, "Connection manager has been shut down");
    }

    /* renamed from: b */
    C1319o m1714b(C0817b c0817b, Object obj) {
        C0160a.m478a((Object) c0817b, "Route");
        synchronized (this) {
            m1709c();
            if (this.f1574a.m262a() != null) {
                obj = this.f1574a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Get connection for route ");
                stringBuilder.append(c0817b);
                obj.m260a(stringBuilder.toString());
            }
            C0161b.m485a(this.f1578f == null ? true : null, "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
            if (this.f1577e != null && this.f1577e.m1726b().equals(c0817b) == null) {
                this.f1577e.m1729e();
                this.f1577e = null;
            }
            if (this.f1577e == null) {
                this.f1577e = new C0868k(this.f1574a, Long.toString(f1573b.getAndIncrement()), c0817b, this.f1576d.mo72a(), 0, TimeUnit.MILLISECONDS);
            }
            if (this.f1577e.mo77a(System.currentTimeMillis()) != null) {
                this.f1577e.m1729e();
                this.f1577e.m1724a().m1523h();
            }
            this.f1578f = new C1348o(this, this.f1576d, this.f1577e);
            c0817b = this.f1578f;
        }
        return c0817b;
    }

    /* renamed from: a */
    private void m1708a(C0892i c0892i) {
        try {
            c0892i.mo1934e();
        } catch (C0892i c0892i2) {
            if (this.f1574a.m262a()) {
                this.f1574a.m261a("I/O exception shutting down connection", c0892i2);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo70a(p000a.p001a.p002a.p003a.p013e.C1319o r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
        r4 = this;
        r0 = r5 instanceof p000a.p001a.p002a.p003a.p022i.p025c.C1348o;
        r1 = "Connection class mismatch, connection not obtained from this manager";
        p000a.p001a.p002a.p003a.p035o.C0160a.m480a(r0, r1);
        r0 = r5;
        r0 = (p000a.p001a.p002a.p003a.p022i.p025c.C1348o) r0;
        monitor-enter(r0);
        r1 = r4.f1574a;	 Catch:{ all -> 0x00d1 }
        r1 = r1.m262a();	 Catch:{ all -> 0x00d1 }
        if (r1 == 0) goto L_0x0029;
    L_0x0013:
        r1 = r4.f1574a;	 Catch:{ all -> 0x00d1 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d1 }
        r2.<init>();	 Catch:{ all -> 0x00d1 }
        r3 = "Releasing connection ";
        r2.append(r3);	 Catch:{ all -> 0x00d1 }
        r2.append(r5);	 Catch:{ all -> 0x00d1 }
        r5 = r2.toString();	 Catch:{ all -> 0x00d1 }
        r1.m260a(r5);	 Catch:{ all -> 0x00d1 }
    L_0x0029:
        r5 = r0.m2931l();	 Catch:{ all -> 0x00d1 }
        if (r5 != 0) goto L_0x0031;
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x00d1 }
        return;
    L_0x0031:
        r5 = r0.m2933n();	 Catch:{ all -> 0x00d1 }
        if (r5 != r4) goto L_0x0039;
    L_0x0037:
        r5 = 1;
        goto L_0x003a;
    L_0x0039:
        r5 = 0;
    L_0x003a:
        r1 = "Connection not obtained from this manager";
        p000a.p001a.p002a.p003a.p035o.C0161b.m485a(r5, r1);	 Catch:{ all -> 0x00d1 }
        monitor-enter(r4);	 Catch:{ all -> 0x00d1 }
        r5 = r4.f1579g;	 Catch:{ all -> 0x00ce }
        if (r5 == 0) goto L_0x004a;
    L_0x0044:
        r4.m1708a(r0);	 Catch:{ all -> 0x00ce }
        monitor-exit(r4);	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00d1 }
        return;
    L_0x004a:
        r5 = 0;
        r1 = r0.mo1932c();	 Catch:{ all -> 0x00bd }
        if (r1 == 0) goto L_0x005a;
    L_0x0051:
        r1 = r0.m2934o();	 Catch:{ all -> 0x00bd }
        if (r1 != 0) goto L_0x005a;
    L_0x0057:
        r4.m1708a(r0);	 Catch:{ all -> 0x00bd }
    L_0x005a:
        r1 = r0.m2934o();	 Catch:{ all -> 0x00bd }
        if (r1 == 0) goto L_0x00ab;
    L_0x0060:
        r1 = r4.f1577e;	 Catch:{ all -> 0x00bd }
        if (r8 == 0) goto L_0x0066;
    L_0x0064:
        r2 = r8;
        goto L_0x0068;
    L_0x0066:
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00bd }
    L_0x0068:
        r1.m454a(r6, r2);	 Catch:{ all -> 0x00bd }
        r1 = r4.f1574a;	 Catch:{ all -> 0x00bd }
        r1 = r1.m262a();	 Catch:{ all -> 0x00bd }
        if (r1 == 0) goto L_0x00ab;
    L_0x0073:
        r1 = 0;
        r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x0093;
    L_0x0079:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bd }
        r1.<init>();	 Catch:{ all -> 0x00bd }
        r2 = "for ";
        r1.append(r2);	 Catch:{ all -> 0x00bd }
        r1.append(r6);	 Catch:{ all -> 0x00bd }
        r6 = " ";
        r1.append(r6);	 Catch:{ all -> 0x00bd }
        r1.append(r8);	 Catch:{ all -> 0x00bd }
        r6 = r1.toString();	 Catch:{ all -> 0x00bd }
        goto L_0x0095;
    L_0x0093:
        r6 = "indefinitely";
    L_0x0095:
        r7 = r4.f1574a;	 Catch:{ all -> 0x00bd }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bd }
        r8.<init>();	 Catch:{ all -> 0x00bd }
        r1 = "Connection can be kept alive ";
        r8.append(r1);	 Catch:{ all -> 0x00bd }
        r8.append(r6);	 Catch:{ all -> 0x00bd }
        r6 = r8.toString();	 Catch:{ all -> 0x00bd }
        r7.m260a(r6);	 Catch:{ all -> 0x00bd }
    L_0x00ab:
        r0.m2932m();	 Catch:{ all -> 0x00ce }
        r4.f1578f = r5;	 Catch:{ all -> 0x00ce }
        r6 = r4.f1577e;	 Catch:{ all -> 0x00ce }
        r6 = r6.m1728d();	 Catch:{ all -> 0x00ce }
        if (r6 == 0) goto L_0x00ba;
    L_0x00b8:
        r4.f1577e = r5;	 Catch:{ all -> 0x00ce }
    L_0x00ba:
        monitor-exit(r4);	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00d1 }
        return;
    L_0x00bd:
        r6 = move-exception;
        r0.m2932m();	 Catch:{ all -> 0x00ce }
        r4.f1578f = r5;	 Catch:{ all -> 0x00ce }
        r7 = r4.f1577e;	 Catch:{ all -> 0x00ce }
        r7 = r7.m1728d();	 Catch:{ all -> 0x00ce }
        if (r7 == 0) goto L_0x00cd;
    L_0x00cb:
        r4.f1577e = r5;	 Catch:{ all -> 0x00ce }
    L_0x00cd:
        throw r6;	 Catch:{ all -> 0x00ce }
    L_0x00ce:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00ce }
        throw r5;	 Catch:{ all -> 0x00d1 }
    L_0x00d1:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00d1 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.c.d.a(a.a.a.a.e.o, long, java.util.concurrent.TimeUnit):void");
    }

    /* renamed from: b */
    public void mo71b() {
        synchronized (this) {
            this.f1579g = true;
            try {
                if (this.f1577e != null) {
                    this.f1577e.m1729e();
                }
            } finally {
                this.f1577e = null;
                this.f1578f = null;
            }
        }
    }
}
