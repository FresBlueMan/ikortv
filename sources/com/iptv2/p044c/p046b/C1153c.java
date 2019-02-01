package com.iptv2.p044c.p046b;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.ikortv.R;
import com.iptv2.p044c.C0667c;
import com.iptv2.p044c.p046b.C0653a.C0652a;

/* compiled from: VodMenuBarView */
/* renamed from: com.iptv2.c.b.c */
public class C1153c extends C0667c {
    /* renamed from: c */
    private C0653a f2017c;
    /* renamed from: d */
    private TextView f2018d;
    /* renamed from: e */
    private TextView f2019e;
    /* renamed from: f */
    private TextView f2020f;
    /* renamed from: g */
    private TextView f2021g;
    /* renamed from: h */
    private TextView f2022h;

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$1 */
    class C06591 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1153c f949a;

        C06591(C1153c c1153c) {
            this.f949a = c1153c;
        }

        public void onClick(View view) {
            this.f949a.m1100a(this.f949a.m1101a() ^ true);
            this.f949a.f2018d.setText(this.f949a.m1101a() ? R.string.icon_unlock : R.string.icon_lock);
            this.f949a.f2018d.setTextColor(ContextCompat.getColor(this.f949a.f2017c.f910b, this.f949a.m1101a() ? R.color.lock_checked_color : R.color.menubar_item_textcolor));
            if (this.f949a.m1101a() != null) {
                this.f949a.f2020f.setVisibility(8);
                this.f949a.f2019e.setVisibility(8);
                this.f949a.f2022h.setVisibility(8);
                this.f949a.f2021g.setVisibility(8);
                return;
            }
            this.f949a.f2020f.setVisibility(8);
            this.f949a.f2022h.setVisibility(0);
            this.f949a.f2021g.setVisibility(0);
            if (this.f949a.f2017c.f916h.f1125o.size() > 1) {
                this.f949a.f2019e.setVisibility(0);
            }
        }
    }

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$2 */
    class C06602 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1153c f950a;

        C06602(C1153c c1153c) {
            this.f950a = c1153c;
        }

        public void onClick(View view) {
            this.f950a.f2017c.f910b.m3309b();
        }
    }

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$3 */
    class C06613 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1153c f951a;

        C06613(C1153c c1153c) {
            this.f951a = c1153c;
        }

        public void onClick(View view) {
            this.f951a.f2017c.m1069a(this.f951a.f2017c.f916h, this.f951a.f2017c.f909a.f1248C.m1307b(this.f951a.f2017c.f916h) ^ 1);
            this.f951a.m2433e();
        }
    }

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$4 */
    class C06624 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1153c f952a;

        C06624(C1153c c1153c) {
            this.f952a = c1153c;
        }

        public void onClick(View view) {
            this.f952a.f2017c.f910b.mo2163a();
        }
    }

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$5 */
    class C06635 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1153c f953a;

        public void onClick(View view) {
        }

        C06635(C1153c c1153c) {
            this.f953a = c1153c;
        }
    }

    /* compiled from: VodMenuBarView */
    /* renamed from: com.iptv2.c.b.c$6 */
    class C11526 extends C0652a {
        /* renamed from: a */
        final /* synthetic */ C1153c f2016a;

        C11526(C1153c c1153c) {
            this.f2016a = c1153c;
        }

        /* renamed from: a */
        public void mo1374a(C0702m c0702m, boolean z) {
            this.f2016a.m2433e();
        }
    }

    public C1153c(C0653a c0653a, View view, View view2) {
        super(c0653a.f909a, view, view2);
        this.f2017c = c0653a;
        this.f2019e = (TextView) view.findViewById(R.id.menu_list);
        this.f2022h = (TextView) view.findViewById(R.id.menu_favorite);
        this.f2018d = (TextView) view.findViewById(R.id.menu_lock);
        this.f2020f = (TextView) view2.findViewById(R.id.menu_share);
        this.f2021g = (TextView) view2.findViewById(R.id.menu_setting);
        this.f2020f.setVisibility(8);
        this.f2018d.setOnClickListener(new C06591(this));
        this.f2019e.setOnClickListener(new C06602(this));
        this.f2022h.setOnClickListener(new C06613(this));
        this.f2021g.setOnClickListener(new C06624(this));
        this.f2020f.setOnClickListener(new C06635(this));
        this.f2017c.m1068a(new C11526(this));
    }

    /* renamed from: e */
    private void m2433e() {
        boolean b = this.f2017c.f909a.f1248C.m1307b(this.f2017c.f916h);
        this.f2022h.setText(b ? R.string.icon_favorite_checked : R.string.icon_favorite);
        this.f2022h.setTextColor(ContextCompat.getColor(this.f2017c.f910b, b ? R.color.favorite_checked_color : R.color.menubar_item_textcolor));
    }

    /* renamed from: d */
    public void m2436d() {
        this.f2019e.setVisibility(this.f2017c.f916h.f1125o.size() > 1 ? 0 : 8);
        m2433e();
    }
}
