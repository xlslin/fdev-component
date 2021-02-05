package org.example.context.resolver.impl;

import org.example.component.basic.IComponent;
import org.example.component.basic.IContext;
import org.example.component.branch.BranchContextImpl;


abstract class BranchContextResolver<T extends IComponent> extends DefaultContextResolver<BranchContextImpl,T> {

    @Override
    public BranchContextImpl resolve(IContext request) {
        return null;
    }

    @Override
    public boolean match(T component) {
        return false;
    }
}
