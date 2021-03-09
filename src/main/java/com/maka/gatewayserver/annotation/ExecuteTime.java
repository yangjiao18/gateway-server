package com.maka.gatewayserver.annotation;

import java.lang.annotation.*;

/**
 * @decription 描述: 记录调用时间
 * @author Administrator
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExecuteTime {

    String value() default "";
}
