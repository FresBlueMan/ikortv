package com.iptv2.player;

import java.io.File;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* compiled from: FileMediaDataSource */
/* renamed from: com.iptv2.player.a */
public class C1202a implements IMediaDataSource {
    /* renamed from: a */
    private RandomAccessFile f2125a;
    /* renamed from: b */
    private long f2126b = this.f2125a.length();

    public C1202a(File file) {
        this.f2125a = new RandomAccessFile(file, "r");
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (this.f2125a.getFilePointer() != j) {
            this.f2125a.seek(j);
        }
        if (i2 == 0) {
            return 0;
        }
        return this.f2125a.read(bArr, 0, i2);
    }

    public long getSize() {
        return this.f2126b;
    }

    public void close() {
        this.f2126b = 0;
        this.f2125a.close();
        this.f2125a = null;
    }
}
