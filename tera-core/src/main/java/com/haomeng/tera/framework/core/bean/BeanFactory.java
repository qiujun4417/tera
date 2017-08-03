package com.haomeng.tera.framework.core.bean;

/**
 * Created by nick on 2017/8/2.
 * @author nick
 * 这个是模拟spring的bean管理机制获取bean的
 */
public interface BeanFactory {

    /**
     * 根据bean的名称获取bean
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 根据类型获取bean
     * @param requiredType
     * @param <T>
     * @return
     */
    <T> T getBean(Class<T> requiredType);

}
