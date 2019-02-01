package com.loopj.android.http;

import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.C0170r;
import p000a.p001a.p002a.p003a.C0915q;
import p000a.p001a.p002a.p003a.p004a.C0005g;
import p000a.p001a.p002a.p003a.p004a.C0006h;
import p000a.p001a.p002a.p003a.p004a.C0009m;
import p000a.p001a.p002a.p003a.p005b.C0034i;
import p000a.p001a.p002a.p003a.p022i.p023a.C1343b;
import p000a.p001a.p002a.p003a.p034n.C0157e;

public class PreemptiveAuthorizationHttpRequestInterceptor implements C0170r {
    public void process(C0915q c0915q, C0157e c0157e) {
        C0006h c0006h = (C0006h) c0157e.mo159a("http.auth.target-scope");
        C0034i c0034i = (C0034i) c0157e.mo159a("http.auth.credentials-provider");
        C0159n c0159n = (C0159n) c0157e.mo159a("http.target_host");
        if (c0006h.m18c() == null) {
            C0009m a = c0034i.mo50a(new C0005g(c0159n.m470a(), c0159n.m471b()));
            if (a != null) {
                c0006h.m13a(new C1343b());
                c0006h.m15a(a);
            }
        }
    }
}
