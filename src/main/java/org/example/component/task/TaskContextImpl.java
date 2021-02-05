package org.example.component.task;

import org.example.component.basic.ContextImpl;
import org.example.entity.BranchEntity;
import org.example.entity.TaskEntity;

public class TaskContextImpl extends ContextImpl {

    private TaskEntity taskEntity = null;

    public TaskEntity getTaskEntity() {
        return taskEntity;
    }

    public void setTaskEntity(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }
}
