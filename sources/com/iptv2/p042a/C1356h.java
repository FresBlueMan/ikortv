package com.iptv2.p042a;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.FileProvider;
import android.support.v4.view.ViewCompat;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.C1338a;
import com.iptv2.core.Application;
import com.iptv2.core.DataEntity.C0701l;
import com.iptv2.ikortv.R;
import com.iptv2.p042a.C1351c.C0507a;
import com.iptv2.p042a.C1351c.C0508b;
import com.iptv2.p042a.C1351c.C0509c;
import com.iptv2.p042a.C1351c.C0510d;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0593d;
import com.iptv2.p043b.C0593d.C0592a;
import com.iptv2.p043b.C0595e;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.RequestHandle;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.victor.loading.rotate.RotateLoading;
import java.io.File;
import p000a.p001a.p002a.p003a.C0082e;

/* compiled from: UpgradeDialog */
/* renamed from: com.iptv2.a.h */
public class C1356h extends C1338a {
    /* renamed from: e */
    private View f2431e;
    /* renamed from: f */
    private View f2432f;
    /* renamed from: g */
    private TextView f2433g;
    /* renamed from: h */
    private TextView f2434h;
    /* renamed from: i */
    private C0701l f2435i;
    /* renamed from: j */
    private TextView f2436j;
    /* renamed from: k */
    private TextView f2437k;
    /* renamed from: l */
    private View f2438l;
    /* renamed from: m */
    private RotateLoading f2439m;
    /* renamed from: n */
    private TextView f2440n;
    /* renamed from: o */
    private int f2441o = 0;
    /* renamed from: p */
    private int f2442p;
    /* renamed from: q */
    private File f2443q;
    /* renamed from: r */
    private AsyncHttpClient f2444r;
    /* renamed from: s */
    private RequestHandle f2445s;
    /* renamed from: t */
    private C0549a f2446t = C0549a.None;
    /* renamed from: u */
    private C0550b f2447u;
    /* renamed from: v */
    private boolean f2448v = false;

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$1 */
    class C05441 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ C1356h f578a;

        C05441(C1356h c1356h) {
            this.f578a = c1356h;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != null || (i != 23 && i != 66)) {
                return null;
            }
            view = this.f578a.f2434h.focusSearch(130);
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$2 */
    class C05452 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1356h f579a;

        C05452(C1356h c1356h) {
            this.f579a = c1356h;
        }

        public void onClick(View view) {
            if (this.f579a.f2436j.isEnabled() != null) {
                this.f579a.f2436j.setFocusable(false);
                this.f579a.f2436j.setEnabled(false);
                this.f579a.f2441o = 0;
                this.f579a.m3094c();
            }
        }
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$3 */
    class C05463 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1356h f580a;

        /* compiled from: UpgradeDialog */
        /* renamed from: com.iptv2.a.h$3$1 */
        class C10581 extends C0510d {
            /* renamed from: a */
            final /* synthetic */ C05463 f1870a;

            C10581(C05463 c05463) {
                this.f1870a = c05463;
            }

            /* renamed from: a */
            public void mo1306a(C1351c c1351c, C0509c c0509c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onDialogResult ");
                stringBuilder.append(c0509c);
                C0591c.m791a("UpgradeDialog", stringBuilder.toString());
                if (c0509c == C0509c.Button1) {
                    this.f1870a.f580a.f2446t = C0549a.Cancel;
                    this.f1870a.f580a.dismiss();
                }
            }
        }

        C05463(C1356h c1356h) {
            this.f580a = c1356h;
        }

        public void onClick(View view) {
            view = new C0507a();
            view.f527a = this.f580a.a.f1251F.m1350e("quitAppTips");
            view.f529c = this.f580a.a.f1251F.m1347b("buttonOk");
            view.f530d = this.f580a.a.f1251F.m1347b("buttonCancel");
            view.f534h = C0508b.Button2;
            C1351c.m2970a(this.f580a.b, view, new C10581(this));
        }
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$4 */
    class C05474 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1356h f581a;

        C05474(C1356h c1356h) {
            this.f581a = c1356h;
        }

