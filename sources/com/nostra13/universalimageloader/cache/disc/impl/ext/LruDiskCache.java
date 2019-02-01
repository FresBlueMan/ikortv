package com.nostra13.universalimageloader.cache.disc.impl.ext;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.disc.impl.ext.DiskLruCache.Snapshot;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.utils.C0778L;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.IoUtils.CopyListener;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LruDiskCache implements DiskCache {
    public static final int DEFAULT_BUFFER_SIZE = 32768;
    public static final CompressFormat DEFAULT_COMPRESS_FORMAT = CompressFormat.PNG;
    public static final int DEFAULT_COMPRESS_QUALITY = 100;
    private static final String ERROR_ARG_NEGATIVE = " argument must be positive number";
    private static final String ERROR_ARG_NULL = " argument must be not null";
    protected int bufferSize;
    protected DiskLruCache cache;
    protected CompressFormat compressFormat;
    protected int compressQuality;
    protected final FileNameGenerator fileNameGenerator;
    private File reserveCacheDir;

    public LruDiskCache(File file, FileNameGenerator fileNameGenerator, long j) {
        this(file, null, fileNameGenerator, j, 0);
    }

    public LruDiskCache(File file, File file2, FileNameGenerator fileNameGenerator, long j, int i) {
        this.bufferSize = 32768;
        this.compressFormat = DEFAULT_COMPRESS_FORMAT;
        this.compressQuality = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (j < 0) {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        } else if (i < 0) {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        } else if (fileNameGenerator != null) {
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            long j2 = j;
            int i2 = i == 0 ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i;
            this.reserveCacheDir = file2;
            this.fileNameGenerator = fileNameGenerator;
            initCache(file, file2, j2, i2);
        } else {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
    }

    private void initCache(File file, File file2, long j, int i) {
        try {
            this.cache = DiskLruCache.open(file, 1, 1, j, i);
        } catch (File file3) {
            C0778L.m1430e(file3);
            if (file2 != null) {
                initCache(file2, null, j, i);
            }
            if (this.cache == null) {
                throw file3;
            }
        }
    }

    public File getDirectory() {
        return this.cache.getDirectory();
    }

    public File get(String str) {
        Throwable e;
        Snapshot snapshot = null;
        try {
            File file;
            str = this.cache.get(getKey(str));
            if (str != null) {
                try {
                    file = str.getFile(0);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        C0778L.m1430e(e);
                        if (str != null) {
                            str.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        snapshot = str;
                        str = th2;
                        if (snapshot != null) {
                            snapshot.close();
                        }
                        throw str;
                    }
                }
            }
            if (str != null) {
                str.close();
            }
            return file;
        } catch (IOException e3) {
            e = e3;
            str = null;
            C0778L.m1430e(e);
            if (str != null) {
                str.close();
            }
            return null;
        } catch (Throwable th3) {
            str = th3;
            if (snapshot != null) {
                snapshot.close();
            }
            throw str;
        }
    }

    public boolean save(String str, InputStream inputStream, CopyListener copyListener) {
        str = this.cache.edit(getKey(str));
        if (str == null) {
            return false;
        }
        Closeable bufferedOutputStream = new BufferedOutputStream(str.newOutputStream(0), this.bufferSize);
        try {
            inputStream = IoUtils.copyStream(inputStream, bufferedOutputStream, copyListener, this.bufferSize);
            IoUtils.closeSilently(bufferedOutputStream);
            if (inputStream != null) {
                str.commit();
            } else {
                str.abort();
            }
            return inputStream;
        } catch (Throwable th) {
            IoUtils.closeSilently(bufferedOutputStream);
            str.abort();
        }
    }

    public boolean save(String str, Bitmap bitmap) {
        str = this.cache.edit(getKey(str));
        if (str == null) {
            return false;
        }
        Closeable bufferedOutputStream = new BufferedOutputStream(str.newOutputStream(0), this.bufferSize);
        try {
            bitmap = bitmap.compress(this.compressFormat, this.compressQuality, bufferedOutputStream);
            if (bitmap != null) {
                str.commit();
            } else {
                str.abort();
            }
            return bitmap;
        } finally {
            IoUtils.closeSilently(bufferedOutputStream);
        }
    }

    public boolean remove(String str) {
        try {
            return this.cache.remove(getKey(str));
        } catch (String str2) {
            C0778L.m1430e(str2);
            return null;
        }
    }

    public void close() {
        try {
            this.cache.close();
        } catch (Throwable e) {
            C0778L.m1430e(e);
        }
        this.cache = null;
    }

    public void clear() {
        try {
            this.cache.delete();
        } catch (Throwable e) {
            C0778L.m1430e(e);
        }
        try {
            initCache(this.cache.getDirectory(), this.reserveCacheDir, this.cache.getMaxSize(), this.cache.getMaxFileCount());
        } catch (Throwable e2) {
            C0778L.m1430e(e2);
        }
    }

    private String getKey(String str) {
        return this.fileNameGenerator.generate(str);
    }

    public void setBufferSize(int i) {
        this.bufferSize = i;
    }

    public void setCompressFormat(CompressFormat compressFormat) {
        this.compressFormat = compressFormat;
    }

    public void setCompressQuality(int i) {
        this.compressQuality = i;
    }
}
