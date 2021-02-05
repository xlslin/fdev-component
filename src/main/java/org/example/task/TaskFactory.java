package org.example.task;


import org.example.entity.TaskEntity;

public class TaskFactory {

    /**
     * 根据配置生成执行模版对象，或者总容器中获取
     * @param jsonString
     * @return
     */
    public static TaskEntity buildTask(String jsonString){
        //TODO  解析json内容，通过ComponentFactory生成 ComponentConfig && FComponentImpl
        return new TaskEntity();
    }

}
