package com.loopj.android.http;

import android.content.Context;
import android.os.Looper;
import android.support.v4.view.MotionEventCompat;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0172u;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.C0917v;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p004a.C0803r;
import p000a.p001a.p002a.p003a.p005b.C0033h;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p005b.C0035j;
import p000a.p001a.p002a.p003a.p005b.C0037o;
import p000a.p001a.p002a.p003a.p005b.p007c.C1238l;
import p000a.p001a.p002a.p003a.p005b.p007c.C1339e;
import p000a.p001a.p002a.p003a.p005b.p007c.C1341g;
import p000a.p001a.p002a.p003a.p005b.p007c.C1358h;
import p000a.p001a.p002a.p003a.p005b.p007c.C1359i;
import p000a.p001a.p002a.p003a.p005b.p007c.C1360j;
import p000a.p001a.p002a.p003a.p013e.C0055b;
import p000a.p001a.p002a.p003a.p013e.p014a.C0047a;
import p000a.p001a.p002a.p003a.p013e.p014a.C0815c;
import p000a.p001a.p002a.p003a.p013e.p016c.C0057e;
import p000a.p001a.p002a.p003a.p013e.p016c.C0058i;
import p000a.p001a.p002a.p003a.p013e.p016c.C0060l;
import p000a.p001a.p002a.p003a.p013e.p016c.C0821d;
import p000a.p001a.p002a.p003a.p013e.p017d.C1249i;
import p000a.p001a.p002a.p003a.p020g.C0832f;
import p000a.p001a.p002a.p003a.p022i.p023a.C1343b;
import p000a.p001a.p002a.p003a.p022i.p024b.C1324k;
import p000a.p001a.p002a.p003a.p022i.p025c.p026a.C0862g;
import p000a.p001a.p002a.p003a.p032l.C0150c;
import p000a.p001a.p002a.p003a.p032l.C0152e;
import p000a.p001a.p002a.p003a.p032l.C0153f;
import p000a.p001a.p002a.p003a.p032l.C1284b;
import p000a.p001a.p002a.p003a.p034n.C0157e;
import p000a.p001a.p002a.p003a.p034n.C0906a;
import p000a.p001a.p002a.p003a.p034n.C1288n;

public class AsyncHttpClient {
    public static final int DEFAULT_MAX_CONNECTIONS = 10;
    public static final int DEFAULT_MAX_RETRIES = 5;
    public static final int DEFAULT_RETRY_SLEEP_TIME_MILLIS = 1500;
    public static final int DEFAULT_SOCKET_BUFFER_SIZE = 8192;
    public static final int DEFAULT_SOCKET_TIMEOUT = 10000;
    public static final String ENCODING_GZIP = "gzip";
    public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEADER_CONTENT_DISPOSITION = "Content-Disposition";
    public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public static final String HEADER_CONTENT_RANGE = "Content-Range";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String LOG_TAG = "AsyncHttpClient";
    public static LogInterface log = new LogHandler();
    private final Map<String, String> clientHeaderMap;
    private int connectTimeout;
    private final C1324k httpClient;
    private final C0157e httpContext;
    private boolean isUrlEncodingEnabled;
    private int maxConnections;
    private final Map<Context, List<RequestHandle>> requestMap;
    private int responseTimeout;
    private ExecutorService threadPool;

    /* renamed from: com.loopj.android.http.AsyncHttpClient$1 */
    class C12031 implements C0170r {
        C12031() {
        }

        public void process(C0915q c0915q, C0157e c0157e) {
            if (c0915q.containsHeader(AsyncHttpClient.HEADER_ACCEPT_ENCODING) == null) {
                c0915q.addHeader(AsyncHttpClient.HEADER_ACCEPT_ENCODING, AsyncHttpClient.ENCODING_GZIP);
            }
            for (String str : AsyncHttpClient.this.clientHeaderMap.keySet()) {
                if (c0915q.containsHeader(str)) {
                    C0082e firstHeader = c0915q.getFirstHeader(str);
                    AsyncHttpClient.log.mo1428d(AsyncHttpClient.LOG_TAG, String.format("Headers were overwritten! (%s | %s) overwrites (%s | %s)", new Object[]{str, AsyncHttpClient.this.clientHeaderMap.get(str), firstHeader.mo121c(), firstHeader.mo122d()}));
                    c0915q.removeHeader(firstHeader);
                }
                c0915q.addHeader(str, (String) AsyncHttpClient.this.clientHeaderMap.get(str));
            }
        }
    }

