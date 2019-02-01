package p000a.p001a.p002a.p003a.p020g;

import com.loopj.android.http.AsyncHttpClient;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.p031k.C0894b;

/* compiled from: AbstractHttpEntity */
/* renamed from: a.a.a.a.g.a */
public abstract class C0831a implements C0149k {
    /* renamed from: a */
    protected C0082e f1457a;
    /* renamed from: b */
    protected C0082e f1458b;
    /* renamed from: c */
    protected boolean f1459c;

    @Deprecated
    public void consumeContent() {
    }

    protected C0831a() {
    }

    public C0082e getContentType() {
        return this.f1457a;
    }

    public C0082e getContentEncoding() {
        return this.f1458b;
    }

    public boolean isChunked() {
        return this.f1459c;
    }

    /* renamed from: a */
    public void m1555a(C0082e c0082e) {
        this.f1457a = c0082e;
    }

    /* renamed from: a */
    public void m1556a(String str) {
        m1555a(str != null ? new C0894b(AsyncHttpClient.HEADER_CONTENT_TYPE, str) : null);
    }

    /* renamed from: b */
    public void m1558b(C0082e c0082e) {
        this.f1458b = c0082e;
    }

    /* renamed from: a */
    public void m1557a(boolean z) {
        this.f1459c = z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        if (this.f1457a != null) {
            stringBuilder.append("Content-Type: ");
            stringBuilder.append(this.f1457a.mo122d());
            stringBuilder.append(',');
        }
        if (this.f1458b != null) {
            stringBuilder.append("Content-Encoding: ");
            stringBuilder.append(this.f1458b.mo122d());
            stringBuilder.append(',');
        }
        long contentLength = getContentLength();
        if (contentLength >= 0) {
            stringBuilder.append("Content-Length: ");
            stringBuilder.append(contentLength);
            stringBuilder.append(',');
        }
        stringBuilder.append("Chunked: ");
        stringBuilder.append(this.f1459c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
