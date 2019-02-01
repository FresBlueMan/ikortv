package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0448c;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements C0488u {
    TypeAdapters$26() {
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        if (c0444a.m572a() != Timestamp.class) {
            return null;
        }
        c0451e = c0451e.m649a(Date.class);
        return new C0487t<Timestamp>(this) {
            /* renamed from: b */
            final /* synthetic */ TypeAdapters$26 f1776b;

            /* renamed from: b */
            public /* synthetic */ Object mo1260b(C0446a c0446a) {
                return m2029a(c0446a);
            }

            /* renamed from: a */
            public Timestamp m2029a(C0446a c0446a) {
                Date date = (Date) c0451e.mo1260b(c0446a);
                return date != null ? new Timestamp(date.getTime()) : null;
            }

            /* renamed from: a */
            public void m2031a(C0448c c0448c, Timestamp timestamp) {
                c0451e.mo1259a(c0448c, timestamp);
            }
        };
    }
}
