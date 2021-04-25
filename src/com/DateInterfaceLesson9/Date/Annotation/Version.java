package com.DateInterfaceLesson9.Date.Annotation;
//Придумать и написать собственную аннотацию @Version, которая будет хранить информацию о версии класса сервиса (поле обязательное)
//        MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).

        import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    double numberOfVersion();
    String name() default "Nougat";
}
