package com.iptv2.core;

import com.iptv2.core.DataEntity.C0692a;
import com.iptv2.core.DataEntity.C0693b;
import com.iptv2.core.DataEntity.C0696e;
import com.iptv2.core.DataEntity.C0697f;
import com.iptv2.core.DataEntity.C0699i;
import com.iptv2.core.DataEntity.C0701l;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C1174j;
import com.iptv2.p043b.C0595e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

/* compiled from: ApiEntity */
/* renamed from: com.iptv2.core.a */
public final class C0712a {

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$a */
    public static class C0706a {
        /* renamed from: a */
        public HashMap<String, C0696e> f1139a = new HashMap();

        public C0706a(JSONObject jSONObject) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                C0696e c0696e = new C0696e(str, jSONObject.getJSONObject(str));
                if (c0696e.f1090b.size() != 0) {
                    this.f1139a.put(str, c0696e);
                }
            }
        }
    }

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$b */
    public static class C0707b {
        /* renamed from: a */
        public C0692a f1140a;
        /* renamed from: b */
        public ArrayList<C0702m> f1141b = new ArrayList();

        public C0707b(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("announce");
            if (optJSONObject != null) {
                this.f1140a = new C0692a(optJSONObject);
            }
            jSONObject = jSONObject.getJSONArray("vods");
            int length = jSONObject.length();
            for (int i = 0; i < length; i++) {
                this.f1141b.add(new C0702m(jSONObject.getJSONObject(i), false));
            }
        }
    }

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$c */
    public static class C0708c {
        /* renamed from: a */
        public ArrayList<C0699i> f1142a = new ArrayList();
        /* renamed from: b */
        public ArrayList<C0693b> f1143b = new ArrayList();
        /* renamed from: c */
        public LinkedHashMap<String, String> f1144c = new LinkedHashMap();
        /* renamed from: d */
        public LinkedHashMap<String, String> f1145d = new LinkedHashMap();
        /* renamed from: e */
        public C0701l f1146e;
        /* renamed from: f */
        public C0692a f1147f;
        /* renamed from: g */
        public String f1148g;
        /* renamed from: h */
        public String f1149h;
        /* renamed from: i */
        public Date f1150i;
        /* renamed from: j */
        public Date f1151j;
        /* renamed from: k */
        public int f1152k;
        /* renamed from: l */
        public String f1153l;
        /* renamed from: m */
        public String f1154m;
        /* renamed from: n */
        public int f1155n;
        /* renamed from: o */
        public int f1156o;
        /* renamed from: p */
        public String f1157p;
        /* renamed from: q */
        public String f1158q;
        /* renamed from: r */
        public String f1159r;
        /* renamed from: s */
        public String f1160s;
        /* renamed from: t */
        public String f1161t;
        /* renamed from: u */
        public String f1162u;

        public C0708c(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("upgrade");
            if (Application.f1063b) {
                optJSONObject = new JSONObject();
                optJSONObject.put("md5", "");
                optJSONObject.put("updateInfo", "......update");
                optJSONObject.put(OnNativeInvokeListener.ARG_URL, "http://192.168.2.105/test.apk");
            }
            if (optJSONObject != null) {
                this.f1146e = new C0701l(optJSONObject);
                return;
            }
            int i;
            optJSONObject = jSONObject.optJSONObject("announce");
            if (optJSONObject != null) {
                this.f1147f = new C0692a(optJSONObject);
            }
            this.f1148g = jSONObject.getString("playId");
            this.f1149h = jSONObject.getString("playPassword");
            this.f1150i = C0730c.f1245i.parse(jSONObject.getString("expireTime"));
            this.f1151j = C0730c.f1245i.parse(jSONObject.getString("serverTime"));
            this.f1152k = jSONObject.getInt("accountStatus");
            this.f1153l = jSONObject.getString("serviceSet");
            this.f1154m = jSONObject.getString("productUIMode");
            this.f1155n = jSONObject.getInt("statusRequestInterval");
            this.f1156o = jSONObject.getInt("statusRequestTimeout");
            optJSONObject = jSONObject.getJSONObject("config");
            this.f1157p = C0595e.m807a(",", optJSONObject.getJSONArray("liveServer"));
            this.f1161t = C0595e.m807a(",", optJSONObject.getJSONArray("recordServer"));
            this.f1162u = C0595e.m807a(",", optJSONObject.getJSONArray("vodServer"));
            this.f1158q = optJSONObject.getString("stunServer");
            this.f1159r = optJSONObject.getString("logoServer");
            this.f1160s = optJSONObject.getString("epgServer");
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = jSONObject.getJSONArray("channels");
            int length = jSONArray.length();
            for (i = 0; i < length; i++) {
                C0693b c0693b = new C0693b(jSONArray.getJSONObject(i));
                for (String str : c0693b.f1076g.split(",")) {
                    C0699i c0699i;
                    if (hashMap.containsKey(str)) {
                        c0699i = (C0699i) hashMap.get(str);
                    } else {
                        C0699i c0699i2 = new C0699i();
                        c0699i2.f1100a = str;
                        hashMap.put(str, c0699i2);
                        c0699i = c0699i2;
                    }
                    c0699i.f1101b.add(c0693b);
                }
                this.f1143b.add(c0693b);
            }
            jSONArray = jSONObject.getJSONArray("channelGenres");
            length = jSONArray.length();
            for (i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (hashMap.containsKey(string)) {
                    this.f1142a.add(hashMap.get(string));
                }
            }
            jSONObject = jSONObject.optJSONObject("vodGenres");
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("电影");
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    for (length = 0; length < length2; length++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(length);
                        this.f1145d.put(jSONObject2.getString("name"), jSONObject2.getString("text"));
                    }
                }
                jSONObject = jSONObject.optJSONArray("电视剧");
                if (jSONObject != null) {
                    int length3 = jSONObject.length();
                    for (int i2 = 0; i2 < length3; i2++) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(i2);
                        this.f1144c.put(jSONObject3.getString("name"), jSONObject3.getString("text"));
                    }
                }
            }
        }
    }

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$d */
    public static class C0709d {
        /* renamed from: a */
        public ArrayList<C0697f> f1163a = new ArrayList();

        public C0709d(JSONObject jSONObject) {
            jSONObject = jSONObject.getJSONArray("days");
            int length = jSONObject.length();
            C1174j c1174j = null;
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(i);
                C0697f c0697f = new C0697f();
                c0697f.f1093a = jSONObject2.getString("date");
                c0697f.f1094b = C0730c.f1243g.parse(c0697f.f1093a);
                JSONArray jSONArray = jSONObject2.getJSONArray("records");
                int length2 = jSONArray.length();
                C1174j c1174j2 = c1174j;
                int i2 = 0;
                while (i2 < length2) {
                    C1174j c1174j3 = new C1174j(c0697f, jSONArray.getJSONObject(i2));
                    c0697f.f1095c.add(c1174j3);
                    if (c1174j2 != null) {
                        c1174j2.f2063d = c1174j3;
                    }
                    c1174j3.f2062c = c1174j2;
                    i2++;
                    c1174j2 = c1174j3;
                }
                this.f1163a.add(c0697f);
                i++;
                c1174j = c1174j2;
            }
        }
    }

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$e */
    public static class C0710e {
        /* renamed from: a */
        public int f1164a;

        public C0710e(JSONObject jSONObject) {
            this.f1164a = jSONObject.getInt("nextStatusRequestInterval");
        }
    }

    /* compiled from: ApiEntity */
    /* renamed from: com.iptv2.core.a$f */
    public static class C0711f {
        /* renamed from: a */
        public int f1165a;
        /* renamed from: b */
        public int f1166b;
        /* renamed from: c */
        public int f1167c;
        /* renamed from: d */
        public ArrayList<C0702m> f1168d = new ArrayList();

        public C0711f(JSONObject jSONObject) {
            this.f1165a = jSONObject.getInt("pageIndex");
            if (this.f1165a > 0) {
                this.f1165a--;
            }
            this.f1166b = jSONObject.getInt("pageCount");
            this.f1167c = jSONObject.getInt("totalCount");
            jSONObject = jSONObject.getJSONArray("vods");
            int length = jSONObject.length();
            for (int i = 0; i < length; i++) {
                this.f1168d.add(new C0702m(jSONObject.getJSONObject(i), false));
            }
        }
    }
}
