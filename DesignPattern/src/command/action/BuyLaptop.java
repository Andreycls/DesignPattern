package command.action;

import command.command.Order;
import command.request.Laptop;

public class BuyLaptop implements Order {
    private Laptop newLaptop;

    public BuyLaptop(Laptop newLaptop){
        this.newLaptop = newLaptop;
    }

    public void execute() {
        newLaptop.buy();
    }
}