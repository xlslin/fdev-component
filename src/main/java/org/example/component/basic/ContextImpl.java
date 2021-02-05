package org.example.component.basic;

import org.example.entity.ComponentEntity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContextImpl implements IContext {

    private ConcurrentHashMap<String,Object> contextMap = new ConcurrentHashMap();

    private ComponentEntity componentEntity = null;

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

    public ComponentEntity getComponentConfig() {
        return componentEntity;
    }

    public void setComponentConfig(ComponentEntity componentEntity) {
        this.componentEntity = componentEntity;
    }

}
