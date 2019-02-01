package com.iptv2.p042a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.iptv2.base.Activity;
import com.iptv2.base.C1338a;
import com.iptv2.ikortv.R;

/* compiled from: MessageBox */
/* renamed from: com.iptv2.a.c */
public class C1351c extends C1338a {
    /* renamed from: e */
    private View f2371e;
    /* renamed from: f */
    private TextView f2372f;
    /* renamed from: g */
    private TextView f2373g;
    /* renamed from: h */
    private TextView f2374h;
    /* renamed from: i */
    private TextView f2375i;
    /* renamed from: j */
    private TextView f2376j;
    /* renamed from: k */
    private TextView f2377k;
    /* renamed from: l */
    private EditText f2378l;
    /* renamed from: m */
    private boolean f2379m;
    /* renamed from: n */
    private C0509c f2380n = C0509c.None;
    /* renamed from: o */
    private C0510d f2381o;
    /* renamed from: p */
    private C0507a f2382p;
    /* renamed from: q */
    private int f2383q;
    /* renamed from: r */
    private Runnable f2384r = new C05066(this);

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$1 */
    class C05011 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1351c f521a;

        C05011(C1351c c1351c) {
            this.f521a = c1351c;
        }

        public void onClick(View view) {
            this.f521a.f2380n = C0509c.Button1;
            this.f521a.dismiss();
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$2 */
    class C05022 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1351c f522a;

        C05022(C1351c c1351c) {
            this.f522a = c1351c;
        }

        public void onClick(View view) {
            this.f522a.f2380n = C0509c.Button2;
            this.f522a.dismiss();
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$3 */
    class C05033 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1351c f523a;

        C05033(C1351c c1351c) {
            this.f523a = c1351c;
        }

        public void onClick(View view) {
            this.f523a.f2380n = C0509c.Button3;
            this.f523a.dismiss();
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$4 */
    class C05044 implements OnEditorActionListener {
        /* renamed from: a */
        final /* synthetic */ C1351c f524a;

        C05044(C1351c c1351c) {
            this.f524a = c1351c;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return null;
            }
            this.f524a.f2380n = C0509c.Button1;
            this.f524a.dismiss();
            return true;
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$5 */
    class C05055 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1351c f525a;

        C05055(C1351c c1351c) {
            this.f525a = c1351c;
        }

        public void onClick(View view) {
            this.f525a.dismiss();
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$6 */
    class C05066 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1351c f526a;

        C05066(C1351c c1351c) {
            this.f526a = c1351c;
        }

        public void run() {
            if (this.f526a.f2383q == -1) {
                this.f526a.f2380n = C0509c.Button1;
                this.f526a.dismiss();
                return;
            }
            this.f526a.f2377k.setText(String.valueOf(this.f526a.f2383q));
            this.f526a.f2383q = this.f526a.f2383q - 1;
            this.f526a.a.f1263k.postDelayed(this.f526a.f2384r, 1000);
        }
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$a */
    public static class C0507a {
        /* renamed from: a */
        public String f527a;
        /* renamed from: b */
        public String f528b;
        /* renamed from: c */
        public String f529c;
        /* renamed from: d */
        public String f530d;
        /* renamed from: e */
        public String f531e;
        /* renamed from: f */
        public int f532f;
        /* renamed from: g */
        public String f533g;
        /* renamed from: h */
        public C0508b f534h = C0508b.Button1;
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$b */
    public enum C0508b {
        Button1,
        Button2,
        Button3
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$c */
    public enum C0509c {
        None,
        Button1,
        Button2,
        Button3
    }

    /* compiled from: MessageBox */
    /* renamed from: com.iptv2.a.c$d */
    public static class C0510d {
        /* renamed from: a */
        public void mo1306a(C1351c c1351c, C0509c c0509c) {
        }

        /* renamed from: a */
        public void mo1336a(C1351c c1351c, C0509c c0509c, String str) {
        }
    }

    /* renamed from: a */
    public void m2976a(C0507a c0507a) {
        this.f2382p = c0507a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.EditDialog);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2371e = layoutInflater.inflate(R.layout.messagebox, viewGroup, false);
        this.f2372f = (TextView) this.f2371e.findViewById(R.id.title);
        this.f2373g = (TextView) this.f2371e.findViewById(R.id.message);
        this.f2378l = (EditText) this.f2371e.findViewById(R.id.input);
        this.f2374h = (TextView) this.f2371e.findViewById(R.id.button1);
        this.f2375i = (TextView) this.f2371e.findViewById(R.id.button2);
        this.f2376j = (TextView) this.f2371e.findViewById(R.id.button3);
        this.f2377k = (TextView) this.f2371e.findViewById(R.id.timer);
        if (this.f2382p.f527a != null && this.f2382p.f527a.equals("") == null) {
            this.f2372f.setText(this.f2382p.f527a);
            this.f2372f.setVisibility(0);
        }
        if (this.f2382p.f528b != null && this.f2382p.f528b.equals("") == null) {
            this.f2373g.setText(this.f2382p.f528b);
            this.f2373g.setVisibility(0);
        }
        if (this.f2382p.f529c != null && this.f2382p.f529c.equals("") == null) {
            this.f2374h.setText(this.f2382p.f529c);
            this.f2374h.setVisibility(0);
            this.f2374h.setOnClickListener(new C05011(this));
        }
        if (this.f2382p.f530d != null && this.f2382p.f530d.equals("") == null) {
            this.f2375i.setText(this.f2382p.f530d);
            this.f2375i.setVisibility(0);
            this.f2375i.setOnClickListener(new C05022(this));
        }
        if (this.f2382p.f531e != null && this.f2382p.f531e.equals("") == null) {
            this.f2376j.setText(this.f2382p.f531e);
            this.f2376j.setVisibility(0);
            this.f2376j.setOnClickListener(new C05033(this));
        }
        if (this.f2382p.f533g != null && this.f2382p.f533g.equals("") == null) {
            this.f2378l.setHint(this.f2382p.f533g);
            this.f2378l.setVisibility(0);
            this.f2378l.setOnEditorActionListener(new C05044(this));
        }
        this.f2371e.setOnClickListener(new C05055(this));
        return this.f2371e;
    }

    public void onResume() {
        super.onResume();
        if (!this.f2379m) {
            this.f2379m = true;
            if (this.f2378l.getVisibility() == 0) {
                this.f2378l.requestFocus();
            } else if (this.f2382p.f534h == C0508b.Button1 && this.f2374h.getVisibility() == 0) {
                this.f2374h.requestFocus();
            } else if (this.f2382p.f534h == C0508b.Button2 && this.f2375i.getVisibility() == 0) {
                this.f2375i.requestFocus();
            } else if (this.f2382p.f534h == C0508b.Button3 && this.f2376j.getVisibility() == 0) {
                this.f2376j.requestFocus();
            }
            this.f2380n = C0509c.None;
            if (this.f2382p.f532f > 0) {
                this.f2383q = this.f2382p.f532f;
                this.f2384r.run();
                this.f2377k.setVisibility(0);
            }
        }
    }

    public void onPause() {
        m2973c();
        super.onPause();
    }

    /* renamed from: a */
    public void m2977a(C0510d c0510d) {
        this.f2381o = c0510d;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f2381o == null) {
            return;
        }
        if (this.f2378l.getVisibility() == null) {
            this.f2381o.mo1336a(this, this.f2380n, this.f2378l.getText().toString());
        } else {
            this.f2381o.mo1306a(this, this.f2380n);
        }
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        m2973c();
        return false;
    }

    /* renamed from: c */
    private void m2973c() {
        if (this.f2377k.getVisibility() != 8) {
            this.a.f1263k.removeCallbacks(this.f2384r);
            this.f2377k.setVisibility(8);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C1351c m2970a(Activity activity, C0507a c0507a, C0510d c0510d) {
        C1351c c1351c = new C1351c();
        c1351c.m2976a(c0507a);
        c1351c.m2977a(c0510d);
        c1351c.m2846a(activity);
        return c1351c;
    }
}
