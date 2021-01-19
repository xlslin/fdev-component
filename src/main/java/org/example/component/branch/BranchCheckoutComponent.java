package org.example.component.branch;

import org.example.component.basic.FComponent;
import org.example.component.basic.FContext;

public class BranchCheckoutComponent implements FComponent {

    @Override
    public boolean preExecuteCheck(FContext context) {
        return false;
    }

    @Override
    public boolean execute(FContext context) throws Exception {
        return false;
    }

    @Override
    public boolean afterExecute(FContext context) {
        return false;
    }

    @Override
    public void executeExceptionHandler(FContext context) {
    }
}
