package com.iptv2.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.TextView;
import com.iptv2.p043b.C0591c;
import com.iptv2.player.C0746b.C0744a;
import com.iptv2.player.C0746b.C0745b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;

public class IjkVideoView extends FrameLayout implements MediaPlayerControl {
    /* renamed from: O */
    private static final int[] f1326O = new int[]{0, 1, 2, 3, 4, 5};
    /* renamed from: A */
    private C0746b f1327A;
    /* renamed from: B */
    private int f1328B;
    /* renamed from: C */
    private int f1329C;
    /* renamed from: D */
    private long f1330D = 0;
    /* renamed from: E */
    private long f1331E = 0;
    /* renamed from: F */
    private long f1332F = 0;
    /* renamed from: G */
    private long f1333G = 0;
    /* renamed from: H */
    private TextView f1334H;
    /* renamed from: I */
    private OnCompletionListener f1335I = new C11923(this);
    /* renamed from: J */
    private OnInfoListener f1336J = new C11934(this);
    /* renamed from: K */
    private OnErrorListener f1337K = new C11945(this);
    /* renamed from: L */
    private OnBufferingUpdateListener f1338L = new C11956(this);
    /* renamed from: M */
    private OnSeekCompleteListener f1339M = new C11967(this);
    /* renamed from: N */
    private OnTimedTextListener f1340N = new C11978(this);
    /* renamed from: P */
    private int f1341P = f1326O[3];
    /* renamed from: Q */
    private List<Integer> f1342Q = new ArrayList();
    /* renamed from: R */
    private int f1343R = 0;
    /* renamed from: S */
    private int f1344S = 0;
    /* renamed from: T */
    private C0742a f1345T;
    /* renamed from: a */
    OnVideoSizeChangedListener f1346a = new C11901(this);
    /* renamed from: b */
    OnPreparedListener f1347b = new C11912(this);
    /* renamed from: c */
    C0744a f1348c = new C11989(this);
    /* renamed from: d */
    private String f1349d = "IjkVideoView";
    /* renamed from: e */
    private Uri f1350e;
    /* renamed from: f */
    private Map<String, String> f1351f;
    /* renamed from: g */
    private int f1352g = 0;
    /* renamed from: h */
    private int f1353h = 0;
    /* renamed from: i */
    private C0745b f1354i = null;
    /* renamed from: j */
    private IMediaPlayer f1355j = null;
    /* renamed from: k */
    private int f1356k;
    /* renamed from: l */
    private int f1357l;
    /* renamed from: m */
    private int f1358m;
    /* renamed from: n */
    private int f1359n;
    /* renamed from: o */
    private int f1360o;
    /* renamed from: p */
    private OnCompletionListener f1361p;
    /* renamed from: q */
    private OnPreparedListener f1362q;
    /* renamed from: r */
    private int f1363r;
    /* renamed from: s */
    private OnErrorListener f1364s;
    /* renamed from: t */
    private OnInfoListener f1365t;
    /* renamed from: u */
    private OnSeekCompleteListener f1366u;
    /* renamed from: v */
    private int f1367v;
    /* renamed from: w */
    private boolean f1368w = true;
    /* renamed from: x */
    private boolean f1369x = true;
    /* renamed from: y */
    private boolean f1370y = true;
    /* renamed from: z */
    private Context f1371z;

    /* renamed from: com.iptv2.player.IjkVideoView$a */
    public interface C0742a {
        /* renamed from: a */
        IMediaPlayer mo1381a();
    }

    /* renamed from: com.iptv2.player.IjkVideoView$1 */
    class C11901 implements OnVideoSizeChangedListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2098a;

        C11901(IjkVideoView ijkVideoView) {
            this.f2098a = ijkVideoView;
        }

        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            this.f2098a.f1356k = iMediaPlayer.getVideoWidth();
            this.f2098a.f1357l = iMediaPlayer.getVideoHeight();
            this.f2098a.f1328B = iMediaPlayer.getVideoSarNum();
            this.f2098a.f1329C = iMediaPlayer.getVideoSarDen();
            if (this.f2098a.f1356k != null && this.f2098a.f1357l != null) {
                if (this.f2098a.f1327A != null) {
                    this.f2098a.f1327A.mo1394a(this.f2098a.f1356k, this.f2098a.f1357l);
                    this.f2098a.f1327A.mo1397b(this.f2098a.f1328B, this.f2098a.f1329C);
                }
                this.f2098a.requestLayout();
            }
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$2 */
    class C11912 implements OnPreparedListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2099a;

