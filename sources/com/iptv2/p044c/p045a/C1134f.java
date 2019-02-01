package com.iptv2.p044c.p045a;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.ikortv.R;
import com.iptv2.p044c.C0667c;
import com.iptv2.p044c.p045a.C0626b.C0622a;
import com.iptv2.p044c.p045a.C0626b.C0624c;

/* compiled from: LiveMenuBarView */
/* renamed from: com.iptv2.c.a.f */
public class C1134f extends C0667c {
    /* renamed from: c */
    private C0626b f1991c;
    /* renamed from: d */
    private TextView f1992d;
    /* renamed from: e */
    private TextView f1993e;
    /* renamed from: f */
    private TextView f1994f;
    /* renamed from: g */
    private TextView f1995g;
    /* renamed from: h */
    private TextView f1996h;

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$1 */
    class C06401 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1134f f872a;

        C06401(C1134f c1134f) {
            this.f872a = c1134f;
        }

        public void onClick(View view) {
            this.f872a.m1100a(this.f872a.m1101a() ^ 1);
            this.f872a.f1992d.setText(this.f872a.m1101a() ? R.string.icon_unlock : R.string.icon_lock);
            this.f872a.f1992d.setTextColor(ContextCompat.getColor(this.f872a.f1991c.f754b, this.f872a.m1101a() ? R.color.lock_checked_color : R.color.menubar_item_textcolor));
            if (this.f872a.m1101a() != null) {
                this.f872a.f1994f.setVisibility(8);
                this.f872a.f1993e.setVisibility(8);
                this.f872a.f1996h.setVisibility(8);
                this.f872a.f1995g.setVisibility(8);
                return;
            }
            this.f872a.f1994f.setVisibility(8);
            this.f872a.f1993e.setVisibility(0);
            this.f872a.f1996h.setVisibility(0);
            this.f872a.f1995g.setVisibility(0);
        }
    }

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$2 */
    class C06412 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1134f f873a;

        C06412(C1134f c1134f) {
            this.f873a = c1134f;
        }

        public void onClick(View view) {
            this.f873a.f1991c.f755c.m1025c();
        }
    }

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$3 */
    class C06423 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1134f f874a;

        C06423(C1134f c1134f) {
            this.f874a = c1134f;
        }

        public void onClick(View view) {
            this.f874a.f1991c.m913a(this.f874a.f1991c.f762j, this.f874a.f1991c.f753a.f1248C.m1301a(this.f874a.f1991c.f762j) ^ 1);
            this.f874a.m2396d();
        }
    }

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$4 */
    class C06434 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1134f f875a;

        C06434(C1134f c1134f) {
            this.f875a = c1134f;
        }

        public void onClick(View view) {
            this.f875a.f1991c.f754b.mo2163a();
        }
    }

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$5 */
    class C06445 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1134f f876a;

        public void onClick(View view) {
        }

        C06445(C1134f c1134f) {
            this.f876a = c1134f;
        }
    }

    /* compiled from: LiveMenuBarView */
    /* renamed from: com.iptv2.c.a.f$6 */
    class C11336 extends C0622a {
        /* renamed from: a */
        final /* synthetic */ C1134f f1990a;

        C11336(C1134f c1134f) {
            this.f1990a = c1134f;
        }

        /* renamed from: a */
        public void mo1360a(C0624c c0624c) {
            this.f1990a.m2396d();
        }

        /* renamed from: a */
        public void mo1361a(C0693b c0693b, boolean z) {
            this.f1990a.m2396d();
        }
    }

    public C1134f(C0626b c0626b, View view, View view2) {
        super(c0626b.f753a, view, view2);
        this.f1991c = c0626b;
        this.f1993e = (TextView) view.findViewById(R.id.menu_list);
        this.f1996h = (TextView) view.findViewById(R.id.menu_favorite);
        this.f1992d = (TextView) view.findViewById(R.id.menu_lock);
        this.f1994f = (TextView) view2.findViewById(R.id.menu_share);
        this.f1995g = (TextView) view2.findViewById(R.id.menu_setting);
        this.f1994f.setVisibility(8);
        this.f1992d.setOnClickListener(new C06401(this));
        this.f1993e.setOnClickListener(new C06412(this));
        this.f1996h.setOnClickListener(new C06423(this));
        this.f1995g.setOnClickListener(new C06434(this));
        this.f1994f.setOnClickListener(new C06445(this));
        this.f1991c.m910a(new C11336(this));
    }

    /* renamed from: d */
    private void m2396d() {
        boolean a = this.f1991c.f753a.f1248C.m1301a(this.f1991c.f762j);
        this.f1996h.setText(a ? R.string.icon_favorite_checked : R.string.icon_favorite);
        this.f1996h.setTextColor(ContextCompat.getColor(this.f1991c.f754b, a ? R.color.favorite_checked_color : R.color.menubar_item_textcolor));
    }
}
