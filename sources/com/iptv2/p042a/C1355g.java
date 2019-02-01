package com.iptv2.p042a;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.C1338a;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: TimeZoneSettingDialog */
/* renamed from: com.iptv2.a.g */
public class C1355g extends C1338a {
    /* renamed from: e */
    private View f2424e;
    /* renamed from: f */
    private View f2425f;
    /* renamed from: g */
    private SimpleRecyclerView f2426g;
    /* renamed from: h */
    private TextView f2427h;
    /* renamed from: i */
    private ArrayList<C0543b> f2428i;
    /* renamed from: j */
    private C0592a f2429j;
    /* renamed from: k */
    private C0542a f2430k;

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$1 */
    class C05381 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1355g f572a;

        C05381(C1355g c1355g) {
            this.f572a = c1355g;
        }

        public void run() {
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f572a.f2425f.getWidth();
            c0592a.f646b = this.f572a.f2425f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f572a.a.m1258a(1.0f);
            c0592a.f653i = this.f572a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f572a.f2425f, c0592a);
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$2 */
    class C05392 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1355g f573a;

        C05392(C1355g c1355g) {
            this.f573a = c1355g;
        }

        public void onClick(View view) {
            this.f573a.dismiss();
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$3 */
    class C05403 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1355g f574a;

        C05403(C1355g c1355g) {
            this.f574a = c1355g;
        }

        public void onClick(View view) {
            C1304c c1304c = (C1304c) this.f574a.f2426g.getSelectedViewHolder();
            if (c1304c != null) {
                c1304c.mo1855b();
            }
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$5 */
    class C05415 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1355g f575a;

        C05415(C1355g c1355g) {
            this.f575a = c1355g;
        }

        public void run() {
            String b = this.f575a.a.f1248C.m1302b();
            int i = 0;
            for (int i2 = 0; i2 < this.f575a.f2428i.size(); i2++) {
                if (((C0543b) this.f575a.f2428i.get(i2)).f576a.equals(b)) {
                    i = i2;
                    break;
                }
            }
            this.f575a.f2426g.m3146b(i, true);
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$a */
    public static class C0542a {
        /* renamed from: a */
        public void mo1313a(String str) {
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$b */
    private static class C0543b {
        /* renamed from: a */
        public String f576a;
        /* renamed from: b */
        public String f577b;

        public C0543b(String str, String str2) {
            this.f576a = str;
            this.f577b = str2;
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$4 */
    class C10574 extends Adapter<C1304c> {
        /* renamed from: a */
        final /* synthetic */ C1355g f1869a;

        C10574(C1355g c1355g) {
            this.f1869a = c1355g;
        }

        public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            m2261a((C1304c) viewHolder, i);
        }

        public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m2260a(viewGroup, i);
        }

        /* renamed from: a */
        public C1304c m2260a(ViewGroup viewGroup, int i) {
            return new C1304c(this.f1869a, this.f1869a.a.f1264l.inflate(R.layout.dialog_timezonesetting_list_item, viewGroup, false));
        }

        /* renamed from: a */
        public void m2261a(C1304c c1304c, int i) {
            c1304c.m2718a((C0543b) this.f1869a.f2428i.get(i));
        }

        public int getItemCount() {
            return this.f1869a.f2428i.size();
        }
    }

    /* compiled from: TimeZoneSettingDialog */
    /* renamed from: com.iptv2.a.g$c */
    private class C1304c extends C1102a<C0543b> {
        /* renamed from: a */
        public TextView f2212a;
        /* renamed from: b */
        final /* synthetic */ C1355g f2213b;

        public C1304c(C1355g c1355g, View view) {
            this.f2213b = c1355g;
            super(view);
            this.f2212a = (TextView) view.findViewById(R.id.text);
            c1355g = C0593d.m796a(c1355g.a.f1260a, c1355g.f2429j);
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, c1355g);
            stateListDrawable.addState(new int[]{16842919}, c1355g);
            C0595e.m809a(view, stateListDrawable);
        }

        /* renamed from: a */
        public void m2718a(C0543b c0543b) {
            this.h = c0543b;
            this.f2212a.setText(((C0543b) this.h).f577b);
        }

        /* renamed from: c */
        public void mo1856c() {
            ViewAnimator.animate(this.itemView).scaleX(1.015f).scaleY(1.015f).duration(200).start();
            ViewCompat.postInvalidateOnAnimation(this.f2213b.f2426g);
        }

        /* renamed from: d */
        public void mo1857d() {
            ViewAnimator.animate(this.itemView).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }

        /* renamed from: b */
        public void mo1855b() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewHolder onClick ");
            stringBuilder.append(((C0543b) this.h).f577b);
            C0591c.m791a("TimeZoneSettingDialog", stringBuilder.toString());
            if (this.f2213b.f2430k != null) {
                this.f2213b.f2430k.mo1313a(((C0543b) this.h).f576a);
            }
            this.f2213b.dismiss();
        }
    }

    /* renamed from: a */
    public void m3085a(C0542a c0542a) {
        this.f2430k = c0542a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.Dialog);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2424e = layoutInflater.inflate(R.layout.dialog_timezonesetting, viewGroup, false);
        this.f2425f = this.f2424e.findViewById(R.id.content);
        this.f2427h = (TextView) this.f2424e.findViewById(R.id.title);
        this.f2427h.setText(this.a.f1251F.m1347b("timeZone"));
        this.f2426g = (SimpleRecyclerView) this.f2424e.findViewById(R.id.list);
        m3077c();
        C0595e.m810a(this.f2425f, new C05381(this));
        if (this.a.f1248C.m1321h() != null) {
            this.f2424e.setOnClickListener(new C05392(this));
        } else {
            this.f2424e.setFocusable(true);
            this.f2424e.setOnClickListener(new C05403(this));
        }
        return this.f2424e;
    }

    /* renamed from: c */
    private void m3077c() {
        this.f2429j = new C0592a();
        this.f2429j.f645a = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_timezonesetting_list_item_width);
        this.f2429j.f646b = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_timezonesetting_list_item_height);
        this.f2429j.f649e = ContextCompat.getColor(this.a.f1260a, R.color.dialog_setting_menu_item_focus_shadow_color);
        this.f2429j.f648d = Color.parseColor("#20ffffff");
        this.f2429j.f647c = ContextCompat.getColor(this.a.f1260a, R.color.dialog_setting_menu_item_focus_border_color);
        this.f2429j.f651g = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_focus_border_size);
        this.f2429j.f650f = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_setting_menu_item_focus_shadow_radius_size);
        this.f2428i = new ArrayList();
        this.f2428i.add(new C0543b("", this.a.f1251F.m1347b("timeZoneAuto")));
        LinkedHashMap d = this.a.f1251F.m1349d("timeZones");
        for (String str : d.keySet()) {
            this.f2428i.add(new C0543b(str, (String) d.get(str)));
        }
        int dimensionPixelSize = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_timezonesetting_list_item_height) + (this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_timezonesetting_list_item_vmargin) * 2);
        int min = Math.min(this.f2428i.size(), 10);
        this.f2426g.getLayoutParams().height = (min * dimensionPixelSize) + (this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_timezonesetting_list_item_vmargin) * 2);
        this.f2426g.setItemHeight(dimensionPixelSize);
        this.f2426g.setLayoutManager(new LinearLayoutManager(this.b));
        this.f2426g.setAdapter(new C10574(this));
        C0595e.m810a(this.f2426g, new C05415(this));
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        if (i != 19) {
            if (i != 20) {
                return super.mo2081a(i, keyEvent);
            }
        }
        this.f2426g.m3149c(i);
        return true;
    }
}
