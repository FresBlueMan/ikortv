package p000a.p001a.p002a.p003a;

import p000a.p001a.p002a.p003a.p032l.C0152e;

/* compiled from: HttpMessage */
/* renamed from: a.a.a.a.p */
public interface C0169p {
    void addHeader(C0082e c0082e);

    void addHeader(String str, String str2);

    boolean containsHeader(String str);

    C0082e[] getAllHeaders();

    C0082e getFirstHeader(String str);

    C0082e[] getHeaders(String str);

    @Deprecated
    C0152e getParams();

    ac getProtocolVersion();

    C0098h headerIterator();

    C0098h headerIterator(String str);

    void removeHeader(C0082e c0082e);

    void removeHeaders(String str);

    void setHeader(String str, String str2);

    void setHeaders(C0082e[] c0082eArr);

    @Deprecated
    void setParams(C0152e c0152e);
}
