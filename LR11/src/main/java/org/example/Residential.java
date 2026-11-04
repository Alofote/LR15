package org.example;

public class Residential extends Building {

    public Residential(String address, int floors, double area) {
        super(address, floors, area);
    }

    @Override
    public String getPurpose() {
        return "Жилой дом";
    }
}