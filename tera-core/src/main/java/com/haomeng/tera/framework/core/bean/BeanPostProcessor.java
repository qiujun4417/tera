package com.haomeng.tera.framework.core.bean;

/**
 * Created by nick on 2017/8/2.
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName);

    Object postProcessAfterInitialization(Object bean, String beanName);
}
