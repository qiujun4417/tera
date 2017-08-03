package com.haomeng.tera.framework.core.annotation;

import java.lang.annotation.*;

/**
 * Created by nick on 2017/8/2.
 * @author nick
 * 功能类似spring @Autowire
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowire {

    /**
     * Declares whether the annotated dependency is required.
     * <p>Defaults to {@code true}.
     */
    boolean required() default true;
}
