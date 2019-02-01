package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: $Gson$Types */
/* renamed from: com.google.gson.internal.b */
public final class C0459b {
    /* renamed from: a */
    static final Type[] f418a = new Type[0];

    /* compiled from: $Gson$Types */
    /* renamed from: com.google.gson.internal.b$a */
    private static final class C0456a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f412a;

        public C0456a(Type type) {
            this.f412a = C0459b.m681d(type);
        }

        public Type getGenericComponentType() {
            return this.f412a;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof GenericArrayType) || C0459b.m676a((Type) this, (GenericArrayType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return this.f412a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C0459b.m683f(this.f412a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* compiled from: $Gson$Types */
    /* renamed from: com.google.gson.internal.b$b */
    private static final class C0457b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f413a;
        /* renamed from: b */
        private final Type f414b;
        /* renamed from: c */
        private final Type[] f415c;

        public C0457b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Object obj;
                Class cls = (Class) type2;
                boolean z = true;
                if (!Modifier.isStatic(cls.getModifiers())) {
                    if (cls.getEnclosingClass() != null) {
                        obj = null;
                        if (type == null) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        C0455a.m664a(z);
                    }
                }
                obj = 1;
                if (type == null) {
                    if (obj != null) {
                        z = false;
                    }
                }
                C0455a.m664a(z);
            }
            if (type == null) {
                type = null;
            } else {
                type = C0459b.m681d(type);
            }
            this.f413a = type;
            this.f414b = C0459b.m681d(type2);
            this.f415c = (Type[]) typeArr.clone();
            type = this.f415c.length;
            for (int i = 0; i < type; i++) {
                C0455a.m663a(this.f415c[i]);
                C0459b.m685h(this.f415c[i]);
                this.f415c[i] = C0459b.m681d(this.f415c[i]);
            }
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f415c.clone();
        }

        public Type getRawType() {
            return this.f414b;
        }

        public Type getOwnerType() {
            return this.f413a;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof ParameterizedType) || C0459b.m676a((Type) this, (ParameterizedType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f415c) ^ this.f414b.hashCode()) ^ C0459b.m665a(this.f413a);
        }

        public String toString() {
            int length = this.f415c.length;
            if (length == 0) {
                return C0459b.m683f(this.f414b);
            }
            StringBuilder stringBuilder = new StringBuilder((length + 1) * 30);
            stringBuilder.append(C0459b.m683f(this.f414b));
            stringBuilder.append("<");
            stringBuilder.append(C0459b.m683f(this.f415c[0]));
            for (int i = 1; i < length; i++) {
                stringBuilder.append(", ");
                stringBuilder.append(C0459b.m683f(this.f415c[i]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* compiled from: $Gson$Types */
    /* renamed from: com.google.gson.internal.b$c */
    private static final class C0458c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Type f416a;
        /* renamed from: b */
        private final Type f417b;

        public C0458c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            C0455a.m664a(typeArr2.length <= 1);
            C0455a.m664a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C0455a.m663a(typeArr2[0]);
                C0459b.m685h(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                C0455a.m664a(z);
                this.f417b = C0459b.m681d(typeArr2[0]);
                this.f416a = Object.class;
                return;
            }
            C0455a.m663a(typeArr[0]);
            C0459b.m685h(typeArr[0]);
            this.f417b = null;
            this.f416a = C0459b.m681d(typeArr[0]);
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f416a};
        }

        public Type[] getLowerBounds() {
            if (this.f417b == null) {
                return C0459b.f418a;
            }
            return new Type[]{this.f417b};
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof WildcardType) || C0459b.m676a((Type) this, (WildcardType) obj) == null) ? null : true;
        }

        public int hashCode() {
            return (this.f417b != null ? this.f417b.hashCode() + 31 : 1) ^ (this.f416a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder stringBuilder;
            if (this.f417b != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                stringBuilder.append(C0459b.m683f(this.f417b));
                return stringBuilder.toString();
            } else if (this.f416a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                stringBuilder.append(C0459b.m683f(this.f416a));
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: a */
    public static ParameterizedType m669a(Type type, Type type2, Type... typeArr) {
        return new C0457b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static GenericArrayType m668a(Type type) {
        return new C0456a(type);
    }

    /* renamed from: b */
    public static WildcardType m678b(Type type) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds();
        } else {
            type = new Type[]{type};
        }
        return new C0458c(type, f418a);
    }

    /* renamed from: c */
    public static WildcardType m680c(Type type) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getLowerBounds();
        } else {
            type = new Type[]{type};
        }
        return new C0458c(new Type[]{Object.class}, type);
    }

