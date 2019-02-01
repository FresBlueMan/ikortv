package com.iptv2.p044c;

import android.content.Context;
import android.widget.Toast;
import com.iptv2.base.Activity;
import com.iptv2.core.Application;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0591c;
import com.iptv2.p044c.C0677g.C0676a;
import com.socks.library.KLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PlayStatObserve */
/* renamed from: com.iptv2.c.f */
public class C0675f {
    /* renamed from: a */
    private C0730c f986a;
    /* renamed from: b */
    private boolean f987b = false;
    /* renamed from: c */
    private Activity f988c;
    /* renamed from: d */
    private C0677g f989d;
    /* renamed from: e */
    private int f990e = 0;
    /* renamed from: f */
    private int f991f = 0;
    /* renamed from: g */
    private int f992g = 0;
    /* renamed from: h */
    private int f993h = 0;
    /* renamed from: i */
    private boolean f994i = false;
    /* renamed from: j */
    private List<Long> f995j = new ArrayList();
    /* renamed from: k */
    private int f996k = 0;
    /* renamed from: l */
    private C0673a f997l;
    /* renamed from: m */
    private Runnable f998m = new C06722(this);

    /* compiled from: PlayStatObserve */
    /* renamed from: com.iptv2.c.f$2 */
    class C06722 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0675f f978a;

        C06722(C0675f c0675f) {
            this.f978a = c0675f;
        }

