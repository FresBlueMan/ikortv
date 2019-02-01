package p000a.p001a.p002a.p003a.p022i.p024b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: RedirectLocations */
/* renamed from: a.a.a.a.i.b.v */
public class C0111v extends AbstractList<Object> {
    /* renamed from: a */
    private final Set<URI> f220a = new HashSet();
    /* renamed from: b */
    private final List<URI> f221b = new ArrayList();

    public /* synthetic */ Object get(int i) {
        return m317a(i);
    }

    public /* synthetic */ Object remove(int i) {
        return m319b(i);
    }

    /* renamed from: a */
    public boolean m318a(URI uri) {
        return this.f220a.contains(uri);
    }

    /* renamed from: b */
    public void m320b(URI uri) {
        this.f220a.add(uri);
        this.f221b.add(uri);
    }

    /* renamed from: a */
    public URI m317a(int i) {
        return (URI) this.f221b.get(i);
    }

    public int size() {
        return this.f221b.size();
    }

    public Object set(int i, Object obj) {
        URI uri = (URI) obj;
        URI uri2 = (URI) this.f221b.set(i, uri);
        this.f220a.remove(uri2);
        this.f220a.add(uri);
        if (this.f221b.size() != this.f220a.size()) {
            this.f220a.addAll(this.f221b);
        }
        return uri2;
    }

    public void add(int i, Object obj) {
        URI uri = (URI) obj;
        this.f221b.add(i, uri);
        this.f220a.add(uri);
    }

    /* renamed from: b */
    public URI m319b(int i) {
        URI uri = (URI) this.f221b.remove(i);
        this.f220a.remove(uri);
        if (this.f221b.size() != this.f220a.size()) {
            this.f220a.addAll(this.f221b);
        }
        return uri;
    }

    public boolean contains(Object obj) {
        return this.f220a.contains(obj);
    }
}
