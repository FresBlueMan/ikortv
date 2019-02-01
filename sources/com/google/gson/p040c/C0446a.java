package com.google.gson.p040c;

import com.google.gson.internal.C0468d;
import com.google.gson.internal.bind.C1008c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader */
/* renamed from: com.google.gson.c.a */
public class C0446a implements Closeable {
    /* renamed from: b */
    private static final char[] f361b = ")]}'\n".toCharArray();
    /* renamed from: a */
    int f362a = 0;
    /* renamed from: c */
    private final Reader f363c;
    /* renamed from: d */
    private boolean f364d = false;
    /* renamed from: e */
    private final char[] f365e = new char[1024];
    /* renamed from: f */
    private int f366f = 0;
    /* renamed from: g */
    private int f367g = 0;
    /* renamed from: h */
    private int f368h = 0;
    /* renamed from: i */
    private int f369i = 0;
    /* renamed from: j */
    private long f370j;
    /* renamed from: k */
    private int f371k;
    /* renamed from: l */
    private String f372l;
    /* renamed from: m */
    private int[] f373m = new int[32];
    /* renamed from: n */
    private int f374n = 0;
    /* renamed from: o */
    private String[] f375o;
    /* renamed from: p */
    private int[] f376p;

    /* compiled from: JsonReader */
    /* renamed from: com.google.gson.c.a$1 */
    static class C09891 extends C0468d {
        C09891() {
        }

