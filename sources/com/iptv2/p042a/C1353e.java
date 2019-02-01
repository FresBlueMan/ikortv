package com.iptv2.p042a;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.iptv2.base.C1338a;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.victor.loading.rotate.RotateLoading;

/* compiled from: SignInDialog */
/* renamed from: com.iptv2.a.e */
public class C1353e extends C1338a {
    /* renamed from: e */
    private View f2403e;
    /* renamed from: f */
    private View f2404f;
    /* renamed from: g */
    private RotateLoading f2405g;
    /* renamed from: h */
    private TextView f2406h;
    /* renamed from: i */
    private TextView f2407i;
    /* renamed from: j */
    private TextView f2408j;
    /* renamed from: k */
    private EditText f2409k;
    /* renamed from: l */
    private EditText f2410l;
    /* renamed from: m */
    private C0528a f2411m;
    /* renamed from: n */
    private boolean f2412n = false;

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$1 */
    class C05201 implements OnEditorActionListener {
        /* renamed from: a */
        final /* synthetic */ C1353e f556a;

        C05201(C1353e c1353e) {
            this.f556a = c1353e;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.f556a.a.f1270r.hideSoftInputFromWindow(textView.getWindowToken(), 0);
            this.f556a.m3041d();
            return true;
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$2 */
    class C05212 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1353e f557a;

        C05212(C1353e c1353e) {
            this.f557a = c1353e;
        }

        public void run() {
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f557a.f2404f.getWidth();
            c0592a.f646b = this.f557a.f2404f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f557a.a.m1258a(1.0f);
            c0592a.f653i = this.f557a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f557a.f2404f, c0592a);
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$3 */
    class C05223 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1353e f558a;

        C05223(C1353e c1353e) {
            this.f558a = c1353e;
        }

        public void onClick(View view) {
            this.f558a.m3041d();
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$4 */
    class C05234 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1353e f559a;

        C05234(C1353e c1353e) {
            this.f559a = c1353e;
        }

        public void onClick(View view) {
            this.f559a.f2411m.mo1353a();
            this.f559a.f2412n = true;
            this.f559a.dismiss();
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$5 */
    class C05245 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1353e f560a;

        C05245(C1353e c1353e) {
            this.f560a = c1353e;
        }

        public void onClick(View view) {
            if (this.f560a.f2411m.mo1358e() == null) {
                this.f560a.dismiss();
            }
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$6 */
    class C05256 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1353e f561a;

        C05256(C1353e c1353e) {
            this.f561a = c1353e;
        }

        public void run() {
            this.f561a.f2409k.requestFocus();
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$7 */
    class C05277 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1353e f563a;

        /* compiled from: SignInDialog */
        /* renamed from: com.iptv2.a.e$7$1 */
        class C05261 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C05277 f562a;

            C05261(C05277 c05277) {
                this.f562a = c05277;
            }

            public void run() {
                this.f562a.f563a.f2403e.setFocusable(false);
                this.f562a.f563a.f2409k.requestFocus();
            }
        }

        C05277(C1353e c1353e) {
            this.f563a = c1353e;
        }

        public void run() {
            this.f563a.f2403e.setFocusable(true);
            this.f563a.f2403e.requestFocus();
            this.f563a.a.f1263k.post(new C05261(this));
        }
    }

    /* compiled from: SignInDialog */
    /* renamed from: com.iptv2.a.e$a */
    public static class C0528a {
        /* renamed from: a */
        public void mo1353a() {
        }

        /* renamed from: a */
        public void mo1308a(String str, String str2, C0708c c0708c) {
        }

        /* renamed from: a */
        public void mo1354a(boolean z) {
        }

        /* renamed from: b */
        public boolean mo1355b() {
            return false;
        }

        /* renamed from: c */
        public String mo1356c() {
            return "";
        }

        /* renamed from: d */
        public String mo1357d() {
            return "";
        }

        /* renamed from: e */
        public boolean mo1358e() {
            return false;
        }
    }

    /* renamed from: a */
    public void m3054a(C0528a c0528a) {
        this.f2411m = c0528a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.EditDialog);
        if (this.f2411m == null) {
            this.f2411m = new C0528a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2403e = layoutInflater.inflate(R.layout.dialog_signin, viewGroup, false);
        this.f2404f = this.f2403e.findViewById(R.id.content);
        this.f2405g = (RotateLoading) this.f2403e.findViewById(R.id.loading);
        this.f2406h = (TextView) this.f2403e.findViewById(R.id.title);
        this.f2406h.setText(this.a.f1251F.m1347b("tabSignIn"));
        this.f2409k = (EditText) this.f2403e.findViewById(R.id.edit_username);
        layoutInflater = this.a.f1251F.m1347b("userName");
        viewGroup = new StringBuilder();
        viewGroup.append(layoutInflater);
        viewGroup.append(" Email");
        this.f2409k.setHint(viewGroup.toString());
        this.f2410l = (EditText) this.f2403e.findViewById(R.id.edit_password);
        this.f2410l.setHint(this.a.f1251F.m1347b("password"));
        this.f2410l.setOnEditorActionListener(new C05201(this));
        this.f2407i = (TextView) this.f2403e.findViewById(R.id.btn_ok);
        this.f2407i.setText(this.a.f1251F.m1347b("buttonSubmit"));
        this.f2408j = (TextView) this.f2403e.findViewById(R.id.btn_signup);
        this.f2408j.setText(this.a.f1251F.m1347b("tabSignUp"));
        C0595e.m810a(this.f2404f, new C05212(this));
        this.f2407i.setOnClickListener(new C05223(this));
        if (this.f2411m.mo1355b() != null) {
            this.f2408j.setVisibility(0);
            this.f2408j.setOnClickListener(new C05234(this));
        }
        this.f2409k.setText(this.f2411m.mo1356c());
        this.f2410l.setText(this.f2411m.mo1357d());
        this.f2403e.setOnClickListener(new C05245(this));
        if (Build.MODEL.contains("MagicBox") == null) {
            this.a.f1263k.post(new C05256(this));
        } else {
            C0591c.m790a(Build.MODEL);
            this.a.f1263k.post(new C05277(this));
        }
        return this.f2403e;
    }

    /* renamed from: c */
    private boolean m3039c() {
        C0591c.m791a("SignInDialog", "doValidate");
        String str = "";
        String trim = this.f2409k.getText().toString().trim();
        String trim2 = this.f2410l.getText().toString().trim();
        if (trim.isEmpty()) {
            str = this.a.f1251F.m1350e("userNameEmpty");
        } else if (!C0595e.m817b(trim)) {
            str = this.a.f1251F.m1350e("userNameNotEmail");
        } else if (trim2.isEmpty()) {
            str = this.a.f1251F.m1350e("passwordEmpty");
        }
        if (str.isEmpty()) {
            return true;
        }
        this.a.m1260a(str, 1);
        return false;
    }

    /* renamed from: d */
    private void m3041d() {
        C0591c.m791a("SignInDialog", "doSubmit");
        if (!this.f2405g.isStart()) {
            if (m3039c()) {
                final String trim = this.f2409k.getText().toString().trim();
                final String trim2 = this.f2410l.getText().toString().trim();
                this.f2405g.start();
                this.a.f1249D.m1249a(trim, trim2, false, new C0724a<C0708c>(this) {
                    /* renamed from: c */
                    final /* synthetic */ C1353e f1865c;

                    /* renamed from: a */
                    public void mo1314a(boolean z, C1184e<C0708c> c1184e, C0587a c0587a, Throwable th) {
                        this.f1865c.f2405g.stop();
                        if (this.f1865c.m2849b() == null) {
                            if (z) {
                                this.f1865c.a.m1260a(this.f1865c.a.f1251F.m1350e("signInSuccess"), 1);
                                this.f1865c.f2411m.mo1308a(trim, trim2, (C0708c) c1184e.f2086c);
                                this.f1865c.f2412n = true;
                                this.f1865c.dismiss();
                            } else {
                                if (c1184e != null) {
                                    if (c1184e.a) {
                                        if (c1184e.a.f1226a) {
                                            new C1349a().m2846a(this.f1865c.b);
                                        }
                                        this.f1865c.a.m1260a(c1184e.a.f1227b, 1);
                                    }
                                }
                                this.f1865c.a.m1260a(this.f1865c.a.f1251F.m1350e("connectError"), 1);
                            }
                        }
                    }
                });
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2411m.mo1354a(this.f2412n);
        super.onDismiss(dialogInterface);
    }
}
