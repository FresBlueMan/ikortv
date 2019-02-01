package com.iptv2.player;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.SurfaceHolder;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: IRenderView */
/* renamed from: com.iptv2.player.b */
public interface C0746b {

    /* compiled from: IRenderView */
    /* renamed from: com.iptv2.player.b$a */
    public interface C0744a {
        /* renamed from: a */
        void mo1388a(@NonNull C0745b c0745b);

        /* renamed from: a */
        void mo1389a(@NonNull C0745b c0745b, int i, int i2);

        /* renamed from: a */
        void mo1390a(@NonNull C0745b c0745b, int i, int i2, int i3);
    }

    /* compiled from: IRenderView */
    /* renamed from: com.iptv2.player.b$b */
    public interface C0745b {
        @NonNull
        /* renamed from: a */
        C0746b mo1391a();

        /* renamed from: a */
        void mo1392a(IMediaPlayer iMediaPlayer);

        @Nullable
        /* renamed from: b */
        SurfaceHolder mo1393b();
    }

    /* renamed from: a */
    void mo1394a(int i, int i2);

    /* renamed from: a */
    void mo1395a(@NonNull C0744a c0744a);

    /* renamed from: a */
    boolean mo1396a();

    /* renamed from: b */
    void mo1397b(int i, int i2);

    /* renamed from: b */
    void mo1398b(@NonNull C0744a c0744a);

    View getView();

    void setAspectRatio(int i);

    void setVideoRotation(int i);
}
