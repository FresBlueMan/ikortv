package com.iptv2.p044c.p046b;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.AnimationListener.Update;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.FrameLayout;
import com.iptv2.base.FrameLayout.C0600a;
import com.iptv2.core.C0740e.C0736b;
import com.iptv2.core.C0740e.C0739e;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0664b;
import com.iptv2.p044c.C0677g.C0676a;
import com.iptv2.p044c.C0682h;
import com.iptv2.p044c.C0682h.C0680a;
import com.iptv2.p044c.C0682h.C0681b;
import com.iptv2.p044c.p046b.C0653a.C0652a;
import com.iptv2.p044c.p046b.C0658b;
import java.util.ArrayList;

/* compiled from: VodControlPanelView */
/* renamed from: com.iptv2.c.b.b */
public class C0658b {
    /* renamed from: a */
    private C0653a f932a;
    /* renamed from: b */
    private FrameLayout f933b;
    /* renamed from: c */
    private C0664b f934c;
    /* renamed from: d */
    private C0682h f935d;
    /* renamed from: e */
    private TextView f936e;
    /* renamed from: f */
    private TextView f937f;
    /* renamed from: g */
    private TextView f938g;
    /* renamed from: h */
    private TextView f939h;
    /* renamed from: i */
    private View f940i;
    /* renamed from: j */
    private boolean f941j = false;
    /* renamed from: k */
    private ViewAnimator f942k;
    /* renamed from: l */
    private int f943l;
    /* renamed from: m */
    private long f944m;
    /* renamed from: n */
    private ArrayList<C0657a> f945n = new ArrayList();
    /* renamed from: o */
    private Runnable f946o = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ C0658b f927a;

        {
            this.f927a = r1;
        }

