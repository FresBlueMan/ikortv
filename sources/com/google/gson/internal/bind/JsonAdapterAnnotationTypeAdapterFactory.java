package com.google.gson.internal.bind;

import com.google.gson.C0451e;
import com.google.gson.C0454i;
import com.google.gson.C0485q;
import com.google.gson.C0487t;
import com.google.gson.C0488u;
import com.google.gson.internal.C0467c;
import com.google.gson.p038a.C0439b;
import com.google.gson.p039b.C0444a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C0488u {
    /* renamed from: a */
    private final C0467c f1742a;

    public JsonAdapterAnnotationTypeAdapterFactory(C0467c c0467c) {
        this.f1742a = c0467c;
    }

    /* renamed from: a */
    public <T> C0487t<T> mo1267a(C0451e c0451e, C0444a<T> c0444a) {
        C0439b c0439b = (C0439b) c0444a.m572a().getAnnotation(C0439b.class);
        if (c0439b == null) {
            return null;
        }
        return m2003a(this.f1742a, c0451e, c0444a, c0439b);
    }

    /* renamed from: a */
    C0487t<?> m2003a(C0467c c0467c, C0451e c0451e, C0444a<?> c0444a, C0439b c0439b) {
        c0467c = c0467c.m700a(C0444a.m571b(c0439b.m561a())).mo1303a();
        if (c0467c instanceof C0487t) {
            c0467c = (C0487t) c0467c;
        } else if (c0467c instanceof C0488u) {
            c0467c = ((C0488u) c0467c).mo1267a(c0451e, c0444a);
        } else {
            boolean z = c0467c instanceof C0485q;
            if (!z) {
                if (!(c0467c instanceof C0454i)) {
                    c0439b = new StringBuilder();
                    c0439b.append("Invalid attempt to bind an instance of ");
                    c0439b.append(c0467c.getClass().getName());
                    c0439b.append(" as a @JsonAdapter for ");
                    c0439b.append(c0444a.toString());
                    c0439b.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    throw new IllegalArgumentException(c0439b.toString());
                }
            }
            C0454i c0454i = null;
            C0485q c0485q = z ? (C0485q) c0467c : null;
            if (c0467c instanceof C0454i) {
                c0454i = (C0454i) c0467c;
            }
            C0467c treeTypeAdapter = new TreeTypeAdapter(c0485q, c0454i, c0451e, c0444a, null);
        }
        return (c0467c == null || c0439b.m562b() == null) ? c0467c : c0467c.m742a();
    }
}
