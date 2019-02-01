package android.arch.lifecycle;

import android.arch.lifecycle.C0187b.C0185a;
import android.arch.lifecycle.C0187b.C0186b;
import android.arch.p036a.p037a.C0918a;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: LifecycleRegistry */
/* renamed from: android.arch.lifecycle.d */
public class C0921d extends C0187b {
    /* renamed from: a */
    private C0918a<Object, C0190a> f1702a = new C0918a();
    /* renamed from: b */
    private C0186b f1703b;
    /* renamed from: c */
    private final C0188c f1704c;
    /* renamed from: d */
    private int f1705d = 0;
    /* renamed from: e */
    private boolean f1706e = false;
    /* renamed from: f */
    private boolean f1707f = false;
    /* renamed from: g */
    private ArrayList<C0186b> f1708g = new ArrayList();

    /* compiled from: LifecycleRegistry */
    /* renamed from: android.arch.lifecycle.d$a */
    static class C0190a {
        /* renamed from: a */
        C0186b f343a;
        /* renamed from: b */
        C0184a f344b;

        /* renamed from: a */
        void m546a(C0188c c0188c, C0185a c0185a) {
            C0186b b = C0921d.m1937b(c0185a);
            this.f343a = C0921d.m1935a(this.f343a, b);
            this.f344b.mo163a(c0188c, c0185a);
            this.f343a = b;
        }
    }

    public C0921d(@NonNull C0188c c0188c) {
        this.f1704c = c0188c;
        this.f1703b = C0186b.INITIALIZED;
    }

    /* renamed from: a */
    public void m1946a(C0186b c0186b) {
        this.f1703b = c0186b;
    }

    /* renamed from: a */
    public void m1945a(C0185a c0185a) {
        this.f1703b = C0921d.m1937b(c0185a);
        if (this.f1706e == null) {
            if (this.f1705d == null) {
                this.f1706e = true;
                m1944e();
                this.f1706e = null;
                return;
            }
        }
        this.f1707f = true;
    }

    /* renamed from: a */
    private boolean m1936a() {
        boolean z = true;
        if (this.f1702a.m540a() == 0) {
            return true;
        }
        C0186b c0186b = ((C0190a) this.f1702a.m543d().getValue()).f343a;
        C0186b c0186b2 = ((C0190a) this.f1702a.m544e().getValue()).f343a;
        if (c0186b != c0186b2 || this.f1703b != c0186b2) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m1938b() {
        this.f1708g.remove(this.f1708g.size() - 1);
    }

    /* renamed from: b */
    private void m1939b(C0186b c0186b) {
        this.f1708g.add(c0186b);
    }

    /* renamed from: b */
    static C0186b m1937b(C0185a c0185a) {
        switch (c0185a) {
            case ON_CREATE:
            case ON_STOP:
                return C0186b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0186b.STARTED;
            case ON_RESUME:
                return C0186b.RESUMED;
            case ON_DESTROY:
                return C0186b.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(c0185a);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private static C0185a m1940c(C0186b c0186b) {
        switch (c0186b) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0185a.ON_DESTROY;
            case STARTED:
                return C0185a.ON_STOP;
            case RESUMED:
                return C0185a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0186b);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private static C0185a m1942d(C0186b c0186b) {
        switch (c0186b) {
            case INITIALIZED:
            case DESTROYED:
                return C0185a.ON_CREATE;
            case CREATED:
                return C0185a.ON_START;
            case STARTED:
                return C0185a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0186b);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private void m1941c() {
        Iterator c = this.f1702a.m542c();
        while (c.hasNext() && !this.f1707f) {
            Entry entry = (Entry) c.next();
            C0190a c0190a = (C0190a) entry.getValue();
            while (c0190a.f343a.compareTo(this.f1703b) < 0 && !this.f1707f && this.f1702a.m1925a(entry.getKey())) {
                m1939b(c0190a.f343a);
                c0190a.m546a(this.f1704c, C0921d.m1942d(c0190a.f343a));
                m1938b();
            }
        }
    }

    /* renamed from: d */
    private void m1943d() {
        Iterator b = this.f1702a.m541b();
        while (b.hasNext() && !this.f1707f) {
            Entry entry = (Entry) b.next();
            C0190a c0190a = (C0190a) entry.getValue();
            while (c0190a.f343a.compareTo(this.f1703b) > 0 && !this.f1707f && this.f1702a.m1925a(entry.getKey())) {
                C0185a c = C0921d.m1940c(c0190a.f343a);
                m1939b(C0921d.m1937b(c));
                c0190a.m546a(this.f1704c, c);
                m1938b();
            }
        }
    }

    /* renamed from: e */
    private void m1944e() {
        while (!m1936a()) {
            this.f1707f = false;
            if (this.f1703b.compareTo(((C0190a) this.f1702a.m543d().getValue()).f343a) < 0) {
                m1943d();
            }
            Entry e = this.f1702a.m544e();
            if (!(this.f1707f || e == null || this.f1703b.compareTo(((C0190a) e.getValue()).f343a) <= 0)) {
                m1941c();
            }
        }
        this.f1707f = false;
    }

    /* renamed from: a */
    static C0186b m1935a(@NonNull C0186b c0186b, @Nullable C0186b c0186b2) {
        return (c0186b2 == null || c0186b2.compareTo(c0186b) >= 0) ? c0186b : c0186b2;
    }
}
