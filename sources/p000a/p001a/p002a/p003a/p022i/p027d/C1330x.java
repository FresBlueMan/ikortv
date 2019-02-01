package p000a.p001a.p002a.p003a.p022i.p027d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0091f;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0086e;
import p000a.p001a.p002a.p003a.p019f.C0087f;
import p000a.p001a.p002a.p003a.p019f.C0827a;
import p000a.p001a.p002a.p003a.p019f.C1254l;
import p000a.p001a.p002a.p003a.p019f.C1320g;
import p000a.p001a.p002a.p003a.p031k.C1283p;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0163d;

/* compiled from: RFC2109Spec */
/* renamed from: a.a.a.a.i.d.x */
public class C1330x extends C1274p {
    /* renamed from: a */
    private static final C0087f f2295a = new C0087f();
    /* renamed from: b */
    private static final String[] f2296b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    /* renamed from: c */
    private final String[] f2297c;
    /* renamed from: d */
    private final boolean f2298d;

    /* renamed from: a */
    public int mo96a() {
        return 1;
    }

    /* renamed from: b */
    public C0082e mo100b() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }

    public C1330x(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f2297c = (String[]) strArr.clone();
        } else {
            this.f2297c = f2296b;
        }
        this.f2298d = z;
        m1768a("version", new C1276z());
        m1768a("path", new C0876i());
        m1768a("domain", new C0882w());
        m1768a("max-age", new C1270h());
        m1768a("secure", new C1271j());
        m1768a("comment", new C1268e());
        m1768a("expires", new C1269g(this.f2297c));
    }

    public C1330x() {
        this(null, false);
    }

    /* renamed from: a */
    public List<C0083b> mo97a(C0082e c0082e, C0086e c0086e) {
        C0160a.m478a((Object) c0082e, "Header");
        C0160a.m478a((Object) c0086e, "Cookie origin");
        if (c0082e.mo121c().equalsIgnoreCase("Set-Cookie")) {
            return mo2028a((C0091f[]) c0082e.mo123e(), c0086e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized cookie header '");
        stringBuilder.append(c0082e.toString());
        stringBuilder.append("'");
        throw new C1254l(stringBuilder.toString());
    }

    /* renamed from: a */
    public void mo99a(C0083b c0083b, C0086e c0086e) {
        C0160a.m478a((Object) c0083b, "Cookie");
        String a = c0083b.mo1605a();
        if (a.indexOf(32) != -1) {
            throw new C1320g("Cookie name may not contain blanks");
        } else if (a.startsWith("$")) {
            throw new C1320g("Cookie name may not start with $");
        } else {
            super.mo99a(c0083b, c0086e);
        }
    }

    /* renamed from: a */
    public List<C0082e> mo98a(List<C0083b> list) {
        C0160a.m479a((Collection) list, "List of cookies");
        if (list.size() > 1) {
            List<C0083b> arrayList = new ArrayList(list);
            Collections.sort(arrayList, f2295a);
            list = arrayList;
        }
        if (this.f2298d) {
            return m2822b(list);
        }
        return m2823c(list);
    }

    /* renamed from: b */
    private List<C0082e> m2822b(List<C0083b> list) {
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (C0083b c0083b : list) {
            if (c0083b.mo1623j() < i) {
                i = c0083b.mo1623j();
            }
        }
        C0163d c0163d = new C0163d(list.size() * 40);
        c0163d.m507a("Cookie");
        c0163d.m507a(": ");
        c0163d.m507a("$Version=");
        c0163d.m507a(Integer.toString(i));
        for (C0083b c0083b2 : list) {
            c0163d.m507a("; ");
            mo2029a(c0163d, c0083b2, i);
        }
        list = new ArrayList(1);
        list.add(new C1283p(c0163d));
        return list;
    }

    /* renamed from: c */
    private List<C0082e> m2823c(List<C0083b> list) {
        List<C0082e> arrayList = new ArrayList(list.size());
        for (C0083b c0083b : list) {
            int j = c0083b.mo1623j();
            C0163d c0163d = new C0163d(40);
            c0163d.m507a("Cookie: ");
            c0163d.m507a("$Version=");
            c0163d.m507a(Integer.toString(j));
            c0163d.m507a("; ");
            mo2029a(c0163d, c0083b, j);
            arrayList.add(new C1283p(c0163d));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void m2829a(C0163d c0163d, String str, String str2, int i) {
        c0163d.m507a(str);
        c0163d.m507a("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            c0163d.m504a('\"');
            c0163d.m507a(str2);
            c0163d.m504a('\"');
            return;
        }
        c0163d.m507a(str2);
    }

    /* renamed from: a */
    protected void mo2029a(C0163d c0163d, C0083b c0083b, int i) {
        m2829a(c0163d, c0083b.mo1605a(), c0083b.mo1610b(), i);
        if (c0083b.mo1620g() != null && (c0083b instanceof C0827a) && ((C0827a) c0083b).mo1612b("path")) {
            c0163d.m507a("; ");
            m2829a(c0163d, "$Path", c0083b.mo1620g(), i);
        }
        if (c0083b.mo1619f() != null && (c0083b instanceof C0827a) && ((C0827a) c0083b).mo1612b("domain")) {
            c0163d.m507a("; ");
            m2829a(c0163d, "$Domain", c0083b.mo1619f(), i);
        }
    }
}
