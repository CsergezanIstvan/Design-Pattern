package org.example;

public class OrderProcesser implements OrderProcesserInterface{

    private Mediator orderMediator;

    public OrderProcesser(Mediator orderMediator) {
        this.orderMediator = orderMediator;
    }

    @Override
    public void processOrder(Order order) {
        orderMediator.notify(order);
    }
}
