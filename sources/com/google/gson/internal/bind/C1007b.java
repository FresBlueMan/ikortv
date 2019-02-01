package com.google.gson.internal.bind;

import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateTypeAdapter */
/* renamed from: com.google.gson.internal.bind.b */
public final class C1007b extends C0487t<Date> {
    /* renamed from: a */
    public static final C0488u f1794a = new DateTypeAdapter$1();
    /* renamed from: b */
    private final DateFormat f1795b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    /* renamed from: c */
    private final DateFormat f1796c = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: b */
    public /* synthetic */ Object mo1260b(C0446a c0446a) {
        return m2045a(c0446a);
    }

    /* renamed from: a */
    public Date m2045a(C0446a c0446a) {
        if (c0446a.mo1277f() != C0447b.NULL) {
            return m2044a(c0446a.mo1279h());
        }
        c0446a.mo1281j();
        return null;
    }

    /* renamed from: a */
    private synchronized java.util.Date m2044a(java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/293907205.run(Unknown Source)
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f1796c;	 Catch:{ ParseException -> 0x000b }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x000b }
        monitor-exit(r2);
        return r0;
    L_0x0009:
        r3 = move-exception;
        goto L_0x0026;
    L_0x000b:
        r0 = r2.f1795b;	 Catch:{ ParseException -> 0x0013 }
        r0 = r0.parse(r3);	 Catch:{ ParseException -> 0x0013 }
        monitor-exit(r2);
        return r0;
    L_0x0013:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x001f }
        r1 = 0;	 Catch:{ ParseException -> 0x001f }
        r0.<init>(r1);	 Catch:{ ParseException -> 0x001f }
        r0 = com.google.gson.internal.bind.p041a.C0462a.m691a(r3, r0);	 Catch:{ ParseException -> 0x001f }
        monitor-exit(r2);
        return r0;
    L_0x001f:
        r0 = move-exception;
        r1 = new com.google.gson.r;	 Catch:{ all -> 0x0009 }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x0009 }
        throw r1;	 Catch:{ all -> 0x0009 }
    L_0x0026:
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.b.a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public synchronized void m2047a(C0448c c0448c, Date date) {
        if (date == null) {
            c0448c.mo1301f();
        } else {
            c0448c.mo1296b(this.f1795b.format(date));
        }
    }
}
