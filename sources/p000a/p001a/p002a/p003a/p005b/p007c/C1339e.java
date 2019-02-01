package p000a.p001a.p002a.p003a.p005b.p007c;

import p000a.p001a.p002a.p003a.C0082e;
import p000a.p001a.p002a.p003a.C0149k;
import p000a.p001a.p002a.p003a.C1285l;
import p000a.p001a.p002a.p003a.p005b.p010f.C0024a;

/* compiled from: HttpEntityEnclosingRequestBase */
/* renamed from: a.a.a.a.b.c.e */
public abstract class C1339e extends C1317k implements C1285l {
    private C0149k entity;

    public C0149k getEntity() {
        return this.entity;
    }

    public void setEntity(C0149k c0149k) {
        this.entity = c0149k;
    }

    public boolean expectContinue() {
        C0082e firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.mo122d());
    }

    public Object clone() {
        C1339e c1339e = (C1339e) super.clone();
        if (this.entity != null) {
            c1339e.entity = (C0149k) C0024a.m84a(this.entity);
        }
        return c1339e;
    }
}
