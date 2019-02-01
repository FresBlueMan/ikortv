package p000a.p001a.p002a.p003a.p022i.p024b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicCredentialsProvider */
/* renamed from: a.a.a.a.i.b.f */
public class C0846f implements C0034i {
    /* renamed from: a */
    private final ConcurrentHashMap<C0005g, C0009m> f1502a = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo52a(C0005g c0005g, C0009m c0009m) {
        C0160a.m478a((Object) c0005g, "Authentication scope");
        this.f1502a.put(c0005g, c0009m);
    }

    /* renamed from: a */
    private static C0009m m1635a(Map<C0005g, C0009m> map, C0005g c0005g) {
        C0009m c0009m = (C0009m) map.get(c0005g);
        if (c0009m != null) {
            return c0009m;
        }
        int i = -1;
        Object obj = null;
        for (C0005g c0005g2 : map.keySet()) {
            int a = c0005g.m10a(c0005g2);
            if (a > i) {
                obj = c0005g2;
                i = a;
            }
        }
        return obj != null ? (C0009m) map.get(obj) : c0009m;
    }

    /* renamed from: a */
    public C0009m mo50a(C0005g c0005g) {
        C0160a.m478a((Object) c0005g, "Authentication scope");
        return C0846f.m1635a(this.f1502a, c0005g);
    }

    /* renamed from: a */
    public void mo51a() {
        this.f1502a.clear();
    }

    public String toString() {
        return this.f1502a.toString();
    }
}
