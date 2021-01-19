package org.example.template;

import org.example.component.basic.FComponent;

import java.util.List;

public class Template {

    private List<FComponent> fcomponents;

    private List<ComponentConfig> componentConfigs;

    public List<FComponent> getFcomponents() {
        return fcomponents;
    }

    public void setFcomponents(List<FComponent> fcomponents) {
        this.fcomponents = fcomponents;
    }

    public List<ComponentConfig> getComponentConfigs() {
        return componentConfigs;
    }

    public void setComponentConfigs(List<ComponentConfig> componentConfigs) {
        this.componentConfigs = componentConfigs;
    }
}
