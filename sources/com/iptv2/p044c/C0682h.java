package com.iptv2.p044c;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.iptv2.base.Activity;
import com.iptv2.core.C0730c;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0595e;

/* compiled from: TimeSeekBarView */
/* renamed from: com.iptv2.c.h */
public class C0682h {
    /* renamed from: a */
    private C0730c f1014a;
    /* renamed from: b */
    private View f1015b;
    /* renamed from: c */
    private ViewGroup f1016c;
    /* renamed from: d */
    private TextView f1017d;
    /* renamed from: e */
    private TextView f1018e;
    /* renamed from: f */
    private TextView f1019f;
    /* renamed from: g */
    private View f1020g;
    /* renamed from: h */
    private View f1021h;
    /* renamed from: i */
    private LayoutParams f1022i;
    /* renamed from: j */
    private LayoutParams f1023j;
    /* renamed from: k */
    private int f1024k;
    /* renamed from: l */
    private int f1025l;
    /* renamed from: m */
    private C0680a f1026m = C0680a.Left;
    /* renamed from: n */
    private boolean f1027n = false;
    /* renamed from: o */
    private boolean f1028o = false;
    /* renamed from: p */
    private float f1029p = 0.0f;
    /* renamed from: q */
    private C0681b f1030q = new C0681b();
    /* renamed from: r */
    private Runnable f1031r = new C06792(this);
    /* renamed from: s */
    private long f1032s = 0;
    /* renamed from: t */
    private long f1033t = 0;
    /* renamed from: u */
    private int f1034u;

    /* compiled from: TimeSeekBarView */
    /* renamed from: com.iptv2.c.h$2 */
    class C06792 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0682h f1010a;

        C06792(C0682h c0682h) {
            this.f1010a = c0682h;
        }

