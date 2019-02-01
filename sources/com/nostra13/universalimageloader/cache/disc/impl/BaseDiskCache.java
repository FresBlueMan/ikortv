package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.IoUtils.CopyListener;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class BaseDiskCache implements DiskCache {
    public static final int DEFAULT_BUFFER_SIZE = 32768;
    public static final CompressFormat DEFAULT_COMPRESS_FORMAT = CompressFormat.PNG;
    public static final int DEFAULT_COMPRESS_QUALITY = 100;
    private static final String ERROR_ARG_NULL = " argument must be not null";
    private static final String TEMP_IMAGE_POSTFIX = ".tmp";
    protected int bufferSize;
    protected final File cacheDir;
    protected CompressFormat compressFormat;
    protected int compressQuality;
    protected final FileNameGenerator fileNameGenerator;
    protected final File reserveCacheDir;

    public void close() {
    }

    public BaseDiskCache(File file) {
        this(file, null);
    }

    public BaseDiskCache(File file, File file2) {
        this(file, file2, DefaultConfigurationFactory.createFileNameGenerator());
    }

    public BaseDiskCache(File file, File file2, FileNameGenerator fileNameGenerator) {
        this.bufferSize = 32768;
        this.compressFormat = DEFAULT_COMPRESS_FORMAT;
        this.compressQuality = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (fileNameGenerator != null) {
            this.cacheDir = file;
            this.reserveCacheDir = file2;
            this.fileNameGenerator = fileNameGenerator;
        } else {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
    }

    public File getDirectory() {
        return this.cacheDir;
    }

    public File get(String str) {
        return getFile(str);
    }

    public boolean save(String str, InputStream inputStream, CopyListener copyListener) {
        str = getFile(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.getAbsolutePath());
        stringBuilder.append(TEMP_IMAGE_POSTFIX);
        File file = new File(stringBuilder.toString());
        Closeable bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
            inputStream = IoUtils.copyStream(inputStream, bufferedOutputStream, copyListener, this.bufferSize);
            try {
                IoUtils.closeSilently(bufferedOutputStream);
                if (inputStream != null && file.renameTo(str) == null) {
                    inputStream = null;
                }
                if (inputStream == null) {
                    file.delete();
                }
                return inputStream;
            } catch (Throwable th) {
                copyListener = th;
                if (inputStream != null && file.renameTo(str) == null) {
                    inputStream = null;
                }
                if (inputStream == null) {
                    file.delete();
                }
                throw copyListener;
            }
        } catch (Throwable th2) {
            copyListener = th2;
            inputStream = null;
            inputStream = null;
            if (inputStream == null) {
                file.delete();
            }
            throw copyListener;
        }
    }

    public boolean save(String str, Bitmap bitmap) {
        str = getFile(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.getAbsolutePath());
        stringBuilder.append(TEMP_IMAGE_POSTFIX);
        File file = new File(stringBuilder.toString());
        Closeable bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
        try {
            boolean compress = bitmap.compress(this.compressFormat, this.compressQuality, bufferedOutputStream);
            IoUtils.closeSilently(bufferedOutputStream);
            if (compress && file.renameTo(str) == null) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            IoUtils.closeSilently(bufferedOutputStream);
            file.delete();
        }
    }

    public boolean remove(String str) {
        return getFile(str).delete();
    }

    public void clear() {
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    protected File getFile(String str) {
        str = this.fileNameGenerator.generate(str);
        File file = this.cacheDir;
        if (!(this.cacheDir.exists() || this.cacheDir.mkdirs() || this.reserveCacheDir == null || (!this.reserveCacheDir.exists() && !this.reserveCacheDir.mkdirs()))) {
            file = this.reserveCacheDir;
        }
        return new File(file, str);
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