    /* renamed from: com.loopj.android.http.AsyncHttpClient$2 */
    class C12042 implements C0172u {
        C12042() {
        }

        public void process(C0916s c0916s, C0157e c0157e) {
            c0157e = c0916s.mo1630b();
            if (c0157e != null) {
                C0082e contentEncoding = c0157e.getContentEncoding();
                if (contentEncoding != null) {
                    for (C0091f a : contentEncoding.mo123e()) {
                        if (a.mo126a().equalsIgnoreCase(AsyncHttpClient.ENCODING_GZIP)) {
                            c0916s.mo1629a(new InflatingEntity(c0157e));
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.loopj.android.http.AsyncHttpClient$3 */
    class C12053 implements C0170r {
        C12053() {
        }

        public void process(C0915q c0915q, C0157e c0157e) {
            C0006h c0006h = (C0006h) c0157e.mo159a("http.auth.target-scope");
            C0034i c0034i = (C0034i) c0157e.mo159a("http.auth.credentials-provider");
            C0159n c0159n = (C0159n) c0157e.mo159a("http.target_host");
            if (c0006h.m18c() == null) {
                C0009m a = c0034i.mo50a(new C0005g(c0159n.m470a(), c0159n.m471b()));
                if (a != null) {
                    c0006h.m13a(new C1343b());
                    c0006h.m15a(a);
                }
            }
        }
    }

    private static class InflatingEntity extends C0832f {
        GZIPInputStream gzippedStream;
        PushbackInputStream pushbackStream;
        InputStream wrappedStream;

        public InflatingEntity(C0149k c0149k) {
            super(c0149k);
        }

        public InputStream getContent() {
            this.wrappedStream = this.wrappedEntity.getContent();
            this.pushbackStream = new PushbackInputStream(this.wrappedStream, 2);
            if (!AsyncHttpClient.isInputStreamGZIPCompressed(this.pushbackStream)) {
                return this.pushbackStream;
            }
            this.gzippedStream = new GZIPInputStream(this.pushbackStream);
            return this.gzippedStream;
        }

        public long getContentLength() {
            return this.wrappedEntity == null ? 0 : this.wrappedEntity.getContentLength();
        }

        public void consumeContent() {
            AsyncHttpClient.silentCloseInputStream(this.wrappedStream);
            AsyncHttpClient.silentCloseInputStream(this.pushbackStream);
            AsyncHttpClient.silentCloseInputStream(this.gzippedStream);
            super.consumeContent();
        }
    }

    public AsyncHttpClient() {
        this(false, 80, 443);
    }

    public AsyncHttpClient(int i) {
        this(false, i, 443);
    }

    public AsyncHttpClient(int i, int i2) {
        this(false, i, i2);
    }

    public AsyncHttpClient(boolean z, int i, int i2) {
        this(getDefaultSchemeRegistry(z, i, i2));
    }

    public AsyncHttpClient(C0058i c0058i) {
        this.maxConnections = 10;
        this.connectTimeout = DEFAULT_SOCKET_TIMEOUT;
        this.responseTimeout = DEFAULT_SOCKET_TIMEOUT;
        boolean z = true;
        this.isUrlEncodingEnabled = true;
        C0152e c1284b = new C1284b();
        C0047a.m149a(c1284b, (long) this.connectTimeout);
        C0047a.m150a(c1284b, new C0815c(this.maxConnections));
        C0047a.m148a(c1284b, 10);
        C0150c.m429a(c1284b, this.responseTimeout);
        C0150c.m433c(c1284b, this.connectTimeout);
        C0150c.m430a(c1284b, true);
        C0150c.m431b(c1284b, 8192);
        C0153f.m450a(c1284b, C0917v.f1697c);
        c0058i = createConnectionManager(c0058i, c1284b);
        if (c0058i == null) {
            z = false;
        }
        Utils.asserts(z, "Custom implementation of #createConnectionManager(SchemeRegistry, BasicHttpParams) returned null");
        this.threadPool = getDefaultThreadPool();
        this.requestMap = Collections.synchronizedMap(new WeakHashMap());
        this.clientHeaderMap = new HashMap();
        this.httpContext = new C1288n(new C0906a());
        this.httpClient = new C1324k(c0058i, c1284b);
        this.httpClient.m2594a(new C12031());
        this.httpClient.m2596a(new C12042());
        this.httpClient.m2595a(new C12053(), 0);
        this.httpClient.m2592a(new RetryHandler(5, DEFAULT_RETRY_SLEEP_TIME_MILLIS));
    }

    private static C0058i getDefaultSchemeRegistry(boolean z, int i, int i2) {
        C0060l fixedSocketFactory;
        if (z) {
            log.mo1428d(LOG_TAG, "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.");
        }
        if (i < 1) {
            i = 80;
            log.mo1428d(LOG_TAG, "Invalid HTTP port number specified, defaulting to 80");
        }
        if (i2 < 1) {
            i2 = 443;
            log.mo1428d(LOG_TAG, "Invalid HTTPS port number specified, defaulting to 443");
        }
        if (z) {
            fixedSocketFactory = MySSLSocketFactory.getFixedSocketFactory();
        } else {
            fixedSocketFactory = C1249i.getSocketFactory();
        }
        C0058i c0058i = new C0058i();
        c0058i.m176a(new C0057e("http", C0821d.m1526a(), i));
        c0058i.m176a(new C0057e("https", fixedSocketFactory, i2));
        return c0058i;
    }

    public static void allowRetryExceptionClass(Class<?> cls) {
        if (cls != null) {
            RetryHandler.addClassToWhitelist(cls);
        }
    }

    public static void blockRetryExceptionClass(Class<?> cls) {
        if (cls != null) {
            RetryHandler.addClassToBlacklist(cls);
        }
    }

    public static String getUrlWithQueryString(boolean z, String str, RequestParams requestParams) {
        if (str == null) {
            return false;
        }
        if (z) {
            try {
                URL url = new URL(URLDecoder.decode(str, AsyncHttpResponseHandler.DEFAULT_CHARSET));
                z = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
            } catch (boolean z2) {
                log.mo1431e(LOG_TAG, "getUrlWithQueryString encoding URL", z2);
            }
            if (requestParams != null) {
                str = requestParams.getParamString().trim();
                if (str.equals("") == null && str.equals("?") == null) {
                    requestParams = new StringBuilder();
                    requestParams.append(z2);
                    requestParams.append(z2.contains("?") ? "&" : "?");
                    z2 = requestParams.toString();
                    requestParams = new StringBuilder();
                    requestParams.append(z2);
                    requestParams.append(str);
                    z2 = requestParams.toString();
                }
            }
            return z2;
        }
        z2 = str;
        if (requestParams != null) {
            str = requestParams.getParamString().trim();
            requestParams = new StringBuilder();
            requestParams.append(z2);
            if (z2.contains("?")) {
            }
            requestParams.append(z2.contains("?") ? "&" : "?");
            z2 = requestParams.toString();
            requestParams = new StringBuilder();
            requestParams.append(z2);
            requestParams.append(str);
            z2 = requestParams.toString();
        }
        return z2;
    }

    public static boolean isInputStreamGZIPCompressed(PushbackInputStream pushbackInputStream) {
        boolean z = false;
        if (pushbackInputStream == null) {
            return false;
        }
        byte[] bArr = new byte[2];
        int i = 0;
        while (i < 2) {
            try {
                int read = pushbackInputStream.read(bArr, i, 2 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } finally {
                pushbackInputStream.unread(bArr, 0, i);
            }
        }
        pushbackInputStream.unread(bArr, 0, i);
        if (35615 == ((bArr[0] & 255) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
            z = true;
        }
        return z;
    }

    public static void silentCloseInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (InputStream inputStream2) {
                log.mo1442w(LOG_TAG, "Cannot close input stream", inputStream2);
            }
        }
    }

    public static void silentCloseOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (OutputStream outputStream2) {
                log.mo1442w(LOG_TAG, "Cannot close output stream", outputStream2);
            }
        }
    }

    public static void endEntityViaReflection(C0149k c0149k) {
        if (c0149k instanceof C0832f) {
            Field field = null;
            try {
                for (Field field2 : C0832f.class.getDeclaredFields()) {
                    if (field2.getName().equals("wrappedEntity")) {
                        field = field2;
                        break;
                    }
                }
                if (field != null) {
                    field.setAccessible(true);
                    c0149k = (C0149k) field.get(c0149k);
                    if (c0149k != null) {
                        c0149k.consumeContent();
                    }
                }
            } catch (C0149k c0149k2) {
                log.mo1431e(LOG_TAG, "wrappedEntity consume", c0149k2);
            }
        }
    }

    public C0035j getHttpClient() {
        return this.httpClient;
    }

    public C0157e getHttpContext() {
        return this.httpContext;
    }

    public boolean isLoggingEnabled() {
        return log.isLoggingEnabled();
    }

    public void setLoggingEnabled(boolean z) {
        log.setLoggingEnabled(z);
    }

    public int getLoggingLevel() {
        return log.getLoggingLevel();
    }

    public void setLoggingLevel(int i) {
        log.setLoggingLevel(i);
    }

    public LogInterface getLogInterface() {
        return log;
    }

    public void setLogInterface(LogInterface logInterface) {
        if (logInterface != null) {
            log = logInterface;
        }
    }

    public void setCookieStore(C0033h c0033h) {
        this.httpContext.mo160a("http.cookie-store", c0033h);
    }

    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    public void setThreadPool(ExecutorService executorService) {
        this.threadPool = executorService;
    }

    protected ExecutorService getDefaultThreadPool() {
        return Executors.newCachedThreadPool();
    }

    protected C0055b createConnectionManager(C0058i c0058i, C1284b c1284b) {
        return new C0862g(c1284b, c0058i);
    }

    public void setEnableRedirects(boolean z, boolean z2, boolean z3) {
        this.httpClient.m2613q().mo156b("http.protocol.reject-relative-redirect", z2 ^ 1);
        this.httpClient.m2613q().mo156b("http.protocol.allow-circular-redirects", z3);
        this.httpClient.m2593a((C0037o) new MyRedirectHandler(z));
    }

    public void setEnableRedirects(boolean z, boolean z2) {
        setEnableRedirects(z, z2, true);
    }

    public void setEnableRedirects(boolean z) {
        setEnableRedirects(z, z, z);
    }

    public void setRedirectHandler(C0037o c0037o) {
        this.httpClient.m2593a(c0037o);
    }

    public void setUserAgent(String str) {
        C0153f.m453b(this.httpClient.m2613q(), str);
    }

    public int getMaxConnections() {
        return this.maxConnections;
    }

    public void setMaxConnections(int i) {
        if (i < 1) {
            i = 10;
        }
        this.maxConnections = i;
        C0047a.m150a(this.httpClient.m2613q(), new C0815c(this.maxConnections));
    }

    public void setTimeout(int i) {
        if (i < 1000) {
            i = DEFAULT_SOCKET_TIMEOUT;
        }
        setConnectTimeout(i);
        setResponseTimeout(i);
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(int i) {
        if (i < 1000) {
            i = DEFAULT_SOCKET_TIMEOUT;
        }
        this.connectTimeout = i;
        C0152e q = this.httpClient.m2613q();
        C0047a.m149a(q, (long) this.connectTimeout);
        C0150c.m433c(q, this.connectTimeout);
    }

    public int getResponseTimeout() {
        return this.responseTimeout;
    }

    public void setResponseTimeout(int i) {
        if (i < 1000) {
            i = DEFAULT_SOCKET_TIMEOUT;
        }
        this.responseTimeout = i;
        C0150c.m429a(this.httpClient.m2613q(), this.responseTimeout);
    }

    public void setProxy(String str, int i) {
        this.httpClient.m2613q().mo1601a("http.route.default-proxy", new C0159n(str, i));
    }

    public void setProxy(String str, int i, String str2, String str3) {
        this.httpClient.m2584E().mo52a(new C0005g(str, i), new C0803r(str2, str3));
        this.httpClient.m2613q().mo1601a("http.route.default-proxy", new C0159n(str, i));
    }

    public void setSSLSocketFactory(C1249i c1249i) {
        this.httpClient.m2614r().mo68a().m176a(new C0057e("https", (C0060l) c1249i, 443));
    }

    public void setMaxRetriesAndTimeout(int i, int i2) {
        this.httpClient.m2592a(new RetryHandler(i, i2));
    }

    public void removeAllHeaders() {
        this.clientHeaderMap.clear();
    }

    public void addHeader(String str, String str2) {
        this.clientHeaderMap.put(str, str2);
    }

    public void removeHeader(String str) {
        this.clientHeaderMap.remove(str);
    }

    public void setBasicAuth(String str, String str2) {
        setBasicAuth(str, str2, false);
    }

    public void setBasicAuth(String str, String str2, boolean z) {
        setBasicAuth(str, str2, null, z);
    }

    public void setBasicAuth(String str, String str2, C0005g c0005g) {
        setBasicAuth(str, str2, c0005g, false);
    }

    public void setBasicAuth(String str, String str2, C0005g c0005g, boolean z) {
        setCredentials(c0005g, new C0803r(str, str2));
        setAuthenticationPreemptive(z);
    }

    public void setCredentials(C0005g c0005g, C0009m c0009m) {
        if (c0009m == null) {
            log.mo1428d(LOG_TAG, "Provided credentials are null, not setting");
            return;
        }
        C0034i E = this.httpClient.m2584E();
        if (c0005g == null) {
            c0005g = C0005g.f11d;
        }
        E.mo52a(c0005g, c0009m);
    }

    public void setAuthenticationPreemptive(boolean z) {
        if (z) {
            this.httpClient.m2595a(new PreemptiveAuthorizationHttpRequestInterceptor(), 0);
        } else {
            this.httpClient.m2597a(PreemptiveAuthorizationHttpRequestInterceptor.class);
        }
    }

    public void clearCredentialsProvider() {
        this.httpClient.m2584E().mo51a();
    }

    public void cancelRequests(Context context, final boolean z) {
        if (context == null) {
            log.mo1430e(LOG_TAG, "Passed null Context to cancelRequests");
            return;
        }
        final List list = (List) this.requestMap.get(context);
        this.requestMap.remove(context);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.threadPool.submit(new Runnable() {
                public void run() {
                    AsyncHttpClient.this.cancelRequests(list, z);
                }
            });
        } else {
            cancelRequests(list, z);
        }
    }

    private void cancelRequests(List<RequestHandle> list, boolean z) {
        if (list != null) {
            for (RequestHandle cancel : list) {
                cancel.cancel(z);
            }
        }
    }

    public void cancelAllRequests(boolean z) {
        for (List<RequestHandle> list : this.requestMap.values()) {
            if (list != null) {
                for (RequestHandle cancel : list) {
                    cancel.cancel(z);
                }
            }
        }
        this.requestMap.clear();
    }

    public void cancelRequestsByTAG(Object obj, boolean z) {
        if (obj == null) {
            log.mo1428d(LOG_TAG, "cancelRequestsByTAG, passed TAG is null, cannot proceed");
            return;
        }
        for (List<RequestHandle> list : this.requestMap.values()) {
            if (list != null) {
                for (RequestHandle requestHandle : list) {
                    if (obj.equals(requestHandle.getTag())) {
                        requestHandle.cancel(z);
                    }
                }
            }
        }
    }

    public RequestHandle head(String str, ResponseHandlerInterface responseHandlerInterface) {
        return head(null, str, null, responseHandlerInterface);
    }

    public RequestHandle head(String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return head(null, str, requestParams, responseHandlerInterface);
    }

    public RequestHandle head(Context context, String str, ResponseHandlerInterface responseHandlerInterface) {
        return head(context, str, null, responseHandlerInterface);
    }

    public RequestHandle head(Context context, String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, new C1341g(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams)), null, responseHandlerInterface, context);
    }

    public RequestHandle head(Context context, String str, C0082e[] c0082eArr, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        C1238l c1341g = new C1341g(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams));
        if (c0082eArr != null) {
            c1341g.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, c1341g, null, responseHandlerInterface, context);
    }