    /* renamed from: d */
    public static Type m681d(Type type) {
        if (type instanceof Class) {
            type = (Class) type;
            if (type.isArray()) {
                type = new C0456a(C0459b.m681d(type.getComponentType()));
            }
            return type;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0457b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0456a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C0458c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: e */
    public static Class<?> m682e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            C0455a.m664a(type instanceof Class);
            return (Class) type;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(C0459b.m682e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return C0459b.m682e(((WildcardType) type).getUpperBounds()[0]);
            }
            String str;
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            stringBuilder.append(type);
            stringBuilder.append("> is of type ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static boolean m675a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m676a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!C0459b.m675a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments()) == null) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return C0459b.m676a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) == null) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || typeVariable.getName().equals(typeVariable2.getName()) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    static int m665a(Object obj) {
        return obj != null ? obj.hashCode() : null;
    }

    /* renamed from: f */
    public static String m683f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    static Type m671a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface() != null) {
            type = cls.getInterfaces();
            int length = type.length;
            for (int i = 0; i < length; i++) {
                if (type[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(type[i])) {
                    return C0459b.m671a(cls.getGenericInterfaces()[i], type[i], (Class) cls2);
                }
            }
        }
        if (cls.isInterface() == null) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return C0459b.m671a(cls.getGenericSuperclass(), (Class) superclass, (Class) cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: b */
    static Type m677b(Type type, Class<?> cls, Class<?> cls2) {
        C0455a.m664a(cls2.isAssignableFrom(cls));
        return C0459b.m672a(type, (Class) cls, C0459b.m671a(type, (Class) cls, (Class) cls2));
    }

    /* renamed from: g */
    public static Type m684g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static Type m670a(Type type, Class<?> cls) {
        type = C0459b.m677b(type, cls, Collection.class);
        if ((type instanceof WildcardType) != null) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    public static Type[] m679b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C0459b.m677b(type, cls, Map.class);
        if ((type instanceof ParameterizedType) != null) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    public static Type m672a(Type type, Class<?> cls, Type type2) {
        return C0459b.m673a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    private static Type m673a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            Type type3 = (TypeVariable) type2;
            if (collection.contains(type3)) {
                return type2;
            }
            collection.add(type3);
            type2 = C0459b.m674a(type, (Class) cls, (TypeVariable) type3);
            if (type2 == type3) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            type3 = (Class) type2;
            if (type3.isArray()) {
                type2 = type3.getComponentType();
                type = C0459b.m673a(type, cls, type2, collection);
                if (type2 != type) {
                    type3 = C0459b.m668a(type);
                }
                return type3;
            }
        }
        if (type2 instanceof GenericArrayType) {
            type2 = (GenericArrayType) type2;
            type3 = type2.getGenericComponentType();
            type = C0459b.m673a(type, cls, type3, collection);
            if (type3 != type) {
                type2 = C0459b.m668a(type);
            }
            return type2;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            type2 = (ParameterizedType) type2;
            type3 = type2.getOwnerType();
            Type a = C0459b.m673a(type, cls, type3, collection);
            Object obj = a != type3 ? 1 : null;
            Type[] actualTypeArguments = type2.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a2 = C0459b.m673a(type, cls, actualTypeArguments[i], collection);
                if (a2 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = a2;
                }
                i++;
            }
            if (obj != null) {
                type2 = C0459b.m669a(a, type2.getRawType(), actualTypeArguments);
            }
            return type2;
        } else if (!(type2 instanceof WildcardType)) {
            return type2;
        } else {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                type = C0459b.m673a(type, cls, lowerBounds[0], collection);
                if (type != lowerBounds[0]) {
                    return C0459b.m680c(type);
                }
            } else if (upperBounds.length == 1) {
                type = C0459b.m673a(type, cls, upperBounds[0], collection);
                if (type != upperBounds[0]) {
                    return C0459b.m678b(type);
                }
            }
            return wildcardType;
        }
    }

    /* renamed from: a */
    static Type m674a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = C0459b.m667a((TypeVariable) typeVariable);
        if (a == null) {
            return typeVariable;
        }
        type = C0459b.m671a(type, (Class) cls, a);
        if ((type instanceof ParameterizedType) == null) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C0459b.m666a(a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static int m666a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m667a(TypeVariable<?> typeVariable) {
        typeVariable = typeVariable.getGenericDeclaration();
        return typeVariable instanceof Class ? (Class) typeVariable : null;
    }

    /* renamed from: h */
    static void m685h(Type type) {
        boolean z;
        if (type instanceof Class) {
            if (((Class) type).isPrimitive() != null) {
                z = null;
                C0455a.m664a(z);
            }
        }
        z = true;
        C0455a.m664a(z);
    }
}
