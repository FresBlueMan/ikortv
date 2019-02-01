package com.google.gson;

import com.google.gson.internal.C0480i;
import com.google.gson.p040c.C0448c;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: JsonElement */
/* renamed from: com.google.gson.j */
public abstract class C0482j {
    /* renamed from: g */
    public boolean m732g() {
        return this instanceof C0997g;
    }

    /* renamed from: h */
    public boolean m733h() {
        return this instanceof C1041m;
    }

    /* renamed from: i */
    public boolean m734i() {
        return this instanceof C1042o;
    }

    /* renamed from: j */
    public boolean m735j() {
        return this instanceof C1040l;
    }

    /* renamed from: k */
    public C1041m m736k() {
        if (m733h()) {
            return (C1041m) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: l */
    public C0997g m737l() {
        if (m732g()) {
            return (C0997g) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: m */
    public C1042o m738m() {
        if (m734i()) {
            return (C1042o) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: f */
    public boolean mo1266f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: n */
    Boolean mo1305n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: a */
    public Number mo1261a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo1262b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public double mo1263c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public long mo1264d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public int mo1265e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            C0448c c0448c = new C0448c(stringWriter);
            c0448c.m626b(true);
            C0480i.m722a(this, c0448c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
