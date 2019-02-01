package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.utils.C0778L;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class LimitedMemoryCache extends BaseMemoryCache {
    private static final int MAX_NORMAL_CACHE_SIZE = 16777216;
    private static final int MAX_NORMAL_CACHE_SIZE_IN_MB = 16;
    private final AtomicInteger cacheSize;
    private final List<Bitmap> hardCache = Collections.synchronizedList(new LinkedList());
    private final int sizeLimit;

    protected abstract int getSize(Bitmap bitmap);

    protected abstract Bitmap removeNext();

    public LimitedMemoryCache(int i) {
        this.sizeLimit = i;
        this.cacheSize = new AtomicInteger();
        if (i > 16777216) {
            C0778L.m1433w("You set too large memory cache size (more than %1$d Mb)", Integer.valueOf(16));
        }
    }

    public boolean put(String str, Bitmap bitmap) {
        boolean z;
        int size = getSize(bitmap);
        int sizeLimit = getSizeLimit();
        int i = this.cacheSize.get();
        if (size < sizeLimit) {
            while (i + size > sizeLimit) {
                Bitmap removeNext = removeNext();
                if (this.hardCache.remove(removeNext)) {
                    i = this.cacheSize.addAndGet(-getSize(removeNext));
                }
            }
            this.hardCache.add(bitmap);
            this.cacheSize.addAndGet(size);
            z = true;
        } else {
            z = false;
        }
        super.put(str, bitmap);
        return z;
    }

    public Bitmap remove(String str) {
        Bitmap bitmap = super.get(str);
        if (bitmap != null && this.hardCache.remove(bitmap)) {
            this.cacheSize.addAndGet(-getSize(bitmap));
        }
        return super.remove(str);
    }

    public void clear() {
        this.hardCache.clear();
        this.cacheSize.set(0);
        super.clear();
    }

    protected int getSizeLimit() {
        return this.sizeLimit;
    }
}
