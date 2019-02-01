package android.arch.p036a.p037a;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: SafeIterableMap */
/* renamed from: android.arch.a.a.b */
public class C0181b<K, V> implements Iterable<Entry<K, V>> {
    /* renamed from: a */
    private C0178c<K, V> f327a;
    /* renamed from: b */
    private C0178c<K, V> f328b;
    /* renamed from: c */
    private WeakHashMap<Object<K, V>, Boolean> f329c = new WeakHashMap();
    /* renamed from: d */
    private int f330d = 0;

    /* compiled from: SafeIterableMap */
    /* renamed from: android.arch.a.a.b$c */
    static class C0178c<K, V> implements Entry<K, V> {
        @NonNull
        /* renamed from: a */
        final K f318a;
        @NonNull
        /* renamed from: b */
        final V f319b;
        /* renamed from: c */
        C0178c<K, V> f320c;
        /* renamed from: d */
        C0178c<K, V> f321d;

        @NonNull
        public K getKey() {
            return this.f318a;
        }

        @NonNull
        public V getValue() {
            return this.f319b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f318a);
            stringBuilder.append("=");
            stringBuilder.append(this.f319b);
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0178c)) {
                return false;
            }
            C0178c c0178c = (C0178c) obj;
            if (!this.f318a.equals(c0178c.f318a) || this.f319b.equals(c0178c.f319b) == null) {
                z = false;
            }
            return z;
        }
    }

    /* compiled from: SafeIterableMap */
    /* renamed from: android.arch.a.a.b$d */
    private class C0179d implements Iterator<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0181b f322a;
        /* renamed from: b */
        private C0178c<K, V> f323b;
        /* renamed from: c */
        private boolean f324c;

        private C0179d(C0181b c0181b) {
            this.f322a = c0181b;
            this.f324c = true;
        }

        public /* synthetic */ Object next() {
            return m535a();
        }

        public boolean hasNext() {
            boolean z = false;
            if (this.f324c) {
                if (this.f322a.f327a != null) {
                    z = true;
                }
                return z;
            }
            if (!(this.f323b == null || this.f323b.f320c == null)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public Entry<K, V> m535a() {
            if (this.f324c) {
                this.f324c = false;
                this.f323b = this.f322a.f327a;
            } else {
                this.f323b = this.f323b != null ? this.f323b.f320c : null;
            }
            return this.f323b;
        }
    }

    /* compiled from: SafeIterableMap */
    /* renamed from: android.arch.a.a.b$e */
    private static abstract class C0180e<K, V> implements Iterator<Entry<K, V>> {
        /* renamed from: a */
        C0178c<K, V> f325a;
        /* renamed from: b */
        C0178c<K, V> f326b;

        /* renamed from: a */
        abstract C0178c<K, V> mo162a(C0178c<K, V> c0178c);

        public /* synthetic */ Object next() {
            return m538a();
        }

        C0180e(C0178c<K, V> c0178c, C0178c<K, V> c0178c2) {
            this.f325a = c0178c2;
            this.f326b = c0178c;
        }

        public boolean hasNext() {
            return this.f326b != null;
        }

        /* renamed from: b */
        private C0178c<K, V> m536b() {
            if (this.f326b != this.f325a) {
                if (this.f325a != null) {
                    return mo162a(this.f326b);
                }
            }
            return null;
        }

        /* renamed from: a */
        public Entry<K, V> m538a() {
            Entry entry = this.f326b;
            this.f326b = m536b();
            return entry;
        }
    }

    /* compiled from: SafeIterableMap */
    /* renamed from: android.arch.a.a.b$a */
    static class C0919a<K, V> extends C0180e<K, V> {
        C0919a(C0178c<K, V> c0178c, C0178c<K, V> c0178c2) {
            super(c0178c, c0178c2);
        }

        /* renamed from: a */
        C0178c<K, V> mo162a(C0178c<K, V> c0178c) {
            return c0178c.f320c;
        }
    }

    /* compiled from: SafeIterableMap */
    /* renamed from: android.arch.a.a.b$b */
    private static class C0920b<K, V> extends C0180e<K, V> {
        C0920b(C0178c<K, V> c0178c, C0178c<K, V> c0178c2) {
            super(c0178c, c0178c2);
        }

        /* renamed from: a */
        C0178c<K, V> mo162a(C0178c<K, V> c0178c) {
            return c0178c.f321d;
        }
    }

    /* renamed from: a */
    public int m540a() {
        return this.f330d;
    }

    @NonNull
    public Iterator<Entry<K, V>> iterator() {
        Iterator c0919a = new C0919a(this.f327a, this.f328b);
        this.f329c.put(c0919a, Boolean.valueOf(false));
        return c0919a;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> m541b() {
        Iterator c0920b = new C0920b(this.f328b, this.f327a);
        this.f329c.put(c0920b, Boolean.valueOf(false));
        return c0920b;
    }

    /* renamed from: c */
    public C0179d m542c() {
        C0179d c0179d = new C0179d();
        this.f329c.put(c0179d, Boolean.valueOf(false));
        return c0179d;
    }

    /* renamed from: d */
    public Entry<K, V> m543d() {
        return this.f327a;
    }

    /* renamed from: e */
    public Entry<K, V> m544e() {
        return this.f328b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0181b)) {
            return false;
        }
        C0181b c0181b = (C0181b) obj;
        if (m540a() != c0181b.m540a()) {
            return false;
        }
        Iterator it = iterator();
        obj = c0181b.iterator();
        while (it.hasNext() && obj.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = obj.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || obj.hasNext() != null) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
