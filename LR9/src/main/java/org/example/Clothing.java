package org.example;

public abstract class Clothing {
    private String brand;
    private String size;
    private String color;

    public Clothing(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSeason();

    public abstract String getMaterial();

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Размер: " + size);
        System.out.println("Цвет: " + color);
    }
}
