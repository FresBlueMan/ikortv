package p000a.p001a.p002a.p003a.p022i.p027d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C0830m;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicClientCookie */
/* renamed from: a.a.a.a.i.d.c */
public class C1267c implements C0827a, C0830m, Serializable, Cloneable {
    private static final long serialVersionUID = -3869795591041535538L;
    /* renamed from: a */
    private final String f2175a;
    /* renamed from: b */
    private Map<String, String> f2176b = new HashMap();
    /* renamed from: c */
    private String f2177c;
    /* renamed from: d */
    private String f2178d;
    /* renamed from: e */
    private String f2179e;
    /* renamed from: f */
    private Date f2180f;
    /* renamed from: g */
    private String f2181g;
    /* renamed from: h */
    private boolean f2182h;
    /* renamed from: i */
    private int f2183i;

    /* renamed from: h */
    public int[] mo1621h() {
        return null;
    }

    public C1267c(String str, String str2) {
        C0160a.m478a((Object) str, "Name");
        this.f2175a = str;
        this.f2177c = str2;
    }

    /* renamed from: a */
    public String mo1605a() {
        return this.f2175a;
    }

    /* renamed from: b */
    public String mo1610b() {
        return this.f2177c;
    }

    /* renamed from: c */
    public String mo1613c() {
        return this.f2178d;
    }

    /* renamed from: c */
    public void mo1614c(String str) {
        this.f2178d = str;
    }

    /* renamed from: d */
    public Date mo1615d() {
        return this.f2180f;
    }

    /* renamed from: b */
    public void mo1611b(Date date) {
        this.f2180f = date;
    }

    /* renamed from: e */
    public boolean mo1618e() {
        return this.f2180f != null;
    }

    /* renamed from: f */
    public String mo1619f() {
        return this.f2179e;
    }

    /* renamed from: d */
    public void mo1616d(String str) {
        if (str != null) {
            this.f2179e = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.f2179e = null;
        }
    }

    /* renamed from: g */
    public String mo1620g() {
        return this.f2181g;
    }

    /* renamed from: e */
    public void mo1617e(String str) {
        this.f2181g = str;
    }

    /* renamed from: i */
    public boolean mo1622i() {
        return this.f2182h;
    }

    /* renamed from: a */
    public void mo1608a(boolean z) {
        this.f2182h = z;
    }

    /* renamed from: j */
    public int mo1623j() {
        return this.f2183i;
    }

    /* renamed from: a */
    public void mo1607a(int i) {
        this.f2183i = i;
    }

    /* renamed from: a */
    public boolean mo1609a(Date date) {
        C0160a.m478a((Object) date, "Date");
        return (this.f2180f == null || this.f2180f.getTime() > date.getTime()) ? null : true;
    }

    /* renamed from: a */
    public void m2643a(String str, String str2) {
        this.f2176b.put(str, str2);
    }

    /* renamed from: a */
    public String mo1606a(String str) {
        return (String) this.f2176b.get(str);
    }

    /* renamed from: b */
    public boolean mo1612b(String str) {
        return this.f2176b.get(str) != null ? true : null;
    }

    public Object clone() {
        C1267c c1267c = (C1267c) super.clone();
        c1267c.f2176b = new HashMap(this.f2176b);
        return c1267c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[version: ");
        stringBuilder.append(Integer.toString(this.f2183i));
        stringBuilder.append("]");
        stringBuilder.append("[name: ");
        stringBuilder.append(this.f2175a);
        stringBuilder.append("]");
        stringBuilder.append("[value: ");
        stringBuilder.append(this.f2177c);
        stringBuilder.append("]");
        stringBuilder.append("[domain: ");
        stringBuilder.append(this.f2179e);
        stringBuilder.append("]");
        stringBuilder.append("[path: ");
        stringBuilder.append(this.f2181g);
        stringBuilder.append("]");
        stringBuilder.append("[expiry: ");
        stringBuilder.append(this.f2180f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
