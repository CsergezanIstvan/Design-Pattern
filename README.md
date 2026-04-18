# Design-Pattern
Demo project for Mediator and Proxy design pattern usage.

## Project description
This project implements Order processing mock to utilize Mediator and Proxy design patterns.
The considered scenario is that an order has been received and should be processed by generating an invoice and updating the stock levels accordingly.

## Mediator pattern usage
In order to maintain the Single Responsibility Principle the different steps of order processing have been implemented in dedicated classes.
To reduce the dependency between the processing classes Mediator pattern has been used.
OrderProcesser sends an order message to the OrderMediator which forwards the order message to StockManager and to the InvoiceGenerator which are added as handlers to the OrderMediator.

## Proxy pattern usage
To only allow registered clients to place orders Proxy class has been implemented for the OrderProcesser.
The Proxy order processer checks if the client in registered and forwards the order to the actual OrderProcesser.
