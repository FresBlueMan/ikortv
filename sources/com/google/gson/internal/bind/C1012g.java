package com.google.gson.internal.bind;

import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C1043r;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: TimeTypeAdapter */
/* renamed from: com.google.gson.internal.bind.g */
public final class C1012g extends C0487t<Time> {
    /* renamed from: a */
    public static final C0488u f1812a = new TimeTypeAdapter$1();
    /* renamed from: b */
    private final DateFormat f1813b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: b */
    public /* synthetic */ Object mo1260b(C0446a c0446a) {
        return m2090a(c0446a);
    }

    /* renamed from: a */
    public synchronized Time m2090a(C0446a c0446a) {
        if (c0446a.mo1277f() == C0447b.NULL) {
            c0446a.mo1281j();
            return null;
        }
        try {
            return new Time(this.f1813b.parse(c0446a.mo1279h()).getTime());
        } catch (Throwable e) {
            throw new C1043r(e);
        }
    }

    /* renamed from: a */
    public synchronized void m2092a(C0448c c0448c, Time time) {
        c0448c.mo1296b(time == null ? null : this.f1813b.format(time));
    }
}
