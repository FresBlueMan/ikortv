package p000a.p001a.p002a.p003a.p022i.p024b;

import java.io.InputStream;
import java.io.OutputStream;
import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p020g.C0832f;

@Deprecated
/* compiled from: EntityEnclosingRequestWrapper */
/* renamed from: a.a.a.a.i.b.r */
public class C1345r extends C1325w implements C1285l {
    /* renamed from: a */
    private C0149k f2333a;
    /* renamed from: b */
    private boolean f2334b;

    /* compiled from: EntityEnclosingRequestWrapper */
    /* renamed from: a.a.a.a.i.b.r$a */
    class C1263a extends C0832f {
        /* renamed from: a */
        final /* synthetic */ C1345r f2169a;

        C1263a(C1345r c1345r, C0149k c0149k) {
            this.f2169a = c1345r;
            super(c0149k);
        }

        public void consumeContent() {
            this.f2169a.f2334b = true;
            super.consumeContent();
        }

        public InputStream getContent() {
            this.f2169a.f2334b = true;
            return super.getContent();
        }

        public void writeTo(OutputStream outputStream) {
            this.f2169a.f2334b = true;
            super.writeTo(outputStream);
        }
    }

    public C1345r(C1285l c1285l) {
        super(c1285l);
        m2867a(c1285l.getEntity());
    }

    public C0149k getEntity() {
        return this.f2333a;
    }

    /* renamed from: a */
    public void m2867a(C0149k c0149k) {
        this.f2333a = c0149k != null ? new C1263a(this, c0149k) : null;
        this.f2334b = null;
    }

    public boolean expectContinue() {
        C0082e firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.mo122d());
    }

    /* renamed from: a */
    public boolean mo2010a() {
        if (!(this.f2333a == null || this.f2333a.isRepeatable())) {
            if (this.f2334b) {
                return false;
            }
        }
        return true;
    }
}
