package org.example;

public class Order {

    private int quantity;
    private int price;
    private String product;
    private Client client;

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public Client getClient() {
        return client;
    }

    public Order(int price, int quantity, String product, Client client) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
        this.client = client;
    }
}