        public void run() {
            C0592a c0592a = new C0592a();
            c0592a.f645a = this.f581a.f2432f.getWidth();
            c0592a.f646b = this.f581a.f2432f.getHeight();
            c0592a.f647c = Color.parseColor("#bababa");
            c0592a.f651g = this.f581a.a.m1258a(1.0f);
            c0592a.f653i = this.f581a.a.m1258a(4.0f);
            c0592a.f648d = ViewCompat.MEASURED_STATE_MASK;
            c0592a.f649e = ViewCompat.MEASURED_STATE_MASK;
            C0593d.m797a(this.f581a.f2432f, c0592a);
        }
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$a */
    public enum C0549a {
        None,
        Cancel
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$b */
    public interface C0550b {
        /* renamed from: a */
        void mo1347a(C0549a c0549a);
    }

    /* compiled from: UpgradeDialog */
    /* renamed from: com.iptv2.a.h$5 */
    class C10595 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C1356h f1871a;

        C10595(C1356h c1356h) {
            this.f1871a = c1356h;
        }

        public void onStop() {
            if (!this.f1871a.f2448v) {
                this.f1871a.f2438l.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    public void m3119a(C0550b c0550b) {
        this.f2447u = c0550b;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Dialog);
        setCancelable(false);
        this.f2435i = this.a.f1248C.f1286e;
        this.f2444r = new AsyncHttpClient();
        this.f2444r.setTimeout(BaseImageDownloader.DEFAULT_HTTP_READ_TIMEOUT);
        this.f2443q = new File(this.a.f1260a.getCacheDir(), "ikor.apk");
        this.f2442p = this.f2435i.f1108a.length * 3;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2431e = layoutInflater.inflate(R.layout.dialog_upgrade, viewGroup, false);
        this.f2432f = this.f2431e.findViewById(R.id.content);
        this.f2433g = (TextView) this.f2431e.findViewById(R.id.title);
        this.f2433g.setText(this.a.f1251F.m1350e("upgradeFoundNewVersion"));
        this.f2438l = this.f2431e.findViewById(R.id.loading_wrapper);
        this.f2439m = (RotateLoading) this.f2431e.findViewById(R.id.loading);
        this.f2439m.start();
        this.f2440n = (TextView) this.f2431e.findViewById(R.id.loading_progress);
        this.f2436j = (TextView) this.f2431e.findViewById(R.id.btn_upgrade);
        this.f2436j.setText(this.a.f1251F.m1347b("buttonUpgrade"));
        this.f2437k = (TextView) this.f2431e.findViewById(R.id.btn_exit);
        this.f2437k.setText(this.a.f1251F.m1347b("buttonExit"));
        this.f2434h = (TextView) this.f2431e.findViewById(R.id.info);
        this.f2434h.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f2434h.setOnKeyListener(new C05441(this));
        if (this.f2435i.f1110c.isEmpty() != null) {
            this.f2434h.setVisibility(8);
        } else {
            this.f2434h.setText(this.f2435i.f1110c);
        }
        this.f2436j.setOnClickListener(new C05452(this));
        this.f2437k.setOnClickListener(new C05463(this));
        C0595e.m810a(this.f2432f, new C05474(this));
        this.f2436j.requestFocus();
        return this.f2431e;
    }

    /* renamed from: a */
    private void m3092a(boolean z) {
        if (this.f2448v != z) {
            this.f2448v = z;
            this.f2438l.setVisibility(0);
            if (z) {
                ViewAnimator.animate(new View[]{this.f2438l}).alpha(0.0f, 1.0f).duration(200).start();
            } else {
                ViewAnimator.animate(new View[]{this.f2438l}).alpha(1.0f, 0.0f).duration(200).onStop(new C10595(this)).start();
            }
        }
    }

    /* renamed from: c */
    private void m3094c() {
        String str = this.f2435i.f1108a[(this.f2441o / 3) % this.f2435i.f1108a.length];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("doUpgrade ");
        stringBuilder.append(str);
        C0591c.m791a("UpgradeDialog", stringBuilder.toString());
        m3092a(true);
        this.f2440n.setText("0%");
        this.f2445s = this.f2444r.get(str, new FileAsyncHttpResponseHandler(this, this.f2443q) {
            /* renamed from: a */
            final /* synthetic */ C1356h f2301a;
            /* renamed from: b */
            private boolean f2302b = null;

            /* compiled from: UpgradeDialog */
            /* renamed from: com.iptv2.a.h$6$1 */
            class C05481 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C13336 f582a;

                C05481(C13336 c13336) {
                    this.f582a = c13336;
                }

                public void run() {
                    if (!this.f582a.f2301a.m2847a()) {
                        this.f582a.f2301a.m3094c();
                    }
                }
            }

            public void onPreProcessResponse(com.loopj.android.http.ResponseHandlerInterface r1, p000a.p001a.p002a.p003a.C0916s r2) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
                /*
                r0 = this;
                r1 = r2.mo1628a();	 Catch:{ Exception -> 0x000f }
                r1 = r1.mo147b();	 Catch:{ Exception -> 0x000f }
                r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ Exception -> 0x000f }
                if (r1 != r2) goto L_0x000f;	 Catch:{ Exception -> 0x000f }
            L_0x000c:
                r1 = 1;	 Catch:{ Exception -> 0x000f }
                r0.f2302b = r1;	 Catch:{ Exception -> 0x000f }
            L_0x000f:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.iptv2.a.h.6.onPreProcessResponse(com.loopj.android.http.ResponseHandlerInterface, a.a.a.a.s):void");
            }

            public void onFailure(int i, C0082e[] c0082eArr, Throwable th, File file) {
                C0591c.m791a("UpgradeDialog", "doUpgrade onFailure");
                if (this.f2301a.m2847a() == 0) {
                    this.f2301a.f2441o = this.f2301a.f2441o + 1;
                    if (this.f2301a.f2441o <= this.f2301a.f2442p) {
                        C0591c.m791a("UpgradeDialog", "doUpgrade delay retry");
                        this.f2301a.a.f1263k.postDelayed(new C05481(this), 3000);
                    } else {
                        this.f2301a.a.m1260a(this.f2301a.a.f1251F.m1350e("upgradeDownloadError"), 1);
                        this.f2301a.m3092a((boolean) null);
                        this.f2301a.f2436j.setFocusable(true);
                        this.f2301a.f2436j.setEnabled(true);
                        this.f2301a.f2436j.requestFocus();
                    }
                }
            }

            public void onProgress(long j, long j2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("doUpgrade onProgress ");
                stringBuilder.append(j);
                stringBuilder.append(" ");
                stringBuilder.append(j2);
                C0591c.m791a("UpgradeDialog", stringBuilder.toString());
                if (this.f2302b) {
                    j = (((float) j) * 100.0f) / ((float) j2);
                    this.f2301a.f2440n.setText(String.format("%.1f%%", new Object[]{Float.valueOf(j)}));
                }
            }

            public void onSuccess(int i, C0082e[] c0082eArr, File file) {
                C0591c.m791a("UpgradeDialog", "doUpgrade onSuccess");
                if (this.f2301a.m2847a() == 0) {
                    this.f2301a.m3092a(false);
                    this.f2301a.f2436j.setFocusable(true);
                    this.f2301a.f2436j.setEnabled(true);
                    this.f2301a.f2443q.setReadable(true, false);
                    i = C0595e.m805a(this.f2301a.f2443q);
                    if (Application.f1063b != null) {
                        i = "";
                    }
                    if (i == 0 || i.toUpperCase().equals(this.f2301a.f2435i.f1109b.toUpperCase()) == 0) {
                        this.f2301a.a.m1260a(this.f2301a.a.f1251F.m1350e("upgradeCheckDataError"), 1);
                        this.f2301a.f2436j.requestFocus();
                    } else {
                        this.f2301a.a.m1260a(this.f2301a.a.f1251F.m1350e("upgradeDownloadSuccess"), 1);
                        try {
                            if (VERSION.SDK_INT >= 24) {
                                i = FileProvider.getUriForFile(this.f2301a.getContext(), "com.iptv2.ikortv.fileProvider", this.f2301a.f2443q);
                                c0082eArr = new Intent("android.intent.action.VIEW");
                                c0082eArr.setDataAndType(i, "application/vnd.android.package-archive");
                                c0082eArr.addFlags(268435456);
                                c0082eArr.addFlags(1);
                                this.f2301a.b.startActivity(c0082eArr);
                            } else {
                                i = new Intent("android.intent.action.VIEW");
                                i.setDataAndType(Uri.fromFile(this.f2301a.f2443q), "application/vnd.android.package-archive");
                                this.f2301a.b.startActivity(i);
                            }
                        } catch (int i2) {
                            C0591c.m792a("UpgradeDialog", "Install Apk", i2);
                        }
                    }
                }
            }
        });
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f2447u != null) {
            this.f2447u.mo1347a(this.f2446t);
        }
    }

    public void onDestroy() {
        if (this.f2445s != null) {
            this.f2445s.cancel(true);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.mo2081a(i, keyEvent);
        }
        this.f2437k.performClick();
        return true;
    }
}
