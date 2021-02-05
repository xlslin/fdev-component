package org.example.entity;

import org.example.component.basic.IComponent;

import java.util.List;

public class TaskEntity {

    private List<IComponent> fcomponents;

    private List<ComponentEntity> componentEntities;

    public List<IComponent> getFcomponents() {
        return fcomponents;
    }

    public void setFcomponents(List<IComponent> fcomponents) {
        this.fcomponents = fcomponents;
    }

    public List<ComponentEntity> getComponentConfigs() {
        return componentEntities;
    }

    public void setComponentConfigs(List<ComponentEntity> componentEntities) {
        this.componentEntities = componentEntities;
    }
}
