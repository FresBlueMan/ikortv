package com.iptv2.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import com.iptv2.activity.DispatchActivity;
import com.iptv2.core.Application;
import com.iptv2.core.C0730c;
import com.iptv2.p042a.C1352d;
import com.iptv2.p042a.C1352d.C0518a;
import com.iptv2.p043b.C0591c;
import java.util.ArrayList;
import java.util.List;

public class Activity extends FragmentActivity {
    /* renamed from: f */
    public static int f2469f;
    /* renamed from: g */
    public static int f2470g;
    /* renamed from: a */
    private boolean f2471a = false;
    /* renamed from: b */
    private boolean f2472b = false;
    /* renamed from: c */
    protected C0730c f2473c;
    /* renamed from: d */
    protected View f2474d;
    /* renamed from: e */
    protected Window f2475e;
    /* renamed from: h */
    private List<C0599a> f2476h = new ArrayList();
    /* renamed from: i */
    private BroadcastReceiver f2477i = new C05981(this);

    /* renamed from: com.iptv2.base.Activity$1 */
    class C05981 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ Activity f661a;

        C05981(Activity activity) {
            this.f661a = activity;
        }

        public void onReceive(Context context, Intent intent) {
            intent = intent.getAction();
            if (!(intent == null || intent.equals("com.iptv2.ikortvaction.closeallactivity") == null)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onReceive Action_CloseAllActivity ");
                stringBuilder.append(this.f661a.getClass().getName());
                C0591c.m791a("Activity", stringBuilder.toString());
                Activity activity = (Activity) context;
                if (activity.isFinishing() == null) {
                    if (activity.m3163c() == null) {
                        activity.finish();
                    }
                }
            }
        }
    }

    /* renamed from: com.iptv2.base.Activity$a */
    public interface C0599a {
        /* renamed from: a */
        void mo1375a();

        /* renamed from: b */
        void mo1376b();
    }

    /* renamed from: com.iptv2.base.Activity$2 */
    class C11012 extends C0518a {
        /* renamed from: a */
        final /* synthetic */ Activity f1927a;

        /* renamed from: d */
        public boolean mo1359d() {
            return false;
        }

        C11012(Activity activity) {
            this.f1927a = activity;
        }
    }

    /* renamed from: a */
    public void m3162a(C0599a c0599a) {
        if (this.f2476h.indexOf(c0599a) < 0) {
            this.f2476h.add(c0599a);
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCreate ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Activity", stringBuilder.toString());
        super.onCreate(bundle);
        this.f2473c = ((Application) getApplication()).f1065d;
        if ((this instanceof DispatchActivity) == null) {
            this.f2473c.f1262j = this;
        }
        this.f2475e = getWindow();
        this.f2474d = this.f2475e.getDecorView();
        this.f2475e.setFlags(128, 128);
        if (f2470g == null) {
            bundle = this.f2473c.f1265m.getDisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(bundle);
            f2470g = bundle.heightPixels;
            if (f2470g == 672) {
                f2470g = 720;
            } else if (f2470g == 984) {
                f2470g = 1080;
            } else if (f2470g == 1968) {
                f2470g = 2160;
            }
            f2469f = bundle.widthPixels;
        }
        if (this.f2473c.f1248C.m1321h() == null && VERSION.SDK_INT >= 19) {
            this.f2475e.setFlags(134217728, 134217728);
        }
        registerReceiver(this.f2477i, new IntentFilter("com.iptv2.ikortvaction.closeallactivity"));
    }

    protected void onDestroy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onDestroy ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Activity", stringBuilder.toString());
        this.f2471a = true;
        if (this.f2473c.f1262j == this) {
            this.f2473c.f1262j = null;
        }
        unregisterReceiver(this.f2477i);
        super.onDestroy();
    }

    protected void onPause() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPause ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Activity", stringBuilder.toString());
        this.f2472b = true;
        for (C0599a b : this.f2476h) {
            b.mo1376b();
        }
        super.onPause();
    }

    protected void onResume() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onResume ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Activity", stringBuilder.toString());
        super.onResume();
        this.f2472b = false;
        for (C0599a a : this.f2476h) {
            a.mo1375a();
        }
    }

    /* renamed from: c */
    public boolean m3163c() {
        return this.f2471a;
    }

    /* renamed from: d */
    public boolean m3164d() {
        return this.f2472b;
    }

    /* renamed from: e */
    public void m3165e() {
        C0591c.m791a("Activity", "showNavigationBar");
        this.f2474d.setSystemUiVisibility(VERSION.SDK_INT >= 16 ? 768 : 0);
    }

    /* renamed from: f */
    public void m3166f() {
        C0591c.m791a("Activity", "hideNavigationBar");
        this.f2474d.setSystemUiVisibility(VERSION.SDK_INT >= 16 ? 770 : 2);
    }

    /* renamed from: a */
    public void mo2163a() {
        C1352d c1352d = new C1352d();
        c1352d.m2846a(this);
        c1352d.m3033a(new C11012(this));
    }
}
