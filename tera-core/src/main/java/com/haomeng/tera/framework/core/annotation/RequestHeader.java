package com.haomeng.tera.framework.core.annotation;

/**
 * Created by nick on 2017/8/3.
 */
public @interface RequestHeader {

    /**
     * 值
     */
    String value() default "";


    /**
     * Whether the header is required.
     * <p>Defaults to {@code true}, leading to an exception being thrown
     * if the header is missing in the request. Switch this to
     * {@code false} if you prefer a {@code null} value if the header is
     * not present in the request.
     * <p>Alternatively, provide a {@link #defaultValue}, which implicitly
     * sets this flag to {@code false}.
     */
    boolean required() default true;

    /**
     * The default value to use as a fallback.
     * <p>Supplying a default value implicitly sets {@link #required} to
     * {@code false}.
     */
    String defaultValue() default ValueConstants.DEFAULT_NONE;
}
