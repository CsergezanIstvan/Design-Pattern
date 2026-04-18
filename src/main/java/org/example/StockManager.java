package org.example;

import java.util.Dictionary;
import java.util.Map;

public class StockManager implements OrderHandler{

    private Map<String, Integer> inventory;

    public StockManager(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    @Override
    public void handleOrder(Order order) {

       if( !inventory.containsKey(order.getProduct())){
           System.out.println("Product not found: " +  order.getProduct());
           return;
       }

       int currentQuantity = inventory.get(order.getProduct());

       if(currentQuantity < order.getQuantity()){
           System.out.println("Not enough stock: " +  order.getProduct() + " added as back order");
           return;
       }

       currentQuantity -= order.getQuantity();
       inventory.put(order.getProduct(), currentQuantity);

        System.out.println("Stock updated: " +  order.getProduct() + " to: " + inventory.get(order.getProduct()));
    }
}
