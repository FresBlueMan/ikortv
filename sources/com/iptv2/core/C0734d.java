package com.iptv2.core;

import android.content.SharedPreferences.Editor;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import br.iptv2.C0433a;
import com.iptv2.core.C0712a.C0706a;
import com.iptv2.core.C0712a.C0708c;
import com.iptv2.core.C0728b.C0724a;
import com.iptv2.core.C0728b.C1184e;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0696e;
import com.iptv2.core.DataEntity.C0697f;
import com.iptv2.core.DataEntity.C0701l;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.core.DataEntity.C1173g;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0590b.C0587a;
import com.iptv2.p043b.C0591c;
import com.iptv2.p043b.C0595e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DataCenter */
/* renamed from: com.iptv2.core.d */
public final class C0734d {
    /* renamed from: a */
    public String f1282a;
    /* renamed from: b */
    public String f1283b;
    /* renamed from: c */
    public C0708c f1284c;
    /* renamed from: d */
    public C0706a f1285d;
    /* renamed from: e */
    public C0701l f1286e;
    /* renamed from: f */
    private C0730c f1287f;
    /* renamed from: g */
    private String f1288g;
    /* renamed from: h */
    private boolean f1289h;
    /* renamed from: i */
    private boolean f1290i;
    /* renamed from: j */
    private int f1291j;
    /* renamed from: k */
    private int f1292k;
    /* renamed from: l */
    private String f1293l;
    /* renamed from: m */
    private String f1294m;
    /* renamed from: n */
    private String f1295n;
    /* renamed from: o */
    private String f1296o;
    /* renamed from: p */
    private LinkedHashMap<String, C0733b> f1297p;
    /* renamed from: q */
    private LinkedHashMap<String, C0702m> f1298q;
    /* renamed from: r */
    private LinkedHashMap<String, Float> f1299r;
    /* renamed from: s */
    private ArrayList<String> f1300s;
    /* renamed from: t */
    private int f1301t = 0;
    /* renamed from: u */
    private boolean f1302u = false;
    /* renamed from: v */
    private Runnable f1303v = new C07311(this);
    /* renamed from: w */
    private int f1304w = 0;
    /* renamed from: x */
    private C0732a f1305x;

    /* compiled from: DataCenter */
    /* renamed from: com.iptv2.core.d$1 */
    class C07311 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0734d f1279a;

        /* compiled from: DataCenter */
        /* renamed from: com.iptv2.core.d$1$1 */
        class C11851 implements C0724a<C0706a> {
            /* renamed from: a */
            final /* synthetic */ C07311 f2087a;

            C11851(C07311 c07311) {
                this.f2087a = c07311;
            }

            /* renamed from: a */
            public void mo1314a(boolean z, C1184e<C0706a> c1184e, C0587a c0587a, Throwable th) {
                if (this.f2087a.f1279a.f1302u != null) {
                    if (z) {
                        th = null;
                        this.f2087a.f1279a.f1301t = 0;
                        this.f2087a.f1279a.m1273e(7200000);
                        if (!(this.f2087a.f1279a.f1304w || this.f2087a.f1279a.f1285d || !this.f2087a.f1279a.f1305x)) {
                            th = true;
                        }
                        this.f2087a.f1279a.f1285d = (C0706a) c1184e.f2086c;
                        if (th != null) {
                            this.f2087a.f1279a.f1305x.mo1362a();
                            this.f2087a.f1279a.f1305x = null;
                        }
                    } else {
                        this.f2087a.f1279a.f1301t = this.f2087a.f1279a.f1301t + 1;
                        this.f2087a.f1279a.m1273e(Math.min(7200000, this.f2087a.f1279a.f1301t * 120000));
                    }
                    this.f2087a.f1279a.f1304w = this.f2087a.f1279a.f1304w + 1;
                }
            }
        }

        C07311(C0734d c0734d) {
            this.f1279a = c0734d;
        }

