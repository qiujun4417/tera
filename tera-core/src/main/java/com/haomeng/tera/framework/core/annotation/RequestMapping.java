package com.haomeng.tera.framework.core.annotation;

import com.haomeng.tera.framework.core.support.RequestMethod;

import java.lang.annotation.*;

/**
 * Created by nick on 2017/8/3.
 * @author nick
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {

    /**
     * Assign a name to this mapping.
     * <p><b>Supported at the type level as well as at the method level!</b>
     * When used on both levels, a combined name is derived by concatenation
     * with "#" as separator.
     */
    String name() default "";

    /**
     * The primary mapping expressed by this annotation.
     * <p>This is an alias for {@link #path}. For example
     * {@code @RequestMapping("/foo")} is equivalent to
     * {@code @RequestMapping(path="/foo")}.
     * <p><b>Supported at the type level as well as at the method level!</b>
     * When used at the type level, all method-level mappings inherit
     * this primary mapping, narrowing it for a specific handler method.
     */
    String[] value() default {};

    /**
     * The HTTP request methods to map to, narrowing the primary mapping:
     * GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE.
     * <p><b>Supported at the type level as well as at the method level!</b>
     * When used at the type level, all method-level mappings inherit
     * this HTTP method restriction (i.e. the type-level restriction
     * gets checked before the handler method is even resolved).
     */
    RequestMethod[] method() default {};

    /**
     * The parameters of the mapped request, narrowing the primary mapping.
     * <p>Same format for any environment: a sequence of "myParam=myValue" style
     * expressions, with a request only mapped if each such parameter is found
     * to have the given value. Expressions can be negated by using the "!=" operator,
     * as in "myParam!=myValue". "myParam" style expressions are also supported,
     * with such parameters having to be present in the request (allowed to have
     * any value). Finally, "!myParam" style expressions indicate that the
     * specified parameter is <i>not</i> supposed to be present in the request.
     * <p><b>Supported at the type level as well as at the method level!</b>
     * When used at the type level, all method-level mappings inherit
     * this parameter restriction (i.e. the type-level restriction
     * gets checked before the handler method is even resolved).
     * <p>Parameter mappings are considered as restrictions that are enforced at
     * the type level. The primary path mapping (i.e. the specified URI value)
     * still has to uniquely identify the target handler, with parameter mappings
     * simply expressing preconditions for invoking the handler.
     */
    String[] params() default {};

    /**
     * The headers of the mapped request, narrowing the primary mapping.
     * <p>Same format for any environment: a sequence of "My-Header=myValue" style
     * expressions, with a request only mapped if each such header is found
     * to have the given value. Expressions can be negated by using the "!=" operator,
     * as in "My-Header!=myValue". "My-Header" style expressions are also supported,
     * with such headers having to be present in the request (allowed to have
     * any value). Finally, "!My-Header" style expressions indicate that the
     * specified header is <i>not</i> supposed to be present in the request.
     * <p>Also supports media type wildcards (*), for headers such as Accept
     * and Content-Type. For instance,
     * <pre class="code">
     * &#064;RequestMapping(value = "/something", headers = "content-type=text/*")
     * </pre>
     * will match requests with a Content-Type of "text/html", "text/plain", etc.
     * <p><b>Supported at the type level as well as at the method level!</b>
     * When used at the type level, all method-level mappings inherit
     * this header restriction (i.e. the type-level restriction
     * gets checked before the handler method is even resolved).
     */
    String[] headers() default {};

}
