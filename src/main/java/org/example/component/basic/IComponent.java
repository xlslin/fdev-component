package org.example.component.basic;

public interface IComponent<T> {

    boolean preExecuteCheck(T context);

    boolean execute(T context) throws Exception;

    boolean afterExecute(T context);

    void executeExceptionHandler(T context);

}