        public void run() {
            C0591c.m791a("DataCenter", "LoadEpgTask run");
            this.f1279a.f1287f.f1249D.m1246a(this.f1279a.f1287f.f1248C.m1326l(), new C11851(this));
        }
    }

    /* compiled from: DataCenter */
    /* renamed from: com.iptv2.core.d$a */
    public interface C0732a {
        /* renamed from: a */
        void mo1362a();
    }

    /* compiled from: DataCenter */
    /* renamed from: com.iptv2.core.d$b */
    private static class C0733b {
        /* renamed from: a */
        public C0702m f1280a;
        /* renamed from: b */
        public String f1281b;

        public C0733b(JSONObject jSONObject) {
            this.f1280a = new C0702m(jSONObject.getJSONObject("vod"), false);
            this.f1281b = jSONObject.getString("lastPlayClipId");
        }

        /* renamed from: a */
        public JSONObject m1264a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod", this.f1280a.m1204b());
            jSONObject.put("lastPlayClipId", this.f1281b);
            return jSONObject;
        }
    }

    public C0734d(C0730c c0730c) {
        this.f1287f = c0730c;
        this.f1283b = C0595e.m815b();
        if (TextUtils.isEmpty(this.f1283b)) {
            this.f1283b = c0730c.f1258M;
        }
        this.f1288g = c0730c.f1276x.getString("LastPlayLiveChannelId", "");
        this.f1289h = c0730c.f1276x.getInt("ShowIntro", 0) != c0730c.f1275w.versionCode;
        this.f1291j = c0730c.f1276x.getInt("VideoRatio", 0);
        this.f1292k = c0730c.f1276x.getInt("MediaPlayerType", 0);
        this.f1290i = c0730c.f1276x.getBoolean("SupportTouch", false);
        this.f1294m = c0730c.f1276x.getString("TimeZone", "");
        m1278s();
        m1283x();
        m1281v();
        m1285z();
        m1276q();
        m1277r();
    }

    /* renamed from: a */
    public String m1292a(String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str.trim().toUpperCase());
            stringBuilder.append("E0639620-2F37-4046-9DED-6D6978AC629D");
            return C0595e.m818c(stringBuilder.toString());
        } catch (String str2) {
            C0591c.m792a("DataCenter", "buildSign", str2);
            return "";
        }
    }

    /* renamed from: b */
    public String m1304b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(new StringBuilder("E0639620-2F37-4046-9DED-6D6978AC629D").reverse().toString());
        return C0595e.m818c(stringBuilder.toString());
    }

    /* renamed from: q */
    private void m1276q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "tv";
        r1 = "bind-device";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002e;
    L_0x000a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.f1283b;
        r0.append(r1);
        r1 = "@";
        r0.append(r1);
        r1 = "ikor.tv";
        r0.append(r1);
        r0 = r0.toString();
        r4.f1295n = r0;
        r0 = r4.f1295n;
        r0 = r4.m1304b(r0);
        r4.f1296o = r0;
        goto L_0x00a3;
    L_0x002e:
        r0 = 0;
        r1 = r4.f1287f;	 Catch:{ Exception -> 0x005a }
        r1 = r1.f1276x;	 Catch:{ Exception -> 0x005a }
        r2 = "UserName";	 Catch:{ Exception -> 0x005a }
        r3 = "";	 Catch:{ Exception -> 0x005a }
        r1 = r1.getString(r2, r3);	 Catch:{ Exception -> 0x005a }
        r4.f1295n = r1;	 Catch:{ Exception -> 0x005a }
        r1 = r4.f1295n;	 Catch:{ Exception -> 0x005a }
        r2 = "";	 Catch:{ Exception -> 0x005a }
        r1 = r1.equals(r2);	 Catch:{ Exception -> 0x005a }
        if (r1 != 0) goto L_0x005e;	 Catch:{ Exception -> 0x005a }
    L_0x0047:
        r1 = r4.f1287f;	 Catch:{ Exception -> 0x005a }
        r1 = r1.f1260a;	 Catch:{ Exception -> 0x005a }
        r1 = r1.f1067f;	 Catch:{ Exception -> 0x005a }
        r2 = r4.f1295n;	 Catch:{ Exception -> 0x005a }
        r2 = android.util.Base64.decode(r2, r0);	 Catch:{ Exception -> 0x005a }
        r1 = com.iptv2.p043b.C0586a.m775a(r1, r2);	 Catch:{ Exception -> 0x005a }
        r4.f1295n = r1;	 Catch:{ Exception -> 0x005a }
        goto L_0x005e;
    L_0x005a:
        r1 = "";
        r4.f1295n = r1;
    L_0x005e:
        r1 = r4.f1287f;	 Catch:{ Exception -> 0x0089 }
        r1 = r1.f1276x;	 Catch:{ Exception -> 0x0089 }
        r2 = "UserPassword";	 Catch:{ Exception -> 0x0089 }
        r3 = "";	 Catch:{ Exception -> 0x0089 }
        r1 = r1.getString(r2, r3);	 Catch:{ Exception -> 0x0089 }
        r4.f1296o = r1;	 Catch:{ Exception -> 0x0089 }
        r1 = r4.f1296o;	 Catch:{ Exception -> 0x0089 }
        r2 = "";	 Catch:{ Exception -> 0x0089 }
        r1 = r1.equals(r2);	 Catch:{ Exception -> 0x0089 }
        if (r1 != 0) goto L_0x008d;	 Catch:{ Exception -> 0x0089 }
    L_0x0076:
        r1 = r4.f1287f;	 Catch:{ Exception -> 0x0089 }
        r1 = r1.f1260a;	 Catch:{ Exception -> 0x0089 }
        r1 = r1.f1067f;	 Catch:{ Exception -> 0x0089 }
        r2 = r4.f1296o;	 Catch:{ Exception -> 0x0089 }
        r0 = android.util.Base64.decode(r2, r0);	 Catch:{ Exception -> 0x0089 }
        r0 = com.iptv2.p043b.C0586a.m775a(r1, r0);	 Catch:{ Exception -> 0x0089 }
        r4.f1296o = r0;	 Catch:{ Exception -> 0x0089 }
        goto L_0x008d;
    L_0x0089:
        r0 = "";
        r4.f1296o = r0;
    L_0x008d:
        r0 = r4.f1295n;
        if (r0 == 0) goto L_0x0094;
    L_0x0091:
        r0 = r4.f1295n;
        goto L_0x0096;
    L_0x0094:
        r0 = "";
    L_0x0096:
        r4.f1295n = r0;
        r0 = r4.f1296o;
        if (r0 == 0) goto L_0x009f;
    L_0x009c:
        r0 = r4.f1296o;
        goto L_0x00a1;
    L_0x009f:
        r0 = "";
    L_0x00a1:
        r4.f1296o = r0;
    L_0x00a3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.d.q():void");
    }

    /* renamed from: r */
    private void m1277r() {
        String string = this.f1287f.f1276x.getString("Language", "");
        if (string.isEmpty()) {
            String language = C0595e.f658a.getLanguage();
            String country = C0595e.f658a.getCountry();
            if (language.equals("en") && C0433a.f354a.contains("en")) {
                string = "en";
            } else if (language.equals("zh") && country.equals("CN") && C0433a.f354a.contains("zh-cn")) {
                string = "zh-cn";
            } else if (language.equals("zh") && C0433a.f354a.contains("zh-tw")) {
                string = "zh-tw";
            } else if (language.equals("ja") && C0433a.f354a.contains("ja")) {
                string = "ja";
            } else if (language.equals("ko") && C0433a.f354a.contains("ko")) {
                string = "ko";
            }
        }
        if (C0433a.f354a.indexOf(string) == -1) {
            string = "en";
        }
        this.f1293l = string;
    }

    /* renamed from: a */
    public String m1291a() {
        return this.f1293l;
    }

    /* renamed from: c */
    public void m1310c(String str) {
        if (!this.f1293l.equals(str)) {
            this.f1293l = str;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("Language", str);
            edit.commit();
        }
    }

    /* renamed from: d */
    public String m1313d(String str) {
        if (str.equals("en")) {
            return "English";
        }
        if (str.equals("zh-cn")) {
            return "简体中文";
        }
        if (str.equals("zh-tw")) {
            return "繁體中文";
        }
        if (str.equals("ja")) {
            return "日本語";
        }
        return str.equals("ko") != null ? "한국어" : "";
    }

    /* renamed from: b */
    public String m1302b() {
        return this.f1294m;
    }

    /* renamed from: e */
    public void m1315e(String str) {
        if (!this.f1294m.equals(str)) {
            this.f1294m = str;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("TimeZone", str);
            edit.commit();
        }
    }

    /* renamed from: f */
    public String m1317f(String str) {
        if (str.equals("")) {
            return this.f1287f.f1251F.m1347b("timeZoneAuto");
        }
        return (String) this.f1287f.f1251F.m1349d("timeZones").get(str);
    }

    /* renamed from: c */
    public String m1308c() {
        return this.f1295n;
    }

    /* renamed from: g */
    public void m1319g(String str) {
        m1299a(str, true);
    }

    /* renamed from: a */
    public void m1299a(java.lang.String r2, boolean r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r1.f1295n = r2;
        if (r3 == 0) goto L_0x0024;
    L_0x0004:
        r3 = r1.f1287f;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1260a;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1066e;	 Catch:{ Exception -> 0x0024 }
        r0 = 1;	 Catch:{ Exception -> 0x0024 }
        r2 = com.iptv2.p043b.C0586a.m776a(r3, r2, r0);	 Catch:{ Exception -> 0x0024 }
        r3 = 0;	 Catch:{ Exception -> 0x0024 }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ Exception -> 0x0024 }
        r3 = r1.f1287f;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1276x;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.edit();	 Catch:{ Exception -> 0x0024 }
        r0 = "UserName";	 Catch:{ Exception -> 0x0024 }
        r3.putString(r0, r2);	 Catch:{ Exception -> 0x0024 }
        r3.commit();	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.d.a(java.lang.String, boolean):void");
    }

    /* renamed from: d */
    public String m1311d() {
        return this.f1296o;
    }

    /* renamed from: h */
    public void m1320h(String str) {
        m1305b(str, true);
    }

    /* renamed from: b */
    public void m1305b(java.lang.String r2, boolean r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r1 = this;
        r1.f1296o = r2;
        if (r3 == 0) goto L_0x0024;
    L_0x0004:
        r3 = r1.f1287f;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1260a;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1066e;	 Catch:{ Exception -> 0x0024 }
        r0 = 1;	 Catch:{ Exception -> 0x0024 }
        r2 = com.iptv2.p043b.C0586a.m776a(r3, r2, r0);	 Catch:{ Exception -> 0x0024 }
        r3 = 0;	 Catch:{ Exception -> 0x0024 }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ Exception -> 0x0024 }
        r3 = r1.f1287f;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.f1276x;	 Catch:{ Exception -> 0x0024 }
        r3 = r3.edit();	 Catch:{ Exception -> 0x0024 }
        r0 = "UserPassword";	 Catch:{ Exception -> 0x0024 }
        r3.putString(r0, r2);	 Catch:{ Exception -> 0x0024 }
        r3.commit();	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iptv2.core.d.b(java.lang.String, boolean):void");
    }

    /* renamed from: e */
    public SpannableStringBuilder m1314e() {
        try {
            String format = C0730c.f1243g.format(this.f1284c.f1150i);
            int max = Math.max(0, (int) ((this.f1284c.f1150i.getTime() - C0730c.m1256b().getTime()) / 86400000));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(max);
            stringBuilder.append(" ");
            stringBuilder.append(this.f1287f.f1251F.m1347b(max > 1 ? "days" : "day"));
            String stringBuilder2 = stringBuilder.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(format);
            stringBuilder3.append("    ");
            stringBuilder3.append(stringBuilder2);
            Object stringBuilder4 = stringBuilder3.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(stringBuilder4);
            if (max <= 7) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f1287f.f1260a, R.color.expiretime_warning_textcolor)), 0, stringBuilder4.length(), 34);
            }
            return spannableStringBuilder;
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "getExpireTimeStyle", e);
            return null;
        }
    }

    /* renamed from: a */
    public void m1293a(int i) {
        if (this.f1292k != i) {
            this.f1292k = i;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putInt("MediaPlayerType", i);
            edit.commit();
        }
    }

    /* renamed from: f */
    public int m1316f() {
        if (this.f1292k == 0) {
            return m1321h() ? 2 : 1;
        } else {
            return this.f1292k;
        }
    }

    /* renamed from: b */
    public String m1303b(int i) {
        if (i == 1) {
            return this.f1287f.f1251F.m1347b("mediaPlayerTypeSystem");
        }
        return i == 2 ? this.f1287f.f1251F.m1347b("mediaPlayerTypeThirdParty") : "";
    }

    /* renamed from: c */
    public void m1309c(int i) {
        if (this.f1291j != i) {
            this.f1291j = i;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putInt("VideoRatio", i);
            edit.commit();
        }
    }

    /* renamed from: g */
    public int m1318g() {
        return this.f1291j;
    }

    /* renamed from: d */
    public String m1312d(int i) {
        if (i == 1) {
            return this.f1287f.f1251F.m1347b("videoRatioAutoFit");
        }
        return i == 0 ? this.f1287f.f1251F.m1347b("videoRatioFill") : "";
    }

    /* renamed from: a */
    public void m1300a(boolean z) {
        if (this.f1290i != z) {
            this.f1290i = z;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putBoolean("SupportTouch", z);
            edit.commit();
        }
    }

    /* renamed from: h */
    public boolean m1321h() {
        return this.f1290i;
    }

    /* renamed from: b */
    public void m1306b(boolean z) {
        if (this.f1289h != z) {
            this.f1289h = z;
            Editor edit = this.f1287f.f1276x.edit();
            String str = "ShowIntro";
            if (z) {
                z = false;
            } else {
                z = this.f1287f.f1275w.versionCode;
            }
            edit.putInt(str, z);
            edit.commit();
        }
    }

    /* renamed from: i */
    public boolean m1323i() {
        return this.f1289h;
    }

    /* renamed from: a */
    public void m1297a(C0708c c0708c) {
        if (this.f1284c != c0708c) {
            this.f1284c = c0708c;
            C0730c.m1255a(this.f1284c.f1151j);
        }
    }

    /* renamed from: a */
    public void m1298a(C0732a c0732a) {
        this.f1305x = c0732a;
    }

    /* renamed from: j */
    public void m1324j() {
        C0591c.m790a("startLoadEpgTask");
        int i = (this.f1304w == 0 && this.f1285d == null) ? 0 : this.f1285d != null ? 7200000 : 120000;
        m1273e(i);
    }

    /* renamed from: e */
    private void m1273e(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startLoadEpgTask,delay ");
        stringBuilder.append(i);
        C0591c.m791a("DataCenter", stringBuilder.toString());
        this.f1302u = true;
        this.f1287f.f1263k.removeCallbacks(this.f1303v);
        this.f1287f.f1263k.postDelayed(this.f1303v, (long) i);
    }

    /* renamed from: k */
    public void m1325k() {
        C0591c.m790a("stopLoadEpgTask");
        this.f1287f.f1263k.removeCallbacks(this.f1303v);
        this.f1302u = false;
        this.f1301t = 0;
        this.f1304w = 0;
        this.f1305x = null;
    }

    /* renamed from: l */
    public String m1326l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f1284c.f1160s);
        stringBuilder.append(C0730c.f1242f.format(C0730c.m1256b()));
        stringBuilder.append(".txt");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public C1173g m1287a(C0696e c0696e, Date date) {
        if (c0696e == null) {
            return null;
        }
        C0697f c0697f = (C0697f) c0696e.f1091c.get(C0730c.f1243g.format(date));
        if (c0697f != null) {
            if (c0697f.f1095c.size() != 0) {
                long time = date.getTime();
                c0696e = (C1173g) c0697f.f1095c.get(null);
                while (c0696e != null) {
                    if (time >= c0696e.f2057b && (c0696e.f2059d == null || time < c0696e.f2059d.f2057b)) {
                        return c0696e;
                    }
                    c0696e = c0696e.f2059d;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C1173g m1288a(String str, Date date) {
        if (this.f1285d == null) {
            return null;
        }
        C0696e c0696e = (C0696e) this.f1285d.f1139a.get(str);
        if (c0696e == null) {
            return null;
        }
        return m1287a(c0696e, date);
    }

    /* renamed from: i */
    public void m1322i(String str) {
        if (!this.f1288g.equals(str)) {
            this.f1288g = str;
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("LastPlayLiveChannelId", str);
            edit.commit();
        }
    }

    /* renamed from: m */
    public String m1327m() {
        return this.f1288g;
    }

    /* renamed from: a */
    public boolean m1301a(C0693b c0693b) {
        return this.f1300s.contains(c0693b.f1070a);
    }

    /* renamed from: a */
    public void m1294a(C0693b c0693b, boolean z) {
        if (m1301a(c0693b) != z) {
            if (z) {
                this.f1300s.add(c0693b.f1070a);
            } else {
                this.f1300s.remove(c0693b.f1070a);
            }
            while (this.f1300s.size() > true) {
                this.f1300s.remove(false);
            }
            m1279t();
        }
    }

    /* renamed from: n */
    public ArrayList<String> m1328n() {
        Object arrayList = new ArrayList(this.f1300s);
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: s */
    private void m1278s() {
        try {
            this.f1300s = new ArrayList();
            String string = this.f1287f.f1276x.getString("LiveFavorite", "");
            if (!string.equals("")) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                int i = 0;
                while (i < length && i < 200) {
                    this.f1300s.add(jSONArray.getString(i));
                    i++;
                }
            }
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "readLiveFavoriteDataFromProfile", e);
        }
    }

    /* renamed from: t */
    private void m1279t() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f1300s.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            String jSONArray2 = jSONArray.toString(0);
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("LiveFavorite", jSONArray2);
            edit.commit();
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "writeLiveFavoriteDataToProfile", e);
        }
    }

    /* renamed from: a */
    public C0703n m1289a(C0702m c0702m) {
        if (this.f1297p.containsKey(c0702m.f1111a)) {
            C0733b c0733b = (C0733b) this.f1297p.get(c0702m.f1111a);
            if (c0702m.f1126p.containsKey(c0733b.f1281b)) {
                return (C0703n) c0702m.f1126p.get(c0733b.f1281b);
            }
        }
        return (C0703n) c0702m.f1125o.get(0);
    }

    /* renamed from: a */
    public C0733b m1290a(C0702m c0702m, C0703n c0703n) {
        C0733b c0733b = (C0733b) this.f1297p.get(c0702m.f1111a);
        if (c0733b == null) {
            c0733b = new C0733b();
            c0733b.f1280a = c0702m.m1203a();
            this.f1297p.put(c0702m.f1111a, c0733b);
        } else {
            this.f1297p.remove(c0702m.f1111a);
            this.f1297p.put(c0702m.f1111a, c0733b);
        }
        while (this.f1297p.size() > 200) {
            this.f1297p.remove(this.f1297p.keySet().toArray()[0]);
        }
        c0733b.f1281b = c0703n.f1129b;
        m1280u();
        return c0733b;
    }

    /* renamed from: u */
    private void m1280u() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (C0733b a : this.f1297p.values()) {
                jSONArray.put(a.m1264a());
            }
            String jSONArray2 = jSONArray.toString(0);
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("VodHistory", jSONArray2);
            edit.commit();
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "writeVodHistoryDataToProfile", e);
        }
    }

    /* renamed from: v */
    private void m1281v() {
        try {
            this.f1297p = new LinkedHashMap();
            String string = this.f1287f.f1276x.getString("VodHistory", "");
            if (!string.equals("")) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                int i = 0;
                while (i < length && i < 200) {
                    C0733b c0733b = new C0733b(jSONArray.getJSONObject(i));
                    this.f1297p.put(c0733b.f1280a.f1111a, c0733b);
                    i++;
                }
            }
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "readVodHistoryDataFromProfile", e);
        }
    }

    /* renamed from: o */
    public ArrayList<C0702m> m1329o() {
        ArrayList<C0702m> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f1297p.values());
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            arrayList.add(((C0733b) arrayList2.get(size)).f1280a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m1307b(C0702m c0702m) {
        return this.f1298q.containsKey(c0702m.f1111a);
    }

    /* renamed from: a */
    public void m1295a(C0702m c0702m, boolean z) {
        if (m1307b(c0702m) != z) {
            if (z) {
                this.f1298q.put(c0702m.f1111a, c0702m.m1203a());
            } else {
                this.f1298q.remove(c0702m.f1111a);
            }
            while (this.f1298q.size() > true) {
                this.f1298q.remove(this.f1298q.keySet().toArray()[0]);
            }
            m1282w();
        }
    }

    /* renamed from: p */
    public ArrayList<C0702m> m1330p() {
        Object arrayList = new ArrayList(this.f1298q.values());
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* renamed from: w */
    private void m1282w() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (C0702m b : this.f1298q.values()) {
                jSONArray.put(b.m1204b());
            }
            String jSONArray2 = jSONArray.toString(0);
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("VodFavorite", jSONArray2);
            edit.commit();
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "writeVodFavoriteDataToProfile", e);
        }
    }

    /* renamed from: x */
    private void m1283x() {
        try {
            this.f1298q = new LinkedHashMap();
            String string = this.f1287f.f1276x.getString("VodFavorite", "");
            if (!string.equals("")) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                int i = 0;
                while (i < length && i < 200) {
                    C0702m c0702m = new C0702m(jSONArray.getJSONObject(i), false);
                    this.f1298q.put(c0702m.f1111a, c0702m);
                    i++;
                }
            }
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "readVodFavoriteDataFromProfile", e);
        }
    }

    /* renamed from: a */
    public void m1296a(C0703n c0703n, float f) {
        if (this.f1299r.containsKey(c0703n.f1129b)) {
            this.f1299r.remove(c0703n.f1129b);
        }
        this.f1299r.put(c0703n.f1129b, Float.valueOf(f));
        while (this.f1299r.size() > 7.0E-43f) {
            this.f1299r.remove(this.f1299r.keySet().toArray()[0]);
        }
        m1284y();
    }

    /* renamed from: a */
    public float m1286a(C0703n c0703n) {
        return this.f1299r.containsKey(c0703n.f1129b) ? ((Float) this.f1299r.get(c0703n.f1129b)).floatValue() : null;
    }

    /* renamed from: y */
    private void m1284y() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (Entry entry : this.f1299r.entrySet()) {
                jSONArray.put(entry.getKey());
                jSONArray2.put(entry.getValue());
            }
            jSONObject.put("keys", jSONArray);
            jSONObject.put("values", jSONArray2);
            String jSONObject2 = jSONObject.toString(0);
            Editor edit = this.f1287f.f1276x.edit();
            edit.putString("VodClipPlayProgress", jSONObject2);
            edit.commit();
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "writeVodClipPlayProgressDataToProfile", e);
        }
    }

    /* renamed from: z */
    private void m1285z() {
        try {
            this.f1299r = new LinkedHashMap();
            String string = this.f1287f.f1276x.getString("VodClipPlayProgress", "");
            if (!string.equals("")) {
                JSONObject jSONObject = new JSONObject(string);
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                JSONArray jSONArray2 = jSONObject.getJSONArray("values");
                int length = jSONArray.length();
                int i = 0;
                while (i < length && i < 500) {
                    this.f1299r.put(jSONArray.getString(i), Float.valueOf((float) jSONArray2.getDouble(i)));
                    i++;
                }
            }
        } catch (Throwable e) {
            C0591c.m792a("DataCenter", "readVodClipPlayProgressDataFromProfile", e);
        }
    }
}
