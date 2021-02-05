package org.example.context.resolver.impl;

import org.example.component.basic.ContextImpl;
import org.example.component.basic.IComponent;
import org.example.component.basic.IContext;
import org.example.context.resolver.ContextResolver;


abstract class DefaultContextResolver<R extends ContextImpl,T extends IComponent> implements ContextResolver<R,T> {

    @Override
    public R resolve(IContext request) {
        return null;
    }

    @Override
    public boolean match(T component) {
        return false;
    }
}
