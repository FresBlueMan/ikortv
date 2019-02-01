package p000a.p001a.p002a.p003a.p005b.p010f;

/* compiled from: CloneUtils */
/* renamed from: a.a.a.a.b.f.a */
public class C0024a {
    /* renamed from: a */
    public static <T> T m84a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Cloneable) {
            try {
                try {
                    return t.getClass().getMethod("clone", (Class[]) null).invoke(t, (Object[]) null);
                } catch (T t2) {
                    t2 = t2.getCause();
                    if (t2 instanceof CloneNotSupportedException) {
                        throw ((CloneNotSupportedException) t2);
                    }
                    throw new Error("Unexpected exception", t2);
                } catch (T t22) {
                    throw new IllegalAccessError(t22.getMessage());
                }
            } catch (T t222) {
                throw new NoSuchMethodError(t222.getMessage());
            }
        }
        throw new CloneNotSupportedException();
    }
}
