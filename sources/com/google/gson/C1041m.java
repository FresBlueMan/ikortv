package com.google.gson;

import com.google.gson.internal.C0475f;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: JsonObject */
/* renamed from: com.google.gson.m */
public final class C1041m extends C0482j {
    /* renamed from: a */
    private final C0475f<String, C0482j> f1850a = new C0475f();

    /* renamed from: a */
    public void m2232a(String str, C0482j c0482j) {
        if (c0482j == null) {
            c0482j = C1040l.f1849a;
        }
        this.f1850a.put(str, c0482j);
    }

    /* renamed from: o */
    public Set<Entry<String, C0482j>> m2233o() {
        return this.f1850a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C1041m) || ((C1041m) obj).f1850a.equals(this.f1850a) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f1850a.hashCode();
    }
}
