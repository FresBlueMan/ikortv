package com.iptv2.core;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat;
import com.iptv2.core.C0712a.C0706a;
import com.iptv2.core.C0712a.C0707b;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0712a.C0709d;
import com.iptv2.core.C0712a.C0710e;
import com.iptv2.core.C0712a.C0711f;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0695d;
import com.iptv2.core.DataEntity.C0700k;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.core.b.AnonymousClass10;
import com.iptv2.core.b.AnonymousClass11;
import com.iptv2.p043b.C0590b;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0590b.C0588b;
import com.iptv2.p043b.C0591c;
import com.loopj.android.http.AsyncHttpClient;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.socks.library.KLog;
import javax.crypto.Cipher;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

/* compiled from: ApiServer */
/* renamed from: com.iptv2.core.b */
public final class C0728b {
    /* renamed from: a */
    public static boolean f1230a = false;
    /* renamed from: b */
    private C0730c f1231b;
    /* renamed from: c */
    private String f1232c;

    /* compiled from: ApiServer */
    /* renamed from: com.iptv2.core.b$a */
    public interface C0724a<T> {
        /* renamed from: a */
        void mo1314a(boolean z, C1184e<T> c1184e, C0587a c0587a, Throwable th);
    }

    /* compiled from: ApiServer */
    /* renamed from: com.iptv2.core.b$b */
    public interface C0725b {
        /* renamed from: a */
        void mo1307a(boolean z, C0726c c0726c, C0587a c0587a, Throwable th);
    }

    /* compiled from: ApiServer */
    /* renamed from: com.iptv2.core.b$c */
    public static class C0726c {
        /* renamed from: a */
        public C0727d f1224a;
        /* renamed from: b */
        public boolean f1225b;
    }

    /* compiled from: ApiServer */
    /* renamed from: com.iptv2.core.b$d */
    public static class C0727d {
        /* renamed from: a */
        public int f1226a;
        /* renamed from: b */
        public String f1227b;
        /* renamed from: c */
        public String f1228c;
        /* renamed from: d */
        public String f1229d;

        public C0727d(JSONObject jSONObject) {
            this.f1226a = jSONObject.getInt("code");
            this.f1227b = jSONObject.getString("message");
            this.f1228c = jSONObject.optString("action");
            this.f1229d = jSONObject.optString("actionConfig");
        }
    }

    /* compiled from: ApiServer */
    /* renamed from: com.iptv2.core.b$e */
    public static class C1184e<T> extends C0726c {
        /* renamed from: c */
        public T f2086c;
    }

    /* renamed from: b */
    private String m1232b() {
        return "";
    }

    /* renamed from: c */
    private String m1233c() {
        return "";
    }

    public C0728b(C0730c c0730c) {
        this.f1231b = c0730c;
        m1236a();
    }

    /* renamed from: a */
    public void m1236a() {
        this.f1232c = this.f1231b.f1248C.m1302b();
        if (this.f1232c.equals("")) {
            this.f1232c = C0730c.m1254a();
        }
    }

    /* renamed from: d */
    private String m1234d() {
        return this.f1231b.f1248C.m1292a(m1232b());
    }

    /* renamed from: e */
    private JSONObject m1235e() {
        JSONObject jSONObject = new JSONObject();
        String c = this.f1231b.f1248C.m1308c();
        if (c == null) {
            c = "";
        }
        Object d = this.f1231b.f1248C.m1311d();
        if (d == null) {
            d = "";
        }
        if (f1230a) {
            jSONObject.put("userName", m1232b());
            jSONObject.put("password", m1233c());
            jSONObject.put("sign", m1234d());
            jSONObject.put("platform", "tv");
        } else {
            jSONObject.put("userName", c);
            jSONObject.put("password", d);
            jSONObject.put("sign", this.f1231b.f1248C.m1292a(c));
            jSONObject.put("platform", "tv");
        }
        jSONObject.put("deviceId", this.f1231b.f1248C.f1283b);
        jSONObject.put("ver", this.f1231b.f1275w.versionCode);
        jSONObject.put("timezone", this.f1232c);
        jSONObject.put("lang", this.f1231b.f1251F.m1345a());
        jSONObject.put("os", "android");
        jSONObject.put("osVer", VERSION.RELEASE);
        jSONObject.put("deviceModel", Build.MODEL);
        jSONObject.put("productModel", "ikor");
        return jSONObject;
    }

