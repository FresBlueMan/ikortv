package com.iptv2.p044c.p045a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationBuilder;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.base.SimpleRecyclerView.C0603a;
import com.iptv2.base.SimpleRecyclerView.C0605c;
import com.iptv2.c.a.d.AnonymousClass13;
import com.iptv2.control.IcomoonView;
import com.iptv2.core.C0712a.C0709d;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.C0730c;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0696e;
import com.iptv2.core.DataEntity.C0697f;
import com.iptv2.core.DataEntity.C0698h;
import com.iptv2.core.DataEntity.C1173g;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.p045a.C0626b.C0622a;
import com.iptv2.p044c.p045a.C0626b.C0623b;
import com.iptv2.p044c.p045a.C0626b.C0624c;
import com.iptv2.p044c.p045a.C0637d;
import com.iptv2.p044c.p045a.C0637d.C1310a;
import com.iptv2.p044c.p045a.C0637d.C1311b;
import com.victor.loading.rotate.RotateLoading;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: LiveEpgView */
/* renamed from: com.iptv2.c.a.d */
public class C0637d {
    /* renamed from: w */
    private static int f825w;
    /* renamed from: A */
    private boolean f826A;
    /* renamed from: B */
    private boolean f827B = false;
    /* renamed from: C */
    private boolean f828C = false;
    /* renamed from: D */
    private int f829D;
    /* renamed from: E */
    private int f830E;
    /* renamed from: F */
    private int f831F;
    /* renamed from: G */
    private int f832G;
    /* renamed from: H */
    private int f833H;
    /* renamed from: I */
    private int f834I;
    /* renamed from: J */
    private int f835J;
    /* renamed from: K */
    private int f836K;
    /* renamed from: L */
    private boolean f837L = false;
    /* renamed from: M */
    private boolean f838M = false;
    /* renamed from: N */
    private Runnable f839N = new C06336(this);
    /* renamed from: O */
    private ViewAnimator f840O;
    /* renamed from: a */
    private C0636c f841a;
    /* renamed from: b */
    private ViewAnimator f842b;
    /* renamed from: c */
    private ViewAnimator f843c;
    /* renamed from: d */
    private C0626b f844d;
    /* renamed from: e */
    private SimpleRecyclerView f845e;
    /* renamed from: f */
    private SimpleRecyclerView f846f;
    /* renamed from: g */
    private C0592a f847g;
    /* renamed from: h */
    private C0592a f848h;
    /* renamed from: i */
    private View f849i;
    /* renamed from: j */
    private View f850j;
    /* renamed from: k */
    private View f851k;
    /* renamed from: l */
    private View f852l;
    /* renamed from: m */
    private View f853m;
    /* renamed from: n */
    private TextView f854n;
    /* renamed from: o */
    private RotateLoading f855o;
    /* renamed from: p */
    private C0693b f856p;
    /* renamed from: q */
    private C0696e f857q;
    /* renamed from: r */
    private C1173g f858r;
    /* renamed from: s */
    private ArrayList<C0698h> f859s = new ArrayList();
    /* renamed from: t */
    private ArrayList<C0697f> f860t = new ArrayList();
    /* renamed from: u */
    private HashMap<String, Integer> f861u = new HashMap();
    /* renamed from: v */
    private HashMap<String, Integer> f862v = new HashMap();
    /* renamed from: x */
    private int f863x;
    /* renamed from: y */
    private boolean f864y = false;
    /* renamed from: z */
    private boolean f865z = false;

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$6 */
    class C06336 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0637d f817a;

        C06336(C0637d c0637d) {
            this.f817a = c0637d;
        }

