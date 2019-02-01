package p000a.p001a.p002a.p003a.p034n;

import com.loopj.android.http.AsyncHttpClient;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.ab;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: RequestContent */
/* renamed from: a.a.a.a.n.j */
public class C0910j implements C0170r {
    /* renamed from: a */
    private final boolean f1692a;

    public C0910j() {
        this(false);
    }

    public C0910j(boolean z) {
        this.f1692a = z;
    }

    public void process(C0915q c0915q, C0157e c0157e) {
        C0160a.m478a((Object) c0915q, "HTTP request");
        if ((c0915q instanceof C1285l) != null) {
            if (this.f1692a != null) {
                c0915q.removeHeaders("Transfer-Encoding");
                c0915q.removeHeaders("Content-Length");
            } else if (c0915q.containsHeader("Transfer-Encoding") != null) {
                throw new ab("Transfer-encoding header already present");
            } else if (c0915q.containsHeader("Content-Length") != null) {
                throw new ab("Content-Length header already present");
            }
            c0157e = c0915q.getRequestLine().mo144b();
            C0149k entity = ((C1285l) c0915q).getEntity();
            if (entity == null) {
                c0915q.addHeader("Content-Length", "0");
                return;
            }
            if (!entity.isChunked()) {
                if (entity.getContentLength() >= 0) {
                    c0915q.addHeader("Content-Length", Long.toString(entity.getContentLength()));
                    if (entity.getContentType() != null && c0915q.containsHeader(AsyncHttpClient.HEADER_CONTENT_TYPE) == null) {
                        c0915q.addHeader(entity.getContentType());
                    }
                    if (entity.getContentEncoding() != null && c0915q.containsHeader(AsyncHttpClient.HEADER_CONTENT_ENCODING) == null) {
                        c0915q.addHeader(entity.getContentEncoding());
                    }
                }
            }
            if (c0157e.m31c(C0917v.f1696b)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Chunked transfer encoding not allowed for ");
                stringBuilder.append(c0157e);
                throw new ab(stringBuilder.toString());
            }
            c0915q.addHeader("Transfer-Encoding", "chunked");
            c0915q.addHeader(entity.getContentType());
            c0915q.addHeader(entity.getContentEncoding());
        }
    }
}
