package p000a.p001a.p002a.p003a.p022i.p023a;

import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p000a.p001a.p002a.p003a.p021h.C0096a;
import p000a.p001a.p002a.p003a.p035o.C0164e;

/* compiled from: NTLMEngineImpl */
/* renamed from: a.a.a.a.i.a.j */
final class C0840j implements C0102h {
    /* renamed from: a */
    private static final SecureRandom f1490a;
    /* renamed from: c */
    private static final byte[] f1491c;
    /* renamed from: b */
    private String f1492b = "ASCII";

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$a */
    protected static class C0103a {
        /* renamed from: a */
        protected final String f171a;
        /* renamed from: b */
        protected final String f172b;
        /* renamed from: c */
        protected final String f173c;
        /* renamed from: d */
        protected final byte[] f174d;
        /* renamed from: e */
        protected final String f175e;
        /* renamed from: f */
        protected final byte[] f176f;
        /* renamed from: g */
        protected byte[] f177g;
        /* renamed from: h */
        protected byte[] f178h;
        /* renamed from: i */
        protected byte[] f179i;
        /* renamed from: j */
        protected byte[] f180j;
        /* renamed from: k */
        protected byte[] f181k;
        /* renamed from: l */
        protected byte[] f182l;
        /* renamed from: m */
        protected byte[] f183m;
        /* renamed from: n */
        protected byte[] f184n;
        /* renamed from: o */
        protected byte[] f185o;
        /* renamed from: p */
        protected byte[] f186p;
        /* renamed from: q */
        protected byte[] f187q;
        /* renamed from: r */
        protected byte[] f188r;
        /* renamed from: s */
        protected byte[] f189s;
        /* renamed from: t */
        protected byte[] f190t;
        /* renamed from: u */
        protected byte[] f191u;
        /* renamed from: v */
        protected byte[] f192v;
        /* renamed from: w */
        protected byte[] f193w;
        /* renamed from: x */
        protected byte[] f194x;
        /* renamed from: y */
        protected byte[] f195y;
        /* renamed from: z */
        protected byte[] f196z;

        public C0103a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.f181k = null;
            this.f182l = null;
            this.f183m = null;
            this.f184n = null;
            this.f185o = null;
            this.f186p = null;
            this.f187q = null;
            this.f188r = null;
            this.f189s = null;
            this.f190t = null;
            this.f191u = null;
            this.f192v = null;
            this.f193w = null;
            this.f194x = null;
            this.f195y = null;
            this.f196z = null;
            this.f171a = str;
            this.f175e = str4;
            this.f172b = str2;
            this.f173c = str3;
            this.f174d = bArr;
            this.f176f = bArr2;
            this.f177g = bArr3;
            this.f178h = bArr4;
            this.f179i = bArr5;
            this.f180j = bArr6;
        }

        public C0103a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        /* renamed from: a */
        public byte[] m277a() {
            if (this.f177g == null) {
                this.f177g = C0840j.m1597d();
            }
            return this.f177g;
        }

        /* renamed from: b */
        public byte[] m278b() {
            if (this.f178h == null) {
                this.f178h = C0840j.m1597d();
            }
            return this.f178h;
        }

        /* renamed from: c */
        public byte[] m279c() {
            if (this.f179i == null) {
                this.f179i = C0840j.m1603e();
            }
            return this.f179i;
        }

        /* renamed from: d */
        public byte[] m280d() {
            if (this.f181k == null) {
                this.f181k = C0840j.m1609h(this.f173c);
            }
            return this.f181k;
        }

        /* renamed from: e */
        public byte[] m281e() {
            if (this.f182l == null) {
                this.f182l = C0840j.m1599d(m280d(), this.f174d);
            }
            return this.f182l;
        }

        /* renamed from: f */
        public byte[] m282f() {
            if (this.f183m == null) {
                this.f183m = C0840j.m1610i(this.f173c);
            }
            return this.f183m;
        }

        /* renamed from: g */
        public byte[] m283g() {
            if (this.f184n == null) {
                this.f184n = C0840j.m1599d(m282f(), this.f174d);
            }
            return this.f184n;
        }

        /* renamed from: h */
        public byte[] m284h() {
            if (this.f186p == null) {
                this.f186p = C0840j.m1591c(this.f171a, this.f172b, m282f());
            }
            return this.f186p;
        }

        /* renamed from: i */
        public byte[] m285i() {
            if (this.f185o == null) {
                this.f185o = C0840j.m1598d(this.f171a, this.f172b, m282f());
            }
            return this.f185o;
        }

