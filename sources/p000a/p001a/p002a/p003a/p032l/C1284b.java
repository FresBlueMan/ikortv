package p000a.p001a.p002a.p003a.p032l;

import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: BasicHttpParams */
/* renamed from: a.a.a.a.l.b */
public class C1284b extends C0905a implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    /* renamed from: a */
    private final Map<String, Object> f2203a = new ConcurrentHashMap();

    /* renamed from: a */
    public Object mo1602a(String str) {
        return this.f2203a.get(str);
    }

    /* renamed from: a */
    public C0152e mo1601a(String str, Object obj) {
        if (str == null) {
            return this;
        }
        if (obj != null) {
            this.f2203a.put(str, obj);
        } else {
            this.f2203a.remove(str);
        }
        return this;
    }

    public Object clone() {
        C0152e c0152e = (C1284b) super.clone();
        m2695a(c0152e);
        return c0152e;
    }

    /* renamed from: a */
    public void m2695a(C0152e c0152e) {
        for (Entry entry : this.f2203a.entrySet()) {
            c0152e.mo1601a((String) entry.getKey(), entry.getValue());
        }
    }
}
