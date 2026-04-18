package org.example;

public interface Mediator {

    void addHandler(OrderHandler orderHandler);
    void notify(Order order);

}
