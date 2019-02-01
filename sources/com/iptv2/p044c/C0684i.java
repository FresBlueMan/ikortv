package com.iptv2.p044c;

import android.view.View;
import android.widget.TextView;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0595e;
import java.text.SimpleDateFormat;

/* compiled from: TimeView */
/* renamed from: com.iptv2.c.i */
public class C0684i {
    /* renamed from: a */
    private C0730c f1036a;
    /* renamed from: b */
    private TextView f1037b;
    /* renamed from: c */
    private boolean f1038c;
    /* renamed from: d */
    private SimpleDateFormat f1039d;
    /* renamed from: e */
    private Runnable f1040e = new C06831(this);

    /* compiled from: TimeView */
    /* renamed from: com.iptv2.c.i$1 */
    class C06831 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0684i f1035a;

        C06831(C0684i c0684i) {
            this.f1035a = c0684i;
        }

        public void run() {
            this.f1035a.m1189c();
            if (this.f1035a.f1038c) {
                this.f1035a.f1036a.f1263k.postDelayed(this.f1035a.f1040e, 59900);
            }
        }
    }

    public C0684i(C0730c c0730c, View view) {
        this.f1036a = c0730c;
        this.f1037b = (TextView) view;
        this.f1039d = new SimpleDateFormat("HH:mm", C0595e.f658a);
    }

    /* renamed from: c */
    private void m1189c() {
        this.f1037b.setText(this.f1039d.format(C0730c.m1256b()));
    }

    /* renamed from: a */
    public void m1191a() {
        if (!this.f1038c) {
            this.f1038c = true;
            m1189c();
            this.f1036a.f1263k.removeCallbacks(this.f1040e);
            this.f1036a.f1263k.postDelayed(this.f1040e, 59900);
        }
    }

    /* renamed from: b */
    public void m1192b() {
        if (this.f1038c) {
            this.f1038c = false;
            this.f1036a.f1263k.removeCallbacks(this.f1040e);
        }
    }
}
