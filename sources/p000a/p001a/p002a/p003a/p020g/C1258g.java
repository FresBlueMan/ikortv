package p000a.p001a.p002a.p003a.p020g;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p000a.p001a.p002a.p003a.p035o.C0160a;

/* compiled from: StringEntity */
/* renamed from: a.a.a.a.g.g */
public class C1258g extends C0831a implements Cloneable {
    /* renamed from: d */
    protected final byte[] f2135d;

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public C1258g(java.lang.String r3, p000a.p001a.p002a.p003a.p020g.C0093e r4) {
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
        r2 = this;
        r2.<init>();
        r0 = "Source string";
        p000a.p001a.p002a.p003a.p035o.C0160a.m478a(r3, r0);
        if (r4 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r4.m254b();
        goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        r0 = p000a.p001a.p002a.p003a.p034n.C0156d.f301a;
    L_0x0014:
        r1 = r0.name();	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r3 = r3.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r2.f2135d = r3;	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        if (r4 == 0) goto L_0x0027;
    L_0x0020:
        r3 = r4.toString();
        r2.m1556a(r3);
    L_0x0027:
        return;
    L_0x0028:
        r3 = new java.nio.charset.UnsupportedCharsetException;
        r4 = r0.name();
        r3.<init>(r4);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.g.g.<init>(java.lang.String, a.a.a.a.g.e):void");
    }

    public C1258g(String str, Charset charset) {
        this(str, C0093e.m251a(C0093e.f149j.m253a(), charset));
    }

    public long getContentLength() {
        return (long) this.f2135d.length;
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.f2135d);
    }

    public void writeTo(OutputStream outputStream) {
        C0160a.m478a((Object) outputStream, "Output stream");
        outputStream.write(this.f2135d);
        outputStream.flush();
    }

    public Object clone() {
        return super.clone();
    }
}
