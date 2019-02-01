package p000a.p001a.p002a.p003a.p020g;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0165f;

/* compiled from: BufferedHttpEntity */
/* renamed from: a.a.a.a.g.c */
public class C1257c extends C0832f {
    /* renamed from: a */
    private final byte[] f2134a;

    public boolean isRepeatable() {
        return true;
    }

    public C1257c(C0149k c0149k) {
        super(c0149k);
        if (c0149k.isRepeatable()) {
            if (c0149k.getContentLength() >= 0) {
                this.f2134a = null;
                return;
            }
        }
        this.f2134a = C0165f.m521b(c0149k);
    }

    public long getContentLength() {
        if (this.f2134a != null) {
            return (long) this.f2134a.length;
        }
        return super.getContentLength();
    }

    public InputStream getContent() {
        if (this.f2134a != null) {
            return new ByteArrayInputStream(this.f2134a);
        }
        return super.getContent();
    }

    public boolean isChunked() {
        return this.f2134a == null && super.isChunked();
    }

    public void writeTo(OutputStream outputStream) {
        C0160a.m478a((Object) outputStream, "Output stream");
        if (this.f2134a != null) {
            outputStream.write(this.f2134a);
        } else {
            super.writeTo(outputStream);
        }
    }

    public boolean isStreaming() {
        return this.f2134a == null && super.isStreaming();
    }
}
