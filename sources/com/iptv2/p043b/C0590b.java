package com.iptv2.p043b;

import android.content.Context;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.p020g.C0093e;
import p000a.p001a.p002a.p003a.p020g.C1258g;

/* compiled from: HttpUtility */
/* renamed from: com.iptv2.b.b */
public final class C0590b {

    /* compiled from: HttpUtility */
    /* renamed from: com.iptv2.b.b$a */
    public enum C0587a {
        None,
        Http,
        DecryptData,
        Unknown
    }

    /* compiled from: HttpUtility */
    /* renamed from: com.iptv2.b.b$b */
    public interface C0588b {
        /* renamed from: a */
        void mo1383a(boolean z, JSONObject jSONObject, C0587a c0587a, Throwable th);
    }

    /* compiled from: HttpUtility */
    /* renamed from: com.iptv2.b.b$c */
    public interface C0589c {
        /* renamed from: a */
        void mo1346a(boolean z, String str, C0587a c0587a, Throwable th);
    }

    /* renamed from: a */
    public static void m787a(Context context, AsyncHttpClient asyncHttpClient, String str, final C0589c c0589c) {
        asyncHttpClient.get(context, str, new TextHttpResponseHandler() {
            public void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th) {
                if (c0589c != 0) {
                    c0589c.mo1346a(null, null, C0587a.Http, th);
                }
            }

            public void onSuccess(int i, C0082e[] c0082eArr, String str) {
                if (i == 200) {
                    if (c0589c != 0) {
                        c0589c.mo1346a(true, str, C0587a.None, null);
                    }
                } else if (c0589c != 0) {
                    c0589c.mo1346a(false, str, C0587a.Http, null);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m788a(Context context, AsyncHttpClient asyncHttpClient, final Cipher cipher, final String str, final C0588b c0588b) {
        asyncHttpClient.get(context, str, new TextHttpResponseHandler() {
            public void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th) {
                c0082eArr = new StringBuilder();
                c0082eArr.append("httpGetJson [");
                c0082eArr.append(str);
                c0082eArr.append("] error,statusCode:");
                c0082eArr.append(i);
                C0591c.m793b(c0082eArr.toString());
                c0588b.mo1383a(null, null, C0587a.Http, th);
            }

            public void onSuccess(int i, C0082e[] c0082eArr, String str) {
                StringBuilder stringBuilder;
                try {
                    str = C0586a.m780b(cipher, str);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("httpGetJson [");
                    stringBuilder.append(str);
                    stringBuilder.append("] OK");
                    C0591c.m790a(stringBuilder.toString());
                    c0588b.mo1383a(true, str, C0587a.None, null);
                } catch (String str2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("httpGetJson [");
                    stringBuilder.append(str);
                    stringBuilder.append("] error:decrypt,statusCode:");
                    stringBuilder.append(i);
                    C0591c.m793b(stringBuilder.toString());
                    c0588b.mo1383a(false, null, C0587a.DecryptData, str2);
                } catch (String str22) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("httpGetJson [");
                    stringBuilder.append(str);
                    stringBuilder.append("] error:unknown,statusCode:");
                    stringBuilder.append(i);
                    C0591c.m793b(stringBuilder.toString());
                    c0588b.mo1383a(false, null, C0587a.Unknown, str22);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m789a(Context context, AsyncHttpClient asyncHttpClient, Cipher cipher, final Cipher cipher2, String str, JSONObject jSONObject, int i, final C0588b c0588b) {
        asyncHttpClient.post(context, str, new C1258g(C0586a.m774a(cipher, jSONObject, i), Charset.defaultCharset()), C0093e.f148i.m253a(), new TextHttpResponseHandler() {
            public void onFailure(int i, C0082e[] c0082eArr, String str, Throwable th) {
                c0588b.mo1383a(null, null, C0587a.Http, th);
            }

            public void onSuccess(int i, C0082e[] c0082eArr, String str) {
                try {
                    c0588b.mo1383a(true, C0586a.m780b(cipher2, str), C0587a.None, null);
                } catch (String str2) {
                    c0588b.mo1383a(false, null, C0587a.DecryptData, str2);
                } catch (String str22) {
                    c0588b.mo1383a(false, null, C0587a.Unknown, str22);
                }
            }
        });
    }
}
