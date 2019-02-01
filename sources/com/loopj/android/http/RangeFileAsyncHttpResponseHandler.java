package com.loopj.android.http;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.af;
import p000a.p001a.p002a.p003a.p005b.C0812l;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public abstract class RangeFileAsyncHttpResponseHandler extends FileAsyncHttpResponseHandler {
    private static final String LOG_TAG = "RangeFileAsyncHttpRH";
    private boolean append = null;
    private long current = 0;

    public RangeFileAsyncHttpResponseHandler(File file) {
        super(file);
    }

    public void sendResponseMessage(C0916s c0916s) {
        if (!Thread.currentThread().isInterrupted()) {
            af a = c0916s.mo1628a();
            if (a.mo147b() == 416) {
                if (!Thread.currentThread().isInterrupted()) {
                    sendSuccessMessage(a.mo147b(), c0916s.getAllHeaders(), null);
                }
            } else if (a.mo147b() >= IjkMediaCodecInfo.RANK_SECURE) {
                if (!Thread.currentThread().isInterrupted()) {
                    sendFailureMessage(a.mo147b(), c0916s.getAllHeaders(), null, new C0812l(a.mo147b(), a.mo148c()));
                }
            } else if (!Thread.currentThread().isInterrupted()) {
                C0082e firstHeader = c0916s.getFirstHeader(AsyncHttpClient.HEADER_CONTENT_RANGE);
                if (firstHeader == null) {
                    this.append = false;
                    this.current = 0;
                } else {
                    LogInterface logInterface = AsyncHttpClient.log;
                    String str = LOG_TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Content-Range: ");
                    stringBuilder.append(firstHeader.mo122d());
                    logInterface.mo1439v(str, stringBuilder.toString());
                }
                sendSuccessMessage(a.mo147b(), c0916s.getAllHeaders(), getResponseData(c0916s.mo1630b()));
            }
        }
    }

    protected byte[] getResponseData(C0149k c0149k) {
        if (c0149k != null) {
            InputStream content = c0149k.getContent();
            long contentLength = c0149k.getContentLength() + this.current;
            c0149k = new FileOutputStream(getTargetFile(), this.append);
            if (content != null) {
                try {
                    byte[] bArr = new byte[4096];
                    while (this.current < contentLength) {
                        int read = content.read(bArr);
                        if (read == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        this.current += (long) read;
                        c0149k.write(bArr, 0, read);
                        sendProgressMessage(this.current, contentLength);
                    }
                    content.close();
                    c0149k.flush();
                    c0149k.close();
                } catch (Throwable th) {
                    content.close();
                    c0149k.flush();
                    c0149k.close();
                }
            }
        }
        return null;
    }

    public void updateRequestHeaders(C1238l c1238l) {
        if (this.file.exists() && this.file.canWrite()) {
            this.current = this.file.length();
        }
        if (this.current > 0) {
            this.append = true;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bytes=");
            stringBuilder.append(this.current);
            stringBuilder.append("-");
            c1238l.setHeader("Range", stringBuilder.toString());
        }
    }
}
