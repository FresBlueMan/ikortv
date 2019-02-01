package com.iptv2.p042a;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import br.iptv2.C0433a;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.C1338a;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1351c.C0507a;
import com.iptv2.p042a.C1351c.C0508b;
import com.iptv2.p042a.C1351c.C0509c;
import com.iptv2.p042a.C1351c.C0510d;
import com.iptv2.p042a.C1352d;
import com.iptv2.p042a.C1353e.C0528a;
import com.iptv2.p042a.C1354f.C0537a;
import com.iptv2.p042a.C1355g.C0542a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* compiled from: SettingDialog */
/* renamed from: com.iptv2.a.d */
public class C1352d extends C1338a {
    /* renamed from: e */
    private View f2385e;
    /* renamed from: f */
    private View f2386f;
    /* renamed from: g */
    private SimpleRecyclerView f2387g;
    /* renamed from: h */
    private ArrayList<C0519b> f2388h;
    /* renamed from: i */
    private C0592a f2389i;
    /* renamed from: j */
    private C0518a f2390j;
    /* renamed from: k */
    private TextView f2391k;
    /* renamed from: l */
    private TextView f2392l;
    /* renamed from: m */
    private TextView f2393m;
    /* renamed from: n */
    private TextView f2394n;
    /* renamed from: o */
    private TextView f2395o;
    /* renamed from: p */
    private TextView f2396p;
    /* renamed from: q */
    private TextView f2397q;
    /* renamed from: r */
    private TextView f2398r;
    /* renamed from: s */
    private TextView f2399s;
    /* renamed from: t */
    private TextView f2400t;
    /* renamed from: u */
    private String f2401u;
    /* renamed from: v */
    private String f2402v;

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$1 */
    class C05111 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1352d f545a;

        C05111(C1352d c1352d) {
            this.f545a = c1352d;
        }

        public void run() {
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f545a.f2386f.getWidth();
            c0592a.f646b = this.f545a.f2386f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f545a.a.m1258a(1.0f);
            c0592a.f653i = this.f545a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f545a.f2386f, c0592a);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$3 */
    class C05123 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f546a;

        /* compiled from: SettingDialog */
        /* renamed from: com.iptv2.a.d$3$1 */
        class C10501 extends C0528a {
            /* renamed from: a */
            final /* synthetic */ C05123 f1857a;

            C10501(C05123 c05123) {
                this.f1857a = c05123;
            }

            /* renamed from: a */
            public void mo1308a(String str, String str2, C0708c c0708c) {
                this.f1857a.f546a.a.f1248C.f1285d = null;
                this.f1857a.f546a.a.f1248C.m1297a(c0708c);
                this.f1857a.f546a.a.f1248C.m1319g(str);
                this.f1857a.f546a.a.f1248C.m1320h(str2);
                this.f1857a.f546a.a.m1259a(this.f1857a.f546a.b);
            }
        }

        C05123(C1352d c1352d) {
            this.f546a = c1352d;
        }

