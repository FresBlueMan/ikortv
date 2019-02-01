package com.iptv2.p044c.p045a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.FrameLayout;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.base.SimpleRecyclerView.C0603a;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0734d.C0732a;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0699i;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.iptv2.p044c.p045a.C0619a;
import com.iptv2.p044c.p045a.C0619a.C0618c;
import com.iptv2.p044c.p045a.C0619a.C1308a;
import com.iptv2.p044c.p045a.C0619a.C1309b;
import com.iptv2.p044c.p045a.C0626b.C0622a;
import com.iptv2.p044c.p045a.C0626b.C0623b;
import com.iptv2.p044c.p045a.C0626b.C0624c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: LiveChannelView */
/* renamed from: com.iptv2.c.a.a */
public class C0619a {
    /* renamed from: A */
    private ViewAnimator f713A;
    /* renamed from: a */
    private C0626b f714a;
    /* renamed from: b */
    private SimpleRecyclerView f715b;
    /* renamed from: c */
    private SimpleRecyclerView f716c;
    /* renamed from: d */
    private View f717d;
    /* renamed from: e */
    private View f718e;
    /* renamed from: f */
    private View f719f;
    /* renamed from: g */
    private View f720g;
    /* renamed from: h */
    private TextView f721h;
    /* renamed from: i */
    private ArrayList<C0699i> f722i;
    /* renamed from: j */
    private C0699i f723j;
    /* renamed from: k */
    private C0699i f724k;
    /* renamed from: l */
    private C0699i f725l;
    /* renamed from: m */
    private C0699i f726m;
    /* renamed from: n */
    private C0592a f727n;
    /* renamed from: o */
    private C0592a f728o;
    /* renamed from: p */
    private boolean f729p = true;
    /* renamed from: q */
    private boolean f730q;
    /* renamed from: r */
    private C1308a f731r;
    /* renamed from: s */
    private AnimationSet f732s;
    /* renamed from: t */
    private AnimationSet f733t;
    /* renamed from: u */
    private int f734u;
    /* renamed from: v */
    private int f735v;
    /* renamed from: w */
    private boolean f736w = false;
    /* renamed from: x */
    private FrameLayout f737x;
    /* renamed from: y */
    private final C0618c f738y = C0618c.TopBotttom;
    /* renamed from: z */
    private Runnable f739z = new C06134(this);

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$4 */
    class C06134 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0619a f705a;

        C06134(C0619a c0619a) {
            this.f705a = c0619a;
        }

