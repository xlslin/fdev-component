package org.example.task.handler;

import org.example.component.task.TaskContextImpl;

public interface TaskExecuteHandler {

    boolean execute(TaskContextImpl context);

}
