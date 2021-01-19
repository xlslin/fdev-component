package org.example.template.handler.impl;

import org.example.component.basic.FComponent;
import org.example.component.basic.FContext;
import org.example.component.basic.FContextImpl;
import org.example.template.Template;
import org.example.template.TemplateFactory;
import org.example.template.handler.TemplateExecuteHandler;

import java.util.Iterator;

public class SimpleTemplateExecuteHandler implements TemplateExecuteHandler {

    @Override
    public boolean execute(Template template) {
        FContext context = new FContextImpl();

        Iterator<FComponent> it = template.getFcomponents().iterator();
        if(it.hasNext()){
            FComponent executeComponent = it.next();
            if(executeComponent.preExecuteCheck(context)){
                try {
                    boolean result = executeComponent.execute(context);
                    if(result){
                        executeComponent.afterExecute(context);
                    }else{
                        return false;
                    }
                }catch(Exception e){
                    executeComponent.executeExceptionHandler(context);
                    return false;
                }
            }
        }
        return true;
    }

    public Template initTemplate(String jsonString){
        return TemplateFactory.buildTemplate(jsonString);
    }
}
