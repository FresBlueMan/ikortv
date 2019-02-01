package com.iptv2.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.iptv2.player.C0746b.C0744a;
import com.iptv2.player.C0746b.C0745b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;

public class SurfaceRenderView extends SurfaceView implements C0746b {
    /* renamed from: a */
    private C0747c f2109a;
    /* renamed from: b */
    private C0743b f2110b;

    /* renamed from: com.iptv2.player.SurfaceRenderView$b */
    private static final class C0743b implements Callback {
        /* renamed from: a */
        private SurfaceHolder f1372a;
        /* renamed from: b */
        private boolean f1373b;
        /* renamed from: c */
        private int f1374c;
        /* renamed from: d */
        private int f1375d;
        /* renamed from: e */
        private int f1376e;
        /* renamed from: f */
        private WeakReference<SurfaceRenderView> f1377f;
        /* renamed from: g */
        private Map<C0744a, Object> f1378g = new ConcurrentHashMap();

        public C0743b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f1377f = new WeakReference(surfaceRenderView);
        }

        /* renamed from: a */
        public void m1398a(@NonNull C0744a c0744a) {
            C0745b c1199a;
            this.f1378g.put(c0744a, c0744a);
            if (this.f1372a != null) {
                c1199a = new C1199a((SurfaceRenderView) this.f1377f.get(), this.f1372a);
                c0744a.mo1389a(c1199a, this.f1375d, this.f1376e);
            } else {
                c1199a = null;
            }
            if (this.f1373b) {
                if (c1199a == null) {
                    c1199a = new C1199a((SurfaceRenderView) this.f1377f.get(), this.f1372a);
                }
                c0744a.mo1390a(c1199a, this.f1374c, this.f1375d, this.f1376e);
            }
        }

        /* renamed from: b */
        public void m1399b(@NonNull C0744a c0744a) {
            this.f1378g.remove(c0744a);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f1372a = surfaceHolder;
            this.f1373b = false;
            this.f1374c = 0;
            this.f1375d = 0;
            this.f1376e = 0;
            C0745b c1199a = new C1199a((SurfaceRenderView) this.f1377f.get(), this.f1372a);
            for (C0744a a : this.f1378g.keySet()) {
                a.mo1389a(c1199a, 0, 0);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f1372a = null;
            this.f1373b = false;
            this.f1374c = 0;
            this.f1375d = 0;
            this.f1376e = 0;
            surfaceHolder = new C1199a((SurfaceRenderView) this.f1377f.get(), this.f1372a);
            for (C0744a a : this.f1378g.keySet()) {
                a.mo1388a(surfaceHolder);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f1372a = surfaceHolder;
            this.f1373b = true;
            this.f1374c = i;
            this.f1375d = i2;
            this.f1376e = i3;
            surfaceHolder = new C1199a((SurfaceRenderView) this.f1377f.get(), this.f1372a);
            for (C0744a a : this.f1378g.keySet()) {
                a.mo1390a(surfaceHolder, i, i2, i3);
            }
        }
    }

    /* renamed from: com.iptv2.player.SurfaceRenderView$a */
    private static final class C1199a implements C0745b {
        /* renamed from: a */
        private SurfaceRenderView f2107a;
        /* renamed from: b */
        private SurfaceHolder f2108b;

        public C1199a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.f2107a = surfaceRenderView;
            this.f2108b = surfaceHolder;
        }

        /* renamed from: a */
        public void mo1392a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (VERSION.SDK_INT >= 16 && (iMediaPlayer instanceof ISurfaceTextureHolder)) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f2108b);
            }
        }

        @NonNull
        /* renamed from: a */
        public C0746b mo1391a() {
            return this.f2107a;
        }

        @Nullable
        /* renamed from: b */
        public SurfaceHolder mo1393b() {
            return this.f2108b;
        }
    }

    /* renamed from: a */
    public boolean mo1396a() {
        return true;
    }

    public View getView() {
        return this;
    }

    public SurfaceRenderView(Context context) {
        super(context);
        m2490a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2490a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2490a(context);
    }

    /* renamed from: a */
    private void m2490a(Context context) {
        this.f2109a = new C0747c(this);
        this.f2110b = new C0743b(this);
        getHolder().addCallback(this.f2110b);
        getHolder().setType(0);
    }

    /* renamed from: a */
    public void mo1394a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f2109a.m1413a(i, i2);
            getHolder().setFixedSize(i, i2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo1397b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f2109a.m1416b(i, i2);
            requestLayout();
        }
    }

    public void setVideoRotation(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SurfaceView doesn't support rotation (");
        stringBuilder.append(i);
        stringBuilder.append(")!\n");
        Log.e("", stringBuilder.toString());
    }

    public void setAspectRatio(int i) {
        this.f2109a.m1415b(i);
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        this.f2109a.m1417c(i, i2);
        setMeasuredDimension(this.f2109a.m1411a(), this.f2109a.m1414b());
    }

    /* renamed from: a */
    public void mo1395a(C0744a c0744a) {
        this.f2110b.m1398a(c0744a);
    }

    /* renamed from: b */
    public void mo1398b(C0744a c0744a) {
        this.f2110b.m1399b(c0744a);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
        }
    }
}
