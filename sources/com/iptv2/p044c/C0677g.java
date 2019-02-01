package com.iptv2.p044c;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.iptv2.base.Activity;
import com.iptv2.core.C0730c;
import com.iptv2.core.C0740e.C0737c;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0695d;
import com.iptv2.core.DataEntity.C0700k;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0591c;
import com.iptv2.p044c.C0675f.C0673a;
import com.iptv2.player.IjkVideoView;
import com.iptv2.player.IjkVideoView.C0742a;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;

/* compiled from: PlayerView */
/* renamed from: com.iptv2.c.g */
public class C0677g {
    /* renamed from: a */
    private C0730c f999a;
    /* renamed from: b */
    private ViewGroup f1000b;
    /* renamed from: c */
    private IjkVideoView f1001c;
    /* renamed from: d */
    private View f1002d;
    /* renamed from: e */
    private int f1003e;
    /* renamed from: f */
    private C0671e f1004f;
    /* renamed from: g */
    private ArrayList<C0676a> f1005g = new ArrayList();
    /* renamed from: h */
    private C0675f f1006h;
    /* renamed from: i */
    private C0737c f1007i = new C11686(this);

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$a */
    public static abstract class C0676a {
        /* renamed from: a */
        public void mo1333a() {
        }

        /* renamed from: a */
        public void mo1339a(int i) {
        }

        /* renamed from: b */
        public void mo1340b() {
        }

        /* renamed from: c */
        public void mo1341c() {
        }

        /* renamed from: d */
        public void mo1342d() {
        }

        /* renamed from: e */
        public void mo1343e() {
        }

        /* renamed from: f */
        public void mo1368f() {
        }

