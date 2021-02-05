package org.example.component.basic;

import org.example.component.basic.IComponent;
import org.example.component.basic.ContextImpl;

abstract class AbstractComponent<T extends ContextImpl> implements IComponent<T> {
    @Override
    public boolean preExecuteCheck(ContextImpl context) {
        return false;
    }

    @Override
    public boolean execute(ContextImpl context) throws Exception {
        return false;
    }

    @Override
    public boolean afterExecute(ContextImpl context) {
        return false;
    }

    @Override
    public void executeExceptionHandler(ContextImpl context) {

    }
}
