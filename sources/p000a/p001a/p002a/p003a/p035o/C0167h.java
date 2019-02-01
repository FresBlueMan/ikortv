package p000a.p001a.p002a.p003a.p035o;

/* compiled from: TextUtils */
/* renamed from: a.a.a.a.o.h */
public final class C0167h {
    /* renamed from: a */
    public static boolean m527a(CharSequence charSequence) {
        boolean z = true;
        if (charSequence == null) {
            return true;
        }
        if (charSequence.length() != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m528b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