        public void run() {
            C1308a c1308a = (C1308a) this.f705a.f716c.getSelectedViewHolder();
            if (c1308a != null) {
                if (!this.f705a.f714a.f753a.f1248C.m1321h() && C0730c.f1239c == 0) {
                    c1308a.f2229a.startAnimation(this.f705a.f732s);
                    c1308a.f2232d.startAnimation(this.f705a.f733t);
                }
                if (!this.f705a.f736w || this.f705a.f738y == C0618c.TopBotttom) {
                    c1308a.f2230b.setEllipsize(TruncateAt.MARQUEE);
                    c1308a.f2231c.setEllipsize(TruncateAt.MARQUEE);
                }
                this.f705a.f731r = c1308a;
            }
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$5 */
    class C06145 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C0619a f706a;

        C06145(C0619a c0619a) {
            this.f706a = c0619a;
        }

        public void onClick(View view) {
            this.f706a.f714a.f754b.mo2163a();
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$6 */
    class C06156 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0619a f707a;

        C06156(C0619a c0619a) {
            this.f707a = c0619a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f707a.f729p != null) {
                this.f707a.m840a(true);
            }
            return null;
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$7 */
    class C06167 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0619a f708a;

        C06167(C0619a c0619a) {
            this.f708a = c0619a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f708a.f729p != null && this.f708a.f726m.f1101b.size() > null) {
                this.f708a.m840a(false);
            }
            return false;
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$8 */
    class C06178 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0619a f709a;

        C06178(C0619a c0619a) {
            this.f709a = c0619a;
        }

        public void run() {
            this.f709a.f715b.m3146b(this.f709a.f723j.f1102c, false);
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$c */
    private enum C0618c {
        LeftRight,
        TopBotttom
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$1 */
    class C11061 extends C0622a {
        /* renamed from: a */
        final /* synthetic */ C0619a f1935a;

        C11061(C0619a c0619a) {
            this.f1935a = c0619a;
        }

        /* renamed from: a */
        public void mo1360a(C0624c c0624c) {
            if (this.f1935a.f714a.f766n == C0623b.Live) {
                if (this.f1935a.f730q != null) {
                    this.f1935a.m840a(false);
                }
                int indexOf = this.f1935a.f726m.f1101b.indexOf(this.f1935a.f714a.f762j);
                if (indexOf != -1) {
                    if (this.f1935a.m861p() != this.f1935a.f714a.f762j) {
                        this.f1935a.f716c.m3146b(indexOf, true);
                    }
                    this.f1935a.f716c.m3143a(indexOf, true);
                    return;
                }
                this.f1935a.f715b.m3146b(this.f1935a.f723j.f1102c, false);
            }
        }

        /* renamed from: a */
        public void mo1361a(C0693b c0693b, boolean z) {
            this.f1935a.f716c.getAdapter().notifyDataSetChanged();
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$2 */
    class C11072 extends C0603a {
        /* renamed from: a */
        final /* synthetic */ C0619a f1936a;

        C11072(C0619a c0619a) {
            this.f1936a = c0619a;
        }

        /* renamed from: a */
        public void mo1316a(int i, int i2) {
            this.f1936a.f719f.setVisibility(8);
            this.f1936a.f726m = (C0699i) this.f1936a.f722i.get(i);
            if (this.f1936a.f726m == this.f1936a.f724k) {
                this.f1936a.m851k();
                if (this.f1936a.f724k.f1101b.size() == 0) {
                    this.f1936a.f719f.setVisibility(0);
                }
            }
            i = this.f1936a.f726m.f1101b.iterator();
            C0693b c0693b = null;
            while (i.hasNext()) {
                C0693b c0693b2 = (C0693b) i.next();
                c0693b2.f1081l = this.f1936a.f726m;
                c0693b2.f1080k = null;
                c0693b2.f1079j = null;
                if (c0693b != null) {
                    c0693b.f1080k = c0693b2;
                }
                c0693b2.f1079j = c0693b;
                c0693b = c0693b2;
            }
            if (this.f1936a.f726m == this.f1936a.f723j) {
                C0693b c0693b3 = (C0693b) this.f1936a.f726m.f1101b.get(0);
                C0693b c0693b4 = (C0693b) this.f1936a.f726m.f1101b.get(this.f1936a.f726m.f1101b.size() - 1);
                c0693b3.f1079j = c0693b4;
                c0693b4.f1080k = c0693b3;
            }
            this.f1936a.f716c.m3141a();
            this.f1936a.f716c.m3146b(-1, false);
            this.f1936a.f716c.getAdapter().notifyDataSetChanged();
            i = this.f1936a.f726m.f1101b.indexOf(this.f1936a.f714a.f762j);
            if (i == -1) {
                this.f1936a.f716c.m3146b(0, false);
                return;
            }
            this.f1936a.f716c.m3146b(i, true);
            this.f1936a.f716c.m3143a(i, true);
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$3 */
    class C11083 extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ C0619a f1937a;

        C11083(C0619a c0619a) {
            this.f1937a = c0619a;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            recyclerView = this.f1937a.f715b.m3148c();
            i = this.f1937a.f715b.m3150d();
            int i3 = 0;
            this.f1937a.f717d.setVisibility(recyclerView == null ? 8 : null);
            recyclerView = this.f1937a.f718e;
            if (i == this.f1937a.f722i.size() - 1) {
                i3 = 8;
            }
            recyclerView.setVisibility(i3);
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$9 */
    class C11099 implements C0732a {
        /* renamed from: a */
        final /* synthetic */ C0619a f1938a;

        C11099(C0619a c0619a) {
            this.f1938a = c0619a;
        }

        /* renamed from: a */
        public void mo1362a() {
            C0591c.m790a("firstLoadEpgDone.................................");
            this.f1938a.f716c.getAdapter().notifyDataSetChanged();
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$a */
    private class C1308a extends C1102a<C0693b> {
        /* renamed from: a */
        public ImageView f2229a;
        /* renamed from: b */
        public TextView f2230b;
        /* renamed from: c */
        public TextView f2231c;
        /* renamed from: d */
        public TextView f2232d;
        /* renamed from: e */
        public Drawable f2233e;
        /* renamed from: f */
        public View f2234f;
        /* renamed from: g */
        public Drawable f2235g;
        /* renamed from: i */
        final /* synthetic */ C0619a f2236i;

        public C1308a(C0619a c0619a, View view) {
            this.f2236i = c0619a;
            super(view);
            this.f2229a = (ImageView) view.findViewById(R.id.logo);
            this.f2230b = (TextView) view.findViewById(R.id.name);
            this.f2231c = (TextView) view.findViewById(R.id.epg);
            this.f2232d = (TextView) view.findViewById(R.id.keycode);
            this.f2234f = view.findViewById(R.id.favorites);
            view = C0593d.m796a(c0619a.f714a.f753a.f1260a, c0619a.f728o);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, view);
            this.f2233e = stateListDrawable;
            this.f2235g = ContextCompat.getDrawable(c0619a.f714a.f754b, R.drawable.widget_live_all_items_bg);
        }

        /* renamed from: a */
        public void m2738a(C0693b c0693b) {
            this.h = c0693b;
            this.f2230b.setText(((C0693b) this.h).f1071b);
            c0693b = this.f2232d;
            Object[] objArr = new Object[1];
            int i = 0;
            objArr[0] = Integer.valueOf(((C0693b) this.h).f1072c);
            c0693b.setText(String.format("%03d", objArr));
            c0693b = this.f2234f;
            if (!this.f2236i.f714a.f753a.f1248C.m1301a((C0693b) this.h)) {
                i = 8;
            }
            c0693b.setVisibility(i);
            if (this.f2236i.f714a.f753a.f1248C.f1284c.f1159r.isEmpty() == null) {
                if (this.h.f1073d.isEmpty() == null) {
                    c0693b = new StringBuilder();
                    c0693b.append(this.f2236i.f714a.f753a.f1248C.f1284c.f1159r);
                    c0693b.append(((C0693b) this.h).f1073d);
                    this.f2236i.f714a.f753a.f1254I.displayImage(c0693b.toString(), this.f2229a, this.f2236i.f714a.f753a.f1248C.m1321h() ? this.f2236i.f714a.f753a.f1256K : this.f2236i.f714a.f753a.f1257L);
                    c0693b = this.f2236i.f714a.f753a.f1248C.m1288a(((C0693b) this.h).f1070a, C0730c.m1256b());
                    this.f2231c.setText(c0693b != null ? this.f2236i.f714a.f753a.f1251F.m1350e("epgEmpty") : c0693b.e);
                }
            }
            this.f2229a.setImageResource(R.drawable.icon_live_channel_logo_empty);
            c0693b = this.f2236i.f714a.f753a.f1248C.m1288a(((C0693b) this.h).f1070a, C0730c.m1256b());
            if (c0693b != null) {
            }
            this.f2231c.setText(c0693b != null ? this.f2236i.f714a.f753a.f1251F.m1350e("epgEmpty") : c0693b.e);
        }

        /* renamed from: a */
        public void mo1858a() {
            Object obj = (!this.f2236i.f729p || this.f2236i.f730q) ? null : 1;
            TextView textView = this.f2232d;
            Context context = this.f2236i.f714a.f754b;
            int i = R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            int i2 = obj != null ? this.f2236i.f736w ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor : this.f2236i.f736w ? R.drawable.widget_live_overlay_long_list_item_text_textcolor : R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            textView.setTextColor(ContextCompat.getColorStateList(context, i2));
            textView = this.f2230b;
            context = this.f2236i.f714a.f754b;
            if (obj != null) {
                i = this.f2236i.f736w ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor;
            } else if (this.f2236i.f736w) {
                i = R.drawable.widget_live_overlay_long_list_item_text_textcolor;
            }
            textView.setTextColor(ContextCompat.getColorStateList(context, i));
            textView = this.f2231c;
            context = this.f2236i.f714a.f754b;
            i = obj != null ? this.f2236i.f736w ? R.drawable.widget_live_overlay_long_list_item_subtext_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_subtext_actived_textcolor : this.f2236i.f736w ? R.drawable.widget_live_overlay_long_list_item_subtext_textcolor : R.drawable.widget_live_overlay_short_list_item_subtext_textcolor;
            textView.setTextColor(ContextCompat.getColorStateList(context, i));
            if (!this.f2236i.f736w || this.f2236i.f738y == C0618c.TopBotttom) {
                this.f2231c.setEllipsize(TruncateAt.END);
                this.f2230b.setEllipsize(TruncateAt.END);
            }
            if (this.f2236i.f714a.f753a.f1248C.m1321h() && !this.f2236i.f736w) {
                this.f2232d.setVisibility(8);
                this.f2229a.setVisibility(0);
            }
            C0595e.m809a(this.itemView, obj != null ? this.f2233e : this.f2235g);
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChannelViewHolder onClick ");
            stringBuilder.append(((C0693b) this.h).f1071b);
            C0591c.m791a("LiveChannelView", stringBuilder.toString());
            this.f2236i.m840a(false);
            this.f2236i.f716c.m3146b(getAdapterPosition(), false);
            C0693b c0693b = this.f2236i.f714a.f762j;
            C0693b h = this.f2236i.m861p();
            if (c0693b == h) {
                if (this.f2236i.f714a.f766n != C0623b.TimeShift) {
                    if (this.f2236i.f714a.f755c.f880b.m997b()) {
                        this.f2236i.f714a.f755c.f880b.m998c();
                        return;
                    } else {
                        this.f2236i.f714a.f755c.m1026d();
                        return;
                    }
                }
            }
            this.f2236i.f714a.m915b(h, false);
            this.f2236i.f714a.f755c.f880b.m998c();
        }

        /* renamed from: e */
        public boolean mo1859e() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChannelViewHolder onLongClick ");
            stringBuilder.append(((C0693b) this.h).f1071b);
            C0591c.m791a("LiveChannelView", stringBuilder.toString());
            this.f2236i.m840a(false);
            this.f2236i.f716c.m3146b(getAdapterPosition(), false);
            this.f2236i.f714a.m913a((C0693b) this.h, this.f2236i.f714a.f753a.f1248C.m1301a((C0693b) this.h) ^ true);
            return true;
        }
    }

    /* compiled from: LiveChannelView */
    /* renamed from: com.iptv2.c.a.a$b */
    private class C1309b extends C1102a<C0699i> {
        /* renamed from: a */
        public TextView f2237a;
        /* renamed from: b */
        public Drawable f2238b;
        /* renamed from: c */
        public Drawable f2239c;
        /* renamed from: d */
        final /* synthetic */ C0619a f2240d;

        public C1309b(C0619a c0619a, View view) {
            this.f2240d = c0619a;
            super(view);
            this.f2237a = (TextView) view.findViewById(R.id.text);
            view = C0593d.m796a(c0619a.f714a.f753a.f1260a, c0619a.f727n);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, view);
            this.f2238b = stateListDrawable;
            this.f2239c = ContextCompat.getDrawable(c0619a.f714a.f754b, R.drawable.widget_live_all_items_bg);
        }

        /* renamed from: a */
        public void m2742a(C0699i c0699i) {
            this.h = c0699i;
            this.f2237a.setText(((C0699i) this.h).f1100a);
        }

        /* renamed from: a */
        public void mo1858a() {
            Object obj = (this.f2240d.f729p && this.f2240d.f730q && !this.f2240d.f720g.isActivated()) ? 1 : null;
            TextView textView = this.f2237a;
            Context context = this.f2240d.f714a.f754b;
            int i = obj != null ? this.f2240d.f736w ? R.drawable.widget_live_overlay_long_list_item_text_actived_textcolor : R.drawable.widget_live_overlay_short_list_item_text_actived_textcolor : this.f2240d.f736w ? R.drawable.widget_live_overlay_long_list_item_text_textcolor : R.drawable.widget_live_overlay_short_list_item_text_textcolor;
            textView.setTextColor(ContextCompat.getColorStateList(context, i));
            this.f2237a.setEllipsize(obj != null ? TruncateAt.MARQUEE : TruncateAt.END);
            C0595e.m809a(this.itemView, obj != null ? this.f2238b : this.f2239c);
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GenreViewHolder onClick ");
            stringBuilder.append(((C0699i) this.h).f1100a);
            C0591c.m791a("LiveChannelView", stringBuilder.toString());
            this.f2240d.m840a(true);
            this.f2240d.f715b.m3146b(getAdapterPosition(), false);
            if (this.f2240d.f714a.f755c.f880b.m997b()) {
                this.f2240d.f714a.f755c.f880b.m998c();
            }
        }
    }

    public C0619a(C0626b c0626b, View view) {
        this.f714a = c0626b;
        if (C0730c.f1239c == 1) {
            this.f736w = true;
        }
        if (this.f736w) {
            this.f734u = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_long_width);
            this.f735v = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_long_width);
        } else {
            this.f734u = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_width);
            this.f735v = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_width);
        }
        this.f715b = (SimpleRecyclerView) view.findViewById(R.id.genre_list);
        this.f737x = (FrameLayout) view.findViewById(R.id.channelListContainer);
        this.f716c = (SimpleRecyclerView) view.findViewById(R.id.channel_list);
        this.f720g = view.findViewById(R.id.btn_setting);
        this.f717d = view.findViewById(R.id.genre_more_up);
        this.f718e = view.findViewById(R.id.genre_more_down);
        this.f719f = view.findViewById(R.id.favorites_empty);
        this.f721h = (TextView) view.findViewById(R.id.favorites_empty_text);
        view = this.f721h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c0626b.f753a.f1251F.m1350e("liveFavoritesEmpty"));
        stringBuilder.append("\r\n");
        stringBuilder.append(c0626b.f753a.f1251F.m1350e("liveFavoritesTip"));
        view.setText(stringBuilder.toString());
        m853l();
        m856n();
        m855m();
        this.f714a.m910a(new C11061(this));
        this.f720g.setOnClickListener(new C06145(this));
        if (this.f714a.f753a.f1248C.m1321h() != null) {
            this.f715b.setOnTouchListener(new C06156(this));
            this.f716c.setOnTouchListener(new C06167(this));
        }
    }

    /* renamed from: a */
    public void m868a() {
        this.f722i = new ArrayList(this.f714a.f768p);
        this.f723j = new C0699i();
        this.f723j.f1100a = this.f714a.f753a.f1251F.m1347b("all");
        this.f723j.f1101b.addAll(this.f714a.f769q);
        this.f724k = new C0699i();
        this.f724k.f1100a = this.f714a.f753a.f1251F.m1347b("liveGenreFavorites");
        this.f725l = new C0699i();
        this.f725l.f1100a = this.f714a.f753a.f1251F.m1347b("free");
        this.f722i.add(0, this.f723j);
        if (this.f714a.f753a.f1248C.f1284c.f1152k != 3) {
            Iterator it = this.f714a.f769q.iterator();
            while (it.hasNext()) {
                C0693b c0693b = (C0693b) it.next();
                if (c0693b.f1077h.f1083b) {
                    this.f725l.f1101b.add(c0693b);
                }
            }
            if (this.f725l.f1101b.size() > 0) {
                this.f722i.add(0, this.f725l);
            }
        }
        this.f722i.add(0, this.f724k);
        C0699i c0699i = null;
        int i = 0;
        while (i < this.f722i.size()) {
            C0699i c0699i2 = (C0699i) this.f722i.get(i);
            c0699i2.f1102c = i;
            if (c0699i != null) {
                c0699i.f1104e = c0699i2;
            }
            c0699i2.f1103d = c0699i;
            i++;
            c0699i = c0699i2;
        }
        C0699i c0699i3 = (C0699i) this.f722i.get(0);
        c0699i = (C0699i) this.f722i.get(this.f722i.size() - 1);
        c0699i3.f1103d = c0699i;
        c0699i.f1104e = c0699i3;
        i = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_genre_item_height) + (this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_genre_item_vmargin) * 2);
        this.f715b.getLayoutParams().height = i * Math.min(this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.width_220_320) / i, this.f722i.size());
        this.f726m = this.f723j;
        C0595e.m810a(this.f715b, new C06178(this));
        this.f714a.f753a.f1248C.m1298a(new C11099(this));
    }

