package org.example;

public class Order {
    private int orderNumber;
    private Status status;
    public Order(int orderNumber, Status status) {
        this.orderNumber = orderNumber;
        this.status = status;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public Status getStatus() {
        return status;
    }

}