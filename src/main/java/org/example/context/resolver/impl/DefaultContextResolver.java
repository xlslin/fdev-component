package org.example.context.resolver.impl;

import org.example.component.basic.ContextImpl;
import org.example.component.basic.IComponent;
import org.example.context.resolver.ContextResolver;

import java.util.Map;

abstract class DefaultContextResolver<R extends ContextImpl,T extends IComponent> implements ContextResolver<R,T> {

    @Override
    public ContextImpl resolve(Map request) {
        return null;
    }

    @Override
    public boolean match(T component) {
        return false;
    }
}