        C11912(IjkVideoView ijkVideoView) {
            this.f2099a = ijkVideoView;
        }

        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f2099a.f1331E = System.currentTimeMillis();
            this.f2099a.f1352g = 2;
            if (this.f2099a.f1362q != null) {
                this.f2099a.f1362q.onPrepared(this.f2099a.f1355j);
            }
            this.f2099a.f1356k = iMediaPlayer.getVideoWidth();
            this.f2099a.f1357l = iMediaPlayer.getVideoHeight();
            iMediaPlayer = this.f2099a.f1367v;
            if (iMediaPlayer != null) {
                this.f2099a.seekTo(iMediaPlayer);
            }
            if (this.f2099a.f1356k == 0 || this.f2099a.f1357l == 0) {
                if (this.f2099a.f1353h == 3) {
                    this.f2099a.start();
                }
            } else if (this.f2099a.f1327A != null) {
                this.f2099a.f1327A.mo1394a(this.f2099a.f1356k, this.f2099a.f1357l);
                this.f2099a.f1327A.mo1397b(this.f2099a.f1328B, this.f2099a.f1329C);
                if (this.f2099a.f1327A.mo1396a() && (this.f2099a.f1358m != this.f2099a.f1356k || this.f2099a.f1359n != this.f2099a.f1357l)) {
                    return;
                }
                if (this.f2099a.f1353h == 3) {
                    this.f2099a.start();
                } else if (!this.f2099a.isPlaying() && iMediaPlayer == null) {
                    iMediaPlayer = this.f2099a.getCurrentPosition();
                }
            }
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$3 */
    class C11923 implements OnCompletionListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2100a;

        C11923(IjkVideoView ijkVideoView) {
            this.f2100a = ijkVideoView;
        }

        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f2100a.f1352g = 5;
            this.f2100a.f1353h = 5;
            if (this.f2100a.f1361p != null) {
                this.f2100a.f1361p.onCompletion(this.f2100a.f1355j);
            }
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$4 */
    class C11934 implements OnInfoListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2101a;

        C11934(IjkVideoView ijkVideoView) {
            this.f2101a = ijkVideoView;
        }

        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            if (this.f2101a.f1365t != null) {
                this.f2101a.f1365t.onInfo(iMediaPlayer, i, i2);
            }
            switch (i) {
                case 3:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    break;
                case 700:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                    break;
                case IMediaPlayer.MEDIA_INFO_BUFFERING_START /*701*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_BUFFERING_START:");
                    break;
                case IMediaPlayer.MEDIA_INFO_BUFFERING_END /*702*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_BUFFERING_END:");
                    break;
                case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /*703*/:
                    iMediaPlayer = this.f2101a.f1349d;
                    i = new StringBuilder();
                    i.append("MEDIA_INFO_NETWORK_BANDWIDTH: ");
                    i.append(i2);
                    Log.d(iMediaPlayer, i.toString());
                    break;
                case 800:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_BAD_INTERLEAVING:");
                    break;
                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /*801*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_NOT_SEEKABLE:");
                    break;
                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /*802*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_METADATA_UPDATE:");
                    break;
                case IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE /*901*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                    break;
                case IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT /*902*/:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                    break;
                case 10001:
                    this.f2101a.f1360o = i2;
                    iMediaPlayer = this.f2101a.f1349d;
                    i = new StringBuilder();
                    i.append("MEDIA_INFO_VIDEO_ROTATION_CHANGED: ");
                    i.append(i2);
                    Log.d(iMediaPlayer, i.toString());
                    if (this.f2101a.f1327A != null) {
                        this.f2101a.f1327A.setVideoRotation(i2);
                        break;
                    }
                    break;
                case 10002:
                    Log.d(this.f2101a.f1349d, "MEDIA_INFO_AUDIO_RENDERING_START:");
                    break;
                default:
                    break;
            }
            return true;
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$5 */
    class C11945 implements OnErrorListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2102a;

        C11945(IjkVideoView ijkVideoView) {
            this.f2102a = ijkVideoView;
        }

        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            iMediaPlayer = this.f2102a.f1349d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error: ");
            stringBuilder.append(i);
            stringBuilder.append(",");
            stringBuilder.append(i2);
            Log.d(iMediaPlayer, stringBuilder.toString());
            this.f2102a.f1352g = -1;
            this.f2102a.f1353h = -1;
            if ((this.f2102a.f1364s == null || this.f2102a.f1364s.onError(this.f2102a.f1355j, i, i2) == null) && this.f2102a.getWindowToken() != null) {
                this.f2102a.f1371z.getResources();
                Log.e(this.f2102a.f1349d, i == 200 ? "VideoView_error_text_invalid_progressive_playback" : "VideoView_error_text_unknown");
            }
            return true;
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$6 */
    class C11956 implements OnBufferingUpdateListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2103a;

