package p000a.p001a.p002a.p003a.p031k;

/* compiled from: ParserCursor */
/* renamed from: a.a.a.a.k.u */
public class C0148u {
    /* renamed from: a */
    private final int f290a;
    /* renamed from: b */
    private final int f291b;
    /* renamed from: c */
    private int f292c;

    public C0148u(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.f290a = i;
            this.f291b = i2;
            this.f292c = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    /* renamed from: a */
    public int m424a() {
        return this.f291b;
    }

    /* renamed from: b */
    public int m426b() {
        return this.f292c;
    }

    /* renamed from: a */
    public void m425a(int i) {
        StringBuilder stringBuilder;
        if (i < this.f290a) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("pos: ");
            stringBuilder.append(i);
            stringBuilder.append(" < lowerBound: ");
            stringBuilder.append(this.f290a);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i <= this.f291b) {
            this.f292c = i;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("pos: ");
            stringBuilder.append(i);
            stringBuilder.append(" > upperBound: ");
            stringBuilder.append(this.f291b);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public boolean m427c() {
        return this.f292c >= this.f291b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(Integer.toString(this.f290a));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.f292c));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.f291b));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
