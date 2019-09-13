package command.invoker;
import command.command.Order;

import java.util.ArrayList;
import java.util.List;

public class LaptopSeller {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}