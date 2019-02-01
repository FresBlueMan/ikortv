package com.iptv2.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
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
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;

@TargetApi(14)
public class TextureRenderView extends TextureView implements C0746b {
    /* renamed from: a */
    private C0747c f2123a;
    /* renamed from: b */
    private C1201b f2124b;

    /* renamed from: com.iptv2.player.TextureRenderView$a */
    private static final class C1200a implements C0745b {
        /* renamed from: a */
        private TextureRenderView f2111a;
        /* renamed from: b */
        private SurfaceTexture f2112b;
        /* renamed from: c */
        private ISurfaceTextureHost f2113c;

        @Nullable
        /* renamed from: b */
        public SurfaceHolder mo1393b() {
            return null;
        }

        public C1200a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.f2111a = textureRenderView;
            this.f2112b = surfaceTexture;
            this.f2113c = iSurfaceTextureHost;
        }

        @TargetApi(16)
        /* renamed from: a */
        public void mo1392a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (VERSION.SDK_INT < 16 || !(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                    iMediaPlayer.setSurface(m2499c());
                } else {
                    ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
                    this.f2111a.f2124b.m2503a(false);
                    SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        this.f2111a.setSurfaceTexture(surfaceTexture);
                    } else {
                        iSurfaceTextureHolder.setSurfaceTexture(this.f2112b);
                        iSurfaceTextureHolder.setSurfaceTextureHost(this.f2111a.f2124b);
                    }
                }
            }
        }

        @NonNull
        /* renamed from: a */
        public C0746b mo1391a() {
            return this.f2111a;
        }

        @Nullable
        /* renamed from: c */
        public Surface m2499c() {
            if (this.f2112b == null) {
                return null;
            }
            return new Surface(this.f2112b);
        }
    }

    /* renamed from: com.iptv2.player.TextureRenderView$b */
    private static final class C1201b implements SurfaceTextureListener, ISurfaceTextureHost {
        /* renamed from: a */
        private SurfaceTexture f2114a;
        /* renamed from: b */
        private boolean f2115b;
        /* renamed from: c */
        private int f2116c;
        /* renamed from: d */
        private int f2117d;
        /* renamed from: e */
        private boolean f2118e = true;
        /* renamed from: f */
        private boolean f2119f = false;
        /* renamed from: g */
        private boolean f2120g = false;
        /* renamed from: h */
        private WeakReference<TextureRenderView> f2121h;
        /* renamed from: i */
        private Map<C0744a, Object> f2122i = new ConcurrentHashMap();

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public C1201b(@NonNull TextureRenderView textureRenderView) {
            this.f2121h = new WeakReference(textureRenderView);
        }

        /* renamed from: a */
        public void m2503a(boolean z) {
            this.f2118e = z;
        }

        /* renamed from: a */
        public void m2502a(@NonNull C0744a c0744a) {
            C0745b c1200a;
            this.f2122i.put(c0744a, c0744a);
            if (this.f2114a != null) {
                c1200a = new C1200a((TextureRenderView) this.f2121h.get(), this.f2114a, this);
                c0744a.mo1389a(c1200a, this.f2116c, this.f2117d);
            } else {
                c1200a = null;
            }
            if (this.f2115b) {
                if (c1200a == null) {
                    c1200a = new C1200a((TextureRenderView) this.f2121h.get(), this.f2114a, this);
                }
                c0744a.mo1390a(c1200a, 0, this.f2116c, this.f2117d);
            }
        }

        /* renamed from: b */
        public void m2505b(@NonNull C0744a c0744a) {
            this.f2122i.remove(c0744a);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f2114a = surfaceTexture;
            this.f2115b = false;
            this.f2116c = 0;
            this.f2117d = 0;
            i2 = new C1200a((TextureRenderView) this.f2121h.get(), surfaceTexture, this);
            for (C0744a a : this.f2122i.keySet()) {
                a.mo1389a(i2, 0, 0);
            }
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f2114a = surfaceTexture;
            this.f2115b = true;
            this.f2116c = i;
            this.f2117d = i2;
            C0745b c1200a = new C1200a((TextureRenderView) this.f2121h.get(), surfaceTexture, this);
            for (C0744a a : this.f2122i.keySet()) {
                a.mo1390a(c1200a, 0, i, i2);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f2114a = surfaceTexture;
            this.f2115b = false;
            this.f2116c = 0;
            this.f2117d = 0;
            C0745b c1200a = new C1200a((TextureRenderView) this.f2121h.get(), surfaceTexture, this);
            for (C0744a a : this.f2122i.keySet()) {
                a.mo1388a(c1200a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onSurfaceTextureDestroyed: destroy: ");
            stringBuilder.append(this.f2118e);
            Log.d("TextureRenderView", stringBuilder.toString());
            return this.f2118e;
        }

        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: null");
            } else if (this.f2120g) {
                if (surfaceTexture != this.f2114a) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                } else if (this.f2118e) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                } else {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                }
            } else if (this.f2119f) {
                if (surfaceTexture != this.f2114a) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                } else if (this.f2118e == null) {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    m2503a(true);
                } else {
                    Log.d("TextureRenderView", "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                }
            } else if (surfaceTexture != this.f2114a) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (this.f2118e == null) {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                m2503a(true);
            } else {
                Log.d("TextureRenderView", "releaseSurfaceTexture: alive: will released by TextureView");
            }
        }

        /* renamed from: a */
        public void m2501a() {
            Log.d("TextureRenderView", "willDetachFromWindow()");
            this.f2119f = true;
        }

        /* renamed from: b */
        public void m2504b() {
            Log.d("TextureRenderView", "didDetachFromWindow()");
            this.f2120g = true;
        }
    }

    /* renamed from: a */
    public boolean mo1396a() {
        return false;
    }

    public View getView() {
        return this;
    }

    public TextureRenderView(Context context) {
        super(context);
        m2507a(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2507a(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2507a(context);
    }

    /* renamed from: a */
    private void m2507a(Context context) {
        this.f2123a = new C0747c(this);
        this.f2124b = new C1201b(this);
        setSurfaceTextureListener(this.f2124b);
    }

    protected void onDetachedFromWindow() {
        this.f2124b.m2501a();
        super.onDetachedFromWindow();
        this.f2124b.m2504b();
    }

    /* renamed from: a */
    public void mo1394a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f2123a.m1413a(i, i2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo1397b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f2123a.m1416b(i, i2);
            requestLayout();
        }
    }

    public void setVideoRotation(int i) {
        this.f2123a.m1412a(i);
        setRotation((float) i);
    }

    public void setAspectRatio(int i) {
        this.f2123a.m1415b(i);
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        this.f2123a.m1417c(i, i2);
        setMeasuredDimension(this.f2123a.m1411a(), this.f2123a.m1414b());
    }

    public C0745b getSurfaceHolder() {
        return new C1200a(this, this.f2124b.f2114a, this.f2124b);
    }

    /* renamed from: a */
    public void mo1395a(C0744a c0744a) {
        this.f2124b.m2502a(c0744a);
    }

    /* renamed from: b */
    public void mo1398b(C0744a c0744a) {
        this.f2124b.m2505b(c0744a);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }
}