    /* renamed from: k */
    private void m851k() {
        this.f724k.f1101b.clear();
        Iterator it = this.f714a.f753a.f1248C.m1328n().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f714a.f770r.containsKey(str)) {
                this.f724k.f1101b.add(this.f714a.f770r.get(str));
            }
        }
    }

    /* renamed from: l */
    private void m853l() {
        C0619a c0619a = this;
        if (C0730c.f1239c != 1) {
            c0619a.f732s = new AnimationSet(true);
            c0619a.f732s.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            c0619a.f732s.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f));
            c0619a.f732s.setFillAfter(true);
            c0619a.f732s.setDuration(400);
            c0619a.f733t = new AnimationSet(true);
            c0619a.f733t.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            c0619a.f733t.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f));
            c0619a.f733t.setFillAfter(true);
            c0619a.f733t.setDuration(400);
        }
    }

    /* renamed from: m */
    private void m855m() {
        this.f716c.setChoiceMode(1);
        int dimensionPixelSize = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_height) + (this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_vmargin) * 2);
        this.f716c.getLayoutParams().height = (this.f714a.f753a.f1266n.heightPixels / dimensionPixelSize) * dimensionPixelSize;
        this.f716c.setItemHeight(dimensionPixelSize);
        this.f728o = new C0592a();
        this.f728o.f645a = this.f734u;
        this.f728o.f646b = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_height);
        this.f728o.f649e = ContextCompat.getColor(this.f714a.f754b, R.color.widget_live_overlay_focus_shadow_color);
        this.f728o.f650f = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_shadow_radius_size);
        this.f728o.f647c = ContextCompat.getColor(this.f714a.f754b, R.color.widget_live_overlay_focus_border_color);
        this.f728o.f651g = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_size);
        this.f728o.f653i = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_radius_size);
        this.f716c.setLayoutManager(new LinearLayoutManager(this.f714a.f754b));
        this.f716c.setAdapter(new Adapter<C1308a>(this) {
            /* renamed from: a */
            final /* synthetic */ C0619a f1932a;

            {
                this.f1932a = r1;
            }

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2351a((C1308a) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2350a(viewGroup, i);
            }

            /* renamed from: a */
            public C1308a m2350a(ViewGroup viewGroup, int i) {
                if (C0730c.f1239c == 0) {
                    return new C1308a(this.f1932a, this.f1932a.f714a.f753a.f1264l.inflate(R.layout.widget_live_overlay_channel_view_channel_item, viewGroup, false));
                }
                if (this.f1932a.f738y == C0618c.LeftRight) {
                    return new C1308a(this.f1932a, this.f1932a.f714a.f753a.f1264l.inflate(R.layout.widget_live_overlay_channel_view_channel_item_long_1, viewGroup, false));
                }
                return this.f1932a.f738y == C0618c.TopBotttom ? new C1308a(this.f1932a, this.f1932a.f714a.f753a.f1264l.inflate(R.layout.widget_live_overlay_channel_view_channel_item_long_2, viewGroup, false)) : 0;
            }

            /* renamed from: a */
            public void m2351a(C1308a c1308a, int i) {
                c1308a.m2738a((C0693b) this.f1932a.f726m.f1101b.get(i));
            }

            public int getItemCount() {
                return this.f1932a.f726m.f1101b.size();
            }
        });
        this.f716c.m3144a(new C0603a(this) {
            /* renamed from: a */
            final /* synthetic */ C0619a f1933a;

            {
                this.f1933a = r1;
            }

            /* renamed from: a */
            public void mo1316a(int i, int i2) {
                if (i != -1) {
                    this.f1933a.m859o();
                }
            }
        });
    }

    /* renamed from: n */
    private void m856n() {
        this.f727n = new C0592a();
        this.f727n.f645a = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_genre_item_width);
        this.f727n.f646b = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_genre_item_height);
        this.f727n.f649e = ContextCompat.getColor(this.f714a.f754b, R.color.widget_live_overlay_focus_shadow_color);
        this.f727n.f650f = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_shadow_radius_size);
        this.f727n.f647c = ContextCompat.getColor(this.f714a.f754b, R.color.widget_live_overlay_focus_border_color);
        this.f727n.f651g = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_size);
        this.f727n.f653i = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_focus_border_radius_size);
        this.f715b.setLayoutManager(new LinearLayoutManager(this.f714a.f754b));
        this.f715b.setAdapter(new Adapter<C1309b>(this) {
            /* renamed from: a */
            final /* synthetic */ C0619a f1934a;

            {
                this.f1934a = r1;
            }

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2354a((C1309b) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2353a(viewGroup, i);
            }

            /* renamed from: a */
            public C1309b m2353a(ViewGroup viewGroup, int i) {
                return new C1309b(this.f1934a, this.f1934a.f714a.f753a.f1264l.inflate(R.layout.widget_live_overlay_channel_view_genre_item, viewGroup, false));
            }

            /* renamed from: a */
            public void m2354a(C1309b c1309b, int i) {
                c1309b.m2742a((C0699i) this.f1934a.f722i.get(i));
            }

            public int getItemCount() {
                return this.f1934a.f722i.size();
            }
        });
        this.f715b.m3144a(new C11072(this));
        this.f715b.addOnScrollListener(new C11083(this));
    }

    /* renamed from: o */
    private void m859o() {
        if (this.f731r != null) {
            if (!this.f714a.f753a.f1248C.m1321h() && C0730c.f1239c == 0) {
                this.f731r.f2232d.clearAnimation();
                this.f731r.f2229a.clearAnimation();
            }
            if (!this.f736w || this.f738y == C0618c.TopBotttom) {
                this.f731r.f2230b.setEllipsize(TruncateAt.END);
                this.f731r.f2231c.setEllipsize(TruncateAt.END);
            }
            this.f731r = null;
        }
        this.f714a.f753a.f1263k.removeCallbacks(this.f739z);
        this.f714a.f753a.f1263k.postDelayed(this.f739z, 1000);
    }

    /* renamed from: p */
    private C0693b m861p() {
        int selectedIndex = this.f716c.getSelectedIndex();
        if (selectedIndex == -1) {
            return null;
        }
        return (C0693b) this.f726m.f1101b.get(selectedIndex);
    }

    /* renamed from: b */
    public void m870b() {
        if (!this.f729p) {
            this.f729p = true;
            if (this.f730q) {
                this.f715b.m3145b();
            } else {
                this.f716c.m3145b();
            }
        }
    }

    /* renamed from: c */
    public void m871c() {
        if (this.f729p) {
            this.f729p = false;
            if (this.f730q) {
                this.f715b.m3145b();
            } else {
                this.f716c.m3145b();
            }
        }
    }

    /* renamed from: a */
    private void m840a(boolean z) {
        if (this.f730q != z) {
            if (!z) {
                this.f720g.setActivated(false);
            }
            this.f730q = z;
            this.f715b.m3145b();
            this.f716c.m3145b();
        }
    }

    /* renamed from: d */
    public void m872d() {
        C1102a selectedViewHolder;
        if (!this.f730q) {
            selectedViewHolder = this.f716c.getSelectedViewHolder();
            if (selectedViewHolder != null) {
                selectedViewHolder.mo1855b();
            }
        } else if (this.f720g.isActivated()) {
            this.f720g.performClick();
        } else {
            selectedViewHolder = this.f715b.getSelectedViewHolder();
            if (selectedViewHolder != null) {
                selectedViewHolder.mo1855b();
            }
        }
    }

    /* renamed from: e */
    public boolean m873e() {
        if (!this.f730q) {
            C1102a selectedViewHolder = this.f716c.getSelectedViewHolder();
            if (selectedViewHolder != null) {
                return selectedViewHolder.mo1859e();
            }
        } else if (this.f720g.isActivated()) {
            this.f720g.performClick();
        }
        return false;
    }

    /* renamed from: f */
    public void m874f() {
        if (C0730c.f1239c != 0) {
            if (this.f713A != null) {
                this.f713A.cancel();
            }
            this.f713A = new ViewAnimator();
            int width = this.f737x.getWidth();
            int dimensionPixelSize = this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_smaller_mode_width);
            int i = ((width - dimensionPixelSize) * 400) / (this.f735v - dimensionPixelSize);
            this.f713A.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f737x).width((float) width, (float) dimensionPixelSize).duration((long) i).start();
        }
    }

    /* renamed from: g */
    public void m875g() {
        if (C0730c.f1239c != 0) {
            if (this.f713A != null) {
                this.f713A.cancel();
            }
            this.f713A = new ViewAnimator();
            int width = ((this.f735v - this.f737x.getWidth()) * 400) / (this.f735v - this.f714a.f753a.f1265m.getDimensionPixelSize(R.dimen.widget_live_overlay_channel_item_smaller_mode_width));
            this.f713A.interpolator(new LinearInterpolator()).addAnimationBuilder(this.f737x).width((float) r0, (float) this.f735v).duration((long) width).start();
        }
    }

    /* renamed from: h */
    public void m876h() {
        C0693b p = m861p();
        if (p != null) {
            m840a(false);
            C0637d c0637d = this.f714a.f755c.f880b;
            if (!c0637d.m997b() || c0637d.m999d() != p) {
                c0637d.m995a(p);
            }
        }
    }

    /* renamed from: a */
    public boolean m869a(int i) {
        if (i == 19) {
            if (!this.f730q) {
                this.f716c.m3149c(i);
            } else if (this.f720g.isActivated()) {
                this.f720g.setActivated(false);
                this.f715b.m3145b();
            } else {
                this.f715b.m3149c(i);
            }
            return true;
        } else if (i == 20) {
            if (!this.f730q) {
                this.f716c.m3149c(i);
            } else if (this.f715b.getSelectedIndex() == this.f722i.size() - 1) {
                this.f720g.setActivated(true);
                this.f715b.m3145b();
            } else {
                this.f715b.m3149c(i);
            }
            return true;
        } else {
            if (i == 21) {
                if (this.f730q == 0) {
                    m840a(true);
                    return true;
                }
            } else if (i == 22) {
                if (this.f730q == 0) {
                    m876h();
                } else if (this.f726m.f1101b.size() > 0) {
                    m840a(false);
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    public void m877i() {
        /*
        r6 = this;
        r0 = r6.f714a;
        r0 = r0.f762j;
        r1 = r0.f1079j;
        r2 = 1;
        if (r1 != 0) goto L_0x0041;
    L_0x0009:
        r1 = r0.f1081l;
    L_0x000b:
        r1 = r1.f1103d;
        r3 = r6.f724k;
        if (r1 != r3) goto L_0x0014;
    L_0x0011:
        r6.m851k();
    L_0x0014:
        r3 = r1.f1101b;
        r3 = r3.size();
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x000b;
    L_0x001d:
        r4 = r1.f1101b;
        r5 = r3 + -1;
        r4 = r4.get(r5);
        r4 = (com.iptv2.core.DataEntity.C0693b) r4;
        if (r4 != r0) goto L_0x0037;
    L_0x0029:
        if (r3 != r2) goto L_0x002c;
    L_0x002b:
        goto L_0x000b;
    L_0x002c:
        r0 = r1.f1101b;
        r3 = r3 + -2;
        r0 = r0.get(r3);
        r0 = (com.iptv2.core.DataEntity.C0693b) r0;
        goto L_0x0038;
    L_0x0037:
        r0 = r4;
    L_0x0038:
        r3 = r6.f715b;
        r1 = r1.f1102c;
        r4 = 0;
        r3.m3146b(r1, r4);
        goto L_0x0042;
    L_0x0041:
        r0 = r1;
    L_0x0042:
        if (r0 == 0) goto L_0x0049;
    L_0x0044:
        r1 = r6.f714a;
        r1.m915b(r0, r2);
    L_0x0049:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.c.a.a.i():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: j */
    public void m878j() {
        /*
        r6 = this;
        r0 = r6.f714a;
        r0 = r0.f762j;
        r1 = r0.f1080k;
        r2 = 1;
        if (r1 != 0) goto L_0x003d;
    L_0x0009:
        r1 = r0.f1081l;
    L_0x000b:
        r1 = r1.f1104e;
        r3 = r6.f724k;
        if (r1 != r3) goto L_0x0014;
    L_0x0011:
        r6.m851k();
    L_0x0014:
        r3 = r1.f1101b;
        r3 = r3.size();
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x000b;
    L_0x001d:
        r4 = r1.f1101b;
        r5 = 0;
        r4 = r4.get(r5);
        r4 = (com.iptv2.core.DataEntity.C0693b) r4;
        if (r4 != r0) goto L_0x0034;
    L_0x0028:
        if (r3 != r2) goto L_0x002b;
    L_0x002a:
        goto L_0x000b;
    L_0x002b:
        r0 = r1.f1101b;
        r0 = r0.get(r2);
        r0 = (com.iptv2.core.DataEntity.C0693b) r0;
        goto L_0x0035;
    L_0x0034:
        r0 = r4;
    L_0x0035:
        r3 = r6.f715b;
        r1 = r1.f1102c;
        r3.m3146b(r1, r5);
        goto L_0x003e;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        if (r0 == 0) goto L_0x0045;
    L_0x0040:
        r1 = r6.f714a;
        r1.m915b(r0, r2);
    L_0x0045:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.c.a.a.j():void");
    }
}
