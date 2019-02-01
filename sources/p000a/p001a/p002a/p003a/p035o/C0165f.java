package p000a.p001a.p002a.p003a.p035o;

import java.io.InputStream;
import p000a.p001a.p002a.p003a.C0149k;

/* compiled from: EntityUtils */
/* renamed from: a.a.a.a.o.f */
public final class C0165f {
    /* renamed from: a */
    public static void m520a(C0149k c0149k) {
        if (c0149k != null && c0149k.isStreaming()) {
            c0149k = c0149k.getContent();
            if (c0149k != null) {
                c0149k.close();
            }
        }
    }

    /* renamed from: b */
    public static byte[] m521b(C0149k c0149k) {
        C0160a.m478a((Object) c0149k, "Entity");
        InputStream content = c0149k.getContent();
        if (content == null) {
            return null;
        }
        try {
            C0160a.m480a(c0149k.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            c0149k = (int) c0149k.getContentLength();
            if (c0149k < null) {
                c0149k = 4096;
            }
            C0162c c0162c = new C0162c(c0149k);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                c0162c.m490a(bArr, 0, read);
            }
            c0149k = c0162c.m493b();
            return c0149k;
        } finally {
            content.close();
        }
    }
}
