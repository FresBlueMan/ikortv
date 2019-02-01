package com.iptv2.p042a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iptv2.base.C1338a;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0595e;

/* compiled from: ExitDialog */
/* renamed from: com.iptv2.a.b */
public class C1350b extends C1338a {
    /* renamed from: e */
    private View f2361e;
    /* renamed from: f */
    private TextView f2362f;
    /* renamed from: g */
    private TextView f2363g;
    /* renamed from: h */
    private TextView f2364h;
    /* renamed from: i */
    private TextView f2365i;
    /* renamed from: j */
    private TextView f2366j;
    /* renamed from: k */
    private View f2367k;
    /* renamed from: l */
    private TextView f2368l;
    /* renamed from: m */
    private TextView f2369m;
    /* renamed from: n */
    private TextView f2370n;

    /* compiled from: ExitDialog */
    /* renamed from: com.iptv2.a.b$1 */
    class C04981 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1350b f518a;

        C04981(C1350b c1350b) {
            this.f518a = c1350b;
        }

        public void onClick(View view) {
            this.f518a.a.m1262d();
            System.exit(null);
        }
    }

    /* compiled from: ExitDialog */
    /* renamed from: com.iptv2.a.b$2 */
    class C04992 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1350b f519a;

        C04992(C1350b c1350b) {
            this.f519a = c1350b;
        }

        public void onClick(View view) {
            this.f519a.dismiss();
        }
    }

    /* compiled from: ExitDialog */
    /* renamed from: com.iptv2.a.b$3 */
    class C05003 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1350b f520a;

        C05003(C1350b c1350b) {
            this.f520a = c1350b;
        }

        public void onClick(View view) {
            this.f520a.dismiss();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.Dialog);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2361e = layoutInflater.inflate(R.layout.dialog_exit, viewGroup, false);
        this.f2362f = (TextView) this.f2361e.findViewById(R.id.title);
        this.f2362f.setText(this.a.f1251F.m1350e("quitAppTips"));
        this.f2363g = (TextView) this.f2361e.findViewById(R.id.btn_ok);
        this.f2363g.setText(this.a.f1251F.m1347b("buttonOk"));
        this.f2364h = (TextView) this.f2361e.findViewById(R.id.btn_cancel);
        this.f2364h.setText(this.a.f1251F.m1347b("buttonCancel"));
        this.f2370n = (TextView) this.f2361e.findViewById(R.id.text_serviceset);
        this.f2370n.setText(this.a.f1248C.f1284c.f1153l);
        this.f2365i = (TextView) this.f2361e.findViewById(R.id.lbl_username);
        this.f2365i.setText(this.a.f1251F.m1347b("userName"));
        this.f2366j = (TextView) this.f2361e.findViewById(R.id.text_username);
        String c = this.a.f1248C.m1308c();
        if ("tv".equals("bind-device") != null) {
            c = this.a.f1248C.m1308c().split("@")[0];
        }
        C0595e.m811a(this.f2366j, c, this.f2366j.getMaxWidth());
        this.f2367k = this.f2361e.findViewById(R.id.expiretime);
        this.f2368l = (TextView) this.f2361e.findViewById(R.id.lbl_expiretime);
        this.f2368l.setText(this.a.f1251F.m1347b("expireTime"));
        this.f2369m = (TextView) this.f2361e.findViewById(R.id.text_expiretime);
        if (this.a.f1248C.f1284c.f1152k == 3 || this.a.f1248C.f1284c.f1152k == 2) {
            this.f2367k.setVisibility(0);
            this.f2369m.setText(this.a.f1248C.m1314e());
        }
        this.f2363g.setOnClickListener(new C04981(this));
        this.f2364h.setOnClickListener(new C04992(this));
        this.f2361e.setOnClickListener(new C05003(this));
        return this.f2361e;
    }
}
