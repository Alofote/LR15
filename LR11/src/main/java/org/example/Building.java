package org.example;

public class Building {

    protected String address;
    protected int floors;
    protected double area;

    public Building(String address, int floors, double area) {
        this.address = address;
        this.floors = floors;
        this.area = area;
    }

    public void build() {
        System.out.println("Строю здание");
    }

    public void build(int floors) {
        System.out.println("Строю здание с " + floors + " этажами");
    }

    public void build(String material) {
        System.out.println("Строю из " + material);
    }

    public String getPurpose() {
        return "Неизвестно";
    }
}