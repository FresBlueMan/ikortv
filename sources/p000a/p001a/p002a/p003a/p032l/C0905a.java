package p000a.p001a.p002a.p003a.p032l;

@Deprecated
/* compiled from: AbstractHttpParams */
/* renamed from: a.a.a.a.l.a */
public abstract class C0905a implements C0152e {
    protected C0905a() {
    }

    /* renamed from: a */
    public long mo152a(String str, long j) {
        str = mo1602a(str);
        if (str == null) {
            return j;
        }
        return ((Long) str).longValue();
    }

    /* renamed from: b */
    public C0152e mo155b(String str, long j) {
        mo1601a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public int mo151a(String str, int i) {
        str = mo1602a(str);
        if (str == null) {
            return i;
        }
        return ((Integer) str).intValue();
    }

    /* renamed from: b */
    public C0152e mo154b(String str, int i) {
        mo1601a(str, (Object) Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public boolean mo153a(String str, boolean z) {
        str = mo1602a(str);
        if (str == null) {
            return z;
        }
        return ((Boolean) str).booleanValue();
    }

    /* renamed from: b */
    public C0152e mo156b(String str, boolean z) {
        mo1601a(str, (Object) z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    /* renamed from: b */
    public boolean mo157b(String str) {
        return mo153a(str, false);
    }

    /* renamed from: c */
    public boolean mo158c(String str) {
        return mo153a(str, false) ^ 1;
    }
}
