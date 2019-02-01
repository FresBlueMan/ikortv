package p000a.p001a.p002a.p003a.p012d;

/* compiled from: MessageConstraints */
/* renamed from: a.a.a.a.d.b */
public class C0046b implements Cloneable {
    /* renamed from: a */
    public static final C0046b f102a = new C0045a().m141a();
    /* renamed from: b */
    private final int f103b;
    /* renamed from: c */
    private final int f104c;

    /* compiled from: MessageConstraints */
    /* renamed from: a.a.a.a.d.b$a */
    public static class C0045a {
        /* renamed from: a */
        private int f100a = -1;
        /* renamed from: b */
        private int f101b = -1;

        C0045a() {
        }

        /* renamed from: a */
        public C0045a m140a(int i) {
            this.f100a = i;
            return this;
        }

        /* renamed from: b */
        public C0045a m142b(int i) {
            this.f101b = i;
            return this;
        }

        /* renamed from: a */
        public C0046b m141a() {
            return new C0046b(this.f100a, this.f101b);
        }
    }

    protected /* synthetic */ Object clone() {
        return m146c();
    }

    C0046b(int i, int i2) {
        this.f103b = i;
        this.f104c = i2;
    }

    /* renamed from: a */
    public int m144a() {
        return this.f103b;
    }

    /* renamed from: b */
    public int m145b() {
        return this.f104c;
    }

    /* renamed from: c */
    protected C0046b m146c() {
        return (C0046b) super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[maxLineLength=");
        stringBuilder.append(this.f103b);
        stringBuilder.append(", maxHeaderCount=");
        stringBuilder.append(this.f104c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public static C0045a m143d() {
        return new C0045a();
    }
}
