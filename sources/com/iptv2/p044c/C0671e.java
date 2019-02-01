package com.iptv2.p044c;

import android.view.View;
import android.widget.TextView;
import com.iptv2.core.Application;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0677g.C0676a;

/* compiled from: P2pStatView */
/* renamed from: com.iptv2.c.e */
public final class C0671e {
    /* renamed from: a */
    private C0730c f971a;
    /* renamed from: b */
    private TextView f972b;
    /* renamed from: c */
    private boolean f973c;
    /* renamed from: d */
    private C0677g f974d;
    /* renamed from: e */
    private boolean f975e;
    /* renamed from: f */
    private Runnable f976f = new C06692(this);
    /* renamed from: g */
    private Runnable f977g = new C06703(this);

    /* compiled from: P2pStatView */
    /* renamed from: com.iptv2.c.e$2 */
    class C06692 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0671e f969a;

        C06692(C0671e c0671e) {
            this.f969a = c0671e;
        }

        public void run() {
            if (this.f969a.f972b.getVisibility() == 0) {
                this.f969a.m1107b();
                this.f969a.f971a.f1263k.postDelayed(this.f969a.f976f, 800);
            }
        }
    }

    /* compiled from: P2pStatView */
    /* renamed from: com.iptv2.c.e$3 */
    class C06703 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0671e f970a;

        C06703(C0671e c0671e) {
            this.f970a = c0671e;
        }

        public void run() {
            this.f970a.m1111a();
        }
    }

    /* compiled from: P2pStatView */
    /* renamed from: com.iptv2.c.e$1 */
    class C11611 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0671e f2035a;

        C11611(C0671e c0671e) {
            this.f2035a = c0671e;
        }

        /* renamed from: c */
        public void mo1341c() {
            this.f2035a.f975e = true;
        }

        /* renamed from: d */
        public void mo1342d() {
            this.f2035a.f975e = false;
        }

        /* renamed from: f */
        public void mo1368f() {
            this.f2035a.f975e = false;
        }
    }

    public C0671e(C0730c c0730c, View view, C0677g c0677g) {
        this.f971a = c0730c;
        this.f972b = (TextView) view;
        this.f974d = c0677g;
        this.f974d.m1142a(new C11611(this));
    }

    /* renamed from: a */
    public void m1112a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("show ");
        stringBuilder.append(z);
        C0591c.m791a("P2pStatView", stringBuilder.toString());
        this.f971a.f1263k.removeCallbacks(this.f977g);
        if (z) {
            this.f971a.f1263k.postDelayed(this.f977g, 6000);
        }
        if (!this.f973c) {
            this.f971a.f1263k.removeCallbacks(this.f976f);
            this.f971a.f1263k.postDelayed(this.f976f, 800);
            this.f972b.setVisibility(0);
            this.f973c = true;
            m1107b();
        }
    }

    /* renamed from: b */
    private void m1107b() {
        if (Application.f1062a) {
            TextView textView = this.f972b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("速度:");
            stringBuilder.append(C0595e.m804a(C1160d.m2441c().m2446d()));
            stringBuilder.append(" 播放器状态:");
            stringBuilder.append(this.f974d.m1147b(this.f974d.m1153e()));
            stringBuilder.append(" 是否在缓冲:");
            stringBuilder.append(this.f975e ? "是" : "否");
            stringBuilder.append("\n 当前播放位置:");
            stringBuilder.append(this.f974d.m1156h());
            textView.setText(stringBuilder.toString());
            return;
        }
        this.f972b.setText(C0595e.m804a(C1160d.m2441c().m2446d()));
    }

    /* renamed from: a */
    public void m1111a() {
        if (!Application.f1062a) {
            C0591c.m791a("P2pStatView", "hide");
            this.f971a.f1263k.removeCallbacks(this.f977g);
            this.f971a.f1263k.removeCallbacks(this.f976f);
            if (this.f973c) {
                this.f973c = false;
                this.f972b.setVisibility(8);
            }
        }
    }
}
