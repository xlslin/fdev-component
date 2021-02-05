package org.example.context.resolver.impl;

import org.example.component.basic.IComponent;
import org.example.component.task.TaskContextImpl;
import org.example.context.resolver.ContextResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据入参，找到匹配的resolver
 */
public class SimpleTaskContextResolverHandler {

    /**
     * 可从容器中注入
     */
    List<ContextResolver> resolvers = new ArrayList<ContextResolver>();

    public ContextResolver resolverHandler(IComponent component, TaskContextImpl taskContext) throws Exception{
        for (ContextResolver resolver : resolvers) {
            if(resolver.match(component)){
                return resolver;
            }
        }
        throw new Exception("not match any resolver");
    }
}
