package com.sccba.knowledge.log;

import java.lang.annotation.*;

/**
 * Created by Hello on 2019/12/24.
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface LogAopAnnotation {
    String value() default "";
}
