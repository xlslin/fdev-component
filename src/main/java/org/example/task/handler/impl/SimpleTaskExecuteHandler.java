package org.example.task.handler.impl;

import org.example.component.basic.IComponent;
import org.example.component.basic.IContext;
import org.example.component.basic.ContextImpl;
import org.example.component.task.TaskContextImpl;
import org.example.context.resolver.ContextResolver;
import org.example.context.resolver.impl.SimpleTaskContextResolverHandler;
import org.example.entity.TaskEntity;
import org.example.task.TaskFactory;
import org.example.task.handler.TaskExecuteHandler;

import java.util.Iterator;

public class SimpleTaskExecuteHandler implements TaskExecuteHandler {

    private SimpleTaskContextResolverHandler resolveHandler = new SimpleTaskContextResolverHandler();

    public TaskEntity initTemplate(String jsonString){
        return TaskFactory.buildTask(jsonString);
    }

    @Override
    public boolean execute(TaskContextImpl taskContext){
        Iterator<IComponent> it = taskContext.getTaskEntity().getFcomponents().iterator();
        if(it.hasNext()){
            IComponent executeComponent = it.next();
            IContext componentContext = null;
            try {
                componentContext = resolveHandler.resolverHandler(executeComponent, taskContext).resolve(taskContext);
            }catch(Exception e){

            }
            if(executeComponent.preExecuteCheck(componentContext)){
                try {
                    boolean result = executeComponent.execute(componentContext);
                    if(result){
                        executeComponent.afterExecute(componentContext);
                    }else{
                        return false;
                    }
                }catch(Exception e){
                    executeComponent.executeExceptionHandler(componentContext);
                    return false;
                }
            }
        }
        return true;
    }
}
