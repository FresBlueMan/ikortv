package android.arch.p036a.p037a;

import android.arch.p036a.p037a.C0181b.C0178c;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.HashMap;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: FastSafeIterableMap */
/* renamed from: android.arch.a.a.a */
public class C0918a<K, V> extends C0181b<K, V> {
    /* renamed from: a */
    private HashMap<K, C0178c<K, V>> f1698a = new HashMap();

    /* renamed from: a */
    public boolean m1925a(K k) {
        return this.f1698a.containsKey(k);
    }
}
