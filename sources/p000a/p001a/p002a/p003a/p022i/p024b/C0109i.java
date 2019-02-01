package p000a.p001a.p002a.p003a.p022i.p024b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p000a.p001a.p002a.p003a.C0916s;
import p000a.p001a.p002a.p003a.p005b.p007c.C1237c;
import p000a.p001a.p002a.p003a.p035o.C0165f;

/* compiled from: CloseableHttpResponseProxy */
/* renamed from: a.a.a.a.i.b.i */
class C0109i implements InvocationHandler {
    /* renamed from: a */
    private static final Constructor<?> f215a;
    /* renamed from: b */
    private final C0916s f216b;

    static {
        try {
            f215a = Proxy.getProxyClass(C0109i.class.getClassLoader(), new Class[]{C1237c.class}).getConstructor(new Class[]{InvocationHandler.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    C0109i(C0916s c0916s) {
        this.f216b = c0916s;
    }

    /* renamed from: a */
    public void m316a() {
        C0165f.m520a(this.f216b.mo1630b());
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals("close") != null) {
            m316a();
            return null;
        }
        try {
            return method.invoke(this.f216b, objArr);
        } catch (Object obj2) {
            method = obj2.getCause();
            if (method != null) {
                throw method;
            }
            throw obj2;
        }
    }

    /* renamed from: a */
    public static C1237c m315a(C0916s c0916s) {
        try {
            return (C1237c) f215a.newInstance(new Object[]{new C0109i(c0916s)});
        } catch (C0916s c0916s2) {
            throw new IllegalStateException(c0916s2);
        } catch (C0916s c0916s22) {
            throw new IllegalStateException(c0916s22);
        } catch (C0916s c0916s222) {
            throw new IllegalStateException(c0916s222);
        }
    }
}
