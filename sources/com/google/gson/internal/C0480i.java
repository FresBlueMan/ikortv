package com.google.gson.internal;

import com.google.gson.C0482j;
import com.google.gson.internal.bind.C0466i;
import com.google.gson.p040c.C0448c;
import java.io.Writer;

/* compiled from: Streams */
/* renamed from: com.google.gson.internal.i */
public final class C0480i {

    /* compiled from: Streams */
    /* renamed from: com.google.gson.internal.i$a */
    private static final class C0479a extends Writer {
        /* renamed from: a */
        private final Appendable f506a;
        /* renamed from: b */
        private final C0478a f507b = new C0478a();

        /* compiled from: Streams */
        /* renamed from: com.google.gson.internal.i$a$a */
        static class C0478a implements CharSequence {
            /* renamed from: a */
            char[] f505a;

            C0478a() {
            }

            public int length() {
                return this.f505a.length;
            }

            public char charAt(int i) {
                return this.f505a[i];
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f505a, i, i2 - i);
            }
        }

        public void close() {
        }

        public void flush() {
        }

        C0479a(Appendable appendable) {
            this.f506a = appendable;
        }

        public void write(char[] cArr, int i, int i2) {
            this.f507b.f505a = cArr;
            this.f506a.append(this.f507b, i, i2 + i);
        }

        public void write(int i) {
            this.f506a.append((char) i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.gson.C0482j m720a(com.google.gson.p040c.C0446a r2) {
        /*
        r2.mo1277f();	 Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r0 = 0;
        r1 = com.google.gson.internal.bind.C0466i.f448X;	 Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = r1.mo1260b(r2);	 Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = (com.google.gson.C0482j) r2;	 Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        return r2;
    L_0x000d:
        r2 = move-exception;
        goto L_0x0026;
    L_0x000f:
        r2 = move-exception;
        r0 = new com.google.gson.r;
        r0.<init>(r2);
        throw r0;
    L_0x0016:
        r2 = move-exception;
        r0 = new com.google.gson.k;
        r0.<init>(r2);
        throw r0;
    L_0x001d:
        r2 = move-exception;
        r0 = new com.google.gson.r;
        r0.<init>(r2);
        throw r0;
    L_0x0024:
        r2 = move-exception;
        r0 = 1;
    L_0x0026:
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r2 = com.google.gson.C1040l.f1849a;
        return r2;
    L_0x002b:
        r0 = new com.google.gson.r;
        r0.<init>(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.i.a(com.google.gson.c.a):com.google.gson.j");
    }

    /* renamed from: a */
    public static void m722a(C0482j c0482j, C0448c c0448c) {
        C0466i.f448X.mo1259a(c0448c, c0482j);
    }

    /* renamed from: a */
    public static Writer m721a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C0479a(appendable);
    }
}
