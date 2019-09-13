package strategy.main;

import strategy.action.Add;
import strategy.action.Multiply;
import strategy.action.Substract;
import strategy.operation.Operation;
import strategy.operationHandler.OperationHandler;

public class  main {
    public static void main(String[] args) {
        OperationHandler operationHandler = new OperationHandler(new Add());
        Operation operationAdd = new Add();
        System.out.println("20 + 15 = " + operationAdd.doOperation(20,15));
        System.out.println("20 + 15 = " + operationHandler.executeStrategy(20, 15));

        operationHandler = new OperationHandler(new Substract());
        Operation operationSubstract = new Substract();
        System.out.println("7 - 5 = " + operationSubstract.doOperation(7,5));
        System.out.println("7 - 5 = " + operationHandler.executeStrategy(7, 5));

        operationHandler = new OperationHandler(new Multiply());
        Operation operationMultiply = new Multiply();
        System.out.println("30 * 5 = " + operationMultiply.doOperation(30,5));
        System.out.println("30 * 5 = " + operationHandler.executeStrategy(30, 5));
    }
}