        public void onClick(View view) {
            view = new C1353e();
            view.m3054a(new C10501(this));
            view.m2846a(this.f546a.b);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$4 */
    class C05134 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f547a;

        /* compiled from: SettingDialog */
        /* renamed from: com.iptv2.a.d$4$1 */
        class C10511 extends C0537a {
            /* renamed from: a */
            final /* synthetic */ C05134 f1858a;

            C10511(C05134 c05134) {
                this.f1858a = c05134;
            }

            /* renamed from: a */
            public void mo1309a(String str, String str2) {
                this.f1858a.f547a.a.f1248C.f1284c = null;
                this.f1858a.f547a.a.f1248C.f1285d = null;
                this.f1858a.f547a.a.f1248C.m1319g(str);
                this.f1858a.f547a.a.f1248C.m1320h(str2);
                this.f1858a.f547a.a.m1259a(this.f1858a.f547a.b);
            }
        }

        C05134(C1352d c1352d) {
            this.f547a = c1352d;
        }

        public void onClick(View view) {
            view = new C1354f();
            view.m3073a(new C10511(this));
            view.m2846a(this.f547a.b);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$5 */
    class C05145 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f548a;

        C05145(C1352d c1352d) {
            this.f548a = c1352d;
        }

        public void onClick(View view) {
            new C1349a().m2846a(this.f548a.b);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$6 */
    class C05156 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f549a;

        /* compiled from: SettingDialog */
        /* renamed from: com.iptv2.a.d$6$1 */
        class C10521 extends C0510d {
            /* renamed from: a */
            final /* synthetic */ C05156 f1859a;

            C10521(C05156 c05156) {
                this.f1859a = c05156;
            }

            /* renamed from: a */
            public void mo1306a(C1351c c1351c, C0509c c0509c) {
                if (c0509c == C0509c.Button1) {
                    this.f1859a.f549a.a.f1247B = true;
                    this.f1859a.f549a.a.f1248C.f1284c = null;
                    this.f1859a.f549a.a.f1248C.f1285d = null;
                    this.f1859a.f549a.a.f1248C.m1320h("");
                    this.f1859a.f549a.a.m1259a(this.f1859a.f549a.b);
                }
            }
        }

        C05156(C1352d c1352d) {
            this.f549a = c1352d;
        }

        public void onClick(View view) {
            view = new C0507a();
            view.f527a = this.f549a.a.f1251F.m1350e("logoutConfirmTip");
            view.f529c = this.f549a.a.f1251F.m1347b("buttonOk");
            view.f530d = this.f549a.a.f1251F.m1347b("buttonCancel");
            view.f534h = C0508b.Button2;
            C1351c.m2970a(this.f549a.b, view, new C10521(this));
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$7 */
    class C05167 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f550a;

        C05167(C1352d c1352d) {
            this.f550a = c1352d;
        }

        public void onClick(View view) {
            this.f550a.dismiss();
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$8 */
    class C05178 implements OnFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ C1352d f551a;

        C05178(C1352d c1352d) {
            this.f551a = c1352d;
        }

        public void onFocusChange(View view, boolean z) {
            ((C1303c) view.getTag()).mo1854a(z);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$a */
    public static class C0518a {
        /* renamed from: a */
        public void mo1327a(int i) {
        }

        /* renamed from: a */
        public void m750a(String str) {
        }

        /* renamed from: a */
        public void mo1328a(boolean z) {
        }

        /* renamed from: a */
        public boolean mo1329a() {
            return false;
        }

        /* renamed from: b */
        public String mo1330b() {
            return "";
        }

        /* renamed from: b */
        public void mo1331b(int i) {
        }

        /* renamed from: b */
        public void m755b(String str) {
        }

        /* renamed from: c */
        public void mo1332c() {
        }

        /* renamed from: d */
        public boolean mo1359d() {
            return true;
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$b */
    private static class C0519b {
        /* renamed from: a */
        public String f552a;
        /* renamed from: b */
        public int f553b;
        /* renamed from: c */
        public String f554c;
        /* renamed from: d */
        public String f555d;

        public C0519b(String str, int i, String str2, String str3) {
            this.f552a = str;
            this.f553b = i;
            this.f554c = str2;
            this.f555d = str3;
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$2 */
    class C10492 extends C0510d {
        /* renamed from: a */
        final /* synthetic */ C1352d f1856a;

        C10492(C1352d c1352d) {
            this.f1856a = c1352d;
        }

        /* renamed from: a */
        public void mo1306a(C1351c c1351c, C0509c c0509c) {
            this.f1856a.a.f1248C.f1284c = null;
            this.f1856a.a.f1248C.f1285d = null;
            this.f1856a.a.m1259a(this.f1856a.b);
        }
    }

    /* compiled from: SettingDialog */
    /* renamed from: com.iptv2.a.d$c */
    private class C1303c extends C1102a<C0519b> {
        /* renamed from: a */
        public TextView f2208a;
        /* renamed from: b */
        public TextView f2209b;
        /* renamed from: c */
        public TextView f2210c;
        /* renamed from: d */
        final /* synthetic */ C1352d f2211d;

        /* compiled from: SettingDialog */
        /* renamed from: com.iptv2.a.d$c$1 */
        class C10541 extends C0542a {
            /* renamed from: a */
            final /* synthetic */ C1303c f1862a;

            C10541(C1303c c1303c) {
                this.f1862a = c1303c;
            }

            /* renamed from: a */
            public void mo1313a(String str) {
                if (!this.f1862a.f2211d.a.f1248C.m1302b().equals(str)) {
                    this.f1862a.f2211d.a.f1248C.m1315e(str);
                    this.f1862a.m2715a((C0519b) this.f1862a.h);
                    this.f1862a.f2211d.f2390j.m755b(str);
                    this.f1862a.f2211d.a.m1260a(this.f1862a.f2211d.a.f1248C.m1317f(str), 0);
                }
            }
        }

        public C1303c(C1352d c1352d, View view) {
            this.f2211d = c1352d;
            super(view);
            this.f2208a = (TextView) view.findViewById(R.id.icon);
            this.f2209b = (TextView) view.findViewById(R.id.text);
            this.f2210c = (TextView) view.findViewById(R.id.subtext);
            c1352d = C0593d.m796a(c1352d.a.f1260a, c1352d.f2389i);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842908}, c1352d);
            stateListDrawable.addState(new int[]{16842919}, c1352d);
            stateListDrawable.setExitFadeDuration(200);
            stateListDrawable.setEnterFadeDuration(200);
            C0595e.m809a(view, stateListDrawable);
        }

        /* renamed from: a */
        public void m2715a(C0519b c0519b) {
            this.h = c0519b;
            if (this.h.f552a.equals("favorite") != null) {
                c0519b = this.f2211d.f2390j.mo1329a();
                this.f2208a.setText(c0519b != null ? R.string.icon_favorite_checked : R.string.icon_favorite);
                this.f2208a.setTextColor(c0519b != null ? ContextCompat.getColor(this.f2211d.a.f1260a, R.color.favorite_checked_color) : -1);
                this.f2209b.setText(this.f2211d.a.f1251F.m1347b(c0519b != null ? "buttonCancelFavorite" : "buttonFavorite"));
                this.f2210c.setText(this.f2211d.f2390j.mo1330b());
            } else if (this.h.f552a.equals("videoRatio") != null) {
                int g = this.f2211d.a.f1248C.m1318g();
                this.f2208a.setText(g == null ? R.string.icon_videoratio_fill : R.string.icon_videoratio_autofit);
                this.f2209b.setText(((C0519b) this.h).f554c);
                this.f2210c.setText(this.f2211d.a.f1248C.m1312d(g));
            } else if (this.h.f552a.equals("mediaPlayerType") != null) {
                this.f2208a.setText(((C0519b) this.h).f553b);
                this.f2209b.setText(((C0519b) this.h).f554c);
                this.f2210c.setText(this.f2211d.a.f1248C.m1303b(this.f2211d.a.f1248C.m1316f()));
            } else if (this.h.f552a.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE) != null) {
                this.f2208a.setText(((C0519b) this.h).f553b);
                this.f2209b.setText(((C0519b) this.h).f554c);
                this.f2210c.setText(this.f2211d.a.f1248C.m1313d(this.f2211d.a.f1248C.m1291a()));
            } else if (this.h.f552a.equals("timeZone") != null) {
                this.f2208a.setText(((C0519b) this.h).f553b);
                this.f2209b.setText(((C0519b) this.h).f554c);
                this.f2210c.setText(this.f2211d.a.f1248C.m1317f(this.f2211d.a.f1248C.m1302b()));
            } else {
                this.f2208a.setText(((C0519b) this.h).f553b);
                this.f2209b.setText(((C0519b) this.h).f554c);
                if (this.h.f555d != null) {
                    if (this.h.f555d.equals("") == null) {
                        this.f2210c.setText(((C0519b) this.h).f555d);
                        this.f2210c.setVisibility(0);
                        return;
                    }
                }
                this.f2210c.setText("");
                this.f2210c.setVisibility(8);
            }
        }

        /* renamed from: a */
        public void mo1854a(boolean z) {
            if (z) {
                this.itemView.setSelected(true);
                ViewAnimator.animate(new View[]{this.itemView}).scaleX(1.02f).scaleY(1.02f).duration(200).start();
                ViewCompat.postInvalidateOnAnimation(this.f2211d.f2387g);
                return;
            }
            this.itemView.setSelected(false);
            ViewAnimator.animate(new View[]{this.itemView}).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MenuViewHolder onClick ");
            stringBuilder.append(((C0519b) this.h).f552a);
            C0591c.m791a("SettingDialog", stringBuilder.toString());
            int i = 1;
            if (((C0519b) this.h).f552a.equals("videoRatio")) {
                if (this.f2211d.a.f1248C.m1318g() == 1) {
                    i = 0;
                }
                this.f2211d.a.f1248C.m1309c(i);
                m2715a((C0519b) this.h);
                this.f2211d.f2390j.mo1327a(i);
                this.f2211d.a.m1260a(this.f2211d.a.f1248C.m1312d(i), 0);
            } else if (((C0519b) this.h).f552a.equals("favorite")) {
                this.f2211d.f2390j.mo1328a(this.f2211d.f2390j.mo1329a() ^ true);
                m2715a((C0519b) this.h);
            } else if (((C0519b) this.h).f552a.equals("mediaPlayerType")) {
                if (this.f2211d.a.f1248C.m1316f() == 1) {
                    i = 2;
                }
                this.f2211d.a.f1248C.m1293a(i);
                m2715a((C0519b) this.h);
                this.f2211d.f2390j.mo1331b(i);
                this.f2211d.a.m1260a(this.f2211d.a.f1248C.m1303b(i), 0);
            } else if (((C0519b) this.h).f552a.equals("reportError")) {
                this.f2211d.f2390j.mo1332c();
                this.f2211d.dismiss();
            } else if (((C0519b) this.h).f552a.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                int size = C0433a.f354a.size();
                if (size > 1) {
                    String str = (String) C0433a.f354a.get((C0433a.f354a.indexOf(this.f2211d.a.f1248C.m1291a()) + 1) % size);
                    this.f2211d.a.f1248C.m1310c(str);
                    m2715a((C0519b) this.h);
                    this.f2211d.f2390j.m750a(str);
                    this.f2211d.a.m1260a(this.f2211d.a.f1248C.m1313d(str), 0);
                }
            } else if (((C0519b) this.h).f552a.equals("timeZone")) {
                C1355g c1355g = new C1355g();
                c1355g.m3085a(new C10541(this));
                c1355g.m2846a(this.f2211d.b);
            }
        }
    }

    /* renamed from: a */
    public void m3033a(C0518a c0518a) {
        this.f2390j = c0518a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.Dialog);
        if (this.f2390j == null) {
            this.f2390j = new C0518a();
        }
        this.f2401u = this.a.f1248C.m1291a();
        this.f2402v = this.a.f1248C.m1302b();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2385e = layoutInflater.inflate(R.layout.dialog_setting, viewGroup, false);
        this.f2386f = this.f2385e.findViewById(R.id.content);
        this.f2391k = (TextView) this.f2385e.findViewById(R.id.title);
        this.f2391k.setText(this.a.f1251F.m1347b("buttonMenu"));
        this.f2387g = (SimpleRecyclerView) this.f2385e.findViewById(R.id.menu_list);
        this.f2392l = (TextView) this.f2385e.findViewById(R.id.lbl_username);
        this.f2392l.setText(this.a.f1251F.m1347b("userName"));
        this.f2393m = (TextView) this.f2385e.findViewById(R.id.text_username);
        this.f2394n = (TextView) this.f2385e.findViewById(R.id.text_serviceset);
        this.f2395o = (TextView) this.f2385e.findViewById(R.id.lbl_expiretime);
        this.f2395o.setText(this.a.f1251F.m1347b("expireTime"));
        this.f2396p = (TextView) this.f2385e.findViewById(R.id.text_expiretime);
        this.f2397q = (TextView) this.f2385e.findViewById(R.id.btn_signin);
        this.f2397q.setText(this.a.f1251F.m1347b("tabSignIn"));
        this.f2398r = (TextView) this.f2385e.findViewById(R.id.btn_signup);
        this.f2398r.setText(this.a.f1251F.m1347b("tabSignUp"));
        this.f2399s = (TextView) this.f2385e.findViewById(R.id.btn_logout);
        this.f2399s.setText(this.a.f1251F.m1347b("buttonLogout"));
        this.f2400t = (TextView) this.f2385e.findViewById(R.id.btn_auth);
        this.f2400t.setText(this.a.f1251F.m1347b("tabAuth"));
        m3008c();
        m3010d();
        C0595e.m810a(this.f2386f, new C05111(this));
        layoutInflater = this.a.f1248C.m1308c();
        if ("tv".equals("bind-device") != null) {
            layoutInflater = this.a.f1248C.m1308c().split("@")[0];
        }
        this.f2393m.setText(layoutInflater);
        this.f2394n.setText(this.a.f1248C.f1284c.f1153l);
        if (this.a.f1248C.f1284c.f1152k == null) {
            this.f2397q.setVisibility(0);
            this.f2397q.setOnClickListener(new C05123(this));
            this.f2398r.setVisibility(0);
            this.f2398r.setOnClickListener(new C05134(this));
        } else {
            this.f2400t.setVisibility(0);
            this.f2400t.setOnClickListener(new C05145(this));
            if ("tv".equals("bind-device") == null) {
                this.f2399s.setVisibility(0);
                this.f2399s.setOnClickListener(new C05156(this));
            }
        }
        if (this.a.f1248C.f1284c.f1152k == 3 || this.a.f1248C.f1284c.f1152k == 2) {
            this.f2395o.setVisibility(0);
            this.f2396p.setVisibility(0);
            this.f2396p.setText(this.a.f1248C.m1314e());
        }
        this.f2385e.setOnClickListener(new C05167(this));
        return this.f2385e;
    }

    /* renamed from: c */
    private void m3008c() {
        String b = this.f2390j.mo1330b();
        this.f2388h = new ArrayList();
        this.f2388h.add(new C0519b("videoRatio", R.string.icon_favorite, this.a.f1251F.m1347b("videoRatio"), null));
        if (!b.equals("")) {
            this.f2388h.add(new C0519b("favorite", 0, null, null));
        }
        this.f2388h.add(new C0519b("mediaPlayerType", R.string.icon_player, this.a.f1251F.m1347b("mediaPlayerType"), null));
        if (this.f2390j.mo1359d()) {
            this.f2388h.add(new C0519b("reportError", R.string.icon_reporterror, this.a.f1251F.m1347b("reportError"), null));
        }
        this.f2388h.add(new C0519b(IjkMediaMeta.IJKM_KEY_LANGUAGE, R.string.icon_language, this.a.f1251F.m1347b(IjkMediaMeta.IJKM_KEY_LANGUAGE), null));
        this.f2388h.add(new C0519b("timeZone", R.string.icon_timezone, this.a.f1251F.m1347b("timeZone"), null));
    }

    /* renamed from: d */
    private void m3010d() {
        this.f2387g.setActivedChildOnTop(true);
        this.f2389i = new C0592a();
        this.f2389i.f645a = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_width);
        this.f2389i.f646b = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_height);
        this.f2389i.f649e = ContextCompat.getColor(this.a.f1260a, R.color.dialog_setting_menu_item_focus_shadow_color);
        this.f2389i.f647c = ContextCompat.getColor(this.a.f1260a, R.color.dialog_setting_menu_item_focus_border_color);
        this.f2389i.f651g = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_focus_border_size);
        this.f2389i.f650f = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_focus_shadow_radius_size);
        final OnFocusChangeListener c05178 = new C05178(this);
        this.f2387g.setLayoutManager(new GridLayoutManager(this.a.f1260a, 2));
        this.f2387g.setAdapter(new Adapter<C1303c>(this) {
            /* renamed from: b */
            final /* synthetic */ C1352d f1861b;

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2256a((C1303c) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2255a(viewGroup, i);
            }

            /* renamed from: a */
            public C1303c m2255a(ViewGroup viewGroup, int i) {
                i = new C1303c(this.f1861b, this.f1861b.a.f1264l.inflate(R.layout.dialog_setting_menu_item, viewGroup, false));
                i.itemView.setOnFocusChangeListener(c05178);
                return i;
            }

            /* renamed from: a */
            public void m2256a(C1303c c1303c, int i) {
                c1303c.m2715a((C0519b) this.f1861b.f2388h.get(i));
            }

            public int getItemCount() {
                return this.f1861b.f2388h.size();
            }
        });
        this.f2387g.post(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ C1352d f544a;

            {
                this.f544a = r1;
            }

            public void run() {
                if (this.f544a.f2387g.getChildAt(0) != null) {
                    this.f544a.f2387g.getChildAt(0).requestFocus();
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        return super.mo2081a(i, keyEvent);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.a.f1248C.m1291a().equals(this.f2401u) != null) {
            if (this.a.f1248C.m1302b().equals(this.f2402v) != null) {
                dialogInterface = null;
                if (dialogInterface != null) {
                    dialogInterface = new C0507a();
                    dialogInterface.f528b = this.a.f1251F.m1350e("applySettingReloadTip");
                    dialogInterface.f529c = this.a.f1251F.m1347b("buttonOk");
                    C1351c.m2970a(this.b, dialogInterface, new C10492(this));
                }
            }
        }
        dialogInterface = true;
        if (dialogInterface != null) {
            dialogInterface = new C0507a();
            dialogInterface.f528b = this.a.f1251F.m1350e("applySettingReloadTip");
            dialogInterface.f529c = this.a.f1251F.m1347b("buttonOk");
            C1351c.m2970a(this.b, dialogInterface, new C10492(this));
        }
    }
}
