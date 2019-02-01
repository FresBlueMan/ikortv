package com.google.gson.internal.bind;

import com.google.gson.C0450d;
import com.google.gson.C0451e;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.C1043r;
import com.google.gson.internal.C0459b;
import com.google.gson.internal.C0467c;
import com.google.gson.internal.C0476g;
import com.google.gson.internal.C0477h;
import com.google.gson.internal.Excluder;
import com.google.gson.p038a.C0439b;
import com.google.gson.p038a.C0440c;
import com.google.gson.p039b.C0444a;
import com.google.gson.p040c.C0446a;
import com.google.gson.p040c.C0447b;
import com.google.gson.p040c.C0448c;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C0488u {
    /* renamed from: a */
    private final C0467c f1758a;
    /* renamed from: b */
    private final C0450d f1759b;
    /* renamed from: c */
    private final Excluder f1760c;
    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f1761d;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C0460b {
        /* renamed from: h */
        final String f419h;
        /* renamed from: i */
        final boolean f420i;
        /* renamed from: j */
        final boolean f421j;

        /* renamed from: a */
        abstract void mo1268a(C0446a c0446a, Object obj);

        /* renamed from: a */
        abstract void mo1269a(C0448c c0448c, Object obj);

        /* renamed from: a */
        abstract boolean mo1270a(Object obj);

        protected C0460b(String str, boolean z, boolean z2) {
            this.f419h = str;
            this.f420i = z;
            this.f421j = z2;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C1002a<T> extends C0487t<T> {
        /* renamed from: a */
        private final C0476g<T> f1756a;
        /* renamed from: b */
        private final Map<String, C0460b> f1757b;

        C1002a(C0476g<T> c0476g, Map<String, C0460b> map) {
            this.f1756a = c0476g;
            this.f1757b = map;
        }

        /* renamed from: b */
        public T mo1260b(C0446a c0446a) {
            if (c0446a.mo1277f() == C0447b.NULL) {
                c0446a.mo1281j();
                return null;
            }
            Object a = this.f1756a.mo1303a();
            try {
                c0446a.mo1273c();
                while (c0446a.mo1276e()) {
                    C0460b c0460b = (C0460b) this.f1757b.get(c0446a.mo1278g());
                    if (c0460b != null) {
                        if (c0460b.f421j) {
                            c0460b.mo1268a(c0446a, a);
                        }
                    }
                    c0446a.mo1285n();
                }
                c0446a.mo1275d();
                return a;
            } catch (Throwable e) {
                throw new C1043r(e);
            } catch (C0446a c0446a2) {
                throw new AssertionError(c0446a2);
            }
        }

        /* renamed from: a */
        public void mo1259a(C0448c c0448c, T t) {
            if (t == null) {
                c0448c.mo1301f();
                return;
            }
            c0448c.mo1299d();
            try {
                for (C0460b c0460b : this.f1757b.values()) {
                    if (c0460b.mo1270a(t)) {
                        c0448c.mo1292a(c0460b.f419h);
                        c0460b.mo1269a(c0448c, (Object) t);
                    }
                }
                c0448c.mo1300e();
            } catch (C0448c c0448c2) {
                throw new AssertionError(c0448c2);
            }
        }
    }

    public ReflectiveTypeAdapterFactory(C0467c c0467c, C0450d c0450d, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f1758a = c0467c;
        this.f1759b = c0450d;
        this.f1760c = excluder;
        this.f1761d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    public boolean m2022a(Field field, boolean z) {
        return m2020a(field, z, this.f1760c);
    }

    /* renamed from: a */
    static boolean m2020a(Field field, boolean z, Excluder excluder) {
        return (excluder.m1993a(field.getType(), z) || excluder.m1994a(field, z) != null) ? null : true;
    }

    /* renamed from: a */
    private List<String> m2018a(Field field) {
        C0440c c0440c = (C0440c) field.getAnnotation(C0440c.class);
        if (c0440c == null) {
            return Collections.singletonList(this.f1759b.mo1853a(field));
        }
        field = c0440c.m563a();
        String[] b = c0440c.m564b();
        if (b.length == 0) {
            return Collections.singletonList(field);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(field);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        Class a = c0444a.m572a();
        if (Object.class.isAssignableFrom(a)) {
            return new C1002a(this.f1758a.m700a((C0444a) c0444a), m2019a(c0451e, (C0444a) c0444a, a));
        }
        return null;
    }

    /* renamed from: a */
    private C0460b m2017a(C0451e c0451e, Field field, String str, C0444a<?> c0444a, boolean z, boolean z2) {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        C0451e c0451e2 = c0451e;
        C0444a c0444a2 = c0444a;
        final boolean a = C0477h.m719a(c0444a.m572a());
        Field field2 = field;
        C0439b c0439b = (C0439b) field.getAnnotation(C0439b.class);
        C0487t a2 = c0439b != null ? reflectiveTypeAdapterFactory.f1761d.m2003a(reflectiveTypeAdapterFactory.f1758a, c0451e, c0444a2, c0439b) : null;
        final boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = c0451e.m647a(c0444a2);
        }
        final C0487t c0487t = a2;
        field2 = field;
        c0451e2 = c0451e;
        final C0444a<?> c0444a3 = c0444a;
        return new C0460b(this, str, z, z2) {
            /* renamed from: g */
            final /* synthetic */ ReflectiveTypeAdapterFactory f1755g;

            /* renamed from: a */
            void mo1269a(C0448c c0448c, Object obj) {
                C0487t c0487t;
                obj = field2.get(obj);
                if (z3) {
                    c0487t = c0487t;
                } else {
                    c0487t = new C1013h(c0451e2, c0487t, c0444a3.m573b());
                }
                c0487t.mo1259a(c0448c, obj);
            }

            /* renamed from: a */
            void mo1268a(C0446a c0446a, Object obj) {
                c0446a = c0487t.mo1260b(c0446a);
                if (c0446a != null || !a) {
                    field2.set(obj, c0446a);
                }
            }

            /* renamed from: a */
            public boolean mo1270a(Object obj) {
                boolean z = false;
                if (!this.i) {
                    return false;
                }
                if (field2.get(obj) != obj) {
                    z = true;
                }
                return z;
            }
        };
    }

    /* renamed from: a */
    private Map<String, C0460b> m2019a(C0451e c0451e, C0444a<?> c0444a, Class<?> cls) {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Map<String, C0460b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = c0444a.m573b();
        C0444a c0444a2 = c0444a;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = m2022a(field, true);
                boolean a2 = m2022a(field, z);
                if (a || a2) {
                    C0460b c0460b;
                    field.setAccessible(true);
                    Type a3 = C0459b.m672a(c0444a2.m573b(), cls2, field.getGenericType());
                    List a4 = m2018a(field);
                    int size = a4.size();
                    C0460b c0460b2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        c0460b = c0460b2;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        c0460b2 = c0460b == null ? (C0460b) linkedHashMap.put(str2, m2017a(c0451e, field, str2, C0444a.m569a(a3), z2, a2)) : c0460b;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    c0460b = c0460b2;
                    if (c0460b != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(" declares multiple JSON fields named ");
                        stringBuilder.append(c0460b.f419h);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
                z = false;
            }
            c0444a2 = C0444a.m569a(C0459b.m672a(c0444a2.m573b(), cls2, cls2.getGenericSuperclass()));
            cls2 = c0444a2.m572a();
        }
        return linkedHashMap;
    }
}
