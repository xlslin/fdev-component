package org.example.context.resolver;

import org.example.component.basic.IContext;

public interface ContextResolver<R extends IContext,T> {

    IContext resolve(R request);

    boolean match(T component);

}