        public void run() {
            this.f927a.f932a.f909a.f1263k.removeCallbacks(this.f927a.f946o);
            if (!this.f927a.f932a.f910b.m3164d() && this.f927a.m1089a()) {
                if (this.f927a.f944m != 0) {
                    float g;
                    long a;
                    Handler handler;
                    Runnable e;
                    long j;
                    if (!this.f927a.f935d.m1179a()) {
                        if (!this.f927a.f935d.m1182b()) {
                            g = ((float) ((long) this.f927a.f932a.f911c.m1155g())) / ((float) this.f927a.f944m);
                            a = (long) ((((float) this.f927a.f944m) * g) / 1000.0f);
                            this.f927a.f935d.m1174a(g);
                            this.f927a.f935d.m1175a(a);
                            handler = this.f927a.f932a.f909a.f1263k;
                            e = this.f927a.f946o;
                            if (!this.f927a.f935d.m1179a()) {
                                if (this.f927a.f935d.m1182b()) {
                                    j = 900;
                                    handler.postDelayed(e, j);
                                }
                            }
                            j = 100;
                            handler.postDelayed(e, j);
                        }
                    }
                    this.f927a.m1088a(true);
                    g = this.f927a.f935d.m1183c();
                    a = (long) ((((float) this.f927a.f944m) * g) / 1000.0f);
                    this.f927a.f935d.m1174a(g);
                    this.f927a.f935d.m1175a(a);
                    handler = this.f927a.f932a.f909a.f1263k;
                    e = this.f927a.f946o;
                    if (this.f927a.f935d.m1179a()) {
                        if (this.f927a.f935d.m1182b()) {
                            j = 900;
                            handler.postDelayed(e, j);
                        }
                    }
                    j = 100;
                    handler.postDelayed(e, j);
                }
            }
        }
    };
    /* renamed from: p */
    private Runnable f947p = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ C0658b f928a;

        {
            this.f928a = r1;
        }

        public void run() {
            this.f928a.m1093c();
        }
    };
    /* renamed from: q */
    private Runnable f948q = new C06544(this);

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$4 */
    class C06544 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0658b f929a;

        /* compiled from: VodControlPanelView */
        /* renamed from: com.iptv2.c.b.b$4$1 */
        class C11481 implements C0736b {
            /* renamed from: a */
            final /* synthetic */ C06544 f2012a;

            C11481(C06544 c06544) {
                this.f2012a = c06544;
            }

            /* renamed from: a */
            public void mo1364a(boolean z, C0739e c0739e) {
                if (this.f2012a.f929a.f941j) {
                    if (z) {
                        this.f2012a.f929a.f939h.setText(String.format(C0595e.f658a, "T:%d S:%d R:%d", new Object[]{Integer.valueOf(c0739e.f1312d), Integer.valueOf(c0739e.f1313e), Integer.valueOf(c0739e.f1314f)}));
                    } else {
                        this.f2012a.f929a.f939h.setText("");
                    }
                    this.f2012a.f929a.f932a.f909a.f1263k.postDelayed(this.f2012a.f929a.f948q, 800);
                }
            }
        }

        C06544(C0658b c0658b) {
            this.f929a = c0658b;
        }

        public void run() {
            this.f929a.f932a.f909a.f1250E.m1341a(new C11481(this));
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$7 */
    class C06557 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0658b f930a;

        C06557(C0658b c0658b) {
            this.f930a = c0658b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f930a.m1088a(true);
            return null;
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$8 */
    class C06568 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C0658b f931a;

        C06568(C0658b c0658b) {
            this.f931a = c0658b;
        }

        public void onClick(View view) {
            if (this.f931a.f935d.m1179a() == null && this.f931a.f935d.m1182b() == null && this.f931a.f941j != null) {
                if (this.f931a.f932a.f918j != null) {
                    if (this.f931a.f932a.f911c.m1151c() != null) {
                        this.f931a.f932a.f911c.m1148b();
                        this.f931a.f938g.setActivated(false);
                        this.f931a.f938g.setText(R.string.icon_pause);
                    } else {
                        this.f931a.f932a.f911c.m1139a();
                        this.f931a.f938g.setActivated(true);
                        this.f931a.f938g.setText(R.string.icon_play);
                    }
                }
            }
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$a */
    public static abstract class C0657a {
        /* renamed from: a */
        public void mo1345a(boolean z) {
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$1 */
    class C11451 extends C0681b {
        /* renamed from: a */
        final /* synthetic */ C0658b f2009a;

        C11451(C0658b c0658b) {
            this.f2009a = c0658b;
        }

        /* renamed from: a */
        public void mo1366a(float f) {
            this.f2009a.f932a.f911c.m1150c((int) (((float) this.f2009a.f944m) * f));
            if (this.f2009a.f938g != null) {
                this.f2009a.f938g.setActivated(false);
                this.f2009a.f938g.setText(R.string.icon_pause);
            }
        }

        /* renamed from: a */
        public long mo1365a() {
            if (!this.f2009a.f932a.f910b.m3164d() && this.f2009a.m1089a()) {
                if (this.f2009a.f944m != 0) {
                    return (long) ((((float) this.f2009a.f944m) * this.f2009a.f935d.m1183c()) / 1000.0f);
                }
            }
            return 0;
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$2 */
    class C11462 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0658b f2010a;

        C11462(C0658b c0658b) {
            this.f2010a = c0658b;
        }

        public void onStop() {
            if (!this.f2010a.f941j) {
                this.f2010a.f933b.setVisibility(4);
            }
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$3 */
    class C11473 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0658b f2011a;

        C11473(C0658b c0658b) {
            this.f2011a = c0658b;
        }

        public void onStop() {
            if (!this.f2011a.f941j) {
                this.f2011a.f938g.setVisibility(8);
            }
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$5 */
    class C11495 extends C0652a {
        /* renamed from: a */
        final /* synthetic */ C0658b f2013a;

        C11495(C0658b c0658b) {
            this.f2013a = c0658b;
        }

        /* renamed from: a */
        public void mo1344a() {
            this.f2013a.f932a.f909a.f1263k.removeCallbacks(this.f2013a.f946o);
            this.f2013a.f944m = 0;
            this.f2013a.f935d.m1176a(C0680a.Left);
            this.f2013a.f935d.m1178a(false);
            this.f2013a.f935d.m1185e();
            if (this.f2013a.f938g != null) {
                this.f2013a.f938g.setActivated(false);
                this.f2013a.f938g.setText(R.string.icon_pause);
            }
            this.f2013a.m1079d();
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$6 */
    class C11506 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0658b f2014a;

        C11506(C0658b c0658b) {
            this.f2014a = c0658b;
        }

        /* renamed from: a */
        public void mo1339a(int i) {
            this.f2014a.f934c.m1094a();
        }

        /* renamed from: b */
        public void mo1340b() {
            this.f2014a.f934c.m1095b();
        }

        /* renamed from: c */
        public void mo1341c() {
            this.f2014a.f934c.m1094a();
        }

        /* renamed from: d */
        public void mo1342d() {
            this.f2014a.f934c.m1095b();
        }

        /* renamed from: g */
        public void mo1369g() {
            this.f2014a.f934c.m1094a();
        }

        /* renamed from: f */
        public void mo1368f() {
            this.f2014a.f934c.m1095b();
        }

        /* renamed from: e */
        public void mo1343e() {
            this.f2014a.f934c.m1095b();
            this.f2014a.f944m = (long) this.f2014a.f932a.f911c.m1154f();
            if (this.f2014a.f944m > 0) {
                this.f2014a.f935d.m1178a(true);
                this.f2014a.f935d.m1181b(this.f2014a.f944m);
                if (this.f2014a.f941j) {
                    this.f2014a.f946o.run();
                }
            }
        }
    }

    /* compiled from: VodControlPanelView */
    /* renamed from: com.iptv2.c.b.b$9 */
    class C11519 implements C0600a {
        /* renamed from: a */
        final /* synthetic */ C0658b f2015a;

        C11519(C0658b c0658b) {
            this.f2015a = c0658b;
        }

        /* renamed from: a */
        public boolean mo1363a(MotionEvent motionEvent) {
            this.f2015a.m1088a(true);
            return null;
        }
    }

    /* renamed from: b */
    public void m1091b() {
    }

    public C0658b(C0653a c0653a, View view) {
        this.f932a = c0653a;
        this.f938g = (TextView) view.findViewById(R.id.btn_pause);
        this.f933b = (FrameLayout) view.findViewById(R.id.controlpanel);
        this.f943l = this.f933b.getLayoutParams().height;
        this.f934c = new C0664b(this.f932a.f909a, this.f933b.findViewById(R.id.loading));
        this.f935d = new C0682h(this.f932a.f909a, this.f933b.findViewById(R.id.seekbar));
        this.f936e = (TextView) this.f933b.findViewById(R.id.name);
        this.f937f = (TextView) this.f933b.findViewById(R.id.enname);
        this.f940i = this.f933b.findViewById(R.id.setting);
        this.f939h = (TextView) this.f933b.findViewById(R.id.p2pstat2);
        this.f935d.m1177a(new C11451(this));
        this.f932a.m1068a(new C11495(this));
        this.f932a.f911c.m1142a(new C11506(this));
        if (this.f932a.f909a.f1248C.m1321h() != null) {
            this.f938g.setVisibility(0);
            this.f938g.setOnTouchListener(new C06557(this));
            this.f938g.setOnClickListener(new C06568(this));
            this.f933b.setOnDispatchTouchEventListener(new C11519(this));
            return;
        }
        this.f940i.setVisibility(0);
        ((ViewGroup) this.f938g.getParent()).removeView(this.f938g);
        this.f938g = null;
    }

    /* renamed from: a */
    public void m1087a(C0657a c0657a) {
        this.f945n.add(c0657a);
    }

    /* renamed from: a */
    public boolean m1089a() {
        return this.f941j;
    }

    /* renamed from: d */
    private void m1079d() {
        C0702m c0702m = this.f932a.f916h;
        C0703n c0703n = this.f932a.f917i;
        if (c0702m.f1125o.size() > 1) {
            TextView textView = this.f936e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c0702m.f1113c);
            stringBuilder.append(" ");
            stringBuilder.append(c0703n.f1130c + 1);
            textView.setText(stringBuilder.toString());
        } else {
            this.f936e.setText(c0702m.f1113c);
        }
        this.f937f.setText(c0702m.f1112b);
    }

    /* renamed from: a */
    public void m1088a(boolean z) {
        if (this.f932a.f915g == null || !this.f932a.f915g.m1101a()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show ");
            stringBuilder.append(z);
            C0591c.m791a("VodControlPanelView", stringBuilder.toString());
            this.f932a.f909a.f1263k.removeCallbacks(this.f947p);
            if (z) {
                this.f932a.f909a.f1263k.postDelayed(this.f947p, 5000);
            }
            if (!this.f941j) {
                this.f941j = true;
                this.f946o.run();
                this.f932a.f909a.f1263k.removeCallbacks(this.f948q);
                this.f939h.setText("");
                this.f948q.run();
                if (this.f942k != null) {
                    this.f942k.cancel();
                }
                boolean z2 = false;
                this.f933b.setVisibility(0);
                int alpha = (int) ((200.0f * this.f933b.getAlpha()) / 1.0f);
                this.f942k = new ViewAnimator();
                long j = (long) (200 - alpha);
                this.f942k.addAnimationBuilder(this.f933b).interpolator(new LinearInterpolator()).custom(new Update(this) {
                    /* renamed from: a */
                    final /* synthetic */ C0658b f2008a;

                    {
                        this.f2008a = r1;
                    }

                    public void update(View view, float f) {
                        view.setTranslationY(f);
                        view.requestLayout();
                    }
                }, this.f933b.getTranslationY(), 0.0f).alpha(r0, 1.0f).duration(j);
                if (this.f938g != null) {
                    this.f938g.setVisibility(0);
                    this.f942k.addAnimationBuilder(this.f938g).interpolator(new LinearInterpolator()).alpha(r0, 1.0f).duration(j);
                }
                this.f942k.start();
                z = this.f945n.size();
                while (z2 < z) {
                    ((C0657a) this.f945n.get(z2)).mo1345a(this.f941j);
                    z2++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m1093c() {
        this.f932a.f909a.f1263k.removeCallbacks(this.f948q);
        this.f932a.f909a.f1263k.removeCallbacks(this.f946o);
        this.f932a.f909a.f1263k.removeCallbacks(this.f947p);
        if (this.f941j) {
            C0591c.m791a("VodControlPanelView", "hide");
            int i = 0;
            this.f941j = false;
            if (this.f942k != null) {
                this.f942k.cancel();
            }
            this.f933b.setVisibility(0);
            int alpha = (int) ((200.0f * this.f933b.getAlpha()) / 1.0f);
            this.f942k = new ViewAnimator();
            long j = (long) alpha;
            this.f942k.addAnimationBuilder(this.f933b).interpolator(new LinearInterpolator()).translationY(this.f933b.getTranslationY(), (float) (this.f943l / 3)).alpha(r1, 0.0f).duration(j).onStop(new C11462(this));
            if (this.f938g != null) {
                this.f938g.setVisibility(0);
                this.f942k.addAnimationBuilder(this.f938g).interpolator(new LinearInterpolator()).alpha(r1, 0.0f).onStop(new C11473(this)).duration(j);
            }
            this.f942k.start();
            int size = this.f945n.size();
            while (i < size) {
                ((C0657a) this.f945n.get(i)).mo1345a(this.f941j);
                i++;
            }
        }
    }

    /* renamed from: a */
    public boolean m1090a(int i) {
        if (this.f935d.m1184d() && this.f935d.m1180a(i)) {
            m1088a(false);
            return true;
        } else if (i != 4) {
            return false;
        } else {
            m1093c();
            return true;
        }
    }

    /* renamed from: b */
    public boolean m1092b(int i) {
        if (this.f935d.m1184d() == 0) {
            return false;
        }
        m1088a(true);
        return true;
    }
}