        /* renamed from: g */
        public void mo1369g() {
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$1 */
    class C11631 implements OnPreparedListener {
        /* renamed from: a */
        final /* synthetic */ C0677g f2037a;

        C11631(C0677g c0677g) {
            this.f2037a = c0677g;
        }

        public void onPrepared(IMediaPlayer iMediaPlayer) {
            C0591c.m791a("PlayerView", "onPrepared");
            if (this.f2037a.f1004f != null) {
                this.f2037a.f1004f.m1112a(true);
            }
            iMediaPlayer = this.f2037a.f1005g.size();
            for (int i = 0; i < iMediaPlayer; i++) {
                ((C0676a) this.f2037a.f1005g.get(i)).mo1343e();
            }
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$2 */
    class C11642 implements OnInfoListener {
        /* renamed from: a */
        final /* synthetic */ C0677g f2038a;

        C11642(C0677g c0677g) {
            this.f2038a = c0677g;
        }

        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            iMediaPlayer = null;
            switch (i) {
                case IMediaPlayer.MEDIA_INFO_BUFFERING_START /*701*/:
                    C0591c.m791a("PlayerView", "onBufferingStart");
                    if (this.f2038a.f1004f != 0) {
                        this.f2038a.f1004f.m1112a(false);
                    }
                    i = this.f2038a.f1005g.size();
                    while (iMediaPlayer < i) {
                        ((C0676a) this.f2038a.f1005g.get(iMediaPlayer)).mo1341c();
                        iMediaPlayer++;
                    }
                    break;
                case IMediaPlayer.MEDIA_INFO_BUFFERING_END /*702*/:
                    C0591c.m791a("PlayerView", "onBufferingEnd");
                    if (this.f2038a.f1004f != 0) {
                        this.f2038a.f1004f.m1112a(true);
                    }
                    i = this.f2038a.f1005g.size();
                    while (iMediaPlayer < i) {
                        ((C0676a) this.f2038a.f1005g.get(iMediaPlayer)).mo1342d();
                        iMediaPlayer++;
                    }
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$3 */
    class C11653 implements OnCompletionListener {
        /* renamed from: a */
        final /* synthetic */ C0677g f2039a;

        C11653(C0677g c0677g) {
            this.f2039a = c0677g;
        }

        public void onCompletion(IMediaPlayer iMediaPlayer) {
            C0591c.m791a("PlayerView", "onCompletion");
            iMediaPlayer = this.f2039a.f1005g.size();
            for (int i = 0; i < iMediaPlayer; i++) {
                ((C0676a) this.f2039a.f1005g.get(i)).mo1333a();
            }
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$4 */
    class C11664 implements OnSeekCompleteListener {
        /* renamed from: a */
        final /* synthetic */ C0677g f2040a;

        C11664(C0677g c0677g) {
            this.f2040a = c0677g;
        }

        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            C0591c.m791a("PlayerView", "onSeekComplete");
            iMediaPlayer = this.f2040a.f1005g.size();
            for (int i = 0; i < iMediaPlayer; i++) {
                ((C0676a) this.f2040a.f1005g.get(i)).mo1340b();
            }
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$5 */
    class C11675 implements C0742a {
        /* renamed from: a */
        final /* synthetic */ C0677g f2041a;

        C11675(C0677g c0677g) {
            this.f2041a = c0677g;
        }

        /* renamed from: a */
        public IMediaPlayer mo1381a() {
            int f = this.f2041a.f999a.f1248C.m1316f();
            if (this.f2041a.f1003e != f) {
                this.f2041a.f1000b.removeView(this.f2041a.f1001c);
                this.f2041a.f1000b.addView(this.f2041a.f1001c, 0);
                this.f2041a.f1003e = f;
            }
            if (f == 1) {
                return this.f2041a.f1001c.m1396e();
            }
            return f == 2 ? this.f2041a.f1001c.m1392b(false) : null;
        }
    }

    /* compiled from: PlayerView */
    /* renamed from: com.iptv2.c.g$6 */
    class C11686 implements C0737c {
        /* renamed from: a */
        final /* synthetic */ C0677g f2042a;

        C11686(C0677g c0677g) {
            this.f2042a = c0677g;
        }

        /* renamed from: a */
        public void mo1382a(String str) {
            try {
                this.f2042a.f1001c.setVideoPath(str);
                this.f2042a.f1001c.start();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playUrl ");
                stringBuilder.append(str);
                C0591c.m791a("PlayerView", stringBuilder.toString());
            } catch (Throwable e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("playUrl ");
                stringBuilder2.append(str);
                C0591c.m792a("PlayerView", stringBuilder2.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public String m1147b(int i) {
        return i == -1 ? "STATE_ERROR" : i == 0 ? "STATE_IDLE" : i == 1 ? "STATE_PREPARING" : i == 2 ? "STATE_PREPARED" : i == 3 ? "STATE_PREPARED" : i == 4 ? "STATE_PAUSED" : i == 5 ? "STATE_PLAYBACK_COMPLETED" : "none";
    }

    public C0677g(Activity activity, C0730c c0730c, View view, C0673a c0673a) {
        this.f999a = c0730c;
        this.f1000b = (ViewGroup) view;
        C1160d.m2441c().m2444a(activity, c0730c);
        C1160d.m2441c().m2447e();
        if (this.f1006h == null) {
            this.f1006h = new C0675f(activity, c0730c, this);
            this.f1006h.m1119a(c0673a);
        }
        this.f1001c = (IjkVideoView) view.findViewById(R.id.video);
        this.f1003e = this.f999a.f1248C.m1316f();
        m1140a(this.f999a.f1248C.m1318g());
        m1136j();
    }

    /* renamed from: a */
    public void m1141a(View view) {
        this.f1002d = view;
    }

    /* renamed from: b */
    public void m1149b(View view) {
        this.f1004f = new C0671e(this.f999a, view, this);
    }

    /* renamed from: a */
    public void m1142a(C0676a c0676a) {
        this.f1005g.add(c0676a);
    }

    /* renamed from: a */
    public void m1140a(int i) {
        if (i == 1) {
            this.f1001c.setAspectRatio(0);
        } else if (i == 0) {
            this.f1001c.setAspectRatio(3);
        }
    }

    /* renamed from: j */
    private void m1136j() {
        this.f1001c.setOnPreparedListener(new C11631(this));
        this.f1001c.setOnInfoListener(new C11642(this));
        this.f1001c.setOnCompletionListener(new C11653(this));
        this.f1001c.setOnSeekCompleteListener(new C11664(this));
        this.f1001c.setOnCreatePlayerRequestListener(new C11675(this));
    }

    /* renamed from: a */
    public void m1139a() {
        if (this.f1002d != null) {
            this.f1002d.setVisibility(0);
        }
        this.f1001c.pause();
    }

    /* renamed from: b */
    public void m1148b() {
        if (this.f1002d != null) {
            this.f1002d.setVisibility(8);
        }
        this.f1001c.start();
    }

    /* renamed from: c */
    public boolean m1151c() {
        return this.f1001c.m1397f();
    }

    /* renamed from: d */
    public void m1152d() {
        C0591c.m791a("PlayerView", "stopPlay");
        if (this.f1002d != null) {
            this.f1002d.setVisibility(8);
        }
        this.f1001c.m1390a();
        this.f999a.f1250E.m1343c();
        if (this.f1004f != null) {
            this.f1004f.m1111a();
        }
        m1137k();
        int size = this.f1005g.size();
        for (int i = 0; i < size; i++) {
            ((C0676a) this.f1005g.get(i)).mo1368f();
        }
        this.f1006h.m1120b();
    }

    /* renamed from: e */
    public int m1153e() {
        return this.f1001c.getPlayerState();
    }

    /* renamed from: f */
    public int m1154f() {
        return Math.max(0, this.f1001c.getDuration());
    }

    /* renamed from: g */
    public int m1155g() {
        return Math.max(0, this.f1001c.getCurrentPosition());
    }

    /* renamed from: h */
    public long m1156h() {
        return this.f1001c.getCurrentPositionLong();
    }

    /* renamed from: i */
    public float m1157i() {
        int f = m1154f();
        return f > 0 ? ((float) m1155g()) / ((float) f) : 0.0f;
    }

    /* renamed from: c */
    public void m1150c(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("seekTo ");
        stringBuilder.append(i);
        C0591c.m791a("PlayerView", stringBuilder.toString());
        if (m1151c()) {
            m1148b();
        }
        int i2 = 0;
        if (this.f1004f != null) {
            this.f1004f.m1112a(false);
        }
        this.f1001c.seekTo(i);
        int size = this.f1005g.size();
        while (i2 < size) {
            ((C0676a) this.f1005g.get(i2)).mo1339a(i);
            i2++;
        }
    }

    /* renamed from: k */
    private void m1137k() {
        if (this.f1003e == 2) {
            SurfaceHolder surfaceHolder = this.f1001c.getSurfaceHolder();
            if (surfaceHolder != null) {
                Canvas lockCanvas = surfaceHolder.lockCanvas(null);
                lockCanvas.drawColor(ViewCompat.MEASURED_STATE_MASK);
                surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }
    }

    /* renamed from: l */
    private void m1138l() {
        if (this.f1002d != null) {
            this.f1002d.setVisibility(8);
        }
        this.f1001c.m1390a();
        int i = 0;
        if (this.f1004f != null) {
            this.f1004f.m1112a(false);
        }
        m1137k();
        int size = this.f1005g.size();
        while (i < size) {
            ((C0676a) this.f1005g.get(i)).mo1369g();
            i++;
        }
        C0591c.m791a("test", "onBeforePlay...");
        this.f1006h.m1120b();
    }

    /* renamed from: a */
    public void m1143a(C0693b c0693b, C0695d c0695d) {
        if (c0693b != null) {
            if (c0695d != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playLive ");
                stringBuilder.append(c0693b.f1071b);
                C0591c.m791a("PlayerView", stringBuilder.toString());
                m1138l();
                this.f1006h.m1118a();
                this.f999a.f1250E.m1337a(c0693b, c0695d, this.f1007i);
            }
        }
    }

    /* renamed from: a */
    public void m1144a(C0693b c0693b, C0695d c0695d, long j) {
        if (c0693b != null) {
            if (c0695d != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playTimeShift ");
                stringBuilder.append(c0693b.f1071b);
                stringBuilder.append(" ");
                stringBuilder.append(j);
                C0591c.m791a("PlayerView", stringBuilder.toString());
                m1138l();
                this.f999a.f1250E.m1336a(c0693b, c0695d, j, this.f1007i);
            }
        }
    }

    /* renamed from: a */
    public void m1145a(C0693b c0693b, C1174j c1174j, C0700k c0700k) {
        if (c0693b != null) {
            if (c0700k != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playRecord ");
                stringBuilder.append(c0693b.f1071b);
                stringBuilder.append(" ");
                stringBuilder.append(c1174j.e);
                C0591c.m791a("PlayerView", stringBuilder.toString());
                m1138l();
                this.f999a.f1250E.m1338a(c0693b, c1174j, c0700k, this.f1007i);
            }
        }
    }

    /* renamed from: a */
    public void m1146a(C0702m c0702m, C0703n c0703n) {
        if (c0702m != null) {
            if (c0703n != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playVod ");
                stringBuilder.append(c0702m.f1113c);
                stringBuilder.append(" ");
                stringBuilder.append(c0703n.f1128a);
                C0591c.m791a("PlayerView", stringBuilder.toString());
                m1138l();
                this.f999a.f1250E.m1339a(c0702m, c0703n, this.f1007i);
            }
        }
    }
}
