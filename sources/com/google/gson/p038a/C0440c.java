package com.google.gson.p038a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: SerializedName */
/* renamed from: com.google.gson.a.c */
public @interface C0440c {
    /* renamed from: a */
    String m563a();

    /* renamed from: b */
    String[] m564b() default {};
}