    /* renamed from: a */
    public void m1246a(String str, final C0724a<C0706a> c0724a) {
        C0588b c11751 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2069b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0706a> f1169a = new C1184e();
                        /* renamed from: b */
                        boolean f1170b;
                        /* renamed from: c */
                        Exception f1171c;
                        /* renamed from: e */
                        final /* synthetic */ C11751 f1173e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1206a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1207a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1206a(Void... voidArr) {
                            try {
                                this.f1169a.b = jSONObject.optBoolean("state");
                                if (this.f1169a.b) {
                                    this.f1169a.f2086c = new C0706a(jSONObject.getJSONObject("data"));
                                    this.f1170b = true;
                                    return null;
                                }
                                this.f1169a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1171c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1207a(Void voidR) {
                            c0724a.mo1314a(this.f1170b, this.f1169a, this.f1170b ? C0587a.None : C0587a.Unknown, this.f1171c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            C0590b.m788a(this.f1231b.f1260a, asyncHttpClient, this.f1231b.f1260a.f1067f, str, c11751);
        } catch (String str2) {
            C0591c.m792a("ApiServer", "epg", str2);
            c0724a.mo1314a(false, null, C0587a.Unknown, str2);
        }
    }

    /* renamed from: b */
    public void m1252b(String str, final C0724a<C0702m> c0724a) {
        C0588b c11784 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2075b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0702m> f1194a = new C1184e();
                        /* renamed from: b */
                        boolean f1195b;
                        /* renamed from: c */
                        Exception f1196c;
                        /* renamed from: e */
                        final /* synthetic */ C11784 f1198e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1216a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1217a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1216a(Void... voidArr) {
                            try {
                                this.f1194a.b = jSONObject.optBoolean("state");
                                if (this.f1194a.b) {
                                    this.f1194a.f2086c = new C0702m(jSONObject.getJSONObject("data"));
                                    this.f1195b = true;
                                    return null;
                                }
                                this.f1194a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1196c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1217a(Void voidR) {
                            c0724a.mo1314a(this.f1195b, this.f1194a, this.f1195b ? C0587a.None : C0587a.Unknown, this.f1196c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(BaseImageDownloader.DEFAULT_HTTP_READ_TIMEOUT);
            JSONObject e = m1235e();
            e.put("vodId", str);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/vod");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, c11784);
        } catch (String str2) {
            C0591c.m792a("ApiServer", "vod", str2);
            c0724a.mo1314a(false, null, C0587a.Unknown, str2);
        }
    }

    /* renamed from: a */
    public void m1237a(int i, int i2, String str, String str2, final C0724a<C0711f> c0724a) {
        C0588b c11795 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2077b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0711f> f1199a = new C1184e();
                        /* renamed from: b */
                        boolean f1200b;
                        /* renamed from: c */
                        Exception f1201c;
                        /* renamed from: e */
                        final /* synthetic */ C11795 f1203e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1218a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1219a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1218a(Void... voidArr) {
                            try {
                                this.f1199a.b = jSONObject.optBoolean("state");
                                if (this.f1199a.b) {
                                    this.f1199a.f2086c = new C0711f(jSONObject.getJSONObject("data"));
                                    this.f1200b = true;
                                    return null;
                                }
                                this.f1199a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1201c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1219a(Void voidR) {
                            c0724a.mo1314a(this.f1200b, this.f1199a, this.f1200b ? C0587a.None : C0587a.Unknown, this.f1201c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(BaseImageDownloader.DEFAULT_HTTP_READ_TIMEOUT);
            JSONObject e = m1235e();
            e.put("page", i + 1);
            e.put("size", i2);
            e.put("genre", str);
            e.put("subGenre", str2);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            i = new StringBuilder();
            i.append(this.f1231b.f1248C.f1282a);
            i.append("/v1_2");
            i.append("/vods");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, i.toString(), e, 1, c11795);
        } catch (int i3) {
            C0591c.m792a("ApiServer", "vods", i3);
            c0724a.mo1314a(0, null, C0587a.Unknown, i3);
        }
    }

    /* renamed from: a */
    public void m1245a(String str, int i, int i2, String str2, String str3, final C0724a<C0711f> c0724a) {
        C0588b c11806 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2079b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0711f> f1204a = new C1184e();
                        /* renamed from: b */
                        boolean f1205b;
                        /* renamed from: c */
                        Exception f1206c;
                        /* renamed from: e */
                        final /* synthetic */ C11806 f1208e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1220a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1221a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1220a(Void... voidArr) {
                            try {
                                this.f1204a.b = jSONObject.optBoolean("state");
                                if (this.f1204a.b) {
                                    this.f1204a.f2086c = new C0711f(jSONObject.getJSONObject("data"));
                                    this.f1205b = true;
                                    return null;
                                }
                                this.f1204a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1206c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1221a(Void voidR) {
                            c0724a.mo1314a(this.f1205b, this.f1204a, this.f1205b ? C0587a.None : C0587a.Unknown, this.f1206c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(BaseImageDownloader.DEFAULT_HTTP_READ_TIMEOUT);
            JSONObject e = m1235e();
            e.put("keywords", str);
            e.put("page", i + 1);
            e.put("size", i2);
            e.put("genre", str2);
            e.put("subGenre", str3);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/search");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, c11806);
        } catch (String str4) {
            C0591c.m792a("ApiServer", "search", str4);
            c0724a.mo1314a(0, 0, C0587a.Unknown, str4);
        }
    }

    /* renamed from: a */
    public void m1240a(C0693b c0693b, C0695d c0695d, C0725b c0725b) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "live");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            e.put("resSubName", c0695d.f1088b);
            e.put("resSubStream", c0695d.f1087a);
            e.put("errTitle", "");
            e.put("errExt", 0);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1157p);
            m1231a(e, c0725b);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "reportErrorLive", c0693b2);
            c0725b.mo1307a(false, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: a */
    public void m1239a(C0693b c0693b, C0695d c0695d, C0724a<C0710e> c0724a) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "live");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            e.put("resSubName", c0695d.f1088b);
            e.put("resSubStream", c0695d.f1087a);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1157p);
            m1230a(e, (C0724a) c0724a);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "statusLive", c0693b2);
            c0724a.mo1314a(null, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: b */
    public void m1251b(C0693b c0693b, C0695d c0695d, C0725b c0725b) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "timeshift");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            e.put("resSubName", c0695d.f1088b);
            e.put("resSubStream", c0695d.f1087a);
            e.put("errTitle", "");
            e.put("errExt", 0);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1157p);
            m1231a(e, c0725b);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "reportErrorTimeShift", c0693b2);
            c0725b.mo1307a(false, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: b */
    public void m1250b(C0693b c0693b, C0695d c0695d, C0724a<C0710e> c0724a) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "timeshift");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            e.put("resSubName", c0695d.f1088b);
            e.put("resSubStream", c0695d.f1087a);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1157p);
            m1230a(e, (C0724a) c0724a);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "statusTimeShift", c0693b2);
            c0724a.mo1314a(null, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: a */
    public void m1243a(C0702m c0702m, C0703n c0703n, int i, C0725b c0725b) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "vod");
            e.put("resId", c0702m.f1111a);
            e.put("resName", c0702m.f1113c);
            e.put("resSubName", c0703n.f1128a);
            e.put("resSubStream", c0703n.f1129b);
            e.put("errTitle", "");
            e.put("errExt", i);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1162u);
            m1231a(e, c0725b);
        } catch (C0702m c0702m2) {
            C0591c.m792a("ApiServer", "reportErrorVod", c0702m2);
            c0725b.mo1307a(null, 0, C0587a.Unknown, c0702m2);
        }
    }

    /* renamed from: a */
    public void m1244a(C0702m c0702m, C0703n c0703n, C0724a<C0710e> c0724a) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "vod");
            e.put("resId", c0702m.f1111a);
            e.put("resName", c0702m.f1113c);
            e.put("resSubName", c0703n.f1128a);
            e.put("resSubStream", c0703n.f1129b);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1162u);
            m1230a(e, (C0724a) c0724a);
        } catch (C0702m c0702m2) {
            C0591c.m792a("ApiServer", "statusVod", c0702m2);
            c0724a.mo1314a(null, null, C0587a.Unknown, c0702m2);
        }
    }

    /* renamed from: a */
    public void m1242a(C0693b c0693b, C1174j c1174j, C0700k c0700k, C0725b c0725b) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "record");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c1174j.f.f1093a);
            stringBuilder.append(" ");
            stringBuilder.append(c1174j.f2060a);
            stringBuilder.append(" ");
            stringBuilder.append(c1174j.e);
            e.put("resSubName", stringBuilder.toString());
            e.put("resSubStream", c0700k.f1105a);
            e.put("errTitle", "");
            e.put("errExt", 0);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1161t);
            m1231a(e, c0725b);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "reportErrorRecord", c0693b2);
            c0725b.mo1307a(false, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: a */
    public void m1241a(C0693b c0693b, C1174j c1174j, C0700k c0700k, C0724a<C0710e> c0724a) {
        try {
            JSONObject e = m1235e();
            e.put("resType", "record");
            e.put("resId", c0693b.f1070a);
            e.put("resName", c0693b.f1071b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c1174j.f.f1093a);
            stringBuilder.append(" ");
            stringBuilder.append(c1174j.f2060a);
            stringBuilder.append(" ");
            stringBuilder.append(c1174j.e);
            e.put("resSubName", stringBuilder.toString());
            e.put("resSubStream", c0700k.f1105a);
            e.put("serverP2P", this.f1231b.f1248C.f1284c.f1161t);
            m1230a(e, (C0724a) c0724a);
        } catch (C0693b c0693b2) {
            C0591c.m792a("ApiServer", "statusRecord", c0693b2);
            c0724a.mo1314a(null, null, C0587a.Unknown, c0693b2);
        }
    }

    /* renamed from: a */
    private void m1231a(JSONObject jSONObject, final C0725b c0725b) {
        C0588b c11817 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2081b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C0726c f1209a = new C0726c();
                        /* renamed from: b */
                        boolean f1210b;
                        /* renamed from: c */
                        Exception f1211c;
                        /* renamed from: e */
                        final /* synthetic */ C11817 f1213e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1222a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1223a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1222a(Void... voidArr) {
                            try {
                                this.f1209a.f1225b = jSONObject.optBoolean("state");
                                if (this.f1209a.f1225b) {
                                    this.f1210b = true;
                                    return null;
                                }
                                this.f1209a.f1224a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1211c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1223a(Void voidR) {
                            c0725b.mo1307a(this.f1210b, this.f1209a, this.f1210b ? C0587a.None : C0587a.Unknown, this.f1211c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0725b.mo1307a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(30000);
            asyncHttpClient.setLoggingLevel(6);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f1231b.f1248C.f1282a);
            stringBuilder.append("/v1_2");
            stringBuilder.append("/report");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, stringBuilder.toString(), jSONObject, 1, c11817);
        } catch (JSONObject jSONObject2) {
            C0591c.m792a("ApiServer", "reportError", jSONObject2);
            c0725b.mo1307a(false, null, C0587a.Unknown, jSONObject2);
        }
    }

    /* renamed from: a */
    private void m1230a(JSONObject jSONObject, final C0724a<C0710e> c0724a) {
        C0588b c11828 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2083b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0710e> f1214a = new C1184e();
                        /* renamed from: b */
                        boolean f1215b;
                        /* renamed from: c */
                        Exception f1216c;
                        /* renamed from: e */
                        final /* synthetic */ C11828 f1218e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1224a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1225a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1224a(Void... voidArr) {
                            try {
                                this.f1214a.b = jSONObject.optBoolean("state");
                                if (this.f1214a.b) {
                                    this.f1214a.f2086c = new C0710e(jSONObject.getJSONObject("data"));
                                    this.f1215b = true;
                                    return null;
                                }
                                this.f1214a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1216c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1225a(Void voidR) {
                            c0724a.mo1314a(this.f1215b, this.f1214a, this.f1215b ? C0587a.None : C0587a.Unknown, this.f1216c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(30000);
            asyncHttpClient.setLoggingLevel(6);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f1231b.f1248C.f1282a);
            stringBuilder.append("/v1_2");
            stringBuilder.append("/status");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, stringBuilder.toString(), jSONObject, 1, c11828);
        } catch (JSONObject jSONObject2) {
            C0591c.m792a("ApiServer", NotificationCompat.CATEGORY_STATUS, jSONObject2);
            c0724a.mo1314a(false, null, C0587a.Unknown, jSONObject2);
        }
    }

    /* renamed from: c */
    public void m1253c(String str, final C0724a<C0709d> c0724a) {
        C0588b c11839 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2085b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0709d> f1219a = new C1184e();
                        /* renamed from: b */
                        boolean f1220b;
                        /* renamed from: c */
                        Exception f1221c;
                        /* renamed from: e */
                        final /* synthetic */ C11839 f1223e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1226a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1227a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1226a(Void... voidArr) {
                            try {
                                this.f1219a.b = jSONObject.optBoolean("state");
                                if (this.f1219a.b) {
                                    this.f1219a.f2086c = new C0709d(jSONObject.getJSONObject("data"));
                                    this.f1220b = true;
                                    return null;
                                }
                                this.f1219a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1221c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1227a(Void voidR) {
                            c0724a.mo1314a(this.f1220b, this.f1219a, this.f1220b ? C0587a.None : C0587a.Unknown, this.f1221c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            JSONObject e = m1235e();
            e.put("channelId", str);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/records");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, c11839);
        } catch (String str2) {
            C0591c.m792a("ApiServer", "records", str2);
            c0724a.mo1314a(false, null, C0587a.Unknown, str2);
        }
    }

    /* renamed from: a */
    public void m1247a(String str, final C0725b c0725b) {
        C0588b anonymousClass10 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2065b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C0726c f1174a = new C0726c();
                        /* renamed from: b */
                        boolean f1175b;
                        /* renamed from: c */
                        Exception f1176c;
                        /* renamed from: e */
                        final /* synthetic */ AnonymousClass10 f1178e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1208a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1209a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1208a(Void... voidArr) {
                            try {
                                this.f1174a.f1225b = jSONObject.optBoolean("state");
                                if (this.f1174a.f1225b) {
                                    this.f1175b = true;
                                    return null;
                                }
                                this.f1174a.f1224a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1176c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1209a(Void voidR) {
                            c0725b.mo1307a(this.f1175b, this.f1174a, this.f1175b ? C0587a.None : C0587a.Unknown, this.f1176c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0725b.mo1307a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            JSONObject e = m1235e();
            e.put("paycard", str);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/auth");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, anonymousClass10);
        } catch (String str2) {
            C0591c.m792a("ApiServer", "auth", str2);
            c0725b.mo1307a(false, null, C0587a.Unknown, str2);
        }
    }

    /* renamed from: a */
    public void m1248a(String str, String str2, final C0725b c0725b) {
        C0588b anonymousClass11 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2067b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C0726c f1179a = new C0726c();
                        /* renamed from: b */
                        boolean f1180b;
                        /* renamed from: c */
                        Exception f1181c;
                        /* renamed from: e */
                        final /* synthetic */ AnonymousClass11 f1183e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1210a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1211a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1210a(Void... voidArr) {
                            try {
                                this.f1179a.f1225b = jSONObject.optBoolean("state");
                                if (this.f1179a.f1225b) {
                                    this.f1180b = true;
                                    return null;
                                }
                                this.f1179a.f1224a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1181c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1211a(Void voidR) {
                            c0725b.mo1307a(this.f1180b, this.f1179a, this.f1180b ? C0587a.None : C0587a.Unknown, this.f1181c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0725b.mo1307a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            JSONObject e = m1235e();
            if (f1230a) {
                e.put("userName", m1232b());
                e.put("password", m1233c());
                e.put("sign", m1234d());
            } else {
                e.put("userName", str);
                e.put("password", str2);
                e.put("sign", this.f1231b.f1248C.m1292a(str));
            }
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/regist");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, anonymousClass11);
        } catch (String str3) {
            C0591c.m792a("ApiServer", "regist", str3);
            c0725b.mo1307a(null, null, C0587a.Unknown, str3);
        }
    }

    /* renamed from: a */
    public void m1238a(int i, final C0724a<C0707b> c0724a) {
        C0588b c11762 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2071b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0707b> f1184a = new C1184e();
                        /* renamed from: b */
                        boolean f1185b;
                        /* renamed from: c */
                        Exception f1186c;
                        /* renamed from: e */
                        final /* synthetic */ C11762 f1188e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1212a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1213a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1212a(Void... voidArr) {
                            try {
                                this.f1184a.b = jSONObject.optBoolean("state");
                                if (this.f1184a.b) {
                                    this.f1184a.f2086c = new C0707b(jSONObject.getJSONObject("data"));
                                    this.f1185b = true;
                                    return null;
                                }
                                this.f1184a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1186c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1213a(Void voidR) {
                            c0724a.mo1314a(this.f1185b, this.f1184a, this.f1185b ? C0587a.None : C0587a.Unknown, this.f1186c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            JSONObject e = m1235e();
            e.put("vodSize", i);
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            i = new StringBuilder();
            i.append(this.f1231b.f1248C.f1282a);
            i.append("/v1_2");
            i.append("/index");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, i.toString(), e, 1, c11762);
        } catch (int i2) {
            C0591c.m792a("ApiServer", "index", i2);
            c0724a.mo1314a(false, null, C0587a.Unknown, i2);
        }
    }

    /* renamed from: a */
    public void m1249a(String str, String str2, boolean z, final C0724a<C0708c> c0724a) {
        C0588b c11773 = new C0588b(this) {
            /* renamed from: b */
            final /* synthetic */ C0728b f2073b;

            /* renamed from: a */
            public void mo1383a(boolean z, final JSONObject jSONObject, C0587a c0587a, Throwable th) {
                if (z) {
                    new AsyncTask<Void, Void, Void>(this) {
                        /* renamed from: a */
                        C1184e<C0708c> f1189a = new C1184e();
                        /* renamed from: b */
                        boolean f1190b;
                        /* renamed from: c */
                        Exception f1191c;
                        /* renamed from: e */
                        final /* synthetic */ C11773 f1193e;

                        protected /* synthetic */ Object doInBackground(Object[] objArr) {
                            return m1214a((Void[]) objArr);
                        }

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            m1215a((Void) obj);
                        }

                        /* renamed from: a */
                        protected Void m1214a(Void... voidArr) {
                            try {
                                this.f1189a.b = jSONObject.optBoolean("state");
                                if (this.f1189a.b) {
                                    this.f1189a.f2086c = new C0708c(jSONObject.getJSONObject("data"));
                                    this.f1190b = this.f1189a.f2086c != null;
                                    return null;
                                }
                                this.f1189a.a = new C0727d(jSONObject.getJSONObject(OnNativeInvokeListener.ARG_ERROR));
                                return null;
                            } catch (Exception e) {
                                this.f1191c = e;
                            }
                        }

                        /* renamed from: a */
                        protected void m1215a(Void voidR) {
                            c0724a.mo1314a(this.f1190b, this.f1189a, this.f1190b ? C0587a.None : C0587a.Unknown, this.f1191c);
                        }
                    }.execute(new Void[0]);
                } else {
                    c0724a.mo1314a(false, null, c0587a, th);
                }
            }
        };
        try {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(60000);
            asyncHttpClient.setLoggingLevel(6);
            JSONObject e = m1235e();
            if (f1230a) {
                e.put("userName", m1232b());
                e.put("password", m1233c());
                e.put("sign", m1234d());
            } else {
                e.put("userName", str);
                e.put("password", str2);
                e.put("sign", this.f1231b.f1248C.m1292a(str));
            }
            e.put("randomAccount", z);
            KLog.json(e.toString());
            Context context = this.f1231b.f1260a;
            Cipher cipher = this.f1231b.f1260a.f1066e;
            Cipher cipher2 = this.f1231b.f1260a.f1067f;
            str = new StringBuilder();
            str.append(this.f1231b.f1248C.f1282a);
            str.append("/v1_2");
            str.append("/login");
            C0590b.m789a(context, asyncHttpClient, cipher, cipher2, str.toString(), e, 1, c11773);
        } catch (String str3) {
            C0591c.m792a("ApiServer", "login", str3);
            c0724a.mo1314a(null, false, C0587a.Unknown, str3);
        }
    }
}
