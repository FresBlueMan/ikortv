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
import com.iptv2.core.C0728b.C0725b;
import com.iptv2.core.C0728b.C0726c;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.victor.loading.rotate.RotateLoading;

/* compiled from: SignUpDialog */
/* renamed from: com.iptv2.a.f */
public class C1354f extends C1338a {
    /* renamed from: e */
    private View f2413e;
    /* renamed from: f */
    private View f2414f;
    /* renamed from: g */
    private RotateLoading f2415g;
    /* renamed from: h */
    private TextView f2416h;
    /* renamed from: i */
    private TextView f2417i;
    /* renamed from: j */
    private TextView f2418j;
    /* renamed from: k */
    private EditText f2419k;
    /* renamed from: l */
    private EditText f2420l;
    /* renamed from: m */
    private EditText f2421m;
    /* renamed from: n */
    private C0537a f2422n;
    /* renamed from: o */
    private boolean f2423o = false;

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$1 */
    class C05291 implements OnEditorActionListener {
        /* renamed from: a */
        final /* synthetic */ C1354f f564a;

        C05291(C1354f c1354f) {
            this.f564a = c1354f;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.f564a.a.f1270r.hideSoftInputFromWindow(textView.getWindowToken(), 0);
            this.f564a.m3061d();
            return true;
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$2 */
    class C05302 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1354f f565a;

        C05302(C1354f c1354f) {
            this.f565a = c1354f;
        }

        public void run() {
            C0591c.m791a("SignUpDialog", "create content bg");
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f565a.f2414f.getWidth();
            c0592a.f646b = this.f565a.f2414f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f565a.a.m1258a(1.0f);
            c0592a.f653i = this.f565a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f565a.f2414f, c0592a);
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$3 */
    class C05313 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1354f f566a;

        C05313(C1354f c1354f) {
            this.f566a = c1354f;
        }

        public void onClick(View view) {
            this.f566a.m3061d();
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$4 */
    class C05324 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1354f f567a;

        C05324(C1354f c1354f) {
            this.f567a = c1354f;
        }

        public void onClick(View view) {
            this.f567a.f2422n.mo1349a();
            this.f567a.f2423o = true;
            this.f567a.dismiss();
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$5 */
    class C05335 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1354f f568a;

        C05335(C1354f c1354f) {
            this.f568a = c1354f;
        }

        public void onClick(View view) {
            if (this.f568a.f2422n.mo1352c() == null) {
                this.f568a.dismiss();
            }
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$6 */
    class C05346 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1354f f569a;

        C05346(C1354f c1354f) {
            this.f569a = c1354f;
        }

        public void run() {
            this.f569a.f2419k.requestFocus();
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$7 */
    class C05367 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1354f f571a;

        /* compiled from: SignUpDialog */
        /* renamed from: com.iptv2.a.f$7$1 */
        class C05351 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C05367 f570a;

            C05351(C05367 c05367) {
                this.f570a = c05367;
            }

            public void run() {
                this.f570a.f571a.f2413e.setFocusable(false);
                this.f570a.f571a.f2419k.requestFocus();
            }
        }

        C05367(C1354f c1354f) {
            this.f571a = c1354f;
        }

        public void run() {
            this.f571a.f2413e.setFocusable(true);
            this.f571a.f2413e.requestFocus();
            this.f571a.a.f1263k.post(new C05351(this));
        }
    }

    /* compiled from: SignUpDialog */
    /* renamed from: com.iptv2.a.f$a */
    public static class C0537a {
        /* renamed from: a */
        public void mo1349a() {
        }

        /* renamed from: a */
        public void mo1309a(String str, String str2) {
        }

        /* renamed from: a */
        public void mo1350a(boolean z) {
        }

        /* renamed from: b */
        public boolean mo1351b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo1352c() {
            return false;
        }
    }

    /* renamed from: a */
    public void m3073a(C0537a c0537a) {
        this.f2422n = c0537a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.EditDialog);
        if (this.f2422n == null) {
            this.f2422n = new C0537a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2413e = layoutInflater.inflate(R.layout.dialog_signup, viewGroup, false);
        this.f2414f = this.f2413e.findViewById(R.id.content);
        this.f2415g = (RotateLoading) this.f2413e.findViewById(R.id.loading);
        this.f2416h = (TextView) this.f2413e.findViewById(R.id.title);
        this.f2416h.setText(this.a.f1251F.m1347b("tabSignUp"));
        this.f2419k = (EditText) this.f2413e.findViewById(R.id.edit_username);
        layoutInflater = this.a.f1251F.m1347b("userName");
        viewGroup = new StringBuilder();
        viewGroup.append(layoutInflater);
        viewGroup.append(" Email");
        this.f2419k.setHint(viewGroup.toString());
        this.f2420l = (EditText) this.f2413e.findViewById(R.id.edit_password);
        this.f2420l.setHint(this.a.f1251F.m1347b("password"));
        this.f2421m = (EditText) this.f2413e.findViewById(R.id.edit_password2);
        this.f2421m.setHint(this.a.f1251F.m1347b("passwordConfirm"));
        this.f2421m.setOnEditorActionListener(new C05291(this));
        this.f2417i = (TextView) this.f2413e.findViewById(R.id.btn_ok);
        this.f2417i.setText(this.a.f1251F.m1347b("buttonSubmit"));
        this.f2418j = (TextView) this.f2413e.findViewById(R.id.btn_signin);
        this.f2418j.setText(this.a.f1251F.m1347b("tabSignIn"));
        C0595e.m810a(this.f2414f, new C05302(this));
        this.f2417i.setOnClickListener(new C05313(this));
        if (this.f2422n.mo1351b() != null) {
            this.f2418j.setVisibility(0);
            this.f2418j.setOnClickListener(new C05324(this));
        }
        this.f2413e.setOnClickListener(new C05335(this));
        if (Build.MODEL.contains("MagicBox") == null) {
            this.a.f1263k.post(new C05346(this));
        } else {
            C0591c.m790a(Build.MODEL);
            this.a.f1263k.post(new C05367(this));
        }
        return this.f2413e;
    }

    /* renamed from: c */
    private boolean m3059c() {
        C0591c.m791a("SignUpDialog", "doValidate");
        String str = "";
        String trim = this.f2419k.getText().toString().trim();
        String trim2 = this.f2420l.getText().toString().trim();
        String trim3 = this.f2421m.getText().toString().trim();
        if (trim.isEmpty()) {
            str = this.a.f1251F.m1350e("userNameEmpty");
        } else if (!C0595e.m817b(trim)) {
            str = this.a.f1251F.m1350e("userNameNotEmail");
        } else if (trim2.isEmpty()) {
            str = this.a.f1251F.m1350e("passwordEmpty");
        } else if (trim3.isEmpty()) {
            str = this.a.f1251F.m1350e("passwordConfirmEmpty");
        } else if (!trim2.equals(trim3)) {
            str = this.a.f1251F.m1350e("passwordNotMatch");
        }
        if (str.isEmpty()) {
            return true;
        }
        this.a.m1260a(str, 1);
        return false;
    }

    /* renamed from: d */
    private void m3061d() {
        C0591c.m791a("SignUpDialog", "doSubmit");
        if (!this.f2415g.isStart()) {
            if (m3059c()) {
                final String trim = this.f2419k.getText().toString().trim();
                final String trim2 = this.f2420l.getText().toString().trim();
                this.f2415g.start();
                this.a.f1249D.m1248a(trim, trim2, new C0725b(this) {
                    /* renamed from: c */
                    final /* synthetic */ C1354f f1868c;

                    /* renamed from: a */
                    public void mo1307a(boolean z, C0726c c0726c, C0587a c0587a, Throwable th) {
                        this.f1868c.f2415g.stop();
                        if (this.f1868c.m2849b() == null) {
                            if (z) {
                                this.f1868c.a.m1260a(this.f1868c.a.f1251F.m1350e("signUpSuccess"), 1);
                                this.f1868c.f2422n.mo1309a(trim, trim2);
                                this.f1868c.f2423o = true;
                                this.f1868c.dismiss();
                            } else {
                                if (c0726c != null) {
                                    if (c0726c.f1224a) {
                                        this.f1868c.a.m1260a(c0726c.f1224a.f1227b, 1);
                                    }
                                }
                                this.f1868c.a.m1260a(this.f1868c.a.f1251F.m1350e("connectError"), 1);
                            }
                        }
                    }
                });
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2422n.mo1350a(this.f2423o);
        super.onDismiss(dialogInterface);
    }
}
