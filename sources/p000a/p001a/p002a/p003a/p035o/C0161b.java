package p000a.p001a.p002a.p003a.p035o;

/* compiled from: Asserts */
/* renamed from: a.a.a.a.o.b */
public class C0161b {
    /* renamed from: a */
    public static void m485a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m484a(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" is null");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