        public void run() {
            this.f978a.m1116c();
        }
    }

    /* compiled from: PlayStatObserve */
    /* renamed from: com.iptv2.c.f$a */
    public interface C0673a {
        /* renamed from: a */
        void mo1326a(List<C0674b> list);
    }

    /* compiled from: PlayStatObserve */
    /* renamed from: com.iptv2.c.f$b */
    public enum C0674b {
        NONE,
        NOStream,
        PlayerError,
        AlwaysBuffered,
        AlwaysPreparing,
        PositionNotForward
    }

    /* compiled from: PlayStatObserve */
    /* renamed from: com.iptv2.c.f$1 */
    class C11621 extends C0676a {
        /* renamed from: a */
        final /* synthetic */ C0675f f2036a;

        /* renamed from: e */
        public void mo1343e() {
        }

        C11621(C0675f c0675f) {
            this.f2036a = c0675f;
        }

        /* renamed from: c */
        public void mo1341c() {
            C0591c.m791a("test", "onBufferingStart");
            this.f2036a.f994i = true;
        }

        /* renamed from: d */
        public void mo1342d() {
            this.f2036a.f994i = false;
        }

        /* renamed from: g */
        public void mo1369g() {
            this.f2036a.f994i = false;
        }

        /* renamed from: f */
        public void mo1368f() {
            this.f2036a.f994i = false;
        }
    }

    public C0675f(Activity activity, C0730c c0730c, C0677g c0677g) {
        this.f988c = activity;
        this.f986a = c0730c;
        this.f989d = c0677g;
        this.f989d.m1142a(new C11621(this));
    }

    /* renamed from: c */
    private void m1116c() {
        if (!this.f987b) {
            Object obj;
            int i;
            long h;
            List arrayList = new ArrayList();
            if (C1160d.m2441c().m2446d() != 0 || this.f989d.m1153e() == 0) {
                this.f990e = 0;
            } else {
                int i2 = this.f990e + 1;
                this.f990e = i2;
                if (i2 >= 28) {
                    arrayList.add(C0674b.NOStream);
                    obj = 1;
                    if (this.f989d.m1153e() != 1) {
                        i = this.f993h + 1;
                        this.f993h = i;
                        if (i >= 15) {
                            arrayList.add(C0674b.AlwaysPreparing);
                            obj = 1;
                        }
                    } else {
                        this.f993h = 0;
                    }
                    if (this.f989d.m1153e() != -1) {
                        i = this.f992g + 1;
                        this.f992g = i;
                        if (i >= 8) {
                            arrayList.add(C0674b.PlayerError);
                            obj = 1;
                        }
                    } else {
                        this.f992g = 0;
                    }
                    if (this.f994i) {
                        this.f991f = 0;
                    } else {
                        i = this.f991f + 1;
                        this.f991f = i;
                        if (i >= 10) {
                            arrayList.add(C0674b.AlwaysBuffered);
                            obj = 1;
                        }
                    }
                    h = this.f989d.m1156h();
                    if (h > 0 || this.f992g != 0 || this.f994i) {
                        this.f995j.clear();
                    } else {
                        if (this.f995j.size() > 0 && h < ((Long) this.f995j.get(this.f995j.size() - 1)).longValue()) {
                            this.f995j.clear();
                            if (Application.f1062a) {
                                Context context = this.f988c;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("go back but not switch channel.....:");
                                int i3 = this.f996k + 1;
                                this.f996k = i3;
                                stringBuilder.append(i3);
                                Toast.makeText(context, stringBuilder.toString(), 1).show();
                            }
                        }
                        this.f995j.add(Long.valueOf(h));
                        if (this.f995j.size() >= 20) {
                            long longValue = ((Long) this.f995j.get(this.f995j.size() - 1)).longValue();
                            h = ((Long) this.f995j.get(0)).longValue();
                            if (obj == null && h + 10000 > longValue) {
                                arrayList.add(C0674b.PositionNotForward);
                                obj = 1;
                            }
                            this.f995j.remove(0);
                        }
                    }
                    if (obj != null) {
                        m1117d();
                        if (this.f997l != null) {
                            KLog.m1448d("observe detect can not play....");
                            this.f997l.mo1326a(arrayList);
                        }
                    }
                    this.f986a.f1263k.postDelayed(this.f998m, 1000);
                }
            }
            obj = null;
            if (this.f989d.m1153e() != 1) {
                this.f993h = 0;
            } else {
                i = this.f993h + 1;
                this.f993h = i;
                if (i >= 15) {
                    arrayList.add(C0674b.AlwaysPreparing);
                    obj = 1;
                }
            }
            if (this.f989d.m1153e() != -1) {
                this.f992g = 0;
            } else {
                i = this.f992g + 1;
                this.f992g = i;
                if (i >= 8) {
                    arrayList.add(C0674b.PlayerError);
                    obj = 1;
                }
            }
            if (this.f994i) {
                this.f991f = 0;
            } else {
                i = this.f991f + 1;
                this.f991f = i;
                if (i >= 10) {
                    arrayList.add(C0674b.AlwaysBuffered);
                    obj = 1;
                }
            }
            h = this.f989d.m1156h();
            if (h > 0) {
            }
            this.f995j.clear();
            if (obj != null) {
                m1117d();
                if (this.f997l != null) {
                    KLog.m1448d("observe detect can not play....");
                    this.f997l.mo1326a(arrayList);
                }
            }
            this.f986a.f1263k.postDelayed(this.f998m, 1000);
        }
    }

    /* renamed from: d */
    private void m1117d() {
        this.f990e = 0;
        this.f991f = 0;
        this.f992g = 0;
        this.f993h = 0;
        this.f995j.clear();
    }

    /* renamed from: a */
    public void m1119a(C0673a c0673a) {
        this.f997l = c0673a;
    }

    /* renamed from: a */
    public void m1118a() {
        KLog.m1448d("start..............observe");
        m1117d();
        this.f987b = false;
        this.f986a.f1263k.removeCallbacks(this.f998m);
        this.f986a.f1263k.postDelayed(this.f998m, 1000);
    }

    /* renamed from: b */
    public void m1120b() {
        KLog.m1448d("stop observe..............");
        m1117d();
        this.f987b = true;
        this.f986a.f1263k.removeCallbacks(this.f998m);
    }
}
