package com.iptv2.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.iptv2.core.C0730c;
import com.iptv2.p043b.C0591c;

/* compiled from: Dialog */
/* renamed from: com.iptv2.base.a */
public class C1338a extends DialogFragment {
    /* renamed from: a */
    protected C0730c f2318a;
    /* renamed from: b */
    protected Activity f2319b;
    /* renamed from: c */
    protected Window f2320c;
    /* renamed from: d */
    protected View f2321d;
    /* renamed from: e */
    private boolean f2322e = false;
    /* renamed from: f */
    private boolean f2323f = false;

    /* compiled from: Dialog */
    /* renamed from: com.iptv2.base.a$1 */
    class C06061 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ C1338a f691a;

        C06061(C1338a c1338a) {
            this.f691a = c1338a;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return keyEvent.getAction() == null ? this.f691a.mo2081a(i, keyEvent) : null;
        }
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        return false;
    }

    public void onCreate(@Nullable Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCreate ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Dialog", stringBuilder.toString());
        super.onCreate(bundle);
        this.f2319b = (Activity) getActivity();
        this.f2318a = this.f2319b.f2473c;
    }

    public void onResume() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onResume ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Dialog", stringBuilder.toString());
        super.onResume();
        this.f2323f = false;
    }

    public void onPause() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPause ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Dialog", stringBuilder.toString());
        this.f2323f = true;
        super.onPause();
    }

    public void onDestroy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onDestroy ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Dialog", stringBuilder.toString());
        this.f2322e = true;
        super.onDestroy();
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCreateDialog ");
        stringBuilder.append(getClass().getName());
        C0591c.m791a("Dialog", stringBuilder.toString());
        bundle = super.onCreateDialog(bundle);
        bundle.setOnKeyListener(new C06061(this));
        this.f2320c = bundle.getWindow();
        this.f2321d = this.f2320c.getDecorView();
        this.f2320c.setFlags(128, 128);
        if (!this.f2318a.f1248C.m1321h() && VERSION.SDK_INT >= 19) {
            this.f2320c.setFlags(134217728, 134217728);
        }
        return bundle;
    }

    /* renamed from: a */
    public boolean m2847a() {
        return this.f2322e;
    }

    /* renamed from: b */
    public boolean m2849b() {
        return this.f2323f;
    }

    /* renamed from: a */
    public void m2846a(Activity activity) {
        show((FragmentManager) activity.getSupportFragmentManager(), "");
    }
}
