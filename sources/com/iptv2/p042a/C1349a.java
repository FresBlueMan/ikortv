package com.iptv2.p042a;

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
import com.iptv2.p042a.C1351c.C0507a;
import com.iptv2.p042a.C1351c.C0509c;
import com.iptv2.p042a.C1351c.C0510d;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.victor.loading.rotate.RotateLoading;
import java.text.MessageFormat;

/* compiled from: AuthDialog */
/* renamed from: com.iptv2.a.a */
public class C1349a extends C1338a {
    /* renamed from: e */
    private View f2353e;
    /* renamed from: f */
    private View f2354f;
    /* renamed from: g */
    private RotateLoading f2355g;
    /* renamed from: h */
    private TextView f2356h;
    /* renamed from: i */
    private TextView f2357i;
    /* renamed from: j */
    private EditText f2358j;
    /* renamed from: k */
    private int f2359k;
    /* renamed from: l */
    private C0497a f2360l;

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$1 */
    class C04901 implements OnEditorActionListener {
        /* renamed from: a */
        final /* synthetic */ C1349a f511a;

        C04901(C1349a c1349a) {
            this.f511a = c1349a;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.f511a.a.f1270r.hideSoftInputFromWindow(textView.getWindowToken(), 0);
            this.f511a.m2949d();
            return true;
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$2 */
    class C04912 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1349a f512a;

        C04912(C1349a c1349a) {
            this.f512a = c1349a;
        }

        public void run() {
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f512a.f2354f.getWidth();
            c0592a.f646b = this.f512a.f2354f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f512a.a.m1258a(1.0f);
            c0592a.f653i = this.f512a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f512a.f2354f, c0592a);
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$3 */
    class C04923 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1349a f513a;

        C04923(C1349a c1349a) {
            this.f513a = c1349a;
        }

        public void onClick(View view) {
            this.f513a.m2949d();
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$4 */
    class C04934 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1349a f514a;

        C04934(C1349a c1349a) {
            this.f514a = c1349a;
        }

        public void onClick(View view) {
            if (this.f514a.f2360l.mo1348a() == null) {
                this.f514a.dismiss();
            }
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$5 */
    class C04945 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1349a f515a;

        C04945(C1349a c1349a) {
            this.f515a = c1349a;
        }

        public void run() {
            this.f515a.f2358j.requestFocus();
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$6 */
    class C04966 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1349a f517a;

        /* compiled from: AuthDialog */
        /* renamed from: com.iptv2.a.a$6$1 */
        class C04951 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C04966 f516a;

            C04951(C04966 c04966) {
                this.f516a = c04966;
            }

            public void run() {
                this.f516a.f517a.f2353e.setFocusable(false);
                this.f516a.f517a.f2358j.requestFocus();
            }
        }

        C04966(C1349a c1349a) {
            this.f517a = c1349a;
        }

        public void run() {
            this.f517a.f2353e.setFocusable(true);
            this.f517a.f2353e.requestFocus();
            this.f517a.a.f1263k.post(new C04951(this));
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$a */
    public static class C0497a {
        /* renamed from: a */
        public boolean mo1348a() {
            return false;
        }
    }

    /* compiled from: AuthDialog */
    /* renamed from: com.iptv2.a.a$7 */
    class C10487 implements C0725b {
        /* renamed from: a */
        final /* synthetic */ C1349a f1855a;

        /* compiled from: AuthDialog */
        /* renamed from: com.iptv2.a.a$7$1 */
        class C10471 extends C0510d {
            /* renamed from: a */
            final /* synthetic */ C10487 f1854a;

            C10471(C10487 c10487) {
                this.f1854a = c10487;
            }

            /* renamed from: a */
            public void mo1306a(C1351c c1351c, C0509c c0509c) {
                this.f1854a.f1855a.a.f1248C.f1284c = null;
                this.f1854a.f1855a.a.f1248C.f1285d = null;
                this.f1854a.f1855a.a.m1259a(this.f1854a.f1855a.b);
            }
        }

        C10487(C1349a c1349a) {
            this.f1855a = c1349a;
        }

        /* renamed from: a */
        public void mo1307a(boolean z, C0726c c0726c, C0587a c0587a, Throwable th) {
            this.f1855a.f2355g.stop();
            if (this.f1855a.m2849b() == null) {
                if (z) {
                    z = new C0507a();
                    z.f527a = this.f1855a.a.f1251F.m1350e("authSuccess");
                    z.f529c = this.f1855a.a.f1251F.m1347b("buttonOk");
                    C1351c.m2970a(this.f1855a.b, z, new C10471(this));
                } else {
                    if (c0726c != null) {
                        if (c0726c.f1224a != null) {
                            this.f1855a.a.m1260a(c0726c.f1224a.f1227b, 1);
                        }
                    }
                    this.f1855a.a.m1260a(this.f1855a.a.f1251F.m1350e("connectError"), 1);
                }
            }
        }
    }

    /* renamed from: a */
    public void m2966a(C0497a c0497a) {
        this.f2360l = c0497a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.EditDialog);
        this.f2359k = this.a.f1265m.getInteger(R.integer.authcode_length);
        if (this.f2360l == null) {
            this.f2360l = new C0497a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2353e = layoutInflater.inflate(R.layout.dialog_auth, viewGroup, false);
        this.f2354f = this.f2353e.findViewById(R.id.content);
        this.f2355g = (RotateLoading) this.f2353e.findViewById(R.id.loading);
        this.f2356h = (TextView) this.f2353e.findViewById(R.id.title);
        this.f2356h.setText(this.a.f1251F.m1347b("tabAuth"));
        this.f2358j = (EditText) this.f2353e.findViewById(R.id.edit_authcode);
        this.f2358j.setHint(this.a.f1251F.m1347b("authCode"));
        this.f2358j.setOnEditorActionListener(new C04901(this));
        this.f2357i = (TextView) this.f2353e.findViewById(R.id.btn_ok);
        this.f2357i.setText(this.a.f1251F.m1347b("buttonSubmit"));
        C0595e.m810a(this.f2354f, new C04912(this));
        this.f2357i.setOnClickListener(new C04923(this));
        this.f2353e.setOnClickListener(new C04934(this));
        if (Build.MODEL.contains("MagicBox") == null) {
            this.a.f1263k.post(new C04945(this));
        } else {
            C0591c.m790a(Build.MODEL);
            this.a.f1263k.post(new C04966(this));
        }
        return this.f2353e;
    }

    /* renamed from: c */
    private boolean m2947c() {
        C0591c.m791a("AuthDialog", "doValidate");
        String str = "";
        String trim = this.f2358j.getText().toString().trim();
        if (trim.equals("")) {
            str = this.a.f1251F.m1350e("authCodeEmpty");
        } else if (trim.length() != this.f2359k) {
            str = MessageFormat.format(this.a.f1251F.m1350e("authCodeLengthError"), new Object[]{Integer.valueOf(this.f2359k)});
        }
        if (str.isEmpty()) {
            return true;
        }
        this.a.m1260a(str, 1);
        return false;
    }

    /* renamed from: d */
    private void m2949d() {
        C0591c.m791a("AuthDialog", "doSubmit");
        if (!this.f2355g.isStart()) {
            if (m2947c()) {
                String trim = this.f2358j.getText().toString().trim();
                this.f2355g.start();
                this.a.f1249D.m1247a(trim, new C10487(this));
            }
        }
    }
}
