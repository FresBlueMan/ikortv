package com.google.gson.internal;

import com.google.gson.C0452f;
import com.google.gson.C1039k;
import com.google.gson.p039b.C0444a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor */
/* renamed from: com.google.gson.internal.c */
public final class C0467c {
    /* renamed from: a */
    private final Map<Type, C0452f<?>> f477a;

    /* compiled from: ConstructorConstructor */
    /* renamed from: com.google.gson.internal.c$2 */
    class C10252 implements C0476g<T> {
        /* renamed from: a */
        final /* synthetic */ C0467c f1828a;

        C10252(C0467c c0467c) {
            this.f1828a = c0467c;
        }

        /* renamed from: a */
        public T mo1303a() {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: com.google.gson.internal.c$3 */
    class C10263 implements C0476g<T> {
        /* renamed from: a */
        final /* synthetic */ C0467c f1829a;

        C10263(C0467c c0467c) {
            this.f1829a = c0467c;
        }

        /* renamed from: a */
        public T mo1303a() {
            return new TreeMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: com.google.gson.internal.c$4 */
    class C10274 implements C0476g<T> {
        /* renamed from: a */
        final /* synthetic */ C0467c f1830a;

        C10274(C0467c c0467c) {
            this.f1830a = c0467c;
        }

        /* renamed from: a */
        public T mo1303a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: com.google.gson.internal.c$5 */
    class C10285 implements C0476g<T> {
        /* renamed from: a */
        final /* synthetic */ C0467c f1831a;

        C10285(C0467c c0467c) {
            this.f1831a = c0467c;
        }

        /* renamed from: a */
        public T mo1303a() {
            return new C0475f();
        }
    }

    /* compiled from: ConstructorConstructor */
    /* renamed from: com.google.gson.internal.c$9 */
    class C10329 implements C0476g<T> {
        /* renamed from: a */
        final /* synthetic */ C0467c f1841a;

        C10329(C0467c c0467c) {
            this.f1841a = c0467c;
        }

        /* renamed from: a */
        public T mo1303a() {
            return new TreeSet();
        }
    }

    public C0467c(Map<Type, C0452f<?>> map) {
        this.f477a = map;
    }

    /* renamed from: a */
    public <T> C0476g<T> m700a(C0444a<T> c0444a) {
        final Type b = c0444a.m573b();
        Class a = c0444a.m572a();
        final C0452f c0452f = (C0452f) this.f477a.get(b);
        if (c0452f != null) {
            return new C0476g<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C0467c f1827c;

                /* renamed from: a */
                public T mo1303a() {
                    return c0452f.m661a(b);
                }
            };
        }
        c0452f = (C0452f) this.f477a.get(a);
        if (c0452f != null) {
            return new C0476g<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C0467c f1838c;

                /* renamed from: a */
                public T mo1303a() {
                    return c0452f.m661a(b);
                }
            };
        }
        C0476g<T> a2 = m697a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = m698a(b, a);
        if (a2 != null) {
            return a2;
        }
        return m699b(b, a);
    }

    /* renamed from: a */
    private <T> com.google.gson.internal.C0476g<T> m697a(java.lang.Class<? super T> r2) {
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
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2 = r2.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0 = r2.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0017 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x000d:
        r0 = 1;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2.setAccessible(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x0011:
        r0 = new com.google.gson.internal.c$8;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0.<init>(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0017 }
        return r0;
    L_0x0017:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c.a(java.lang.Class):com.google.gson.internal.g<T>");
    }

    /* renamed from: a */
    private <T> C0476g<T> m698a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C10329(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C0476g<T>(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0467c f1820b;

                    /* renamed from: a */
                    public T mo1303a() {
                        if (type instanceof ParameterizedType) {
                            Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type instanceof Class) {
                                return EnumSet.noneOf((Class) type);
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid EnumSet type: ");
                            stringBuilder.append(type.toString());
                            throw new C1039k(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid EnumSet type: ");
                        stringBuilder.append(type.toString());
                        throw new C1039k(stringBuilder.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls) != null) {
                return new C0476g<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C0467c f1821a;

                    {
                        this.f1821a = r1;
                    }

                    /* renamed from: a */
                    public T mo1303a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls) != null) {
                return new C0476g<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C0467c f1822a;

                    {
                        this.f1822a = r1;
                    }

                    /* renamed from: a */
                    public T mo1303a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new C0476g<T>(this) {
                /* renamed from: a */
                final /* synthetic */ C0467c f1823a;

                {
                    this.f1823a = r1;
                }

                /* renamed from: a */
                public T mo1303a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C0476g<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C0467c f1824a;

                    {
                        this.f1824a = r1;
                    }

                    /* renamed from: a */
                    public T mo1303a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C10252(this);
            }
            if (SortedMap.class.isAssignableFrom(cls) != null) {
                return new C10263(this);
            }
            if ((type instanceof ParameterizedType) == null || String.class.isAssignableFrom(C0444a.m569a(((ParameterizedType) type).getActualTypeArguments()[0]).m572a()) != null) {
                return new C10285(this);
            }
            return new C10274(this);
        }
    }

    /* renamed from: b */
    private <T> C0476g<T> m699b(final Type type, final Class<? super T> cls) {
        return new C0476g<T>(this) {
            /* renamed from: c */
            final /* synthetic */ C0467c f1834c;
            /* renamed from: d */
            private final C0481j f1835d = C0481j.m723a();

            /* renamed from: a */
            public T mo1303a() {
                try {
                    return this.f1835d.mo1304a(cls);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to invoke no-args constructor for ");
                    stringBuilder.append(type);
                    stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        };
    }

    public String toString() {
        return this.f477a.toString();
    }
}
