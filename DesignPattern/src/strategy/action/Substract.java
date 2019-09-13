package strategy.action;

import strategy.operation.Operation;
public class Substract implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}