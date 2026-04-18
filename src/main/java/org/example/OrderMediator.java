package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderMediator implements Mediator{

    private List<OrderHandler> orderHandlers = new ArrayList<OrderHandler>();

    @Override
    public void addHandler(OrderHandler orderHandler) {
        orderHandlers.add(orderHandler);
    }

    @Override
    public void notify(Order order) {
        for(OrderHandler orderHandler : orderHandlers){
            orderHandler.handleOrder(order);
        }
    }
}
