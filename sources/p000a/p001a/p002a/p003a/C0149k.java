package p000a.p001a.p002a.p003a;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: HttpEntity */
/* renamed from: a.a.a.a.k */
public interface C0149k {
    @Deprecated
    void consumeContent();

    InputStream getContent();

    C0082e getContentEncoding();

    long getContentLength();

    C0082e getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(OutputStream outputStream);
}
