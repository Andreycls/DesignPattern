package command.main;

import command.action.BuyLaptop;
import command.action.SellLaptop;
import command.command.Order;
import command.invoker.LaptopSeller;
import command.request.Laptop;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Laptop abcStock = new Laptop();

        Order buyLaptopOrder = new BuyLaptop(abcStock);
        Order sellLaptopOrder = new SellLaptop(abcStock);

        LaptopSeller laptopSeller = new LaptopSeller();
        laptopSeller.takeOrder(buyLaptopOrder);
        laptopSeller.takeOrder(sellLaptopOrder);

        laptopSeller.placeOrders();
    }
}