    public RequestHandle get(String str, ResponseHandlerInterface responseHandlerInterface) {
        return get(null, str, null, responseHandlerInterface);
    }

    public RequestHandle get(String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return get(null, str, requestParams, responseHandlerInterface);
    }

    public RequestHandle get(Context context, String str, ResponseHandlerInterface responseHandlerInterface) {
        return get(context, str, null, responseHandlerInterface);
    }

    public RequestHandle get(Context context, String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, new HttpGet(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams)), null, responseHandlerInterface, context);
    }

    public RequestHandle get(Context context, String str, C0082e[] c0082eArr, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        C1238l httpGet = new HttpGet(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams));
        if (c0082eArr != null) {
            httpGet.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, httpGet, null, responseHandlerInterface, context);
    }

    public RequestHandle get(Context context, String str, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new HttpGet(URI.create(str).normalize()), c0149k), str2, responseHandlerInterface, context);
    }

    public RequestHandle post(String str, ResponseHandlerInterface responseHandlerInterface) {
        return post(null, str, null, responseHandlerInterface);
    }

    public RequestHandle post(String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return post(null, str, requestParams, responseHandlerInterface);
    }

    public RequestHandle post(Context context, String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return post(context, str, paramsToEntity(requestParams, responseHandlerInterface), null, responseHandlerInterface);
    }

    public RequestHandle post(Context context, String str, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new C1359i(getURI(str)), c0149k), str2, responseHandlerInterface, context);
    }

    public RequestHandle post(Context context, String str, C0082e[] c0082eArr, RequestParams requestParams, String str2, ResponseHandlerInterface responseHandlerInterface) {
        C1238l c1359i = new C1359i(getURI(str));
        if (requestParams != null) {
            c1359i.setEntity(paramsToEntity(requestParams, responseHandlerInterface));
        }
        if (c0082eArr != null) {
            c1359i.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, c1359i, str2, responseHandlerInterface, context);
    }

    public RequestHandle post(Context context, String str, C0082e[] c0082eArr, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        C1238l addEntityToRequestBase = addEntityToRequestBase(new C1359i(getURI(str)), c0149k);
        if (c0082eArr != null) {
            addEntityToRequestBase.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase, str2, responseHandlerInterface, context);
    }

    public RequestHandle put(String str, ResponseHandlerInterface responseHandlerInterface) {
        return put(null, str, null, responseHandlerInterface);
    }

    public RequestHandle put(String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return put(null, str, requestParams, responseHandlerInterface);
    }

    public RequestHandle put(Context context, String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return put(context, str, paramsToEntity(requestParams, responseHandlerInterface), null, responseHandlerInterface);
    }

    public RequestHandle put(Context context, String str, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new C1360j(getURI(str)), c0149k), str2, responseHandlerInterface, context);
    }

    public RequestHandle put(Context context, String str, C0082e[] c0082eArr, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        C1238l addEntityToRequestBase = addEntityToRequestBase(new C1360j(getURI(str)), c0149k);
        if (c0082eArr != null) {
            addEntityToRequestBase.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase, str2, responseHandlerInterface, context);
    }

    public RequestHandle patch(String str, ResponseHandlerInterface responseHandlerInterface) {
        return patch(null, str, null, responseHandlerInterface);
    }

    public RequestHandle patch(String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return patch(null, str, requestParams, responseHandlerInterface);
    }

    public RequestHandle patch(Context context, String str, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        return patch(context, str, paramsToEntity(requestParams, responseHandlerInterface), null, responseHandlerInterface);
    }

    public RequestHandle patch(Context context, String str, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new C1358h(getURI(str)), c0149k), str2, responseHandlerInterface, context);
    }

    public RequestHandle patch(Context context, String str, C0082e[] c0082eArr, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        C1238l addEntityToRequestBase = addEntityToRequestBase(new C1358h(getURI(str)), c0149k);
        if (c0082eArr != null) {
            addEntityToRequestBase.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase, str2, responseHandlerInterface, context);
    }

    public RequestHandle delete(String str, ResponseHandlerInterface responseHandlerInterface) {
        return delete(null, str, responseHandlerInterface);
    }

    public RequestHandle delete(Context context, String str, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, new HttpDelete(getURI(str)), null, responseHandlerInterface, context);
    }

    public RequestHandle delete(Context context, String str, C0082e[] c0082eArr, ResponseHandlerInterface responseHandlerInterface) {
        C1238l httpDelete = new HttpDelete(getURI(str));
        if (c0082eArr != null) {
            httpDelete.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, httpDelete, null, responseHandlerInterface, context);
    }

    public void delete(String str, RequestParams requestParams, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        sendRequest(this.httpClient, this.httpContext, new HttpDelete(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams)), null, asyncHttpResponseHandler, null);
    }

    public RequestHandle delete(Context context, String str, C0082e[] c0082eArr, RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        C1238l httpDelete = new HttpDelete(getUrlWithQueryString(this.isUrlEncodingEnabled, str, requestParams));
        if (c0082eArr != null) {
            httpDelete.setHeaders(c0082eArr);
        }
        return sendRequest(this.httpClient, this.httpContext, httpDelete, null, responseHandlerInterface, context);
    }

    public RequestHandle delete(Context context, String str, C0149k c0149k, String str2, ResponseHandlerInterface responseHandlerInterface) {
        return sendRequest(this.httpClient, this.httpContext, addEntityToRequestBase(new HttpDelete(URI.create(str).normalize()), c0149k), str2, responseHandlerInterface, context);
    }

    protected AsyncHttpRequest newAsyncHttpRequest(C1324k c1324k, C0157e c0157e, C1238l c1238l, String str, ResponseHandlerInterface responseHandlerInterface, Context context) {
        return new AsyncHttpRequest(c1324k, c0157e, c1238l, responseHandlerInterface);
    }

    protected RequestHandle sendRequest(C1324k c1324k, C0157e c0157e, C1238l c1238l, String str, ResponseHandlerInterface responseHandlerInterface, Context context) {
        if (c1238l == null) {
            throw new IllegalArgumentException("HttpUriRequest must not be null");
        } else if (responseHandlerInterface != null) {
            if (responseHandlerInterface.getUseSynchronousMode()) {
                if (!responseHandlerInterface.getUsePoolThread()) {
                    throw new IllegalArgumentException("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
                }
            }
            if (str != null) {
                if ((c1238l instanceof C1339e) && ((C1339e) c1238l).getEntity() != null && c1238l.containsHeader(HEADER_CONTENT_TYPE)) {
                    log.mo1441w(LOG_TAG, "Passed contentType will be ignored because HttpEntity sets content type");
                } else {
                    c1238l.setHeader(HEADER_CONTENT_TYPE, str);
                }
            }
            responseHandlerInterface.setRequestHeaders(c1238l.getAllHeaders());
            responseHandlerInterface.setRequestURI(c1238l.getURI());
            c1324k = newAsyncHttpRequest(c1324k, c0157e, c1238l, str, responseHandlerInterface, context);
            this.threadPool.submit(c1324k);
            c0157e = new RequestHandle(c1324k);
            if (context != null) {
                synchronized (this.requestMap) {
                    c1238l = (List) this.requestMap.get(context);
                    if (c1238l == null) {
                        c1238l = Collections.synchronizedList(new LinkedList());
                        this.requestMap.put(context, c1238l);
                    }
                }
                c1238l.add(c0157e);
                c1324k = c1238l.iterator();
                while (c1324k.hasNext() != null) {
                    if (((RequestHandle) c1324k.next()).shouldBeGarbageCollected() != null) {
                        c1324k.remove();
                    }
                }
            }
            return c0157e;
        } else {
            throw new IllegalArgumentException("ResponseHandler must not be null");
        }
    }

    protected URI getURI(String str) {
        return URI.create(str).normalize();
    }

    public void setURLEncodingEnabled(boolean z) {
        this.isUrlEncodingEnabled = z;
    }

    private C0149k paramsToEntity(RequestParams requestParams, ResponseHandlerInterface responseHandlerInterface) {
        if (requestParams == null) {
            return null;
        }
        try {
            return requestParams.getEntity(responseHandlerInterface);
        } catch (RequestParams requestParams2) {
            if (responseHandlerInterface != null) {
                responseHandlerInterface.sendFailureMessage(0, null, null, requestParams2);
                return null;
            }
            requestParams2.printStackTrace();
            return null;
        }
    }

    public boolean isUrlEncodingEnabled() {
        return this.isUrlEncodingEnabled;
    }

    private C1339e addEntityToRequestBase(C1339e c1339e, C0149k c0149k) {
        if (c0149k != null) {
            c1339e.setEntity(c0149k);
        }
        return c1339e;
    }
}
