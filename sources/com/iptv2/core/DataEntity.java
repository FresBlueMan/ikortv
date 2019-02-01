package com.iptv2.core;

import com.iptv2.p043b.C0595e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public final class DataEntity {

    public static class RandomAccountInfo {
        public String password;
        public String userName;
    }

    /* renamed from: com.iptv2.core.DataEntity$a */
    public static class C0692a {
        /* renamed from: a */
        public int f1068a;
        /* renamed from: b */
        public String f1069b;

        public C0692a(JSONObject jSONObject) {
            this.f1068a = jSONObject.getInt("duration");
            this.f1069b = jSONObject.getString("title");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$b */
    public static class C0693b {
        /* renamed from: a */
        public String f1070a;
        /* renamed from: b */
        public String f1071b;
        /* renamed from: c */
        public int f1072c;
        /* renamed from: d */
        public String f1073d;
        /* renamed from: e */
        public boolean f1074e;
        /* renamed from: f */
        public boolean f1075f;
        /* renamed from: g */
        public String f1076g;
        /* renamed from: h */
        public C0694c f1077h;
        /* renamed from: i */
        public ArrayList<C0695d> f1078i = new ArrayList();
        /* renamed from: j */
        public C0693b f1079j;
        /* renamed from: k */
        public C0693b f1080k;
        /* renamed from: l */
        public C0699i f1081l;

        public /* synthetic */ Object clone() {
            return m1202a();
        }

        public C0693b(JSONObject jSONObject) {
            this.f1070a = jSONObject.getString("channelId");
            this.f1071b = jSONObject.getString("name");
            this.f1073d = jSONObject.getString("logoPath");
            this.f1076g = jSONObject.getString("genre");
            this.f1072c = jSONObject.getInt("keyCode");
            this.f1074e = jSONObject.getBoolean("record");
            this.f1075f = jSONObject.getBoolean("timeshift");
            this.f1077h = new C0694c(jSONObject.getJSONObject("config"));
            jSONObject = jSONObject.getJSONArray(IjkMediaMeta.IJKM_KEY_STREAMS);
            int length = jSONObject.length();
            for (int i = 0; i < length; i++) {
                this.f1078i.add(new C0695d(jSONObject.getJSONObject(i)));
            }
        }

        /* renamed from: a */
        public C0693b m1202a() {
            C0693b c0693b = new C0693b();
            c0693b.f1070a = this.f1070a;
            c0693b.f1071b = this.f1071b;
            c0693b.f1076g = this.f1076g;
            c0693b.f1072c = this.f1072c;
            c0693b.f1073d = this.f1073d;
            c0693b.f1074e = this.f1074e;
            c0693b.f1075f = this.f1075f;
            c0693b.f1078i = this.f1078i;
            c0693b.f1077h = this.f1077h;
            return c0693b;
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$c */
    public static class C0694c {
        /* renamed from: a */
        public boolean f1082a;
        /* renamed from: b */
        public boolean f1083b;
        /* renamed from: c */
        public String f1084c;
        /* renamed from: d */
        public String f1085d;
        /* renamed from: e */
        public String f1086e;

        public C0694c(JSONObject jSONObject) {
            this.f1083b = jSONObject.getBoolean("free");
            this.f1082a = jSONObject.optBoolean("disallow", false);
            this.f1084c = jSONObject.optString("disallowTip", "");
            this.f1085d = jSONObject.optString("disallowAction", "");
            this.f1086e = jSONObject.optString("disallowActionConfig", "");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$d */
    public static class C0695d {
        /* renamed from: a */
        public String f1087a;
        /* renamed from: b */
        public String f1088b;

        public C0695d(JSONObject jSONObject) {
            this.f1087a = jSONObject.getString("streamId");
            this.f1088b = jSONObject.getString("streamName");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$e */
    public static class C0696e {
        /* renamed from: a */
        public String f1089a;
        /* renamed from: b */
        public ArrayList<C0697f> f1090b = new ArrayList();
        /* renamed from: c */
        public HashMap<String, C0697f> f1091c = new HashMap();
        /* renamed from: d */
        public ArrayList<C1173g> f1092d = new ArrayList();

        public C0696e(String str, JSONObject jSONObject) {
            this.f1089a = str;
            str = jSONObject.names();
            if (str != null) {
                Object arrayList = new ArrayList();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(str.getString(i));
                }
                Collections.sort(arrayList);
                str = null;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C0697f c0697f = new C0697f();
                    c0697f.f1093a = str2;
                    c0697f.f1094b = C0730c.f1243g.parse(c0697f.f1093a);
                    String[] split = jSONObject.getString(c0697f.f1093a).split("\\|");
                    int length2 = split.length;
                    C1173g c1173g = str;
                    str = null;
                    while (str < length2) {
                        C1173g c1173g2 = new C1173g(c0697f, split[str]);
                        c0697f.f1095c.add(c1173g2);
                        this.f1092d.add(c1173g2);
                        if (c1173g != null) {
                            c1173g.f2059d = c1173g2;
                        }
                        str++;
                        c1173g = c1173g2;
                    }
                    this.f1090b.add(c0697f);
                    this.f1091c.put(c0697f.f1093a, c0697f);
                    Object obj = c1173g;
                }
            }
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$f */
    public static class C0697f {
        /* renamed from: a */
        public String f1093a;
        /* renamed from: b */
        public Date f1094b;
        /* renamed from: c */
        public ArrayList<C0698h> f1095c = new ArrayList();
    }

    /* renamed from: com.iptv2.core.DataEntity$h */
    public static class C0698h {
        /* renamed from: e */
        public String f1096e;
        /* renamed from: f */
        public C0697f f1097f;
        /* renamed from: g */
        public String f1098g;
        /* renamed from: h */
        public int f1099h;
    }

    /* renamed from: com.iptv2.core.DataEntity$i */
    public static class C0699i {
        /* renamed from: a */
        public String f1100a;
        /* renamed from: b */
        public ArrayList<C0693b> f1101b = new ArrayList();
        /* renamed from: c */
        public int f1102c;
        /* renamed from: d */
        public C0699i f1103d;
        /* renamed from: e */
        public C0699i f1104e;
    }

    /* renamed from: com.iptv2.core.DataEntity$k */
    public static class C0700k {
        /* renamed from: a */
        public String f1105a;
        /* renamed from: b */
        public String f1106b;
        /* renamed from: c */
        public int f1107c;

        public C0700k(JSONObject jSONObject) {
            this.f1105a = jSONObject.getString("streamId");
            this.f1106b = jSONObject.getString("recordId");
            this.f1107c = jSONObject.getInt("duration");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$l */
    public static class C0701l {
        /* renamed from: a */
        public String[] f1108a;
        /* renamed from: b */
        public String f1109b;
        /* renamed from: c */
        public String f1110c;

        public C0701l(JSONObject jSONObject) {
            this.f1109b = jSONObject.getString("md5");
            this.f1110c = jSONObject.getString("updateInfo");
            this.f1108a = jSONObject.getString(OnNativeInvokeListener.ARG_URL).split(",");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$m */
    public static class C0702m {
        /* renamed from: a */
        public String f1111a;
        /* renamed from: b */
        public String f1112b;
        /* renamed from: c */
        public String f1113c;
        /* renamed from: d */
        public String f1114d;
        /* renamed from: e */
        public double f1115e;
        /* renamed from: f */
        public String f1116f;
        /* renamed from: g */
        public String f1117g;
        /* renamed from: h */
        public String f1118h;
        /* renamed from: i */
        public String f1119i;
        /* renamed from: j */
        public String f1120j;
        /* renamed from: k */
        public String f1121k;
        /* renamed from: l */
        public String f1122l;
        /* renamed from: m */
        public String f1123m;
        /* renamed from: n */
        public C0705p f1124n;
        /* renamed from: o */
        public ArrayList<C0703n> f1125o;
        /* renamed from: p */
        public HashMap<String, C0703n> f1126p;
        /* renamed from: q */
        public C0704o f1127q;

        public C0702m() {
            this.f1125o = new ArrayList();
            this.f1126p = new HashMap();
        }

        public C0702m(JSONObject jSONObject) {
            this(jSONObject, true);
        }

        public C0702m(JSONObject jSONObject, boolean z) {
            this.f1125o = new ArrayList();
            this.f1126p = new HashMap();
            this.f1111a = jSONObject.getString("vodId");
            this.f1112b = jSONObject.getString("enName");
            this.f1113c = jSONObject.getString("name");
            this.f1115e = jSONObject.getDouble("score");
            this.f1124n = new C0705p(jSONObject.getJSONObject("logoPath"));
            if (z) {
                this.f1114d = jSONObject.getString("artist");
                this.f1116f = jSONObject.getString("area");
                this.f1117g = jSONObject.getString("description");
                this.f1118h = jSONObject.getString("genre");
                this.f1119i = jSONObject.getString("subGenre");
                this.f1120j = jSONObject.getString("director");
                this.f1121k = jSONObject.getString("editor");
                this.f1122l = jSONObject.getString("showYear");
                this.f1123m = jSONObject.getString("lang");
                this.f1127q = new C0704o(jSONObject.getJSONObject("config"));
                jSONObject = jSONObject.getJSONArray("clips");
                z = jSONObject.length();
                C0703n c0703n = null;
                boolean z2 = false;
                while (z2 < z) {
                    C0703n c0703n2 = new C0703n(jSONObject.getJSONObject(z2));
                    c0703n2.f1130c = z2;
                    if (c0703n != null) {
                        c0703n.f1132e = c0703n2;
                    }
                    c0703n2.f1131d = c0703n;
                    this.f1125o.add(c0703n2);
                    this.f1126p.put(c0703n2.f1129b, c0703n2);
                    z2++;
                    c0703n = c0703n2;
                }
            }
        }

        /* renamed from: a */
        public C0702m m1203a() {
            C0702m c0702m = new C0702m();
            c0702m.f1111a = this.f1111a;
            c0702m.f1113c = this.f1113c;
            c0702m.f1112b = this.f1112b;
            c0702m.f1115e = this.f1115e;
            c0702m.f1124n = new C0705p();
            c0702m.f1124n.f1137a = this.f1124n.f1137a;
            c0702m.f1124n.f1138b = this.f1124n.f1138b;
            return c0702m;
        }

        /* renamed from: b */
        public JSONObject m1204b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vodId", this.f1111a);
            jSONObject.put("score", this.f1115e);
            jSONObject.put("name", this.f1113c);
            jSONObject.put("enName", this.f1112b);
            jSONObject.put("logoPath", this.f1124n.m1205a());
            return jSONObject;
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$n */
    public static class C0703n {
        /* renamed from: a */
        public String f1128a;
        /* renamed from: b */
        public String f1129b;
        /* renamed from: c */
        public int f1130c;
        /* renamed from: d */
        public C0703n f1131d;
        /* renamed from: e */
        public C0703n f1132e;

        public C0703n(JSONObject jSONObject) {
            this.f1128a = jSONObject.getString("name");
            this.f1129b = jSONObject.getString("clipId");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$o */
    public static class C0704o {
        /* renamed from: a */
        public boolean f1133a;
        /* renamed from: b */
        public String f1134b;
        /* renamed from: c */
        public String f1135c;
        /* renamed from: d */
        public String f1136d;

        public C0704o(JSONObject jSONObject) {
            this.f1133a = jSONObject.optBoolean("disallow", false);
            this.f1134b = jSONObject.optString("disallowTip", "");
            this.f1135c = jSONObject.optString("disallowAction", "");
            this.f1136d = jSONObject.optString("disallowActionConfig", "");
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$p */
    public static class C0705p {
        /* renamed from: a */
        public String f1137a;
        /* renamed from: b */
        public String f1138b;

        public C0705p(JSONObject jSONObject) {
            this.f1137a = jSONObject.getString("small");
            this.f1138b = jSONObject.getString("big");
        }

        /* renamed from: a */
        public JSONObject m1205a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("small", this.f1137a);
            jSONObject.put("big", this.f1138b);
            return jSONObject;
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$g */
    public static class C1173g extends C0698h {
        /* renamed from: a */
        public int f2056a;
        /* renamed from: b */
        public long f2057b;
        /* renamed from: c */
        public int f2058c;
        /* renamed from: d */
        public C1173g f2059d;

        public C1173g(C0697f c0697f, String str) {
            this.f = c0697f;
            this.e = str.substring(6);
            this.f2056a = Integer.parseInt(str.substring(0, 3), 16);
            this.f2058c = Integer.parseInt(str.substring(3, 6), 16);
            this.g = C0595e.m816b(this.f2056a);
            c0697f = Calendar.getInstance();
            c0697f.setTime(this.f.f1094b);
            c0697f.add(12, this.f2056a);
            this.f2057b = c0697f.getTimeInMillis();
        }
    }

    /* renamed from: com.iptv2.core.DataEntity$j */
    public static class C1174j extends C0698h {
        /* renamed from: a */
        public String f2060a;
        /* renamed from: b */
        public ArrayList<C0700k> f2061b = new ArrayList();
        /* renamed from: c */
        public C1174j f2062c;
        /* renamed from: d */
        public C1174j f2063d;

        public C1174j(C0697f c0697f, JSONObject jSONObject) {
            this.f = c0697f;
            this.e = jSONObject.getString("name");
            this.f2060a = jSONObject.getString("time");
            int i = 0;
            this.g = this.f2060a.split("\\-")[0];
            c0697f = jSONObject.getJSONArray(IjkMediaMeta.IJKM_KEY_STREAMS);
            jSONObject = c0697f.length();
            while (i < jSONObject) {
                this.f2061b.add(new C0700k(c0697f.getJSONObject(i)));
                i++;
            }
        }
    }
}
