package com.google.gson;

import com.google.gson.internal.C0455a;
import com.google.gson.internal.C0469e;
import java.math.BigInteger;

/* compiled from: JsonPrimitive */
/* renamed from: com.google.gson.o */
public final class C1042o extends C0482j {
    /* renamed from: a */
    private static final Class<?>[] f1851a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    /* renamed from: b */
    private Object f1852b;

    public C1042o(Boolean bool) {
        m2237a((Object) bool);
    }

    public C1042o(Number number) {
        m2237a((Object) number);
    }

    public C1042o(String str) {
        m2237a((Object) str);
    }

    /* renamed from: a */
    void m2237a(Object obj) {
        if (obj instanceof Character) {
            this.f1852b = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z;
        if (!(obj instanceof Number)) {
            if (!C1042o.m2235b(obj)) {
                z = false;
                C0455a.m664a(z);
                this.f1852b = obj;
            }
        }
        z = true;
        C0455a.m664a(z);
        this.f1852b = obj;
    }

    /* renamed from: o */
    public boolean m2244o() {
        return this.f1852b instanceof Boolean;
    }

    /* renamed from: n */
    Boolean mo1305n() {
        return (Boolean) this.f1852b;
    }

    /* renamed from: f */
    public boolean mo1266f() {
        if (m2244o()) {
            return mo1305n().booleanValue();
        }
        return Boolean.parseBoolean(mo1262b());
    }

    /* renamed from: p */
    public boolean m2245p() {
        return this.f1852b instanceof Number;
    }

    /* renamed from: a */
    public Number mo1261a() {
        return this.f1852b instanceof String ? new C0469e((String) this.f1852b) : (Number) this.f1852b;
    }

    /* renamed from: q */
    public boolean m2246q() {
        return this.f1852b instanceof String;
    }

    /* renamed from: b */
    public String mo1262b() {
        if (m2245p()) {
            return mo1261a().toString();
        }
        if (m2244o()) {
            return mo1305n().toString();
        }
        return (String) this.f1852b;
    }

    /* renamed from: c */
    public double mo1263c() {
        return m2245p() ? mo1261a().doubleValue() : Double.parseDouble(mo1262b());
    }

    /* renamed from: d */
    public long mo1264d() {
        return m2245p() ? mo1261a().longValue() : Long.parseLong(mo1262b());
    }

    /* renamed from: e */
    public int mo1265e() {
        return m2245p() ? mo1261a().intValue() : Integer.parseInt(mo1262b());
    }

    /* renamed from: b */
    private static boolean m2235b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        obj = obj.getClass();
        for (Class isAssignableFrom : f1851a) {
            if (isAssignableFrom.isAssignableFrom(obj)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f1852b == null) {
            return 31;
        }
        long longValue;
        if (C1042o.m2234a(this)) {
            longValue = mo1261a().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.f1852b instanceof Number)) {
            return this.f1852b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(mo1261a().doubleValue());
            return (int) ((longValue >>> 32) ^ longValue);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C1042o c1042o = (C1042o) obj;
                if (this.f1852b == null) {
                    if (c1042o.f1852b != null) {
                        z = false;
                    }
                    return z;
                } else if (C1042o.m2234a(this) && C1042o.m2234a(c1042o)) {
                    if (mo1261a().longValue() != c1042o.mo1261a().longValue()) {
                        z = false;
                    }
                    return z;
                } else if (!(this.f1852b instanceof Number) || !(c1042o.f1852b instanceof Number)) {
                    return this.f1852b.equals(c1042o.f1852b);
                } else {
                    double doubleValue = mo1261a().doubleValue();
                    double doubleValue2 = c1042o.mo1261a().doubleValue();
                    if (doubleValue != doubleValue2) {
                        if (Double.isNaN(doubleValue) == null || Double.isNaN(doubleValue2) == null) {
                            z = false;
                        }
                    }
                    return z;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2234a(C1042o c1042o) {
        boolean z = false;
        if (!(c1042o.f1852b instanceof Number)) {
            return false;
        }
        Number number = (Number) c1042o.f1852b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte) != null) {
            z = true;
        }
        return z;
    }
}
