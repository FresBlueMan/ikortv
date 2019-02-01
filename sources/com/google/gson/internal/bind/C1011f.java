package com.google.gson.internal.bind;

import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C1043r;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter */
/* renamed from: com.google.gson.internal.bind.f */
public final class C1011f extends C0487t<Date> {
    /* renamed from: a */
    public static final C0488u f1810a = new SqlDateTypeAdapter$1();
    /* renamed from: b */
    private final DateFormat f1811b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: b */
    public /* synthetic */ Object mo1260b(C0446a c0446a) {
        return m2086a(c0446a);
    }

    /* renamed from: a */
    public synchronized Date m2086a(C0446a c0446a) {
        if (c0446a.mo1277f() == C0447b.NULL) {
            c0446a.mo1281j();
            return null;
        }
        try {
            return new Date(this.f1811b.parse(c0446a.mo1279h()).getTime());
        } catch (Throwable e) {
            throw new C1043r(e);
        }
    }

    /* renamed from: a */
    public synchronized void m2088a(C0448c c0448c, Date date) {
        c0448c.mo1296b(date == null ? null : this.f1811b.format(date));
    }
}
