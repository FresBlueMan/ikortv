package com.iptv2.p044c.p045a;

import android.view.View;
import android.widget.TextView;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.p043b.C0591c;

/* compiled from: LiveKeyCodeView */
/* renamed from: com.iptv2.c.a.e */
public class C0639e {
    /* renamed from: a */
    private C0626b f867a;
    /* renamed from: b */
    private TextView f868b;
    /* renamed from: c */
    private int f869c = 0;
    /* renamed from: d */
    private String f870d = "";
    /* renamed from: e */
    private Runnable f871e = new C06381(this);

    /* compiled from: LiveKeyCodeView */
    /* renamed from: com.iptv2.c.a.e$1 */
    class C06381 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0639e f866a;

        C06381(C0639e c0639e) {
            this.f866a = c0639e;
        }

        public void run() {
            int a = this.f866a.f869c;
            this.f866a.f869c = 0;
            this.f866a.m1007d();
            if (!this.f866a.f867a.f754b.m3164d()) {
                if (!this.f866a.f867a.f754b.m3163c()) {
                    if (this.f866a.f867a.f771s.containsKey(Integer.valueOf(a))) {
                        C0693b c0693b = (C0693b) this.f866a.f867a.f771s.get(Integer.valueOf(a));
                        this.f866a.f867a.f755c.m1026d();
                        this.f866a.f867a.f757e.m940a(false);
                        this.f866a.f867a.m915b(c0693b, false);
                    } else {
                        this.f866a.f867a.f753a.m1260a(this.f866a.f867a.f753a.f1251F.m1350e("invalidLiveKeyCode"), 0);
                    }
                }
            }
        }
    }

    public C0639e(C0626b c0626b, View view) {
        this.f867a = c0626b;
        this.f868b = (TextView) view;
    }

    /* renamed from: a */
    public boolean m1008a() {
        return this.f868b.getVisibility() == 0;
    }

    /* renamed from: b */
    public void m1010b() {
        this.f867a.f753a.f1263k.removeCallbacks(this.f871e);
        if (this.f869c > 0) {
            this.f871e.run();
        }
    }

    /* renamed from: a */
    public boolean m1009a(int i) {
        if (i < 7 || i > 16) {
            if (i == 67) {
                this.f867a.f753a.f1263k.removeCallbacks(this.f871e);
                if (this.f869c > 0) {
                    this.f869c /= 10;
                    m1007d();
                    if (this.f869c > 0) {
                        m1006c();
                    }
                    return true;
                }
            }
            return false;
        }
        this.f867a.f753a.f1263k.removeCallbacks(this.f871e);
        i -= 7;
        this.f869c = (this.f869c * 10) + i;
        if (this.f869c > 999) {
            this.f869c = i;
        }
        m1007d();
        if (this.f869c > 0) {
            m1006c();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f870d);
        stringBuilder.append(i);
        this.f870d = stringBuilder.toString();
        if (this.f870d.length() > 50) {
            this.f870d = this.f870d.substring(this.f870d.length() - 50);
        }
        if (this.f870d.endsWith("000000") != 0) {
            this.f870d = "";
            this.f867a.f753a.f1263k.removeCallbacks(this.f871e);
            this.f867a.f754b.mo2163a();
        }
        return true;
    }

    /* renamed from: c */
    private void m1006c() {
        C0591c.m791a("LiveKeyCodeView", "delaySubmit");
        this.f867a.f753a.f1263k.removeCallbacks(this.f871e);
        this.f867a.f753a.f1263k.postDelayed(this.f871e, 2000);
    }

    /* renamed from: d */
    private void m1007d() {
        if (this.f869c > 0) {
            this.f868b.setText(String.format("%03d", new Object[]{Integer.valueOf(this.f869c)}));
            this.f868b.setVisibility(0);
            return;
        }
        this.f868b.setText("");
        this.f868b.setVisibility(8);
    }
}
