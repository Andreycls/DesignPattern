package command.action;

import command.command.Order;
import command.request.Laptop;

public class SellLaptop implements Order {
    private Laptop newLaptop;

    public SellLaptop(Laptop newLaptop){
        this.newLaptop = newLaptop;
    }

    public void execute() {
        newLaptop.sell();
    }
}