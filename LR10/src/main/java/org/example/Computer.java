package org.example;

public class Computer implements Connectable, Configurable {

    private String model;
    private boolean connected;
    private String os;

    public Computer(String model, String os) {
        this.model = model;
        this.os = os;
        this.connected = false;
    }

    @Override
    public void connect() {
        connected = true;
        System.out.println("Компьютер " + model + " подключен");
    }

    @Override
    public void disconnect() {
        connected = false;
        System.out.println("Компьютер " + model + " отключен");
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public void configure() {
        System.out.println("Настройка компьютера " + model + ", ОС: " + os);
    }

    @Override
    public void reset() {
        os = "Без ОС";
        System.out.println("Компьютер " + model + " сброшен");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", connected=" + connected +
                ", os='" + os + '\'' +
                '}';
    }
}
