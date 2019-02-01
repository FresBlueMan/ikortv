package com.iptv2.p044c.p045a;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.AnimationListener.Update;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.FrameLayout;
import com.iptv2.base.FrameLayout.C0600a;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0740e.C0735a;
import com.iptv2.core.C0740e.C0736b;
import com.iptv2.core.C0740e.C0738d;
import com.iptv2.core.C0740e.C0739e;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C1173g;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0664b;
import com.iptv2.p044c.C0677g.C0676a;
import com.iptv2.p044c.C0682h;
import com.iptv2.p044c.C0682h.C0680a;
import com.iptv2.p044c.C0682h.C0681b;
import com.iptv2.p044c.p045a.C0626b.C0622a;
import com.iptv2.p044c.p045a.C0626b.C0623b;
import com.iptv2.p044c.p045a.C0626b.C0624c;
import com.iptv2.p044c.p045a.C0631c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* compiled from: LiveControlPanelView */
/* renamed from: com.iptv2.c.a.c */
public class C0631c {
    /* renamed from: A */
    private Runnable f785A = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ C0631c f781a;

        {
            this.f781a = r1;
        }

        public void run() {
            this.f781a.m943b();
        }
    };
    /* renamed from: B */
    private Runnable f786B = new C06285(this);
    /* renamed from: a */
    private C0626b f787a;
    /* renamed from: b */
    private FrameLayout f788b;
    /* renamed from: c */
    private TextView f789c;
    /* renamed from: d */
    private C0664b f790d;
    /* renamed from: e */
    private C0682h f791e;
    /* renamed from: f */
    private boolean f792f = false;
    /* renamed from: g */
    private ViewAnimator f793g;
    /* renamed from: h */
    private int f794h;
    /* renamed from: i */
    private TextView f795i;
    /* renamed from: j */
    private TextView f796j;
    /* renamed from: k */
    private TextView f797k;
    /* renamed from: l */
    private TextView f798l;
    /* renamed from: m */
    private TextView f799m;
    /* renamed from: n */
    private ImageView f800n;
    /* renamed from: o */
    private TextView f801o;
    /* renamed from: p */
    private TextView f802p;
    /* renamed from: q */
    private TextView f803q;
    /* renamed from: r */
    private TextView f804r;
    /* renamed from: s */
    private View f805s;
    /* renamed from: t */
    private View f806t;
    /* renamed from: u */
    private int f807u;
    /* renamed from: v */
    private C0738d f808v;
    /* renamed from: w */
    private long f809w;
    /* renamed from: x */
    private long f810x;
    /* renamed from: y */
    private ArrayList<C0630a> f811y = new ArrayList();
    /* renamed from: z */
    private Runnable f812z = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ C0631c f780a;

        {
            this.f780a = r1;
        }

        public void run() {
            if (!this.f780a.f787a.f754b.m3164d()) {
                if (r0.f780a.m941a()) {
                    long j = 900;
                    Handler handler;
                    Runnable i;
                    long j2;
                    if (r0.f780a.f787a.f766n == C0623b.Record) {
                        if (r0.f780a.f810x > 0) {
                            if (!(r0.f780a.f791e.m1179a() || r0.f780a.f791e.m1182b())) {
                                float g;
                                long f;
                                if (!r0.f780a.f791e.m1179a()) {
                                    if (!r0.f780a.f791e.m1182b()) {
                                        g = ((float) ((long) r0.f780a.f787a.f758f.m1155g())) / ((float) r0.f780a.f810x);
                                        f = (long) ((((float) r0.f780a.f810x) * g) / 1000.0f);
                                        r0.f780a.f791e.m1174a(g);
                                        r0.f780a.f791e.m1175a(f);
                                    }
                                }
                                g = r0.f780a.f791e.m1183c();
                                f = (long) ((((float) r0.f780a.f810x) * g) / 1000.0f);
                                r0.f780a.f791e.m1174a(g);
                                r0.f780a.f791e.m1175a(f);
                            }
                            handler = r0.f780a.f787a.f753a.f1263k;
                            i = r0.f780a.f812z;
                            if (!r0.f780a.f791e.m1179a()) {
                                if (!r0.f780a.f791e.m1182b()) {
                                    j2 = 900;
                                    handler.postDelayed(i, j2);
                                    return;
                                }
                            }
                            j2 = 100;
                            handler.postDelayed(i, j2);
                            return;
                        }
                    } else if (r0.f780a.f808v == null) {
                        r0.f780a.m939a(C0730c.m1256b());
                    } else {
                        Calendar instance = Calendar.getInstance();
                        instance.setTime(C0730c.m1256b());
                        long j3 = (long) (((instance.get(11) * 3600) + (instance.get(12) * 60)) + instance.get(13));
                        j2 = j3 - (r0.f780a.f808v.f1308c - r0.f780a.f808v.f1306a);
                        long c = ((long) (((float) (j3 - j2)) * (1.0f - r0.f780a.f791e.m1183c()))) + j2;
                        if (c < 0) {
                            c += 86400;
                        }
                        r0.f780a.f791e.m1175a(c);
                        instance.add(13, (int) (c - j3));
                        r0.f780a.m939a(instance.getTime());
                        handler = r0.f780a.f787a.f753a.f1263k;
                        i = r0.f780a.f812z;
                        if (r0.f780a.f791e.m1179a() || r0.f780a.f791e.m1182b()) {
                            j = 100;
                        }
                        handler.postDelayed(i, j);
                        return;
                    }
                    r0.f780a.f787a.f753a.f1263k.postDelayed(r0.f780a.f812z, 900);
                }
            }
        }
    };

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$1 */
    class C06271 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0631c f782a;

        C06271(C0631c c0631c) {
            this.f782a = c0631c;
        }

        public void run() {
            this.f782a.f807u = this.f782a.f806t.getWidth();
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$5 */
    class C06285 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0631c f783a;

        /* compiled from: LiveControlPanelView */
        /* renamed from: com.iptv2.c.a.c$5$1 */
        class C11221 implements C0736b {
            /* renamed from: a */
            final /* synthetic */ C06285 f1960a;

            C11221(C06285 c06285) {
                this.f1960a = c06285;
            }

            /* renamed from: a */
            public void mo1364a(boolean z, C0739e c0739e) {
                if (this.f1960a.f783a.f792f) {
                    if (z) {
                        this.f1960a.f783a.f804r.setText(String.format(C0595e.f658a, "T:%d S:%d R:%d", new Object[]{Integer.valueOf(c0739e.f1312d), Integer.valueOf(c0739e.f1313e), Integer.valueOf(c0739e.f1314f)}));
                    } else {
                        this.f1960a.f783a.f804r.setText("");
                    }
                    this.f1960a.f783a.f787a.f753a.f1263k.postDelayed(this.f1960a.f783a.f786B, 800);
                }
            }
        }

        C06285(C0631c c0631c) {
            this.f783a = c0631c;
        }

        public void run() {
            this.f783a.f787a.f753a.f1250E.m1341a(new C11221(this));
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$9 */
    class C06299 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0631c f784a;

        C06299(C0631c c0631c) {
            this.f784a = c0631c;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f784a.m940a(true);
            return null;
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$a */
    public static abstract class C0630a {
        /* renamed from: a */
        public void mo1324a(boolean z) {
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$2 */
    class C11192 implements Update {
        /* renamed from: a */
        final /* synthetic */ C0631c f1957a;

        C11192(C0631c c0631c) {
            this.f1957a = c0631c;
        }

        public void update(View view, float f) {
            view.setTranslationY(f);
            view.requestLayout();
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$3 */
    class C11203 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0631c f1958a;

        C11203(C0631c c0631c) {
            this.f1958a = c0631c;
        }

        public void onStop() {
            if (!this.f1958a.f792f) {
                this.f1958a.f788b.setVisibility(4);
            }
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$4 */
    class C11214 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0631c f1959a;

        C11214(C0631c c0631c) {
            this.f1959a = c0631c;
        }

        public void onStop() {
            if (!this.f1959a.f792f) {
                this.f1959a.f803q.setVisibility(8);
            }
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$6 */
    class C11236 extends C0681b {
        /* renamed from: a */
        final /* synthetic */ C0631c f1961a;

        C11236(C0631c c0631c) {
            this.f1961a = c0631c;
        }

        /* renamed from: a */
        public void mo1366a(float f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SeekBar onSeeking ");
            stringBuilder.append(f);
            C0591c.m791a("LiveControlPanelView", stringBuilder.toString());
            this.f1961a.f790d.m1094a();
            C0623b c0623b = this.f1961a.f787a.f766n;
            C0693b c0693b = this.f1961a.f787a.f762j;
            if (c0623b != C0623b.Live) {
                if (c0623b != C0623b.TimeShift) {
                    this.f1961a.f787a.f758f.m1150c((int) (((float) this.f1961a.f810x) * f));
                    if (this.f1961a.f803q != null) {
                        this.f1961a.f803q.setActivated(false);
                        this.f1961a.f803q.setText(R.string.icon_pause);
                        return;
                    }
                    return;
                }
            }
            f = 1.0f - f;
            if (f < 1.0f) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(C0730c.m1256b());
                this.f1961a.f787a.m911a(c0693b, ((long) ((((float) (this.f1961a.f808v.f1308c - this.f1961a.f808v.f1306a)) * f) + ((float) this.f1961a.f808v.f1306a))) + (((long) (((instance.get(11) * 3600) + (instance.get(12) * 60)) + instance.get(13))) - this.f1961a.f809w));
                return;
            }
            this.f1961a.f787a.m915b(c0693b, false);
        }

        /* renamed from: a */
        public long mo1365a() {
            if (!this.f1961a.f787a.f754b.m3164d()) {
                if (this.f1961a.m941a()) {
                    if (this.f1961a.f787a.f766n != C0623b.Record) {
                        Calendar instance = Calendar.getInstance();
                        long j = (long) (((instance.get(11) * 3600) + (instance.get(12) * 60)) + instance.get(13));
                        long j2 = j - (this.f1961a.f808v.f1308c - this.f1961a.f808v.f1306a);
                        return ((long) (((float) (j - j2)) * (1.0f - this.f1961a.f791e.m1183c()))) + j2;
                    } else if (this.f1961a.f810x <= 0) {
                        return 0;
                    } else {
                        float g;
                        if (!this.f1961a.f791e.m1179a()) {
                            if (!this.f1961a.f791e.m1182b()) {
                                g = ((float) ((long) this.f1961a.f787a.f758f.m1155g())) / ((float) this.f1961a.f810x);
                                return (long) ((((float) this.f1961a.f810x) * g) / 1000.0f);
                            }
                        }
                        g = this.f1961a.f791e.m1183c();
                        return (long) ((((float) this.f1961a.f810x) * g) / 1000.0f);
                    }
                }
            }
            return 0;
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$7 */
    class C11247 extends C0622a {
        /* renamed from: a */
        final /* synthetic */ C0631c f1962a;

        C11247(C0631c c0631c) {
            this.f1962a = c0631c;
        }

        /* renamed from: a */
        public void mo1360a(C0624c c0624c) {
            if (this.f1962a.f787a.f755c.m1024b() == null) {
                this.f1962a.m940a(false);
            }
            this.f1962a.f787a.f753a.f1263k.removeCallbacks(this.f1962a.f812z);
            this.f1962a.f787a.f753a.f1263k.postDelayed(this.f1962a.f812z, 800);
            c0624c = this.f1962a.f787a.f766n;
            if (c0624c == C0623b.Live) {
                this.f1962a.f808v = null;
                this.f1962a.f810x = 0;
                this.f1962a.f791e.m1176a(C0680a.Right);
                this.f1962a.f791e.m1178a(false);
                this.f1962a.f791e.m1185e();
                this.f1962a.m926c();
            } else if (c0624c == C0623b.Record) {
                this.f1962a.f808v = null;
                this.f1962a.f810x = 0;
                this.f1962a.f791e.m1176a(C0680a.Left);
                this.f1962a.f791e.m1178a(false);
                this.f1962a.f791e.m1185e();
                if (this.f1962a.f803q != null) {
                    this.f1962a.f803q.setActivated(false);
                    this.f1962a.f803q.setText(R.string.icon_pause);
                }
                this.f1962a.m926c();
            }
        }
    }

    /* compiled from: LiveControlPanelView */
    /* renamed from: com.iptv2.c.a.c$8 */
    class C11268 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0631c f1965a;

        C11268(C0631c c0631c) {
            this.f1965a = c0631c;
        }

        /* renamed from: b */
        public void mo1340b() {
            this.f1965a.f790d.m1095b();
        }

        /* renamed from: c */
        public void mo1341c() {
            this.f1965a.f790d.m1094a();
        }

        /* renamed from: d */
        public void mo1342d() {
            this.f1965a.f790d.m1095b();
            if (!this.f1965a.f787a.f755c.m1024b() && this.f1965a.f792f) {
                this.f1965a.m940a(true);
            }
        }

        /* renamed from: g */
        public void mo1369g() {
            this.f1965a.f790d.m1094a();
        }

        /* renamed from: f */
        public void mo1368f() {
            this.f1965a.f790d.m1095b();
        }

        /* renamed from: e */
        public void mo1343e() {
            this.f1965a.f790d.m1095b();
            if (!this.f1965a.f787a.f755c.m1024b() && this.f1965a.f792f) {
                this.f1965a.m940a(true);
            }
            final C0693b c0693b = this.f1965a.f787a.f762j;
            C0623b c0623b = this.f1965a.f787a.f766n;
            if (c0623b != C0623b.Live) {
                if (c0623b != C0623b.TimeShift) {
                    this.f1965a.f810x = (long) this.f1965a.f787a.f758f.m1154f();
                    if (this.f1965a.f810x > 0) {
                        this.f1965a.f791e.m1181b(this.f1965a.f810x);
                        this.f1965a.f791e.m1178a(true);
                        return;
                    }
                    return;
                }
            }
            this.f1965a.f787a.f753a.f1250E.m1340a(new C0735a(this) {
                /* renamed from: b */
                final /* synthetic */ C11268 f1964b;

                /* renamed from: a */
                public void mo1367a(boolean z, C0738d c0738d) {
                    if (z && !this.f1964b.f1965a.f787a.f754b.m3164d()) {
                        if (this.f1964b.f1965a.f787a.f762j == c0693b) {
                            if (!this.f1964b.f1965a.f791e.m1179a()) {
                                this.f1964b.f1965a.f808v = c0738d;
                                z = Calendar.getInstance();
                                z.setTime(C0730c.m1256b());
                                this.f1964b.f1965a.f809w = (long) (((z.get(11) * 3600) + (z.get(12) * 60)) + z.get(13));
                                this.f1964b.f1965a.f791e.m1174a(((float) (this.f1964b.f1965a.f808v.f1308c - this.f1964b.f1965a.f808v.f1307b)) / ((float) (this.f1964b.f1965a.f808v.f1308c - this.f1964b.f1965a.f808v.f1306a)));
                                this.f1964b.f1965a.f791e.m1178a(true);
                                this.f1964b.f1965a.f791e.m1181b((this.f1964b.f1965a.f808v.f1308c - this.f1964b.f1965a.f808v.f1306a) * true);
                                this.f1964b.f1965a.f787a.f753a.f1263k.removeCallbacks(this.f1964b.f1965a.f812z);
                                this.f1964b.f1965a.f812z.run();
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f1964b.f1965a.f791e.m1184d()) {
                        this.f1964b.f1965a.f791e.m1185e();
                        this.f1964b.f1965a.f791e.m1178a((boolean) null);
                    }
                }
            });
        }
    }

    public C0631c(C0626b c0626b, View view) {
        this.f787a = c0626b;
        this.f803q = (TextView) view.findViewById(R.id.btn_pause);
        this.f788b = (FrameLayout) view.findViewById(R.id.controlpanel);
        this.f794h = this.f788b.getLayoutParams().height;
        this.f806t = this.f788b.findViewById(R.id.epg_container);
        this.f790d = new C0664b(this.f787a.f753a, this.f788b.findViewById(R.id.loading));
        this.f791e = new C0682h(this.f787a.f753a, this.f788b.findViewById(R.id.seekbar));
        this.f789c = (TextView) this.f788b.findViewById(R.id.mediatype);
        this.f804r = (TextView) this.f788b.findViewById(R.id.p2pstat2);
        this.f805s = this.f788b.findViewById(R.id.setting);
        this.f800n = (ImageView) this.f788b.findViewById(R.id.logo);
        this.f801o = (TextView) this.f788b.findViewById(R.id.keycode);
        this.f802p = (TextView) this.f788b.findViewById(R.id.name);
        this.f795i = (TextView) this.f788b.findViewById(R.id.epgtime1);
        this.f796j = (TextView) this.f788b.findViewById(R.id.epgtime2);
        this.f797k = (TextView) this.f788b.findViewById(R.id.epgtext1);
        this.f798l = (TextView) this.f788b.findViewById(R.id.epgtext2);
        this.f799m = (TextView) this.f788b.findViewById(R.id.epgtext1_progress);
        C0595e.m810a(this.f806t, new C06271(this));
        this.f791e.m1177a(new C11236(this));
        this.f787a.m910a(new C11247(this));
        this.f787a.f758f.m1142a(new C11268(this));
        if (this.f787a.f753a.f1248C.m1321h() != null) {
            this.f801o.setVisibility(8);
            this.f803q.setVisibility(0);
            this.f803q.setOnTouchListener(new C06299(this));
            this.f803q.setOnClickListener(new OnClickListener(this) {
                /* renamed from: a */
                final /* synthetic */ C0631c f779a;

                {
                    this.f779a = r1;
                }

                public void onClick(View view) {
                    if (this.f779a.f787a.f766n == C0623b.Record && this.f779a.f791e.m1179a() == null && this.f779a.f791e.m1182b() == null && this.f779a.f792f != null) {
                        if (this.f779a.f787a.f767o != null) {
                            if (this.f779a.f787a.f758f.m1151c() != null) {
                                this.f779a.f787a.f758f.m1148b();
                                this.f779a.f803q.setActivated(false);
                                this.f779a.f803q.setText(R.string.icon_pause);
                            } else {
                                this.f779a.f787a.f758f.m1139a();
                                this.f779a.f803q.setActivated(true);
                                this.f779a.f803q.setText(R.string.icon_play);
                            }
                        }
                    }
                }
            });
            this.f788b.setOnDispatchTouchEventListener(new C0600a(this) {
                /* renamed from: a */
                final /* synthetic */ C0631c f1956a;

                {
                    this.f1956a = r1;
                }

                /* renamed from: a */
                public boolean mo1363a(MotionEvent motionEvent) {
                    this.f1956a.m940a(true);
                    return null;
                }
            });
            return;
        }
        this.f805s.setVisibility(0);
        ((ViewGroup) this.f803q.getParent()).removeView(this.f803q);
        this.f803q = null;
    }

    /* renamed from: a */
    public void m938a(C0630a c0630a) {
        this.f811y.add(c0630a);
    }

    /* renamed from: c */
    private void m926c() {
        C1174j c1174j;
        C0693b c0693b = this.f787a.f762j;
        this.f801o.setText(String.format("%03d", new Object[]{Integer.valueOf(c0693b.f1072c)}));
        this.f802p.setText(c0693b.f1071b);
        if (!this.f787a.f753a.f1248C.f1284c.f1159r.isEmpty()) {
            if (!c0693b.f1073d.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f787a.f753a.f1248C.f1284c.f1159r);
                stringBuilder.append(c0693b.f1073d);
                this.f787a.f753a.f1254I.displayImage(stringBuilder.toString(), this.f800n, this.f787a.f753a.f1256K);
                if (this.f803q != null) {
                    this.f803q.setVisibility(8);
                }
                if (this.f787a.f766n == C0623b.Live) {
                    this.f789c.setText("LIVE");
                    m939a(C0730c.m1256b());
                } else if (this.f787a.f766n == C0623b.Record) {
                    this.f789c.setText("RECORD");
                    c1174j = this.f787a.f764l;
                    this.f799m.setText("");
                    this.f799m.setWidth(0);
                    this.f795i.setText(c1174j.g);
                    this.f797k.setText(c1174j.e);
                    if (c1174j.f2063d == null) {
                        this.f796j.setText(c1174j.f2063d.g);
                        this.f796j.setVisibility(0);
                        this.f798l.setText(c1174j.f2063d.e);
                        this.f798l.setVisibility(0);
                    } else {
                        this.f796j.setText("");
                        this.f796j.setVisibility(8);
                        this.f798l.setText("");
                        this.f798l.setVisibility(8);
                    }
                    if (this.f803q != null && this.f792f) {
                        this.f803q.setVisibility(0);
                        return;
                    }
                }
            }
        }
        this.f800n.setImageResource(R.drawable.icon_live_channel_logo_empty);
        if (this.f803q != null) {
            this.f803q.setVisibility(8);
        }
        if (this.f787a.f766n == C0623b.Live) {
            this.f789c.setText("LIVE");
            m939a(C0730c.m1256b());
        } else if (this.f787a.f766n == C0623b.Record) {
            this.f789c.setText("RECORD");
            c1174j = this.f787a.f764l;
            this.f799m.setText("");
            this.f799m.setWidth(0);
            this.f795i.setText(c1174j.g);
            this.f797k.setText(c1174j.e);
            if (c1174j.f2063d == null) {
                this.f796j.setText("");
                this.f796j.setVisibility(8);
                this.f798l.setText("");
                this.f798l.setVisibility(8);
            } else {
                this.f796j.setText(c1174j.f2063d.g);
                this.f796j.setVisibility(0);
                this.f798l.setText(c1174j.f2063d.e);
                this.f798l.setVisibility(0);
            }
            if (this.f803q != null) {
            }
        }
    }

    /* renamed from: a */
    public void m939a(Date date) {
        C0591c.m791a("LiveControlPanelView", "updateEpg");
        C1173g a = this.f787a.f753a.f1248C.m1288a(this.f787a.f762j.f1070a, date);
        if (a != null) {
            this.f795i.setText(a.g);
            this.f797k.setText(a.e);
            this.f799m.setText(a.e);
            int i = a.h;
            if (i == 0) {
                i = C0595e.m801a(this.f799m);
                a.h = i;
            }
            if (i > this.f807u) {
                i = this.f807u;
            }
            this.f799m.getLayoutParams().width = (int) (((float) i) * (((float) (date.getTime() - a.f2057b)) / ((float) ((a.f2058c * 60) * 1000))));
            this.f799m.requestLayout();
            if (a.f2059d != null) {
                date = a.f2059d;
                this.f796j.setText(date.g);
                this.f796j.setVisibility(0);
                this.f798l.setText(date.e);
                this.f798l.setVisibility(0);
                return;
            }
            this.f796j.setText("");
            this.f796j.setVisibility(8);
            this.f798l.setText("");
            this.f798l.setVisibility(8);
            return;
        }
        this.f795i.setText("");
        this.f797k.setText(this.f787a.f753a.f1251F.m1350e("epgEmpty"));
        this.f799m.setText("");
        this.f799m.setWidth(0);
        this.f796j.setText("");
        this.f796j.setVisibility(8);
        this.f798l.setText("");
        this.f798l.setVisibility(8);
    }

    /* renamed from: a */
    public boolean m941a() {
        return this.f792f;
    }

    /* renamed from: a */
    public void m940a(boolean z) {
        if (this.f787a.f761i == null || !this.f787a.f761i.m1101a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show ");
            stringBuilder.append(z);
            C0591c.m791a("LiveControlPanelView", stringBuilder.toString());
            this.f787a.f753a.f1263k.removeCallbacks(this.f785A);
            if (z) {
                this.f787a.f753a.f1263k.postDelayed(this.f785A, 5000);
            }
            if (!this.f792f) {
                this.f792f = true;
                this.f787a.f753a.f1263k.removeCallbacks(this.f786B);
                this.f804r.setText("");
                this.f786B.run();
                this.f787a.f753a.f1263k.removeCallbacks(this.f812z);
                this.f812z.run();
                if (this.f793g != null) {
                    this.f793g.cancel();
                }
                boolean z2 = false;
                this.f788b.setVisibility(0);
                int alpha = (int) ((200.0f * this.f788b.getAlpha()) / 1.0f);
                this.f793g = new ViewAnimator();
                long j = (long) (200 - alpha);
                this.f793g.addAnimationBuilder(this.f788b).interpolator(new LinearInterpolator()).custom(new C11192(this), this.f788b.getTranslationY(), 0.0f).alpha(r0, 1.0f).duration(j);
                if (this.f803q != null && this.f787a.f766n == C0623b.Record) {
                    if (this.f787a.f758f.m1151c()) {
                        this.f803q.setActivated(true);
                        this.f803q.setText(R.string.icon_play);
                    } else {
                        this.f803q.setActivated(false);
                        this.f803q.setText(R.string.icon_pause);
                    }
                    this.f803q.setVisibility(0);
                    this.f793g.addAnimationBuilder(this.f803q).interpolator(new LinearInterpolator()).alpha(r0, 1.0f).duration(j);
                }
                this.f793g.start();
                z = this.f811y.size();
                while (z2 < z) {
                    ((C0630a) this.f811y.get(z2)).mo1324a(this.f792f);
                    z2++;
                }
            }
        }
    }

    /* renamed from: b */
    public void m943b() {
        this.f804r.setText("");
        this.f787a.f753a.f1263k.removeCallbacks(this.f786B);
        this.f787a.f753a.f1263k.removeCallbacks(this.f812z);
        this.f787a.f753a.f1263k.removeCallbacks(this.f785A);
        if (this.f792f) {
            C0591c.m791a("LiveControlPanelView", "hide");
            int i = 0;
            this.f792f = false;
            if (this.f793g != null) {
                this.f793g.cancel();
            }
            this.f788b.setVisibility(0);
            int alpha = (int) ((200.0f * this.f788b.getAlpha()) / 1.0f);
            this.f793g = new ViewAnimator();
            long j = (long) alpha;
            this.f793g.addAnimationBuilder(this.f788b).interpolator(new LinearInterpolator()).translationY(this.f788b.getTranslationY(), (float) (this.f794h / 3)).alpha(r1, 0.0f).duration(j).onStop(new C11203(this));
            if (this.f803q != null && this.f787a.f766n == C0623b.Record) {
                this.f803q.setVisibility(0);
                this.f793g.addAnimationBuilder(this.f803q).interpolator(new LinearInterpolator()).alpha(r1, 0.0f).onStop(new C11214(this)).duration(j);
            }
            this.f793g.start();
            int size = this.f811y.size();
            while (i < size) {
                ((C0630a) this.f811y.get(i)).mo1324a(this.f792f);
                i++;
            }
        }
    }

    /* renamed from: a */
    public boolean m942a(int i) {
        if (this.f791e.m1184d() && this.f791e.m1180a(i)) {
            m940a(false);
            return true;
        } else if (i != 4) {
            return false;
        } else {
            m943b();
            return true;
        }
    }

    /* renamed from: b */
    public boolean m944b(int i) {
        if (this.f791e.m1184d() == 0) {
            return false;
        }
        m940a(true);
        return true;
    }
}
