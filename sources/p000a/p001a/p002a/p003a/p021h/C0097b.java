package p000a.p001a.p002a.p003a.p021h;

import android.util.Log;

/* compiled from: HttpClientAndroidLog */
/* renamed from: a.a.a.a.h.b */
public class C0097b {
    /* renamed from: a */
    private String f160a;
    /* renamed from: b */
    private boolean f161b = false;
    /* renamed from: c */
    private boolean f162c = false;
    /* renamed from: d */
    private boolean f163d = false;
    /* renamed from: e */
    private boolean f164e = false;
    /* renamed from: f */
    private boolean f165f = false;

    public C0097b(Object obj) {
        this.f160a = obj.toString();
    }

    /* renamed from: a */
    public boolean m262a() {
        return this.f161b;
    }

    /* renamed from: a */
    public void m260a(Object obj) {
        if (m262a()) {
            Log.d(this.f160a, obj.toString());
        }
    }

    /* renamed from: a */
    public void m261a(Object obj, Throwable th) {
        if (m262a()) {
            Log.d(this.f160a, obj.toString(), th);
        }
    }

    /* renamed from: b */
    public boolean m265b() {
        return this.f162c;
    }

    /* renamed from: b */
    public void m263b(Object obj) {
        if (m265b()) {
            Log.e(this.f160a, obj.toString());
        }
    }

    /* renamed from: b */
    public void m264b(Object obj, Throwable th) {
        if (m265b()) {
            Log.e(this.f160a, obj.toString(), th);
        }
    }

    /* renamed from: c */
    public boolean m268c() {
        return this.f164e;
    }

    /* renamed from: c */
    public void m266c(Object obj) {
        if (m268c()) {
            Log.w(this.f160a, obj.toString());
        }
    }

    /* renamed from: c */
    public void m267c(Object obj, Throwable th) {
        if (m268c()) {
            Log.w(this.f160a, obj.toString(), th);
        }
    }

    /* renamed from: d */
    public boolean m270d() {
        return this.f165f;
    }

    /* renamed from: d */
    public void m269d(Object obj) {
        if (m270d()) {
            Log.i(this.f160a, obj.toString());
        }
    }
}
