package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.memory.MemoryCache;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class LruMemoryCache implements MemoryCache {
    private final LinkedHashMap<String, Bitmap> map;
    private final int maxSize;
    private int size;

    public LruMemoryCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Bitmap get(String str) {
        if (str != null) {
            Bitmap bitmap;
            synchronized (this) {
                bitmap = (Bitmap) this.map.get(str);
            }
            return bitmap;
        }
        throw new NullPointerException("key == null");
    }

    public final boolean put(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.size += sizeOf(str, bitmap);
            bitmap = (Bitmap) this.map.put(str, bitmap);
            if (bitmap != null) {
                this.size -= sizeOf(str, bitmap);
            }
        }
        trimToSize(this.maxSize);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void trimToSize(int r4) {
        /*
        r3 = this;
    L_0x0000:
        monitor-enter(r3);
        r0 = r3.size;	 Catch:{ all -> 0x006f }
        if (r0 < 0) goto L_0x0050;
    L_0x0005:
        r0 = r3.map;	 Catch:{ all -> 0x006f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = r3.size;	 Catch:{ all -> 0x006f }
        if (r0 != 0) goto L_0x0050;
    L_0x0011:
        r0 = r3.size;	 Catch:{ all -> 0x006f }
        if (r0 <= r4) goto L_0x004e;
    L_0x0015:
        r0 = r3.map;	 Catch:{ all -> 0x006f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x004e;
    L_0x001e:
        r0 = r3.map;	 Catch:{ all -> 0x006f }
        r0 = r0.entrySet();	 Catch:{ all -> 0x006f }
        r0 = r0.iterator();	 Catch:{ all -> 0x006f }
        r0 = r0.next();	 Catch:{ all -> 0x006f }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x006f }
        if (r0 != 0) goto L_0x0032;
    L_0x0030:
        monitor-exit(r3);	 Catch:{ all -> 0x006f }
        goto L_0x004f;
    L_0x0032:
        r1 = r0.getKey();	 Catch:{ all -> 0x006f }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x006f }
        r0 = r0.getValue();	 Catch:{ all -> 0x006f }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x006f }
        r2 = r3.map;	 Catch:{ all -> 0x006f }
        r2.remove(r1);	 Catch:{ all -> 0x006f }
        r2 = r3.size;	 Catch:{ all -> 0x006f }
        r0 = r3.sizeOf(r1, r0);	 Catch:{ all -> 0x006f }
        r2 = r2 - r0;
        r3.size = r2;	 Catch:{ all -> 0x006f }
        monitor-exit(r3);	 Catch:{ all -> 0x006f }
        goto L_0x0000;
    L_0x004e:
        monitor-exit(r3);	 Catch:{ all -> 0x006f }
    L_0x004f:
        return;
    L_0x0050:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006f }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006f }
        r0.<init>();	 Catch:{ all -> 0x006f }
        r1 = r3.getClass();	 Catch:{ all -> 0x006f }
        r1 = r1.getName();	 Catch:{ all -> 0x006f }
        r0.append(r1);	 Catch:{ all -> 0x006f }
        r1 = ".sizeOf() is reporting inconsistent results!";
        r0.append(r1);	 Catch:{ all -> 0x006f }
        r0 = r0.toString();	 Catch:{ all -> 0x006f }
        r4.<init>(r0);	 Catch:{ all -> 0x006f }
        throw r4;	 Catch:{ all -> 0x006f }
    L_0x006f:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x006f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache.trimToSize(int):void");
    }

    public final Bitmap remove(String str) {
        if (str != null) {
            Bitmap bitmap;
            synchronized (this) {
                bitmap = (Bitmap) this.map.remove(str);
                if (bitmap != null) {
                    this.size -= sizeOf(str, bitmap);
                }
            }
            return bitmap;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> keys() {
        Collection hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.map.keySet());
        }
        return hashSet;
    }

    public void clear() {
        trimToSize(-1);
    }

    private int sizeOf(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.maxSize)});
    }
}
