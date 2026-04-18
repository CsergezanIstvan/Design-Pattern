package org.example;

public class InvoiceGenerator implements OrderHandler{
    @Override
    public void handleOrder(Order order) {
        double total = order.getPrice() * order.getQuantity();
        System.out.println("Invoice generated for client: " + order.getClient().getName() + ", total amount paid: " + total);
    }
}
