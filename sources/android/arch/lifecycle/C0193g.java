package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.arch.lifecycle.C0187b.C0185a;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: ReportFragment */
/* renamed from: android.arch.lifecycle.g */
public class C0193g extends Fragment {
    /* renamed from: a */
    private C0192a f345a;

    /* compiled from: ReportFragment */
    /* renamed from: android.arch.lifecycle.g$a */
    interface C0192a {
        /* renamed from: a */
        void m548a();

        /* renamed from: b */
        void m549b();

        /* renamed from: c */
        void m550c();
    }

    /* renamed from: a */
    public static void m551a(Activity activity) {
        activity = activity.getFragmentManager();
        if (activity.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            activity.beginTransaction().add(new C0193g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            activity.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m553a(C0192a c0192a) {
        if (c0192a != null) {
            c0192a.m548a();
        }
    }

    /* renamed from: b */
    private void m554b(C0192a c0192a) {
        if (c0192a != null) {
            c0192a.m549b();
        }
    }

    /* renamed from: c */
    private void m555c(C0192a c0192a) {
        if (c0192a != null) {
            c0192a.m550c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m553a(this.f345a);
        m552a(C0185a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m554b(this.f345a);
        m552a(C0185a.ON_START);
    }

    public void onResume() {
        super.onResume();
        m555c(this.f345a);
        m552a(C0185a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m552a(C0185a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m552a(C0185a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m552a(C0185a.ON_DESTROY);
        this.f345a = null;
    }

    /* renamed from: a */
    private void m552a(C0185a c0185a) {
        Activity activity = getActivity();
        if (activity instanceof C0922e) {
            ((C0922e) activity).m1947a().m1945a(c0185a);
            return;
        }
        if (activity instanceof C0188c) {
            C0187b lifecycle = ((C0188c) activity).getLifecycle();
            if (lifecycle instanceof C0921d) {
                ((C0921d) lifecycle).m1945a(c0185a);
            }
        }
    }
}
