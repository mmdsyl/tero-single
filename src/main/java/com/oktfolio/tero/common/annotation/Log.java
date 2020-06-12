package com.oktfolio.tero.common.annotation;

import com.oktfolio.tero.common.enums.LogTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author oktfolio oktfolio@gmail.com
 * @date 2020/06/08
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {
    String name() default "";
    LogTypeEnum type() default LogTypeEnum.DEFAULT;
}