        C11956(IjkVideoView ijkVideoView) {
            this.f2103a = ijkVideoView;
        }

        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            this.f2103a.f1363r = i;
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$7 */
    class C11967 implements OnSeekCompleteListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2104a;

        C11967(IjkVideoView ijkVideoView) {
            this.f2104a = ijkVideoView;
        }

        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f2104a.f1333G = System.currentTimeMillis();
            if (this.f2104a.f1366u != null) {
                this.f2104a.f1366u.onSeekComplete(iMediaPlayer);
            }
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$8 */
    class C11978 implements OnTimedTextListener {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2105a;

        C11978(IjkVideoView ijkVideoView) {
            this.f2105a = ijkVideoView;
        }

        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                this.f2105a.f1334H.setText(ijkTimedText.getText());
            }
        }
    }

    /* renamed from: com.iptv2.player.IjkVideoView$9 */
    class C11989 implements C0744a {
        /* renamed from: a */
        final /* synthetic */ IjkVideoView f2106a;

        C11989(IjkVideoView ijkVideoView) {
            this.f2106a = ijkVideoView;
        }

        /* renamed from: a */
        public void mo1390a(@NonNull C0745b c0745b, int i, int i2, int i3) {
            if (c0745b.mo1391a() != this.f2106a.f1327A) {
                Log.e(this.f2106a.f1349d, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f2106a.f1358m = i2;
            this.f2106a.f1359n = i3;
            Object obj = null;
            c0745b = this.f2106a.f1353h == 3 ? true : null;
            if (this.f2106a.f1327A.mo1396a() == 0 || (this.f2106a.f1356k == i2 && this.f2106a.f1357l == i3)) {
                obj = 1;
            }
            if (!(this.f2106a.f1355j == 0 || c0745b == null || r0 == null)) {
                if (this.f2106a.f1367v != null) {
                    this.f2106a.seekTo(this.f2106a.f1367v);
                }
                this.f2106a.start();
            }
        }

        /* renamed from: a */
        public void mo1389a(@NonNull C0745b c0745b, int i, int i2) {
            if (c0745b.mo1391a() != this.f2106a.f1327A) {
                Log.e(this.f2106a.f1349d, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f2106a.f1354i = c0745b;
            if (this.f2106a.f1355j != 0) {
                this.f2106a.m1359a((IMediaPlayer) this.f2106a.f1355j, c0745b);
            } else {
                this.f2106a.m1373g();
            }
        }

        /* renamed from: a */
        public void mo1388a(@NonNull C0745b c0745b) {
            if (c0745b.mo1391a() != this.f2106a.f1327A) {
                Log.e(this.f2106a.f1349d, "onSurfaceDestroyed: unmatched render callback\n");
                return;
            }
            this.f2106a.f1354i = null;
            this.f2106a.m1393b();
        }
    }

    public int getAudioSessionId() {
        return 0;
    }

    public IjkVideoView(Context context) {
        super(context);
        m1356a(context);
    }

    public IjkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1356a(context);
    }

    public IjkVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1356a(context);
    }

    @TargetApi(21)
    public IjkVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1356a(context);
    }

    /* renamed from: a */
    private void m1356a(Context context) {
        this.f1371z = context.getApplicationContext();
        m1376h();
        this.f1356k = 0;
        this.f1357l = 0;
        this.f1352g = 0;
        this.f1353h = 0;
    }

    public void setRenderView(C0746b c0746b) {
        if (this.f1327A != null) {
            if (this.f1355j != null) {
                this.f1355j.setDisplay(null);
            }
            View view = this.f1327A.getView();
            this.f1327A.mo1398b(this.f1348c);
            this.f1327A = null;
            removeView(view);
        }
        if (c0746b != null) {
            this.f1327A = c0746b;
            c0746b.setAspectRatio(this.f1341P);
            if (this.f1356k > 0 && this.f1357l > 0) {
                c0746b.mo1394a(this.f1356k, this.f1357l);
            }
            if (this.f1328B > 0 && this.f1329C > 0) {
                c0746b.mo1397b(this.f1328B, this.f1329C);
            }
            c0746b = this.f1327A.getView();
            c0746b.setLayoutParams(new LayoutParams(-2, -2, 17));
            addView(c0746b);
            this.f1327A.mo1395a(this.f1348c);
            this.f1327A.setVideoRotation(this.f1360o);
        }
    }

    public void setRender(int i) {
        switch (i) {
            case 0:
                setRenderView(0);
                return;
            case 1:
                setRenderView(new SurfaceRenderView(getContext()));
                return;
            case 2:
                i = new TextureRenderView(getContext());
                if (this.f1355j != null) {
                    i.getSurfaceHolder().mo1392a(this.f1355j);
                    i.mo1394a(this.f1355j.getVideoWidth(), this.f1355j.getVideoHeight());
                    i.mo1397b(this.f1355j.getVideoSarNum(), this.f1355j.getVideoSarDen());
                    i.setAspectRatio(this.f1341P);
                }
                setRenderView(i);
                return;
            default:
                Log.e(this.f1349d, String.format(Locale.getDefault(), "invalid render %d\n", new Object[]{Integer.valueOf(i)}));
                return;
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        m1357a(uri, null);
    }

    /* renamed from: a */
    private void m1357a(Uri uri, Map<String, String> map) {
        this.f1350e = uri;
        this.f1351f = map;
        this.f1367v = null;
        m1373g();
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public void m1390a() {
        if (this.f1355j != null) {
            this.f1355j.stop();
            this.f1355j.release();
            this.f1355j = null;
            this.f1352g = 0;
            this.f1353h = 0;
            ((AudioManager) this.f1371z.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @TargetApi(23)
    /* renamed from: g */
    private void m1373g() {
        String str;
        StringBuilder stringBuilder;
        if (this.f1350e != null) {
            if (this.f1354i != null) {
                m1391a(false);
                ((AudioManager) this.f1371z.getSystemService("audio")).requestAudioFocus(null, 3, 1);
                try {
                    this.f1355j = m1395d();
                    getContext();
                    this.f1355j.setOnPreparedListener(this.f1347b);
                    this.f1355j.setOnVideoSizeChangedListener(this.f1346a);
                    this.f1355j.setOnCompletionListener(this.f1335I);
                    this.f1355j.setOnErrorListener(this.f1337K);
                    this.f1355j.setOnInfoListener(this.f1336J);
                    this.f1355j.setOnBufferingUpdateListener(this.f1338L);
                    this.f1355j.setOnSeekCompleteListener(this.f1339M);
                    this.f1355j.setOnTimedTextListener(this.f1340N);
                    this.f1363r = 0;
                    Object scheme = this.f1350e.getScheme();
                    if (VERSION.SDK_INT >= 23 && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase("file"))) {
                        this.f1355j.setDataSource(new C1202a(new File(this.f1350e.toString())));
                    } else if (VERSION.SDK_INT >= 14) {
                        this.f1355j.setDataSource(this.f1371z, this.f1350e, this.f1351f);
                    } else {
                        this.f1355j.setDataSource(this.f1350e.toString());
                    }
                    m1359a(this.f1355j, this.f1354i);
                    this.f1355j.setAudioStreamType(3);
                    this.f1355j.setScreenOnWhilePlaying(true);
                    this.f1330D = System.currentTimeMillis();
                    this.f1355j.prepareAsync();
                    this.f1352g = 1;
                } catch (Throwable e) {
                    str = this.f1349d;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to open content: ");
                    stringBuilder.append(this.f1350e);
                    Log.w(str, stringBuilder.toString(), e);
                    this.f1352g = -1;
                    this.f1353h = -1;
                    this.f1337K.onError(this.f1355j, 1, 0);
                } catch (Throwable e2) {
                    str = this.f1349d;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to open content: ");
                    stringBuilder.append(this.f1350e);
                    Log.w(str, stringBuilder.toString(), e2);
                    this.f1352g = -1;
                    this.f1353h = -1;
                    this.f1337K.onError(this.f1355j, 1, 0);
                }
            }
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.f1366u = onSeekCompleteListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f1362q = onPreparedListener;
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f1361p = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f1364s = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.f1365t = onInfoListener;
    }

    /* renamed from: a */
    private void m1359a(IMediaPlayer iMediaPlayer, C0745b c0745b) {
        if (iMediaPlayer != null) {
            if (c0745b == null) {
                iMediaPlayer.setDisplay(null);
            } else {
                c0745b.mo1392a(iMediaPlayer);
            }
        }
    }

    /* renamed from: b */
    public void m1393b() {
        if (this.f1355j != null) {
            this.f1355j.setDisplay(null);
        }
    }

    /* renamed from: a */
    public void m1391a(boolean z) {
        if (this.f1355j != null) {
            this.f1355j.reset();
            this.f1355j.release();
            this.f1355j = null;
            this.f1352g = 0;
            if (z) {
                this.f1353h = 0;
            }
            ((AudioManager) this.f1371z.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void start() {
        if (m1394c()) {
            this.f1355j.start();
            this.f1352g = 3;
        }
        this.f1353h = 3;
    }

    public void pause() {
        if (m1394c() && this.f1355j.isPlaying()) {
            this.f1355j.pause();
            this.f1352g = 4;
        }
        this.f1353h = 4;
    }

    public int getDuration() {
        return m1394c() ? (int) this.f1355j.getDuration() : -1;
    }

    public int getCurrentPosition() {
        return m1394c() ? (int) this.f1355j.getCurrentPosition() : 0;
    }

    public long getCurrentPositionLong() {
        return m1394c() ? this.f1355j.getCurrentPosition() : -1;
    }

    public void seekTo(int i) {
        if (m1394c()) {
            this.f1332F = System.currentTimeMillis();
            this.f1355j.seekTo((long) i);
            this.f1367v = 0;
            return;
        }
        this.f1367v = i;
    }

    public boolean isPlaying() {
        return m1394c() && this.f1355j.isPlaying();
    }

    public int getBufferPercentage() {
        return this.f1355j != null ? this.f1363r : 0;
    }

    /* renamed from: c */
    public boolean m1394c() {
        return (this.f1355j == null || this.f1352g == -1 || this.f1352g == 0 || this.f1352g == 1) ? false : true;
    }

    public int getPlayerState() {
        if (this.f1355j == null) {
            return 0;
        }
        return this.f1352g;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f1354i != null ? this.f1354i.mo1393b() : null;
    }

    public boolean canPause() {
        return this.f1368w;
    }

    public boolean canSeekBackward() {
        return this.f1369x;
    }

    public boolean canSeekForward() {
        return this.f1370y;
    }

    public void setAspectRatio(int i) {
        if (this.f1341P != i) {
            this.f1341P = i;
            if (this.f1327A != 0) {
                this.f1327A.setAspectRatio(this.f1341P);
            }
        }
    }

    /* renamed from: h */
    private void m1376h() {
        setRender(1);
    }

    public void setOnCreatePlayerRequestListener(C0742a c0742a) {
        this.f1345T = c0742a;
    }

    /* renamed from: d */
    public IMediaPlayer m1395d() {
        IMediaPlayer a = this.f1345T != null ? this.f1345T.mo1381a() : null;
        return a == null ? m1396e() : a;
    }

    /* renamed from: e */
    public AndroidMediaPlayer m1396e() {
        AndroidMediaPlayer androidMediaPlayer = new AndroidMediaPlayer();
        androidMediaPlayer.setLogEnabled(C0591c.f644a);
        return androidMediaPlayer;
    }

    /* renamed from: b */
    public IjkMediaPlayer m1392b(boolean z) {
        IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer();
        IjkMediaPlayer.native_setLogLevel(C0591c.f644a ? 3 : 8);
        ijkMediaPlayer.setOption(4, "max-fps", 30);
        ijkMediaPlayer.setOption(4, "framedrop", 1);
        ijkMediaPlayer.setOption(4, "video-pictq-size", 3);
        ijkMediaPlayer.setOption(4, "videotoolbox-max-frame-width", 960);
        ijkMediaPlayer.setOption(1, "auto_convert", 0);
        ijkMediaPlayer.setOption(1, "reconnect", 1);
        ijkMediaPlayer.setOption(1, "user-agent", "ijkplayer");
        ijkMediaPlayer.setOption(1, "probsize", 2048);
        ijkMediaPlayer.setOption(1, "analyzeduration", 1000000);
        ijkMediaPlayer.setOption(4, "overlay-format", 842225234);
        ijkMediaPlayer.setOption(4, "start-on-prepared", 0);
        if (z) {
            ijkMediaPlayer.setOption(4, "mediacodec", 1);
            ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 1);
            ijkMediaPlayer.setOption(4, "opensles", 1);
        } else {
            ijkMediaPlayer.setOption(4, "mediacodec", 0);
            ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 0);
            ijkMediaPlayer.setOption(4, "opensles", 0);
        }
        return ijkMediaPlayer;
    }

    /* renamed from: f */
    public boolean m1397f() {
        return m1394c() && this.f1352g == 4;
    }
}
