package p000a.p001a.p002a.p003a.p035o;

import java.util.Collection;

/* compiled from: Args */
/* renamed from: a.a.a.a.o.a */
public class C0160a {
    /* renamed from: a */
    public static void m480a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m481a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m478a(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be null");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static <T extends CharSequence> T m477a(T t, String str) {
        StringBuilder stringBuilder;
        if (t == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!C0167h.m527a(t)) {
            return t;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public static <T extends CharSequence> T m483b(T t, String str) {
        StringBuilder stringBuilder;
        if (t == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!C0167h.m528b(t)) {
            return t;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be blank");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static <E, T extends Collection<E>> T m479a(T t, String str) {
        StringBuilder stringBuilder;
        if (t == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!t.isEmpty()) {
            return t;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static int m475a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be negative or zero");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static int m482b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be negative");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static long m476a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be negative");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
