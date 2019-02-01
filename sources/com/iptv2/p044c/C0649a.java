package com.iptv2.p044c;

import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.github.florent37.viewanimator.AnimationListener.Stop;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.Activity;
import com.iptv2.core.C0730c;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import java.util.ArrayList;

/* compiled from: GestureView */
/* renamed from: com.iptv2.c.a */
public class C0649a {
    /* renamed from: a */
    private C0730c f894a;
    /* renamed from: b */
    private Activity f895b;
    /* renamed from: c */
    private View f896c;
    /* renamed from: d */
    private View f897d;
    /* renamed from: e */
    private TextView f898e;
    /* renamed from: f */
    private TextView f899f;
    /* renamed from: g */
    private Window f900g;
    /* renamed from: h */
    private C0611b f901h;
    /* renamed from: i */
    private GestureDetector f902i;
    /* renamed from: j */
    private ArrayList<C0610a> f903j = new ArrayList();
    /* renamed from: k */
    private boolean f904k = true;
    /* renamed from: l */
    private boolean f905l = false;
    /* renamed from: m */
    private Runnable f906m = new C06092(this);

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$1 */
    class C06081 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0649a f694a;

        C06081(C0649a c0649a) {
            this.f694a = c0649a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f694a.f902i.onTouchEvent(motionEvent) == null && motionEvent.getAction() == 1) {
                this.f694a.f901h.m835a(motionEvent);
            }
            return true;
        }
    }

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$2 */
    class C06092 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0649a f695a;

        C06092(C0649a c0649a) {
            this.f695a = c0649a;
        }

        public void run() {
            this.f695a.m1032a();
        }
    }

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$a */
    public static class C0610a {
        /* renamed from: a */
        public void mo1321a() {
        }

        /* renamed from: b */
        public void mo1322b() {
        }

        /* renamed from: c */
        public void mo1323c() {
        }
    }

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$b */
    private class C0611b extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ C0649a f696a;
        /* renamed from: b */
        private C0612c f697b = C0612c.None;
        /* renamed from: c */
        private boolean f698c = false;
        /* renamed from: d */
        private float f699d = 0.0f;
        /* renamed from: e */
        private int f700e;

        public C0611b(C0649a c0649a) {
            this.f696a = c0649a;
            this.f700e = c0649a.f894a.f1265m.getDimensionPixelSize(R.dimen.width_8_320);
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C0591c.m791a("GestureView", "onSingleTapConfirmed");
            int size = this.f696a.f903j.size();
            for (int i = 0; i < size; i++) {
                ((C0610a) this.f696a.f903j.get(i)).mo1321a();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f696a.f904k) {
                float abs = Math.abs(f2);
                float abs2 = Math.abs(f);
                if (!this.f698c) {
                    this.f698c = true;
                    if (abs > abs2) {
                        if (motionEvent.getY() >= ((float) this.f696a.f894a.f1265m.getDimensionPixelSize(R.dimen.width_60_320))) {
                            if (motionEvent.getX() < ((float) (this.f696a.f894a.f1266n.widthPixels / 2))) {
                                this.f697b = C0612c.Brightness;
                            } else {
                                this.f697b = C0612c.Volume;
                            }
                            m834a();
                            this.f696a.m1035c(false);
                        }
                    }
                } else if (this.f697b != C0612c.None && abs > abs2) {
                    this.f699d += f2;
                    StringBuilder stringBuilder;
                    if (this.f697b == C0612c.Volume) {
                        int streamVolume = this.f696a.f894a.f1272t.getStreamVolume(3);
                        if (this.f699d > ((float) this.f700e)) {
                            streamVolume++;
                            this.f699d = 0.0f;
                        } else if (this.f699d < ((float) (-this.f700e))) {
                            streamVolume--;
                            this.f699d = 0.0f;
                        }
                        if (streamVolume < 0) {
                            streamVolume = 0;
                        } else if (streamVolume > this.f696a.f894a.f1246A) {
                            streamVolume = this.f696a.f894a.f1246A;
                        }
                        this.f696a.f894a.f1272t.setStreamVolume(3, streamVolume, 0);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("setVolume ");
                        stringBuilder.append(streamVolume);
                        stringBuilder.append("/");
                        stringBuilder.append(this.f696a.f894a.f1246A);
                        C0591c.m791a("GestureView", stringBuilder.toString());
                        m834a();
                    } else if (this.f697b == C0612c.Brightness) {
                        LayoutParams attributes = this.f696a.f900g.getAttributes();
                        abs2 = attributes.screenBrightness;
                        double d;
                        if (this.f699d > ((float) this.f700e)) {
                            d = (double) abs2;
                            Double.isNaN(d);
                            abs2 = (float) (d + 0.05d);
                            this.f699d = 0.0f;
                        } else if (this.f699d < ((float) (-this.f700e))) {
                            d = (double) abs2;
                            Double.isNaN(d);
                            abs2 = (float) (d - 0.05d);
                            this.f699d = 0.0f;
                        }
                        if (abs2 < 0.0f) {
                            abs2 = 0.0f;
                        } else if (abs2 > 1.0f) {
                            abs2 = 1.0f;
                        }
                        attributes.screenBrightness = abs2;
                        this.f696a.f900g.setAttributes(attributes);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("setBrightness ");
                        stringBuilder.append(abs2);
                        C0591c.m791a("GestureView", stringBuilder.toString());
                        m834a();
                    }
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        /* renamed from: a */
        public void m835a(MotionEvent motionEvent) {
            this.f697b = C0612c.None;
            this.f698c = null;
            this.f699d = null;
            if (this.f696a.f905l != null) {
                this.f696a.m1035c(true);
            }
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f696a.f904k) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            int size = this.f696a.f903j.size();
            if (this.f697b == C0612c.None && size > 0 && Math.abs(f) > 300.0f && Math.abs(motionEvent.getX() - motionEvent2.getX()) >= ((float) this.f696a.f894a.f1265m.getDimensionPixelSize(R.dimen.height_40_320))) {
                for (int i = 0; i < size; i++) {
                    if (f < 0.0f) {
                        C0591c.m791a("GestureView", "onFlingRightToLeft");
                        ((C0610a) this.f696a.f903j.get(i)).mo1323c();
                    } else {
                        C0591c.m791a("GestureView", "onFlingLeftToRight");
                        ((C0610a) this.f696a.f903j.get(i)).mo1322b();
                    }
                }
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        /* renamed from: a */
        private void m834a() {
            int streamVolume;
            TextView f;
            StringBuilder stringBuilder;
            if (this.f697b == C0612c.Volume) {
                streamVolume = (this.f696a.f894a.f1272t.getStreamVolume(3) * 100) / this.f696a.f894a.f1246A;
                f = this.f696a.f899f;
                stringBuilder = new StringBuilder();
                stringBuilder.append(streamVolume);
                stringBuilder.append("%");
                f.setText(stringBuilder.toString());
                this.f696a.f898e.setText(streamVolume > 0 ? R.string.icon_osd_speaker : R.string.icon_osd_speaker_mute);
            } else if (this.f697b == C0612c.Brightness) {
                streamVolume = (int) (this.f696a.f900g.getAttributes().screenBrightness * 100.0f);
                f = this.f696a.f899f;
                stringBuilder = new StringBuilder();
                stringBuilder.append(streamVolume);
                stringBuilder.append("%");
                f.setText(stringBuilder.toString());
                this.f696a.f898e.setText(R.string.icon_osd_brightness);
            }
        }
    }

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$c */
    enum C0612c {
        None,
        Brightness,
        Volume
    }

    /* compiled from: GestureView */
    /* renamed from: com.iptv2.c.a$3 */
    class C11053 implements Stop {
        /* renamed from: a */
        final /* synthetic */ C0649a f1931a;

        C11053(C0649a c0649a) {
            this.f1931a = c0649a;
        }

        public void onStop() {
            if (!this.f1931a.f905l) {
                this.f1931a.f897d.setVisibility(4);
            }
        }
    }

    public C0649a(com.iptv2.core.C0730c r2, com.iptv2.base.Activity r3, android.view.View r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r1.<init>();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1.f903j = r0;
        r0 = 1;
        r1.f904k = r0;
        r0 = 0;
        r1.f905l = r0;
        r0 = new com.iptv2.c.a$2;
        r0.<init>(r1);
        r1.f906m = r0;
        r1.f894a = r2;
        r1.f896c = r4;
        r0 = 2131165354; // 0x7f0700aa float:1.7944923E38 double:1.052935587E-314;
        r0 = r4.findViewById(r0);
        r1.f897d = r0;
        r0 = 2131165355; // 0x7f0700ab float:1.7944925E38 double:1.0529355875E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.f898e = r0;
        r0 = 2131165356; // 0x7f0700ac float:1.7944927E38 double:1.052935588E-314;
        r4 = r4.findViewById(r0);
        r4 = (android.widget.TextView) r4;
        r1.f899f = r4;
        r1.f895b = r3;
        r3 = r1.f895b;
        r3 = r3.getWindow();
        r1.f900g = r3;
        r3 = new com.iptv2.c.a$b;
        r3.<init>(r1);
        r1.f901h = r3;
        r3 = new android.view.GestureDetector;
        r2 = r2.f1260a;
        r4 = r1.f901h;
        r3.<init>(r2, r4);
        r1.f902i = r3;
        r2 = r1.f896c;
        r3 = new com.iptv2.c.a$1;
        r3.<init>(r1);
        r2.setOnTouchListener(r3);
        r2 = r1.f895b;	 Catch:{ Exception -> 0x0084 }
        r2 = r2.getContentResolver();	 Catch:{ Exception -> 0x0084 }
        r3 = "screen_brightness";	 Catch:{ Exception -> 0x0084 }
        r2 = android.provider.Settings.System.getInt(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = (float) r2;	 Catch:{ Exception -> 0x0084 }
        r3 = r1.f900g;	 Catch:{ Exception -> 0x0084 }
        r3 = r3.getAttributes();	 Catch:{ Exception -> 0x0084 }
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;	 Catch:{ Exception -> 0x0084 }
        r0 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;	 Catch:{ Exception -> 0x0084 }
        r2 = r2 / r0;	 Catch:{ Exception -> 0x0084 }
        r2 = java.lang.Math.max(r4, r2);	 Catch:{ Exception -> 0x0084 }
        r3.screenBrightness = r2;	 Catch:{ Exception -> 0x0084 }
        r2 = r1.f900g;	 Catch:{ Exception -> 0x0084 }
        r2.setAttributes(r3);	 Catch:{ Exception -> 0x0084 }
    L_0x0084:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.c.a.<init>(com.iptv2.core.c, com.iptv2.base.Activity, android.view.View):void");
    }

    /* renamed from: a */
    public void m1045a(C0610a c0610a) {
        this.f903j.add(c0610a);
    }

    /* renamed from: a */
    public void m1046a(boolean z) {
        this.f904k = z;
    }

    /* renamed from: b */
    public void m1047b(boolean z) {
        this.f896c.setVisibility(z ? false : true);
    }

    /* renamed from: c */
    private void m1035c(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showOsd ");
        stringBuilder.append(z);
        C0591c.m791a("GestureView", stringBuilder.toString());
        this.f894a.f1263k.removeCallbacks(this.f906m);
        if (z) {
            this.f894a.f1263k.postDelayed(this.f906m, 2000);
        }
        if (!this.f905l) {
            this.f905l = true;
            this.f897d.setVisibility(0);
            ViewAnimator.animate(new View[]{this.f897d}).alpha(0.0f, 1.0f).duration(200).start();
        }
    }

    /* renamed from: a */
    private void m1032a() {
        this.f894a.f1263k.removeCallbacks(this.f906m);
        if (this.f905l) {
            C0591c.m791a("GestureView", "hideOsd");
            this.f905l = false;
            this.f897d.setVisibility(0);
            ViewAnimator.animate(this.f897d).alpha(1.0f, 0.0f).duration(200).onStop(new C11053(this)).start();
        }
    }
}
