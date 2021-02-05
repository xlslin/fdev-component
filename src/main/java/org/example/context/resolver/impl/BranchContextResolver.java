package org.example.context.resolver.impl;

import org.example.component.basic.IComponent;
import org.example.component.basic.IContext;
import org.example.component.branch.BranchCheckoutComponent;
import org.example.component.branch.BranchContextImpl;
import org.example.entity.BranchEntity;


abstract class BranchContextResolver<T extends IComponent> extends DefaultContextResolver<BranchContextImpl,T> {

    @Override
    public BranchContextImpl resolve(IContext request) {
        BranchContextImpl bContext = new BranchContextImpl();
        bContext.putAll(request.getAll());
        bContext.setBranchConfig(new BranchEntity());
        return bContext;
    }

    @Override
    public boolean match(T component) {
        return component instanceof BranchCheckoutComponent;
    }
}
