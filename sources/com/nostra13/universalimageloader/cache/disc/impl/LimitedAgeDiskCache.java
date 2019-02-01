package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import com.nostra13.universalimageloader.utils.IoUtils.CopyListener;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LimitedAgeDiskCache extends BaseDiskCache {
    private final Map<File, Long> loadingDates;
    private final long maxFileAge;

    public LimitedAgeDiskCache(File file, long j) {
        this(file, null, DefaultConfigurationFactory.createFileNameGenerator(), j);
    }

    public LimitedAgeDiskCache(File file, File file2, long j) {
        this(file, file2, DefaultConfigurationFactory.createFileNameGenerator(), j);
    }

    public LimitedAgeDiskCache(File file, File file2, FileNameGenerator fileNameGenerator, long j) {
        super(file, file2, fileNameGenerator);
        this.loadingDates = Collections.synchronizedMap(new HashMap());
        this.maxFileAge = j * 1000;
    }

    public File get(String str) {
        str = super.get(str);
        if (str != null && str.exists()) {
            Object obj;
            Long l = (Long) this.loadingDates.get(str);
            if (l == null) {
                l = Long.valueOf(str.lastModified());
                obj = null;
            } else {
                obj = 1;
            }
            if (System.currentTimeMillis() - l.longValue() > this.maxFileAge) {
                str.delete();
                this.loadingDates.remove(str);
            } else if (obj == null) {
                this.loadingDates.put(str, l);
            }
        }
        return str;
    }

    public boolean save(String str, InputStream inputStream, CopyListener copyListener) {
        inputStream = super.save(str, inputStream, copyListener);
        rememberUsage(str);
        return inputStream;
    }

    public boolean save(String str, Bitmap bitmap) {
        bitmap = super.save(str, bitmap);
        rememberUsage(str);
        return bitmap;
    }

    public boolean remove(String str) {
        this.loadingDates.remove(getFile(str));
        return super.remove(str);
    }

    public void clear() {
        super.clear();
        this.loadingDates.clear();
    }

    private void rememberUsage(String str) {
        str = getFile(str);
        long currentTimeMillis = System.currentTimeMillis();
        str.setLastModified(currentTimeMillis);
        this.loadingDates.put(str, Long.valueOf(currentTimeMillis));
    }
}
