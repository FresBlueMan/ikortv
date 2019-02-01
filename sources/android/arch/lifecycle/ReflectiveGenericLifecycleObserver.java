package android.arch.lifecycle;

import android.arch.lifecycle.C0187b.C0185a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class ReflectiveGenericLifecycleObserver implements C0184a {
    /* renamed from: a */
    static final Map<Class, C0182a> f1699a = new HashMap();
    /* renamed from: b */
    private final Object f1700b;
    /* renamed from: c */
    private final C0182a f1701c = m1928a(this.f1700b.getClass());

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a */
    static class C0182a {
        /* renamed from: a */
        final Map<C0185a, List<C0183b>> f331a = new HashMap();
        /* renamed from: b */
        final Map<C0183b, C0185a> f332b;

        C0182a(Map<C0183b, C0185a> map) {
            this.f332b = map;
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                C0185a c0185a = (C0185a) entry.getValue();
                List list = (List) this.f331a.get(c0185a);
                if (list == null) {
                    list = new ArrayList();
                    this.f331a.put(c0185a, list);
                }
                list.add(entry.getKey());
            }
        }
    }

    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b */
    static class C0183b {
        /* renamed from: a */
        final int f333a;
        /* renamed from: b */
        final Method f334b;

        C0183b(int i, Method method) {
            this.f333a = i;
            this.f334b = method;
            this.f334b.setAccessible(true);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0183b c0183b = (C0183b) obj;
                    if (this.f333a != c0183b.f333a || this.f334b.getName().equals(c0183b.f334b.getName()) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f333a * 31) + this.f334b.getName().hashCode();
        }
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1700b = obj;
    }

    /* renamed from: a */
    public void mo163a(C0188c c0188c, C0185a c0185a) {
        m1929a(this.f1701c, c0188c, c0185a);
    }

    /* renamed from: a */
    private void m1931a(List<C0183b> list, C0188c c0188c, C0185a c0185a) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m1930a((C0183b) list.get(size), c0188c, c0185a);
            }
        }
    }

    /* renamed from: a */
    private void m1929a(C0182a c0182a, C0188c c0188c, C0185a c0185a) {
        m1931a((List) c0182a.f331a.get(c0185a), c0188c, c0185a);
        m1931a((List) c0182a.f331a.get(C0185a.ON_ANY), c0188c, c0185a);
    }

    /* renamed from: a */
    private void m1930a(C0183b c0183b, C0188c c0188c, C0185a c0185a) {
        try {
            switch (c0183b.f333a) {
                case 0:
                    c0183b.f334b.invoke(this.f1700b, new Object[0]);
                    return;
                case 1:
                    c0183b.f334b.invoke(this.f1700b, new Object[]{c0188c});
                    return;
                case 2:
                    c0183b.f334b.invoke(this.f1700b, new Object[]{c0188c, c0185a});
                    return;
                default:
                    return;
            }
        } catch (C0183b c0183b2) {
            throw new RuntimeException("Failed to call observer method", c0183b2.getCause());
        } catch (C0183b c0183b22) {
            throw new RuntimeException(c0183b22);
        }
    }

    /* renamed from: a */
    private static C0182a m1928a(Class cls) {
        C0182a c0182a = (C0182a) f1699a.get(cls);
        if (c0182a != null) {
            return c0182a;
        }
        return m1933b(cls);
    }

    /* renamed from: a */
    private static void m1932a(Map<C0183b, C0185a> map, C0183b c0183b, C0185a c0185a, Class cls) {
        C0185a c0185a2 = (C0185a) map.get(c0183b);
        if (c0185a2 != null) {
            if (c0185a != c0185a2) {
                map = c0183b.f334b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append(map.getName());
                stringBuilder.append(" in ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous");
                stringBuilder.append(" value ");
                stringBuilder.append(c0185a2);
                stringBuilder.append(", new value ");
                stringBuilder.append(c0185a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (c0185a2 == null) {
            map.put(c0183b, c0185a);
        }
    }

    /* renamed from: b */
    private static C0182a m1933b(Class cls) {
        C0182a a;
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            a = m1928a(superclass);
            if (a != null) {
                hashMap.putAll(a.f332b);
            }
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : m1928a(a2).f332b.entrySet()) {
                m1932a(hashMap, (C0183b) entry.getKey(), (C0185a) entry.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            C0191f c0191f = (C0191f) method.getAnnotation(C0191f.class);
            if (c0191f != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0188c.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0185a a3 = c0191f.m547a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0185a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a3 == C0185a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m1932a(hashMap, new C0183b(i, method), a3, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a = new C0182a(hashMap);
        f1699a.put(cls, a);
        return a;
    }
}
