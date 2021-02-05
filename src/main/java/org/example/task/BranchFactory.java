package org.example.task;

import org.example.component.basic.IComponent;
import org.example.entity.BranchEntity;
import org.example.entity.ComponentEntity;

public class BranchFactory {

    public static BranchEntity buildBranchEntity(String jsonString){
        return new BranchEntity();
    }

    public static IComponent buildBranch(ComponentEntity config){
        return null;
    }
}
