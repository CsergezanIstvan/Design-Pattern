package org.example;

import java.util.HashMap;
import java.util.Map;

public class WebshopMain {
    public static void main( String[] args ) {

        Map<String,Integer> inventory = createInventory();
        OrderHandler stockManager = new StockManager(inventory);
        OrderHandler invoiceGenerator = new InvoiceGenerator();

        Mediator orderMediator = new OrderMediator();
        orderMediator.addHandler(stockManager);
        orderMediator.addHandler(invoiceGenerator);

        OrderProcesserInterface orderProcesser = new OrderProcesser(orderMediator);
        OrderProcesserInterface proxyOrderProcesser = new ProxyOrderProcesser(orderProcesser);

        Order order1 = new Order(159, 2, "Jeans", new Client("Bob", true));
        Order order2 = new Order(159, 7, "Shoes", new Client("James", true));
        Order order3 = new Order(159, 10, "Shirt", new Client("Jane", false));

        proxyOrderProcesser.processOrder(order1);
        System.out.println("********************");
        proxyOrderProcesser.processOrder(order2);
        System.out.println("********************");
        proxyOrderProcesser.processOrder(order3);
        System.out.println("********************");
    }

    public static Map<String, Integer> createInventory(){
        return new HashMap<String, Integer>(Map.of(
                "Jeans", 10,
                "Shoes", 6,
                "Shirt", 80
        ));
    }

}
