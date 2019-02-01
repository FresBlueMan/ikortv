package com.iptv2.p044c;

import com.iptv2.base.Activity;
import com.iptv2.base.Activity.C0599a;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0740e.C0736b;
import com.iptv2.core.C0740e.C0739e;
import com.iptv2.p043b.C0591c;

/* compiled from: P2pStatOutput */
/* renamed from: com.iptv2.c.d */
public class C1160d implements C0599a {
    /* renamed from: d */
    private static C1160d f2029d;
    /* renamed from: a */
    private Activity f2030a;
    /* renamed from: b */
    private C0730c f2031b;
    /* renamed from: c */
    private boolean f2032c = false;
    /* renamed from: e */
    private long f2033e;
    /* renamed from: f */
    private Runnable f2034f = new C06681(this);

    /* compiled from: P2pStatOutput */
    /* renamed from: com.iptv2.c.d$1 */
    class C06681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1160d f968a;

        /* compiled from: P2pStatOutput */
        /* renamed from: com.iptv2.c.d$1$1 */
        class C11591 implements C0736b {
            /* renamed from: a */
            final /* synthetic */ C06681 f2028a;

            C11591(C06681 c06681) {
                this.f2028a = c06681;
            }

            /* renamed from: a */
            public void mo1364a(boolean z, C0739e c0739e) {
                if (!this.f2028a.f968a.f2032c) {
                    this.f2028a.f968a.f2033e = c0739e == null ? 0 : c0739e.f1309a;
                    this.f2028a.f968a.f2031b.f1263k.postDelayed(this.f2028a.f968a.f2034f, 600);
                }
            }
        }

        C06681(C1160d c1160d) {
            this.f968a = c1160d;
        }

        public void run() {
            this.f968a.f2031b.f1250E.m1341a(new C11591(this));
        }
    }

    private C1160d() {
    }

    /* renamed from: c */
    public static C1160d m2441c() {
        if (f2029d == null) {
            f2029d = new C1160d();
        }
        return f2029d;
    }

    /* renamed from: a */
    public void m2444a(Activity activity, C0730c c0730c) {
        this.f2033e = 0;
        this.f2030a = activity;
        this.f2031b = c0730c;
        this.f2030a.m3162a(this);
    }

    /* renamed from: a */
    public void mo1375a() {
        if (this.f2032c) {
            m2447e();
        }
    }

    /* renamed from: b */
    public void mo1376b() {
        if (!this.f2032c) {
            m2448f();
        }
    }

    /* renamed from: d */
    public long m2446d() {
        return this.f2033e;
    }

    /* renamed from: e */
    public void m2447e() {
        C0591c.m791a("test", "startOutput");
        this.f2032c = false;
        this.f2031b.f1263k.removeCallbacks(this.f2034f);
        this.f2031b.f1263k.postDelayed(this.f2034f, 600);
    }

    /* renamed from: f */
    public void m2448f() {
        this.f2032c = true;
        this.f2031b.f1263k.removeCallbacks(this.f2034f);
    }
}