        /* renamed from: a */
        public void mo1258a(C0446a c0446a) {
            if (c0446a instanceof C1008c) {
                ((C1008c) c0446a).mo1286o();
                return;
            }
            int i = c0446a.f362a;
            if (i == 0) {
                i = c0446a.m607r();
            }
            if (i == 13) {
                c0446a.f362a = 9;
            } else if (i == 12) {
                c0446a.f362a = 8;
            } else if (i == 14) {
                c0446a.f362a = 10;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a name but was ");
                stringBuilder.append(c0446a.mo1277f());
                stringBuilder.append(c0446a.m608s());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    static {
        C0468d.f478a = new C09891();
    }

    public C0446a(Reader reader) {
        int[] iArr = this.f373m;
        int i = this.f374n;
        this.f374n = i + 1;
        iArr[i] = 6;
        this.f375o = new String[32];
        this.f376p = new int[32];
        if (reader != null) {
            this.f363c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    public final void m591a(boolean z) {
        this.f364d = z;
    }

    /* renamed from: q */
    public final boolean m606q() {
        return this.f364d;
    }

    /* renamed from: a */
    public void mo1271a() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 3) {
            m574a(1);
            this.f376p[this.f374n - 1] = 0;
            this.f362a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(mo1277f());
        stringBuilder.append(m608s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public void mo1272b() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 4) {
            this.f374n--;
            int[] iArr = this.f376p;
            int i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f362a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append(mo1277f());
        stringBuilder.append(m608s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: c */
    public void mo1273c() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 1) {
            m574a(3);
            this.f362a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(mo1277f());
        stringBuilder.append(m608s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: d */
    public void mo1275d() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 2) {
            this.f374n--;
            this.f375o[this.f374n] = null;
            int[] iArr = this.f376p;
            int i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f362a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append(mo1277f());
        stringBuilder.append(m608s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: e */
    public boolean mo1276e() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public C0447b mo1277f() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        switch (i) {
            case 1:
                return C0447b.BEGIN_OBJECT;
            case 2:
                return C0447b.END_OBJECT;
            case 3:
                return C0447b.BEGIN_ARRAY;
            case 4:
                return C0447b.END_ARRAY;
            case 5:
            case 6:
                return C0447b.BOOLEAN;
            case 7:
                return C0447b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C0447b.STRING;
            case 12:
            case 13:
            case 14:
                return C0447b.NAME;
            case 15:
            case 16:
                return C0447b.NUMBER;
            case 17:
                return C0447b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: r */
    int m607r() {
        int b;
        int i = this.f373m[this.f374n - 1];
        if (i == 1) {
            this.f373m[this.f374n - 1] = 2;
        } else if (i == 2) {
            b = m577b(true);
            if (b != 44) {
                if (b == 59) {
                    m586w();
                } else if (b == 93) {
                    this.f362a = 4;
                    return 4;
                } else {
                    throw m578b("Unterminated array");
                }
            }
        } else {
            int b2;
            if (i != 3) {
                if (i != 5) {
                    if (i == 4) {
                        this.f373m[this.f374n - 1] = 5;
                        b = m577b(true);
                        if (b != 58) {
                            if (b == 61) {
                                m586w();
                                if ((this.f366f < this.f367g || m580b(1)) && this.f365e[this.f366f] == '>') {
                                    this.f366f++;
                                }
                            } else {
                                throw m578b("Expected ':'");
                            }
                        }
                    } else if (i == 6) {
                        if (this.f364d) {
                            m589z();
                        }
                        this.f373m[this.f374n - 1] = 7;
                    } else if (i == 7) {
                        if (m577b(false) == -1) {
                            this.f362a = 17;
                            return 17;
                        }
                        m586w();
                        this.f366f--;
                    } else if (i == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
            }
            this.f373m[this.f374n - 1] = 4;
            if (i == 5) {
                b2 = m577b(true);
                if (b2 != 44) {
                    if (b2 == 59) {
                        m586w();
                    } else if (b2 == 125) {
                        this.f362a = 2;
                        return 2;
                    } else {
                        throw m578b("Unterminated object");
                    }
                }
            }
            b2 = m577b(true);
            if (b2 == 34) {
                this.f362a = 13;
                return 13;
            } else if (b2 == 39) {
                m586w();
                this.f362a = 12;
                return 12;
            } else if (b2 != 125) {
                m586w();
                this.f366f--;
                if (m575a((char) b2)) {
                    this.f362a = 14;
                    return 14;
                }
                throw m578b("Expected name");
            } else if (i != 5) {
                this.f362a = 2;
                return 2;
            } else {
                throw m578b("Expected name");
            }
        }
        b = m577b(true);
        if (b == 34) {
            this.f362a = 9;
            return 9;
        } else if (b != 39) {
            if (!(b == 44 || b == 59)) {
                if (b == 91) {
                    this.f362a = 3;
                    return 3;
                } else if (b != 93) {
                    if (b != 123) {
                        this.f366f--;
                        i = mo1286o();
                        if (i != 0) {
                            return i;
                        }
                        i = m583t();
                        if (i != 0) {
                            return i;
                        }
                        if (m575a(this.f365e[this.f366f])) {
                            m586w();
                            this.f362a = 10;
                            return 10;
                        }
                        throw m578b("Expected value");
                    }
                    this.f362a = 1;
                    return 1;
                } else if (i == 1) {
                    this.f362a = 4;
                    return 4;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw m578b("Unexpected value");
                }
            }
            m586w();
            this.f366f--;
            this.f362a = 7;
            return 7;
        } else {
            m586w();
            this.f362a = 8;
            return 8;
        }
    }

    /* renamed from: o */
    private int mo1286o() {
        String str;
        String str2;
        int i;
        int length;
        int i2;
        char c;
        char c2 = this.f365e[this.f366f];
        if (c2 != 't') {
            if (c2 != 'T') {
                if (c2 != 'f') {
                    if (c2 != 'F') {
                        if (c2 != 'n') {
                            if (c2 != 'N') {
                                return 0;
                            }
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        length = str.length();
                        i2 = 1;
                        while (i2 < length) {
                            if (this.f366f + i2 < this.f367g && !m580b(i2 + 1)) {
                                return 0;
                            }
                            c = this.f365e[this.f366f + i2];
                            if (c != str.charAt(i2) && c != r2.charAt(i2)) {
                                return 0;
                            }
                            i2++;
                        }
                        if ((this.f366f + length >= this.f367g || m580b(length + 1)) && m575a(this.f365e[this.f366f + length])) {
                            return 0;
                        }
                        this.f366f += length;
                        this.f362a = i;
                        return i;
                    }
                }
                str = "false";
                str2 = "FALSE";
                i = 6;
                length = str.length();
                i2 = 1;
                while (i2 < length) {
                    if (this.f366f + i2 < this.f367g) {
                    }
                    c = this.f365e[this.f366f + i2];
                    if (c != str.charAt(i2)) {
                    }
                    i2++;
                }
                if (this.f366f + length >= this.f367g) {
                }
                return 0;
            }
        }
        str = "true";
        str2 = "TRUE";
        i = 5;
        length = str.length();
        i2 = 1;
        while (i2 < length) {
            if (this.f366f + i2 < this.f367g) {
            }
            c = this.f365e[this.f366f + i2];
            if (c != str.charAt(i2)) {
            }
            i2++;
        }
        if (this.f366f + length >= this.f367g) {
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: t */
    private int m583t() {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.f365e;
        r2 = r0.f366f;
        r3 = r0.f367g;
        r6 = 1;
        r7 = 0;
        r8 = r3;
        r3 = 0;
        r9 = 0;
        r10 = 1;
        r11 = 0;
        r13 = 0;
    L_0x0011:
        r14 = r2 + r3;
        r15 = 2;
        if (r14 != r8) goto L_0x0028;
    L_0x0016:
        r2 = r1.length;
        if (r3 != r2) goto L_0x001a;
    L_0x0019:
        return r7;
    L_0x001a:
        r2 = r3 + 1;
        r2 = r0.m580b(r2);
        if (r2 != 0) goto L_0x0024;
    L_0x0022:
        goto L_0x0097;
    L_0x0024:
        r2 = r0.f366f;
        r8 = r0.f367g;
    L_0x0028:
        r14 = r2 + r3;
        r14 = r1[r14];
        r7 = 43;
        r4 = 3;
        r5 = 5;
        if (r14 == r7) goto L_0x00f0;
    L_0x0032:
        r7 = 69;
        if (r14 == r7) goto L_0x00e4;
    L_0x0036:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r14 == r7) goto L_0x00e4;
    L_0x003a:
        switch(r14) {
            case 45: goto L_0x00d7;
            case 46: goto L_0x00cf;
            default: goto L_0x003d;
        };
    L_0x003d:
        r7 = 48;
        if (r14 < r7) goto L_0x0091;
    L_0x0041:
        r7 = 57;
        if (r14 <= r7) goto L_0x0046;
    L_0x0045:
        goto L_0x0091;
    L_0x0046:
        if (r9 == r6) goto L_0x0086;
    L_0x0048:
        if (r9 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0086;
    L_0x004b:
        if (r9 != r15) goto L_0x0076;
    L_0x004d:
        r16 = 0;
        r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0055;
    L_0x0053:
        r4 = 0;
        return r4;
    L_0x0055:
        r4 = 10;
        r4 = r4 * r11;
        r14 = r14 + -48;
        r14 = (long) r14;
        r4 = r4 - r14;
        r14 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 > 0) goto L_0x0071;
    L_0x0066:
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 != 0) goto L_0x006f;
    L_0x006a:
        r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r7 >= 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        r7 = 0;
        goto L_0x0072;
    L_0x0071:
        r7 = 1;
    L_0x0072:
        r7 = r7 & r10;
        r11 = r4;
        r10 = r7;
        goto L_0x0081;
    L_0x0076:
        if (r9 != r4) goto L_0x007b;
    L_0x0078:
        r7 = 0;
        r9 = 4;
        goto L_0x008d;
    L_0x007b:
        if (r9 == r5) goto L_0x0083;
    L_0x007d:
        r4 = 6;
        if (r9 != r4) goto L_0x0081;
    L_0x0080:
        goto L_0x0083;
    L_0x0081:
        r7 = 0;
        goto L_0x008d;
    L_0x0083:
        r7 = 0;
        r9 = 7;
        goto L_0x008d;
    L_0x0086:
        r14 = r14 + -48;
        r4 = -r14;
        r4 = (long) r4;
        r11 = r4;
        r7 = 0;
        r9 = 2;
    L_0x008d:
        r16 = 0;
        goto L_0x00f7;
    L_0x0091:
        r1 = r0.m575a(r14);
        if (r1 != 0) goto L_0x00cd;
    L_0x0097:
        if (r9 != r15) goto L_0x00bb;
    L_0x0099:
        if (r10 == 0) goto L_0x00bb;
    L_0x009b:
        r1 = -9223372036854775808;
        r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r4 != 0) goto L_0x00a3;
    L_0x00a1:
        if (r13 == 0) goto L_0x00bb;
    L_0x00a3:
        r16 = 0;
        r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r1 != 0) goto L_0x00ab;
    L_0x00a9:
        if (r13 != 0) goto L_0x00bb;
    L_0x00ab:
        if (r13 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00af;
    L_0x00ae:
        r11 = -r11;
    L_0x00af:
        r0.f370j = r11;
        r1 = r0.f366f;
        r1 = r1 + r3;
        r0.f366f = r1;
        r1 = 15;
        r0.f362a = r1;
        return r1;
    L_0x00bb:
        if (r9 == r15) goto L_0x00c6;
    L_0x00bd:
        r1 = 4;
        if (r9 == r1) goto L_0x00c6;
    L_0x00c0:
        r1 = 7;
        if (r9 != r1) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        r7 = 0;
        return r7;
    L_0x00c6:
        r0.f371k = r3;
        r1 = 16;
        r0.f362a = r1;
        return r1;
    L_0x00cd:
        r7 = 0;
        return r7;
    L_0x00cf:
        r7 = 0;
        r16 = 0;
        if (r9 != r15) goto L_0x00d6;
    L_0x00d4:
        r9 = 3;
        goto L_0x00f7;
    L_0x00d6:
        return r7;
    L_0x00d7:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != 0) goto L_0x00e0;
    L_0x00dd:
        r9 = 1;
        r13 = 1;
        goto L_0x00f7;
    L_0x00e0:
        if (r9 != r5) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00f6;
    L_0x00e3:
        return r7;
    L_0x00e4:
        r7 = 0;
        r16 = 0;
        if (r9 == r15) goto L_0x00ee;
    L_0x00e9:
        r4 = 4;
        if (r9 != r4) goto L_0x00ed;
    L_0x00ec:
        goto L_0x00ee;
    L_0x00ed:
        return r7;
    L_0x00ee:
        r9 = 5;
        goto L_0x00f7;
    L_0x00f0:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != r5) goto L_0x00fb;
    L_0x00f6:
        r9 = 6;
    L_0x00f7:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x00fb:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.t():int");
    }

    /* renamed from: a */
    private boolean m575a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                m586w();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo1278g() {
        String u;
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 14) {
            u = m584u();
        } else if (i == 12) {
            u = m579b('\'');
        } else if (i == 13) {
            u = m579b('\"');
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a name but was ");
            stringBuilder.append(mo1277f());
            stringBuilder.append(m608s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f362a = 0;
        this.f375o[this.f374n - 1] = u;
        return u;
    }

    /* renamed from: h */
    public String mo1279h() {
        String u;
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 10) {
            u = m584u();
        } else if (i == 8) {
            u = m579b('\'');
        } else if (i == 9) {
            u = m579b('\"');
        } else if (i == 11) {
            u = this.f372l;
            this.f372l = null;
        } else if (i == 15) {
            u = Long.toString(this.f370j);
        } else if (i == 16) {
            u = new String(this.f365e, this.f366f, this.f371k);
            this.f366f += this.f371k;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a string but was ");
            stringBuilder.append(mo1277f());
            stringBuilder.append(m608s());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f362a = 0;
        int[] iArr = this.f376p;
        int i2 = this.f374n - 1;
        iArr[i2] = iArr[i2] + 1;
        return u;
    }

    /* renamed from: i */
    public boolean mo1280i() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.f362a = 0;
            iArr = this.f376p;
            i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f362a = 0;
            iArr = this.f376p;
            i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a boolean but was ");
            stringBuilder.append(mo1277f());
            stringBuilder.append(m608s());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: j */
    public void mo1281j() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 7) {
            this.f362a = 0;
            int[] iArr = this.f376p;
            int i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append(mo1277f());
        stringBuilder.append(m608s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: k */
    public double mo1282k() {
        int i = this.f362a;
        if (i == 0) {
            i = m607r();
        }
        if (i == 15) {
            this.f362a = 0;
            int[] iArr = this.f376p;
            int i2 = this.f374n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f370j;
        }
        if (i == 16) {
            this.f372l = new String(this.f365e, this.f366f, this.f371k);
            this.f366f += this.f371k;
        } else {
            if (i != 8) {
                if (i != 9) {
                    if (i == 10) {
                        this.f372l = m584u();
                    } else if (i != 11) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a double but was ");
                        stringBuilder.append(mo1277f());
                        stringBuilder.append(m608s());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            this.f372l = m579b(i == 8 ? '\'' : '\"');
        }
        this.f362a = 11;
        double parseDouble = Double.parseDouble(this.f372l);
        if (!this.f364d) {
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("JSON forbids NaN and infinities: ");
                stringBuilder2.append(parseDouble);
                stringBuilder2.append(m608s());
                throw new C0449d(stringBuilder2.toString());
            }
        }
        this.f372l = null;
        this.f362a = 0;
        int[] iArr2 = this.f376p;
        int i3 = this.f374n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: l */
    public long mo1283l() {
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
        r8 = this;
        r0 = r8.f362a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r8.m607r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
    L_0x000d:
        r8.f362a = r2;
        r0 = r8.f376p;
        r1 = r8.f374n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r8.f370j;
        return r0;
    L_0x001e:
        r1 = 16;
        if (r0 != r1) goto L_0x0037;
    L_0x0022:
        r0 = new java.lang.String;
        r1 = r8.f365e;
        r3 = r8.f366f;
        r4 = r8.f371k;
        r0.<init>(r1, r3, r4);
        r8.f372l = r0;
        r0 = r8.f366f;
        r1 = r8.f371k;
        r0 = r0 + r1;
        r8.f366f = r0;
        goto L_0x0091;
    L_0x0037:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0066;
    L_0x003d:
        r4 = 9;
        if (r0 == r4) goto L_0x0066;
    L_0x0041:
        if (r0 != r1) goto L_0x0044;
    L_0x0043:
        goto L_0x0066;
    L_0x0044:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r8.mo1277f();
        r1.append(r2);
        r2 = r8.m608s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0066:
        if (r0 != r1) goto L_0x006f;
    L_0x0068:
        r0 = r8.m584u();
        r8.f372l = r0;
        goto L_0x007c;
    L_0x006f:
        if (r0 != r3) goto L_0x0074;
    L_0x0071:
        r0 = 39;
        goto L_0x0076;
    L_0x0074:
        r0 = 34;
    L_0x0076:
        r0 = r8.m579b(r0);
        r8.f372l = r0;
    L_0x007c:
        r0 = r8.f372l;	 Catch:{ NumberFormatException -> 0x0091 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0091 }
        r8.f362a = r2;	 Catch:{ NumberFormatException -> 0x0091 }
        r3 = r8.f376p;	 Catch:{ NumberFormatException -> 0x0091 }
        r4 = r8.f374n;	 Catch:{ NumberFormatException -> 0x0091 }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x0091 }
        r5 = r3[r4];	 Catch:{ NumberFormatException -> 0x0091 }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x0091 }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x0091 }
        return r0;
    L_0x0091:
        r0 = 11;
        r8.f362a = r0;
        r0 = r8.f372l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (long) r0;
        r5 = (double) r3;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 != 0) goto L_0x00b3;
    L_0x00a1:
        r0 = 0;
        r8.f372l = r0;
        r8.f362a = r2;
        r0 = r8.f376p;
        r1 = r8.f374n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00b3:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r8.f372l;
        r1.append(r2);
        r2 = r8.m608s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.l():long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private java.lang.String m579b(char r10) {
        /*
        r9 = this;
        r0 = r9.f365e;
        r1 = 0;
    L_0x0003:
        r2 = r9.f366f;
        r3 = r9.f367g;
    L_0x0007:
        r4 = r2;
    L_0x0008:
        r5 = 16;
        r6 = 1;
        if (r2 >= r3) goto L_0x005b;
    L_0x000d:
        r7 = r2 + 1;
        r2 = r0[r2];
        if (r2 != r10) goto L_0x0027;
    L_0x0013:
        r9.f366f = r7;
        r7 = r7 - r4;
        r7 = r7 - r6;
        if (r1 != 0) goto L_0x001f;
    L_0x0019:
        r10 = new java.lang.String;
        r10.<init>(r0, r4, r7);
        return r10;
    L_0x001f:
        r1.append(r0, r4, r7);
        r10 = r1.toString();
        return r10;
    L_0x0027:
        r8 = 92;
        if (r2 != r8) goto L_0x004e;
    L_0x002b:
        r9.f366f = r7;
        r7 = r7 - r4;
        r7 = r7 - r6;
        if (r1 != 0) goto L_0x003f;
    L_0x0031:
        r1 = r7 + 1;
        r1 = r1 * 2;
        r2 = new java.lang.StringBuilder;
        r1 = java.lang.Math.max(r1, r5);
        r2.<init>(r1);
        r1 = r2;
    L_0x003f:
        r1.append(r0, r4, r7);
        r2 = r9.m588y();
        r1.append(r2);
        r2 = r9.f366f;
        r3 = r9.f367g;
        goto L_0x0007;
    L_0x004e:
        r5 = 10;
        if (r2 != r5) goto L_0x0059;
    L_0x0052:
        r2 = r9.f368h;
        r2 = r2 + r6;
        r9.f368h = r2;
        r9.f369i = r7;
    L_0x0059:
        r2 = r7;
        goto L_0x0008;
    L_0x005b:
        if (r1 != 0) goto L_0x006b;
    L_0x005d:
        r1 = r2 - r4;
        r1 = r1 * 2;
        r3 = new java.lang.StringBuilder;
        r1 = java.lang.Math.max(r1, r5);
        r3.<init>(r1);
        r1 = r3;
    L_0x006b:
        r3 = r2 - r4;
        r1.append(r0, r4, r3);
        r9.f366f = r2;
        r2 = r9.m580b(r6);
        if (r2 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0003;
    L_0x0079:
        r10 = "Unterminated string";
        r10 = r9.m578b(r10);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.b(char):java.lang.String");
    }

    /* renamed from: u */
    private String m584u() {
        String str;
        int i = 0;
        StringBuilder stringBuilder = null;
        do {
            int i2 = 0;
            while (true) {
                if (this.f366f + i2 < this.f367g) {
                    switch (this.f365e[this.f366f + i2]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case '\\':
                            m586w();
                            break;
                        default:
                            i2++;
                            break;
                    }
                } else if (i2 >= this.f365e.length) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max(i2, 16));
                    }
                    stringBuilder.append(this.f365e, this.f366f, i2);
                    this.f366f += i2;
                } else if (m580b(i2 + 1)) {
                }
                i = i2;
                if (stringBuilder != null) {
                    str = new String(this.f365e, this.f366f, i);
                } else {
                    stringBuilder.append(this.f365e, this.f366f, i);
                    str = stringBuilder.toString();
                }
                this.f366f += i;
                return str;
            }
        } while (m580b(1));
        if (stringBuilder != null) {
            stringBuilder.append(this.f365e, this.f366f, i);
            str = stringBuilder.toString();
        } else {
            str = new String(this.f365e, this.f366f, i);
        }
        this.f366f += i;
        return str;
    }

    /* renamed from: c */
    private void m581c(char c) {
        char[] cArr = this.f365e;
        while (true) {
            int i = this.f366f;
            int i2 = this.f367g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f366f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f366f = i3;
                    m588y();
                    i = this.f366f;
                    i2 = this.f367g;
                } else {
                    if (c2 == '\n') {
                        this.f368h++;
                        this.f369i = i3;
                    }
                    i = i3;
                }
            }
            this.f366f = i;
            if (!m580b(1)) {
                throw m578b("Unterminated string");
            }
        }
    }

    /* renamed from: v */
    private void m585v() {
        do {
            int i = 0;
            while (this.f366f + i < this.f367g) {
                switch (this.f365e[this.f366f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m586w();
                        break;
                    default:
                        i++;
                }
                this.f366f += i;
                return;
            }
            this.f366f += i;
        } while (m580b(1));
    }

    /* renamed from: m */
    public int mo1284m() {
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
        r7 = this;
        r0 = r7.f362a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m607r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x0046;
    L_0x000d:
        r0 = r7.f370j;
        r0 = (int) r0;
        r3 = r7.f370j;
        r5 = (long) r0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0026;
    L_0x0017:
        r7.f362a = r2;
        r1 = r7.f376p;
        r2 = r7.f374n;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
    L_0x0026:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f370j;
        r1.append(r2);
        r2 = r7.m608s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0046:
        r1 = 16;
        if (r0 != r1) goto L_0x005f;
    L_0x004a:
        r0 = new java.lang.String;
        r1 = r7.f365e;
        r3 = r7.f366f;
        r4 = r7.f371k;
        r0.<init>(r1, r3, r4);
        r7.f372l = r0;
        r0 = r7.f366f;
        r1 = r7.f371k;
        r0 = r0 + r1;
        r7.f366f = r0;
        goto L_0x00b9;
    L_0x005f:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x008e;
    L_0x0065:
        r4 = 9;
        if (r0 == r4) goto L_0x008e;
    L_0x0069:
        if (r0 != r1) goto L_0x006c;
    L_0x006b:
        goto L_0x008e;
    L_0x006c:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.mo1277f();
        r1.append(r2);
        r2 = r7.m608s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x008e:
        if (r0 != r1) goto L_0x0097;
    L_0x0090:
        r0 = r7.m584u();
        r7.f372l = r0;
        goto L_0x00a4;
    L_0x0097:
        if (r0 != r3) goto L_0x009c;
    L_0x0099:
        r0 = 39;
        goto L_0x009e;
    L_0x009c:
        r0 = 34;
    L_0x009e:
        r0 = r7.m579b(r0);
        r7.f372l = r0;
    L_0x00a4:
        r0 = r7.f372l;	 Catch:{ NumberFormatException -> 0x00b9 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00b9 }
        r7.f362a = r2;	 Catch:{ NumberFormatException -> 0x00b9 }
        r1 = r7.f376p;	 Catch:{ NumberFormatException -> 0x00b9 }
        r3 = r7.f374n;	 Catch:{ NumberFormatException -> 0x00b9 }
        r3 = r3 + -1;	 Catch:{ NumberFormatException -> 0x00b9 }
        r4 = r1[r3];	 Catch:{ NumberFormatException -> 0x00b9 }
        r4 = r4 + 1;	 Catch:{ NumberFormatException -> 0x00b9 }
        r1[r3] = r4;	 Catch:{ NumberFormatException -> 0x00b9 }
        return r0;
    L_0x00b9:
        r0 = 11;
        r7.f362a = r0;
        r0 = r7.f372l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (int) r0;
        r4 = (double) r3;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 != 0) goto L_0x00db;
    L_0x00c9:
        r0 = 0;
        r7.f372l = r0;
        r7.f362a = r2;
        r0 = r7.f376p;
        r1 = r7.f374n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00db:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f372l;
        r1.append(r2);
        r2 = r7.m608s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.c.a.m():int");
    }

    public void close() {
        this.f362a = 0;
        this.f373m[0] = 8;
        this.f374n = 1;
        this.f363c.close();
    }

    /* renamed from: n */
    public void mo1285n() {
        int i = 0;
        do {
            int i2 = this.f362a;
            if (i2 == 0) {
                i2 = m607r();
            }
            if (i2 == 3) {
                m574a(1);
                i++;
            } else if (i2 == 1) {
                m574a(3);
                i++;
            } else if (i2 == 4) {
                this.f374n--;
                i--;
            } else if (i2 == 2) {
                this.f374n--;
                i--;
            } else {
                if (i2 != 14) {
                    if (i2 != 10) {
                        if (i2 != 8) {
                            if (i2 != 12) {
                                if (i2 != 9) {
                                    if (i2 != 13) {
                                        if (i2 == 16) {
                                            this.f366f += this.f371k;
                                        }
                                    }
                                }
                                m581c('\"');
                            }
                        }
                        m581c('\'');
                    }
                }
                m585v();
            }
            this.f362a = 0;
        } while (i != 0);
        int[] iArr = this.f376p;
        i = this.f374n - 1;
        iArr[i] = iArr[i] + 1;
        this.f375o[this.f374n - 1] = "null";
    }

    /* renamed from: a */
    private void m574a(int i) {
        if (this.f374n == this.f373m.length) {
            Object obj = new int[(this.f374n * 2)];
            Object obj2 = new int[(this.f374n * 2)];
            Object obj3 = new String[(this.f374n * 2)];
            System.arraycopy(this.f373m, 0, obj, 0, this.f374n);
            System.arraycopy(this.f376p, 0, obj2, 0, this.f374n);
            System.arraycopy(this.f375o, 0, obj3, 0, this.f374n);
            this.f373m = obj;
            this.f376p = obj2;
            this.f375o = obj3;
        }
        int[] iArr = this.f373m;
        int i2 = this.f374n;
        this.f374n = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private boolean m580b(int i) {
        Object obj = this.f365e;
        this.f369i -= this.f366f;
        if (this.f367g != this.f366f) {
            this.f367g -= this.f366f;
            System.arraycopy(obj, this.f366f, obj, 0, this.f367g);
        } else {
            this.f367g = 0;
        }
        this.f366f = 0;
        do {
            int read = this.f363c.read(obj, this.f367g, obj.length - this.f367g);
            if (read == -1) {
                return false;
            }
            this.f367g += read;
            if (this.f368h == 0 && this.f369i == 0 && this.f367g > 0 && obj[0] == '﻿') {
                this.f366f++;
                this.f369i++;
                i++;
            }
        } while (this.f367g < i);
        return true;
    }

    /* renamed from: b */
    private int m577b(boolean z) {
        char[] cArr = this.f365e;
        int i = this.f366f;
        int i2 = this.f367g;
        while (true) {
            if (i == i2) {
                this.f366f = i;
                if (!m580b(1)) {
                    break;
                }
                i = this.f366f;
                i2 = this.f367g;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f368h++;
                this.f369i = i3;
            } else if (!(c == ' ' || c == '\r')) {
                if (c != '\t') {
                    if (c == '/') {
                        this.f366f = i3;
                        if (i3 == i2) {
                            this.f366f--;
                            boolean b = m580b(2);
                            this.f366f++;
                            if (!b) {
                                return c;
                            }
                        }
                        m586w();
                        char c2 = cArr[this.f366f];
                        if (c2 == '*') {
                            this.f366f++;
                            if (m576a("*/")) {
                                i = this.f366f + 2;
                                i2 = this.f367g;
                            } else {
                                throw m578b("Unterminated comment");
                            }
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.f366f++;
                            m587x();
                            i = this.f366f;
                            i2 = this.f367g;
                        }
                    } else if (c == '#') {
                        this.f366f = i3;
                        m586w();
                        m587x();
                        i = this.f366f;
                        i2 = this.f367g;
                    } else {
                        this.f366f = i3;
                        return c;
                    }
                }
            }
            i = i3;
        }
        if (!z) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("End of input");
        stringBuilder.append(m608s());
        throw new EOFException(stringBuilder.toString());
    }

    /* renamed from: w */
    private void m586w() {
        if (!this.f364d) {
            throw m578b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: x */
    private void m587x() {
        char c;
        do {
            if (this.f366f < this.f367g || m580b(1)) {
                char[] cArr = this.f365e;
                int i = this.f366f;
                this.f366f = i + 1;
                c = cArr[i];
                if (c == '\n') {
                    this.f368h++;
                    this.f369i = this.f366f;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: a */
    private boolean m576a(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f366f + length > this.f367g) {
                if (!m580b(length)) {
                    return false;
                }
            }
            if (this.f365e[this.f366f] == '\n') {
                this.f368h++;
                this.f369i = this.f366f + 1;
            } else {
                while (i < length) {
                    if (this.f365e[this.f366f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f366f++;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(m608s());
        return stringBuilder.toString();
    }

    /* renamed from: s */
    String m608s() {
        int i = this.f368h + 1;
        int i2 = (this.f366f - this.f369i) + 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(mo1287p());
        return stringBuilder.toString();
    }

    /* renamed from: p */
    public String mo1287p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = this.f374n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f373m[i2]) {
                case 1:
                case 2:
                    stringBuilder.append('[');
                    stringBuilder.append(this.f376p[i2]);
                    stringBuilder.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    stringBuilder.append('.');
                    if (this.f375o[i2] == null) {
                        break;
                    }
                    stringBuilder.append(this.f375o[i2]);
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: y */
    private char m588y() {
        if (this.f366f == this.f367g) {
            if (!m580b(1)) {
                throw m578b("Unterminated escape sequence");
            }
        }
        char[] cArr = this.f365e;
        int i = this.f366f;
        this.f366f = i + 1;
        char c = cArr[i];
        if (c == '\n') {
            this.f368h++;
            this.f369i = this.f366f;
        } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            switch (c) {
                case 't':
                    return '\t';
                case 'u':
                    if (this.f366f + 4 > this.f367g) {
                        if (!m580b(4)) {
                            throw m578b("Unterminated escape sequence");
                        }
                    }
                    c = '\u0000';
                    int i2 = this.f366f;
                    int i3 = i2 + 4;
                    while (i2 < i3) {
                        char c2 = this.f365e[i2];
                        c = (char) (c << 4);
                        if (c2 >= '0' && c2 <= '9') {
                            c = (char) (c + (c2 - 48));
                        } else if (c2 >= 'a' && c2 <= 'f') {
                            c = (char) (c + ((c2 - 97) + 10));
                        } else if (c2 < 'A' || c2 > 'F') {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("\\u");
                            stringBuilder.append(new String(this.f365e, this.f366f, 4));
                            throw new NumberFormatException(stringBuilder.toString());
                        } else {
                            c = (char) (c + ((c2 - 65) + 10));
                        }
                        i2++;
                    }
                    this.f366f += 4;
                    return c;
                default:
                    throw m578b("Invalid escape sequence");
            }
        }
        return c;
    }

    /* renamed from: b */
    private IOException m578b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m608s());
        throw new C0449d(stringBuilder.toString());
    }

    /* renamed from: z */
    private void m589z() {
        m577b(true);
        this.f366f--;
        if (this.f366f + f361b.length <= this.f367g || m580b(f361b.length)) {
            int i = 0;
            while (i < f361b.length) {
                if (this.f365e[this.f366f + i] == f361b[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f366f += f361b.length;
        }
    }
}
