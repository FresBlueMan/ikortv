package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0187b;
import android.arch.lifecycle.C0187b.C0186b;
import android.arch.lifecycle.C0188c;
import android.arch.lifecycle.C0193g;
import android.arch.lifecycle.C0921d;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.SimpleArrayMap;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SupportActivity extends Activity implements C0188c {
    private SimpleArrayMap<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new SimpleArrayMap();
    private C0921d mLifecycleRegistry = new C0921d(this);

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class ExtraData {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C0193g.m551a((Activity) this);
    }

    @CallSuper
    protected void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m1946a(C0186b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (ExtraData) this.mExtraDataMap.get(cls);
    }

    public C0187b getLifecycle() {
        return this.mLifecycleRegistry;
    }
}
