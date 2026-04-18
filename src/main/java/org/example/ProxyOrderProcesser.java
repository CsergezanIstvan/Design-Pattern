package org.example;

public class ProxyOrderProcesser implements OrderProcesserInterface {
    private OrderProcesserInterface orderProcesser;
    public ProxyOrderProcesser(OrderProcesserInterface orderProcesser) {
        this.orderProcesser = orderProcesser;
    }

    @Override
    public void processOrder(Order order) {
        if(!order.getClient().isRegistered()) {
            System.out.println("Order cannot be processed for unregistered client: " + order.getClient().getName());
            return;
        }

        orderProcesser.processOrder(order);
    }
}
