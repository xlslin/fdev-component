package org.example.component.basic;

import java.util.Map;

public interface FContext {

    /**
     * 通过Key 获取指定类型的内容
     * @param key
     * @param <T> 指定返回值的类型
     * @return
     */
    <T> T getKey(String key);

    /**
     * 通过Key设置内容
     * @param key
     * @param value
     */
    void setKey(String key,Object value);

    /**
     * 将pairs 设置到Context中覆盖Key相同内容
     * @param pairs
     */
    void putAll(Map<String,Object> pairs);

    /**
     * 获取context中的所有内容
     * @return map
     */
    Map<String,Object> getAll();

    /**
     * reset context
     */
    void resetContext();

}