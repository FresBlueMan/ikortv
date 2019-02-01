package com.google.gson.p038a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: JsonAdapter */
/* renamed from: com.google.gson.a.b */
public @interface C0439b {
    /* renamed from: a */
    Class<?> m561a();

    /* renamed from: b */
    boolean m562b() default true;
}
