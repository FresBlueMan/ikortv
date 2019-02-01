package p000a.p001a.p002a.p003a.p035o;

/* compiled from: LangUtils */
/* renamed from: a.a.a.a.o.g */
public final class C0166g {
    /* renamed from: a */
    public static int m522a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m524a(int i, boolean z) {
        return C0166g.m522a(i, (int) z);
    }

    /* renamed from: a */
    public static int m523a(int i, Object obj) {
        return C0166g.m522a(i, obj != null ? obj.hashCode() : null);
    }

    /* renamed from: a */
    public static boolean m525a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    public static boolean m526a(Object[] objArr, Object[] objArr2) {
        boolean z = true;
        if (objArr == null) {
            if (objArr2 != null) {
                z = false;
            }
            return z;
        } else if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        } else {
            for (int i = 0; i < objArr.length; i++) {
                if (!C0166g.m525a(objArr[i], objArr2[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
