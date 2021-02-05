package org.example.component.branch;

import org.example.component.basic.ContextImpl;
import org.example.entity.BranchEntity;

public class BranchContextImpl extends ContextImpl {

    private BranchEntity branchEntity = null;

    public BranchEntity getBranchConfig() {
        return branchEntity;
    }

    public void setBranchConfig(BranchEntity branchEntity) {
        this.branchEntity = branchEntity;
    }
}
