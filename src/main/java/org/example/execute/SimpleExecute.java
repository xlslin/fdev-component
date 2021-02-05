package org.example.execute;

import org.example.component.task.TaskContextImpl;
import org.example.task.TaskFactory;
import org.example.task.handler.impl.SimpleTaskExecuteHandler;

import java.util.HashMap;
import java.util.Map;

public class SimpleExecute {

    public static void main(String[] args) {
        Map request = new HashMap();
        SimpleTaskExecuteHandler handler = new SimpleTaskExecuteHandler();
        TaskContextImpl taskContext = new TaskContextImpl();
        taskContext.putAll(request);
        taskContext.setTaskEntity(TaskFactory.buildTask(taskContext.getKey("taskString")));
        handler.execute(taskContext);
    }
}
