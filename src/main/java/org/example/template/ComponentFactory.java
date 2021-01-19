package org.example.template;

import org.example.component.basic.FComponent;

public class ComponentFactory {

    public static ComponentConfig buildComponentConfig(String jsonString){
        return new ComponentConfig();
    }

    public static FComponent buildComponent(ComponentConfig config){
        return null;
    }
}
