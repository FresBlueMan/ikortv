package p000a.p001a.p002a.p003a.p035o;

import java.io.Serializable;

/* compiled from: ByteArrayBuffer */
/* renamed from: a.a.a.a.o.c */
public final class C0162c implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    /* renamed from: a */
    private byte[] f309a;
    /* renamed from: b */
    private int f310b;

    public C0162c(int i) {
        C0160a.m482b(i, "Buffer capacity");
        this.f309a = new byte[i];
    }

    /* renamed from: c */
    private void m486c(int i) {
        i = new byte[Math.max(this.f309a.length << 1, i)];
        System.arraycopy(this.f309a, 0, i, 0, this.f310b);
        this.f309a = i;
    }

    /* renamed from: a */
    public void m490a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        i3 = this.f310b + i2;
                        if (i3 > this.f309a.length) {
                            m486c(i3);
                        }
                        System.arraycopy(bArr, i, this.f309a, this.f310b, i2);
                        this.f310b = i3;
                        return;
                    }
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("off: ");
            stringBuilder.append(i);
            stringBuilder.append(" len: ");
            stringBuilder.append(i2);
            stringBuilder.append(" b.length: ");
            stringBuilder.append(bArr.length);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void m488a(int i) {
        int i2 = this.f310b + 1;
        if (i2 > this.f309a.length) {
            m486c(i2);
        }
        this.f309a[this.f310b] = (byte) i;
        this.f310b = i2;
    }

    /* renamed from: a */
    public void m491a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        i3 = this.f310b;
                        i2 += i3;
                        if (i2 > this.f309a.length) {
                            m486c(i2);
                        }
                        while (i3 < i2) {
                            this.f309a[i3] = (byte) cArr[i];
                            i++;
                            i3++;
                        }
                        this.f310b = i2;
                        return;
                    }
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("off: ");
            stringBuilder.append(i);
            stringBuilder.append(" len: ");
            stringBuilder.append(i2);
            stringBuilder.append(" b.length: ");
            stringBuilder.append(cArr.length);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void m489a(C0163d c0163d, int i, int i2) {
        if (c0163d != null) {
            m491a(c0163d.m512b(), i, i2);
        }
    }

    /* renamed from: a */
    public void m487a() {
        this.f310b = 0;
    }

    /* renamed from: b */
    public byte[] m493b() {
        Object obj = new byte[this.f310b];
        if (this.f310b > 0) {
            System.arraycopy(this.f309a, 0, obj, 0, this.f310b);
        }
        return obj;
    }

    /* renamed from: b */
    public int m492b(int i) {
        return this.f309a[i];
    }

    /* renamed from: c */
    public int m494c() {
        return this.f309a.length;
    }

    /* renamed from: d */
    public int m495d() {
        return this.f310b;
    }

    /* renamed from: e */
    public byte[] m496e() {
        return this.f309a;
    }

    /* renamed from: f */
    public boolean m497f() {
        return this.f310b == 0;
    }

    /* renamed from: g */
    public boolean m498g() {
        return this.f310b == this.f309a.length;
    }
}
