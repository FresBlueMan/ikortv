package p000a.p001a.p002a.p003a.p031k;

import java.io.Serializable;
import p000a.p001a.p002a.p003a.ac;
import p000a.p001a.p002a.p003a.ae;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: BasicRequestLine */
/* renamed from: a.a.a.a.k.m */
public class C0902m implements ae, Serializable, Cloneable {
    private static final long serialVersionUID = 2810581718468737193L;
    /* renamed from: a */
    private final ac f1677a;
    /* renamed from: b */
    private final String f1678b;
    /* renamed from: c */
    private final String f1679c;

    public C0902m(String str, String str2, ac acVar) {
        this.f1678b = (String) C0160a.m478a((Object) str, "Method");
        this.f1679c = (String) C0160a.m478a((Object) str2, "URI");
        this.f1677a = (ac) C0160a.m478a((Object) acVar, "Version");
    }

    /* renamed from: a */
    public String mo143a() {
        return this.f1678b;
    }

    /* renamed from: b */
    public ac mo144b() {
        return this.f1677a;
    }

    /* renamed from: c */
    public String mo145c() {
        return this.f1679c;
    }

    public String toString() {
        return C0898i.f1667b.mo134a(null, (ae) this).toString();
    }

    public Object clone() {
        return super.clone();
    }
}
