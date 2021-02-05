package org.example.task;

import org.example.component.basic.IComponent;
import org.example.entity.ComponentEntity;

public class ComponentFactory {

    /**
     * 解析Component配置
     * @param jsonString
     * @return
     */
    public static ComponentEntity buildComponentConfig(String jsonString){
        return new ComponentEntity();
    }

    /**
     * 根据Component配置创建 Component对象，或者从容器中获取
     * @param config
     * @return
     */
    public static IComponent buildComponent(ComponentEntity config){
        return null;
    }
}
