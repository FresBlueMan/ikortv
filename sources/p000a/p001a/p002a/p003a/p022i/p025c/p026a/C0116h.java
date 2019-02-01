package p000a.p001a.p002a.p003a.p022i.p025c.p026a;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import p000a.p001a.p002a.p003a.p035o.C0160a;

@Deprecated
/* compiled from: WaitingThread */
/* renamed from: a.a.a.a.i.c.a.h */
public class C0116h {
    /* renamed from: a */
    private final Condition f236a;
    /* renamed from: b */
    private final C0115f f237b;
    /* renamed from: c */
    private Thread f238c;
    /* renamed from: d */
    private boolean f239d;

    public C0116h(Condition condition, C0115f c0115f) {
        C0160a.m478a((Object) condition, "Condition");
        this.f236a = condition;
        this.f237b = c0115f;
    }

    /* renamed from: a */
    public boolean m341a(Date date) {
        if (this.f238c != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("A thread is already waiting on this object.\ncaller: ");
            stringBuilder.append(Thread.currentThread());
            stringBuilder.append("\nwaiter: ");
            stringBuilder.append(this.f238c);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f239d) {
            throw new InterruptedException("Operation interrupted");
        } else {
            this.f238c = Thread.currentThread();
            if (date != null) {
                try {
                    date = this.f236a.awaitUntil(date);
                } catch (Throwable th) {
                    this.f238c = null;
                }
            } else {
                this.f236a.await();
                date = true;
            }
            if (this.f239d) {
                throw new InterruptedException("Operation interrupted");
            }
            this.f238c = null;
            return date;
        }
    }

    /* renamed from: a */
    public void m340a() {
        if (this.f238c != null) {
            this.f236a.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }

    /* renamed from: b */
    public void m342b() {
        this.f239d = true;
        this.f236a.signalAll();
    }
}
