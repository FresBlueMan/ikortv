package p000a.p001a.p002a.p003a.p022i.p024b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import p000a.p001a.p002a.p003a.p005b.C0033h;
import p000a.p001a.p002a.p003a.p019f.C0083b;
import p000a.p001a.p002a.p003a.p019f.C0085d;

/* compiled from: BasicCookieStore */
/* renamed from: a.a.a.a.i.b.e */
public class C0845e implements C0033h, Serializable {
    private static final long serialVersionUID = -7581093305228232025L;
    /* renamed from: a */
    private final TreeSet<C0083b> f1501a = new TreeSet(new C0085d());

    public synchronized void addCookie(C0083b c0083b) {
        if (c0083b != null) {
            this.f1501a.remove(c0083b);
            if (!c0083b.mo1609a(new Date())) {
                this.f1501a.add(c0083b);
            }
        }
    }

    public synchronized List<C0083b> getCookies() {
        return new ArrayList(this.f1501a);
    }

    public synchronized String toString() {
        return this.f1501a.toString();
    }
}
