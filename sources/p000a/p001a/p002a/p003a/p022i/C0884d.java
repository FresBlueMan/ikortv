package p000a.p001a.p002a.p003a.p022i;

import java.util.Locale;
import p000a.p001a.p002a.p003a.ad;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* compiled from: EnglishReasonPhraseCatalog */
/* renamed from: a.a.a.a.i.d */
public class C0884d implements ad {
    /* renamed from: a */
    public static final C0884d f1612a = new C0884d();
    /* renamed from: b */
    private static final String[][] f1613b = new String[][]{null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        C0884d.m1798a(200, "OK");
        C0884d.m1798a(201, "Created");
        C0884d.m1798a(202, "Accepted");
        C0884d.m1798a(204, "No Content");
        C0884d.m1798a(301, "Moved Permanently");
        C0884d.m1798a(302, "Moved Temporarily");
        C0884d.m1798a(304, "Not Modified");
        C0884d.m1798a(400, "Bad Request");
        C0884d.m1798a(401, "Unauthorized");
        C0884d.m1798a(403, "Forbidden");
        C0884d.m1798a(404, "Not Found");
        C0884d.m1798a(500, "Internal Server Error");
        C0884d.m1798a(501, "Not Implemented");
        C0884d.m1798a(502, "Bad Gateway");
        C0884d.m1798a(503, "Service Unavailable");
        C0884d.m1798a(100, "Continue");
        C0884d.m1798a(307, "Temporary Redirect");
        C0884d.m1798a(405, "Method Not Allowed");
        C0884d.m1798a(409, "Conflict");
        C0884d.m1798a(412, "Precondition Failed");
        C0884d.m1798a(413, "Request Too Long");
        C0884d.m1798a(414, "Request-URI Too Long");
        C0884d.m1798a(415, "Unsupported Media Type");
        C0884d.m1798a((int) IjkMediaCodecInfo.RANK_SECURE, "Multiple Choices");
        C0884d.m1798a(303, "See Other");
        C0884d.m1798a(305, "Use Proxy");
        C0884d.m1798a(402, "Payment Required");
        C0884d.m1798a(406, "Not Acceptable");
        C0884d.m1798a(407, "Proxy Authentication Required");
        C0884d.m1798a(408, "Request Timeout");
        C0884d.m1798a(101, "Switching Protocols");
        C0884d.m1798a(203, "Non Authoritative Information");
        C0884d.m1798a(205, "Reset Content");
        C0884d.m1798a(206, "Partial Content");
        C0884d.m1798a(504, "Gateway Timeout");
        C0884d.m1798a(505, "Http Version Not Supported");
        C0884d.m1798a(410, "Gone");
        C0884d.m1798a(411, "Length Required");
        C0884d.m1798a(416, "Requested Range Not Satisfiable");
        C0884d.m1798a(417, "Expectation Failed");
        C0884d.m1798a(102, "Processing");
        C0884d.m1798a(207, "Multi-Status");
        C0884d.m1798a(422, "Unprocessable Entity");
        C0884d.m1798a(419, "Insufficient Space On Resource");
        C0884d.m1798a(420, "Method Failure");
        C0884d.m1798a(423, "Locked");
        C0884d.m1798a(507, "Insufficient Storage");
        C0884d.m1798a(424, "Failed Dependency");
    }

    protected C0884d() {
    }

    /* renamed from: a */
    public String mo102a(int i, Locale locale) {
        boolean z = (i < 100 || i >= IjkMediaCodecInfo.RANK_LAST_CHANCE) ? null : true;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown category for status code ");
        stringBuilder.append(i);
        C0160a.m480a(z, stringBuilder.toString());
        locale = i / 100;
        i -= locale * 100;
        if (f1613b[locale].length > i) {
            return f1613b[locale][i];
        }
        return null;
    }

    /* renamed from: a */
    private static void m1798a(int i, String str) {
        int i2 = i / 100;
        f1613b[i2][i - (i2 * 100)] = str;
    }
}
