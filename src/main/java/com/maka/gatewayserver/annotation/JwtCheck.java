package com.maka.gatewayserver.annotation;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @decription 描述: jwt检查注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtCheck {

    String value() default "";
}