        public void run() {
            if (this.f1010a.f1027n) {
                this.f1010a.f1027n = false;
                this.f1010a.f1030q.mo1366a(this.f1010a.f1029p);
            }
        }
    }

    /* compiled from: TimeSeekBarView */
    /* renamed from: com.iptv2.c.h$a */
    public enum C0680a {
        Left,
        Right
    }

    /* compiled from: TimeSeekBarView */
    /* renamed from: com.iptv2.c.h$b */
    public static class C0681b {
        /* renamed from: a */
        public long mo1365a() {
            return 0;
        }

        /* renamed from: a */
        public void mo1366a(float f) {
        }
    }

    /* renamed from: a */
    public void m1177a(C0681b c0681b) {
        this.f1030q = c0681b;
    }

    public C0682h(final C0730c c0730c, View view) {
        this.f1014a = c0730c;
        this.f1015b = view;
        this.f1016c = (ViewGroup) view.findViewById(R.id.timerGroup);
        this.f1017d = (TextView) view.findViewById(R.id.time);
        this.f1018e = (TextView) view.findViewById(R.id.timeDuration);
        this.f1019f = (TextView) view.findViewById(R.id.timeSp);
        this.f1020g = view.findViewById(R.id.progress);
        this.f1022i = (LayoutParams) this.f1020g.getLayoutParams();
        this.f1021h = view.findViewById(R.id.progress_thumb);
        this.f1023j = (LayoutParams) this.f1021h.getLayoutParams();
        this.f1024k = this.f1014a.f1265m.getDimensionPixelSize(R.dimen.widget_timeseekbar_progress_thumb_minwidth);
        this.f1025l = Activity.f2469f;
        if (c0730c.f1248C.m1321h() != null) {
            this.f1015b.setOnTouchListener(new OnTouchListener(this) {
                /* renamed from: b */
                final /* synthetic */ C0682h f1009b;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    view = motionEvent.getAction();
                    float x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    if (view == null) {
                        int height = this.f1009b.f1015b.getHeight() - c0730c.f1265m.getDimensionPixelSize(R.dimen.width_5_320);
                        if (motionEvent >= ((float) c0730c.f1265m.getDimensionPixelSize(R.dimen.width_20_320)) && motionEvent <= ((float) height)) {
                            this.f1009b.f1014a.f1263k.removeCallbacks(this.f1009b.f1031r);
                            this.f1009b.f1027n = true;
                            x /= (float) c0730c.f1266n.widthPixels;
                            if (this.f1009b.f1026m == C0680a.Right) {
                                x = 1.0f - x;
                            }
                            this.f1009b.m1174a(x);
                            this.f1009b.m1168c(this.f1009b.f1030q.mo1365a());
                        }
                    } else if (view == 2) {
                        if (this.f1009b.f1027n != null) {
                            x /= (float) c0730c.f1266n.widthPixels;
                            if (this.f1009b.f1026m == C0680a.Right) {
                                x = 1.0f - x;
                            }
                            this.f1009b.m1174a(x);
                            this.f1009b.m1168c(this.f1009b.f1030q.mo1365a());
                        }
                    } else if (view == 1 && this.f1009b.f1027n != null) {
                        this.f1009b.f1027n = null;
                        this.f1009b.f1014a.f1263k.removeCallbacks(this.f1009b.f1031r);
                        this.f1009b.m1166b(500);
                        x /= (float) c0730c.f1266n.widthPixels;
                        if (this.f1009b.f1026m == C0680a.Right) {
                            x = 1.0f - x;
                        }
                        this.f1009b.m1174a(x);
                        this.f1009b.m1168c(this.f1009b.f1030q.mo1365a());
                    }
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public void m1176a(C0680a c0680a) {
        if (this.f1026m != c0680a) {
            this.f1026m = c0680a;
            if (this.f1026m == C0680a.Left) {
                this.f1022i.gravity = 3;
                this.f1023j.gravity = 5;
            } else if (this.f1026m == C0680a.Right) {
                this.f1022i.gravity = 5;
                this.f1023j.gravity = 3;
            }
            m1171f();
            this.f1015b.requestLayout();
        }
    }

    /* renamed from: a */
    public boolean m1179a() {
        return this.f1027n;
    }

    /* renamed from: b */
    public boolean m1182b() {
        return this.f1027n;
    }

    /* renamed from: c */
    public float m1183c() {
        return this.f1029p;
    }

    /* renamed from: a */
    public void m1174a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.f1029p != f) {
            this.f1029p = f;
            this.f1022i.width = (int) ((((float) (this.f1025l - this.f1024k)) * f) + ((float) this.f1024k));
            this.f1020g.requestLayout();
            m1171f();
        }
    }

    /* renamed from: a */
    public void m1175a(long j) {
        if (!m1179a()) {
            if (!m1182b()) {
                m1168c(j);
            }
        }
    }

    /* renamed from: c */
    private void m1168c(long j) {
        this.f1017d.setText(String.format(C0595e.f658a, "%02d:%02d:%02d", new Object[]{Integer.valueOf(((int) (j / 3600)) % 24), Integer.valueOf((int) ((j % 3600) / 60)), Long.valueOf(j % 60)}));
    }

    /* renamed from: d */
    public boolean m1184d() {
        return this.f1028o;
    }

    /* renamed from: a */
    public void m1178a(boolean z) {
        if (this.f1028o != z) {
            this.f1028o = z;
            this.f1015b.setVisibility(z ? false : true);
        }
    }

    /* renamed from: e */
    public void m1185e() {
        this.f1014a.f1263k.removeCallbacks(this.f1031r);
        this.f1029p = 0.0f;
        this.f1017d.setText("00:00:00");
        this.f1027n = false;
        this.f1022i.width = this.f1024k;
        this.f1020g.requestLayout();
        m1171f();
    }

    /* renamed from: f */
    private void m1171f() {
        int i = this.f1022i.width;
        if (this.f1026m == C0680a.Left) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f1017d.getText().toString());
            stringBuilder.append(this.f1019f.getText().toString());
            stringBuilder.append(this.f1018e.getText().toString());
            this.f1034u = m1160a(stringBuilder.toString());
            if (i < this.f1034u) {
                this.f1016c.setTranslationX(0.0f);
            } else {
                this.f1016c.setTranslationX((float) (i - this.f1034u));
            }
        } else if (this.f1026m == C0680a.Right) {
            this.f1034u = m1160a(this.f1017d.getText().toString());
            if (i > this.f1034u) {
                this.f1016c.setTranslationX((float) (Activity.f2469f - i));
            } else {
                this.f1016c.setTranslationX((float) (Activity.f2469f - this.f1034u));
            }
        }
    }

    /* renamed from: a */
    public boolean m1180a(int i) {
        if (i != 21 && i != 22) {
            return false;
        }
        float f = 0.005f;
        if (System.currentTimeMillis() - this.f1032s >= 200 && this.f1033t > 0) {
            f = 10000.0f / ((float) this.f1033t);
        }
        this.f1032s = System.currentTimeMillis();
        if (i == 21) {
            if (this.f1026m == C0680a.Left) {
                if (this.f1029p > 0) {
                    m1166b(1000);
                    m1174a(m1183c() - f);
                    m1168c(this.f1030q.mo1365a());
                }
            } else if (this.f1026m == C0680a.Right && this.f1029p < 1065353216) {
                m1166b(1000);
                m1174a(m1183c() + f);
                m1168c(this.f1030q.mo1365a());
            }
            return true;
        } else if (i != 22) {
            return false;
        } else {
            if (this.f1026m == C0680a.Left) {
                if (this.f1029p < 1065353216) {
                    m1166b(1000);
                    m1174a(m1183c() + f);
                    m1168c(this.f1030q.mo1365a());
                }
            } else if (this.f1026m == C0680a.Right && this.f1029p > 0) {
                m1166b(1000);
                m1174a(m1183c() - f);
                m1168c(this.f1030q.mo1365a());
            }
            return true;
        }
    }

    /* renamed from: b */
    private void m1166b(int i) {
        if (!this.f1027n) {
            this.f1027n = true;
        }
        this.f1014a.f1263k.removeCallbacks(this.f1031r);
        this.f1014a.f1263k.postDelayed(this.f1031r, (long) i);
    }

    /* renamed from: b */
    public void m1181b(long j) {
        this.f1033t = j;
        if (this.f1026m == C0680a.Right) {
            this.f1018e.setVisibility(8);
            this.f1019f.setVisibility(8);
            return;
        }
        j = this.f1033t / 1000;
        this.f1018e.setText(String.format(C0595e.f658a, "%02d:%02d:%02d", new Object[]{Integer.valueOf(((int) (j / 3600)) % 24), Integer.valueOf((int) ((j % 3600) / 60)), Long.valueOf(j % 60)}));
        this.f1018e.setVisibility(0);
        this.f1019f.setVisibility(0);
    }

    /* renamed from: a */
    private int m1160a(String str) {
        return (int) this.f1017d.getPaint().measureText(str);
    }
}
