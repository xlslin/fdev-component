package org.example.component.basic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FContextImpl implements FContext{

    private ConcurrentHashMap<String,Object> contextMap = new ConcurrentHashMap();

    @Override
    public <T> T getKey(String key) {
        return (T)contextMap.get(key);
    }

    @Override
    public void setKey(String key, Object value) {
        contextMap.put(key,value);
    }

    @Override
    public void putAll(Map<String, Object> pairs) {
        contextMap.putAll(pairs);
    }

    @Override
    public Map<String, Object> getAll() {
        return contextMap;
    }

    @Override
    public void resetContext() {
        contextMap.clear();
    }
}
