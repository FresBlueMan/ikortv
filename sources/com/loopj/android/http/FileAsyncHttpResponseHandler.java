package com.loopj.android.http;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;

public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "FileAsyncHttpRH";
    protected final boolean append;
    protected final File file;
    protected File frontendFile;
    protected final boolean renameIfExists;

    public abstract void onFailure(int i, C0082e[] c0082eArr, Throwable th, File file);

    public abstract void onSuccess(int i, C0082e[] c0082eArr, File file);

    public FileAsyncHttpResponseHandler(File file) {
        this(file, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean z) {
        this(file, z, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean z, boolean z2) {
        this(file, z, z2, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean z, boolean z2, boolean z3) {
        super(z3);
        Utils.asserts(file != null, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
        if (!(file.isDirectory() || file.getParentFile().isDirectory())) {
            Utils.asserts(file.getParentFile().mkdirs(), "Cannot create parent directories for requested File location");
        }
        if (file.isDirectory() && !file.mkdirs()) {
            AsyncHttpClient.log.mo1428d(LOG_TAG, "Cannot create directories for requested Directory location, might not be a problem");
        }
        this.file = file;
        this.append = z;
        this.renameIfExists = z2;
    }

    public FileAsyncHttpResponseHandler(Context context) {
        this.file = getTemporaryFile(context);
        this.append = false;
        this.renameIfExists = false;
    }

    public boolean deleteTargetFile() {
        return getTargetFile() != null && getTargetFile().delete();
    }

    protected File getTemporaryFile(Context context) {
        Utils.asserts(context != null, "Tried creating temporary file without having Context");
        try {
            return File.createTempFile("temp_", "_handled", context.getCacheDir());
        } catch (Context context2) {
            AsyncHttpClient.log.mo1431e(LOG_TAG, "Cannot create temporary file", context2);
            return null;
        }
    }

    protected File getOriginalFile() {
        Utils.asserts(this.file != null, "Target file is null, fatal!");
        return this.file;
    }

    public File getTargetFile() {
        if (this.frontendFile == null) {
            this.frontendFile = getOriginalFile().isDirectory() ? getTargetFileByParsingURL() : getOriginalFile();
        }
        return this.frontendFile;
    }

    protected File getTargetFileByParsingURL() {
        Utils.asserts(getOriginalFile().isDirectory(), "Target file is not a directory, cannot proceed");
        Utils.asserts(getRequestURI() != null, "RequestURI is null, cannot proceed");
        String uri = getRequestURI().toString();
        uri = uri.substring(uri.lastIndexOf(47) + 1, uri.length());
        File file = new File(getOriginalFile(), uri);
        if (!file.exists() || !this.renameIfExists) {
            return file;
        }
        StringBuilder stringBuilder;
        if (uri.contains(".")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(uri.substring(0, uri.lastIndexOf(46)));
            stringBuilder.append(" (%d)");
            stringBuilder.append(uri.substring(uri.lastIndexOf(46), uri.length()));
            uri = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(uri);
            stringBuilder.append(" (%d)");
            uri = stringBuilder.toString();
        }
        int i = 0;
        while (true) {
            File file2 = new File(getOriginalFile(), String.format(uri, new Object[]{Integer.valueOf(i)}));
            if (!file2.exists()) {
                return file2;
            }
            i++;
        }
    }

    public final void onFailure(int i, C0082e[] c0082eArr, byte[] bArr, Throwable th) {
        onFailure(i, c0082eArr, th, getTargetFile());
    }

    public final void onSuccess(int i, C0082e[] c0082eArr, byte[] bArr) {
        onSuccess(i, c0082eArr, getTargetFile());
    }

    protected byte[] getResponseData(C0149k c0149k) {
        if (c0149k != null) {
            InputStream content = c0149k.getContent();
            long contentLength = c0149k.getContentLength();
            c0149k = new FileOutputStream(getTargetFile(), this.append);
            if (content != null) {
                try {
                    byte[] bArr = new byte[4096];
                    int i = 0;
                    while (true) {
                        int read = content.read(bArr);
                        if (read == -1 || Thread.currentThread().isInterrupted()) {
                            AsyncHttpClient.silentCloseInputStream(content);
                            c0149k.flush();
                            AsyncHttpClient.silentCloseOutputStream(c0149k);
                        } else {
                            i += read;
                            c0149k.write(bArr, 0, read);
                            sendProgressMessage((long) i, contentLength);
                        }
                    }
                    AsyncHttpClient.silentCloseInputStream(content);
                    c0149k.flush();
                    AsyncHttpClient.silentCloseOutputStream(c0149k);
                } catch (Throwable th) {
                    AsyncHttpClient.silentCloseInputStream(content);
                    c0149k.flush();
                    AsyncHttpClient.silentCloseOutputStream(c0149k);
                }
            }
        }
        return null;
    }
}
