package p000a.p001a.p002a.p003a.p020g;

import java.io.InputStream;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: HttpEntityWrapper */
/* renamed from: a.a.a.a.g.f */
public class C0832f implements C0149k {
    protected C0149k wrappedEntity;

    public C0832f(C0149k c0149k) {
        this.wrappedEntity = (C0149k) C0160a.m478a((Object) c0149k, "Wrapped entity");
    }

    public boolean isRepeatable() {
        return this.wrappedEntity.isRepeatable();
    }

    public boolean isChunked() {
        return this.wrappedEntity.isChunked();
    }

    public long getContentLength() {
        return this.wrappedEntity.getContentLength();
    }

    public C0082e getContentType() {
        return this.wrappedEntity.getContentType();
    }

    public C0082e getContentEncoding() {
        return this.wrappedEntity.getContentEncoding();
    }

    public InputStream getContent() {
        return this.wrappedEntity.getContent();
    }

    public void writeTo(OutputStream outputStream) {
        this.wrappedEntity.writeTo(outputStream);
    }

    public boolean isStreaming() {
        return this.wrappedEntity.isStreaming();
    }

    @Deprecated
    public void consumeContent() {
        this.wrappedEntity.consumeContent();
    }
}
