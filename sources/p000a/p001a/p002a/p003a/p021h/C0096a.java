package p000a.p001a.p002a.p003a.p021h;

/* compiled from: Base64 */
/* renamed from: a.a.a.a.h.a */
public class C0096a {
    /* renamed from: a */
    static final /* synthetic */ boolean f159a = (C0096a.class.desiredAssertionStatus() ^ 1);

    /* compiled from: Base64 */
    /* renamed from: a.a.a.a.h.a$a */
    static abstract class C0095a {
        /* renamed from: a */
        public byte[] f157a;
        /* renamed from: b */
        public int f158b;

        C0095a() {
        }
    }

    /* compiled from: Base64 */
    /* renamed from: a.a.a.a.h.a$b */
    static class C0833b extends C0095a {
        /* renamed from: c */
        private static final int[] f1460c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        /* renamed from: d */
        private static final int[] f1461d = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        /* renamed from: e */
        private int f1462e;
        /* renamed from: f */
        private int f1463f;
        /* renamed from: g */
        private final int[] f1464g;

        public C0833b(int i, byte[] bArr) {
            this.a = bArr;
            this.f1464g = (i & 8) == 0 ? f1460c : f1461d;
            this.f1462e = 0;
            this.f1463f = 0;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public boolean m1559a(byte[] r12, int r13, int r14, boolean r15) {
            /*
            r11 = this;
            r0 = r11.f1462e;
            r1 = 0;
            r2 = 6;
            if (r0 != r2) goto L_0x0007;
        L_0x0006:
            return r1;
        L_0x0007:
            r14 = r14 + r13;
            r0 = r11.f1462e;
            r3 = r11.f1463f;
            r4 = r11.a;
            r5 = r11.f1464g;
            r6 = r3;
            r3 = 0;
        L_0x0012:
            r7 = 4;
            if (r13 >= r14) goto L_0x00e3;
        L_0x0015:
            if (r0 != 0) goto L_0x005c;
        L_0x0017:
            r8 = r13 + 4;
            if (r8 > r14) goto L_0x0058;
        L_0x001b:
            r6 = r12[r13];
            r6 = r6 & 255;
            r6 = r5[r6];
            r6 = r6 << 18;
            r9 = r13 + 1;
            r9 = r12[r9];
            r9 = r9 & 255;
            r9 = r5[r9];
            r9 = r9 << 12;
            r6 = r6 | r9;
            r9 = r13 + 2;
            r9 = r12[r9];
            r9 = r9 & 255;
            r9 = r5[r9];
            r9 = r9 << r2;
            r6 = r6 | r9;
            r9 = r13 + 3;
            r9 = r12[r9];
            r9 = r9 & 255;
            r9 = r5[r9];
            r6 = r6 | r9;
            if (r6 < 0) goto L_0x0058;
        L_0x0043:
            r13 = r3 + 2;
            r9 = (byte) r6;
            r4[r13] = r9;
            r13 = r3 + 1;
            r9 = r6 >> 8;
            r9 = (byte) r9;
            r4[r13] = r9;
            r13 = r6 >> 16;
            r13 = (byte) r13;
            r4[r3] = r13;
            r3 = r3 + 3;
            r13 = r8;
            goto L_0x0017;
        L_0x0058:
            if (r13 < r14) goto L_0x005c;
        L_0x005a:
            goto L_0x00e3;
        L_0x005c:
            r8 = r13 + 1;
            r13 = r12[r13];
            r13 = r13 & 255;
            r13 = r5[r13];
            r9 = -2;
            r10 = -1;
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00af;
                case 3: goto L_0x007c;
                case 4: goto L_0x0070;
                case 5: goto L_0x006b;
                default: goto L_0x0069;
            };
        L_0x0069:
            goto L_0x00e0;
        L_0x006b:
            if (r13 == r10) goto L_0x00e0;
        L_0x006d:
            r11.f1462e = r2;
            return r1;
        L_0x0070:
            if (r13 != r9) goto L_0x0077;
        L_0x0072:
            r13 = r0 + 1;
            r0 = r13;
            goto L_0x00e0;
        L_0x0077:
            if (r13 == r10) goto L_0x00e0;
        L_0x0079:
            r11.f1462e = r2;
            return r1;
        L_0x007c:
            if (r13 < 0) goto L_0x0097;
        L_0x007e:
            r0 = r6 << 6;
            r13 = r13 | r0;
            r0 = r3 + 2;
            r6 = (byte) r13;
            r4[r0] = r6;
            r0 = r3 + 1;
            r6 = r13 >> 8;
            r6 = (byte) r6;
            r4[r0] = r6;
            r0 = r13 >> 16;
            r0 = (byte) r0;
            r4[r3] = r0;
            r3 = r3 + 3;
            r6 = r13;
            r0 = 0;
            goto L_0x00e0;
        L_0x0097:
            if (r13 != r9) goto L_0x00aa;
        L_0x0099:
            r13 = r3 + 1;
            r0 = r6 >> 2;
            r0 = (byte) r0;
            r4[r13] = r0;
            r13 = r6 >> 10;
            r13 = (byte) r13;
            r4[r3] = r13;
            r3 = r3 + 2;
            r13 = 5;
            r0 = 5;
            goto L_0x00e0;
        L_0x00aa:
            if (r13 == r10) goto L_0x00e0;
        L_0x00ac:
            r11.f1462e = r2;
            return r1;
        L_0x00af:
            if (r13 < 0) goto L_0x00b7;
        L_0x00b1:
            r6 = r6 << 6;
            r13 = r13 | r6;
            r0 = r0 + 1;
            goto L_0x00d9;
        L_0x00b7:
            if (r13 != r9) goto L_0x00c3;
        L_0x00b9:
            r13 = r3 + 1;
            r0 = r6 >> 4;
            r0 = (byte) r0;
            r4[r3] = r0;
            r3 = r13;
            r0 = 4;
            goto L_0x00e0;
        L_0x00c3:
            if (r13 == r10) goto L_0x00e0;
        L_0x00c5:
            r11.f1462e = r2;
            return r1;
        L_0x00c8:
            if (r13 < 0) goto L_0x00d0;
        L_0x00ca:
            r6 = r6 << 6;
            r13 = r13 | r6;
            r0 = r0 + 1;
            goto L_0x00d9;
        L_0x00d0:
            if (r13 == r10) goto L_0x00e0;
        L_0x00d2:
            r11.f1462e = r2;
            return r1;
        L_0x00d5:
            if (r13 < 0) goto L_0x00db;
        L_0x00d7:
            r0 = r0 + 1;
        L_0x00d9:
            r6 = r13;
            goto L_0x00e0;
        L_0x00db:
            if (r13 == r10) goto L_0x00e0;
        L_0x00dd:
            r11.f1462e = r2;
            return r1;
        L_0x00e0:
            r13 = r8;
            goto L_0x0012;
        L_0x00e3:
            r12 = 1;
            if (r15 != 0) goto L_0x00ed;
        L_0x00e6:
            r11.f1462e = r0;
            r11.f1463f = r6;
            r11.b = r3;
            return r12;
        L_0x00ed:
            switch(r0) {
                case 0: goto L_0x010f;
                case 1: goto L_0x010c;
                case 2: goto L_0x0103;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00f1;
                default: goto L_0x00f0;
            };
        L_0x00f0:
            goto L_0x010f;
        L_0x00f1:
            r11.f1462e = r2;
            return r1;
        L_0x00f4:
            r13 = r3 + 1;
            r14 = r6 >> 10;
            r14 = (byte) r14;
            r4[r3] = r14;
            r3 = r13 + 1;
            r14 = r6 >> 2;
            r14 = (byte) r14;
            r4[r13] = r14;
            goto L_0x010f;
        L_0x0103:
            r13 = r3 + 1;
            r14 = r6 >> 4;
            r14 = (byte) r14;
            r4[r3] = r14;
            r3 = r13;
            goto L_0x010f;
        L_0x010c:
            r11.f1462e = r2;
            return r1;
        L_0x010f:
            r11.f1462e = r0;
            r11.b = r3;
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.h.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    /* compiled from: Base64 */
    /* renamed from: a.a.a.a.h.a$c */
    static class C0834c extends C0095a {
        /* renamed from: g */
        static final /* synthetic */ boolean f1465g = (C0096a.class.desiredAssertionStatus() ^ 1);
        /* renamed from: h */
        private static final byte[] f1466h = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        /* renamed from: i */
        private static final byte[] f1467i = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        /* renamed from: c */
        int f1468c;
        /* renamed from: d */
        public final boolean f1469d;
        /* renamed from: e */
        public final boolean f1470e;
        /* renamed from: f */
        public final boolean f1471f;
        /* renamed from: j */
        private final byte[] f1472j;
        /* renamed from: k */
        private int f1473k;
        /* renamed from: l */
        private final byte[] f1474l;

        public C0834c(int i, byte[] bArr) {
            this.a = bArr;
            boolean z = true;
            this.f1469d = (i & 1) == null ? 1 : null;
            this.f1470e = (i & 2) == null ? 1 : null;
            if ((i & 4) == null) {
                z = false;
            }
            this.f1471f = z;
            this.f1474l = (i & 8) == 0 ? f1466h : f1467i;
            this.f1472j = new byte[2];
            this.f1468c = 0;
            this.f1473k = this.f1470e != 0 ? 19 : -1;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public boolean m1560a(byte[] r19, int r20, int r21, boolean r22) {
            /*
            r18 = this;
            r0 = r18;
            r3 = r0.f1474l;
            r4 = r0.a;
            r5 = r0.f1473k;
            r6 = r21 + r20;
            r7 = r0.f1468c;
            r8 = -1;
            r9 = 0;
            r10 = 1;
            switch(r7) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0030;
                case 2: goto L_0x0013;
                default: goto L_0x0012;
            };
        L_0x0012:
            goto L_0x004f;
        L_0x0013:
            r7 = r20 + 1;
            if (r7 > r6) goto L_0x004f;
        L_0x0017:
            r11 = r0.f1472j;
            r11 = r11[r9];
            r11 = r11 & 255;
            r11 = r11 << 16;
            r12 = r0.f1472j;
            r12 = r12[r10];
            r12 = r12 & 255;
            r12 = r12 << 8;
            r11 = r11 | r12;
            r2 = r19[r20];
            r2 = r2 & 255;
            r2 = r2 | r11;
            r0.f1468c = r9;
            goto L_0x0052;
        L_0x0030:
            r7 = r20 + 2;
            if (r7 > r6) goto L_0x004f;
        L_0x0034:
            r7 = r0.f1472j;
            r7 = r7[r9];
            r7 = r7 & 255;
            r7 = r7 << 16;
            r11 = r20 + 1;
            r2 = r19[r20];
            r2 = r2 & 255;
            r2 = r2 << 8;
            r2 = r2 | r7;
            r7 = r11 + 1;
            r11 = r19[r11];
            r11 = r11 & 255;
            r2 = r2 | r11;
            r0.f1468c = r9;
            goto L_0x0052;
        L_0x004f:
            r7 = r20;
            r2 = -1;
        L_0x0052:
            r12 = 4;
            r13 = 13;
            r14 = 10;
            r15 = 2;
            if (r2 == r8) goto L_0x0090;
        L_0x005a:
            r8 = r2 >> 18;
            r8 = r8 & 63;
            r8 = r3[r8];
            r4[r9] = r8;
            r8 = r2 >> 12;
            r8 = r8 & 63;
            r8 = r3[r8];
            r4[r10] = r8;
            r8 = r2 >> 6;
            r8 = r8 & 63;
            r8 = r3[r8];
            r4[r15] = r8;
            r2 = r2 & 63;
            r2 = r3[r2];
            r8 = 3;
            r4[r8] = r2;
            r5 = r5 + -1;
            if (r5 != 0) goto L_0x008d;
        L_0x007d:
            r2 = r0.f1471f;
            if (r2 == 0) goto L_0x0085;
        L_0x0081:
            r2 = 5;
            r4[r12] = r13;
            goto L_0x0086;
        L_0x0085:
            r2 = 4;
        L_0x0086:
            r5 = r2 + 1;
            r4[r2] = r14;
            r2 = 19;
            goto L_0x0092;
        L_0x008d:
            r2 = r5;
            r5 = 4;
            goto L_0x0092;
        L_0x0090:
            r2 = r5;
            r5 = 0;
        L_0x0092:
            r8 = r7 + 3;
            if (r8 > r6) goto L_0x00eb;
        L_0x0096:
            r11 = r19[r7];
            r11 = r11 & 255;
            r11 = r11 << 16;
            r16 = r7 + 1;
            r15 = r19[r16];
            r15 = r15 & 255;
            r15 = r15 << 8;
            r11 = r11 | r15;
            r7 = r7 + 2;
            r7 = r19[r7];
            r7 = r7 & 255;
            r7 = r7 | r11;
            r11 = r7 >> 18;
            r11 = r11 & 63;
            r11 = r3[r11];
            r4[r5] = r11;
            r11 = r5 + 1;
            r15 = r7 >> 12;
            r15 = r15 & 63;
            r15 = r3[r15];
            r4[r11] = r15;
            r11 = r5 + 2;
            r15 = r7 >> 6;
            r15 = r15 & 63;
            r15 = r3[r15];
            r4[r11] = r15;
            r11 = r5 + 3;
            r7 = r7 & 63;
            r7 = r3[r7];
            r4[r11] = r7;
            r5 = r5 + 4;
            r2 = r2 + -1;
            if (r2 != 0) goto L_0x00e8;
        L_0x00d6:
            r2 = r0.f1471f;
            if (r2 == 0) goto L_0x00df;
        L_0x00da:
            r2 = r5 + 1;
            r4[r5] = r13;
            goto L_0x00e0;
        L_0x00df:
            r2 = r5;
        L_0x00e0:
            r5 = r2 + 1;
            r4[r2] = r14;
            r7 = r8;
            r2 = 19;
            goto L_0x00e9;
        L_0x00e8:
            r7 = r8;
        L_0x00e9:
            r15 = 2;
            goto L_0x0092;
        L_0x00eb:
            if (r22 == 0) goto L_0x01eb;
        L_0x00ed:
            r8 = r0.f1468c;
            r8 = r7 - r8;
            r11 = r6 + -1;
            if (r8 != r11) goto L_0x0140;
        L_0x00f5:
            r8 = r0.f1468c;
            if (r8 <= 0) goto L_0x00ff;
        L_0x00f9:
            r1 = r0.f1472j;
            r1 = r1[r9];
            r9 = 1;
            goto L_0x0104;
        L_0x00ff:
            r8 = r7 + 1;
            r1 = r19[r7];
            r7 = r8;
        L_0x0104:
            r1 = r1 & 255;
            r1 = r1 << r12;
            r8 = r0.f1468c;
            r8 = r8 - r9;
            r0.f1468c = r8;
            r8 = r5 + 1;
            r9 = r1 >> 6;
            r9 = r9 & 63;
            r9 = r3[r9];
            r4[r5] = r9;
            r5 = r8 + 1;
            r1 = r1 & 63;
            r1 = r3[r1];
            r4[r8] = r1;
            r1 = r0.f1469d;
            if (r1 == 0) goto L_0x012c;
        L_0x0122:
            r1 = r5 + 1;
            r3 = 61;
            r4[r5] = r3;
            r5 = r1 + 1;
            r4[r1] = r3;
        L_0x012c:
            r1 = r0.f1470e;
            if (r1 == 0) goto L_0x01cf;
        L_0x0130:
            r1 = r0.f1471f;
            if (r1 == 0) goto L_0x0139;
        L_0x0134:
            r1 = r5 + 1;
            r4[r5] = r13;
            goto L_0x013a;
        L_0x0139:
            r1 = r5;
        L_0x013a:
            r5 = r1 + 1;
            r4[r1] = r14;
            goto L_0x01cf;
        L_0x0140:
            r8 = r0.f1468c;
            r8 = r7 - r8;
            r11 = r6 + -2;
            if (r8 != r11) goto L_0x01b6;
        L_0x0148:
            r8 = r0.f1468c;
            if (r8 <= r10) goto L_0x0157;
        L_0x014c:
            r8 = r0.f1472j;
            r8 = r8[r9];
            r9 = 1;
            r17 = r8;
            r8 = r7;
            r7 = r17;
            goto L_0x015b;
        L_0x0157:
            r8 = r7 + 1;
            r7 = r19[r7];
        L_0x015b:
            r7 = r7 & 255;
            r7 = r7 << r14;
            r11 = r0.f1468c;
            if (r11 <= 0) goto L_0x0169;
        L_0x0162:
            r1 = r0.f1472j;
            r11 = r9 + 1;
            r1 = r1[r9];
            goto L_0x016f;
        L_0x0169:
            r11 = r8 + 1;
            r1 = r19[r8];
            r8 = r11;
            r11 = r9;
        L_0x016f:
            r1 = r1 & 255;
            r9 = 2;
            r1 = r1 << r9;
            r1 = r1 | r7;
            r7 = r0.f1468c;
            r7 = r7 - r11;
            r0.f1468c = r7;
            r7 = r5 + 1;
            r9 = r1 >> 12;
            r9 = r9 & 63;
            r9 = r3[r9];
            r4[r5] = r9;
            r5 = r7 + 1;
            r9 = r1 >> 6;
            r9 = r9 & 63;
            r9 = r3[r9];
            r4[r7] = r9;
            r7 = r5 + 1;
            r1 = r1 & 63;
            r1 = r3[r1];
            r4[r5] = r1;
            r1 = r0.f1469d;
            if (r1 == 0) goto L_0x01a0;
        L_0x0199:
            r1 = r7 + 1;
            r3 = 61;
            r4[r7] = r3;
            goto L_0x01a1;
        L_0x01a0:
            r1 = r7;
        L_0x01a1:
            r3 = r0.f1470e;
            if (r3 == 0) goto L_0x01b3;
        L_0x01a5:
            r3 = r0.f1471f;
            if (r3 == 0) goto L_0x01ae;
        L_0x01a9:
            r3 = r1 + 1;
            r4[r1] = r13;
            r1 = r3;
        L_0x01ae:
            r3 = r1 + 1;
            r4[r1] = r14;
            r1 = r3;
        L_0x01b3:
            r5 = r1;
            r7 = r8;
            goto L_0x01cf;
        L_0x01b6:
            r1 = r0.f1470e;
            if (r1 == 0) goto L_0x01cf;
        L_0x01ba:
            if (r5 <= 0) goto L_0x01cf;
        L_0x01bc:
            r1 = 19;
            if (r2 == r1) goto L_0x01cf;
        L_0x01c0:
            r1 = r0.f1471f;
            if (r1 == 0) goto L_0x01c9;
        L_0x01c4:
            r1 = r5 + 1;
            r4[r5] = r13;
            goto L_0x01ca;
        L_0x01c9:
            r1 = r5;
        L_0x01ca:
            r3 = r1 + 1;
            r4[r1] = r14;
            r5 = r3;
        L_0x01cf:
            r1 = f1465g;
            if (r1 != 0) goto L_0x01de;
        L_0x01d3:
            r1 = r0.f1468c;
            if (r1 != 0) goto L_0x01d8;
        L_0x01d7:
            goto L_0x01de;
        L_0x01d8:
            r1 = new java.lang.AssertionError;
            r1.<init>();
            throw r1;
        L_0x01de:
            r1 = f1465g;
            if (r1 != 0) goto L_0x0219;
        L_0x01e2:
            if (r7 != r6) goto L_0x01e5;
        L_0x01e4:
            goto L_0x0219;
        L_0x01e5:
            r1 = new java.lang.AssertionError;
            r1.<init>();
            throw r1;
        L_0x01eb:
            r3 = r6 + -1;
            if (r7 != r3) goto L_0x01fc;
        L_0x01ef:
            r3 = r0.f1472j;
            r4 = r0.f1468c;
            r6 = r4 + 1;
            r0.f1468c = r6;
            r1 = r19[r7];
            r3[r4] = r1;
            goto L_0x0219;
        L_0x01fc:
            r3 = 2;
            r6 = r6 - r3;
            if (r7 != r6) goto L_0x0219;
        L_0x0200:
            r3 = r0.f1472j;
            r4 = r0.f1468c;
            r6 = r4 + 1;
            r0.f1468c = r6;
            r6 = r19[r7];
            r3[r4] = r6;
            r3 = r0.f1472j;
            r4 = r0.f1468c;
            r6 = r4 + 1;
            r0.f1468c = r6;
            r7 = r7 + r10;
            r1 = r19[r7];
            r3[r4] = r1;
        L_0x0219:
            r0.b = r5;
            r0.f1473k = r2;
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.h.a.c.a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m256a(byte[] bArr, int i) {
        return C0096a.m257a(bArr, 0, bArr.length, i);
    }

    /* renamed from: a */
    public static byte[] m257a(byte[] bArr, int i, int i2, int i3) {
        C0833b c0833b = new C0833b(i3, new byte[((i2 * 3) / 4)]);
        if (c0833b.m1559a(bArr, i, i2, 1) == null) {
            throw new IllegalArgumentException("bad base-64");
        } else if (c0833b.b == c0833b.a.length) {
            return c0833b.a;
        } else {
            bArr = new byte[c0833b.b];
            System.arraycopy(c0833b.a, 0, bArr, 0, c0833b.b);
            return bArr;
        }
    }

    /* renamed from: b */
    public static byte[] m258b(byte[] bArr, int i) {
        return C0096a.m259b(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m259b(byte[] bArr, int i, int i2, int i3) {
        C0834c c0834c = new C0834c(i3, null);
        i3 = (i2 / 3) * 4;
        if (!c0834c.f1469d) {
            switch (i2 % 3) {
                case 0:
                    break;
                case 1:
                    i3 += 2;
                    break;
                case 2:
                    i3 += 3;
                    break;
                default:
                    break;
            }
        } else if (i2 % 3 > 0) {
            i3 += 4;
        }
        if (c0834c.f1470e && i2 > 0) {
            i3 += (((i2 - 1) / 57) + 1) * (c0834c.f1471f ? 2 : 1);
        }
        c0834c.a = new byte[i3];
        c0834c.m1560a(bArr, i, i2, true);
        if (f159a == null) {
            if (c0834c.b != i3) {
                throw new AssertionError();
            }
        }
        return c0834c.a;
    }

    private C0096a() {
    }
}
