package org.example.component.branch;

import org.example.component.basic.BasicComponent;

public class BranchCheckoutComponent extends BasicComponent<BranchContextImpl> {

    @Override
    public boolean preExecuteCheck(BranchContextImpl context) {
        return super.preExecuteCheck(context);
    }

    @Override
    public boolean execute(BranchContextImpl context) throws Exception {
        return super.execute(context);
    }

    @Override
    public boolean afterExecute(BranchContextImpl context) {
        return super.afterExecute(context);
    }

    @Override
    public void executeExceptionHandler(BranchContextImpl context) {
        super.executeExceptionHandler(context);
    }
}
