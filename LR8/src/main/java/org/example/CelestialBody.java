package org.example;

public class CelestialBody {
    private String name;
    private double mass;
    private double diameter;

    public CelestialBody(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return "Небесное тело";
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Диаметр: " + diameter + " м");
    }
}
