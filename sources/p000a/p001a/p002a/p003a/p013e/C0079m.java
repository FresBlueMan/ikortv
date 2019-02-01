package p000a.p001a.p002a.p003a.p013e;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: HttpInetSocketAddress */
/* renamed from: a.a.a.a.e.m */
public class C0079m extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    /* renamed from: a */
    private final C0159n f135a;

    public C0079m(C0159n c0159n, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        C0160a.m478a((Object) c0159n, "HTTP host");
        this.f135a = c0159n;
    }

    /* renamed from: a */
    public C0159n m209a() {
        return this.f135a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f135a.m470a());
        stringBuilder.append(":");
        stringBuilder.append(getPort());
        return stringBuilder.toString();
    }
}
