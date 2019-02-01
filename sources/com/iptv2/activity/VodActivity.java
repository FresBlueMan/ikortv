package com.iptv2.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.Activity;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.base.SimpleRecyclerView.C0603a;
import com.iptv2.core.C0712a.C0711f;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1351c;
import com.iptv2.p042a.C1351c.C0507a;
import com.iptv2.p042a.C1351c.C0508b;
import com.iptv2.p042a.C1351c.C0509c;
import com.iptv2.p042a.C1351c.C0510d;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.C0684i;
import com.victor.loading.rotate.RotateLoading;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Vector;

public class VodActivity extends Activity {
    /* renamed from: B */
    private static int f2504B;
    /* renamed from: A */
    private boolean f2505A = true;
    /* renamed from: C */
    private int f2506C;
    /* renamed from: D */
    private Runnable f2507D = new Runnable(this) {
        /* renamed from: a */
        final /* synthetic */ VodActivity f606a;

        {
            this.f606a = r1;
        }

        public void run() {
            int c = this.f606a.f2523u.m3148c();
            int d = this.f606a.f2523u.m3150d();
            if (c != -1) {
                if (d != -1) {
                    C0591c.m791a("VodActivity", "delay loadVodPageData");
                    c = this.f606a.f2528z.get(c) == null ? c / this.f606a.f2510h : -1;
                    if (c != -1) {
                        this.f606a.m3236a(c);
                    }
                    d = this.f606a.f2528z.get(d) == null ? d / this.f606a.f2510h : -1;
                    if (!(d == -1 || d == c)) {
                        this.f606a.m3236a(d);
                    }
                }
            }
        }
    };
    /* renamed from: a */
    private int f2508a;
    /* renamed from: b */
    private int f2509b = 2;
    /* renamed from: h */
    private int f2510h;
    /* renamed from: i */
    private C0573c f2511i = C0573c.None;
    /* renamed from: j */
    private View f2512j;
    /* renamed from: k */
    private C0684i f2513k;
    /* renamed from: l */
    private TextView f2514l;
    /* renamed from: m */
    private RotateLoading f2515m;
    /* renamed from: n */
    private View f2516n;
    /* renamed from: o */
    private View f2517o;
    /* renamed from: p */
    private View f2518p;
    /* renamed from: q */
    private TextView f2519q;
    /* renamed from: r */
    private ArrayList<C0572a> f2520r;
    /* renamed from: s */
    private SimpleRecyclerView f2521s;
    /* renamed from: t */
    private C0592a f2522t;
    /* renamed from: u */
    private SimpleRecyclerView f2523u;
    /* renamed from: v */
    private C0592a f2524v;
    /* renamed from: w */
    private String f2525w;
    /* renamed from: x */
    private String f2526x = "";
    /* renamed from: y */
    private String f2527y;
    /* renamed from: z */
    private Vector<C0702m> f2528z = new Vector();

    /* renamed from: com.iptv2.activity.VodActivity$1 */
    class C05691 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VodActivity f607a;

        C05691(VodActivity vodActivity) {
            this.f607a = vodActivity;
        }

