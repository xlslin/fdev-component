package org.example.component.basic;

public interface FComponent {

    boolean preExecuteCheck(FContext context);

    boolean execute(FContext context) throws Exception;

    boolean afterExecute(FContext context);

    void executeExceptionHandler(FContext context);

}