        public void run() {
            this.f817a.m998c();
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$9 */
    class C06359 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C0637d f824a;

        C06359(C0637d c0637d) {
            this.f824a = c0637d;
        }

        public void onClick(View view) {
            if (this.f824a.f844d.f755c.m1024b() != null) {
                if (this.f824a.f865z != null) {
                    this.f824a.m998c();
                } else {
                    this.f824a.f844d.f755c.f879a.m876h();
                }
            }
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$c */
    public interface C0636c {
        /* renamed from: a */
        void mo1371a();

        /* renamed from: a */
        void mo1372a(boolean z);

        /* renamed from: b */
        void mo1373b();
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$1 */
    class C11271 extends C0622a {
        /* renamed from: a */
        final /* synthetic */ C0637d f1981a;

        C11271(C0637d c0637d) {
            this.f1981a = c0637d;
        }

        /* renamed from: a */
        public void mo1360a(C0624c c0624c) {
            c0624c = this.f1981a.f844d.f766n;
            if (c0624c == C0623b.Record) {
                if (this.f1981a.f827B != null) {
                    this.f1981a.m955a(false);
                }
                C0698h c0698h = this.f1981a.f844d.f764l;
                int indexOf = this.f1981a.f859s.indexOf(c0698h);
                this.f1981a.f845e.m3143a(indexOf, true);
                if (this.f1981a.m975j() != c0698h) {
                    this.f1981a.f845e.m3146b(indexOf, true);
                }
            } else if (c0624c == C0623b.Live && this.f1981a.f826A != null) {
                if (this.f1981a.f844d.f762j != this.f1981a.f856p) {
                    this.f1981a.f844d.f755c.f879a.m870b();
                    this.f1981a.m998c();
                } else if (this.f1981a.f858r != null) {
                    int indexOf2 = this.f1981a.f859s.indexOf(this.f1981a.f858r);
                    this.f1981a.f845e.m3146b(indexOf2, false);
                    this.f1981a.f845e.m3143a(indexOf2, true);
                }
            }
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$2 */
    class C11282 extends C0603a {
        /* renamed from: a */
        final /* synthetic */ C0637d f1982a;

        C11282(C0637d c0637d) {
            this.f1982a = c0637d;
        }

        /* renamed from: a */
        public void mo1316a(int i, int i2) {
            if (!(i == -1 || this.f1982a.f826A == 0 || this.f1982a.f827B == 0)) {
                this.f1982a.f845e.m3142a(((Integer) this.f1982a.f862v.get(((C0697f) this.f1982a.f860t.get(i)).f1093a)).intValue(), C0605c.Top);
            }
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$3 */
    class C11293 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0637d f1983a;

        C11293(C0637d c0637d) {
            this.f1983a = c0637d;
        }

        public void onStop() {
            this.f1983a.f850j.setVisibility(4);
            this.f1983a.f851k.setVisibility(4);
            this.f1983a.f850j.setAlpha(1.0f);
            this.f1983a.f851k.setAlpha(1.0f);
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$4 */
    class C11304 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0637d f1984a;

        C11304(C0637d c0637d) {
            this.f1984a = c0637d;
        }

        public void onStop() {
            this.f1984a.f838M = false;
            if (!this.f1984a.f828C) {
                this.f1984a.f850j.setVisibility(4);
                this.f1984a.f851k.setVisibility(4);
                this.f1984a.f850j.setAlpha(0.0f);
                this.f1984a.f851k.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$5 */
    class C11315 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0637d f1985a;

        C11315(C0637d c0637d) {
            this.f1985a = c0637d;
        }

        public void onStop() {
            if (!this.f1985a.f864y) {
                this.f1985a.f855o.setVisibility(8);
            }
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$a */
    private class C1310a extends C1102a<C0697f> {
        /* renamed from: a */
        public TextView f2241a;
        /* renamed from: b */
        public Drawable f2242b;
        /* renamed from: c */
        public Drawable f2243c;
        /* renamed from: d */
        final /* synthetic */ C0637d f2244d;

        public C1310a(C0637d c0637d, View view) {
            this.f2244d = c0637d;
            super(view);
            this.f2241a = (TextView) view.findViewById(R.id.text);
            view = C0593d.m796a(c0637d.f844d.f753a.f1260a, c0637d.f848h);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, view);
            this.f2242b = stateListDrawable;
            this.f2243c = ContextCompat.getDrawable(c0637d.f844d.f754b, R.drawable.widget_live_all_items_bg);
        }

        /* renamed from: a */
        public void m2745a(C0697f c0697f) {
            this.h = c0697f;
            if (((C0697f) this.h).f1093a.equals(C0730c.f1243g.format(C0730c.m1256b())) != null) {
                c0697f = this.f2244d.f844d.f753a.f1251F.m1347b("dayOfToday");
            } else {
                c0697f = Calendar.getInstance();
                c0697f.setTime(((C0697f) this.h).f1094b);
                c0697f = this.f2244d.f844d.f753a.f1251F.m1348c("dayOfNames")[c0697f.get(7) - 1];
            }
            TextView textView = this.f2241a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C0730c.f1244h.format(((C0697f) this.h).f1094b));
            stringBuilder.append(" ");
            stringBuilder.append(c0697f);
            textView.setText(stringBuilder.toString());
        }

        /* renamed from: a */
        public void mo1858a() {
            Object obj = (this.f2244d.f826A && this.f2244d.f827B) ? 1 : null;
            TextView textView = this.f2241a;
            Context context = this.f2244d.f844d.f754b;
            int i = obj != null ? this.f2244d.f837L ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor : this.f2244d.f837L ? R.drawable.widget_live_overlay_long_list_item_text_textcolor : R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            textView.setTextColor(ContextCompat.getColorStateList(context, i));
            C0595e.m809a(this.itemView, obj != null ? this.f2242b : this.f2243c);
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DayViewHolder onClick ");
            stringBuilder.append(((C0697f) this.h).f1093a);
            C0591c.m791a("LiveEpgView", stringBuilder.toString());
            this.f2244d.m955a(true);
            this.f2244d.f846f.m3146b(getAdapterPosition(), false);
        }
    }

    /* compiled from: LiveEpgView */
    /* renamed from: com.iptv2.c.a.d$b */
    private class C1311b extends C1102a<C0698h> {
        /* renamed from: a */
        public TextView f2245a;
        /* renamed from: b */
        public TextView f2246b;
        /* renamed from: c */
        public IcomoonView f2247c;
        /* renamed from: d */
        public Drawable f2248d;
        /* renamed from: e */
        public Drawable f2249e;
        /* renamed from: f */
        final /* synthetic */ C0637d f2250f;

        public C1311b(C0637d c0637d, View view) {
            this.f2250f = c0637d;
            super(view);
            this.f2245a = (TextView) view.findViewById(R.id.text);
            this.f2246b = (TextView) view.findViewById(R.id.time);
            this.f2247c = (IcomoonView) view.findViewById(R.id.image);
            view = C0593d.m796a(c0637d.f844d.f753a.f1260a, c0637d.f847g);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, view);
            this.f2248d = stateListDrawable;
            this.f2249e = ContextCompat.getDrawable(c0637d.f844d.f754b, R.drawable.widget_live_all_items_bg);
        }

        /* renamed from: a */
        public void m2748a(C0698h c0698h) {
            this.h = c0698h;
            this.f2245a.setText(((C0698h) this.h).f1096e);
            this.f2246b.setText(((C0698h) this.h).f1098g);
        }

        /* renamed from: a */
        public void mo1858a() {
            int i = 0;
            if (this.h instanceof C1173g) {
                if (this.h == this.f2250f.f858r) {
                    this.f2247c.setVisibility(0);
                    this.f2247c.setText(R.string.icon_epg_now);
                } else {
                    this.f2247c.setVisibility(8);
                }
            } else if (this.h instanceof C1174j) {
                this.f2247c.setVisibility(0);
                this.f2247c.setText(R.string.icon_epg_record);
            }
            if (this.f2250f.f826A && !this.f2250f.f827B) {
                i = 1;
            }
            IcomoonView icomoonView = this.f2247c;
            Context context = this.f2250f.f844d.f754b;
            int i2 = R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            int i3 = i != 0 ? this.f2250f.f837L ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor : this.f2250f.f837L ? R.drawable.widget_live_overlay_long_list_item_text_textcolor : R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            icomoonView.setTextColor(ContextCompat.getColorStateList(context, i3));
            TextView textView = this.f2245a;
            context = this.f2250f.f844d.f754b;
            i3 = i != 0 ? this.f2250f.f837L ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor : this.f2250f.f837L ? R.drawable.widget_live_overlay_long_list_item_text_textcolor : R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            textView.setTextColor(ContextCompat.getColorStateList(context, i3));
            textView = this.f2246b;
            context = this.f2250f.f844d.f754b;
            if (i != 0) {
                i2 = this.f2250f.f837L ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor;
            } else if (this.f2250f.f837L) {
                i2 = R.drawable.widget_live_overlay_long_list_item_text_textcolor;
            }
            textView.setTextColor(ContextCompat.getColorStateList(context, i2));
            this.f2245a.setEllipsize(i != 0 ? TruncateAt.MARQUEE : TruncateAt.END);
            if (!this.f2250f.f837L) {
                this.f2245a.setEllipsize(i != 0 ? TruncateAt.MARQUEE : TruncateAt.END);
            }
            C0595e.m809a(this.itemView, i != 0 ? this.f2248d : this.f2249e);
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("EpgViewHolder onClick ");
            stringBuilder.append(((C0698h) this.h).f1096e);
            C0591c.m791a("LiveEpgView", stringBuilder.toString());
            this.f2250f.m955a(false);
            this.f2250f.f845e.m3146b(getAdapterPosition(), false);
            C0623b c0623b = this.f2250f.f844d.f766n;
            if (this.h == this.f2250f.f858r) {
                if (c0623b != C0623b.Record) {
                    if (c0623b != C0623b.TimeShift) {
                        this.f2250f.f844d.f755c.m1026d();
                        return;
                    }
                }
                this.f2250f.f844d.m915b(this.f2250f.f856p, false);
            } else if (this.h instanceof C1174j) {
                C1174j c1174j = (C1174j) this.h;
                if (this.f2250f.f844d.f764l == c1174j) {
                    this.f2250f.f844d.f755c.m1026d();
                    if (this.f2250f.f844d.f767o && this.f2250f.f844d.f758f.m1151c()) {
                        this.f2250f.f844d.f758f.m1148b();
                        return;
                    }
                    return;
                }
                this.f2250f.f844d.m912a(this.f2250f.f856p, c1174j, false);
            }
        }
    }

    /* renamed from: a */
    public void m994a(C0636c c0636c) {
        this.f841a = c0636c;
    }

    public C0637d(C0626b c0626b, View view) {
        this.f844d = c0626b;
        if (C0730c.f1239c == 1) {
            this.f837L = true;
        }
        if (this.f837L) {
            this.f829D = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_item_long_width);
            this.f830E = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_long_width);
            this.f831F = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_loading_width);
        } else {
            this.f829D = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_item_width);
            this.f830E = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_width);
            this.f831F = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_loading_width);
        }
        this.f832G = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_day_item_width);
        this.f833H = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_day_width);
        this.f834I = this.f830E + this.f833H;
        this.f835J = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.widget_live_overlay_epg_header_item_height) + (this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.widget_live_overlay_epg_item_vmargin) * 2);
        this.f836K = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.widget_live_overlay_epg_header_item_bg_height);
        this.f853m = view.findViewById(R.id.arrow);
        this.f849i = view.findViewById(R.id.epg_wrapper);
        this.f850j = view.findViewById(R.id.epg_list_wrapper);
        this.f851k = view.findViewById(R.id.day_list_wrapper);
        this.f855o = (RotateLoading) view.findViewById(R.id.epg_loading);
        this.f852l = view.findViewById(R.id.epg_empty);
        this.f854n = (TextView) view.findViewById(R.id.epg_empty_text);
        this.f854n.setText(c0626b.f753a.f1251F.m1350e("epgEmpty"));
        this.f845e = (SimpleRecyclerView) view.findViewById(R.id.epg_list);
        this.f846f = (SimpleRecyclerView) view.findViewById(R.id.day_list);
        this.f855o.start();
        m969g();
        m973i();
        this.f844d.m910a(new C11271(this));
        this.f853m.setOnClickListener(new C06359(this));
        if (this.f844d.f753a.f1248C.m1321h() != null) {
            this.f846f.setOnTouchListener(new OnTouchListener(this) {
                /* renamed from: a */
                final /* synthetic */ C0637d f813a;

                {
                    this.f813a = r1;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    this.f813a.m955a(true);
                    return null;
                }
            });
            this.f845e.setOnTouchListener(new OnTouchListener(this) {
                /* renamed from: a */
                final /* synthetic */ C0637d f814a;

                {
                    this.f814a = r1;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (this.f814a.f860t.size() > null) {
                        this.f814a.m955a(false);
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: g */
    private void m969g() {
        this.f845e.setChoiceMode(1);
        int dimensionPixelSize = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_item_height) + (this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_item_vmargin) * 2);
        this.f845e.getLayoutParams().height = (this.f844d.f753a.f1266n.heightPixels / dimensionPixelSize) * dimensionPixelSize;
        this.f845e.setItemHeight(dimensionPixelSize);
        this.f847g = new C0592a();
        this.f847g.f645a = this.f829D;
        this.f847g.f646b = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_epg_item_height);
        this.f847g.f649e = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_focus_shadow_color);
        this.f847g.f650f = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_shadow_radius_size);
        this.f847g.f647c = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_focus_border_color);
        this.f847g.f651g = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_size);
        this.f847g.f653i = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_radius_size);
        this.f845e.setLayoutManager(new LinearLayoutManager(this.f844d.f754b));
        this.f845e.setAdapter(new Adapter<C1311b>(this) {
            /* renamed from: a */
            final /* synthetic */ C0637d f1966a;

            {
                this.f1966a = r1;
            }

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2382a((C1311b) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2381a(viewGroup, i);
            }

            /* renamed from: a */
            public C1311b m2381a(ViewGroup viewGroup, int i) {
                if (this.f1966a.f837L != 0) {
                    return new C1311b(this.f1966a, this.f1966a.f844d.f753a.f1264l.inflate(R.layout.widget_live_overlay_epg_view_epg_list_item_long, viewGroup, false));
                }
                return new C1311b(this.f1966a, this.f1966a.f844d.f753a.f1264l.inflate(R.layout.widget_live_overlay_epg_view_epg_list_item, viewGroup, false));
            }

            /* renamed from: a */
            public void m2382a(C1311b c1311b, int i) {
                c1311b.m2748a((C0698h) this.f1966a.f859s.get(i));
            }

            public int getItemCount() {
                return this.f1966a.f859s.size();
            }
        });
        this.f845e.m3144a(new C0603a(this) {
            /* renamed from: a */
            final /* synthetic */ C0637d f1967a;

            {
                this.f1967a = r1;
            }

            /* renamed from: a */
            public void mo1316a(int i, int i2) {
                if (!(i == -1 || this.f1967a.f826A == 0 || this.f1967a.f827B != 0)) {
                    i = ((Integer) this.f1967a.f861u.get(((C0698h) this.f1967a.f859s.get(i)).f1097f.f1093a)).intValue();
                    C0595e.m810a(this.f1967a.f846f, new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ AnonymousClass13 f816b;

                        public void run() {
                            this.f816b.f1967a.f846f.m3146b(i, true);
                        }
                    });
                }
            }
        });
        if (this.f844d.f753a.f1248C.m1321h()) {
            this.f845e.addOnScrollListener(new OnScrollListener(this) {
                /* renamed from: a */
                final /* synthetic */ C0637d f1968a;

                {
                    this.f1968a = r1;
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (this.f1968a.f859s.size() != null) {
                        if (this.f1968a.f827B == null) {
                            if (i2 < 0) {
                                recyclerView = this.f1968a.f845e.m3148c();
                            } else if (i2 > 0) {
                                recyclerView = this.f1968a.f845e.m3150d();
                            } else {
                                return;
                            }
                            this.f1968a.f846f.m3146b(((Integer) this.f1968a.f861u.get(((C0698h) this.f1968a.f859s.get(recyclerView)).f1097f.f1093a)).intValue(), (boolean) 1);
                        }
                    }
                }
            });
        }
        m971h();
    }

    /* renamed from: h */
    private void m971h() {
        final TextPaint textPaint = new TextPaint();
        final int color = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_list_item_header_textcolor_actived);
        final int color2 = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_list_item_header_textcolor);
        textPaint.setTextSize((float) this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.textsize_big));
        textPaint.setAntiAlias(true);
        final int dimensionPixelOffset = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.width_8_320);
        final int dimensionPixelOffset2 = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.width_11_320);
        final int dimensionPixelOffset3 = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.height_2_320);
        final int dimensionPixelOffset4 = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.width_2_320);
        final int dimensionPixelOffset5 = this.f844d.f753a.f1265m.getDimensionPixelOffset(R.dimen.widget_live_overlay_epg_item_hmargin);
        final int i = (this.f835J - this.f836K) / 2;
        final Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_all_items_checked_bgcolor));
        this.f845e.addItemDecoration(new ItemDecoration(this) {
            /* renamed from: k */
            final /* synthetic */ C0637d f1979k;

            public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
                AnonymousClass15 anonymousClass15 = this;
                Canvas canvas2 = canvas;
                RecyclerView recyclerView2 = recyclerView;
                super.onDraw(canvas, recyclerView, state);
                int childCount = recyclerView.getChildCount();
                if (childCount != 0) {
                    for (int i = 0; i < childCount; i++) {
                        String b;
                        View childAt = recyclerView2.getChildAt(i);
                        C0698h c0698h = (C0698h) anonymousClass15.f1979k.f859s.get(recyclerView2.getChildAdapterPosition(childAt));
                        C0697f c0697f = c0698h.f1097f;
                        String substring = c0697f.f1093a.substring(5);
                        int i2 = 1;
                        if (c0697f.f1093a.equals(C0730c.f1243g.format(C0730c.m1256b()))) {
                            b = anonymousClass15.f1979k.f844d.f753a.f1251F.m1347b("dayOfToday");
                        } else {
                            Calendar instance = Calendar.getInstance();
                            instance.setTime(c0697f.f1094b);
                            b = anonymousClass15.f1979k.f844d.f753a.f1251F.m1348c("dayOfNames")[instance.get(7) - 1];
                        }
                        String str = b;
                        if (c0697f.f1095c.indexOf(c0698h) == 0) {
                            textPaint.getTextBounds(substring, 0, substring.length(), new Rect());
                            if (!anonymousClass15.f1979k.f826A || anonymousClass15.f1979k.f827B) {
                                i2 = 0;
                            }
                            textPaint.setColor(i2 != 0 ? color : color2);
                            FontMetrics fontMetrics = textPaint.getFontMetrics();
                            int ceil = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.top));
                            int top = ((((childAt.getTop() - dimensionPixelOffset3) - anonymousClass15.f1979k.f835J) + ((anonymousClass15.f1979k.f835J - ceil) / 2)) + ceil) - dimensionPixelOffset4;
                            int measureText = (int) textPaint.measureText(substring);
                            canvas.drawRect((float) dimensionPixelOffset5, (float) (((childAt.getTop() - anonymousClass15.f1979k.f835J) - dimensionPixelOffset4) + i), (float) (anonymousClass15.f1979k.f830E - dimensionPixelOffset5), (float) ((childAt.getTop() - dimensionPixelOffset4) - i), paint);
                            float f = (float) top;
                            canvas2.drawText(substring, (float) dimensionPixelOffset, f, textPaint);
                            canvas2.drawText(str, (float) ((dimensionPixelOffset + measureText) + dimensionPixelOffset2), f, textPaint);
                        }
                    }
                }
            }

            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
                if (recyclerView.getChildCount() != null) {
                    if (this.f1979k.m959b(recyclerView.getChildAdapterPosition(view)) != null) {
                        rect.top = this.f1979k.f835J;
                    } else {
                        rect.top = null;
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m959b(int i) {
        if (i < 0) {
            return false;
        }
        C0698h c0698h = (C0698h) this.f859s.get(i);
        if (c0698h.f1097f.f1095c.indexOf(c0698h) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m973i() {
        this.f848h = new C0592a();
        this.f848h.f645a = this.f832G;
        this.f848h.f646b = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_day_item_height);
        this.f848h.f649e = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_focus_shadow_color);
        this.f848h.f650f = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_shadow_radius_size);
        this.f848h.f647c = ContextCompat.getColor(this.f844d.f754b, R.color.widget_live_overlay_focus_border_color);
        this.f848h.f651g = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_size);
        this.f848h.f653i = this.f844d.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_radius_size);
        this.f846f.setLayoutManager(new LinearLayoutManager(this.f844d.f754b));
        this.f846f.setAdapter(new Adapter<C1310a>(this) {
            /* renamed from: a */
            final /* synthetic */ C0637d f1980a;

            {
                this.f1980a = r1;
            }

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2385a((C1310a) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2384a(viewGroup, i);
            }

            /* renamed from: a */
            public C1310a m2384a(ViewGroup viewGroup, int i) {
                return new C1310a(this.f1980a, this.f1980a.f844d.f753a.f1264l.inflate(R.layout.widget_live_overlay_epg_view_day_list_item, viewGroup, false));
            }

            /* renamed from: a */
            public void m2385a(C1310a c1310a, int i) {
                c1310a.m2745a((C0697f) this.f1980a.f860t.get(i));
            }

            public int getItemCount() {
                return this.f1980a.f860t.size();
            }
        });
        this.f846f.m3144a(new C11282(this));
    }

    /* renamed from: a */
    public void m993a() {
        C1102a selectedViewHolder;
        if (this.f827B) {
            selectedViewHolder = this.f846f.getSelectedViewHolder();
            if (selectedViewHolder != null) {
                selectedViewHolder.mo1855b();
                return;
            }
            return;
        }
        selectedViewHolder = this.f845e.getSelectedViewHolder();
        if (selectedViewHolder != null) {
            selectedViewHolder.mo1855b();
        }
    }

    /* renamed from: b */
    public boolean m997b() {
        return this.f865z;
    }

    /* renamed from: a */
    private void m955a(boolean z) {
        if (this.f827B != z) {
            this.f827B = z;
            this.f845e.m3145b();
            this.f846f.m3145b();
        }
    }

    /* renamed from: j */
    private C0698h m975j() {
        int selectedIndex = this.f845e.getSelectedIndex();
        if (selectedIndex == -1) {
            return null;
        }
        return (C0698h) this.f859s.get(selectedIndex);
    }

    /* renamed from: b */
    private void m958b(boolean z) {
        if (this.f828C != z) {
            if (!z) {
                this.f841a.mo1373b();
            }
            this.f828C = z;
            this.f849i.setVisibility(0);
            if (this.f842b != null) {
                this.f842b.cancel();
            }
            this.f842b = new ViewAnimator();
            m963c(z);
        }
    }

    /* renamed from: c */
    private void m963c(boolean z) {
        int width = this.f849i.getWidth();
        if (z) {
            this.f838M = false;
            z = this.f831F;
            if (width > this.f831F) {
                if (this.f842b != null) {
                    this.f842b.cancel();
                }
                this.f842b = new ViewAnimator();
                this.f842b.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f849i).width((float) width, 0.0f).onStop(new C11293(this)).duration(0).start();
            }
            int width2 = 400 - ((this.f849i.getWidth() * 400) / z);
            if (width2 < 0) {
                width2 = 400;
            }
            if (this.f842b != null) {
                this.f842b.cancel();
            }
            this.f842b = new ViewAnimator();
            this.f842b.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f849i).width((float) width, (float) z).andAnimate(this.f853m).rotation(this.f853m.getRotation(), 180.0f).duration((long) width2).start();
            return;
        }
        if (this.f838M) {
            z = (width * 400) / this.f834I;
        } else {
            z = (width * 400) / this.f831F;
        }
        this.f842b.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f849i).width((float) width, 0.0f).andAnimate(this.f853m).rotation(this.f853m.getRotation(), 0.0f).duration((long) z).onStop(new C11304(this)).start();
        if (this.f840O) {
            this.f840O.cancel();
        }
        this.f840O = new ViewAnimator();
        this.f840O.addAnimationBuilder(this.f850j, this.f851k).alpha(1.0f, 0.0f).duration(200).start();
    }

    /* renamed from: k */
    private void m977k() {
        int width = this.f849i.getWidth();
        int i = this.f834I;
        if (this.f842b != null) {
            this.f842b.cancel();
        }
        this.f842b = new ViewAnimator();
        this.f842b.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f849i).width((float) width, (float) i).duration((long) 400).start();
    }

    /* renamed from: d */
    private void m964d(boolean z) {
        if (this.f864y != z) {
            this.f864y = z;
            this.f855o.setVisibility(0);
            if (this.f843c != null) {
                this.f843c.cancel();
            }
            this.f843c = new ViewAnimator();
            AnimationBuilder addAnimationBuilder = this.f843c.addAnimationBuilder(this.f855o);
            if (z) {
                addAnimationBuilder.alpha(new float[]{1065353216}).duration(300).start();
            } else {
                addAnimationBuilder.alpha(new float[]{null}).duration(300).onStop(new C11315(this)).start();
            }
        }
    }

    /* renamed from: l */
    private void m979l() {
        this.f859s.clear();
        this.f860t.clear();
        this.f861u.clear();
        this.f862v.clear();
        this.f845e.m3146b(-1, false);
        this.f845e.m3141a();
        this.f846f.m3146b(-1, false);
        this.f845e.getAdapter().notifyDataSetChanged();
        this.f846f.getAdapter().notifyDataSetChanged();
    }

    /* renamed from: c */
    public void m998c() {
        if (this.f865z) {
            C0591c.m791a("LiveEpgView", "hide");
            this.f863x = 0;
            C0693b c0693b = this.f856p;
            this.f844d.f753a.f1263k.removeCallbacks(this.f839N);
            m964d(false);
            this.f865z = false;
            this.f826A = false;
            this.f827B = false;
            this.f856p = null;
            this.f845e.m3145b();
            this.f846f.m3145b();
            m958b(false);
            if (this.f844d.f766n == C0623b.Record) {
                this.f844d.m915b(c0693b, true);
            }
            this.f844d.f755c.f879a.m870b();
            if (this.f837L && this.f838M) {
                this.f844d.f755c.f879a.m875g();
            }
        }
    }

    /* renamed from: m */
    private void m980m() {
        this.f844d.f753a.f1263k.removeCallbacks(this.f839N);
        this.f844d.f753a.f1263k.postDelayed(this.f839N, 1000);
    }

    /* renamed from: d */
    public C0693b m999d() {
        return this.f856p;
    }

    /* renamed from: a */
    public void m995a(C0693b c0693b) {
        if (!this.f865z || this.f856p != c0693b) {
            C0591c.m791a("LiveEpgView", "show");
            int i = f825w + 1;
            f825w = i;
            this.f863x = i;
            m964d(false);
            this.f865z = true;
            this.f852l.setVisibility(8);
            this.f844d.f753a.f1263k.removeCallbacks(this.f839N);
            this.f856p = c0693b;
            C0698h c0698h = null;
            this.f857q = null;
            if (this.f844d.f753a.f1248C.f1285d != null) {
                this.f857q = (C0696e) this.f844d.f753a.f1248C.f1285d.f1139a.get(c0693b.f1070a);
            }
            this.f858r = null;
            m979l();
            m955a(false);
            m958b(true);
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            m952a(arrayList, arrayList2);
            if (arrayList2.size() == null && this.f856p.f1074e == null) {
                m953a(arrayList, arrayList2, null);
            } else if (this.f856p.f1074e != null) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                m964d(true);
                final int i2 = this.f863x;
                this.f841a.mo1371a();
                final ArrayList arrayList5 = arrayList4;
                final ArrayList arrayList6 = arrayList3;
                m954a(arrayList3, arrayList4, new Runnable(this) {
                    /* renamed from: f */
                    final /* synthetic */ C0637d f823f;

                    public void run() {
                        if (i2 != this.f823f.f863x) {
                            C0591c.m791a("LiveEpgView", "loadRecordData cancel");
                            return;
                        }
                        this.f823f.m964d(false);
                        if (this.f823f.f865z) {
                            C0698h c0698h = null;
                            if (arrayList5.size() > 0) {
                                arrayList5.addAll(arrayList2);
                                C0697f c0697f = (C0697f) arrayList6.get(arrayList6.size() - 1);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C0697f c0697f2 = (C0697f) it.next();
                                    if (!c0697f.f1093a.equals(c0697f2.f1093a)) {
                                        arrayList6.add(c0697f2);
                                    }
                                }
                                if (arrayList2.size() > 0) {
                                    c0698h = this.f823f.f858r = (C1173g) arrayList2.get(0);
                                } else {
                                    c0698h = (C0698h) c0697f.f1095c.get(0);
                                }
                                this.f823f.m953a(arrayList6, arrayList5, c0698h);
                            } else {
                                if (arrayList2.size() > 0) {
                                    c0698h = this.f823f.f858r = (C1173g) arrayList2.get(0);
                                }
                                this.f823f.m953a(arrayList, arrayList2, c0698h);
                            }
                        }
                    }
                });
            } else {
                if (arrayList2.size() > null) {
                    c0698h = (C1173g) arrayList2.get(0);
                    this.f858r = c0698h;
                }
                m953a(arrayList, arrayList2, c0698h);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m953a(java.util.ArrayList<com.iptv2.core.DataEntity.C0697f> r7, java.util.ArrayList<com.iptv2.core.DataEntity.C0698h> r8, com.iptv2.core.DataEntity.C0698h r9) {
        /*
        r6 = this;
        r0 = r6.f860t;
        r0.addAll(r7);
        r7 = r6.f859s;
        r7.addAll(r8);
        r7 = r6.f860t;
        r7 = r7.size();
        r0 = 0;
        r1 = 0;
    L_0x0012:
        if (r1 >= r7) goto L_0x0050;
    L_0x0014:
        r2 = r6.f860t;
        r2 = r2.get(r1);
        r2 = (com.iptv2.core.DataEntity.C0697f) r2;
        r3 = r6.f861u;
        r4 = r2.f1093a;
        r5 = java.lang.Integer.valueOf(r1);
        r3.put(r4, r5);
        r3 = r2.f1095c;
        r3 = r3.iterator();
    L_0x002d:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x004d;
    L_0x0033:
        r4 = r3.next();
        r4 = (com.iptv2.core.DataEntity.C0698h) r4;
        r5 = r6.f859s;
        r4 = r5.indexOf(r4);
        r5 = -1;
        if (r4 == r5) goto L_0x002d;
    L_0x0042:
        r3 = r6.f862v;
        r2 = r2.f1093a;
        r4 = java.lang.Integer.valueOf(r4);
        r3.put(r2, r4);
    L_0x004d:
        r1 = r1 + 1;
        goto L_0x0012;
    L_0x0050:
        r7 = r6.f846f;
        r7 = r7.getAdapter();
        r7.notifyDataSetChanged();
        r7 = r6.f845e;
        r7 = r7.getAdapter();
        r7.notifyDataSetChanged();
        r7 = r6.f859s;
        r7 = r7.size();
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r3 = 2;
        r4 = 1;
        if (r7 <= 0) goto L_0x00f7;
    L_0x006e:
        r6.f838M = r4;
        r6.f826A = r4;
        r6.m977k();
        r7 = r6.f837L;
        if (r7 == 0) goto L_0x0082;
    L_0x0079:
        r7 = r6.f844d;
        r7 = r7.f755c;
        r7 = r7.f879a;
        r7.m874f();
    L_0x0082:
        r7 = r6.f844d;
        r7 = r7.f755c;
        r7 = r7.f879a;
        r7.m871c();
        if (r9 == 0) goto L_0x0092;
    L_0x008d:
        r7 = r8.indexOf(r9);
        goto L_0x0093;
    L_0x0092:
        r7 = 0;
    L_0x0093:
        r8 = r6.f845e;
        r8.m3146b(r7, r4);
        r8 = r9 instanceof com.iptv2.core.DataEntity.C1173g;
        if (r8 == 0) goto L_0x00a1;
    L_0x009c:
        r8 = r6.f845e;
        r8.m3143a(r7, r4);
    L_0x00a1:
        r7 = r6.f841a;
        r7.mo1372a(r4);
        r7 = r6.f840O;
        if (r7 == 0) goto L_0x00af;
    L_0x00aa:
        r7 = r6.f840O;
        r7.cancel();
    L_0x00af:
        r7 = new com.github.florent37.viewanimator.ViewAnimator;
        r7.<init>();
        r6.f840O = r7;
        r7 = r6.f849i;
        r7.setVisibility(r0);
        r7 = r6.f850j;
        r7.setVisibility(r0);
        r7 = r6.f851k;
        r7.setVisibility(r0);
        r7 = r6.f850j;
        r8 = 0;
        r7.setAlpha(r8);
        r7 = r6.f851k;
        r7.setAlpha(r8);
        r7 = r6.f840O;
        r8 = new android.view.View[r3];
        r9 = r6.f850j;
        r8[r0] = r9;
        r9 = r6.f851k;
        r8[r4] = r9;
        r7 = r7.addAnimationBuilder(r8);
        r8 = new float[r3];
        r8 = {0, 1065353216};
        r7 = r7.alpha(r8);
        r7 = r7.duration(r1);
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r7 = r7.startDelay(r8);
        r7.start();
        goto L_0x011e;
    L_0x00f7:
        r7 = r6.f852l;
        r7.setVisibility(r0);
        r7 = new android.view.View[r4];
        r8 = r6.f852l;
        r7[r0] = r8;
        r7 = com.github.florent37.viewanimator.ViewAnimator.animate(r7);
        r8 = new float[r3];
        r8 = {0, 1065353216};
        r7 = r7.alpha(r8);
        r7 = r7.duration(r1);
        r7.start();
        r6.m980m();
        r7 = r6.f841a;
        r7.mo1372a(r0);
    L_0x011e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.c.a.d.a(java.util.ArrayList, java.util.ArrayList, com.iptv2.core.DataEntity$h):void");
    }

    /* renamed from: a */
    private void m952a(ArrayList<C0697f> arrayList, ArrayList<C0698h> arrayList2) {
        C0591c.m791a("LiveEpgView", "loadEpgData");
        C1173g a = this.f844d.f753a.f1248C.m1287a(this.f857q, C0730c.m1256b());
        if (a != null) {
            arrayList.addAll(this.f857q.f1090b.subList(this.f857q.f1090b.indexOf(a.f), this.f857q.f1090b.size()));
            while (a != null) {
                arrayList2.add(a);
                a = a.f2059d;
            }
        }
    }

    /* renamed from: a */
    private void m954a(final ArrayList<C0697f> arrayList, final ArrayList<C0698h> arrayList2, final Runnable runnable) {
        C0591c.m791a("LiveEpgView", "loadRecordData");
        this.f844d.f753a.f1249D.m1253c(this.f856p.f1070a, new C0724a<C0709d>(this) {
            /* renamed from: d */
            final /* synthetic */ C0637d f1989d;

            /* renamed from: a */
            public void mo1314a(boolean z, C1184e<C0709d> c1184e, C0587a c0587a, Throwable th) {
                if (z) {
                    z = ((C0709d) c1184e.f2086c).f1163a;
                    for (c1184e = z.size() - 1; c1184e >= null; c1184e--) {
                        C0697f c0697f = (C0697f) z.get(c1184e);
                        arrayList.add(0, c0697f);
                        arrayList2.addAll(0, c0697f.f1095c);
                    }
                    runnable.run();
                    return;
                }
                runnable.run();
            }
        });
    }

    /* renamed from: e */
    public void m1000e() {
        C0693b c0693b = this.f844d.f762j;
        C1174j c1174j = this.f844d.f764l.f2062c;
        if (c1174j != null) {
            this.f844d.m912a(c0693b, c1174j, true);
        } else {
            this.f844d.m915b(c0693b, true);
        }
    }

    /* renamed from: f */
    public void m1001f() {
        C0693b c0693b = this.f844d.f762j;
        C1174j c1174j = this.f844d.f764l.f2063d;
        if (c1174j != null) {
            this.f844d.m912a(c0693b, c1174j, true);
        } else {
            this.f844d.m915b(c0693b, true);
        }
    }

    /* renamed from: a */
    public boolean m996a(int i) {
        if (!this.f826A) {
            if (i != 4) {
                if (i != 22) {
                    m998c();
                    return i == 21;
                }
            }
            return false;
        } else if (i == 19) {
            if (this.f827B) {
                this.f846f.m3149c(i);
            } else {
                this.f845e.m3149c(i);
            }
            return true;
        } else if (i == 20) {
            if (this.f827B) {
                this.f846f.m3149c(i);
            } else {
                this.f845e.m3149c(i);
            }
            return true;
        } else if (i == 21) {
            if (this.f827B != 0) {
                m955a(false);
            } else {
                m998c();
            }
            return true;
        } else if (i != 22 || this.f827B != 0 || this.f860t.size() <= 0) {
            return false;
        } else {
            m955a(true);
            return true;
        }
    }
}
