package p000a.p001a.p002a.p003a.p005b.p010f;

import java.net.URI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import p000a.p001a.p002a.p003a.C0159n;
import p000a.p001a.p002a.p003a.p035o.C0160a;
import p000a.p001a.p002a.p003a.p035o.C0167h;

/* compiled from: URIUtils */
/* renamed from: a.a.a.a.b.f.d */
public class C0029d {
    /* renamed from: a */
    public static URI m109a(URI uri, C0159n c0159n, boolean z) {
        C0160a.m478a((Object) uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        C0028c c0028c = new C0028c(uri);
        if (c0159n != null) {
            c0028c.m98a(c0159n.m472c());
            c0028c.m103c(c0159n.m470a());
            c0028c.m97a(c0159n.m471b());
        } else {
            c0028c.m98a(null);
            c0028c.m103c(null);
            c0028c.m97a(-1);
        }
        if (z) {
            c0028c.m107e(null);
        }
        if (C0167h.m527a(c0028c.m106d()) != null) {
            c0028c.m105d("/");
        }
        return c0028c.m100a();
    }

    /* renamed from: a */
    public static URI m108a(URI uri) {
        C0160a.m478a((Object) uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        C0028c c0028c = new C0028c(uri);
        if (c0028c.m102b() != null) {
            c0028c.m101b(null);
        }
        if (C0167h.m527a(c0028c.m106d()) != null) {
            c0028c.m105d("/");
        }
        if (c0028c.m104c() != null) {
            c0028c.m103c(c0028c.m104c().toLowerCase(Locale.ENGLISH));
        }
        c0028c.m107e(null);
        return c0028c.m100a();
    }

    /* renamed from: a */
    public static URI m110a(URI uri, URI uri2) {
        C0160a.m478a((Object) uri, "Base URI");
        C0160a.m478a((Object) uri2, "Reference URI");
        String uri3 = uri2.toString();
        if (uri3.startsWith("?")) {
            return C0029d.m112b(uri, uri2);
        }
        Object obj = uri3.length() == 0 ? 1 : null;
        if (obj != null) {
            uri2 = URI.create("#");
        }
        uri = uri.resolve(uri2);
        if (obj != null) {
            uri = uri.toString();
            uri = URI.create(uri.substring(0, uri.indexOf(35)));
        }
        return C0029d.m113c(uri);
    }

    /* renamed from: b */
    private static URI m112b(URI uri, URI uri2) {
        uri = uri.toString();
        if (uri.indexOf(63) > -1) {
            uri = uri.substring(0, uri.indexOf(63));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append(uri2.toString());
        return URI.create(stringBuilder.toString());
    }

    /* renamed from: c */
    private static URI m113c(URI uri) {
        if (!uri.isOpaque()) {
            if (uri.getAuthority() != null) {
                C0160a.m480a(uri.isAbsolute(), "Base URI must be absolute");
                String path = uri.getPath() == null ? "" : uri.getPath();
                String[] split = path.split("/");
                Stack stack = new Stack();
                for (String str : split) {
                    if (str.length() != 0) {
                        if (!".".equals(str)) {
                            if (!"..".equals(str)) {
                                stack.push(str);
                            } else if (!stack.isEmpty()) {
                                stack.pop();
                            }
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                Iterator it = stack.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    stringBuilder.append('/');
                    stringBuilder.append(str2);
                }
                if (path.lastIndexOf(47) == path.length() - 1) {
                    stringBuilder.append('/');
                }
                try {
                    URI uri2 = new URI(uri.getScheme().toLowerCase(Locale.ENGLISH), uri.getAuthority().toLowerCase(Locale.ENGLISH), stringBuilder.toString(), null, null);
                    if (uri.getQuery() == null && uri.getFragment() == null) {
                        return uri2;
                    }
                    stringBuilder = new StringBuilder(uri2.toASCIIString());
                    if (uri.getQuery() != null) {
                        stringBuilder.append('?');
                        stringBuilder.append(uri.getRawQuery());
                    }
                    if (uri.getFragment() != null) {
                        stringBuilder.append('#');
                        stringBuilder.append(uri.getRawFragment());
                    }
                    return URI.create(stringBuilder.toString());
                } catch (URI uri3) {
                    throw new IllegalArgumentException(uri3);
                }
            }
        }
        return uri3;
    }

    /* renamed from: b */
    public static p000a.p001a.p002a.p003a.C0159n m111b(java.net.URI r9) {
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
        r0 = 0;
        if (r9 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r9.isAbsolute();
        if (r1 == 0) goto L_0x0073;
    L_0x000a:
        r1 = r9.getPort();
        r2 = r9.getHost();
        if (r2 != 0) goto L_0x0064;
    L_0x0014:
        r2 = r9.getAuthority();
        if (r2 == 0) goto L_0x0064;
    L_0x001a:
        r3 = 64;
        r3 = r2.indexOf(r3);
        if (r3 < 0) goto L_0x0030;
    L_0x0022:
        r4 = r2.length();
        r3 = r3 + 1;
        if (r4 <= r3) goto L_0x002f;
    L_0x002a:
        r2 = r2.substring(r3);
        goto L_0x0030;
    L_0x002f:
        r2 = r0;
    L_0x0030:
        if (r2 == 0) goto L_0x0064;
    L_0x0032:
        r3 = 58;
        r3 = r2.indexOf(r3);
        if (r3 < 0) goto L_0x0064;
    L_0x003a:
        r4 = r3 + 1;
        r5 = 0;
        r6 = r4;
        r7 = 0;
    L_0x003f:
        r8 = r2.length();
        if (r6 >= r8) goto L_0x0054;
    L_0x0045:
        r8 = r2.charAt(r6);
        r8 = java.lang.Character.isDigit(r8);
        if (r8 == 0) goto L_0x0054;
    L_0x004f:
        r7 = r7 + 1;
        r6 = r6 + 1;
        goto L_0x003f;
    L_0x0054:
        if (r7 <= 0) goto L_0x0060;
    L_0x0056:
        r7 = r7 + r4;
        r4 = r2.substring(r4, r7);	 Catch:{ NumberFormatException -> 0x0060 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0060 }
        r1 = r4;
    L_0x0060:
        r2 = r2.substring(r5, r3);
    L_0x0064:
        r9 = r9.getScheme();
        r3 = p000a.p001a.p002a.p003a.p035o.C0167h.m528b(r2);
        if (r3 != 0) goto L_0x0073;
    L_0x006e:
        r0 = new a.a.a.a.n;
        r0.<init>(r2, r1, r9);
    L_0x0073:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.b.f.d.b(java.net.URI):a.a.a.a.n");
    }
}