        /* renamed from: j */
        public byte[] m286j() {
            if (this.f180j == null) {
                long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * 10000;
                this.f180j = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.f180j[i] = (byte) ((int) currentTimeMillis);
                    currentTimeMillis >>>= 8;
                }
            }
            return this.f180j;
        }

        /* renamed from: k */
        public byte[] m287k() {
            if (this.f188r == null) {
                this.f188r = C0840j.m1604e(m278b(), this.f176f, m286j());
            }
            return this.f188r;
        }

        /* renamed from: l */
        public byte[] m288l() {
            if (this.f189s == null) {
                this.f189s = C0840j.m1600d(m285i(), this.f174d, m287k());
            }
            return this.f189s;
        }

        /* renamed from: m */
        public byte[] m289m() {
            if (this.f187q == null) {
                this.f187q = C0840j.m1600d(m284h(), this.f174d, m277a());
            }
            return this.f187q;
        }

        /* renamed from: n */
        public byte[] m290n() {
            if (this.f190t == null) {
                this.f190t = C0840j.m1580a(m282f(), this.f174d, m277a());
            }
            return this.f190t;
        }

        /* renamed from: o */
        public byte[] m291o() {
            if (this.f191u == null) {
                Object a = m277a();
                this.f191u = new byte[24];
                System.arraycopy(a, 0, this.f191u, 0, a.length);
                Arrays.fill(this.f191u, a.length, this.f191u.length, (byte) 0);
            }
            return this.f191u;
        }

        /* renamed from: p */
        public byte[] m292p() {
            if (this.f192v == null) {
                this.f192v = new byte[16];
                System.arraycopy(m280d(), 0, this.f192v, 0, 8);
                Arrays.fill(this.f192v, 8, 16, (byte) 0);
            }
            return this.f192v;
        }

        /* renamed from: q */
        public byte[] m293q() {
            if (this.f193w == null) {
                C0105c c0105c = new C0105c();
                c0105c.m299a(m282f());
                this.f193w = c0105c.m301a();
            }
            return this.f193w;
        }

        /* renamed from: r */
        public byte[] m294r() {
            if (this.f194x == null) {
                byte[] i = m285i();
                byte[] bArr = new byte[16];
                System.arraycopy(m288l(), 0, bArr, 0, 16);
                this.f194x = C0840j.m1579a(bArr, i);
            }
            return this.f194x;
        }

        /* renamed from: s */
        public byte[] m295s() {
            if (this.f195y == null) {
                Object o = m291o();
                byte[] bArr = new byte[(this.f174d.length + o.length)];
                System.arraycopy(this.f174d, 0, bArr, 0, this.f174d.length);
                System.arraycopy(o, 0, bArr, this.f174d.length, o.length);
                this.f195y = C0840j.m1579a(bArr, m293q());
            }
            return this.f195y;
        }

        /* renamed from: t */
        public byte[] m296t() {
            if (this.f196z == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(m280d(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, bArr.length, (byte) -67);
                    Key a = C0840j.m1608g(bArr, 0);
                    Key a2 = C0840j.m1608g(bArr, 7);
                    Object obj = new byte[8];
                    System.arraycopy(m281e(), 0, obj, 0, obj.length);
                    Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
                    instance.init(1, a);
                    Object doFinal = instance.doFinal(obj);
                    instance = Cipher.getInstance("DES/ECB/NoPadding");
                    instance.init(1, a2);
                    Object doFinal2 = instance.doFinal(obj);
                    this.f196z = new byte[16];
                    System.arraycopy(doFinal, 0, this.f196z, 0, doFinal.length);
                    System.arraycopy(doFinal2, 0, this.f196z, doFinal.length, doFinal2.length);
                } catch (Throwable e) {
                    throw new C1321i(e.getMessage(), e);
                }
            }
            return this.f196z;
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$b */
    static class C0104b {
        /* renamed from: a */
        protected byte[] f197a;
        /* renamed from: b */
        protected byte[] f198b;
        /* renamed from: c */
        protected MessageDigest f199c;

        C0104b(byte[] bArr) {
            try {
                this.f199c = MessageDigest.getInstance("MD5");
                this.f197a = new byte[64];
                this.f198b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    this.f199c.update(bArr);
                    bArr = this.f199c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.f197a[i] = (byte) (54 ^ bArr[i]);
                    this.f198b[i] = (byte) (92 ^ bArr[i]);
                    i++;
                }
                while (i < 64) {
                    this.f197a[i] = (byte) 54;
                    this.f198b[i] = (byte) 92;
                    i++;
                }
                this.f199c.reset();
                this.f199c.update(this.f197a);
            } catch (byte[] bArr2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error getting md5 message digest implementation: ");
                stringBuilder.append(bArr2.getMessage());
                throw new C1321i(stringBuilder.toString(), bArr2);
            }
        }

        /* renamed from: a */
        byte[] m298a() {
            byte[] digest = this.f199c.digest();
            this.f199c.update(this.f198b);
            return this.f199c.digest(digest);
        }

        /* renamed from: a */
        void m297a(byte[] bArr) {
            this.f199c.update(bArr);
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$c */
    static class C0105c {
        /* renamed from: a */
        protected int f200a = 1732584193;
        /* renamed from: b */
        protected int f201b = -271733879;
        /* renamed from: c */
        protected int f202c = -1732584194;
        /* renamed from: d */
        protected int f203d = 271733878;
        /* renamed from: e */
        protected long f204e = 0;
        /* renamed from: f */
        protected byte[] f205f = new byte[64];

        C0105c() {
        }

        /* renamed from: a */
        void m299a(byte[] bArr) {
            int i = (int) (this.f204e & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.f205f.length) {
                int length = this.f205f.length - i;
                System.arraycopy(bArr, i2, this.f205f, i, length);
                this.f204e += (long) length;
                i2 += length;
                m302b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.f205f, i, length2);
                this.f204e += (long) length2;
            }
        }

        /* renamed from: a */
        byte[] m301a() {
            int i = (int) (this.f204e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[(i2 + 8)];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((int) ((this.f204e * 8) >>> (i3 * 8)));
            }
            m299a(bArr);
            bArr = new byte[16];
            C0840j.m1575a(bArr, this.f200a, 0);
            C0840j.m1575a(bArr, this.f201b, 4);
            C0840j.m1575a(bArr, this.f202c, 8);
            C0840j.m1575a(bArr, this.f203d, 12);
            return bArr;
        }

        /* renamed from: b */
        protected void m302b() {
            int i;
            int i2;
            int[] iArr = new int[16];
            for (i = 0; i < 16; i++) {
                i2 = i * 4;
                iArr[i] = (((this.f205f[i2] & 255) + ((this.f205f[i2 + 1] & 255) << 8)) + ((this.f205f[i2 + 2] & 255) << 16)) + ((this.f205f[i2 + 3] & 255) << 24);
            }
            int i3 = this.f200a;
            i = this.f201b;
            int i4 = this.f202c;
            i2 = this.f203d;
            m300a(iArr);
            m303b(iArr);
            m304c(iArr);
            this.f200a += i3;
            this.f201b += i;
            this.f202c += i4;
            this.f203d += i2;
        }

        /* renamed from: a */
        protected void m300a(int[] iArr) {
            this.f200a = C0840j.m1571a((this.f200a + C0840j.m1572a(this.f201b, this.f202c, this.f203d)) + iArr[0], 3);
            this.f203d = C0840j.m1571a((this.f203d + C0840j.m1572a(this.f200a, this.f201b, this.f202c)) + iArr[1], 7);
            this.f202c = C0840j.m1571a((this.f202c + C0840j.m1572a(this.f203d, this.f200a, this.f201b)) + iArr[2], 11);
            this.f201b = C0840j.m1571a((this.f201b + C0840j.m1572a(this.f202c, this.f203d, this.f200a)) + iArr[3], 19);
            this.f200a = C0840j.m1571a((this.f200a + C0840j.m1572a(this.f201b, this.f202c, this.f203d)) + iArr[4], 3);
            this.f203d = C0840j.m1571a((this.f203d + C0840j.m1572a(this.f200a, this.f201b, this.f202c)) + iArr[5], 7);
            this.f202c = C0840j.m1571a((this.f202c + C0840j.m1572a(this.f203d, this.f200a, this.f201b)) + iArr[6], 11);
            this.f201b = C0840j.m1571a((this.f201b + C0840j.m1572a(this.f202c, this.f203d, this.f200a)) + iArr[7], 19);
            this.f200a = C0840j.m1571a((this.f200a + C0840j.m1572a(this.f201b, this.f202c, this.f203d)) + iArr[8], 3);
            this.f203d = C0840j.m1571a((this.f203d + C0840j.m1572a(this.f200a, this.f201b, this.f202c)) + iArr[9], 7);
            this.f202c = C0840j.m1571a((this.f202c + C0840j.m1572a(this.f203d, this.f200a, this.f201b)) + iArr[10], 11);
            this.f201b = C0840j.m1571a((this.f201b + C0840j.m1572a(this.f202c, this.f203d, this.f200a)) + iArr[11], 19);
            this.f200a = C0840j.m1571a((this.f200a + C0840j.m1572a(this.f201b, this.f202c, this.f203d)) + iArr[12], 3);
            this.f203d = C0840j.m1571a((this.f203d + C0840j.m1572a(this.f200a, this.f201b, this.f202c)) + iArr[13], 7);
            this.f202c = C0840j.m1571a((this.f202c + C0840j.m1572a(this.f203d, this.f200a, this.f201b)) + iArr[14], 11);
            this.f201b = C0840j.m1571a((this.f201b + C0840j.m1572a(this.f202c, this.f203d, this.f200a)) + iArr[15], 19);
        }

        /* renamed from: b */
        protected void m303b(int[] iArr) {
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1581b(this.f201b, this.f202c, this.f203d)) + iArr[0]) + 1518500249, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1581b(this.f200a, this.f201b, this.f202c)) + iArr[4]) + 1518500249, 5);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1581b(this.f203d, this.f200a, this.f201b)) + iArr[8]) + 1518500249, 9);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1581b(this.f202c, this.f203d, this.f200a)) + iArr[12]) + 1518500249, 13);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1581b(this.f201b, this.f202c, this.f203d)) + iArr[1]) + 1518500249, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1581b(this.f200a, this.f201b, this.f202c)) + iArr[5]) + 1518500249, 5);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1581b(this.f203d, this.f200a, this.f201b)) + iArr[9]) + 1518500249, 9);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1581b(this.f202c, this.f203d, this.f200a)) + iArr[13]) + 1518500249, 13);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1581b(this.f201b, this.f202c, this.f203d)) + iArr[2]) + 1518500249, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1581b(this.f200a, this.f201b, this.f202c)) + iArr[6]) + 1518500249, 5);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1581b(this.f203d, this.f200a, this.f201b)) + iArr[10]) + 1518500249, 9);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1581b(this.f202c, this.f203d, this.f200a)) + iArr[14]) + 1518500249, 13);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1581b(this.f201b, this.f202c, this.f203d)) + iArr[3]) + 1518500249, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1581b(this.f200a, this.f201b, this.f202c)) + iArr[7]) + 1518500249, 5);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1581b(this.f203d, this.f200a, this.f201b)) + iArr[11]) + 1518500249, 9);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1581b(this.f202c, this.f203d, this.f200a)) + iArr[15]) + 1518500249, 13);
        }

        /* renamed from: c */
        protected void m304c(int[] iArr) {
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1588c(this.f201b, this.f202c, this.f203d)) + iArr[0]) + 1859775393, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1588c(this.f200a, this.f201b, this.f202c)) + iArr[8]) + 1859775393, 9);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1588c(this.f203d, this.f200a, this.f201b)) + iArr[4]) + 1859775393, 11);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1588c(this.f202c, this.f203d, this.f200a)) + iArr[12]) + 1859775393, 15);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1588c(this.f201b, this.f202c, this.f203d)) + iArr[2]) + 1859775393, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1588c(this.f200a, this.f201b, this.f202c)) + iArr[10]) + 1859775393, 9);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1588c(this.f203d, this.f200a, this.f201b)) + iArr[6]) + 1859775393, 11);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1588c(this.f202c, this.f203d, this.f200a)) + iArr[14]) + 1859775393, 15);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1588c(this.f201b, this.f202c, this.f203d)) + iArr[1]) + 1859775393, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1588c(this.f200a, this.f201b, this.f202c)) + iArr[9]) + 1859775393, 9);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1588c(this.f203d, this.f200a, this.f201b)) + iArr[5]) + 1859775393, 11);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1588c(this.f202c, this.f203d, this.f200a)) + iArr[13]) + 1859775393, 15);
            this.f200a = C0840j.m1571a(((this.f200a + C0840j.m1588c(this.f201b, this.f202c, this.f203d)) + iArr[3]) + 1859775393, 3);
            this.f203d = C0840j.m1571a(((this.f203d + C0840j.m1588c(this.f200a, this.f201b, this.f202c)) + iArr[11]) + 1859775393, 9);
            this.f202c = C0840j.m1571a(((this.f202c + C0840j.m1588c(this.f203d, this.f200a, this.f201b)) + iArr[7]) + 1859775393, 11);
            this.f201b = C0840j.m1571a(((this.f201b + C0840j.m1588c(this.f202c, this.f203d, this.f200a)) + iArr[15]) + 1859775393, 15);
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$d */
    static class C0106d {
        /* renamed from: a */
        private byte[] f206a;
        /* renamed from: b */
        private int f207b;

        C0106d() {
            this.f206a = null;
            this.f207b = 0;
        }

        C0106d(String str, int i) {
            this.f206a = null;
            int i2 = 0;
            this.f207b = 0;
            this.f206a = C0096a.m256a(C0164e.m519a(str, "ASCII"), 2);
            if (this.f206a.length >= C0840j.f1491c.length) {
                while (i2 < C0840j.f1491c.length) {
                    if (this.f206a[i2] == C0840j.f1491c[i2]) {
                        i2++;
                    } else {
                        throw new C1321i("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                str = m306a(C0840j.f1491c.length);
                if (str == i) {
                    this.f207b = this.f206a.length;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("NTLM type ");
                stringBuilder.append(Integer.toString(i));
                stringBuilder.append(" message expected - instead got type ");
                stringBuilder.append(Integer.toString(str));
                throw new C1321i(stringBuilder.toString());
            }
            throw new C1321i("NTLM message decoding error - packet too short");
        }

        /* renamed from: a */
        protected int m305a() {
            return this.f207b;
        }

        /* renamed from: a */
        protected void m310a(byte[] bArr, int i) {
            if (this.f206a.length >= bArr.length + i) {
                System.arraycopy(this.f206a, i, bArr, 0, bArr.length);
                return;
            }
            throw new C1321i("NTLM: Message too short");
        }

        /* renamed from: a */
        protected int m306a(int i) {
            return C0840j.m1595d(this.f206a, i);
        }

        /* renamed from: b */
        protected byte[] m312b(int i) {
            return C0840j.m1606f(this.f206a, i);
        }

        /* renamed from: a */
        protected void m308a(int i, int i2) {
            this.f206a = new byte[i];
            this.f207b = 0;
            m309a(C0840j.f1491c);
            m314d(i2);
        }

        /* renamed from: a */
        protected void m307a(byte b) {
            this.f206a[this.f207b] = b;
            this.f207b++;
        }

        /* renamed from: a */
        protected void m309a(byte[] bArr) {
            if (bArr != null) {
                for (byte b : bArr) {
                    this.f206a[this.f207b] = b;
                    this.f207b++;
                }
            }
        }

        /* renamed from: c */
        protected void m313c(int i) {
            m307a((byte) (i & 255));
            m307a((byte) ((i >> 8) & 255));
        }

        /* renamed from: d */
        protected void m314d(int i) {
            m307a((byte) (i & 255));
            m307a((byte) ((i >> 8) & 255));
            m307a((byte) ((i >> 16) & 255));
            m307a((byte) ((i >> 24) & 255));
        }

        /* renamed from: b */
        String mo37b() {
            byte[] bArr;
            if (this.f206a.length > this.f207b) {
                bArr = new byte[this.f207b];
                System.arraycopy(this.f206a, 0, bArr, 0, this.f207b);
            } else {
                bArr = this.f206a;
            }
            return C0164e.m516a(C0096a.m258b(bArr, 2));
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$e */
    static class C0837e extends C0106d {
        /* renamed from: a */
        protected byte[] f1477a;
        /* renamed from: b */
        protected byte[] f1478b;

        C0837e(String str, String str2) {
            try {
                str2 = C0840j.m1605f(str2);
                str = C0840j.m1607g(str);
                byte[] bArr = null;
                this.f1477a = str2 != null ? str2.getBytes("ASCII") : null;
                if (str != null) {
                    bArr = str.toUpperCase(Locale.ENGLISH).getBytes("ASCII");
                }
                this.f1478b = bArr;
            } catch (String str3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unicode unsupported: ");
                stringBuilder.append(str3.getMessage());
                throw new C1321i(stringBuilder.toString(), str3);
            }
        }

        /* renamed from: b */
        String mo37b() {
            m308a(40, 1);
            m314d(-1576500735);
            m313c(0);
            m313c(0);
            m314d(40);
            m313c(0);
            m313c(0);
            m314d(40);
            m313c(261);
            m314d(2600);
            m313c(3840);
            return super.mo37b();
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$f */
    static class C0838f extends C0106d {
        /* renamed from: a */
        protected byte[] f1479a = new byte[8];
        /* renamed from: b */
        protected String f1480b;
        /* renamed from: c */
        protected byte[] f1481c;
        /* renamed from: d */
        protected int f1482d;

        C0838f(String str) {
            super(str, 2);
            m310a((byte[]) this.f1479a, 24);
            this.f1482d = m306a(20);
            if ((this.f1482d & 1) != 0) {
                this.f1480b = null;
                if (m305a() >= 20) {
                    str = m312b(12);
                    if (str.length != 0) {
                        try {
                            this.f1480b = new String(str, "UnicodeLittleUnmarked");
                        } catch (String str2) {
                            throw new C1321i(str2.getMessage(), str2);
                        }
                    }
                }
                this.f1481c = null;
                if (m305a() >= 48) {
                    str2 = m312b(40);
                    if (str2.length != 0) {
                        this.f1481c = str2;
                        return;
                    }
                    return;
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NTLM type 2 message indicates no support for Unicode. Flags are: ");
            stringBuilder.append(Integer.toString(this.f1482d));
            throw new C1321i(stringBuilder.toString());
        }

        /* renamed from: c */
        byte[] m1566c() {
            return this.f1479a;
        }

        /* renamed from: d */
        String m1567d() {
            return this.f1480b;
        }

        /* renamed from: e */
        byte[] m1568e() {
            return this.f1481c;
        }

        /* renamed from: f */
        int m1569f() {
            return this.f1482d;
        }
    }

    /* compiled from: NTLMEngineImpl */
    /* renamed from: a.a.a.a.i.a.j$g */
    static class C0839g extends C0106d {
        /* renamed from: a */
        protected int f1483a;
        /* renamed from: b */
        protected byte[] f1484b;
        /* renamed from: c */
        protected byte[] f1485c;
        /* renamed from: d */
        protected byte[] f1486d;
        /* renamed from: e */
        protected byte[] f1487e;
        /* renamed from: f */
        protected byte[] f1488f;
        /* renamed from: g */
        protected byte[] f1489g;

        C0839g(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, byte[] r17, int r18, java.lang.String r19, byte[] r20) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
            /*
            r12 = this;
            r1 = r12;
            r0 = r18;
            r12.<init>();
            r1.f1483a = r0;
            r2 = p000a.p001a.p002a.p003a.p022i.p023a.C0840j.m1605f(r14);
            r10 = p000a.p001a.p002a.p003a.p022i.p023a.C0840j.m1607g(r13);
            r11 = new a.a.a.a.i.a.j$a;
            r3 = r11;
            r4 = r10;
            r5 = r15;
            r6 = r16;
            r7 = r17;
            r8 = r19;
            r9 = r20;
            r3.<init>(r4, r5, r6, r7, r8, r9);
            r3 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
            r3 = r3 & r0;
            if (r3 == 0) goto L_0x0043;
        L_0x0025:
            if (r20 == 0) goto L_0x0043;
        L_0x0027:
            if (r19 == 0) goto L_0x0043;
        L_0x0029:
            r3 = r11.m288l();	 Catch:{ i -> 0x007c }
            r1.f1488f = r3;	 Catch:{ i -> 0x007c }
            r3 = r11.m289m();	 Catch:{ i -> 0x007c }
            r1.f1487e = r3;	 Catch:{ i -> 0x007c }
            r3 = r0 & 128;	 Catch:{ i -> 0x007c }
            if (r3 == 0) goto L_0x003e;	 Catch:{ i -> 0x007c }
        L_0x0039:
            r3 = r11.m296t();	 Catch:{ i -> 0x007c }
            goto L_0x0094;	 Catch:{ i -> 0x007c }
        L_0x003e:
            r3 = r11.m294r();	 Catch:{ i -> 0x007c }
            goto L_0x0094;	 Catch:{ i -> 0x007c }
        L_0x0043:
            r3 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;	 Catch:{ i -> 0x007c }
            r3 = r3 & r0;	 Catch:{ i -> 0x007c }
            if (r3 == 0) goto L_0x0062;	 Catch:{ i -> 0x007c }
        L_0x0048:
            r3 = r11.m290n();	 Catch:{ i -> 0x007c }
            r1.f1488f = r3;	 Catch:{ i -> 0x007c }
            r3 = r11.m291o();	 Catch:{ i -> 0x007c }
            r1.f1487e = r3;	 Catch:{ i -> 0x007c }
            r3 = r0 & 128;	 Catch:{ i -> 0x007c }
            if (r3 == 0) goto L_0x005d;	 Catch:{ i -> 0x007c }
        L_0x0058:
            r3 = r11.m296t();	 Catch:{ i -> 0x007c }
            goto L_0x0094;	 Catch:{ i -> 0x007c }
        L_0x005d:
            r3 = r11.m295s();	 Catch:{ i -> 0x007c }
            goto L_0x0094;	 Catch:{ i -> 0x007c }
        L_0x0062:
            r3 = r11.m283g();	 Catch:{ i -> 0x007c }
            r1.f1488f = r3;	 Catch:{ i -> 0x007c }
            r3 = r11.m281e();	 Catch:{ i -> 0x007c }
            r1.f1487e = r3;	 Catch:{ i -> 0x007c }
            r3 = r0 & 128;	 Catch:{ i -> 0x007c }
            if (r3 == 0) goto L_0x0077;	 Catch:{ i -> 0x007c }
        L_0x0072:
            r3 = r11.m296t();	 Catch:{ i -> 0x007c }
            goto L_0x0094;	 Catch:{ i -> 0x007c }
        L_0x0077:
            r3 = r11.m293q();	 Catch:{ i -> 0x007c }
            goto L_0x0094;
        L_0x007c:
            r3 = 0;
            r3 = new byte[r3];
            r1.f1488f = r3;
            r3 = r11.m281e();
            r1.f1487e = r3;
            r3 = r0 & 128;
            if (r3 == 0) goto L_0x0090;
        L_0x008b:
            r3 = r11.m296t();
            goto L_0x0094;
        L_0x0090:
            r3 = r11.m292p();
        L_0x0094:
            r4 = r0 & 16;
            r5 = 0;
            if (r4 == 0) goto L_0x00ac;
        L_0x0099:
            r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r0 = r0 & r4;
            if (r0 == 0) goto L_0x00a9;
        L_0x009e:
            r0 = r11.m279c();
            r0 = p000a.p001a.p002a.p003a.p022i.p023a.C0840j.m1586b(r0, r3);
            r1.f1489g = r0;
            goto L_0x00ae;
        L_0x00a9:
            r1.f1489g = r3;
            goto L_0x00ae;
        L_0x00ac:
            r1.f1489g = r5;
        L_0x00ae:
            if (r2 == 0) goto L_0x00b9;
        L_0x00b0:
            r0 = "UnicodeLittleUnmarked";	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r0 = r2.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            goto L_0x00ba;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            goto L_0x00d6;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        L_0x00b9:
            r0 = r5;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        L_0x00ba:
            r1.f1485c = r0;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            if (r10 == 0) goto L_0x00ca;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        L_0x00be:
            r0 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r0 = r10.toUpperCase(r0);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r2 = "UnicodeLittleUnmarked";	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r5 = r0.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        L_0x00ca:
            r1.f1484b = r5;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r0 = "UnicodeLittleUnmarked";	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r2 = r15;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r0 = r15.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            r1.f1486d = r0;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
            return;
        L_0x00d6:
            r2 = new a.a.a.a.i.a.i;
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Unicode not supported: ";
            r3.append(r4);
            r4 = r0.getMessage();
            r3.append(r4);
            r3 = r3.toString();
            r2.<init>(r3, r0);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.j.g.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], int, java.lang.String, byte[]):void");
        }

        /* renamed from: b */
        String mo37b() {
            int length = this.f1488f.length;
            int length2 = this.f1487e.length;
            int i = 0;
            int length3 = this.f1484b != null ? this.f1484b.length : 0;
            int length4 = this.f1485c != null ? this.f1485c.length : 0;
            int length5 = this.f1486d.length;
            if (this.f1489g != null) {
                i = this.f1489g.length;
            }
            int i2 = length2 + 72;
            int i3 = i2 + length;
            int i4 = i3 + length3;
            int i5 = i4 + length5;
            int i6 = i5 + length4;
            m308a(i6 + i, 3);
            m313c(length2);
            m313c(length2);
            m314d(72);
            m313c(length);
            m313c(length);
            m314d(i2);
            m313c(length3);
            m313c(length3);
            m314d(i3);
            m313c(length5);
            m313c(length5);
            m314d(i4);
            m313c(length4);
            m313c(length4);
            m314d(i5);
            m313c(i);
            m313c(i);
            m314d(i6);
            m314d(((((((((((((this.f1483a & 128) | (this.f1483a & 512)) | (this.f1483a & 524288)) | 33554432) | (this.f1483a & 32768)) | (this.f1483a & 32)) | (this.f1483a & 16)) | (this.f1483a & 536870912)) | (this.f1483a & Integer.MIN_VALUE)) | (this.f1483a & 1073741824)) | (this.f1483a & 8388608)) | (this.f1483a & 1)) | (this.f1483a & 4));
            m313c(261);
            m314d(2600);
            m313c(3840);
            m309a(this.f1487e);
            m309a(this.f1488f);
            m309a(this.f1484b);
            m309a(this.f1486d);
            m309a(this.f1485c);
            if (this.f1489g != null) {
                m309a(this.f1489g);
            }
            return super.mo37b();
        }
    }

    /* renamed from: a */
    static int m1571a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: a */
    static int m1572a(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    /* renamed from: b */
    static int m1581b(int i, int i2, int i3) {
        return ((i & i3) | (i & i2)) | (i2 & i3);
    }

    /* renamed from: c */
    static int m1588c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    C0840j() {
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r0 = "SHA1PRNG";	 Catch:{ Exception -> 0x0007 }
        r0 = java.security.SecureRandom.getInstance(r0);	 Catch:{ Exception -> 0x0007 }
        goto L_0x0008;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        f1490a = r0;
        r0 = "NTLMSSP";
        r1 = "ASCII";
        r0 = p000a.p001a.p002a.p003a.p035o.C0164e.m519a(r0, r1);
        r1 = r0.length;
        r1 = r1 + 1;
        r1 = new byte[r1];
        f1491c = r1;
        r1 = f1491c;
        r2 = r0.length;
        r3 = 0;
        java.lang.System.arraycopy(r0, r3, r1, r3, r2);
        r1 = f1491c;
        r0 = r0.length;
        r1[r0] = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.i.a.j.<clinit>():void");
    }

    /* renamed from: b */
    String m1614b(String str, String str2) {
        return new C0837e(str2, str).mo37b();
    }

    /* renamed from: a */
    String m1613a(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new C0839g(str4, str3, str, str2, bArr, i, str5, bArr2).mo37b();
    }

    /* renamed from: e */
    private static String m1602e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: f */
    private static String m1605f(String str) {
        return C0840j.m1602e(str);
    }

    /* renamed from: g */
    private static String m1607g(String str) {
        return C0840j.m1602e(str);
    }

    /* renamed from: d */
    private static int m1595d(byte[] bArr, int i) {
        if (bArr.length >= i + 4) {
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw new C1321i("NTLM authentication - buffer too small for DWORD");
    }

    /* renamed from: e */
    private static int m1601e(byte[] bArr, int i) {
        if (bArr.length >= i + 2) {
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        }
        throw new C1321i("NTLM authentication - buffer too small for WORD");
    }

    /* renamed from: f */
    private static byte[] m1606f(byte[] bArr, int i) {
        int e = C0840j.m1601e(bArr, i);
        i = C0840j.m1595d(bArr, i + 4);
        if (bArr.length >= i + e) {
            Object obj = new byte[e];
            System.arraycopy(bArr, i, obj, 0, e);
            return obj;
        }
        throw new C1321i("NTLM authentication - buffer too small for data item");
    }

    /* renamed from: d */
    private static byte[] m1597d() {
        if (f1490a != null) {
            byte[] bArr = new byte[8];
            synchronized (f1490a) {
                f1490a.nextBytes(bArr);
            }
            return bArr;
        }
        throw new C1321i("Random generator not available");
    }

    /* renamed from: e */
    private static byte[] m1603e() {
        if (f1490a != null) {
            byte[] bArr = new byte[16];
            synchronized (f1490a) {
                f1490a.nextBytes(bArr);
            }
            return bArr;
        }
        throw new C1321i("Random generator not available");
    }

    /* renamed from: a */
    static byte[] m1579a(byte[] bArr, byte[] bArr2) {
        C0104b c0104b = new C0104b(bArr2);
        c0104b.m297a(bArr);
        return c0104b.m298a();
    }

    /* renamed from: b */
    static byte[] m1586b(byte[] bArr, byte[] bArr2) {
        try {
            Cipher instance = Cipher.getInstance("RC4");
            instance.init(1, new SecretKeySpec(bArr2, "RC4"));
            return instance.doFinal(bArr);
        } catch (byte[] bArr3) {
            throw new C1321i(bArr3.getMessage(), bArr3);
        }
    }

    /* renamed from: a */
    static byte[] m1580a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr2);
            instance.update(bArr3);
            bArr2 = instance.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArr2, 0, bArr4, 0, 8);
            return C0840j.m1599d(bArr, bArr4);
        } catch (byte[] bArr5) {
            if ((bArr5 instanceof C1321i) != null) {
                throw ((C1321i) bArr5);
            }
            throw new C1321i(bArr5.getMessage(), bArr5);
        }
    }

    /* renamed from: h */
    private static byte[] m1609h(String str) {
        try {
            str = str.toUpperCase(Locale.ENGLISH).getBytes("US-ASCII");
            Object obj = new byte[14];
            System.arraycopy(str, 0, obj, 0, Math.min(str.length, 14));
            str = C0840j.m1608g(obj, 0);
            Key g = C0840j.m1608g(obj, 7);
            byte[] bytes = "KGS!@#$%".getBytes("US-ASCII");
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, str);
            str = instance.doFinal(bytes);
            instance.init(1, g);
            Object doFinal = instance.doFinal(bytes);
            obj = new byte[16];
            System.arraycopy(str, 0, obj, 0, 8);
            System.arraycopy(doFinal, 0, obj, 8, 8);
            return obj;
        } catch (String str2) {
            throw new C1321i(str2.getMessage(), str2);
        }
    }

    /* renamed from: i */
    private static byte[] m1610i(String str) {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            C0105c c0105c = new C0105c();
            c0105c.m299a(bytes);
            return c0105c.m301a();
        } catch (String str2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unicode not supported: ");
            stringBuilder.append(str2.getMessage());
            throw new C1321i(stringBuilder.toString(), str2);
        }
    }

    /* renamed from: c */
    private static byte[] m1591c(String str, String str2, byte[] bArr) {
        try {
            C0104b c0104b = new C0104b(bArr);
            c0104b.m297a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c0104b.m297a(str.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            }
            return c0104b.m298a();
        } catch (String str3) {
            bArr = new StringBuilder();
            bArr.append("Unicode not supported! ");
            bArr.append(str3.getMessage());
            throw new C1321i(bArr.toString(), str3);
        }
    }

    /* renamed from: d */
    private static byte[] m1598d(String str, String str2, byte[] bArr) {
        try {
            C0104b c0104b = new C0104b(bArr);
            c0104b.m297a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                c0104b.m297a(str.getBytes("UnicodeLittleUnmarked"));
            }
            return c0104b.m298a();
        } catch (String str3) {
            bArr = new StringBuilder();
            bArr.append("Unicode not supported! ");
            bArr.append(str3.getMessage());
            throw new C1321i(bArr.toString(), str3);
        }
    }

    /* renamed from: d */
    private static byte[] m1599d(byte[] bArr, byte[] bArr2) {
        try {
            Object obj = new byte[21];
            System.arraycopy(bArr, 0, obj, 0, 16);
            bArr = C0840j.m1608g(obj, 0);
            Key g = C0840j.m1608g(obj, 7);
            Key g2 = C0840j.m1608g(obj, 14);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, bArr);
            bArr = instance.doFinal(bArr2);
            instance.init(1, g);
            Object doFinal = instance.doFinal(bArr2);
            instance.init(1, g2);
            bArr2 = instance.doFinal(bArr2);
            obj = new byte[24];
            System.arraycopy(bArr, 0, obj, 0, 8);
            System.arraycopy(doFinal, 0, obj, 8, 8);
            System.arraycopy(bArr2, 0, obj, 16, 8);
            return obj;
        } catch (byte[] bArr3) {
            throw new C1321i(bArr3.getMessage(), bArr3);
        }
    }

    /* renamed from: d */
    private static byte[] m1600d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C0104b c0104b = new C0104b(bArr);
        c0104b.m297a(bArr2);
        c0104b.m297a(bArr3);
        bArr = c0104b.m298a();
        bArr2 = new byte[(bArr.length + bArr3.length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArr3, 0, bArr2, bArr.length, bArr3.length);
        return bArr2;
    }

    /* renamed from: e */
    private static byte[] m1604e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object obj = new byte[]{(byte) 1, (byte) 1, (byte) 0, (byte) 0};
        Object obj2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj5 = new byte[((((((obj.length + obj2.length) + bArr3.length) + 8) + obj3.length) + bArr2.length) + obj4.length)];
        System.arraycopy(obj, 0, obj5, 0, obj.length);
        int length = obj.length + 0;
        System.arraycopy(obj2, 0, obj5, length, obj2.length);
        length += obj2.length;
        System.arraycopy(bArr3, 0, obj5, length, bArr3.length);
        length += bArr3.length;
        System.arraycopy(bArr, 0, obj5, length, 8);
        length += 8;
        System.arraycopy(obj3, 0, obj5, length, obj3.length);
        length += obj3.length;
        System.arraycopy(bArr2, 0, obj5, length, bArr2.length);
        System.arraycopy(obj4, 0, obj5, length + bArr2.length, obj4.length);
        bArr = obj4.length;
        return obj5;
    }

    /* renamed from: g */
    private static Key m1608g(byte[] bArr, int i) {
        r1 = new byte[7];
        System.arraycopy(bArr, i, r1, 0, 7);
        bArr = new byte[]{r1[0], (byte) ((r1[0] << 7) | ((r1[1] & 255) >>> 1)), (byte) ((r1[1] << 6) | ((r1[2] & 255) >>> 2)), (byte) ((r1[2] << 5) | ((r1[3] & 255) >>> 3)), (byte) ((r1[3] << 4) | ((r1[4] & 255) >>> 4)), (byte) ((r1[4] << 3) | ((r1[5] & 255) >>> 5)), (byte) ((r1[5] << 2) | ((r1[6] & 255) >>> 6)), (byte) (r1[6] << 1)};
        C0840j.m1574a(bArr);
        return new SecretKeySpec(bArr, "DES");
    }

    /* renamed from: a */
    private static void m1574a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0 ? 1 : null) != null) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }

    /* renamed from: a */
    static void m1575a(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: a */
    public String mo38a(String str, String str2) {
        return m1614b(str2, str);
    }

    /* renamed from: a */
    public String mo39a(String str, String str2, String str3, String str4, String str5) {
        C0838f c0838f = new C0838f(str5);
        return m1613a(str, str2, str4, str3, c0838f.m1566c(), c0838f.m1569f(), c0838f.m1567d(), c0838f.m1568e());
    }
}
