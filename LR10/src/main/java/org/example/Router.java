package org.example;

public class Router implements Connectable, Configurable {

    private String model;
    private boolean connected;
    private String settings;

    public Router(String model, String settings) {
        this.model = model;
        this.settings = settings;
        this.connected = false;
    }

    @Override
    public void connect() {
        connected = true;
        System.out.println("Роутер " + model + " подключен");
    }

    @Override
    public void disconnect() {
        connected = false;
        System.out.println("Роутер " + model + " отключен");
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public void configure() {
        System.out.println("Настройка роутера " + model + ": " + settings);
    }

    @Override
    public void reset() {
        settings = "Стандартные настройки";
        System.out.println("Роутер " + model + " сброшен");
    }

    @Override
    public String toString() {
        return "Router{" +
                "model='" + model + '\'' +
                ", connected=" + connected +
                ", settings='" + settings + '\'' +
                '}';
    }
}