        public void onClick(View view) {
            if (this.f607a.f2505A != null) {
                view = this.f607a.f2521s.getSelectedViewHolder();
                if (view != null) {
                    view.mo1855b();
                    return;
                }
                return;
            }
            view = this.f607a.f2523u.getSelectedViewHolder();
            if (view != null) {
                view.mo1855b();
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$4 */
    class C05704 implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ VodActivity f608a;

        C05704(VodActivity vodActivity) {
            this.f608a = vodActivity;
        }

        public boolean onLongClick(View view) {
            if (this.f608a.f2505A == null) {
                view = this.f608a.f2523u.getSelectedViewHolder();
                if (view != null) {
                    return view.mo1859e();
                }
            }
            return null;
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$5 */
    class C05715 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VodActivity f609a;

        C05715(VodActivity vodActivity) {
            this.f609a = vodActivity;
        }

        public void run() {
            this.f609a.f2521s.m3140a(3).mo1855b();
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$a */
    private static class C0572a {
        /* renamed from: a */
        public String f610a;
        /* renamed from: b */
        public String f611b;

        public C0572a(String str, String str2) {
            this.f610a = str;
            this.f611b = str2;
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$c */
    enum C0573c {
        None,
        Ready
    }

    /* renamed from: com.iptv2.activity.VodActivity$2 */
    class C10742 extends C0510d {
        /* renamed from: a */
        final /* synthetic */ VodActivity f1897a;

        C10742(VodActivity vodActivity) {
            this.f1897a = vodActivity;
        }

        /* renamed from: a */
        public void mo1336a(C1351c c1351c, C0509c c0509c, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onInputResult ");
            stringBuilder.append(c0509c);
            stringBuilder.append(" ");
            stringBuilder.append(str);
            C0591c.m791a("VodActivity", stringBuilder.toString());
            if (c0509c == C0509c.Button1) {
                this.f1897a.f2528z.clear();
                this.f1897a.f2523u.m3146b(-1, false);
                this.f1897a.f2523u.getAdapter().notifyDataSetChanged();
                this.f1897a.m3245b(0);
                this.f1897a.f2506C = VodActivity.m3243b();
                this.f1897a.f2521s.m3143a(0, true);
                this.f1897a.f2527y = str;
                this.f1897a.m3236a(0);
            }
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$6 */
    class C10766 extends Adapter<C1306b> {
        /* renamed from: a */
        final /* synthetic */ VodActivity f1901a;

        C10766(VodActivity vodActivity) {
            this.f1901a = vodActivity;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m2295a((C1306b) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m2294a(viewGroup, i);
        }

        /* renamed from: a */
        public C1306b m2294a(ViewGroup viewGroup, int i) {
            return new C1306b(this.f1901a, this.f1901a.c.f1264l.inflate(R.layout.activity_vod_genre_item, viewGroup, false));
        }

        /* renamed from: a */
        public void m2295a(C1306b c1306b, int i) {
            c1306b.m2727a((C0572a) this.f1901a.f2520r.get(i));
        }

        public int getItemCount() {
            return this.f1901a.f2520r.size();
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$7 */
    class C10777 extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ VodActivity f1902a;

        C10777(VodActivity vodActivity) {
            this.f1902a = vodActivity;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            recyclerView = this.f1902a.f2521s.m3148c();
            i = this.f1902a.f2521s.m3150d();
            int i3 = 0;
            this.f1902a.f2516n.setVisibility(recyclerView == null ? 8 : null);
            recyclerView = this.f1902a.f2517o;
            if (i == this.f1902a.f2520r.size() - 1) {
                i3 = 8;
            }
            recyclerView.setVisibility(i3);
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$8 */
    class C10788 extends Adapter<C1307d> {
        /* renamed from: a */
        final /* synthetic */ VodActivity f1903a;

        C10788(VodActivity vodActivity) {
            this.f1903a = vodActivity;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m2297a((C1307d) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m2296a(viewGroup, i);
        }

        /* renamed from: a */
        public C1307d m2296a(ViewGroup viewGroup, int i) {
            return new C1307d(this.f1903a, this.f1903a.c.f1264l.inflate(R.layout.activity_vod_item, viewGroup, false));
        }

        /* renamed from: a */
        public void m2297a(C1307d c1307d, int i) {
            C0702m c0702m = (C0702m) this.f1903a.f2528z.get(i);
            c1307d.m2732a(c0702m);
            this.f1903a.c.f1263k.removeCallbacks(this.f1903a.f2507D);
            if (c0702m == null) {
                this.f1903a.c.f1263k.postDelayed(this.f1903a.f2507D, 300);
            }
        }

        public int getItemCount() {
            return this.f1903a.f2528z.size();
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$9 */
    class C10799 extends C0603a {
        /* renamed from: a */
        final /* synthetic */ VodActivity f1904a;

        C10799(VodActivity vodActivity) {
            this.f1904a = vodActivity;
        }

        /* renamed from: a */
        public void mo1316a(int i, int i2) {
            this.f1904a.m3245b(0);
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$b */
    private class C1306b extends C1102a<C0572a> {
        /* renamed from: a */
        public TextView f2217a;
        /* renamed from: b */
        public Drawable f2218b;
        /* renamed from: c */
        final /* synthetic */ VodActivity f2219c;
        /* renamed from: d */
        private ViewAnimator f2220d;

        public C1306b(VodActivity vodActivity, View view) {
            this.f2219c = vodActivity;
            super(view);
            this.f2217a = (TextView) view.findViewById(R.id.text);
            vodActivity = C0593d.m796a(vodActivity.c.f1260a, vodActivity.f2522t);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, vodActivity);
            this.f2218b = stateListDrawable;
            C0595e.m809a(view, this.f2218b);
        }

        /* renamed from: a */
        public void m2727a(C0572a c0572a) {
            if (this.h != c0572a) {
                this.h = c0572a;
                this.f2217a.setText(((C0572a) this.h).f611b);
            }
        }

        /* renamed from: a */
        public void mo1858a() {
            boolean c = this.f2219c.f2505A;
            this.f2218b.setAlpha(c ? 255 : 0);
            this.f2217a.setTextColor(ContextCompat.getColorStateList(this.f2219c, c ? R.drawable.activity_vod_genre_item_text_actived_textcolor : R.drawable.activity_vod_genre_item_text_textcolor));
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onClick ");
            stringBuilder.append(((C0572a) this.h).f611b);
            C0591c.m791a("VodActivity", stringBuilder.toString());
            this.f2219c.m3242a(true);
            int adapterPosition = getAdapterPosition();
            this.f2219c.f2521s.m3146b(adapterPosition, false);
            if (!((C0572a) this.h).f610a.equals("search")) {
                this.f2219c.f2521s.m3143a(adapterPosition, true);
            }
            this.f2219c.m3237a((C0572a) this.h);
        }

        /* renamed from: c */
        public void mo1856c() {
            if (this.f2220d != null) {
                this.f2220d.cancel();
            }
            this.f2220d = new ViewAnimator();
            this.f2220d.addAnimationBuilder(this.itemView).scaleX(1.1f).scaleY(1.1f).duration(200).start();
            ViewCompat.postInvalidateOnAnimation(this.f2219c.f2521s);
        }

        /* renamed from: d */
        public void mo1857d() {
            if (this.f2220d != null) {
                this.f2220d.cancel();
            }
            this.f2220d = new ViewAnimator();
            this.f2220d.addAnimationBuilder(this.itemView).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }
    }

    /* renamed from: com.iptv2.activity.VodActivity$d */
    public class C1307d extends C1102a<C0702m> {
        /* renamed from: a */
        public ImageView f2221a;
        /* renamed from: b */
        public TextView f2222b;
        /* renamed from: c */
        public TextView f2223c;
        /* renamed from: d */
        public View f2224d;
        /* renamed from: e */
        public Drawable f2225e;
        /* renamed from: f */
        public View f2226f;
        /* renamed from: g */
        final /* synthetic */ VodActivity f2227g;
        /* renamed from: i */
        private ViewAnimator f2228i;

        public C1307d(VodActivity vodActivity, View view) {
            this.f2227g = vodActivity;
            super(view);
            this.f2221a = (ImageView) view.findViewById(R.id.logo);
            this.f2222b = (TextView) view.findViewById(R.id.name);
            this.f2223c = (TextView) view.findViewById(R.id.score);
            this.f2226f = view.findViewById(R.id.favorites);
            this.f2224d = view.findViewById(R.id.bottom);
            vodActivity = C0593d.m796a(vodActivity.c.f1260a, vodActivity.f2524v);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, vodActivity);
            stateListDrawable.setEnterFadeDuration(200);
            this.f2225e = stateListDrawable;
            C0595e.m809a(view, this.f2225e);
        }

        /* renamed from: b */
        public void mo1855b() {
            this.f2227g.m3242a(false);
            this.f2227g.f2523u.m3146b(getAdapterPosition(), false);
            if (this.h != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onClick ");
                stringBuilder.append(((C0702m) this.h).f1113c);
                C0591c.m791a("VodActivity", stringBuilder.toString());
                VodDetailActivity.f2529a = (C0702m) this.h;
                this.f2227g.startActivity(new Intent(this.f2227g, VodDetailActivity.class));
            }
        }

        /* renamed from: e */
        public boolean mo1859e() {
            this.f2227g.m3242a(false);
            this.f2227g.f2523u.m3146b(getAdapterPosition(), false);
            if (this.h == null) {
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLongClick ");
            stringBuilder.append(((C0702m) this.h).f1113c);
            C0591c.m791a("VodActivity", stringBuilder.toString());
            boolean b = this.f2227g.c.f1248C.m1307b((C0702m) this.h) ^ true;
            this.f2227g.c.f1248C.m1295a((C0702m) this.h, b);
            this.f2226f.setVisibility(b ? 0 : 8);
            this.f2227g.c.m1260a(this.f2227g.c.f1251F.m1350e(b ? "favoriteSuccess" : "cancelFavoriteSuccess"), 0);
            return true;
        }

        /* renamed from: a */
        public void m2732a(C0702m c0702m) {
            this.h = c0702m;
            int i = 8;
            if (this.h != null) {
                this.f2222b.setText(((C0702m) this.h).f1113c);
                CharSequence spannableStringBuilder = new SpannableStringBuilder(String.format(C0595e.f658a, "%.1f", new Object[]{Double.valueOf(((C0702m) this.h).f1115e)}));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f2227g.c.f1265m.getDimensionPixelSize(R.dimen.width_10_320)), 0, 1, 34);
                this.f2223c.setText(spannableStringBuilder);
                this.f2221a.setVisibility(0);
                c0702m = new StringBuilder();
                c0702m.append(this.f2227g.c.f1248C.f1284c.f1159r);
                c0702m.append(((C0702m) this.h).f1124n.f1137a);
                this.f2227g.c.f1254I.displayImage(c0702m.toString(), this.f2221a, this.f2227g.c.f1255J);
                this.f2224d.setVisibility(0);
                c0702m = this.f2226f;
                if (this.f2227g.c.f1248C.m1307b((C0702m) this.h)) {
                    i = 0;
                }
                c0702m.setVisibility(i);
                return;
            }
            this.f2226f.setVisibility(8);
            this.f2221a.setVisibility(8);
            this.f2224d.setVisibility(8);
            this.f2222b.setText("");
            this.f2223c.setText("");
            this.f2227g.c.f1254I.cancelDisplayTask(this.f2221a);
        }

        /* renamed from: a */
        public void mo1858a() {
            this.f2225e.setAlpha((this.f2227g.f2505A ^ 1) != 0 ? 255 : 0);
        }

        /* renamed from: c */
        public void mo1856c() {
            if (this.f2228i != null) {
                this.f2228i.cancel();
            }
            this.f2228i = new ViewAnimator();
            this.f2228i.addAnimationBuilder(this.itemView).scaleX(1.1f).scaleY(1.1f).duration(200).start();
            ViewCompat.postInvalidateOnAnimation(this.f2227g.f2523u);
        }

        /* renamed from: d */
        public void mo1857d() {
            if (this.f2228i != null) {
                this.f2228i.cancel();
            }
            this.f2228i = new ViewAnimator();
            this.f2228i.addAnimationBuilder(this.itemView).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m3243b() {
        int i = f2504B + 1;
        f2504B = i;
        return i;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2525w = getIntent().getStringExtra("GenreType");
        if (this.f2525w == null) {
            this.f2525w = "电视剧";
        }
        bundle = this.f2525w.equals("电影") != null ? this.c.f1248C.f1284c.f1145d : this.f2525w.equals("电视剧") != null ? this.c.f1248C.f1284c.f1144c : null;
        setContentView(R.layout.activity_vod);
        this.f2512j = findViewById(R.id.root);
        this.f2514l = (TextView) findViewById(R.id.pageno);
        this.f2515m = (RotateLoading) findViewById(R.id.loading);
        this.f2513k = new C0684i(this.c, findViewById(R.id.time));
        this.f2521s = (SimpleRecyclerView) findViewById(R.id.genre_list);
        this.f2523u = (SimpleRecyclerView) findViewById(R.id.vod_list);
        this.f2516n = findViewById(R.id.genre_more_up);
        this.f2517o = findViewById(R.id.genre_more_down);
        this.f2518p = findViewById(R.id.empty);
        this.f2519q = (TextView) findViewById(R.id.empty_text);
        this.f2520r = new ArrayList();
        this.f2520r.add(new C0572a("search", this.c.f1251F.m1347b("search")));
        this.f2520r.add(new C0572a("history", this.c.f1251F.m1347b("playHistory")));
        this.f2520r.add(new C0572a("favorites", this.c.f1251F.m1347b("favorites")));
        this.f2520r.add(new C0572a("all", this.c.f1251F.m1347b("all")));
        for (String str : bundle.keySet()) {
            this.f2520r.add(new C0572a(str, (String) bundle.get(str)));
        }
        m3255h();
        m3257i();
        if (this.c.f1248C.m1321h() == null) {
            this.f2512j.setFocusable(true);
            this.f2512j.setOnClickListener(new C05691(this));
            this.f2512j.setOnLongClickListener(new C05704(this));
        }
    }

    protected void onResume() {
        super.onResume();
        this.f2513k.m1191a();
        if (this.f2511i == C0573c.None) {
            m3238a(C0573c.Ready);
        } else if (!this.f2505A) {
            C1307d c1307d = (C1307d) this.f2523u.getSelectedViewHolder();
            if (c1307d != null) {
                this.f2523u.getAdapter().notifyItemChanged(c1307d.getAdapterPosition());
            }
        }
    }

    protected void onPause() {
        this.f2513k.m1192b();
        super.onPause();
    }

    /* renamed from: a */
    private void m3238a(C0573c c0573c) {
        C0573c c0573c2 = this.f2511i;
        if (c0573c2 != c0573c) {
            this.f2511i = c0573c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("changeViewState [");
            stringBuilder.append(c0573c2.name());
            stringBuilder.append("] to [");
            stringBuilder.append(c0573c);
            stringBuilder.append("]");
            C0591c.m791a("VodActivity", stringBuilder.toString());
            if (c0573c == C0573c.Ready) {
                m3253g();
            }
        }
    }

    /* renamed from: g */
    private void m3253g() {
        C0595e.m810a(this.f2521s, new C05715(this));
    }

    /* renamed from: h */
    private void m3255h() {
        this.f2521s.setActivedChildOnTop(true);
        this.f2521s.setChoiceMode(1);
        int dimensionPixelSize = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_genre_item_height) + (this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_genre_item_vmargin) * 2);
        this.f2521s.getLayoutParams().height = dimensionPixelSize * Math.min((int) ((((float) this.c.f1265m.getDimensionPixelSize(R.dimen.width_220_320)) / ((float) dimensionPixelSize)) + 0.5f), this.f2520r.size());
        this.f2522t = new C0592a();
        this.f2522t.f645a = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_genre_item_width);
        this.f2522t.f646b = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_genre_item_height);
        this.f2522t.f648d = Color.parseColor("#434343");
        this.f2522t.f649e = Color.argb(120, 0, 0, 255);
        this.f2522t.f647c = -1;
        this.f2522t.f651g = this.c.f1252G;
        this.f2522t.f650f = this.c.f1265m.getDimensionPixelSize(R.dimen.width_6_320);
        this.f2521s.setLayoutManager(new LinearLayoutManager(this));
        this.f2521s.setAdapter(new C10766(this));
        this.f2521s.addOnScrollListener(new C10777(this));
    }

    /* renamed from: i */
    private void m3257i() {
        this.f2523u.setActivedChildOnTop(true);
        int dimensionPixelSize = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_width) + (this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_hmargin) * 2);
        int dimensionPixelSize2 = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_height) + (this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_vmargin) * 2);
        int dimensionPixelSize3 = this.c.f1266n.widthPixels - this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_genre_width);
        int i = this.c.f1266n.heightPixels;
        this.f2508a = dimensionPixelSize3 / dimensionPixelSize;
        this.f2509b = i / dimensionPixelSize2;
        this.f2510h = (this.f2508a * this.f2509b) * 5;
        LayoutParams layoutParams = this.f2523u.getLayoutParams();
        layoutParams.width = this.f2508a * dimensionPixelSize;
        layoutParams.height = this.f2509b * dimensionPixelSize2;
        this.f2524v = new C0592a();
        this.f2524v.f645a = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_width);
        this.f2524v.f646b = this.c.f1265m.getDimensionPixelSize(R.dimen.activity_vod_item_height);
        this.f2524v.f648d = ViewCompat.MEASURED_STATE_MASK;
        this.f2524v.f649e = Color.argb(120, 0, 0, 255);
        this.f2524v.f647c = -1;
        this.f2524v.f651g = this.c.f1252G;
        this.f2524v.f652h = this.c.f1253H;
        this.f2524v.f650f = this.c.f1265m.getDimensionPixelSize(R.dimen.width_6_320);
        this.f2523u.setLayoutManager(new GridLayoutManager(this, this.f2508a));
        this.f2523u.setAdapter(new C10788(this));
        this.f2523u.m3144a(new C10799(this));
        if (this.c.f1248C.m1321h()) {
            this.f2523u.addOnScrollListener(new OnScrollListener(this) {
                /* renamed from: a */
                final /* synthetic */ VodActivity f1896a;

                {
                    this.f1896a = r1;
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (i2 != 0) {
                        this.f1896a.m3245b(i2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m3237a(C0572a c0572a) {
        this.f2518p.setVisibility(8);
        if (c0572a.f610a.equals("search")) {
            c0572a = new C0507a();
            c0572a.f527a = "搜索";
            c0572a.f533g = "输入首个拼音字母 —— 如\"魔兽\"输入\"MS\"";
            c0572a.f529c = this.c.f1251F.m1347b("buttonOk");
            c0572a.f530d = this.c.f1251F.m1347b("buttonCancel");
            c0572a.f534h = C0508b.Button1;
            C1351c.m2970a(this, c0572a, new C10742(this));
            return;
        }
        int i = -1;
        if (c0572a.f610a.equals("history")) {
            this.f2528z.clear();
            this.f2528z.addAll(this.c.f1248C.m1329o());
            c0572a = this.f2523u;
            if (this.f2528z.size() > 0) {
                i = 0;
            }
            c0572a.m3146b(i, false);
            this.f2523u.getAdapter().notifyDataSetChanged();
            m3245b(0);
            c0572a = f2504B + 1;
            f2504B = c0572a;
            this.f2506C = c0572a;
            if (this.f2528z.size() == null) {
                this.f2518p.setVisibility(0);
                this.f2519q.setText(this.c.f1251F.m1350e("vodHistoryEmpty"));
            }
        } else if (c0572a.f610a.equals("favorites")) {
            this.f2528z.clear();
            this.f2528z.addAll(this.c.f1248C.m1330p());
            c0572a = this.f2523u;
            if (this.f2528z.size() > 0) {
                i = 0;
            }
            c0572a.m3146b(i, false);
            this.f2523u.getAdapter().notifyDataSetChanged();
            m3245b(0);
            c0572a = f2504B + 1;
            f2504B = c0572a;
            this.f2506C = c0572a;
            if (this.f2528z.size() == null) {
                this.f2518p.setVisibility(0);
                c0572a = this.f2519q;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.c.f1251F.m1350e("liveFavoritesEmpty"));
                stringBuilder.append("\r\n");
                stringBuilder.append(this.c.f1251F.m1350e("liveFavoritesTip"));
                c0572a.setText(stringBuilder.toString());
            }
        } else if (c0572a.f610a.equals("all")) {
            this.f2526x = "";
            this.f2528z.clear();
            this.f2523u.m3146b(-1, false);
            this.f2523u.getAdapter().notifyDataSetChanged();
            m3245b(0);
            c0572a = f2504B + 1;
            f2504B = c0572a;
            this.f2506C = c0572a;
            m3236a(0);
        } else {
            this.f2526x = c0572a.f610a;
            this.f2528z.clear();
            this.f2523u.m3146b(-1, false);
            this.f2523u.getAdapter().notifyDataSetChanged();
            m3245b(0);
            c0572a = f2504B + 1;
            f2504B = c0572a;
            this.f2506C = c0572a;
            m3236a(0);
        }
    }

    /* renamed from: a */
    private void m3236a(final int i) {
        final int i2 = this.f2506C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("loadVodPageData pageIndex:");
        stringBuilder.append(i);
        C0591c.m791a("VodActivity", stringBuilder.toString());
        if (i == 0 && !this.f2515m.isStart()) {
            this.f2515m.start();
        }
        C10753 c10753 = new C0724a<C0711f>(this) {
            /* renamed from: c */
            final /* synthetic */ VodActivity f1900c;

            /* renamed from: a */
            public void mo1314a(boolean z, C1184e<C0711f> c1184e, C0587a c0587a, Throwable th) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loadVodPageData success:");
                stringBuilder.append(z);
                stringBuilder.append(",errorType:");
                stringBuilder.append(c0587a);
                stringBuilder.append(",ex:");
                stringBuilder.append(th);
                C0591c.m791a("VodActivity", stringBuilder.toString());
                if (i2 != this.f1900c.f2506C) {
                    C0591c.m791a("VodActivity", "loadVodPageData cancel");
                    return;
                }
                if (z) {
                    this.f1900c.f2528z.setSize(((C0711f) c1184e.f2086c).f1167c);
                    z = ((C0711f) c1184e.f2086c).f1168d.size();
                    th = ((C0711f) c1184e.f2086c).f1165a * this.f1900c.f2510h;
                    int i = th;
                    boolean z2 = false;
                    while (z2 < z) {
                        this.f1900c.f2528z.set(i, ((C0711f) c1184e.f2086c).f1168d.get(z2));
                        z2++;
                        i++;
                    }
                    this.f1900c.f2523u.getAdapter().notifyItemRangeChanged(th, z);
                    if (this.f1900c.f2528z.size() <= false && this.f1900c.f2523u.getSelectedIndex()) {
                        this.f1900c.f2523u.m3146b(0, false);
                        if (this.f1900c.f2505A && this.f1900c.f2521s.m3147b(this.f1900c.f2521s.getSelectedIndex())) {
                            this.f1900c.m3242a(false);
                        }
                    }
                }
                if (!i && this.f1900c.f2515m.isStart()) {
                    this.f1900c.f2515m.stop();
                }
                if (!(this.f1900c.f2528z.size() || i)) {
                    this.f1900c.f2518p.setVisibility(0);
                    if (this.f1900c.f2521s.m3147b(0)) {
                        this.f1900c.f2519q.setText(this.f1900c.c.f1251F.m1350e("vodSearchEmpty"));
                    } else {
                        this.f1900c.f2519q.setText(this.f1900c.c.f1251F.m1350e("vodEmpty"));
                    }
                }
            }
        };
        if (this.f2521s.m3147b(0)) {
            this.c.f1249D.m1245a(this.f2527y, i, this.f2510h, this.f2525w, "", c10753);
            return;
        }
        this.c.f1249D.m1237a(i, this.f2510h, this.f2525w, this.f2526x, c10753);
    }

    /* renamed from: a */
    private void m3242a(boolean z) {
        if (this.f2505A != z) {
            this.f2505A = z;
            this.f2521s.m3145b();
            this.f2523u.m3145b();
        }
    }

    /* renamed from: b */
    private void m3245b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("updatePageNo ");
        stringBuilder.append(i);
        C0591c.m791a("VodActivity", stringBuilder.toString());
        int size = this.f2528z.size();
        if (size == 0) {
            this.f2514l.setText("0/0");
            return;
        }
        if (i < 0) {
            i = this.f2523u.m3148c();
        } else if (i > 0) {
            i = this.f2523u.m3150d();
        } else {
            i = this.f2523u.getSelectedIndex();
        }
        if (i == -1) {
            i = 0;
        }
        int i2 = this.f2509b * this.f2508a;
        i /= i2;
        int i3 = size / i2;
        if (size % i2 > 0) {
            i3++;
        }
        this.f2514l.setText(MessageFormat.format("{0}/{1}", new Object[]{String.valueOf(i + 1), String.valueOf(i3)}));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2511i != C0573c.Ready) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 19) {
            if (this.f2505A != null) {
                this.f2521s.m3149c(i);
            } else {
                this.f2523u.m3149c(i);
            }
            return true;
        } else if (i == 20) {
            if (this.f2505A != null) {
                this.f2521s.m3149c(i);
            } else {
                this.f2523u.m3149c(i);
            }
            return true;
        } else if (i == 21) {
            if (this.f2505A == null) {
                if (this.f2523u.getSelectedIndex() % this.f2508a == null) {
                    m3242a(true);
                } else {
                    this.f2523u.m3149c(i);
                }
            }
            return true;
        } else if (i == 22) {
            if (this.f2505A == null) {
                this.f2523u.m3149c(i);
            } else if (this.f2528z.size() > 0) {
                m3242a((boolean) 0);
            }
            return true;
        } else if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        } else {
            mo2163a();
            return true;
        }
    }
}
