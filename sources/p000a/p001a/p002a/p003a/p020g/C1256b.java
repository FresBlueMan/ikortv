package p000a.p001a.p002a.p003a.p020g;

import java.io.InputStream;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0161b;

/* compiled from: BasicHttpEntity */
/* renamed from: a.a.a.a.g.b */
public class C1256b extends C0831a {
    /* renamed from: d */
    private InputStream f2132d;
    /* renamed from: e */
    private long f2133e = -1;

    public boolean isRepeatable() {
        return false;
    }

    public long getContentLength() {
        return this.f2133e;
    }

    public InputStream getContent() {
        C0161b.m485a(this.f2132d != null, "Content has not been provided");
        return this.f2132d;
    }

    /* renamed from: a */
    public void m2557a(long j) {
        this.f2133e = j;
    }

    /* renamed from: a */
    public void m2558a(InputStream inputStream) {
        this.f2132d = inputStream;
    }

    public void writeTo(OutputStream outputStream) {
        C0160a.m478a((Object) outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    public boolean isStreaming() {
        return this.f2132d != null;
    }
}
