package com.nostra13.universalimageloader.utils;

import com.nostra13.universalimageloader.cache.disc.DiskCache;
import java.io.File;

public final class DiskCacheUtils {
    private DiskCacheUtils() {
    }

    public static File findInCache(String str, DiskCache diskCache) {
        str = diskCache.get(str);
        return (str == null || str.exists() == null) ? null : str;
    }

    public static boolean removeFromCache(String str, DiskCache diskCache) {
        str = diskCache.get(str);
        return (str == null || str.exists() == null || str.delete() == null) ? null : true;
    }
}
