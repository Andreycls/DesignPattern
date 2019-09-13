package strategy.operationHandler;

import strategy.operation.Operation;

public class OperationHandler {
    private Operation operation;

    public OperationHandler(Operation operation){
        this.operation = operation;
    }

    public int executeStrategy(int num1, int num2){
        return operation.doOperation(num1+10, num2);
    }
}