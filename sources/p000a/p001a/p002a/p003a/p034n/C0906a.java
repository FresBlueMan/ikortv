package p000a.p001a.p002a.p003a.p034n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicHttpContext */
/* renamed from: a.a.a.a.n.a */
public class C0906a implements C0157e {
    /* renamed from: a */
    private final C0157e f1687a;
    /* renamed from: b */
    private final Map<String, Object> f1688b;

    public C0906a() {
        this(null);
    }

    public C0906a(C0157e c0157e) {
        this.f1688b = new ConcurrentHashMap();
        this.f1687a = c0157e;
    }

    /* renamed from: a */
    public Object mo159a(String str) {
        C0160a.m478a((Object) str, "Id");
        Object obj = this.f1688b.get(str);
        return (obj != null || this.f1687a == null) ? obj : this.f1687a.mo159a(str);
    }

    /* renamed from: a */
    public void mo160a(String str, Object obj) {
        C0160a.m478a((Object) str, "Id");
        if (obj != null) {
            this.f1688b.put(str, obj);
        } else {
            this.f1688b.remove(str);
        }
    }

    public String toString() {
        return this.f1688b.toString();
    }
}
